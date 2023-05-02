package org.example;

import java.time.LocalTime;
import java.util.Arrays;

public class VideoFile extends MultimediaFile {
    private int[] imageSize;

    public VideoFile(String fileName, int size, String fileFormat, String description, LocalTime duration, int[] imageSize) {
        super(fileName, size, fileFormat, description, duration);
        setImageSize(imageSize);
    }

    public int[] getImageSize() {
        return imageSize;
    }

    public void setImageSize(int[] imageSize) {
        if(imageSize != null)
            this.imageSize = imageSize;
    }

    public void imageSizePrint(){
        System.out.println(getImageSize()[0] + "x" + getImageSize()[1]);
    }

    @Override
    public String toString() {
        return super.toString() + ", " + getImageSize()[0] + "x" + getImageSize()[1];
    }
}
