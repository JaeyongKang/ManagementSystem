package Assignment;

import java.util.Scanner;

public class Mechanics extends Assignment {
	
	
	public Mechanics(AssignmentKind kind) {
		super(kind);
	}

	public void getUserInput(Scanner input) {
		setAssignmentName(input);
		setAssignmentDatewithYN(input);
		setAssignmentContent(input);
	}
	
	public void setAssignmentDatewithYN(Scanner input) {
		char answer = 'x';
		while(answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N') {
			System.out.println("Is there a fixed deadline for submission of this assignment? (Y/N)");
			answer = input.next().charAt(0);
			if(answer == 'y' || answer == 'Y') {
				setAssignmentDate(input);
				break;
			}
			else if(answer == 'n' || answer == 'N') {
				this.setDate(0);
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
