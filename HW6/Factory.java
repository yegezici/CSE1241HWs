//Yunus Emre Gezici 150121066
public class Factory {
	private String name;

	public Employee[] getEmployees() {
		return employees;
	}

	public void setEmployees(Employee[] employees) {
		this.employees = employees;
	}

	private Employee[] employees;
	private Storage storage;
	private Payroll[] payrolls;
	private double itemPrice;

	Factory(String name, int capacity, double itemPrice) {
		this.name = name;
		storage = new Storage(capacity);

		this.itemPrice = itemPrice;
	}

	double getRevenue() {
		int n = 0;
		if (employees == null) {
		} else {
			if (storage.getItems() == null) {

			} else
				n = storage.getItems().length;
		}
		return n * itemPrice;
	}

	double getPaidSalaries() {
		int total = 0;
		if (employees == null) {
		} else {
			payrolls = new Payroll[employees.length];
			for (int i = 0; i < employees.length; i++) {
				total += payrolls[i].calculateSalary();
			}
		}
		return total;
	}

	void addEmployee(Employee employee) {
		Employee[] temp = null;
		if (employees == null) {
		} else {
			temp = new Employee[employees.length];
			for (int i = 0; i < employees.length; i++) {
				temp[i] = employees[i];
			}
		}
		boolean a = false;
		if (employees == null) {
			a = false;
		} else {
			a = true;
		}
		if (!a) {
			employees = new Employee[1];
			employees[0] = employee;
		} else {
			employees = new Employee[employees.length + 1];
			for (int i = 0; i < employees.length - 1; i++) {
				employees[i] = temp[i];
			}
			employees[employees.length - 1] = employee;
		}

		storage.setItems(employee.startShift());

	}

	void removeEmployee(int id) {
		Employee[] temp = null;
		int a = 0;
		Employee oldEmployee = null;

		if (employees == null) {
			a = 0;
		} else {
			a++;
		}
		if (a == 0) {
			System.out.println("There are no employees! ");
		} else {
			for (int i = 0; i < employees.length; i++) {
				if (employees[i] != null) {
					if (id != employees[i].getId())
						System.out.println("Employee does not exist! ");
					if (id == employees[i].getId()) {
						Employee temp1 = employees[i];
						employees[i] = employees[employees.length - 1];
						employees[employees.length - 1] = employees[i];
						employees[i] = null;
						temp = employees;
					}
				}
			}
			if (employees == null || employees.length == 0) {
			} else {
				employees = new Employee[employees.length - 1];
			}
		}
		if (employees == null) {
		} else {
			for (int i = 0; i < employees.length; i++) {
				employees[i] = temp[i];
			}
		}
		if (oldEmployee != null)
			addPayroll(oldEmployee.endShift());
	}

	void addPayroll(Payroll payroll) {
		Payroll[] temp = payrolls;

		int a = 0;
		if (payrolls == null) {

		} else {
			a++;
		}
		payrolls = new Payroll[a + 1];

		for (int i = 0; i < a; i++) {
			payrolls[i] = temp[i];
		}

		payrolls[a] = payroll;
	}

	void addItemToStorage() {

	}
}
