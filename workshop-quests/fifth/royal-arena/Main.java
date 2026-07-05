public class Main {
    public static void main(String[] args) {

        ArenaUnit[] units = new ArenaUnit[3];

        units[0] = new GroundUnit("Knight", 1000);
        units[1] = new RangedUnit("Musketeer", 800);
        units[2] = new ChargingUnit("Prince", 1500);

        for (ArenaUnit u : units) {
            u.move();

            if (u instanceof ChargingUnit) {
                ChargingUnit c = (ChargingUnit) u;
                c.chargeAttack();
            }
        }
    }
}

/*
Why does the following code produce a compile-time error?

ArenaUnit unit = new ChargingUnit("Prince", 1500);
unit.chargeAttack();

Answer:
becuase we need down casting , since this method its ChangingUnit unique method

The compile-time error happens because the reference type is ArenaUnit.
The method chargeAttack() is not defined in the ArenaUnit class, so the compiler does not allow calling it.

How to fix it:

We must downcast the reference to ChargingUnit:

((ChargingUnit) unit).chargeAttack();

Or safely:

if (unit instanceof ChargingUnit) {
    ((ChargingUnit) unit).chargeAttack();
}
*/