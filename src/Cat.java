public class Cat extends Pet {
    private String breed;
    private boolean isIndoor;

    public Cat(String name, float weight, String foundPlace, String chipNumber) {
        super(name, weight, foundPlace, chipNumber);
    }

    @Override
    public String getSpecies() { return "Cat"; }
}