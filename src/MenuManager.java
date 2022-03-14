import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		int num = 0 ;
		
		Scanner input = new Scanner(System.in);
		
		while (num != 6) {
			System.out.println("1. Add Assignment");
			System.out.println("2. Edit Assignment");
			System.out.println("3. Delete Assignment");
			System.out.println("4. View Assignment");
			System.out.println("5. Show a menu");
			System.out.println("6. Exit");
			System.out.println("Select one number between 1-5");
			
			num = input.nextInt();
			
			if (num == 1) {
				addAssignment();
			}
			else if (num==2) {
				editAssignment();
			}
			else if (num==3) {
				deleteAssignment();
			}
			else if (num==4) {
				viewAssignment();
			}
			else {
				continue;
			}
		}
		
	}

	public static void viewAssignment() {
		Scanner input = new Scanner(System.in);
		System.out.print("Assignment name:");
		String assignmentName = input.next();
		
	}

	public static void deleteAssignment() {
		Scanner input = new Scanner(System.in);
		System.out.print("Assignment name:");
		String assignmentName = input.next();
		
	}

	public static void editAssignment() {
		Scanner input = new Scanner(System.in);
		System.out.print("Assignment name:");
		String assignmentName = input.next();
		
	}

	public static void addAssignment() {
		Scanner input = new Scanner(System.in);
		System.out.print("Assignment name:");
		String assignmentName = input.next();
		System.out.print("Date of submission(Enter only the numbers):");
		int date = input.nextInt();
		System.out.print("Content:");
		String content = input.next();
		}
	}
		
		
      



