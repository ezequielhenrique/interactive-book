import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;

public class Chapter {
    private String name;
    private String text;
    private String chapterNotes;
    protected ArrayList<Choice> choices;
    private Character character;
    private int energyChange;
    private int goldChange;

    protected Chapter() {

    }

    public Chapter(String name, String text, String chapterNotes, Character character, 
                    int energyChange, int goldChange) {
        this.name = name;
        this.text = text;
        this.chapterNotes = chapterNotes;
        this.choices = new ArrayList<Choice>();
        this.character = character;
        this.energyChange = energyChange;
        this.goldChange = goldChange;
    }

    public Chapter(HashMap<String, Character> characters, Scanner scFile) {
        this.read(characters, scFile);
        this.choices = new ArrayList<Choice>();
    }

    public String getName() {
        return this.name;
    }

    public String getText() {
        return this.text;
    }

    public String getChapterNotes() {
        return this.chapterNotes + " - Você possui agora " 
        + this.character.getEnergy() + " de energia e " 
        + this.character.getGold() + " de ouro.";
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

    public ArrayList<Choice> getChoices() {
        return choices;
    }

    protected void read(HashMap<String, Character> characters, Scanner sc) {
        this.name = FileReader.getValue(sc.nextLine());
        this.text = FileReader.getValue(sc.nextLine());
        this.chapterNotes = FileReader.getValue(sc.nextLine());
        this.character = characters.get(FileReader.getValue(sc.nextLine()));
        this.energyChange = Integer.parseInt(FileReader.getValue(sc.nextLine()));
        this.goldChange = Integer.parseInt(FileReader.getValue(sc.nextLine()));
    }
}
