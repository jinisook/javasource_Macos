package student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Delete {
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
            // 삭제할 학생아이디 입력받기
            System.out.print("아이디 입력 >> ");
            String studentId = sc.nextLine();

            // 부모키 삭제 후 자식삭제
            // 부모삭제
            String sql = "delete from enrollment where student_id = ?";
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, studentId);
            int rows = pstmt.executeUpdate();

            // 자식삭제
            sql = "delete from student where student_id = ?";
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, studentId);
            rows = pstmt.executeUpdate();

            System.out.println(rows > 0 ? "삭제 성공" : "삭제 실패");

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
