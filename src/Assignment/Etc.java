package Assignment;

import java.io.Serializable;
import java.util.Scanner;

public class Etc extends Assignment implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5190961303332494072L;
	
	public Etc() {
		
	}

	public Etc(AssignmentKind kind) {
		super(kind);
	}

	public void getUserInput(Scanner input) {
		setAssignmentName(input);
		setAssignmentDate(input);
		setAssignmentContent(input);
		
	}
	
	public void printInfo() { //static에 미리 올려 둘 필요가 없기 때문에 제외
		String akind = getKindString();
		System.out.println("Kind : " + akind + "Assingment name : " + name + " Date of submission(Enter only the numbers) : " + date + " Content : " + content + " Source code Content : " + content);
		
	}
}
