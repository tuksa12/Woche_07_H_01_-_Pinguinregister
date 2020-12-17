package pgdp.register;

public class Penguin {
    private final String description;

    public Penguin(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return description;
    }
}
