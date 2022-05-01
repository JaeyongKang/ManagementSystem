import java.util.ArrayList;
import java.util.Scanner;

import Assignment.Assignment;
import Assignment.AssignmentKind;
import Assignment.Mechanics;
import Assignment.Programming;

public class AssignmentManager {
	
	ArrayList<Assignment> assignments = new ArrayList<Assignment>();
	
	Scanner input;
	
	public AssignmentManager(Scanner input) {
		this.input = input; //이 input을 모든 method에서 사용 가능할 수 있게 해줌.
	}

	public void viewAssignments() {
//		System.out.print("Assignment name:");
//		String assignmentName = input.next(); //String 비교형은 ==이 아닌 .equals(str)을 써야 한다.
		for(int i = 0; i<assignments.size(); i++) {
			assignments.get(i).printInfo();
		}
		
	}

	public void deleteAssignment() {
		System.out.print("Assignment name:");
		String assignmentName = input.next();
		int index = -1;
		for(int i = 0; i<assignments.size(); i++) {
			if(assignments.get(i).getName().equals(assignmentName)) {
				index = i;
				break;
			}
		}
		
		if (index >= 0) {
			assignments.remove(index);
			System.out.println("The assignment " + assignmentName + " is deleted.");
		}
		
		else {
			System.out.println("The assignment has not been registered.");
			return;
		}

		
	}

	public void editAssignment() {
		System.out.print("Assignment name:");
		String assignmentName = input.next();
		for(int i = 0; i<assignments.size(); i++) {
			Assignment assignment = assignments.get(i);
			if(assignment.getName().equals(assignmentName)) {
				int num = -1;
				while(num != 4) {
					System.out.println("** Assignment Info Edit Menu **");
					System.out.println("1. Edit Name");
					System.out.println("2. Edit Date");
					System.out.println("3. Edit Content");
					System.out.println("4. Exit");
					System.out.println("Select one number between 1-4 :");
					
					num = input.nextInt();
					if (num==1) {
						System.out.print("Assignment Name : ");
						String name = input.next();
						assignment.setName(name);
					}
					else if(num == 2) {
						System.out.print("Date of submission(Enter only the numbers):");
						int date = input.nextInt();
						assignment.setDate(date);
					}
					else if(num == 3) {
						System.out.print("Content:");
						String content = input.next();
						assignment.setContent(content);
					}
					else {
						continue;
					}

				}
				break; //if문
			}
		}
	}

	public void addAssignment() {
		int kind = 0;
		Assignment assignment;
		while (kind != 1 && kind != 2 && kind != 3) {
			System.out.println("1 for Programming");
			System.out.println("2 for Mechanics");
			System.out.println("3 for ETC.");
			System.out.println("Select num 1,2 or 3 for Assignment Kind : ");
			kind = input.nextInt();
			if (kind == 3) {
				assignment = new Assignment(AssignmentKind.Etc);
				assignment.getUserInput(input);
				assignments.add(assignment);
				break;
			}
			else if(kind ==2) {
				assignment = new Mechanics(AssignmentKind.Mechanics);
				assignment.getUserInput(input);
				assignments.add(assignment);
				break;
			}
			else if(kind == 1) {
				assignment = new Programming(AssignmentKind.Programming);
				assignment.getUserInput(input);
				assignments.add(assignment);
			}
			else {
				System.out.println("Select num 1,2 or 3 for Assignment Kind : ");
			}
		}
		
		}

}
