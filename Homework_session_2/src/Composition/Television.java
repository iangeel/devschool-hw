package Composition;

public class Television {
    private String manufacturer;
    private Float diagonal;
    private boolean isSmart;
    private boolean isCurved;


    public Television(String manufacturer, Float diagonal, boolean isSmart, boolean isCurved) {
        this.manufacturer = manufacturer;
        this.diagonal = diagonal;
        this.isSmart = isSmart;
        this.isCurved = isCurved;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Float getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(Float diagonal) {
        this.diagonal = diagonal;
    }

    public boolean isSmart() {
        return isSmart;
    }

    public void setSmart(boolean smart) {
        isSmart = smart;
    }

    public boolean isCurved() {
        return isCurved;
    }

    public void setCurved(boolean curved) {
        isCurved = curved;
    }

    @Override
    public String toString() {
        return "Television{" +
                "manufacturer='" + manufacturer + '\'' +
                ", diagonal=" + diagonal +
                ", isSmart=" + isSmart +
                ", isCurved=" + isCurved +
                '}';
    }
}
