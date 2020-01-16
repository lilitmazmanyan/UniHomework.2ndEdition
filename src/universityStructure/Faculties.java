package universityStructure;

public class Faculties {
    private String name;
    private GroupObject[] groups;

    public GroupObject[] getGroups() {
        return groups;
    }

    public void setGroups(GroupObject[] groups) {
        this.groups = groups;
    }

    public Faculties(String name) {
        this.name = name;
    }

    public Faculties() {
        throw new RuntimeException("Each faculty should have at least one group");
    }
}
