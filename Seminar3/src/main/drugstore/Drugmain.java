package main.drugstore;

import main.drugstore.Component;
import main.drugstore.components.*;

import java.util.*;

public class Drugmain {
    public static void main(String[] args) {
        Component azitronite = new Azitronite("Azitronite", 150, 14);
        Component water = new Water("Water", 100, 1);
        Component penicillin = new Penicillin("Penicillin", 200, 6);
        Component antin = new Antin("Antin", 70, 9);

        Pharmacy2 p1 = new Pharmacy2();
        p1.addComponents(azitronite, water);

        Pharmacy2 p2 = new Pharmacy2();
        p2.addComponents(penicillin, water);

        Pharmacy2 p3 = new Pharmacy2();
        p3.addComponents(azitronite, penicillin);

        Pharmacy2 p4 = new Pharmacy2();
        p3.addComponents(water, antin);

        List<Component> components = new ArrayList<>();
        components.add(azitronite);
        components.add(water);
        components.add(penicillin);
        components.add(antin);
        //components.add(azitronite);


        System.out.println(components);
        Comparator<Component> compareByWeight = new Comparator<Component>() {

            public int compare(Component o1, Component o2) {
                return o1.weight - o2.weight;
            }
        };
        Collections.sort(components, compareByWeight);
        System.out.println("сортировка1: " + components);

//        Collections.sort(components, Comparator.reverseOrder()); // сортировка в обратном порядке
//        System.out.println("сортировка2: " + components);

//        Iterator<Component> iterator = p1;
//        while (iterator.hasNext()) {
//            System.out.println(p1.next().toString());
//        }
//        for (Component c : p2){
//            System.out.println(c);
//        }
     }
}

