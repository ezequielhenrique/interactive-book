import java.util.Scanner;

public class Chapter {
    String name;
    String text;
    String chapterNotes;
    String option1;
    String option2;
    Character character;
    int energyChange;
    int goldChange;

    public Chapter() {

    }

    public Chapter(String name, String text, String chapterNotes, String option1, String option2, 
                    Character character, int energyChange, int goldChange) {
        this.name = name;
        this.text = text;
        this.chapterNotes = chapterNotes;
        this.option1 = option1;
        this.option2 = option2;
        this.character = character;
        this.energyChange = energyChange;
        this.goldChange = goldChange;
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
        
        if (this.chapterNotes != "") {
            System.out.println();
            System.out.println(this.chapterNotes + " Você possui " 
            + this.character.getEnergy() + " de energia e " 
            + this.character.getGold() + " de ouro.");
            System.out.println();
        }
        
        if (this.option1 != "" && this.option2 != "") {
            System.out.println("    [1] " + this.option1);
            System.out.println("    [2] " + this.option2);
        }
    }

    public int selectOption(Scanner sc) {
        int option;
        boolean isValid;

        do {
            System.out.println("Digite sua opção: ");

            option = sc.nextInt();
            isValid = (option == 1 || option == 2);

            if (!isValid) {
                System.out.println("Opção inválida, tente novamente");
            }

        } while (!isValid);

        return option;
    }
}
