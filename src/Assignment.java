
public class Assignment {
	

	String name;
	int date;
	String content;
	
	public Assignment() { //������ : class�̸��� ����
		
	}
	
	public Assignment(String name, int date, String content) {
		this.name = name;
		this.date = date;
		this.content = content;
	}
	
	public void printInfo() { //static�� �̸� �÷� �� �ʿ䰡 ���� ������ ����
		System.out.println("Assingment name : " + name + " Date of submission(Enter only the numbers) : " + date + " Content : " + content);
		
	}

}
