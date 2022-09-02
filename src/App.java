import java.util.HashMap;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        try {
            Scanner sc = new Scanner(System.in);

            FileReader reader = new FileReader();

            HashMap<String, Character> characters = reader.readCharacters("rsc/characters.txt");
            HashMap<String, Chapter> chapters = reader.readChapters("rsc/chapters.txt", characters, sc);

            Chapter rootChapter = chapters.get("Apresentação Inicial");
            rootChapter.show();

            sc.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
