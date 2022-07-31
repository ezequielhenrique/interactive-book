import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int option;

        String name;
        String text;
        String chapterNotes;
        String option1;
        String option2;

        Character anoes = new Character("Anões", 1000);
        Character orcs = new Character("Orcs", 2500);

        System.out.println("Olá, você acaba de iniciar uma nova jonada...");
        System.out.println("Me diga o nome de seu personagem");

        String userName = sc.nextLine();

        name = "Apresentação Inicial";
        text = "Olá " + userName + "! Eu sou o Gandalf, o Mago Cinzento que irá te ajudar durante essa jornada, " 
        + "será uma jornada na terra média, um lugar onde você pode encontrar hobbits, anões, elfos " 
        + "e os terríveis orcs, você também terá itens como energia e ouro durante a jornada, eles " 
        + "podem aumentar ou diminuir baseado em suas ações, só é bom ter cuidado para não ficar sem energia..." 
        + "Para iniciarmos você precisa escolher qual personagem você será durante a jornada, escolha sua opção:";
        chapterNotes = "";
        option1 = "Líder Anão";
        option2 = "Líder Orc";

        Chapter apresentation = new Chapter(name, text, chapterNotes, option1, option2, anoes, 0, 0);
        apresentation.show();
        option = apresentation.selectOption(sc);

        if (option == 1) {
            name = "Capítulo 1";
            text = "Ok a partir de agora você é o líder de um grupo de anões, sua missão é recuperar Erebor, " 
            + "a montanha solitária que uma vez já foi lar de seus ancestrais. Será uma missão difícil, " 
            + "pois há vários seres na terra média que também querem o controle daquela montanha, " 
            + "é provável que você precise de ajuda, há um pequeno Hobbit num condado aqui perto, " 
            + "gostaria de recrutá-lo para ajudar na missão?";
            chapterNotes = userName + ",";
            option1 = "Sim, qualquer ajuda é bem vinda";
            option2 = "Não, não preciso de um pequeno Hobbit em minha equipe";

            Chapter chapterOne = new Chapter(name, text, chapterNotes, option1, option2, anoes, 0, 0);
            chapterOne.show();
            option = chapterOne.selectOption(sc);

            if (option == 1) {
                name = "Capítulo 2";
                text = "Fomos buscar o Hobbit no condado, ele hesitou em participar mas no fim acabou concordando em ir " 
                + "seguimos nossa viagem através das colinas, um dos integrantes do grupo ouviu um barulho distante, você" 
                + "foi conferir e descobre que um grupo de orcs está vindo atacá-los, o que você vai fazer?";
                chapterNotes = "Notas do capítulo: A ida ao condado lhe custou 10 de energia e 100 de ouro.";
                option1 = "Lutar, mesmo em menor número conseguiremos vencer esses orcs";
                option2 = "Fugir, pedir para que todos os integrantes do grupo procurem por uma rota de fuga";

                Chapter chapterTwo = new Chapter(name, text, chapterNotes, option1, option2, anoes, -10, -100);
                chapterTwo.show();
                option = chapterTwo.selectOption(sc);

                if (option == 1) {
                    name = "Capítulo 3";
                    text = "Você enfrentou os orcs, porém eles estavam em maior número, seu grupo mesmo com " 
                    + "bastante esforço não conseguiu vencê-los";
                    chapterNotes = "Notas do capítulo: Você perdeu toda a sua energia e os Orcs roubaram todo o seu ouro.";
                    option1 = "";
                    option2 = "";

                    Chapter chapterThree = new Chapter(name, text, chapterNotes, option1, option2, anoes, -anoes.getEnergy(), -anoes.getGold());
                    chapterThree.show();

                    System.out.println();
                    System.out.println("------ VOCÊ PERDEU ------");
                    System.out.println();
                    System.out.println("=-=-=-=-= FIM DE JOGO =-=-=-=-=");
                } else {
                    name = "Capítulo 3";
                    text = "O pequeno Hobbit conseguiu encontrar um caminho secreto, seu grupo fugiu por ele!"
                    + "No fim do caminho vocês se depararam com uma cidade élfica, o rei élfico ofereceu a " 
                    + "ajuda de seu exército para conquistar Erebor, você vai aceitar?";
                    chapterNotes = "Notas do capítulo: A fuga lhe custou 10 de energia, durante a fuga o hobbit encontrou um barril "
                    + "com 1000 moedas de ouro, os elfos lhe pesentearam com 500 moedas de ouro.";
                    option1 = "Não, essa missão é só nossa, não cabe aos elfos se intrometer";
                    option2 = "Sim, o exército élfico será de grande ajuda para a missão";

                    Chapter chapterThree = new Chapter(name, text, chapterNotes, option1, option2, anoes, -10, 1500);
                    chapterThree.show();
                    option = chapterThree.selectOption(sc);

                    if (option == 1) {
                        name = "Capítulo 4";
                        text = "Seu grupo se dirigiu até a montanha solitária, nas proximidades da montanha vocês foram " 
                        + "emboscados novamente por orcs, dessa vez não houve escapatória, vocês lutaram bravamente " 
                        + "mas os orcs eram muitos...";
                        chapterNotes = "Notas do capítulo: Você perdeu toda a sua energia e os Orcs roubaram todo o seu ouro.";
                        option1 = "";
                        option2 = "";

                        Chapter chapterFour = new Chapter(name, text, chapterNotes, option1, option2, anoes, -anoes.getEnergy(), -anoes.getGold());
                        chapterFour.show();

                        System.out.println();
                        System.out.println("------ VOCÊ PERDEU ------");
                        System.out.println();
                        System.out.println("=-=-=-=-= FIM DE JOGO =-=-=-=-=");

                    } else {
                        name = "Capítulo 4";
                        text = "Seu grupo se dirigiu até a montanha solitária acompanhados dos elfos, nas proximidades da " 
                        + "montanha vocês foram emboscados novamente por orcs, houve uma batalha difícil que durou " 
                        + "por vários dias, depois de muito esforço voçês conseguiram derrotar o exército orc, e olha " 
                        + "só, o pequeno Hobbit foi quem derrotou o terrível Líder Orc, vocês recuperaram a montanha "
                        + "solitária e realizaram uma grande festa em comemoração!";
                        chapterNotes = "Notas do capítulo: A batalha lhe custou 50 de energia, porém vocês conquistaram todas " 
                        + "as riquezas de Erebor, você recebeu 100000 de ouro";
                        option1 = "";
                        option2 = "";

                        Chapter chapterFour = new Chapter(name, text, chapterNotes, option1, option2, anoes, -50, 100000);
                        chapterFour.show();

                        System.out.println();
                        System.out.println("------ PARABÉNS " + userName + "! VOCÊ VENCEU!!! ------");
                        System.out.println();
                        System.out.println("=-=-=-=-= FIM DE JOGO =-=-=-=-=");
                    }
                }
            } else {
                name = "Capítulo 2";
                text = "Seguimos a jornada sem o Hobbit, seu grupo de anões está se dirigindo para Erebor " 
                + "através das colinas, um dos integrantes do grupo ouviu um barulho distante, você" 
                + "foi conferir e descobre que um grupo de orcs está vindo atacá-los, o que você vai fazer?";
                chapterNotes = "Notas do capítulo: A jornada lhe custou 10 de energia, você não perdeu nenhum ouro.";
                option1 = "Lutar, mesmo em menor número conseguiremos vencer esses orcs";
                option2 = "Fugir, pedir para que todos os integrantes do grupo procurem por uma rota de fuga";

                Chapter chapterTwo = new Chapter(name, text, chapterNotes, option1, option2, anoes, -10, 0);
                chapterTwo.show();
                option = chapterTwo.selectOption(sc);

                if (option == 1) {
                    name = "Capítulo 3";
                    text = "Você enfrentou os orcs, porém eles estavam em maior número, seu grupo mesmo com " 
                    + "bastante esforço não conseguiu vencê-los";
                    chapterNotes = "Notas do capítulo: Você perdeu toda a sua energia e os Orcs roubaram todo o seu ouro.";
                    option1 = "";
                    option2 = "";

                    Chapter chapterThree = new Chapter(name, text, chapterNotes, option1, option2, anoes, -anoes.getEnergy(), -anoes.getGold());
                    chapterThree.show();

                    System.out.println();
                    System.out.println("------ VOCÊ PERDEU ------");
                    System.out.println();
                    System.out.println("=-=-=-=-= FIM DE JOGO =-=-=-=-=");

                } else {
                    name = "Capítulo 3";
                    text = "Você tentou escapar, porém nínguem encontrou uma saída, então os orcs conseguiram alcança-los... " 
                    + "Seu grupo tentou lutar mas não conseguiu vencê-los";
                    chapterNotes = "Notas do capítulo: Você perdeu toda a sua energia e os Orcs roubaram todo o seu ouro.";
                    option1 = "";
                    option2 = "";

                    Chapter chapterThree = new Chapter(name, text, chapterNotes, option1, option2, anoes, -anoes.getEnergy(), -anoes.getGold());
                    chapterThree.show();
                    
                    System.out.println();
                    System.out.println("------ VOCÊ PERDEU ------");
                    System.out.println();
                    System.out.println("=-=-=-=-= FIM DE JOGO =-=-=-=-=");
                }
            }
        
        } else {
            name = "Capítulo 1";
            text = "Você é o temido líder Orc, você tem um grande exército de Orcs sobre o seu controle, " 
            + "um informante me contou que um grupo de anões está tentando recuperar o tesouro da antiga Erebor, " 
            + "a montanha solitária que armazena uma grande fortuna, sua missão é impedir que os anões consigam " 
            + "recuperar suas terras. Soube que os anões vão passar pelas colinas em sua jornada... Deseja " 
            + "fazer uma emboscada para eles?";
            chapterNotes = userName + ",";
            option1 = "Sim, vamos acabar com eles nas colinas!";
            option2 = "Não, é melhor posicionar o exército nas redondezas de Erebor e armar uma emboscada por lá";

            Chapter chapterOne = new Chapter(name, text, chapterNotes, option1, option2, orcs, 0, 0);
            chapterOne.show();
            option = chapterOne.selectOption(sc);

            if (option == 1) {
                name = "Capítulo 2";
                text = "Seu exército emboscou o grupo de anões nas colinas, mas eles conseguiram escapar " 
                + "por uma passagem secreta, eles receberam ajuda dos elfos e se dirigiram para Erebor, " 
                + "seu exército tentou emboscá-los novamente em erebor mas não teve êxito, seu exército " 
                + "foi derrotado...";
                chapterNotes = "Notas do capítulo: Você perdeu toda a sua energia e um grupo de Orcs rivais roubou o seu ouro.";
                option1 = "";
                option2 = "";

                Chapter chapterTwo = new Chapter(name, text, chapterNotes, option1, option2, orcs, -orcs.getEnergy(), -orcs.getGold());
                chapterTwo.show();
                
                System.out.println();
                System.out.println("------ VOCÊ PERDEU ------");
                System.out.println();
                System.out.println("=-=-=-=-= FIM DE JOGO =-=-=-=-=");

            } else {
                name = "Capítulo 2";
                text = "Seu exército marchou até Erebor e se posicionou por lá, os anões chegaram sozinhos e sem nenhuma " 
                + "ajuda, eles tentaram resistir mas não adiantou muito..."
                + "Os anões foram derrotados e você conseguiu controle sobre a montanha solitária, agora " 
                + "todos na terra média temem o seu poderoso exército orc!";
                chapterNotes = "Notas do capítulo: A batalha lhe custou 50 de energia, porém vocês conquistaram todas " 
                + "as riquezas de Erebor, você recebeu 100000 de ouro.";
                option1 = "";
                option2 = "";

                Chapter chapterTwo = new Chapter(name, text, chapterNotes, option1, option2, orcs, -50, 100000);
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
