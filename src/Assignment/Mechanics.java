package Assignment;

import java.util.Scanner;

public class Mechanics extends Assignment implements AssignmentInput{
	
	
	public Mechanics(AssignmentKind kind) {
		super(kind);
	}

	public void getUserInput(Scanner input) {
		System.out.print("Assignment name:");
		String name = input.next();
		this.setName(name);
		
		char answer = 'x';
		while(answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N') {
			System.out.println("Is there a fixed deadline for submission of this assignment? (Y/N)");
			answer = input.next().charAt(0);
			if(answer == 'y' || answer == 'Y') {
				System.out.print("Date of submission(Enter only the numbers):");
				int date = input.nextInt();
				this.setDate(date);
				break;
			}
			else if(answer == 'n' || answer == 'N') {
				this.setDate(0);
				break;
			}
			else {
			}
		}

		
		System.out.print("Content:");
		String content = input.next();
		this.setContent(content);
	}
	
	public void printInfo() { //static에 미리 올려 둘 필요가 없기 때문에 제외
		String akind = "none";
		
		switch(this.kind) {
		case Mechanics :
			akind = "Mechanics";
			break;
		case Programming :
			akind = "Programming";
			break;
		case Etc :
			akind = "ETC.";
			break;
		default :
			
		}
		System.out.println("Kind : " + akind + "Assingment name : " + name + " Date of submission(Enter only the numbers) : " + date + " Content : " + content + " Source code Content : " + content);
		
	}
}
