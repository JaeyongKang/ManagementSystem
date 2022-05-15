import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		AssignmentManager assignmentManager = new AssignmentManager(input);
		selectMenu(input, assignmentManager);
	}
	
	public static void selectMenu(Scanner input, AssignmentManager assignmentManager) {
		int num = -1;
		while (num != 5) {
			try {
				showMenu();
				num = input.nextInt();
				switch(num) {
				case 1 : 
					assignmentManager.addAssignment();
					break;
				case 2 :
					assignmentManager.editAssignment();
					break;
				case 3 :
					assignmentManager.deleteAssignment();
					break;
				case 4 :
					assignmentManager.viewAssignments();
					break;
				default : 
					continue;
				}
			}
			catch(InputMismatchException e){
				System.out.println("Please put an integer between 1 and 5 !");
				if(input.hasNext()) {
					input.next();
				}
				num = -1;
			}
		}
	}
	
	public static void showMenu() {
		System.out.println("*** Assignment Management System Menu ***");
		System.out.println("1. Add Assignment");
		System.out.println("2. Edit Assignment");
		System.out.println("3. Delete Assignment");
		System.out.println("4. View Assignments");
		System.out.println("5. Exit");
		System.out.println("Select one number between 1-5 :");
	}

}






