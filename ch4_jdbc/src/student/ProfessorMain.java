package student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class ProfessorMain {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            Class.forName("oracle.jdbc.OracleDriver");
            String url = "jdbc:oracle:thin:@localhost:1521:xe"; // 실제 설치된 주소 localhost 변화 유
            String user = "javadb";
            String password = "12345";
            con = DriverManager.getConnection(url, user, password);

            boolean run = true;
            while (run) {
                System.out.println("=====================");
                System.out.println("1. 교수정보 입력");
                System.out.println("2. 교수정보 수정");
                System.out.println("3. 교수정보 삭제");
                System.out.println("4. 교수정보 조회");
                System.out.println("5. 프로그램 종료");
                System.out.println("=====================");
                System.out.print("선택 >> ");

                int menu = Integer.parseInt(sc.nextLine());
                switch (menu) {
                    case 1:
                        ProfessorDTO professorDTO = insert();

                        String sql = "INSERT INTO PROFESSOR(PROF_ID,PROF_NAME,DEPT_ID) VALUES(?,?,?)";
                        pstmt = con.prepareStatement(sql);
                        pstmt.setString(1, professorDTO.getProfId());
                        pstmt.setString(2, professorDTO.getProfName());
                        pstmt.setString(3, professorDTO.getDeptId());

                        int rows = pstmt.executeUpdate();

                        System.out.println(rows > 0 ? "입력성공" : "입력실패");

                        break;
                    case 2:
                        professorDTO = update();

                        sql = "UPDATE PROFESSOR SET DEPT_ID = ? WHERE PROF_ID = ?";
                        pstmt = con.prepareStatement(sql);
                        pstmt.setString(1, professorDTO.getDeptId());
                        pstmt.setString(2, professorDTO.getProfId());
                        rows = pstmt.executeUpdate();

                        System.out.println(rows > 0 ? "수정성공" : "수정실패");

                        break;
                    case 3:
                        String profId = delete();

                        sql = "DELETE FROM PROFESSOR WHERE PROF_ID = ?";
                        pstmt = con.prepareStatement(sql);
                        pstmt.setString(1, profId);
                        rows = pstmt.executeUpdate();
                        System.out.println(rows > 0 ? "식제성공" : "삭제실패");

                        break;
                    case 4:
                        profId = select();

                        sql = "SELECT * FROM PROFESSOR WHERE PROF_ID = ?";
                        pstmt = con.prepareStatement(sql);
                        pstmt.setString(1, profId);
                        rs = pstmt.executeQuery();

                        while (rs.next()) {
                            System.out.println("교수번호 : " + rs.getString("prof_id"));
                            System.out.println("교수명 : " + rs.getString("prof_name"));
                            System.out.println("학과번호 : " + rs.getString("dept_id"));
                        }

                        break;
                    case 5:
                        run = false;
                        break;

                    default:
                        break;
                }

            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                sc.close();
                rs.close();
                pstmt.close();
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static ProfessorDTO insert() {

        System.out.print("아이디 입력 >> ");
        String profId = sc.nextLine();
        System.out.print("이름 입력 >> ");
        String profName = sc.nextLine();
        System.out.print("학과코드 입력 >> ");
        String deptId = sc.nextLine();

        return new ProfessorDTO(profId, profName, deptId);
    }

    public static ProfessorDTO update() {
        // 수정할 교수 아이디 받기
        System.out.println("== 수정할 교수 정보 ==");
        System.out.print("교수 번호 >> ");
        String profId = sc.nextLine();
        System.out.print("변경 학과 코드 >> ");
        String deptId = sc.nextLine();

        ProfessorDTO professorDTO = new ProfessorDTO();
        professorDTO.setProfId(profId);
        professorDTO.setDeptId(deptId);

        return professorDTO;
    }

    public static String delete() {
        // 삭제할 교수 아이디 받기
        System.out.println("== 삭제할 교수 정보 ==");
        System.out.print("교수 번호 >> ");
        String profId = sc.nextLine();

        return profId;
    }

    public static String select() {
        // 특정교수 조회
        System.out.println("===== 교수 조회 =====");
        System.out.print("교수 번호 >> ");
        String profId = sc.nextLine();
        return profId;
    }

}
