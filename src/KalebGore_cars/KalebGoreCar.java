package KalebGore_cars;

public class KalebGoreCar {
	private String type;
	private String color;
	private String year;

	// Constructor
	public KalebGoreCar(String type, String color, String year) {
		this.type = type;
		this.color = color;
		this.year = year;
	}

	// Getters
	public String getType() {
		return type;
	}

	public String getColor() {
		return color;
	}

	public String getYear() {
		return year;
	}

	// Setters
	public void setType(String type) {
		this.type = type;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setYear(String year) {
		this.year = year;
	}

	// Methods
	public int carAge() {
		int CURRENT_YEAR = 2024;
		return CURRENT_YEAR - Integer.parseInt(year);
	}
	
	public int numberOfOilChanges() {
		int car_age = carAge();
		int oil_changes = 0;

		// Every 3 years it increments by 1
		for(int i = 0; i < car_age; i++) {
			if(i % 3 == 0) {
				oil_changes++;
			}
		}
		return oil_changes;
	}
}