import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		int num = -1 ;

		Scanner input = new Scanner(System.in);
		
		AssignmentManager assignmentManager = new AssignmentManager(input);

		while (num != 5) {
			System.out.println("*** Assignment Management System Menu ***");
			System.out.println("1. Add Assignment");
			System.out.println("2. Edit Assignment");
			System.out.println("3. Delete Assignment");
			System.out.println("4. View Assignment");
			System.out.println("5. Exit");
			System.out.println("Select one number between 1-5 :");

			num = input.nextInt();

			if (num == 1) {
				assignmentManager.addAssignment();
			}
			else if (num==2) {
				assignmentManager.editAssignment();
			}
			else if (num==3) {
				assignmentManager.deleteAssignment();
			}
			else if (num==4) {
				assignmentManager.viewAssignment();
			}
			else {
				continue;
			}
		}

	}

}






