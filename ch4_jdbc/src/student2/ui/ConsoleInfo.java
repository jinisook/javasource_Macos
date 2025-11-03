package student2.ui;

import java.util.List;
import java.util.Scanner;

import student2.dto.DeptDTO;

public class ConsoleInfo {

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
