package io;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileEx2 {
    public static void main(String[] args) {
        File currDir = new File("/Users/soo/Desktop/temp");

        File[] files = currDir.listFiles();
        for (File file : files) {
            System.out.println(file.getName());
        }
        if (!currDir.exists()) {
            currDir.mkdir(); // make directory
        }
        File dir = new File("/Users/soo/Desktop/temp/dir");
        File file1 = new File("/Users/soo/Desktop/temp/dir/file1.txt");
        File file2 = new File("/Users/soo/Desktop/temp/file1.txt");
        File file3 = new File("/Users/soo/Desktop/temp/file2.txt");

        if (!file1.exists()) {
            dir.mkdir();
            try {
                if (!file1.exists())
                    file1.createNewFile();
                if (!file2.exists())
                    file2.createNewFile();
                if (!file3.exists())
                    file3.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }

            files = currDir.listFiles();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd-a HH:mm"); // a : am/pm

            // 날짜형식
            // 1. java.util.Date
            // 2.java.time.LocalDate

            System.out.println("\t날짜    시간    형태    크기    이름");
            System.out.println("===========================================");
            for (File file : files) {
                System.out.println(sdf.format(new Date(file.lastModified())));
                if (file.isDirectory()) {
                    System.out.println("\t<DIR>\t\t" + file.getName());
                } else {
                    System.out.println("\t\t\t" + file.length() + "\t" + file.getName());
                }
                System.out.println();
            }
        }
    }

}
