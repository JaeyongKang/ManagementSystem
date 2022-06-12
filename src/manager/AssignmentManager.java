package manager;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import Assignment.Assignment;
import Assignment.AssignmentInput;
import Assignment.AssignmentKind;
import Assignment.Etc;
import Assignment.Mechanics;
import Assignment.Programming;

public class AssignmentManager implements Serializable{
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 947879933961405537L;

	ArrayList<AssignmentInput> assignments = new ArrayList<AssignmentInput>();
	
	transient Scanner input; //transient : 저장하고 싶지 않다
	
	public AssignmentManager(Scanner input) {
		this.input = input; //이 input을 모든 method에서 사용 가능할 수 있게 해줌.
	}
	
	public AssignmentManager() {
		
	}

	public void viewAssignments() {
		for(int i = 0; i<assignments.size(); i++) {
			assignments.get(i).printInfo();
		}
		
	}
	
	public int size() {
		return assignments.size();
	}
	
	public AssignmentInput get(int index) {
		return (Assignment) assignments.get(index);
	}
	

	public void deleteAssignment() {
		System.out.print("Assignment name:");
		String assignmentName = input.next();
		int index = findIndex(assignmentName);
		removeFromAssignment(index, assignmentName);
	}
	
	public int findIndex(String assignmentName) {
		int index = -1;
		for(int i = 0; i<assignments.size(); i++) {
			if(assignments.get(i).getName().equals(assignmentName)) {
				index = i;
				break;
			}
		}
		return index;
	}
	
	public int removeFromAssignment(int index, String assignmentName) {
		if (index >= 0) {
			assignments.remove(index);
			System.out.println("The assignment " + assignmentName + " is deleted.");
			return 1;
		}
		else {
			System.out.println("The assignment has not been registered.");
			return -1;
		}
	}

	public void editAssignment() {
		System.out.print("Assignment name:");
		String assignmentName = input.next();
		for(int i = 0; i<assignments.size(); i++) {
			AssignmentInput assignment = assignments.get(i);
			if(assignment.getName().equals(assignmentName)) {
				int num = -1;
				while(num != 4) {
					showEditMenu();
					num = input.nextInt();
					switch(num) {
					case 1 :
						assignment.setAssignmentName(input);
						break;
					case 2 :
						assignment.setAssignmentDate(input);
						break;
					case 3 :
						assignment.setAssignmentContent(input);
						break;
					default :
						continue;
					}
				}
				break;
			}
		}
	}

	public void addAssignment(String txtName, String txtDate, String Content) {
		AssignmentInput assignmentInput = new Programming(AssignmentKind.Programming);
		assignmentInput.getUserInput(input);
		assignments.add(assignmentInput);
	}
	
	public void addAssignment(AssignmentInput assignmentInput) {
		assignments.add(assignmentInput);
	}
	
	public void addAssignment() {
		int kind = 0;
		AssignmentInput assignmentInput;
		while (kind < 1 || kind > 3) {
			try {
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
			catch(InputMismatchException e) {
				System.out.println("Please put an integer between 1 and 3 !");
				if(input.hasNext()) {
					input.next();
				}
				kind = -1;
			}
		}

	}
	
	
	public void showEditMenu() {
		System.out.println("** Assignment Info Edit Menu **");
		System.out.println("1. Edit Name");
		System.out.println("2. Edit Date");
		System.out.println("3. Edit Content");
		System.out.println("4. Exit");
		System.out.println("Select one number between 1-4 :");
	}

}
