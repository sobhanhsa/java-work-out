class VideoCreator extends ContentCreator {

    public VideoCreator(String username, int followersCount) {
        super(username, followersCount);
    }

    @Override
    public void createContent() {
        System.out.println("VideoCreator: New video uploaded");
    }

    public void editVideo() {
        System.out.println("Editing video...");
    }
}