package io.github.WesleyViricimo;

public class FuncoesParaStrings {

    public static void main(String[] args) {
        String original = "abcde FGHIJ ABC abc DEFG     ";
        String s = "potato apple lemon";
        String[] vect = s.split(" ");
        String palavra1 = vect[0];
        String palavra2 = vect[1];
        String palavra3 = vect[2];


        System.out.println("Original = " + original);
        System.out.println("String em letras minúsculas - toLowerCase() = " + original.toLowerCase());
        System.out.println("String em letras maiúsculas - toUpperCase() = " + original.toUpperCase());
        System.out.println("String removendo espaços - trim() = " + original.trim());
        System.out.println("String apenas da posição 2 em diante - substring(2) = " + original.substring(2));
        System.out.println("String apenas da posição 2 em diante limitando até a posição 9 - substring(2, 9) = " + original.substring(2, 9));
        System.out.println("String substituindo a string s pela string x - replace('a', 'x') = " + original.replace('a', 'x'));
        System.out.println("String encontrando primeira posição onde a string bc aparece - indexOf('bc') = " + original.indexOf("bc"));
        System.out.println("String palavra1 dividida - split(' ') = " + palavra1);
        System.out.println("String palavra2 dividida - split(' ') = " + palavra2);
        System.out.println("String palavra3 dividida - split(' ') = " + palavra3);
    }
}
