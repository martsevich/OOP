package clients;

public class Illness {
    String title;

    public Illness(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "clients.Illness{" +
                "title='" + title + '\'' +
                '}';
    }
}
