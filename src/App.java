import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        Character anoes = new Character("Anões", 1000);
        Character orcs = new Character("Orcs", 2500);

        System.out.println("Olá, você acaba de iniciar uma nova jonada...");
        System.out.println("Me diga o nome de seu personagem");

        String userName = sc.nextLine();

        Chapter preface = new Chapter(
            "Apresentação Inicial", 
            "Olá " + userName + "! Eu sou o Gandalf, o Mago Cinzento que irá te ajudar durante essa jornada, " 
            + "será uma jornada na terra média, um lugar onde você pode encontrar hobbits, anões, elfos " 
            + "e os terríveis orcs, você também terá itens como energia e ouro durante a jornada, eles " 
            + "podem aumentar ou diminuir baseado em suas ações, só é bom ter cuidado para não ficar sem energia..." 
            + "Para iniciarmos você precisa escolher qual personagem você será durante a jornada, escolha sua opção:", 
            null, 
            anoes, 
            0, 
            0, 
            sc
        );

        // anões

        Chapter anoesChapterOne = new Chapter(
            "Capítulo 1", 
            "Ok a partir de agora você é o líder de um grupo de anões, sua missão é recuperar Erebor, " 
            + "a montanha solitária que uma vez já foi lar de seus ancestrais. Será uma missão difícil, " 
            + "pois há vários seres na terra média que também querem o controle daquela montanha, " 
            + "é provável que você precise de ajuda, há um pequeno Hobbit num condado aqui perto, " 
            + "gostaria de recrutá-lo para ajudar na missão?", 
            userName + ",", 
            anoes, 
            0, 
            0, 
            sc
        );

        Chapter anoesChapterTwo_1 = new Chapter(
            "Capítulo 2", 
            "Fomos buscar o Hobbit no condado, ele hesitou em participar mas no fim acabou concordando em ir " 
            + "seguimos nossa viagem através das colinas, um dos integrantes do grupo ouviu um barulho distante, você" 
            + "foi conferir e descobre que um grupo de orcs está vindo atacá-los, o que você vai fazer?", 
            "Notas do capítulo: A ida ao condado lhe custou 10 de energia e 100 de ouro.", 
            anoes, 
            -10, 
            -100, 
            sc
        );

        Chapter anoesChapterTwo_2 = new Chapter(
            "Capítulo 2", 
            "Seguimos a jornada sem o Hobbit, seu grupo de anões está se dirigindo para Erebor " 
            + "através das colinas, um dos integrantes do grupo ouviu um barulho distante, você" 
            + "foi conferir e descobre que um grupo de orcs está vindo atacá-los, o que você vai fazer?", 
            "Notas do capítulo: A jornada lhe custou 10 de energia, você não perdeu nenhum ouro.", 
            anoes, 
            -10, 
            0, 
            sc
        );

        Chapter anoesChapterThree_1 = new Chapter(
            "Capítulo 3", 
            "Você enfrentou os orcs, porém eles estavam em maior número, seu grupo mesmo com " 
            + "bastante esforço não conseguiu vencê-los", 
            "Notas do capítulo: Você perdeu toda a sua energia e os Orcs roubaram todo o seu ouro.", 
            anoes, 
            -anoes.getEnergy(), 
            -anoes.getGold(), 
            sc
        );

        Chapter anoesChapterThree_2 = new Chapter(
            "Capítulo 3", 
            "O pequeno Hobbit conseguiu encontrar um caminho secreto, seu grupo fugiu por ele!"
            + "No fim do caminho vocês se depararam com uma cidade élfica, o rei élfico ofereceu a " 
            + "ajuda de seu exército para conquistar Erebor, você vai aceitar?", 
            "Notas do capítulo: A fuga lhe custou 10 de energia, durante a fuga o hobbit encontrou um barril "
            + "com 1000 moedas de ouro, os elfos lhe pesentearam com 500 moedas de ouro.",  
            anoes, 
            -10, 
            1500, 
            sc
        );

        Chapter anoesChapterFour_1 = new Chapter(
            "Capítulo 4", 
            "Seu grupo se dirigiu até a montanha solitária, nas proximidades da montanha vocês foram " 
            + "emboscados novamente por orcs, dessa vez não houve escapatória, vocês lutaram bravamente " 
            + "mas os orcs eram muitos...", 
            "Notas do capítulo: Você perdeu toda a sua energia e os Orcs roubaram todo o seu ouro.", 
            anoes, 
            -anoes.getEnergy(), 
            -anoes.getGold(), 
            sc
        );

        Chapter anoesChapterFour_2 = new Chapter(
            "Capítulo 4", 
            "Seu grupo se dirigiu até a montanha solitária acompanhados dos elfos, nas proximidades da " 
            + "montanha vocês foram emboscados novamente por orcs, houve uma batalha difícil que durou " 
            + "por vários dias, depois de muito esforço voçês conseguiram derrotar o exército orc, e olha " 
            + "só, o pequeno Hobbit foi quem derrotou o terrível Líder Orc, vocês recuperaram a montanha "
            + "solitária e realizaram uma grande festa em comemoração!", 
            "Notas do capítulo: A batalha lhe custou 50 de energia, porém vocês conquistaram todas " 
            + "as riquezas de Erebor, você recebeu 100000 de ouro", 
            anoes, 
            -50, 
            100000, 
            sc
        );

        // orcs

        Chapter orcsChapterOne = new Chapter(
            "Capítulo 1", 
            "Você é o temido líder Orc, você tem um grande exército de Orcs sobre o seu controle, " 
            + "um informante me contou que um grupo de anões está tentando recuperar o tesouro da antiga Erebor, " 
            + "a montanha solitária que armazena uma grande fortuna, sua missão é impedir que os anões consigam " 
            + "recuperar suas terras. Soube que os anões vão passar pelas colinas em sua jornada... Deseja " 
            + "fazer uma emboscada para eles?", 
            userName + ",", 
            orcs, 
            0, 
            0, 
            sc
        );

        Chapter orcsChapterTwo_1 = new Chapter(
            "Capítulo 2", 
            "Seu exército emboscou o grupo de anões nas colinas, mas eles conseguiram escapar " 
            + "por uma passagem secreta, eles receberam ajuda dos elfos e se dirigiram para Erebor, " 
            + "seu exército tentou emboscá-los novamente em erebor mas não teve êxito, seu exército " 
            + "foi derrotado...", 
            "Notas do capítulo: Você perdeu toda a sua energia e um grupo de Orcs rivais roubou o seu ouro.", 
            orcs, 
            -orcs.getEnergy(), 
            -orcs.getGold(), 
            sc
        );

        Chapter orcsChapterTwo_2 = new Chapter(
            "Capítulo 2", 
            "Seu exército marchou até Erebor e se posicionou por lá, os anões chegaram sozinhos e sem nenhuma " 
            + "ajuda, eles tentaram resistir mas não adiantou muito..."
            + "Os anões foram derrotados e você conseguiu controle sobre a montanha solitária, agora " 
            + "todos na terra média temem o seu poderoso exército orc!", 
            "Notas do capítulo: A batalha lhe custou 50 de energia, porém vocês conquistaram todas " 
            + "as riquezas de Erebor, você recebeu 100000 de ouro.", 
            orcs, 
            -50, 
            100000, 
            sc
        );

        // árvore de capítulos

        preface.options.add(new Choice("Líder Anão", anoesChapterOne));
        preface.options.add(new Choice("Líder Orc", orcsChapterOne));

        anoesChapterOne.options.add(new Choice("Sim, qualquer ajuda é bem vinda", anoesChapterTwo_1));
        anoesChapterOne.options.add(new Choice("Não, não preciso de um pequeno Hobbit em minha equipe", anoesChapterTwo_2));

        anoesChapterTwo_1.options.add(new Choice("Lutar, mesmo em menor número conseguiremos vencer esses orcs", anoesChapterThree_1));
        anoesChapterTwo_1.options.add(new Choice("Fugir, pedir para que todos os integrantes do grupo procurem por uma rota de fuga", anoesChapterThree_2));

        anoesChapterTwo_2.options.add(new Choice("Lutar, essa é a única opção que temos", anoesChapterThree_1));
        anoesChapterThree_2.options.add(new Choice("Não, essa missão é só nossa, não cabe aos elfos se intrometer", anoesChapterFour_1));
        
        anoesChapterThree_2.options.add(new Choice("Sim, o exército élfico será de grande ajuda para a missão", anoesChapterFour_2));

        orcsChapterOne.options.add(new Choice("Sim, vamos acabar com eles nas colinas!", orcsChapterTwo_1));
        orcsChapterOne.options.add(new Choice("Não, é melhor posicionar o exército nas redondezas de Erebor e armar uma emboscada por lá", orcsChapterTwo_2));

        preface.show();

        sc.close();
    }
}
