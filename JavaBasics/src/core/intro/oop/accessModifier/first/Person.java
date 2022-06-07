package core.intro.oop.accessModifier.first;

public class Person {
	private String cellPhone;
	protected String landLine;
	public String telephoneBooth;

	public void setCellPhone(String cellPhone) {

		this.cellPhone = cellPhone;

	}

	public String getCellPhone() {

		return this.cellPhone;
	}

}
