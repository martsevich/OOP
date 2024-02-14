package main.drugstore.components;

import main.drugstore.Component;

public class Antin extends Component {
    public Antin(String title, int weight, int power) {
        super(title, weight, power);
    }
    @Override
    public int compareTo(Component o) {
        return 0;
    }
}
