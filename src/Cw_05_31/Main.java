package Cw_05_31;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Figura> figury = new ArrayList<Figura>();

        List<IObszar> obszars = new ArrayList<>();

        obszars.add(new Kwadrat(5));

        figury.add(new Kwadrat(5));
        figury.add(new Kolo(10));

        for (int i = 0; i < figury.size(); i++) {
            System.out.println(figury.get(i).obwod());
            System.out.println(figury.get(i).obszar());
        }
    }
}
