package io.github.WesleyViricimo.lists;

import java.util.ArrayList;
import java.util.List;

public class Lists {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Maria"); //Adicionando itens à lista
        list.add("Bob");
        list.add("Alex");
        list.add(2, "Marco"); //Adicionando itens em posição específica
        list.remove("Maria"); //Removendo elementos da lista

        System.out.println(list.size()); //Tamanho da lista
        for (String nome : list) {
            System.out.println(nome);
        }
    }
}
