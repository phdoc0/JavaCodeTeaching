package BasicCode.Week6;

public class Card {
    public int value;

	// name 
	public String name;

	// constructor:
	public Card(int value, String name) {

		this.value = value;
		this.name = name;
	}
	// Method: Getters and Setters:

	// Method: Describe - prints out info about card
	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public String describe()

	{

		return name + " " + value;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
