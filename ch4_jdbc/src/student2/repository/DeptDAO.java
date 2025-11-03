package student2.repository;

import static student2.repository.JDBCUtil.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import student2.dto.DeptDTO;

// ~~DAO(Data Access Object) : 데이터베이스 관련 작업
public class DeptDAO {
    // 멤버변수 선언(기본null값)
    private Connection con;
    private PreparedStatement pstmt;
    private ResultSet rs;

    // static 블록
    // static {
    // try {
    // Class.forName("oracle.jdbc.OracleDriver");
    // } catch (ClassNotFoundException e) {
    // e.printStackTrace();
    // }
    // }

    // // 데이터베이스와 연결하는 메소드
    // public Connection getConnection() throws SQLException {
    // String url = "jdbc:oracle:thin:@localhost:1521:xe"; // 실제 설치된 주소 localhost 변화
    // 존재
    // String user = "javadb";
    // String password = "12345";

    // con = DriverManager.getConnection(url, user, password);
    // return con;
    // }

    // 생성자
    public DeptDAO(Connection con) {
        this.con = con;
    }

    public int insert(DeptDTO dto) {
        int result = 0;
        try {
            String sql = "INSERT INTO DEPARTMENT(dept_id, dept_name) VALUES(?,?)";
            pstmt = con.prepareStatement(sql);
            // ? 해결
            pstmt.setString(1, dto.getDeptId());
            pstmt.setString(2, dto.getDeptName());
            result = pstmt.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(pstmt);
        }
        return result;
    }

    public int delete(String deptId) {
        int result = 0;
        try {

            String sql = "DELETE FROM DEPARTMENT WHERE DEPT_ID =?";
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, deptId);
            result = pstmt.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(pstmt);
        }
        return result;
    }

    public int update(DeptDTO dto) {
        int result = 0;
        try {

            String sql = "UPDATE DEPARTMENT SET DEPT_NAME = ? WHERE DEPT_ID = ?";
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, dto.getDeptName());
            pstmt.setString(2, dto.getDeptId());
            result = pstmt.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(pstmt);
        }
        return result;
    }

    // 조회 결과가 하나만 나오는 경우
    // 특정 학과만 조회
    public DeptDTO getRow(String deptName) {
        DeptDTO deptDTO = null;
        try {

            String sql = "SELECT * FROM DEPARTMENT WHERE DEPT_NAME = ?";
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, deptName);
            rs = pstmt.executeQuery();

            while (rs.next()) {
                String deptId = rs.getString("DEPT_ID");
                deptName = rs.getString("DEPT_NAME");
                deptDTO = new DeptDTO(deptId, deptName);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(rs);
            close(pstmt);
        }
        return deptDTO;
    }

    // 조회 결과가 여러 개 나오는 경우
    // 전체 학과 조회 메소드
    public List<DeptDTO> getRows() {
        List<DeptDTO> list = new ArrayList<>();
        try {

            String sql = "SELECT * FROM DEPARTMENT";
            pstmt = con.prepareStatement(sql);
            rs = pstmt.executeQuery();

            while (rs.next()) {
                String deptId = rs.getString("DEPT_ID");
                String deptName = rs.getString("DEPT_NAME");

                // DeptDTO deptDTO = new DeptDTO(deptId, deptName);
                // list.add(deptDTO);
                // 위 내용 간단 버전
                list.add(new DeptDTO(deptId, deptName));
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(rs);
            close(pstmt);
        }
        return list;
    }

}
