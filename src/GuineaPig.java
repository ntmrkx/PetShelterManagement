public class GuineaPig extends Pet {
    private String furType;

    public GuineaPig(String name, float weight, String foundPlace, String chipNumber) {
        super(name, weight, foundPlace, chipNumber);
    }

    @Override
    public String getSpecies() { return "Guinea Pig"; }
}