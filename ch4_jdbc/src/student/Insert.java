package student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Insert {
    public static void main(String[] args) {
        Connection con = null;
        PreparedStatement pstmt = null;

        Scanner sc = new Scanner(System.in);

        try {
            Class.forName("oracle.jdbc.OracleDriver");
            String url = "jdbc:oracle:thin:@localhost:1521:xe"; // 실제 설치된 주소 localhost 변화 유
            String user = "javadb";
            String password = "12345";

            con = DriverManager.getConnection(url, user, password);
            // 입력할 학생아이디 입력받기
            System.out.print("아이디 입력 >> ");
            String studentId = sc.nextLine();
            System.out.print("이름 입력 >> ");
            String name = sc.nextLine();
            System.out.print("키 입력 >> ");
            double height = Double.parseDouble(sc.nextLine());
            System.out.print("학과코드 입력 >> ");
            String deptid = sc.nextLine();

            // insert 작업
            String sql = "INSERT INTO STUDENT(STUDENT_ID,NAME,HEIGHT,DEPT_ID) VALUES(?,?,?,?)";
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, studentId);
            pstmt.setString(2, name);
            pstmt.setDouble(3, height);
            pstmt.setString(4, deptid);
            int rows = pstmt.executeUpdate();

            System.out.println(rows > 0 ? "입력 성공" : "입력 실패");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                pstmt.close();
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }

}
