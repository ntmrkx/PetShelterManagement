import java.util.ArrayList;
import java.util.List;

public class Shelter {
    private String shelterName;
    private ArrayList<Pet> activePets;
    private ArrayList<AdoptionRecord> adoptionArchive;

    public Shelter(String shelterName) {
        this.shelterName = shelterName;
        this.activePets = new ArrayList<>();
        this.adoptionArchive = new ArrayList<>();
    }

    public void admitPet(Pet pet) {
        activePets.add(pet);
        System.out.println("Admitted: " + pet.getName() + " | ID: " + pet.getIdNumber());
    }

    //adoption
    public boolean adoptPet(String petId, Owner newOwner, String housingAddress) {
        Pet found = findPetById(petId);
        if (found == null) {
            System.out.println("Pet not found.");
            return false;
        }
        if (found.isQuarantined()) {
            System.out.println("Cannot adopt — pet is still in quarantine.");
            return false;
        }

        AdoptionRecord record = new AdoptionRecord(found, newOwner, housingAddress);
        adoptionArchive.add(record);
        activePets.remove(found);
        System.out.println("Adoption recorded: " + record.getAdoptionID());
        return true;
    }

    //dashboard data
    public Pet getNewestPet() {
        if (activePets.isEmpty()) return null;
        return activePets.get(activePets.size() - 1);
    }

    public AdoptionRecord getLastAdoption() {
        if (adoptionArchive.isEmpty()) return null;
        return adoptionArchive.get(adoptionArchive.size() - 1);
    }

    public List<Pet> getPetsInQuarantine() {
        List<Pet> result = new ArrayList<>();
        for (Pet p : activePets) {
            if (p.isQuarantined()) result.add(p);
        }
        return result;
    }

    public int getActivePetCount() {
        return activePets.size();
    }

    //helper
    private Pet findPetById(String petId) {
        for (Pet p : activePets) {
            if (p.getIdNumber().equals(petId)) return p;
        }
        return null;
    }

    // getters
    public ArrayList<Pet> getActivePets() { return activePets; }
    public ArrayList<AdoptionRecord> getAdoptionArchive() { return adoptionArchive; }
    public String getShelterName() { return shelterName; }
}