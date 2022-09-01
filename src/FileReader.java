import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class FileReader {
    public HashMap<String, Character> readCharacters(String pathFile) throws FileNotFoundException {

        HashMap<String, Character> characters = new HashMap<String, Character>();
        File charactersFile = new File(pathFile);
        Scanner sc = new Scanner(charactersFile, "UTF-8");

        String characterName;
        int characterEnergy;
        int characterGold;
        String fileLine = "";

        while(sc.hasNextLine()) {
            while (!fileLine.equals("CHARACTER")) {
                fileLine = sc.nextLine();
            }
            characterName = getValue(sc.nextLine());
            characterEnergy = Integer.parseInt(getValue(sc.nextLine()));
            characterGold = Integer.parseInt(getValue(sc.nextLine()));

            characters.put(characterName, new Character(characterName, characterEnergy, characterGold));
            fileLine = "";
        }

        sc.close();

        return characters;
    }

    public HashMap<String, Chapter> readChapters(String pathFile, HashMap<String, Character> characters, Scanner scConsole) throws FileNotFoundException {

        HashMap<String, Chapter> chapters = new HashMap<String, Chapter>();
        File chaptersFile = new File(pathFile);
        Scanner sc = new Scanner(chaptersFile, "UTF-8");

        String chapterTitle;
        String chapterText;
        String chapterNotes;
        String chapterCharacterName;
        int chapterEnergyChange;
        int chapterGoldChange;

        String fileLine = "";

        while(sc.hasNextLine()) {
            while (!fileLine.equals("CHAPTER")) {
                fileLine = sc.nextLine();
            }
            chapterTitle = getValue(sc.nextLine());
            chapterText = getValue(sc.nextLine());
            chapterNotes = getValue(sc.nextLine());
            chapterCharacterName = getValue(sc.nextLine());
            chapterEnergyChange = Integer.parseInt(getValue(sc.nextLine()));
            chapterGoldChange = Integer.parseInt(getValue(sc.nextLine()));

            chapters.put(chapterTitle, new Chapter(chapterTitle, 
                                                chapterText, 
                                                chapterNotes, 
                                                characters.get(chapterCharacterName), 
                                                chapterEnergyChange, 
                                                chapterGoldChange, 
                                                scConsole
            ));
            
            fileLine = "";
        }

        sc.close();

        return chapters;
    }

    private String getValue(String fileLine) {
        boolean isValue = false;
        String value = "";

        char[] fileLineChars = fileLine.toCharArray();

        for (char ch : fileLineChars) {

            if (isValue) {
                value += ch;
            }
            if (ch == ':') {
                isValue = true;
            }
        }
        value = value.trim();

        return value;
    }
}
