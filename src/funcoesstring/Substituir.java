package funcoesstring;

public class Substituir {

    public static void main(String[] args) {

        String original = "abcde FGHIJ KLM nopqr STUVX yz";

        String s06 = original.replace('a', 'x');
        String s07 = original.replace("abc", "henrico");

        System.out.println(s06);
        System.out.println(s07);
    }
}
