public class Rabbit extends Pet {
    private String earType;
    private boolean isNeutered;

    public Rabbit(String name, float weight, String foundPlace, String chipNumber) {
        super(name, weight, foundPlace, chipNumber);
    }

    @Override
    public String getSpecies() { return "Rabbit"; }
}