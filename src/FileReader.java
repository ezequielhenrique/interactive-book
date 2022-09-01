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
