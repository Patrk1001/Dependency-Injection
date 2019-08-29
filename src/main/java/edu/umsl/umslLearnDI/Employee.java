package edu.umsl.umslLearnDI;

public class Employee {
	
	private String firstName;
	private String lastName;
        private String ssn;
	private Address address;
	private Department department; //has to be lowercase for reference
	
        public Employee() {
	}
	

	public Employee(String firstName, String lastName, String ssn, Address address, Department department ) {//add this
		super();
		this.firstName = firstName;
		this.lastName = lastName;
                this.ssn=ssn;
		this.address = address;
                this.department=department;
	}


	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
        public String getSSN() {
		return ssn;
	}
        public void setSSN(String ssn) {
		this.ssn = ssn;
	}
	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + ", ssn=" +ssn+", address=" + address + ", department=" +department+ "]";
	}

	
	
	

}
