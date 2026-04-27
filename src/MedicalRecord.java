import java.util.ArrayList;

public class MedicalRecord {
    private String medicalRecordID;
    private String vaccinationStatus;
    private String illness;
    private String illnessType;
    private boolean quarantine;
    private String quarantineDate;
    private ArrayList<MedicalRecord> vaccinationRecords;
    private ArrayList<MedicalRecord> illnessRecords;
    private ArrayList<MedicalRecord> quarantineRecords;
}
