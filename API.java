public abstract class API {

    abstract void newTurn();
    abstract void exit(String mes);
    abstract Transaction auction(Transaction t);
    abstract Transaction recieveOffer(Transaction t);

    public int startGame() {
        return 0;
    }

    public void Mortgage(Property p) {

    }

    public Event[] getCardLog() {
        return new Event[0];
    }

    public int buyHouse(Property p) {
        return 0;
    }

    public int buyHotel(Property p) {
        return 0;
    }

    public Transaction[] getTransactionLog(Player p) {
        return new Transaction[0];
    }

    public Transaction[] getTransactionLog() {
        return new Transaction[0];
    }

    public int getTurn() {
        return 0;
    }

    public Property getSpace(Player p) {
        return new Property();
    }

    public int getMoney(Player p) {
        return 0;
    }

    public Transaction makeOffer(Transaction o) {
        return new Transaction();
    }

    public Property[] getProperties(Player p) {
        return new Property[0];
    }
}