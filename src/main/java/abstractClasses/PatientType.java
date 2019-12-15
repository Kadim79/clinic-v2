package abstractClasses;

public enum PatientType {

    Humans("human_patients.txt", "human_problems.txt"),
    Pets("pet_patients.txt", "pet_problems.txt");

    private String patientName;
    private String problemType;

    PatientType(String patientName, String problemType){
        this.patientName = patientName;
        this.problemType = problemType;
    }

    String getPatientName(){
        return patientName;
    }

    String getProblemType(){
        return problemType;
    }
}
