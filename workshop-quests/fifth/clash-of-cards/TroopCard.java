public class TroopCard extends RoyalCard {

    public TroopCard(String cardName, int elixirCost) {
        super(cardName, elixirCost);
    }

    @Override
    void useCard() {
        System.out.println(cardName + " is deployed to attack enemy troops");
    }
}