class Alex extends MinecraftCharacter {

    public Alex(String name, int health) {
        super(name, health);
    }

    @Override
    void useAbility() {
        System.out.println("Alex is building a shelter");
    }
}