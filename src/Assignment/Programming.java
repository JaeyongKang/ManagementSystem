package Assignment;

import java.io.Serializable;
import java.util.Scanner;

public class Programming extends Assignment implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3544805385976466997L;
	protected String programmingContent; //역학, 기타 과목의 과제와 달리 프로그래밍 과제에는 포함되는 소스코드의 큰 주제를 content라고 가정
	
	public Programming(AssignmentKind kind) {
		super(kind);
	}
	
	public Programming() {
		
	}
	
	public void getUserInput(Scanner input) {
		setAssignmentName(input);
		setAssignmentDate(input);
		setAssignmentSourceCodewithYN(input);
	}
	
	public void setAssignmentSourceCodewithYN(Scanner input) {
		
		char answer = 'x';
		while(answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N') {
			System.out.println("Do you have the source code content? (Y/N)");
			answer = input.next().charAt(0);
			if(answer == 'y' || answer == 'Y') {
				System.out.print("Implementation of the source code :");
				String content = input.next();
				this.setContent(content);
				break;
			}
			else if(answer == 'n' || answer == 'N') {
				this.setContent("NULL");
				break;
			}
			else {
			}
		}
	}
	
	public void printInfo() { //static에 미리 올려 둘 필요가 없기 때문에 제외
		String akind = getKindString();
		System.out.println("Kind : " + akind + "Assingment name : " + name + " Date of submission(Enter only the numbers) : " + date + " Content : " + content + " Source code Content : " + content);

	}
}
