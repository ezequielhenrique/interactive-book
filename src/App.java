import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Olá, você acaba de iniciar uma nova jonada...");
        System.out.println("Me diga o nome de seu personagem");

        String name = sc.nextLine();

        System.out.println(
            "Olá " + name + "! Eu sou o Gandalf, o Mago Cinzento que irá te ajudar durante essa jornada, " 
            + "será uma jornada na terra média, um lugar onde você pode encontrar hobbits, anões, elfos " 
            + "e os terríveis orcs, mas calma lá, antes de iniciarmos você precisa escolher qual personagem " 
            + "você será durante a jornada, escolha sua opção:"
        );

        int option;
        boolean isValid;

        do {
            System.out.println("    [1] Líder Anão");
            System.out.println("    [2] Líder Orc");

            option = sc.nextInt();
            isValid = (option == 1 || option == 2);

            if (!isValid) {
                System.out.println("Opção inválida, tente novamente");
            }

        } while (!isValid);

        sc.close();
    }
}
