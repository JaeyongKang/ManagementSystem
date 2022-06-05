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
	
	
	//Interface에 함수의 이름만 넣어 줌으로써 각각의 클래스에서 이 함수를 overriding하여 쓸 수 있도록 만들었다.
	//getUserInput 이라는 함수를 가지고 있는 모든 class에 implements AssignmentInput을 사용하여 getUserInput 함수를 사용할 수 있도록 하였다.
}
