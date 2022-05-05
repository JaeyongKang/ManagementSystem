import java.util.ArrayList;
import java.util.Scanner;

import Assignment.Assignment;
import Assignment.AssignmentInput;
import Assignment.AssignmentKind;
import Assignment.Etc;
import Assignment.Mechanics;
import Assignment.Programming;

public class AssignmentManager {
	
	ArrayList<AssignmentInput> assignments = new ArrayList<AssignmentInput>();
	
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
			AssignmentInput assignmentInput = assignments.get(i);
			if(assignmentInput.getName().equals(assignmentName)) {
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
						assignmentInput.setName(name);
					}
					else if(num == 2) {
						System.out.print("Date of submission(Enter only the numbers):");
						int date = input.nextInt();
						assignmentInput.setDate(date);
					}
					else if(num == 3) {
						System.out.print("Content:");
						String content = input.next();
						assignmentInput.setContent(content);
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
		AssignmentInput assignmentInput;
		while (kind != 1 && kind != 2 && kind != 3) {
			System.out.println("1 for Programming");
			System.out.println("2 for Mechanics");
			System.out.println("3 for ETC.");
			System.out.println("Select num 1,2 or 3 for Assignment Kind : ");
			kind = input.nextInt();
			if (kind == 3) {
				assignmentInput = new Etc(AssignmentKind.Etc);
				assignmentInput.getUserInput(input);
				assignments.add(assignmentInput);
				break;
			}
			else if(kind ==2) {
				assignmentInput = new Mechanics(AssignmentKind.Mechanics);
				assignmentInput.getUserInput(input);
				assignments.add(assignmentInput);
				break;
			}
			else if(kind == 1) {
				assignmentInput = new Programming(AssignmentKind.Programming);
				assignmentInput.getUserInput(input);
				assignments.add(assignmentInput);
			}
			else {
				System.out.println("Select num 1,2 or 3 for Assignment Kind : ");
			}
		}
		
		}

}
