package student2.ui;

import java.util.List;
import java.util.Scanner;

import student2.dto.DeptDTO;
import student2.dto.ProfessorDTO;
import student2.dto.StudentDTO;

public class ConsoleInfo {
    // 새 학생 정보 입력받기
    public StudentDTO inserStudent(Scanner sc) {
        System.out.print("아이디 입력 >> ");
        String studentId = sc.nextLine();
        System.out.print("이름 입력 >> ");
        String studentName = sc.nextLine();
        System.out.print("키 입력 >> ");
        Double height = Double.parseDouble(sc.nextLine());
        System.out.print("학과코드 입력 >> ");
        String deptId = sc.nextLine();

        return new StudentDTO(studentId, studentName, height, deptId);
    }

    public StudentDTO updateStudent(Scanner sc) {
        // 키 수정할 학생 아이디 받기
        System.out.println("== 수정할 학생 정보 ==");
        System.out.print("학생 아이디 >> ");
        String studentId = sc.nextLine();
        System.out.print("키 변경 >> ");
        Double height = Double.parseDouble(sc.nextLine());

        // (1) DTO에 가서 아이디, 키 생성자 생성 후 두 개만 받기
        // (2) 디폴트 밑에 처럼
        StudentDTO sDto = new StudentDTO();
        sDto.setStudentId(studentId);
        sDto.setHeight(height);

        return sDto;
    }

    public String deleteStudent(Scanner sc) {
        // 삭제할 학생 아이디 받기
        System.out.println("== 삭제할 학생 정보 ==");
        System.out.print("학생 아이디 >> ");
        String studentId = sc.nextLine();

        return studentId;
    }

    public String getDeptStudent(Scanner sc) {
        System.out.println("===== 학생 조회 =====");
        System.out.print("학과 번호 >> ");
        String deptId = sc.nextLine();
        return deptId;
    }

    public String getStudentIdStudent(Scanner sc) {
        System.out.println("===== 학생 조회 =====");
        System.out.print("학생 아이디 >> ");
        String studentId = sc.nextLine();
        return studentId;
    }

    public void printStudent(StudentDTO dto) {
        System.out.printf("%s\t%s\t%.2f\t%s",
                dto.getStudentId(), dto.getStudentName(), dto.getHeight(), dto.getDeptId());
    }

    public void printAllStudent(List<StudentDTO> list) {
        for (StudentDTO dto : list) {
            System.out.printf("%s\t%s\t%.2f\t%s\n",
                    dto.getStudentId(), dto.getStudentName(), dto.getHeight(), dto.getDeptId());

        }
    }

    // 새 교수 정보 입력받기
    public ProfessorDTO insertProfessor(Scanner sc) {

        System.out.print("아이디 입력 >> ");
        String profId = sc.nextLine();
        System.out.print("이름 입력 >> ");
        String profName = sc.nextLine();
        System.out.print("학과코드 입력 >> ");
        String deptId = sc.nextLine();

        return new ProfessorDTO(profId, profName, deptId);
    }

    public ProfessorDTO updateProfessor(Scanner sc) {
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

    public String deleteProfessor(Scanner sc) {
        // 삭제할 교수 아이디 받기
        System.out.println("== 삭제할 교수 정보 ==");
        System.out.print("교수 번호 >> ");
        String profId = sc.nextLine();

        return profId;
    }

    public String selectProfessor(Scanner sc) {
        // 특정교수 조회
        System.out.println("===== 교수 조회 =====");
        System.out.print("교수 번호 >> ");
        String profId = sc.nextLine();
        return profId;
    }

    public void printProfessor(ProfessorDTO dto) {
        System.out.println("교수번호 : " + dto.getProfId());
        System.out.println("교수명 : " + dto.getProfName());
        System.out.println("학과번호 : " + dto.getDeptId());
    }

    // 학과
    public String getDeptId(Scanner sc) {
        System.out.println("\n----- 학과 정보 입력 -----");
        System.out.print("학과번호 >> ");
        String deptId = sc.nextLine();

        return deptId;

    }

    public DeptDTO setDept(Scanner sc) {
        System.out.println("\n----- 학과 정보 입력 -----");

        // new 사용 방법에 따른 2가지 방법

        // System.out.println("학과 코드 >> ");
        // String deptId = sc.nextLine();
        // System.out.println("학과명 >> ");
        // String deptName = sc.nextLine();

        // return new DeptDTO(deptId, deptName);

        DeptDTO dto = new DeptDTO();
        System.out.print("학과 코드 >> ");
        dto.setDeptId(sc.nextLine());
        System.out.print("학과명 >> ");
        dto.setDeptName(sc.nextLine());

        return dto;
    }

    public String getDeptName(Scanner sc) {
        System.out.print("학과명 >> ");
        String deptName = sc.nextLine();
        return deptName;
    }

    public void print(DeptDTO deptDTO) {
        System.out.println("\n------- 학과 정보 --------");
        System.out.println("학과번호\t학과명");
        System.out.println("--------------------------");
        System.out.print(deptDTO.getDeptId() + "\t\t");
        System.out.println(deptDTO.getDeptName());

    }

    public void printAll(List<DeptDTO> list) {
        System.out.println("\n----- 전체 학과 정보 -----");
        System.out.println("학과번호\t학과명");
        System.out.println("--------------------------");
        for (DeptDTO deptDTO : list) {
            System.out.print(deptDTO.getDeptId() + "\t\t");
            System.out.println(deptDTO.getDeptName());
        }
    }
}
