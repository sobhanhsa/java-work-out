abstract class ContentCreator {
    protected String username;
    protected int followersCount;

    public ContentCreator(String username, int followersCount) {
        this.username = username;
        this.followersCount = followersCount;
    }

    public abstract void createContent();

    public final void showProfile() {
        System.out.println("Username: " + username);
        System.out.println("Followers: " + followersCount);
        System.out.println();
    }
}