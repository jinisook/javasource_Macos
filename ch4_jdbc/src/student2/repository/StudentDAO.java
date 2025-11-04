package student2.repository;

import static student2.repository.JDBCUtil.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import student2.dto.DeptDTO;
import student2.dto.StudentDTO;

public class StudentDAO {
    private Connection con;
    private PreparedStatement pstmt;
    private ResultSet rs;

    public StudentDAO(Connection con) {
        this.con = con;
    }

    // insert
    public int insert(StudentDTO sDto) {
        int result = 0;
        try {
            String sql = "INSERT INTO STUDENT(STUDENT_ID, NAME, HEIGHT, DEPT_ID) VALUES(?,?,?,?)";
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, sDto.getStudentId());
            pstmt.setString(2, sDto.getStudentName());
            pstmt.setDouble(3, sDto.getHeight());
            pstmt.setString(4, sDto.getDeptId());

            result = pstmt.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(pstmt);
        }
        return result;
    }

    // delete(student_id)
    public int delete(String studentId) {
        int result = 0;
        try {
            String sql = "DELETE FROM STUDENT WHERE STUDENT_ID = ?";
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, studentId);

            result = pstmt.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(pstmt);
        }
        return result;

    }

    // update : height 수정
    public int update(StudentDTO sDto) {
        int result = 0;
        try {
            // 누구만 바꿔줘 - PK 사용(STUDENT_ID)
            String sql = "UPDATE STUDENT SET HEIGHT = ? WHERE STUDENT_ID = ?";
            pstmt = con.prepareStatement(sql);
            pstmt.setDouble(1, sDto.getHeight());
            pstmt.setString(2, sDto.getStudentId());

            result = pstmt.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(pstmt);
        }
        return result;

    }

    // 학생전체조회(dept_id)
    public List<StudentDTO> getList(String deptId) {
        List<StudentDTO> list = new ArrayList<>();
        try {
            String sql = "SELECT * FROM STUDENT WHERE DEPT_ID = ?";
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, deptId);
            rs = pstmt.executeQuery();

            while (rs.next()) {
                StudentDTO sDto = new StudentDTO();
                sDto.setStudentId(rs.getString("STUDENT_ID"));
                sDto.setStudentName(rs.getString("NAME"));
                sDto.setHeight(rs.getDouble("HEIGHT"));
                sDto.setDeptId(rs.getString("DEPT_ID"));

                list.add(sDto);

            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(rs);
            close(pstmt);
        }
        return list;
    }

    // 특정 학생 조회(student_id)
    public StudentDTO getRow(String studentId) {
        StudentDTO sDto = null;
        try {
            String sql = "SELECT * FROM STUDENT WHERE STUDENT_ID = ?";
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, studentId);

            rs = pstmt.executeQuery();

            if (rs.next()) {
                sDto = new StudentDTO();
                sDto.setStudentId(rs.getString("STUDENT_ID"));
                sDto.setStudentName(rs.getString("NAME"));
                sDto.setHeight(rs.getDouble("HEIGHT"));
                sDto.setDeptId(rs.getString("DEPT_ID"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(rs);
            close(pstmt);
        }
        return sDto;
    }

}