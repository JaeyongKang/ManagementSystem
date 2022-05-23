package Assignment;

import java.io.Serializable;
import java.util.Scanner;

public class Programming extends Assignment implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3544805385976466997L;
	protected String programmingContent; //����, ��Ÿ ������ ������ �޸� ���α׷��� �������� ���ԵǴ� �ҽ��ڵ��� ū ������ content��� ����
	
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
	
	public void printInfo() { //static�� �̸� �÷� �� �ʿ䰡 ���� ������ ����
		String akind = getKindString();
		System.out.println("Kind : " + akind + "Assingment name : " + name + " Date of submission(Enter only the numbers) : " + date + " Content : " + content + " Source code Content : " + content);

	}
}
