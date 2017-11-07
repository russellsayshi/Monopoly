import java.util.ArrayList;

public class Player {
    private int playerId;
    private String playerName;
    private ArrayList<Property> properties;
    private Property currentSpace;
    private ArrayList<Property> moveHistory;
    private int money;
    private ArrayList<Transaction> transactions;
    private ArrayList<Event> events;

    public Player(int playerId, String playerName) {
        this.playerId = playerId;
        this.playerName = playerName;
        this.properties = new ArrayList<>();
        this.currentSpace = new Property();
        this.moveHistory = new ArrayList<>();
        this.money = 0;
        this.transactions = new ArrayList<>();
        this.events = new ArrayList<>();
    }

    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public ArrayList<Property> getProperties() {
        return properties;
    }

    public void setProperties(ArrayList<Property> properties) {
        this.properties = properties;
    }

    public Property getCurrentSpace() {
        return currentSpace;
    }

    public void setCurrentSpace(Property currentSpace) {
        this.currentSpace = currentSpace;
    }

    public ArrayList<Property> getMoveHistory() {
        return moveHistory;
    }

    public void setMoveHistory(ArrayList<Property> moveHistory) {
        this.moveHistory = moveHistory;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(ArrayList<Transaction> transactions) {
        this.transactions = transactions;
    }

    public ArrayList<Event> getEvents() {
        return events;
    }

    public void setEvents(ArrayList<Event> events) {
        this.events = events;
    }

    public String toString() {
        return "Player{" +
                "playerId=" + playerId +
                ", playerName='" + playerName + '\'' +
                ", properties=" + properties +
                ", currentSpace=" + currentSpace +
                ", moveHistory=" + moveHistory +
                ", money=" + money +
                ", transactions=" + transactions +
                ", events=" + events +
                '}';
    }
}
