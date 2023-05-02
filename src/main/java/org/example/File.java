package org.example;

public class File {
    private String fileName;
    private int size;
    private String fileFormat;

    public File(String fileName, int size, String fileFormat) {
        setFileName(fileName);
        setSize(size);
        setFileFormat(fileFormat);
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        if(fileName != null)
            this.fileName = fileName;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getFileFormat() {
        return fileFormat;
    }

    public void setFileFormat(String fileFormat) {
        if(fileFormat != null)
            this.fileFormat = fileFormat;
    }

    @Override
    public String toString() {
        return String.format("%20s%20s%20s%20s%20s", getFileName(), "|", getSize(), "|", getFileFormat());
    }


    public static void printAll(File[] i) {
        System.out.println("_____________________________________________________________________________________________________________________________________________________________");
        System.out.format("%20s%20s%20s%20s%20s", "File name", "|", "Size", "|", "Details\n");
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------");
        for (File x : i) {
            System.out.println(x.toString());
        }
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------");
    }
}


