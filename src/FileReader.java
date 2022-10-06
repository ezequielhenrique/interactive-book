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

        String fileLine = "";

        while(sc.hasNextLine()) {
            while (!fileLine.equals("CHAPTER") && 
                   !fileLine.equals("CHAPTER_IMAGE") && 
                   !fileLine.equals("CHOICE")) {
                fileLine = sc.nextLine();
            }
            if (fileLine.equals("CHAPTER")) {
                Chapter chapter = new Chapter(characters, scConsole, sc);

                chapters.put(chapter.getName(), chapter);

            }
            if (fileLine.equals("CHAPTER_IMAGE")) {
                ChapterImage chapter = new ChapterImage(characters, scConsole, sc);

                chapters.put(chapter.getName(), chapter);

            }
            if (fileLine.equals("CHOICE")) {
                readChoice(chapters, sc);
            }

            fileLine = "";
        }

        sc.close();

        return chapters;
    }

    private void readChoice(HashMap<String, Chapter> chapters, Scanner sc) {
        String choiceSourceChapter;
        String choiceText;
        String choiceDestinationChapter;

        choiceSourceChapter = getValue(sc.nextLine());
        choiceText = getValue(sc.nextLine());
        choiceDestinationChapter = getValue(sc.nextLine());

        Chapter sourceChapter = chapters.get(choiceSourceChapter);
        Chapter destinyChapter = chapters.get(choiceDestinationChapter);

        sourceChapter.addChoice(new Choice(choiceText, destinyChapter));
    }

    public static String getValue(String fileLine) {
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
