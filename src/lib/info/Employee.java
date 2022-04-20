package lib.info;

import java.time.LocalDate;
import java.time.Month;
import java.util.LinkedList;
import java.util.List;
import java.util.Date;
import lib.TaxFunction;

public class Employee extends Person {

	private String employeeId;
	private String idNumber;
	private Person employeeDetails;
	
	Date joinedDate;
	int monthWorkingInYear;
	boolean isForeigner;
	
	private String spouseName;
	private String spouseIdNumber;

	private List<String> childNames;
	private List<String> childIdNumbers;
	
	public Employee(String employeeId, String firstName, String lastName, String idNumber, String address, int yearJoined, int monthJoined, int dayJoined, boolean isForeigner, GenderName gender) {
		this.employeeId = employeeId;
		employeeDetails = new Person();
		employeeDetails.setFirstName(firstName);
		employeeDetails.setFirstName(lastName);
		employeeDetails.setGender(gender);
		employeeDetails.setAddress(address);
		this.setForeigner(isForeigner);
		this.joinedDate = joinedDate;
		
		childNames = new LinkedList<String>();
		childIdNumbers = new LinkedList<String>();
	}

	
	public void setSpouse(String spouseName, String spouseIdNumber) {
		this.spouseName = spouseName;
		this.spouseIdNumber = idNumber;
	}
	
	public void addChild(String childName, String childIdNumber) {
		childNames.add(childName);
		childIdNumbers.add(childIdNumber);
	}
	public void setForeigner(boolean isForeigner){
        this.isForeigner = isForeigner;
    }
    public boolean getForeigner(){
        return this.isForeigner;
    }
	
}
