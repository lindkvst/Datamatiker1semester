package Lesson24;

public class Image {
    private String fileName;
    private int width;
    private int height;

    public Image(String fileName, int width, int height) {
        this.fileName = fileName;
        this.width = width;
        this.height = height;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public boolean isKnownFileType() {
        if (fileName.endsWith(".gif") ||
                fileName.endsWith(".jpg") ||
                fileName.endsWith(".jpeg") ||
                fileName.endsWith(".png") ||
                fileName.endsWith(".webp") ||
                fileName.endsWith(".bmp")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isPortrait() {
        if (height > width) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isLandscape() {
        if (height < width) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "fileName: " + fileName + ", width: " + width + ", height: " + height;
    }


}
