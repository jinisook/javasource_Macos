package io;

import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class BufferedWriterEx1 {
    public static void main(String[] args) {
        // 키보드에서 입력을 받아서 파일에 출력하는 프로그램 작성
        // q 입력 시 입력받던 걸 중지

        Scanner sc = new Scanner(System.in);
        String input = "";
        System.out.println("파일에 작성할 데이터를 입력해 주세요");
        System.out.println("중지를 원하시면 q를 입력하세요");
        String content = null;
        do {
            System.out.print(">> ");
            input = sc.nextLine();
            content += input;
        } while (!input.equals("q"));

        try {
            FileWriter fw = new FileWriter("/Users/soo/Desktop/temp/user.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(content);

            bw.flush();
            bw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        sc.close();
    }

}
