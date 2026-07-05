class Podcaster extends ContentCreator {

    public Podcaster(String username, int followersCount) {
        super(username, followersCount);
    }

    @Override
    public void createContent() {
        System.out.println("Podcaster: New podcast episode published");
    }

    public void recordAudio() {
        System.out.println("Recording audio...");
    }
}