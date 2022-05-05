package Assignment;

import java.util.Scanner;

public abstract class Assignment { 
	//abstract�� �ٿ��ٴ� �� "�� �̻� Assignment��� ��ü�� �������� �ʴ´�"��� ���� �ǹ��Ѵ�.

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

	
	public Assignment() { //������ : class�̸��� ����
		
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
	
	
	public abstract void printInfo(); //static�� �̸� �÷� �� �ʿ䰡 ���� ������ ����
	//Assignment�� ��ӹ޴� Ŭ������ printInfo�Լ��� ��� ������ ���־��� ������ abstract�� �ٿ��� �� �ִ�.

	
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
