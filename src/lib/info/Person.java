package lib.info;

public class Person extends Name{
    public enum GenderName{
		Pria,
		Wanita
	}
	private GenderName gender;
    private Name personName;
	private boolean isForeigner;
    private String address;

    public void setGender(GenderName gender) {
        this.gender = gender;
    }
    public GenderName getGender() {
        return this.gender;
    }
    public void setName(Name personName ) {
        this.personName = personName;
    }

    public Name getName() {
        return this.personName;
    }
    public void setForeigner(boolean isForeigner){
        this.isForeigner = isForeigner;
    }
    public boolean getForeigner(){
        return this.isForeigner;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public String getAddress(){
        return this.address;
    }

}
