package Assignment;

import java.util.Scanner;

public abstract class Assignment { 
	//abstract를 붙였다는 건 "더 이상 Assignment라는 객체를 생성하지 않는다"라는 것을 의미한다.

	protected AssignmentKind kind = AssignmentKind.Etc;
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
	
	
	public abstract void printInfo(); //static에 미리 올려 둘 필요가 없기 때문에 제외
	//Assignment를 상속받는 클래스에 printInfo함수를 모두 재정의 해주었기 때문에 abstract를 붙여줄 수 있다.

	
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
