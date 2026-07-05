public class Main {
    public static void main(String[] args) {

        RoyalCard[] cards = new RoyalCard[3];

        cards[0] = new TroopCard("Mini P.E.K.K.A", 4);
        cards[1] = new BuildingCard("Cannon", 3);
        cards[2] = new SpellCard("Fireball", 4);

        for (RoyalCard c : cards) {
            c.useCard();
        }

        cards[0].showArenaRule();

        ArenaSettings settings = new ArenaSettings();
        settings.showSettings();
    }
}

// Explain why a final class cannot be inherited.
// because its  the poverty of it ; to make sure that no other class can't extend it and change its behavior.

// Why can a method declared with the final keyword not be overridden in child classes?
// because its final ! java will prevent any override 

// Why is it not possible to extend a class marked as final?
// because the 'final' keyword indicates that the class cannot be subclassed, ensuring its behavior remains unchanged.