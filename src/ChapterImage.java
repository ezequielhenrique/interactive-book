import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class ChapterImage extends Chapter {

    private String image;

    public ChapterImage(HashMap<String, Character> characters, Scanner scFile) {
        this.read(characters, scFile);
        this.choices = new ArrayList<Choice>();
    }

    public String getImage() {
        return this.image;
    }

    @Override
    protected void read(HashMap<String, Character> characters, Scanner scFile) {
        String line = scFile.nextLine();
        this.image = "";
        line = scFile.nextLine();

        while (!line.equals("END_IMAGE")) {
            this.image = this.image + "\n" + line;
            line = scFile.nextLine();
        }

        super.read(characters, scFile);
    }
}
