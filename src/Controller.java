import java.io.FileNotFoundException;
import java.util.HashMap;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class Controller {

    FileReader reader = new FileReader();
    
    HashMap<String, Character> characters;
    HashMap<String, Chapter> chapters;

    final String buttonStyle = "-fx-background-color:  #59321B; -fx-font-family: Georgia; -fx-font-size: 16px; -fx-text-fill: #F2DFCE;";
    final String radioButtonStyle = "-fx-font-family: Georgia; -fx-font-size: 15px; -fx-text-fill: #000000;";

    @FXML
    private Label labelTitle;

    @FXML
    private TextArea textAreaText;

    @FXML
    private Label labelImage;

    @FXML
    private TextArea textAreaChapterNotes;

    @FXML
    private VBox boxRadioButtons;

    @FXML
    private Button buttonLoad;

    @FXML
    private HBox boxButtons;

    @FXML
    void buttonClicked(ActionEvent event) throws FileNotFoundException {
        characters = reader.readCharacters("rsc/characters.txt");
        chapters = reader.readChapters("rsc/chapters.txt", characters);

        Chapter rootChapter = chapters.get("Apresentação Inicial");
        
        showChapter(rootChapter);
    }

    void showChapter(Chapter chapter) {

        try {
            labelImage.setText("");
            ChapterImage chapterImage = (ChapterImage) chapter;
            labelImage.setText(chapterImage.getImage());
        } catch (Exception e) {
            ;
        }

        boxRadioButtons.getChildren().clear();
        boxButtons.getChildren().clear();

        if (chapter.getEnegyChange() < 0) {
            chapter.getCharacter().decrementEnergy(-chapter.getEnegyChange());
        } else {
            chapter.getCharacter().incrementEnergy(chapter.getEnegyChange());
        }

        if (chapter.getGoldChange() < 0) {
            chapter.getCharacter().decrementGold(-chapter.getGoldChange());
        } else {
            chapter.getCharacter().incrementGold(chapter.getGoldChange());
        }

        labelTitle.setText(chapter.getName());
        textAreaText.setText(chapter.getText());
        textAreaChapterNotes.setText("Notas do capítulo: " + chapter.getChapterNotes());

        if (chapter.getName().equals("Fim de Jogo") || chapter.getName().equals("Sem energia")) {
            boxRadioButtons.getChildren().clear();
            boxButtons.getChildren().clear();

            Button playAgain = new Button("Jogar Novamente");
            playAgain.setStyle(buttonStyle);
            playAgain.setMinWidth(150);
            boxButtons.getChildren().add(playAgain);

            playAgain.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    Chapter rootChapter = chapters.get("Apresentação Inicial");
                    showChapter(rootChapter);
                }
            });
        } else {
            ToggleGroup group = new ToggleGroup();

            if (chapter.getChoices().get(0).getText() == "") {
                Label message = new Label("Não há escolhas para esse capítulo.");
                message.setStyle(radioButtonStyle);
                boxRadioButtons.getChildren().add(message);

            } else {
                for (int i=0; i < chapter.getChoices().size(); i++) {
                    RadioButton rb = new RadioButton();
                    rb.setStyle(radioButtonStyle);
                    rb.setToggleGroup(group);
                    rb.setText(i + 1 + "- " + chapter.getChoices().get(i).getText());
                    boxRadioButtons.getChildren().addAll(rb);
                    if (i == 0) {
                        rb.setSelected(true);
                    }
                }
            }

            Button prosseguir = new Button("Prosseguir");
            prosseguir.setMinWidth(150);
            prosseguir.setStyle(buttonStyle);

            boxButtons.getChildren().add(prosseguir);

            prosseguir.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    int index = group.getToggles().indexOf(group.getSelectedToggle());
                    if (index == -1) {
                        index = 0;
                    }
                    
                    boxRadioButtons.getChildren().clear();
                    boxButtons.getChildren().clear();

                    showChapter(chapter.getChoices().get(index).getChapter());
                }
            });
        }
    }
}
