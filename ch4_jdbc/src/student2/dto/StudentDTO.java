package student2.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class StudentDTO {
    // 테이블 모양과 동일하게 -학번(student_id), 이름(name), 키(height)
    private String studentId;
    private String studentName;
    private double height;
    private String deptId;

}
