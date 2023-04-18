//Kody M Greenberg 9/30/2022 forr IT-145
public class Monkey2 extends RescueAnimal {

    // Instance variable monkey specific
    private String species;
    private String tailLength;
    private String height;
    private String bodyLength;

    // Constructor
    public Monkey2(String name, String species, String gender, String age, String weight, String height, String bodyLength,boolean reserved, 
    		String acquisitionDate, String acquisitionCountry, String trainingStatus, String tailLength, String inServiceCountry) {
	
        setName(name);
        setSpecies(species);
        setGender(gender);
        setAge(age);
        setWeight(weight);
        setHeight(height);
        setBodyLength(bodyLength);
        setTailLength(tailLength);
        setAcquisitionDate(acquisitionDate);
        setAcquisitionLocation(acquisitionCountry);
        setTrainingStatus(trainingStatus);
        setReserved(reserved);
        setInServiceCountry(inServiceCountry);
    }

    // Accessor Method
    public String getSpecies() {
        return species;
    }

    // Mutator Method
    public void setSpecies(String monkeySpecies) {
        species = monkeySpecies;
    }
    // Accessor Method
    public String getTailLength() {
        return tailLength;
    }

    // Mutator Method
    public void setTailLength(String monkeyTailLength) {
        tailLength = monkeyTailLength;
    }
    // Accessor Method
    public String getHeight() {
        return height;
    }

    // Mutator Method
    public void setHeight(String monkeyHeight) {
        height = monkeyHeight;
    }
    // Accessor Method
    public String getBodyLength() {
        return bodyLength;
    }

    // Mutator Method
    public void setBodyLength(String monkeyBodyLength) {
    	bodyLength = monkeyBodyLength;
    }    
}
