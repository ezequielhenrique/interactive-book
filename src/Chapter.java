import java.util.ArrayList;
import java.util.Scanner;

public class Chapter {
    private String name;
    private String text;
    private String chapterNotes;
    private ArrayList<Choice> choices;
    private Character character;
    private int energyChange;
    private int goldChange;
    private Scanner scanner;

    public Chapter(String name, String text, String chapterNotes, Character character, 
                    int energyChange, int goldChange, Scanner scanner) {
        this.name = name;
        this.text = text;
        this.chapterNotes = chapterNotes;
        this.choices = new ArrayList<Choice>();
        this.character = character;
        this.energyChange = energyChange;
        this.goldChange = goldChange;
        this.scanner = scanner;
    }

    public String getName() {
        return this.name;
    }

    public String getText() {
        return this.text;
    }

    public String getChapterNotes() {
        return this.chapterNotes;
    }

    public Character getCharacter() {
        return this.character;
    }

    public int getEnegyChange() {
        return this.energyChange;
    }

    public void setEnergyChange(int energyChange) {
        this.energyChange = energyChange;
    }

    public int getGoldChange() {
        return this.goldChange;
    }

    public void setGoldChange(int goldChange) {
        this.goldChange = goldChange;
    }

    public void addChoice(Choice choice) {
        this.choices.add(choice);
    }

    public void show() {
        System.out.println();
        System.out.println("========== " + this.name + " ==========");
        System.out.println();
        System.out.println(this.text);

        if (this.energyChange < 0) {
            this.character.decrementEnergy(-this.energyChange);
        } else {
            this.character.incrementEnergy(energyChange);
        }

        if (this.goldChange < 0) {
            this.character.decrementGold(-this.goldChange);
        } else {
            this.character.incrementGold(goldChange);
        }
        
        if (this.chapterNotes != null && this.chapterNotes != "") {
            System.out.println();
            System.out.println(this.chapterNotes + " Você possui " 
            + this.character.getEnergy() + " de energia e " 
            + this.character.getGold() + " de ouro.");
            System.out.println();
        }

        if (this.choices != null) {
            for (int i=0; i < this.choices.size(); i++) {
                System.out.println(i + 1 + "- " + this.choices.get(i).getText());
            }
        }

        if (choices.size() > 0) {
            int indexChoice = selectOption();

            this.choices.get(indexChoice).getChapter().show();
        }
    }

    private int selectOption() {
        int option;
        boolean isValid;

        do {
            System.out.println("Digite sua opção: ");

            option = this.scanner.nextInt() - 1;
            isValid = (option >= 0 && option < this.choices.size());

            if (!isValid) {
                System.out.println("Opção inválida, tente novamente");
            }

        } while (!isValid);

        return option;
    }
}
