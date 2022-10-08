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
        this.image = FileReader.getValue(scFile.nextLine());
        super.read(characters, scFile);
    }
}
