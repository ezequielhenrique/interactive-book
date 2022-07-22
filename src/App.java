import java.util.Scanner;

public class App {
    public static int selectOption(Scanner sc, String option1, String option2) {
        int option;
        boolean isValid;

        do {
            System.out.println("    [1] " + option1);
            System.out.println("    [2] " + option2);

            option = sc.nextInt();
            isValid = (option == 1 || option == 2);

            if (!isValid) {
                System.out.println("Opção inválida, tente novamente");
            }

        } while (!isValid);

        return option;
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int option;

        /* ----------- Apresentação Inicial - Capítulo 1 ----------- */

        System.out.println("Olá, você acaba de iniciar uma nova jonada...");
        System.out.println("Me diga o nome de seu personagem");

        String name = sc.nextLine();

        System.out.println(
            "Olá " + name + "! Eu sou o Gandalf, o Mago Cinzento que irá te ajudar durante essa jornada, " 
            + "será uma jornada na terra média, um lugar onde você pode encontrar hobbits, anões, elfos " 
            + "e os terríveis orcs, mas calma lá, antes de iniciarmos você precisa escolher qual personagem " 
            + "você será durante a jornada, escolha sua opção:"
        );

        option = selectOption(sc, "Líder Anão", "Líder Orc");

        /* ----------- Capítulo 1.1 ----------- */

        if (option == 1) {
            System.out.println(
                "Ok a partir de agora você é o líder de um grupo de anões, sua missão é recuperar Erebor, " 
                + "a montanha solitária que uma vez já foi lar de seus ancestrais. Será uma missão difícil, " 
                + "pois há vários seres na terra média que também querem o controle daquela montanha, " 
                + "é provável que você precise de ajuda, há um pequeno Hobbit num condado aqui perto, " 
                + "gostaria de recrutá-lo para ajudar na missão?"
            );

            option = selectOption(sc, 
                        "Sim, qualquer ajuda é bem vinda", 
                        "Não, não preciso de um pequeno Hobbit em minha equipe");

            /* ----------- Capítulo 1.1.1 ----------- */

            if (option == 1) {
                System.out.println(
                    "Fomos buscar o Hobbit no condado, ele hesitou em participar mas no fim acabou concordando em ir " 
                    + "seguimos nossa viagem através das colinas, um dos integrantes do grupo ouviu um barulho distante, você" 
                    + "foi conferir e descobre que um grupo de orcs está vindo atacá-los, o que você vai fazer?"
                );

                option = selectOption(sc, 
                            "Lutar, mesmo em menor número conseguiremos vencer esses orcs", 
                            "Fugir, pedir para que todos os integrantes do grupo procurem por uma rota de fuga");

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

                    /* ----------- Capítulo 1.1.1.2 ----------- */

                    System.out.println("O pequeno Hobbit conseguiu encontrar um caminho secreto, seu grupo fugiu por ele!");
                    System.out.println(
                        "No fim do caminho vocês se depararam com uma cidade élfica, o rei élfico ofereceu a " 
                        + "ajuda de seu exército para conquistar Erebor, você vai aceitar?" 
                    );

                    option = selectOption(sc, 
                                "Não, essa missão é só nossa, não cabe aos elfos se intrometer", 
                                "Sim, o exército élfico será de grande ajuda para a missão");

                    if (option == 1) {
                        System.out.println(
                        "Seu grupo se dirigiu até a montanha solitária, nas proximidades da montanha vocês foram " 
                        + "emboscados novamente por orcs, dessa vez não houve escapatória, vocês lutaram bravamente " 
                        + "mas os orcs eram muitos..."
                        );
                        System.out.println();
                        System.out.println("------ VOCÊ PERDEU ------");
                        System.out.println();
                        System.out.println("=-=-=-=-= FIM DE JOGO =-=-=-=-=");

                    } else {
                        System.out.println(
                            "Seu grupo se dirigiu até a montanha solitária acompanhados dos elfos, nas proximidades da " 
                            + "montanha vocês foram emboscados novamente por orcs, houve uma batalha difícil que durou " 
                            + "por vários dias, depois de muito esforço voçês conseguiram derrotar o exército orc, e olha " 
                            + "só, o pequeno Hobbit foi quem derrotou o terrível Líder Orc, vocês recuperaram a montanha "
                            + "solitária e realizaram uma grande festa em comemoração!"
                        );
                        System.out.println();
                        System.out.println("------ PARABÉNS " + name + "! VOCÊ VENCEU!!! ------");
                        System.out.println();
                        System.out.println("=-=-=-=-= FIM DE JOGO =-=-=-=-=");
                    }
                }

            /* ----------- Capítulo 1.1.2 ----------- */

            } else {
                System.out.println(
                    "Seguimos a jornada sem o Hobbit, seu grupo de anões está se dirigindo para Erebor " 
                    + "através das colinas, um dos integrantes do grupo ouviu um barulho distante, você" 
                    + "foi conferir e descobre que um grupo de orcs está vindo atacá-los, o que você vai fazer?"
                );

                option = selectOption(sc, 
                        "Lutar, mesmo em menor número conseguiremos vencer esses orcs", 
                        "Fugir, pedir para que todos os integrantes do grupo procurem por uma rota de fuga");

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

        /* ----------- Capítulo 1.2 ----------- */
        
        } else {
            System.out.println(
                "Você é o temido líder Orc, você tem um grande exército de Orcs sobre o seu controle, " 
                + "um informante me contou que um grupo de anões está tentando recuperar o tesouro da antiga Erebor, " 
                + "a montanha solitária que armazena uma grande fortuna, sua missão é impedir que os anões consigam " 
                + "recuperar suas terras. Soube que os anões vão passar pelas colinas em sua jornada... Deseja " 
                + "fazer uma emboscada para eles?"
            );

            option = selectOption(sc, 
                    "Sim, vamos acabar com eles nas colinas!", 
                    "Não, é melhor posicionar o exército nas redondezas de Erebor e armar uma emboscada por lá");


            /* ----------- Capítulo 1.2.1 ----------- */

            if (option == 1) {
                System.out.println(
                    "Seu exército emboscou o grupo de anões nas colinas, mas eles conseguiram escapar " 
                    + "por uma passagem secreta, eles receberam ajuda dos elfos e se dirigiram para Erebor, " 
                    + "seu exército tentou emboscá-los novamente em erebor mas não teve êxito, seu exército " 
                    + "foi derrotado..."
                );
                System.out.println();
                System.out.println("------ VOCÊ PERDEU ------");
                System.out.println();
                System.out.println("=-=-=-=-= FIM DE JOGO =-=-=-=-=");

            /* ----------- Capítulo 1.2.2 ----------- */

            } else {
                System.out.println(
                    "Seu exército marchou até Erebor e se posicionou por lá, os anões chegaram sozinhos e sem nenhuma " 
                    + "ajuda, eles tentaram resistir mas não adiantou muito..."
                );
                System.out.println(
                    "Os anões foram derrotados e você conseguiu controle sobre a montanha solitária, agora " 
                    + "todos na terra média temem o seu poderoso exército orc!"
                );
                System.out.println();
                System.out.println("------ PARABÉNS " + name + "! VOCÊ VENCEU!!! ------");
                System.out.println();
                System.out.println("=-=-=-=-= FIM DE JOGO =-=-=-=-=");
            }
        }

        sc.close();
    }
}
