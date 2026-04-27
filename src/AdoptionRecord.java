import java.time.LocalDate;

public class AdoptionRecord {
    private String adoptionID;
    private static int counter = 0;

    private Pet pet;
    private Owner newOwner;
    private LocalDate handoverDate;
    private String housingAddress;

    public AdoptionRecord(Pet pet, Owner newOwner, String housingAddress) {
        counter++;
        this.adoptionID = "ADOPT-" + LocalDate.now().getYear() + "-" + counter;
        this.pet = pet;
        this.newOwner = newOwner;
        this.handoverDate = LocalDate.now();
        this.housingAddress = housingAddress;
    }

    // getters
    public String getAdoptionID() { return adoptionID; }
    public Pet getPet() { return pet; }
    public Owner getNewOwner() { return newOwner; }
    public LocalDate getHandoverDate() { return handoverDate; }
    public String getHousingAddress() { return housingAddress; }
}