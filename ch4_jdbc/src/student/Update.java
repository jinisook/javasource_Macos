package student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Update {
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
            // 수정할 학생아이디 입력받기
            System.out.print("아이디 입력 >> ");
            String studentId = sc.nextLine();
            System.out.print("키 입력 >> ");
            Double height = Double.parseDouble(sc.nextLine());

            String sql = "update student set height = ? where student_id = ?";
            pstmt = con.prepareStatement(sql);
            pstmt.setDouble(1, height);
            pstmt.setString(2, studentId);
            int rows = pstmt.executeUpdate();
            System.out.println(rows > 0 ? "수정 성공" : "수정 실패");

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
