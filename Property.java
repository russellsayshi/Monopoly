import java.util.ArrayList;

public class Property {
    private final String name;
    private final int tileNumber;
    private final int address;
    private final String color;
    private Player owner;
    private ArrayList<Building> buildings;

    public Property() {
        this.name = "";
        this.tileNumber = 0;
        this.address = 0;
        this.color = "";
    }

    public Property(String name, int tileNumber, int address, String color) {
        this.name = name;
        this.tileNumber = tileNumber;
        this.address = address;
        this.color = color;
        this.buildings = new ArrayList<>();
        this.owner = null;
    }

    public Player getOwner() {
        return owner;
    }

    public void setOwner(Player owner) {
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public int getTileNumber() {
        return tileNumber;
    }

    public int getAddress() {
        return address;
    }

    public String getColor() {
        return color;
    }

    public ArrayList<Building> getBuildings() {
        return buildings;
    }

    public void addBuilding() {

    }

    public String toString() {
        return "Property{" +
                "name='" + name + '\'' +
                ", tileNumber=" + tileNumber +
                ", address=" + address +
                ", color='" + color + '\'' +
                '}';
    }
}
