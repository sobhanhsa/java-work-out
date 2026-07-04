class Monster {

    private String name;
    private int hunger;
    private boolean isCaged;

    public Monster(String name, int hunger) {
        setName(name);
        setHunger(hunger);

        this.isCaged = false;

        escapeIfHungry(); 
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Invalid name");
        }
        this.name = name;
    }

    public int getHunger() {
        return hunger;
    }

    public boolean isCaged() {
        return isCaged;
    }

    public void setHunger(int hunger) {
        if (hunger < 0 || hunger > 100) {
            throw new IllegalArgumentException("Hunger must be 0 to 100");
        }
        this.hunger = hunger;
    }

    // ---------------- core behavior ----------------

    public void feed(int amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount must be positive");
        }

        hunger -= amount;

        if (hunger < 0) {
            hunger = 0;
        }

        System.out.println(name + " was fed. Hunger: " + hunger);
    }

    public void useEnergy(int amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount must be positive");
        }

        hunger += amount;

        if (hunger > 100) {
            hunger = 100;
        }

        System.out.println(name + " used energy. Hunger: " + hunger);

        if (isCaged && hunger > 70) {
            isCaged = false;
            System.out.println("Alert: " + name + " escaped from the cage!");
        }
    }

    public void cage() {
        if (hunger > 80) {
            System.out.println(name + " is too hungry to be caged.");
            return;
        }

        isCaged = true;
        System.out.println(name + " was put in the cage.");
    }

    public void getInfo() {
        System.out.println("Name: " + name + " | Hunger: " + hunger + " | Caged: " + isCaged);
    }


    private void escapeIfHungry() {
        if (isCaged && hunger > 70) {
            isCaged = false;
            System.out.println("Alert: " + name + " escaped from the cage!");
        }
    }
}