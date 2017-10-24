public class PlayerEvent {
	private int deltaMoney = 0;
	private Place toMove = null;
	public void addMoney(int money) {
		deltaMoney += money;
	}
	public int getDeltaMoney() {
		return deltaMoney;
  }
	public void moveTo(Place p) {
		if(toMove != null) throw new IllegalStateException("Cannot move to more than one place.");
		toMove = p;
	}
	public Place getMoveTo() {
		return toMove;
	}
}
