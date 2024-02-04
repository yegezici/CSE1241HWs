//Yunus Emre Gezici 150121066
public class Payroll {
	private int workHour;
	private int itemCount;
	
	public int getWorkHour() {
		return workHour;
	}
	public void setWorkHour(int workHour) {
		this.workHour = workHour;
	}
	public int getItemCount() {
		return itemCount;
	}
	public void setItemCount(int itemCount) {
		this.itemCount = itemCount;
	}
	
	
	Payroll(int workHour, int itemCount){
		this.workHour = workHour;
		this.itemCount = itemCount;
	}
	int calculateSalary() {
		return workHour * 30 + itemCount * 20;	
	}
	 public String toString() {
		String str = "The work hour is " + workHour + "and the produced item count is"+ itemCount + ".";
		return str;
	}
}
