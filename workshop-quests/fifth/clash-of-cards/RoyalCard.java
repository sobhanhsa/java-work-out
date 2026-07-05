public abstract class RoyalCard {
    String cardName;
    int elixirCost;

    public RoyalCard(String cardName, int elixirCost) {
        this.cardName = cardName;
        this.elixirCost = elixirCost;
    }

    abstract void useCard();

    final void showArenaRule() {
        System.out.println("Arena rules cannot be changed.");
    }
}