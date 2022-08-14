import java.util.ArrayList;
import java.util.Scanner;

public class Chapter {
    String name;
    String text;
    String chapterNotes;
    ArrayList<String> options;
    Character character;
    int energyChange;
    int goldChange;
    Scanner scanner;

    public Chapter() {

    }

    public Chapter(String name, String text, String chapterNotes, ArrayList<String> options, 
                    Character character, int energyChange, int goldChange, Scanner scanner) {
        this.name = name;
        this.text = text;
        this.chapterNotes = chapterNotes;
        this.options = options;
        this.character = character;
        this.energyChange = energyChange;
        this.goldChange = goldChange;
        this.scanner = scanner;
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
        
        if (this.chapterNotes != null) {
            System.out.println();
            System.out.println(this.chapterNotes + " Você possui " 
            + this.character.getEnergy() + " de energia e " 
            + this.character.getGold() + " de ouro.");
            System.out.println();
        }

        if (this.options != null) {
            for (int i=0; i < this.options.size(); i++) {
                System.out.println(i + 1 + "- " + this.options.get(i));
            }
        }
    }

    public int selectOption() {
        int option;
        boolean isValid;

        do {
            System.out.println("Digite sua opção: ");

            option = this.scanner.nextInt() - 1;
            isValid = (option >= 0 && option < this.options.size());

            if (!isValid) {
                System.out.println("Opção inválida, tente novamente");
            }

        } while (!isValid);

        return option;
    }
}
