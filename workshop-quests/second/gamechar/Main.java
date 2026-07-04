class GameCharacter {
    public int energy = 10;
    public boolean isAlive = true;

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        if (energy < 0 || energy > 20) {
            throw new IllegalArgumentException("Energy must be between 0 and 20.");
        }

        this.energy = energy;
    }
}

// the energy field can be any assigned value because its public just like isAlive field
// ex GameCharacter g = new GameCharacter(); g.energy = -1000;

class ImprovedGameCharacter {

    private int energy;
    private boolean alive;

    public ImprovedGameCharacter(int energy) {
        setEnergy(energy);
    }

    public int getEnergy() {
        return energy;
    }

    public boolean isAlive() {
        return alive;
    }

    public void useEnergy(int amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount must be positive.");
        }

        if (!alive) {
            throw new IllegalStateException("Character is dead.");
        }

        energy -= amount;

        if (energy <= 0) {
            energy = 0;
            alive = false;
        }
    }

    public void recoverEnergy(int amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount must be positive.");
        }

        if (!alive) {
            throw new IllegalStateException("Dead character cannot recover energy.");
        }

        energy += amount;

        if (energy > 20) {
            energy = 20;
        }
    }

    public void setEnergy(int energy) {
        if (energy < 0 || energy > 20) {
            throw new IllegalArgumentException("Energy must be between 0 and 20.");
        }

        this.energy = energy;

        if (this.energy == 0) {
            this.alive = false;
        } else {
            this.alive = true;
        }
    }
}