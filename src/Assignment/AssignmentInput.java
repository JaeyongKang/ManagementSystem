package Assignment;

import java.util.Scanner;

import exception.NameFormatException;

public interface AssignmentInput{
	
	public void getUserInput(Scanner input);
	
	public void printInfo();
	
	public String getName();
	
	public void setName(String name) throws NameFormatException;
	
	public int getDate();
	
	public void setDate(int date);
	
	public String getContent();
	
	public void setContent(String content);
	
	public void setAssignmentName(Scanner Input);
	
	public void setAssignmentDate(Scanner Input);
	
	public void setAssignmentContent(Scanner Input);
	
	
	//Interface�� �Լ��� �̸��� �־� �����ν� ������ Ŭ�������� �� �Լ��� overriding�Ͽ� �� �� �ֵ��� �������.
	//getUserInput �̶�� �Լ��� ������ �ִ� ��� class�� implements AssignmentInput�� ����Ͽ� getUserInput �Լ��� ����� �� �ֵ��� �Ͽ���.
}
