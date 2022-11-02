package sample;

public class Party {

    public String id;
    /*
    public String location;
    // TODO: rework property
    public String participants;
    // TODO: rework property
    public String items;

     */

    public Party(String id) {
        this.id = id;
    }

    // TODO: add serialization via JSON
    @Override
    public String toString() {
        return "Party{" +
                "id='" + id + '\'' +
                '}';
    }
}


