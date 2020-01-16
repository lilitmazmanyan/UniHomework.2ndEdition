package universityStructure;

public class Student {
    private String name;
    public Subject[] subjects;

    public Subject getSubject(String subjectName) {
        for (Subject s : subjects) {
            if(s.name.equals(subjectName))
                return s;
        }

        throw new RuntimeException("Student " + this.name + " doesn't study this subject");
    }

    public void setSubjects(Subject[] subjects) {
        if (subjects == null) throw new RuntimeException("Subjects are null");
        else for (Subject s : subjects) {
            if (s == null) throw new RuntimeException("One of subjects is null");
        }
        this.subjects = subjects;
    }

    public Student(String name) {
        this.name = name;
    }

}