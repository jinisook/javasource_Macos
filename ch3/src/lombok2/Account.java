package lombok2;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString; // lombok.jar

@EqualsAndHashCode // set
@AllArgsConstructor // 전체 멤버변수 이용한 생성자
@NoArgsConstructor // 기본생성자
@Setter
@Getter
@ToString // toString 기본형
@Builder
public class Account {
    private String name;
    private String accNo;
    private int balance;

    // 생성자, getter, setter, toString() => 어노테이션 처리 : lombok
    // equals, hasCode
    // Builder

}
