package Composition;

public class Room {
    String type;
    Float dimension;
    Armchair armchair;
    Couch couch;
    Carpet carpet;
    Television tv;

    public Room(String type, Float dimension, Armchair armchair, Couch couch, Carpet carpet, Television tv) {
        this.type = type;
        this.dimension = dimension;
        this.armchair = armchair;
        this.couch = couch;
        this.carpet = carpet;
        this.tv = tv;
    }

    public String getTvDetails() {
        return this.tv.toString();
    }

    public Armchair getArmchairDetails() {
        return this.armchair;
    }


}
