public class Building {
    private final Property location;
    private final String type;

    public Building(Property location, String type) {
        this.location = location;
        this.type = type;
    }

    public Property getLocation() {
        return location;
    }

    public String getType() {
        return type;
    }

    public Player getOwner() {
        return location.getOwner();
    }
}
