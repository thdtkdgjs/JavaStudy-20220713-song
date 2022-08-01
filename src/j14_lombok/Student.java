package j14_lombok;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Builder
@NoArgsConstructor  // 기본생성자
@AllArgsConstructor // 전체생성자
//@Setter
//@Getter
//@EqualsAndHashCode
//@ToString
@Data // (Setter, Getter, Equals, HashCode, ToString) 묶어서
public class Student {
	private int studentCode;
	private String name;
	private int studentyear;
	private int age;

	
}
