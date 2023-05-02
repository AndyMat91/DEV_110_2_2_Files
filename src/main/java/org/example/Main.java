package org.example;

import java.time.LocalTime;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        File[] array = new File[]{
                new Document("j110-lab2.docx", 232125, "docx", 2),
                new Document("j110-slides.pptx", 639616, "pptx", 8),
                new StaticImage("spb-map.png", 7030527, "image", new int[]{2048, 6144}),
                new MultimediaFile("06-PrettyGirl.mp3", 7893454, "audio", "Eric Clapton, Pretty Girl", LocalTime.of(5, 28)),
                new VideoFile("BackToTheFuture1.avi", 1470984192, "video", "Back to the future I, 1985", LocalTime.of(1, 48, 8), new int[]{640, 352})
        };

        VideoFile[] arrayVideo = new VideoFile[]{
                new VideoFile("BackToTheFuture1.avi", 1470984192, "video", "Back to the future I, 1985", LocalTime.of(5, 32, 54), new int[]{640, 352}),
                new VideoFile("video.avi", 353535634, "video", "Andrew, 1999", LocalTime.of(12, 32, 14), new int[]{720, 450}),
                new VideoFile("coco.avi", 36636363, "video", "John, 1987", LocalTime.of(1, 2, 12), new int[]{890, 433})
        };
        File.printAll(array);
        System.out.println();
        VideoFile.printAll(arrayVideo);
        System.out.println("Метод printAll подходит для массива дочернего типа, потому что:\n" +
                "1). Статический метод наследуется классами наследниками;\n" +
                "2). Метод принимает на вход массив объектов типа File, т.к. дочернии типы унаследованы от типа File, то он их примет;\n" +
                "3). В методе printAll, для каждого элемента массива, вызывается, переопределенный для каждого подкласса метод toString.");

        System.out.println();
        System.out.println("Демонстрация методов печати строкового представления размера изображения и длительности медиа файла:");
        VideoFile mFile = new VideoFile("coco.avi", 36636363, "video", "John, 1987", LocalTime.of(1, 2, 12), new int[]{890, 433});
        System.out.println("Размер изображения (в пикселях): ");
        mFile.imageSizePrint();
        System.out.println("Длительность файла: ");
        mFile.durationPrint();
    }
}