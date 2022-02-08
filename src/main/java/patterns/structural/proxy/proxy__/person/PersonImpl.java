package patterns.structural.proxy.proxy__.person;

public class PersonImpl implements Person {

	private String name; // self-changeable
	private String personalInfo; // self-changeable
	private int rating; // non-self-changeable

	
	
	public PersonImpl(String name, String personalInfo, int rating) {
		this.name = name;
		this.personalInfo = personalInfo;
		this.rating = rating;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int getGeekRating() {
		return rating;
	}

	@Override
	public void setGeekRating(int rating) {
		this.rating = rating;
	}

	@Override
	public String getPersonalInfo() {
		return personalInfo;
	}

	@Override
	public void setPersonalInfo(String personalInfo) {
		this.personalInfo = personalInfo;
	}
}
