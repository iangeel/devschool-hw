package Composition;

public class Couch {
    String model;
    String color;
    boolean isExtensible;

    public Couch(String model, String color, boolean isExtensible) {
        this.model = model;
        this.color = color;
        this.isExtensible = isExtensible;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isExtensible() {
        return isExtensible;
    }

    public void setExtensible(boolean extensible) {
        isExtensible = extensible;
    }
}
