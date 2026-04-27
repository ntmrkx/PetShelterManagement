import java.time.LocalDate;
import java.util.ArrayList;

public abstract class Pet {
    private static int counter = 0;

    // basics
    private String name;
    private int age;
    private float weight;
    private String gender;
    private String idNumber;

    // discovery
    private String foundPlace;
    private LocalDate foundDate;

    // identification
    private String description;
    private String identificationMarks;  // fix: was IdentificationMarks
    private String chipNumber;
    private String photoPath;            // added

    // relationships
    private Owner originalOwner;         // nullable
    private ArrayList<MedicalRecord> medicalHistory;
    private boolean isQuarantined;

    public abstract String getSpecies();

    public Pet(String name, float weight, String foundPlace, String chipNumber) {
        counter++;
        this.idNumber = "REC-" + LocalDate.now().getYear() + "-" + counter; // fix: removed space
        this.name = name;
        this.weight = weight;
        this.foundPlace = foundPlace;
        this.foundDate = LocalDate.now();
        this.chipNumber = chipNumber;
        this.medicalHistory = new ArrayList<>();
        this.isQuarantined = true;
    }

    public void addMedicalRecord(MedicalRecord record) {
        medicalHistory.add(record);
    }

    public void liftQuarantine() {
        this.isQuarantined = false;
    }

    public String getName() {
        return name; }

    public void setName(String name) {
        this.name = name; }

    public int getAge() {
        return age; }

    public void setAge(int age) {
        this.age = age; }

    public float getWeight() {
        return weight; }

    public void setWeight(float weight) {
        this.weight = weight; }

    public String getGender() {
        return gender; }

    public void setGender(String gender) {
        this.gender = gender; }

    public String getIdNumber() {
        return idNumber; }

    public String getFoundPlace() {
        return foundPlace; }

    public void setFoundPlace(String foundPlace) {
        this.foundPlace = foundPlace; }

    public LocalDate getFoundDate() {
        return foundDate; }

    public void setFoundDate(LocalDate foundDate) {
        this.foundDate = foundDate; }

    public String getDescription() {
        return description; }

    public void setDescription(String description) {
        this.description = description; }

    public String getIdentificationMarks() {
        return identificationMarks; }

    public void setIdentificationMarks(String identificationMarks) {
        this.identificationMarks = identificationMarks; }

    public String getChipNumber() {
        return chipNumber; }

    public void setChipNumber(String chipNumber) {
        this.chipNumber = chipNumber; }

    public String getPhotoPath() {
        return photoPath; }

    public void setPhotoPath(String photoPath) {
        this.photoPath = photoPath; }

    public Owner getOriginalOwner() {
        return originalOwner; }

    public void setOriginalOwner(Owner originalOwner) {
        this.originalOwner = originalOwner; }

    public ArrayList<MedicalRecord> getMedicalHistory() {
        return medicalHistory; }

    public boolean isQuarantined() {
        return isQuarantined; }
}