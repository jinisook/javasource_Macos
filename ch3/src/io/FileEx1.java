package io;

import java.io.File;

// 파일에서 값 받기
public class FileEx1 {
    public static void main(String[] args) {
        // 경로 지정 : /(unix계열) or \(window)
        // \n, \t ==> 경로지정하는 것과 구별하기 위해서 \\
        // File file = new File("c:/temp/file1.txt");
        // File file = new File("c:\\temp","file1.txt");

        File parent = new File("c:\\temp");
        File file = new File(parent, "file1.txt");

        String name = file.getName();
        int pos = name.lastIndexOf(".");
        System.out.println("파일명 " + name); // file1.txt -> txt 확장자까지
        // 확장자를 제외한 이름 추출
        // String -> substring 사용 / 길이에 따라 달라지는 것은 lastIndexOf 사용
        System.out.println("확장자를 제외한 이름 " + name.substring(0, pos));
        System.out.println("확장자 " + name.substring(pos + 1));
        System.out.println("경로를 포함한 파일명 " + file.getPath());
        System.out.println("파일이 속해 있는 디렉토리 " + file.getParent());
        System.out.println("파일 pathSeparator " + File.pathSeparator);
        System.out.println("파일 pathSeparatorChar " + File.pathSeparatorChar);
        System.out.println("파일 separator " + File.separator); // /
        System.out.println("파일 separatorChar " + File.separatorChar); // /

    }

}
