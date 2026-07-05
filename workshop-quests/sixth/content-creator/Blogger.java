class Blogger extends ContentCreator {

    public Blogger(String username, int followersCount) {
        super(username, followersCount);
    }

    @Override
    public void createContent() {
        System.out.println("Blogger: New article published");
    }

    public void checkSEO() {
        System.out.println("Checking SEO...");
    }
}