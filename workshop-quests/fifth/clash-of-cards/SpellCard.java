public class SpellCard extends RoyalCard {

    public SpellCard(String cardName, int elixirCost) {
        super(cardName, elixirCost);
    }

    @Override
    void useCard() {
        System.out.println(cardName + " is cast on the arena");
    }
}