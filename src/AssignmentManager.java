import java.util.Scanner;

public class AssignmentManager {
	
	Assignment assignment;
	
	Scanner input;
	
	public AssignmentManager(Scanner input) {
		this.input = input; //이 input을 모든 method에서 사용 가능할 수 있게 해줌.
	}

	public void viewAssignment() {
		System.out.print("Assignment name:");
		String assignmentName = input.next(); //String 비교형은 ==이 아닌 .equals(str)을 써야 한다.
		if(assignment.name.equals(assignmentName)) {
			assignment.printInfo();
		}
		
	}

	public void deleteAssignment() {
		System.out.print("Assignment name:");
		String assignmentName = input.next();
		if(assignment == null) {
			System.out.println("The assignment has not been registered.");
			return;
		}
		if(assignment.name.equals(assignmentName)) {
			assignment = null;
			System.out.println("The assignment is deleted.");
		}
		
	}

	public void editAssignment() {
		System.out.print("Assignment name:");
		String assignmentName = input.next();
		if(assignment.name.equals(assignmentName)) {
			System.out.println("The assignment to be edited is " + assignmentName);
		}
	}

	public void addAssignment() {
		assignment = new Assignment();
		System.out.print("Assignment name:");
		assignment.name = input.next();
		System.out.print("Date of submission(Enter only the numbers):");
		assignment.date = input.nextInt();
		System.out.print("Content:");
		assignment.content = input.next();
		}

}
