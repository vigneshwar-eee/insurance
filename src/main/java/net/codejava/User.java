package net.codejava;

public class User {
	private String name;
	private String gender;
	private boolean married;
	private String age;
	private boolean hypertension;
	private boolean bloodPressure;
	private boolean bloodSugar;
	private boolean overWeight;
	private boolean smoking;
	private boolean alcohol;
	private boolean dailyExercise;
	private boolean drugs;
	
	private double premium;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}


	public boolean isMarried() {
		return married;
	}

	public void setMarried(boolean married) {
		this.married = married;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}
	
	public boolean isHypertension() {
		return hypertension;
	}

	public void setHypertension(boolean hypertension) {
		this.hypertension = hypertension;
	}

	public boolean isBloodPressure() {
		return bloodPressure;
	}

	public void setBloodPressure(boolean bloodPressure) {
		this.bloodPressure = bloodPressure;
	}

	public boolean isBloodSugar() {
		return bloodSugar;
	}

	public void setBloodSugar(boolean bloodSugar) {
		this.bloodSugar = bloodSugar;
	}

	public boolean isOverWeight() {
		return overWeight;
	}

	public void setOverWeight(boolean overWeight) {
		this.overWeight = overWeight;
	}

	public boolean isSmoking() {
		return smoking;
	}

	public void setSmoking(boolean smoking) {
		this.smoking = smoking;
	}

	public boolean isAlcohol() {
		return alcohol;
	}

	public void setAlcohol(boolean alcohol) {
		this.alcohol = alcohol;
	}

	public boolean isDailyExercise() {
		return dailyExercise;
	}

	public void setDailyExercise(boolean dailyExercise) {
		this.dailyExercise = dailyExercise;
	}

	public boolean isDrugs() {
		return drugs;
	}

	public void setDrugs(boolean drugs) {
		this.drugs = drugs;
	}
	
	public double getPremium() {
		return premium;
	}

	public void setPremium(double premium) {
		this.premium = premium;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", gender=" + gender + ", married=" + married + ", age=" + age + ", hypertension="
				+ hypertension + ", bloodPressure=" + bloodPressure + ", bloodSugar=" + bloodSugar + ", overWeight="
				+ overWeight + ", smoking=" + smoking + ", alcohol=" + alcohol + ", dailyExercise=" + dailyExercise
				+ ", drugs=" + drugs + ", premium=" + premium + "]";
	}
	
}
