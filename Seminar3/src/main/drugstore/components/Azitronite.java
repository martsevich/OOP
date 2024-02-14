package main.drugstore.components;

import main.drugstore.Component;

public class Azitronite extends Component {
    public Azitronite(String title, int weight, int power) {
        super(title, weight, power);
    }
    @Override
    public int compareTo(Component o) {
        return 0;
    }
}
