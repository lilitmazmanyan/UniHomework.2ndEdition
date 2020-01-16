package universityStructure;

public class GroupObject {
    private int numberOfGroup;
    private Student[] students;

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        if (students == null) throw new RuntimeException("Students list is null");
        else for (Student s : students) {
            if (s == null) throw new RuntimeException("One of subjects is null");
        }
        this.students = students;
    }

    public GroupObject(){
        throw new RuntimeException("Group should have at least one student");
    }

    public GroupObject(int numberOfGroup) {
        this.numberOfGroup = numberOfGroup;
    }


}
