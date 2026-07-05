public class Main {
    public static void main(String[] args) {

        ContentCreator[] creators = new ContentCreator[3];

        creators[0] = new VideoCreator("sara", 5000);
        creators[1] = new Podcaster("reza", 3200);
        creators[2] = new Blogger("mina", 2100);

        for (ContentCreator c : creators) {
            c.createContent();
            c.showProfile();
        }

        for (ContentCreator c : creators) {
            if (c instanceof VideoCreator) {
                ((VideoCreator) c).editVideo();
            } 
            else if (c instanceof Blogger) {
                ((Blogger) c).checkSEO();
            }
        }
    }
}