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

        if (option == 1) {
            System.out.println(
                "Ok a partir de agora você é o líder de um grupo de anões, sua missão é recuperar Erebor, " 
                + "a montanha solitária que uma vez já foi lar de seus ancestrais. Será uma missão difícil, " 
                + "pois há vários seres na terra média que também querem o controle daquela montanha, " 
                + "é provável que você precise de ajuda, há um pequeno Hobbit num condado aqui perto, " 
                + "gostaria de recrutá-lo para ajudar na missão?"
            );

            do {
                System.out.println("    [1] Sim, qualquer ajuda é bem vinda");
                System.out.println("    [2] Não, não preciso de um pequeno Hobbit em minha equipe");
    
                option = sc.nextInt();
                isValid = (option == 1 || option == 2);
    
                if (!isValid) {
                    System.out.println("Opção inválida, tente novamente");
                }
    
            } while (!isValid);

            if (option == 1) {
                System.out.println("");
            } else {
                System.out.println(
                    "Seguimos a jornada sem o Hobbit, seu grupo de anões está se dirigindo para Erebor " 
                    + "através das colinas, um dos integrantes do grupo ouviu um barulho distante, você" 
                    + "foi conferir e descobre que um grupo de orcs está vindo atacá-los, o que você vai fazer?"
                );

                do {
                    System.out.println("    [1] Lutar, mesmo em menor número conseguiremos vencer esses orcs");
                    System.out.println("    [2] Fugir, pedir para que todos os integrantes do grupo procurem por uma rota de fuga");
        
                    option = sc.nextInt();
                    isValid = (option == 1 || option == 2);
        
                    if (!isValid) {
                        System.out.println("Opção inválida, tente novamente");
                    }
        
                } while (!isValid);

                if (option == 1) {
                    System.out.println(
                        "Você enfrentou os orcs, porém eles estavam em maior número, seu grupo mesmo com " 
                        + "bastante esforço não conseguiu vencê-los"
                    );
                    System.out.println();
                    System.out.println("------ VOCÊ PERDEU ------");
                    System.out.println();
                    System.out.println("=-=-=-=-= FIM DE JOGO =-=-=-=-=");
                } else {
                    System.out.println(
                        "Você tentou escapar, porém nínguem encontrou uma saída, então os orcs conseguiram alcança-los... " 
                        + "Seu grupo tentou lutar mas não conseguiu vencê-los"
                    );
                    System.out.println();
                    System.out.println("------ VOCÊ PERDEU ------");
                    System.out.println();
                    System.out.println("=-=-=-=-= FIM DE JOGO =-=-=-=-=");
                }
            }

        } else {
            System.out.println(
                "Você é o temido líder Orc, você tem um grande exército de Orcs sobre o seu controle, " 
                + "um informante me contou que um grupo de anões está tentando recuperar o tesouro da antiga Erebor, " 
                + "a montanha solitária que armazena uma grande fortuna, sua missão é impedir que os anões consigam " 
                + "recuperar suas terras. Soube que os anões vão passar pelas colinas em sua jornada... Deseja " 
                + "fazer uma emboscada para eles?"
            );

            do {
                System.out.println("    [1] Sim, vamos acabar com eles nas colinas!");
                System.out.println("    [2] Não, é melhor posicionar o exército nas redondezas de Erebor " 
                    + "e armar uma emboscada por lá");
    
                option = sc.nextInt();
                isValid = (option == 1 || option == 2);
    
                if (!isValid) {
                    System.out.println("Opção inválida, tente novamente");
                }
    
            } while (!isValid);
        }

        sc.close();
    }
}
