import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class ChapterImage extends Chapter {

    private String image;

    public ChapterImage(HashMap<String, Character> characters, Scanner scConsole, Scanner scFile) {
        this.read(scConsole, characters, scFile);
        this.choices = new ArrayList<Choice>();
    }
    
    @Override
    public void show() {
        System.out.println();
        System.out.println(image);
        super.show();
    }

    @Override
    protected void read(Scanner scConsole, HashMap<String, Character> characters, Scanner scFile) {
        String line = scFile.nextLine();
        this.image = "";
        line = scFile.nextLine();

        while (!line.equals("END_IMAGE")) {
            this.image = this.image + "\n" + line;
            line = scFile.nextLine();
        }

        super.read(scConsole, characters, scFile);
    }
}
