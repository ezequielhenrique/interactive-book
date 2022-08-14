import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int option;

        Character anoes = new Character("Anões", 1000);
        Character orcs = new Character("Orcs", 2500);

        System.out.println("Olá, você acaba de iniciar uma nova jonada...");
        System.out.println("Me diga o nome de seu personagem");

        String userName = sc.nextLine();

        ArrayList<String> apresentationOptions = new ArrayList<String>();
        apresentationOptions.add("Líder Anão");
        apresentationOptions.add("Líder Orc");

        Chapter apresentation = new Chapter(
            "Apresentação Inicial", 
            "Olá " + userName + "! Eu sou o Gandalf, o Mago Cinzento que irá te ajudar durante essa jornada, " 
            + "será uma jornada na terra média, um lugar onde você pode encontrar hobbits, anões, elfos " 
            + "e os terríveis orcs, você também terá itens como energia e ouro durante a jornada, eles " 
            + "podem aumentar ou diminuir baseado em suas ações, só é bom ter cuidado para não ficar sem energia..." 
            + "Para iniciarmos você precisa escolher qual personagem você será durante a jornada, escolha sua opção:", 
            null, 
            apresentationOptions, 
            anoes, 
            0, 
            0, 
            sc);
        
        apresentation.show();
        option = apresentation.selectOption();

        if (option == 0) {
            ArrayList<String> chapterOneOptions = new ArrayList<String>();
            chapterOneOptions.add("Sim, qualquer ajuda é bem vinda");
            chapterOneOptions.add("Não, não preciso de um pequeno Hobbit em minha equipe");

            Chapter chapterOne = new Chapter(
                "Capítulo 1", 
                "Ok a partir de agora você é o líder de um grupo de anões, sua missão é recuperar Erebor, " 
                + "a montanha solitária que uma vez já foi lar de seus ancestrais. Será uma missão difícil, " 
                + "pois há vários seres na terra média que também querem o controle daquela montanha, " 
                + "é provável que você precise de ajuda, há um pequeno Hobbit num condado aqui perto, " 
                + "gostaria de recrutá-lo para ajudar na missão?", 
                userName + ",", 
                chapterOneOptions, 
                anoes, 
                0, 
                0, 
                sc);

            chapterOne.show();
            option = chapterOne.selectOption();

            if (option == 0) {
                ArrayList<String> chapterTwoOptions = new ArrayList<String>();
                chapterTwoOptions.add("Lutar, mesmo em menor número conseguiremos vencer esses orcs");
                chapterTwoOptions.add("Fugir, pedir para que todos os integrantes do grupo procurem por uma rota de fuga");

                Chapter chapterTwo = new Chapter(
                    "Capítulo 2", 
                    "Fomos buscar o Hobbit no condado, ele hesitou em participar mas no fim acabou concordando em ir " 
                    + "seguimos nossa viagem através das colinas, um dos integrantes do grupo ouviu um barulho distante, você" 
                    + "foi conferir e descobre que um grupo de orcs está vindo atacá-los, o que você vai fazer?", 
                    "Notas do capítulo: A ida ao condado lhe custou 10 de energia e 100 de ouro.", 
                    chapterTwoOptions, 
                    anoes, 
                    -10, 
                    -100, 
                    sc);

                chapterTwo.show();
                option = chapterTwo.selectOption();

                if (option == 0) {
                    Chapter chapterThree = new Chapter(
                        "Capítulo 3", 
                        "Você enfrentou os orcs, porém eles estavam em maior número, seu grupo mesmo com " 
                        + "bastante esforço não conseguiu vencê-los", 
                        "Notas do capítulo: Você perdeu toda a sua energia e os Orcs roubaram todo o seu ouro.", 
                        null,
                        anoes, 
                        -anoes.getEnergy(), 
                        -anoes.getGold(), 
                        sc);
                    
                    chapterThree.show();

                    System.out.println();
                    System.out.println("------ VOCÊ PERDEU ------");
                    System.out.println();
                    System.out.println("=-=-=-=-= FIM DE JOGO =-=-=-=-=");

                } else {
                    ArrayList<String> chapterThreeOptions = new ArrayList<String>();
                    chapterThreeOptions.add("Não, essa missão é só nossa, não cabe aos elfos se intrometer");
                    chapterThreeOptions.add("Sim, o exército élfico será de grande ajuda para a missão");

                    Chapter chapterThree = new Chapter(
                        "Capítulo 3", 
                        "O pequeno Hobbit conseguiu encontrar um caminho secreto, seu grupo fugiu por ele!"
                        + "No fim do caminho vocês se depararam com uma cidade élfica, o rei élfico ofereceu a " 
                        + "ajuda de seu exército para conquistar Erebor, você vai aceitar?", 
                        "Notas do capítulo: A fuga lhe custou 10 de energia, durante a fuga o hobbit encontrou um barril "
                        + "com 1000 moedas de ouro, os elfos lhe pesentearam com 500 moedas de ouro.", 
                        chapterThreeOptions, 
                        anoes, 
                        -10, 
                        1500, 
                        sc);
                    
                    chapterThree.show();
                    option = chapterThree.selectOption();

                    if (option == 0) {
                        Chapter chapterFour = new Chapter(
                            "Capítulo 4", 
                            "Seu grupo se dirigiu até a montanha solitária, nas proximidades da montanha vocês foram " 
                            + "emboscados novamente por orcs, dessa vez não houve escapatória, vocês lutaram bravamente " 
                            + "mas os orcs eram muitos...", 
                            "Notas do capítulo: Você perdeu toda a sua energia e os Orcs roubaram todo o seu ouro.", 
                            null, 
                            anoes, 
                            -anoes.getEnergy(), 
                            -anoes.getGold(), 
                            sc);
                        
                        chapterFour.show();

                        System.out.println();
                        System.out.println("------ VOCÊ PERDEU ------");
                        System.out.println();
                        System.out.println("=-=-=-=-= FIM DE JOGO =-=-=-=-=");

                    } else {
                        Chapter chapterFour = new Chapter(
                            "Capítulo 4", 
                            "Seu grupo se dirigiu até a montanha solitária acompanhados dos elfos, nas proximidades da " 
                            + "montanha vocês foram emboscados novamente por orcs, houve uma batalha difícil que durou " 
                            + "por vários dias, depois de muito esforço voçês conseguiram derrotar o exército orc, e olha " 
                            + "só, o pequeno Hobbit foi quem derrotou o terrível Líder Orc, vocês recuperaram a montanha "
                            + "solitária e realizaram uma grande festa em comemoração!", 
                            "Notas do capítulo: A batalha lhe custou 50 de energia, porém vocês conquistaram todas " 
                            + "as riquezas de Erebor, você recebeu 100000 de ouro", 
                            null, 
                            anoes, 
                            -50, 
                            100000, 
                            sc);
                        chapterFour.show();

                        System.out.println();
                        System.out.println("------ PARABÉNS " + userName + "! VOCÊ VENCEU!!! ------");
                        System.out.println();
                        System.out.println("=-=-=-=-= FIM DE JOGO =-=-=-=-=");
                    }
                }
            } else {
                ArrayList<String> chapterTwoOptions = new ArrayList<String>();
                chapterTwoOptions.add("Lutar, mesmo em menor número conseguiremos vencer esses orcs");
                chapterTwoOptions.add("Fugir, pedir para que todos os integrantes do grupo procurem por uma rota de fuga");

                Chapter chapterTwo = new Chapter(
                    "Capítulo 2", 
                    "Seguimos a jornada sem o Hobbit, seu grupo de anões está se dirigindo para Erebor " 
                    + "através das colinas, um dos integrantes do grupo ouviu um barulho distante, você" 
                    + "foi conferir e descobre que um grupo de orcs está vindo atacá-los, o que você vai fazer?", 
                    "Notas do capítulo: A jornada lhe custou 10 de energia, você não perdeu nenhum ouro.", 
                    chapterTwoOptions, 
                    anoes, 
                    -10, 
                    0, 
                    sc);

                chapterTwo.show();
                option = chapterTwo.selectOption();

                if (option == 0) {
                    Chapter chapterThree = new Chapter(
                        "Capítulo 3", 
                        "Você enfrentou os orcs, porém eles estavam em maior número, seu grupo mesmo com " 
                        + "bastante esforço não conseguiu vencê-los", 
                        "Notas do capítulo: Você perdeu toda a sua energia e os Orcs roubaram todo o seu ouro.", 
                        null, 
                        anoes, 
                        -anoes.getEnergy(), 
                        -anoes.getGold(), 
                        sc);
                    chapterThree.show();

                    System.out.println();
                    System.out.println("------ VOCÊ PERDEU ------");
                    System.out.println();
                    System.out.println("=-=-=-=-= FIM DE JOGO =-=-=-=-=");

                } else {
                    Chapter chapterThree = new Chapter(
                        "Capítulo 3", 
                        "Você tentou escapar, porém nínguem encontrou uma saída, então os orcs conseguiram alcança-los... " 
                        + "Seu grupo tentou lutar mas não conseguiu vencê-los", 
                        "Notas do capítulo: Você perdeu toda a sua energia e os Orcs roubaram todo o seu ouro.", 
                        null, 
                        anoes, 
                        -anoes.getEnergy(), 
                        -anoes.getGold(), 
                        sc);

                    chapterThree.show();
                    
                    System.out.println();
                    System.out.println("------ VOCÊ PERDEU ------");
                    System.out.println();
                    System.out.println("=-=-=-=-= FIM DE JOGO =-=-=-=-=");
                }
            }
        
        } else {
            ArrayList<String> chapterOneOptions = new ArrayList<String>();
            chapterOneOptions.add("Sim, vamos acabar com eles nas colinas!");
            chapterOneOptions.add("Não, é melhor posicionar o exército nas redondezas de Erebor e armar uma emboscada por lá");

            Chapter chapterOne = new Chapter(
                "Capítulo 1", 
                "Você é o temido líder Orc, você tem um grande exército de Orcs sobre o seu controle, " 
                + "um informante me contou que um grupo de anões está tentando recuperar o tesouro da antiga Erebor, " 
                + "a montanha solitária que armazena uma grande fortuna, sua missão é impedir que os anões consigam " 
                + "recuperar suas terras. Soube que os anões vão passar pelas colinas em sua jornada... Deseja " 
                + "fazer uma emboscada para eles?", 
                userName + ",", 
                chapterOneOptions, 
                orcs, 
                0, 
                0, 
                sc);

            chapterOne.show();
            option = chapterOne.selectOption();

            if (option == 0) {
                Chapter chapterTwo = new Chapter(
                    "Capítulo 2", 
                    "Seu exército emboscou o grupo de anões nas colinas, mas eles conseguiram escapar " 
                    + "por uma passagem secreta, eles receberam ajuda dos elfos e se dirigiram para Erebor, " 
                    + "seu exército tentou emboscá-los novamente em erebor mas não teve êxito, seu exército " 
                    + "foi derrotado...", 
                    "Notas do capítulo: Você perdeu toda a sua energia e um grupo de Orcs rivais roubou o seu ouro.", 
                    null, 
                    orcs, 
                    -orcs.getEnergy(), 
                    -orcs.getGold(), 
                    sc);

                chapterTwo.show();
                
                System.out.println();
                System.out.println("------ VOCÊ PERDEU ------");
                System.out.println();
                System.out.println("=-=-=-=-= FIM DE JOGO =-=-=-=-=");

            } else {
                Chapter chapterTwo = new Chapter(
                    "Capítulo 2", 
                    "Seu exército marchou até Erebor e se posicionou por lá, os anões chegaram sozinhos e sem nenhuma " 
                    + "ajuda, eles tentaram resistir mas não adiantou muito..."
                    + "Os anões foram derrotados e você conseguiu controle sobre a montanha solitária, agora " 
                    + "todos na terra média temem o seu poderoso exército orc!", 
                    "Notas do capítulo: A batalha lhe custou 50 de energia, porém vocês conquistaram todas " 
                    + "as riquezas de Erebor, você recebeu 100000 de ouro.", 
                    null, 
                    orcs, 
                    -50, 
                    100000, 
                    sc);
                chapterTwo.show();

                System.out.println();
                System.out.println("------ PARABÉNS " + userName + "! VOCÊ VENCEU!!! ------");
                System.out.println();
                System.out.println("=-=-=-=-= FIM DE JOGO =-=-=-=-=");
            }
        }
        sc.close();
    }
}
