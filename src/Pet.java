import java.time.LocalDate;
import java.util.ArrayList;

public abstract class Pet {
    private static int counter = 0;

    //basics
    private String name;
    private int age;
    private float weight;
    private String gender;
    private String idNumber;

    //discovery
    private String foundPlace;
    private LocalDate foundDate;

    //identification
    private String description;
    private String IdentificationMarks;
    private String chipNumber;

    //relationships
    private Owner originalOwner;
    private Owner newOwner;
    private ArrayList<MedicalRecord> medicalHistory;
    private boolean isQuarantined;

    public Pet(String name, float weight, String foundPlace, String chipNumber) {
        counter++;
        this.idNumber = "REC- " + LocalDate.now().getYear() + "-" + counter;
        this.name = name;
        this.weight = weight;
        this.foundPlace = foundPlace;
        this.foundDate = LocalDate.now();
        this.chipNumber = chipNumber;
        this.medicalHistory = new ArrayList<>();
        this.isQuarantined = true;
    }

    //getters setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public ArrayList<MedicalRecord> getMedicalHistory() {
        return medicalHistory;
    }
}
