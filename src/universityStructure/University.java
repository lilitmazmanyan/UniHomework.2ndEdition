package universityStructure;

public class University {
    String name;
    private Faculties[] faculties;

    public Faculties[] getFaculties() {
        return faculties;
    }

    public void setFaculties(){
        throw new RuntimeException("Faculties shouldnt be null");
    }

    public void setFaculties(Faculties[] faculties) {
        if (faculties == null) throw new RuntimeException("Facultioes list is null ");
        else for (Faculties f : faculties) {
            if (f == null) throw new RuntimeException("One of faculties is null");
        }
        this.faculties = faculties;
    }

    public University(String name) {
        this.name = name;
    }
    public University(){
        throw new RuntimeException("Each uni should have at least 1 faculty");
    }


}
