package funcoesstring;

public class Recortar {

    public static void main(String[] args) {

        String original = "abcde FGHIJ KLM nopqr STUVX yz";

        String s04 = original.substring(2);
        String s05 = original.substring(2, 9);

        System.out.println(s04);
        System.out.println(s05);
    }
}
