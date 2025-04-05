package Cw_04_05;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> lista = new ArrayList<>();

        lista.add("Test");
        lista.add("Test");
        lista.add("Test");
        lista.add("Test");

        System.out.println(lista);
        for (int i = 0; i < lista.size(); i++) {
            System.out.println( "Element " + i + ":" + lista.get(i));
        }

        lista.remove(0);
        System.out.println(lista);

        lista.remove("Test");
        System.out.println(lista);

        ArrayList<Integer> listaInteger = new ArrayList<>();
        System.out.println("==============");

        Playlista playlista = new Playlista("Nazwa 1");
        playlista.dodajUtwor("Test1");
        playlista.dodajUtwor("Test1");
        playlista.dodajUtwor(null);
        playlista.dodajUtwor("");
        playlista.dodajUtwor("Test2");

        playlista.wyswietlUtwory();

        playlista.usunUtwor("Test1");
        playlista.usunUtwor(null);
        playlista.usunUtwor("");
        playlista.usunUtwor("Test3");
        playlista.wyswietlUtwory();

        playlista.dodajUtwor("Test1");
        playlista.dodajUtwor("Utwor1");
        playlista.dodajUtwor("Utwor2");
        playlista.dodajUtwor("Utwor3");

        playlista.wyszukajUtwory("Test");
        playlista.wyszukajUtwory("t");
        playlista.wyszukajUtwory(null);
        playlista.wyszukajUtwory("");
    }

}
