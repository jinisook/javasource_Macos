package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

// java 파일로 txt를 읽을 수 있음
public class InputStreamEx2 {
    public static void main(String[] args) {
        try {
            // InputStream in = new FileInputStream(new File("null"));
            // InputStream in = new FileInputStream("/Users/soo/Desktop/temp/file1.txt"); //
            // in -> 파일 읽는 통로(stream)
            // OutputStream out = new
            // FileOutputStream("/Users/soo/Desktop/temp/output1.txt"); // 파일 생성
            // ctrl c + ctrl v 개념
            InputStream in = new FileInputStream("/Users/soo/Desktop/temp/img1.jpg");
            OutputStream out = new FileOutputStream("/Users/soo/Desktop/temp/copy2.jpg"); // 파일 생성
            // int input = in.read(); // 한 바이트만 읽게 됨
            int input = 0;
            byte[] bytes = new byte[1024];
            while ((input = in.read(bytes)) != -1) {
                // System.out.print((char) input); // - 화면 출력
                out.write(bytes);
            }

            in.close();
            out.close();
        } catch (IOException e) { // - IO가 부모라서 FileNotFoundException, IOException 둘다 처리 가능
            e.printStackTrace();
        }

    }

}
