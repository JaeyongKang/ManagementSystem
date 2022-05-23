import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.InputMismatchException;
import java.util.Scanner;

import log.EventLogger;

public class MenuManager implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 652802711869284692L;
	static EventLogger logger = new EventLogger("log.txt");
	//static을 해 줘야 실행이 됨
	//긱 메뉴 선택을 하는 파트에 있어서도 이벤트를 일으켜 로그 파일에 정보를 저장
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		AssignmentManager assignmentManager = getObject("assignmentmanager.ser");
		if (assignmentManager == null) {
			assignmentManager = new AssignmentManager(input);
			//null값일 경우 생성자를 만들어서 값을 저장하도록 만듬
		}
		selectMenu(input, assignmentManager);
		putObject(assignmentManager, "assignmentmanager.ser");
	}
	
	public MenuManager() {
		
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
					logger.log("Add an assignment.");
					break;
				case 2 :
					assignmentManager.editAssignment();
					logger.log("Edit an assignment.");
					break;
				case 3 :
					assignmentManager.deleteAssignment();
					logger.log("Delete an assignment.");
					break;
				case 4 :
					assignmentManager.viewAssignments();
					logger.log("View an assignment.");
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
	
	public static AssignmentManager getObject(String fileName) {
		//deserialize
		AssignmentManager assignmentManager = null;
		
		try {
			FileInputStream file = new FileInputStream(fileName);
			ObjectInputStream in = new ObjectInputStream(file);
			
			assignmentManager = (AssignmentManager)in.readObject();
			in.close();
			file.close();
		} catch (FileNotFoundException e) {
			return assignmentManager;
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return assignmentManager;
	}
	
	public static void putObject(AssignmentManager assignmentManager, String fileName) {
		//serialize
		try {
			FileOutputStream file = new FileOutputStream(fileName);
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			out.writeObject(assignmentManager);
			out.close();
			file.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}





