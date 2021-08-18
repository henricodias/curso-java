package funcoesstring;

import java.util.Locale;

public class Formatar {

    public static void main(String[] args) {

        String original = "     abcde FGHIJ KLM nopqr STUVX yz   ";

        String s01 = original.toLowerCase(); //colocar todos os caracteres minúsculos da String
        String s02 = original.toUpperCase(); //colocar todos os caracteres maiúsculos da String
        String s03 = original.trim(); //elimina os espaços vazios nas extremidades da String


        System.out.println(s01);
        System.out.println(s02);
        System.out.println(s03);
    }
}
