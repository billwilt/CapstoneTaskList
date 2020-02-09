

public class Task {
	
	private boolean taskCompleted = false;
	private String dueDate = "";
	private String teamMember = "";
	private String description = "";
	
	
	public Task() {
		this.taskCompleted = false;
	}
	
	public Task(boolean taskCompleted, String dueDate, String teamMember, String description) {
		super();
		this.taskCompleted = taskCompleted;
		this.dueDate = dueDate;
		this.teamMember = teamMember;
		this.description = description;
	}

	public boolean isTaskCompleted() {
		return taskCompleted;
	}

	public void setTaskCompleted(boolean taskCompleted) {
		this.taskCompleted = taskCompleted;
	}

	public String getDueDate() {
		return dueDate;
	}

	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}

	public String getTeamMember() {
		return teamMember;
	}

	public void setTeamMember(String teamMember) {
		this.teamMember = teamMember;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "\t" + taskCompleted + " \t" + dueDate + " \t" + teamMember
				+ " \t\t" + description + " ";
	}
	
	

}
