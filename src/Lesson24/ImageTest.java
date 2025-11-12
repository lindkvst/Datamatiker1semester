package Lesson24;

public class ImageTest {
    public static void main(String[] args) {
        Image im1 = new Image("test1.jpgt", 1080, 700);

        System.out.println(im1 + " | is known filetype: " + im1.isKnownFileType() );

        System.out.println("is " + im1.getFileName() + " portrait?: " + im1.isPortrait());
        System.out.println("is " + im1.getFileName() + " landscape?: " + im1.isLandscape());
    }
}
