import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class CapstoneTaskListApp {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		boolean taskCompleted = true;
		boolean wantToContinue = true;
		int i=0;
		
		LinkedList <Task> taskList = new LinkedList<>();

	
		
		Task t1 = new Task(false, "02/10/20", "Bill", "Wash the salt off the truck");
		taskList.add(t1);
		
	while  (wantToContinue == true) {
		System.out.println("\nWelcome to the Task Manager!\n");
		
		System.out.println("   1. List tasks");
		System.out.println("   2. Add task");
		System.out.println("   3. Delete task");
		System.out.println("   4. Mark task complete");
		System.out.println("   5. Quit\n");
		
	
		System.out.print("\nWhat would you like to do? ");
		int usersChoice = keyboard.nextInt();
		
		switch(usersChoice) {
		  case 1:
			  System.out.println("\n#\tDONE?\tDUE DATE\tTEAM MEMBER\tDESCRIPTION");
				System.out.println("--\t------\t--------\t-----------\t---------------------------------------------");

				// Print taskList
				i=0;
				for(Object obj : taskList) {
					  System.out.println((i=i+1) + " " + obj);
					}
				
				wantToContinue = true;
		    break;
		  case 2:
			  keyboard.nextLine(); // Clear Keyboard
			  System.out.println("\nADD TASK\n");
			  System.out.println("Enter Team Member Name: ");
			  String enterTeamMember = keyboard.nextLine();
			  
			  System.out.println("Enter Task Description: ");
			  String enterTaskDescription = keyboard.nextLine();
			  
			  System.out.println("Enter Due Date (mm/dd/yy): ");
			  String enterDueDate = keyboard.nextLine();
			  
			  Task t2 = new Task(false, enterDueDate, enterTeamMember, enterTaskDescription);
				taskList.add(t2);
			  wantToContinue = true;
			  
		    break;
		  case 3:
			  System.out.println("\n#\tDONE?\tDUE DATE\tTEAM MEMBER\tDESCRIPTION");
				System.out.println("--\t------\t--------\t-----------\t---------------------------------------------");
			  i=0; // Reset Count
				for(Object obj : taskList) {
				  System.out.println((i=i+1) + " " + obj);
				}
			System.out.print("\nWhich task number would you like to delete? ");
			int deleteTask = keyboard.nextInt();
			
			taskList.remove(deleteTask-1);
			
			System.out.println("\n#\tDONE?\tDUE DATE\tTEAM MEMBER\tDESCRIPTION");
			System.out.println("--\t------\t--------\t-----------\t---------------------------------------------");
			i=0;  // Reset count
			for(Object obj : taskList) {
			  System.out.println((i=i+1) + " " + obj);
			}
			break;
		  case 4:
			  System.out.println("\n#\tDONE?\tDUE DATE\tTEAM MEMBER\tDESCRIPTION");
				System.out.println("--\t------\t--------\t-----------\t---------------------------------------------");
				i=0;  // Reset count
				for(Object obj : taskList) {
				  System.out.println((i=i+1) + " " + obj);
				}
				System.out.print("\nWhich task number would you like to mark as completed? ");
				int completedTask = keyboard.nextInt();
			  
				taskList.set(1);
				//taskList.set((completedTask-1), taskCompleted = true);
				
			  
			 break;
		  case 5:
			  wantToContinue = false;
			//break;
		  default:
		    // code block
		} 
	}
	System.out.println("Goodbye.");
		
		
		
		
		
		
		
		
		
		
		
		
		
		keyboard.close();
	}

}
