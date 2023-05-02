package org.example;

public class Document extends File {
    private int pages;

    public Document(String fileName, int size, String fileFormat, int pages) {
        super(fileName, size, fileFormat);
        setPages(pages);
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + getPages() + " pages";
    }
}
