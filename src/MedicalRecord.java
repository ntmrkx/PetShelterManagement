import java.time.LocalDate;

public class MedicalRecord {

    private String recordID;
    private LocalDate date;
    private RecordType type;
    private String description;
    private String vetName;

    public MedicalRecord(String recordID, RecordType type, String description, String vetName) {
        this.recordID = recordID;
        this.date = LocalDate.now();
        this.type = type;
        this.description = description;
        this.vetName = vetName;
    }

    // getters & setters
}