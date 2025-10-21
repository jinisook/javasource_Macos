package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

// java 파일로 txt를 읽을 수 있음
// 자동으로 close();
public class InputStreamEx3 {
    public static void main(String[] args) {

        // try 괄호 안에 내용 입력 후 close 구문x 해도 가능, 대신 조건(Closeable 구현되어 있으면)
        try (InputStream in = new FileInputStream("/Users/soo/Desktop/temp/img1.jpg");
                OutputStream out = new FileOutputStream("/Users/soo/Desktop/temp/copy1.jpg");) {
            // int input = in.read(); // 한 바이트만 읽게 됨
            int input = 0;
            while ((input = in.read()) != -1) {
                // System.out.print((char) input); // - 화면 출력
                out.write(input);
            }

        } catch (IOException e) { // - IO가 부모라서 FileNotFoundException, IOException 둘다 처리 가능
            e.printStackTrace();
        }

    }

}
