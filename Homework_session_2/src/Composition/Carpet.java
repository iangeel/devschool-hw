package Composition;

public class Carpet {
    String model;
    String color;
    Float dimension;

    public Carpet(String model, String color, Float dimension) {
        this.model = model;
        this.color = color;
        this.dimension = dimension;
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

    public Float getDimension() {
        return dimension;
    }

    public void setDimension(Float dimension) {
        this.dimension = dimension;
    }
}
