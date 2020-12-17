package pgdp.register;

public class Entry {
    private String name;
    private Penguin penguin;

    public Entry(String name, Penguin penguin) {
        this.name = name;
        this.penguin = penguin;
    }

    public String getName() {
        return name;
    }

    public Penguin getPenguin() {
        return penguin;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPenguin(Penguin penguin) {
        this.penguin = penguin;
    }

    @Override
    public String toString() {
        return "\"" + name + "\": \"" + penguin + "\"";
    }
}
