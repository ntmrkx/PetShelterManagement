public class Dog extends Pet {
    private String breed;
    private boolean isTrained;

    public Dog(String name, float weight, String foundPlace, String chipNumber, String breed) {
        super(name, weight, foundPlace, chipNumber);
        this.breed = breed;
        this.isTrained = false;
    }

    @Override
    public String getSpecies() { return "Dog"; }

    // getters & setters
}