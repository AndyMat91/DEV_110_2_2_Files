package org.example;

import java.time.LocalTime;


public class MultimediaFile extends File {
    private String description;
    private LocalTime duration;

    public MultimediaFile(String fileName, int size, String fileFormat, String description, LocalTime duration) {
        super(fileName, size, fileFormat);
        setDescription(description);
        this.duration = duration;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalTime getDuration() {
        return duration;
    }

    public void setDuration(LocalTime duration) {
        this.duration = duration;
    }

    public void durationPrint(){
        System.out.println(getDuration());
    }

    @Override
    public String toString() {
        return super.toString() + ", " + getDescription() + ", " + getDuration();
    }
}
