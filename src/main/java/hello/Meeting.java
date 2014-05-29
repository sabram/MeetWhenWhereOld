package hello;

public class Meeting {

    private final long id;
    private final String name;

    public Meeting(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
