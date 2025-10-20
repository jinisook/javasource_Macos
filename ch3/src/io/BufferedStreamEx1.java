package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.Buffer;

// java 파일로 txt를 읽을 수 있음
public class BufferedStreamEx1 {
    public static void main(String[] args) {
        try {

            // InputStream in = new FileInputStream("/Users/soo/Desktop/temp/img1.jpg");
            // BufferedInputStream bis = new BufferedInputStream(in); // Buffer에서 읽고
            // OutputStream out = new FileOutputStream("/Users/soo/Desktop/temp/copy2.jpg");
            // // 파일 생성
            // BufferedOutputStream bos = new BufferedOutputStream(out); // Buffer에서 작성

            BufferedInputStream bis = new BufferedInputStream(new FileInputStream("/Users/soo/Desktop/temp/img1.jpg")); // in
                                                                                                                        // 자리에
                                                                                                                        // new
                                                                                                                        // 부분

            BufferedOutputStream bos = new BufferedOutputStream(
                    new FileOutputStream("/Users/soo/Desktop/temp/copy2.jpg")); // Buffer에서 작성

            int input = 0;
            byte[] bytes = new byte[1024];
            while ((input = bis.read(bytes)) != -1) {
                bos.write(bytes);
            }

            // in.close();
            bos.flush();
            // out.close();
        } catch (IOException e) { // - IO가 부모라서 FileNotFoundException, IOException 둘다 처리 가능
            e.printStackTrace();
        }

    }

}