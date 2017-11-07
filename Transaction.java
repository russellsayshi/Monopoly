public class Transaction {
    private Player buyer;
    private int buyerAmount;
    private Property buyerProperty;
    private Player seller;
    private int sellerAmount;
    private int sellerProperty;
    private String transactionType;
    private int turn;

    public Transaction() {}

    public Transaction(Player buyer, int buyerAmount, Property buyerProperty, Player seller, int sellerAmount, int sellerProperty, String transactionType, int turn) {
        this.buyer = buyer;
        this.buyerAmount = buyerAmount;
        this.buyerProperty = buyerProperty;
        this.seller = seller;
        this.sellerAmount = sellerAmount;
        this.sellerProperty = sellerProperty;
        this.transactionType = transactionType;
        this.turn = turn;
    }

    public Player getBuyer() {
        return buyer;
    }

    public void setBuyer(Player buyer) {
        this.buyer = buyer;
    }

    public int getBuyerAmount() {
        return buyerAmount;
    }

    public void setBuyerAmount(int buyerAmount) {
        this.buyerAmount = buyerAmount;
    }

    public Property getBuyerProperty() {
        return buyerProperty;
    }

    public void setBuyerProperty(Property buyerProperty) {
        this.buyerProperty = buyerProperty;
    }

    public Player getSeller() {
        return seller;
    }

    public void setSeller(Player seller) {
        this.seller = seller;
    }

    public int getSellerAmount() {
        return sellerAmount;
    }

    public void setSellerAmount(int sellerAmount) {
        this.sellerAmount = sellerAmount;
    }

    public int getSellerProperty() {
        return sellerProperty;
    }

    public void setSellerProperty(int sellerProperty) {
        this.sellerProperty = sellerProperty;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public int getTurn() {
        return turn;
    }

    public void setTurn(int turn) {
        this.turn = turn;
    }

    public String toString() {
        return "Transaction{" +
                "buyer=" + buyer +
                ", buyerAmount=" + buyerAmount +
                ", buyerProperty=" + buyerProperty +
                ", seller=" + seller +
                ", sellerAmount=" + sellerAmount +
                ", sellerProperty=" + sellerProperty +
                ", transactionType='" + transactionType + '\'' +
                ", turn=" + turn +
                '}';
    }
}