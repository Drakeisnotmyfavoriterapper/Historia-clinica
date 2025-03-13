import java.util.*;

public class Hospital {
    private List<Patient> patients;

    public Hospital() {
        this.patients = new ArrayList<>();
    }

    public List<Patient> ObtainPatients() {
        return patients;
    }

    public Hospital(List<Patient> patients) {
        this.patients = patients;
    }



    public Patient ObtainById(String id) {
        Patient encountered = new Patient();
        for (Patient patient : patients) {
            if (patient.ObtainId() == id) {
                encountered = patient;
            }
        }
        return encountered;
    }
    public List<String> findTallestPatientsIds() {
        List<Double> heights = new ArrayList<Double>();
        List<String> ids = new ArrayList<String>();
        for (Patient patient : patients) {
            heights.add(patient.ObtainHeight());
        }
        heights.sort(Comparator.reverseOrder());
        List<Double> top3 = heights.subList(0, Math.min(3, heights.size()));
        for (Patient patient : patients) {
            double height = patient.ObtainHeight();
            if (height == top3.getFirst() || height == top3.get(1) || height == top3.get(2)) {
                ids.add(patient.ObtainId());
            }
        }
        return ids;
    }
    public int ObtainWomenWithDengue() {
        int count = 0;
        for (Patient patient : patients) {
            for (Disease disease : patient.getDiseases()) {
                if (disease.ObtainName().toLowerCase().equals("dengue")) {
                    count++;
                }
            }
        }
        return count;
    }

    public List<Patient> sortByWeight() {
        List<Patient> sortedByWeight = new ArrayList<>(patients);
        sortedByWeight.sort(Comparator.comparing(Patient::getName));
        return sortedByWeight;
    }

    public List<Patient> sortByName() {
        List<Patient> sortedByName = new ArrayList<>(patients);
        sortedByName.sort(Comparator.comparing(Patient::getName));
        return sortedByName;
    }


    public void setPatients(List<Patient> patients) {
        this.patients = patients;
    }
}
