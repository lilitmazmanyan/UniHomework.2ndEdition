import universityStructure.*;

class Creation {
    void makingAll() {

        Student s1 = new Student("s1");
        Student s2 = new Student("s2");
        Student s3 = new Student("s3");

        s1.setSubjects(new Subject[]{new Subject("math"), new Subject("physic"),
                new Subject("geography")});

//        s1.getSubject(math).setScore();
        s1.getSubject("math").setScore(9);
        s1.getSubject("physic").setScore(6);
        s1.getSubject("geography").setScore(8);

        s2.setSubjects(new Subject[]{new Subject("english"), new Subject("math"),
                new Subject("physic")});

//        s2.getSubject(chemistry).setScore(6);
        s2.getSubject("english").setScore(9);
        s2.getSubject("physic").setScore(5);
        s2.getSubject("math").setScore(7);

        s3.setSubjects(new Subject[]{new Subject("physic"), new Subject("geography"),
                new Subject("english")});

        s3.getSubject("english").setScore(5);
        s3.getSubject("geography").setScore(8);
        s3.getSubject("physic").setScore(9);

//        GroupObject groupForException = new GroupObject();
        GroupObject group1 = new GroupObject(1);
        group1.setStudents(new Student[]{s1});

        GroupObject group2 = new GroupObject(2);
        group2.setStudents(new Student[]{s2});

        GroupObject group3 = new GroupObject(3);
        group3.setStudents(new Student[]{s3});

//        Faculties iam = new Faculties();
        Faculties intRel = new Faculties("IntRel");
        Faculties iam = new Faculties("IAM");

        intRel.setGroups(new GroupObject[]{group1});
        iam.setGroups(new GroupObject[]{group2, group3});

//        University uni = new University();
        University ysu = new University("YSU");
//        ysu.setFaculties();
        ysu.setFaculties(new Faculties[]{iam, intRel});

//        System.out.println(avgScoreOfStudent(s1));
//        System.out.println(avgScoreOfStudent(s2));

//        System.out.println("Avg of s3 " + avgScoreOfStudent(s3));
//        System.out.println("Avg of group from given subject " + avgOfGroupFromSubject(group1, "physic"));
//        System.out.println("Avg of fac from given subject " + avgOfFacFromSubj(iam, "physic"));

        System.out.println("Avg of University from given subject " + avgOfUniFromSubj(ysu, "english"));
    }

    private double avgScoreOfStudent(Student stud) {
        double mark = 0;
        for (Subject subj : stud.subjects) {
            mark += subj.getScore();
        }
        return mark / stud.subjects.length;
    }

    private double avgOfGroupFromSubject(GroupObject group, String subject) {
        double mark1 = 0;
        int studNumber = 0;
        for (Student s : group.getStudents()) {
            for (Subject subj : s.subjects) {
                if (subj.name == subject) {
                    mark1 += subj.getScore();
                    studNumber++;
                }
            }
        }
        return mark1 / studNumber;
    }

    private double avgOfFacFromSubj(Faculties fac, String subject) {
        double mark2 = 0;
        int groupNumber = 0;
        for (GroupObject g : fac.getGroups()) {
            mark2 += avgOfGroupFromSubject(g, subject);
            groupNumber++;
        }
        return mark2 / groupNumber;
    }

    private double avgOfUniFromSubj(University uni, String subject) {
        double mark3 = 0;
        int uniNumber = 0;
        for (Faculties f : uni.getFaculties()) {
            if (avgOfFacFromSubj(f, subject) > 0 || avgOfFacFromSubj(f, subject) <= 0) {
                mark3 += avgOfFacFromSubj(f, subject);
                uniNumber++;
            }
        }
        return mark3 / uniNumber;
    }


}
