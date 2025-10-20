package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

// java 파일로 txt를 읽을 수 있음
public class BufferedReaderEx1 {
    public static void main(String[] args) {
        try {
            // InputStream in = new FileInputStream("/Users/soo/Desktop/temp/file1.txt");
            // InputStreamReader reader = new InputStreamReader(in, "utf8");
            // BufferedReader br = new BufferedReader(reader);

            BufferedReader br = new BufferedReader(
                    new InputStreamReader(new FileInputStream("/Users/soo/Desktop/temp/file1.txt"), "utf8"));

            // Writer out = new FileWriter("/Users/soo/Desktop/temp/output2.txt"); // 파일 생성
            // BufferedWriter bw = new BufferedWriter(out);

            BufferedWriter bw = new BufferedWriter(new FileWriter("/Users/soo/Desktop/temp/output2.txt"));

            // int input = in.read(); // 한 바이트만 읽게 됨
            String input = null;
            while ((input = br.readLine()) != null) { // 줄단위
                // cbuf => String
                bw.write(input); // 한줄로 나옴
                bw.newLine(); // enter

            }

            // in.close();
            bw.flush(); // 버퍼 비우기
            bw.close();
            // out.close();
        } catch (IOException e) { // - IO가 부모라서 FileNotFoundException, IOException 둘다 처리 가능
            e.printStackTrace();
        }

    }

}
