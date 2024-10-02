import java.util.Scanner;
import java.util.Random;
public class Forca{
    public static void main(String[] args) {
        final int MAX_TENTATIVAS = 7;

        String[] palavrasSecretas = {"filaucioso", "empedernido", "cornucópia", "idiossincrasia", "verossimilhança", "paraclorobenzilpirrolidinonetilbenzimidazol", "pernóstico", "tergiversar", "peregrinação", "desassossego", "vicissitude", "circunlóquio", "inconspícuo", "cineangiocoronariografia", "dacriocistossiringotomia", "infundibuliforme", "justapor", "nefelibata", "parassimpatomimético", "prestidigitação", "quidam", "retrogradação", "rufião", "sectário", "troada", "visagem", "zeugma", "paradoxal", "impavidamente", "meningoencefalomielite"};

        int num_random = (int) (Math.random() * (palavrasSecretas.length + 1));
        String palavraSecreta = palavrasSecretas[num_random];

        char[] letrasCorretas = new char[palavraSecreta.length()];

        for (int i = 0; i < letrasCorretas.length; i++) {
            letrasCorretas[i] = '_';
        }

        char[] letrasIncorretas = new char[MAX_TENTATIVAS];

        int numTentativasErradas = 0;

        Scanner ler = new Scanner(System.in);

        while (!vitoria(letrasCorretas) && numTentativasErradas < MAX_TENTATIVAS) {
            System.out.print("\nPalavra Secreta:    ");
            for(int i = 0; i < letrasCorretas.length; i++){
                System.out.print(letrasCorretas[i] + " ");
            }
            if(numTentativasErradas > 0){
                System.out.print("\n\nTentativas erradas: ");
                for(int i = 0; i < numTentativasErradas; i++){
                    System.out.print(letrasIncorretas[i] + " ");
                }
            }
            System.out.print("\n\nInsira tentativa com letra minuscula: ");
            char letra = ler.nextLine().charAt(0);
            Character.toLowerCase(letra);
            boolean acertou = false;

            for(int i = 0; i < palavraSecreta.length(); i++){
                if(palavraSecreta.charAt(i) == letra){
                    acertou = true;
                    letrasCorretas[i] = letra;
                }
            }
            if(acertou){
                System.out.print("\nNICE BRO! A letra existe na palavra.");
            }
            else{
                letrasIncorretas[numTentativasErradas] = letra;
                numTentativasErradas++;
                System.out.print("\nA letra nao existe na palavra!");
                imprimeBoneco(numTentativasErradas);
            }
        }
        System.out.println("\nO jogo da Forca terminou!");
        System.out.println("A palavra escondida era " + palavraSecreta);
        if(vitoria(letrasCorretas)){
            System.out.println("Ganhaste o jogo bro!!");
        }else{
            System.out.println("Perdeste o jogo!! É o que é.");
        }
    }
    public static void imprimeBoneco(int n) {
        switch (n) {
            case 1:
                System.out.println("É sem stress, tenta de novo");
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println("____|____");
                break;
            case 2:
                System.out.println("É sem stress, tenta de novo");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("____|____");
                break;
            case 3:
                System.out.println("É sem stress, tenta de novo");
                System.out.println("    ______________");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("____|____");
                break;
            case 4:
                System.out.println("É sem stress, tenta de novo");
                System.out.println("    ______________");
                System.out.println("    |           __|__");
                System.out.println("    |          |     |");
                System.out.println("    |          |     | ");
                System.out.println("    |          |_____| ");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("____|____");
                break;
            case 5:
                System.out.println("É sem stress, tenta de novo");
                System.out.println("    ______________");
                System.out.println("    |           __|__");
                System.out.println("    |          |     |");
                System.out.println("    |          |     | ");
                System.out.println("    |          |_____| ");
                System.out.println("    |             | ");
                System.out.println("    |             |  ");
                System.out.println("    |");
                System.out.println("    | ");
                System.out.println("    |");
                System.out.println("____|____");
                break;
            case 6:
                System.out.println("É sem stress, tenta de novo");
                System.out.println("    ______________");
                System.out.println("    |           __|__");
                System.out.println("    |          |     |");
                System.out.println("    |          |     | ");
                System.out.println("    |          |_____| ");
                System.out.println("    |            _|_ ");
                System.out.println("    |             |  ");
                System.out.println("    |            / \\  ");
                System.out.println("    |           /  \\ ");
                System.out.println("    |          /    \\ ");
                System.out.println("____|____");
                break;
            case 7:
                System.out.println("ACABOU O JOGO!");
                System.out.println("    ______________");
                System.out.println("    |           __|__");
                System.out.println("    |          |     |");
                System.out.println("    |          |     | ");
                System.out.println("    |          |_____| ");
                System.out.println("    |            _|_ ");
                System.out.println("    |          /  | \\ ");
                System.out.println("    |         /   /\\ \\");
                System.out.println("    |            /  \\ ");
                System.out.println("    |           /    \\ ");
                System.out.println("____|____");
                break;
        }
    }
    private static boolean vitoria(char[] letras){
        boolean vitoria = true;
        for(char c : letras){
            if(c == '_'){
                vitoria = false;
            }
        }
        return vitoria;
    }
}
