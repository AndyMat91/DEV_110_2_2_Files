package org.example;

public class StaticImage extends File {
    private int[] widthHeight;

    public StaticImage(String fileName, int size, String fileFormat, int[] widthHeight) {
        super(fileName, size, fileFormat);
        setWidthHeight(widthHeight);
    }

    public int[] getWidthHeight() {
        return widthHeight;
    }

    public void setWidthHeight(int[] widthHeight) {
        if (widthHeight != null)
            this.widthHeight = widthHeight;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + getWidthHeight()[0] + "x" + getWidthHeight()[1];
    }
}
