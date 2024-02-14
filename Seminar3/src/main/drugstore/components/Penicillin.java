package main.drugstore.components;

import main.drugstore.Component;

public class Penicillin  extends Component {
    public Penicillin(String title, int weight, int power) {
        super(title, weight, power);
    }
    @Override
    public int compareTo(Component o) {
        return 0;
    }
}

