package Assignment;

import java.util.Scanner;

public class Assignment {

	protected AssignmentKind kind = AssignmentKind.Programming;
	protected String name;
	protected int date;
	protected String content;
	
	public AssignmentKind getKind() {
		return kind;
	}

	public void setKind(AssignmentKind kind) {
		this.kind = kind;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	
	public Assignment() { //생성자 : class이름과 동일
		
	}
	
	public Assignment(AssignmentKind kind) {
		this.kind = kind;
	}
	
	public Assignment(AssignmentKind kind, String name, int date, String content) {
		this.kind = kind;
		this.name = name;
		this.date = date;
		this.content = content;
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
		System.out.println("Kind : " + akind + "Assingment name : " + name + " Date of submission(Enter only the numbers) : " + date + " Content : " + content);
		
	}
	
	public void getUserInput(Scanner input) {
		System.out.print("Assignment name:");
		String name = input.next();
		this.setName(name);
		
		System.out.print("Date of submission(Enter only the numbers):");
		int date = input.nextInt();
		this.setDate(date);
		
		System.out.print("Content:");
		String content = input.next();
		this.setContent(content);
	}

}
