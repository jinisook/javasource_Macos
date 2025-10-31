package emp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Delete {
    public static void main(String[] args) {
        // db 서버 연결

        // 1. 드라이버 로드
        try {
            Class.forName("oracle.jdbc.OracleDriver");
            String url = "jdbc:oracle:thin:@localhost:1521:xe"; // 실제 설치된 주소 localhost 변화 유
            String user = "scott";
            String password = "tiger";

            // 2. DB 연결
            Connection con = DriverManager.getConnection(url, user, password);

            // 3. sql 구문 // 7499 삭제하기
            String sql = "delete from emp where empno = 7499";
            PreparedStatement pstmt = con.prepareStatement(sql);
            // ResultSet rs = pstmt.executeQuery(); -> select 구문에만 사용
            int result = pstmt.executeUpdate(); // delete 때 사용

            System.out.println(result > 0 ? "삭제 성공" : "삭제 실패"); // db에서 updated rows 1 값을 의미 = int로 받음

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
