public class BuildingCard extends RoyalCard {

    public BuildingCard(String cardName, int elixirCost) {
        super(cardName, elixirCost);
    }

    @Override
    void useCard() {
        System.out.println(cardName + " is placed to defend the arena");
    }
}