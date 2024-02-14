package main.drugstore;

import java.util.Comparator;

public  abstract class Component implements Comparable<Component> {
    private String title;
    public int weight;
    private int power;

    public Component(String title, int weight, int power) {
        this.title = title;
        this.weight = weight;
        this.power = power;
    }

    public int getWeight() {
        return weight;
    }

    public int getPower() {
        return power;
    }

    @Override
    public String toString() {
        return String.format("Title = %s, weight = %s", title, weight);
    }

//    public String getWeight() {
//        int o2 = 0;
//        for (Component c : this.weight) o2 += c.getPower();
//        return o2 + "";
//    }
//    @Override
//
//    public int compareTo(Component o) {
// //       return this.power - o.power; // разница между ними – вычесть один из другого
////        return Integer.compare(this.power, o.power); //(o.power, this.power);
//       //---------------------------------
//
//        return Integer.compare(this.getWeight(), o.weight);

        // (сортировка по весу):
//--------------------------------------------------------------------------
//        if (this.weight > o.weight){
//            return -1;
//        }
//        else if (this.weight < o.weight){
//            return 1;
//        }
//        else {
//            return 0;
//        }
//    }
}