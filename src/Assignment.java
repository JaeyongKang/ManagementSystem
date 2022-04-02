
public class Assignment {
	

	String name;
	int date;
	String content;
	
	public Assignment() { //생성자 : class이름과 동일
		
	}
	
	public Assignment(String name, int date, String content) {
		this.name = name;
		this.date = date;
		this.content = content;
	}
	
	public void printInfo() { //static에 미리 올려 둘 필요가 없기 때문에 제외
		System.out.println("Assingment name : " + name + " Date of submission(Enter only the numbers) : " + date + " Content : " + content);
		
	}

}
