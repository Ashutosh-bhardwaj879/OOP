//array of objects/class,coonstructor,string
package JAVA.Constructor;

class Subject {
    private String name;
    private String subjectID;
    private int marksObtained;
    private int maxMarks;

    public Subject(String name, String subjectID, int marksObtained, int maxMarks) {
        this.name = name;
        this.subjectID = subjectID;
        this.marksObtained = marksObtained;
        this.maxMarks = maxMarks;
    }

    public Subject(int marksObtained, int maxMarks) {
        this.marksObtained = marksObtained;
        this.maxMarks = maxMarks;
    }

    public boolean isPass() {
        return (marksObtained >= maxMarks / 100 * 40);
    }

    public String getSubjectID() {
        return subjectID;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return ("name :" + name + "  SubjectID : " + subjectID + "  marksObtained : " + marksObtained + "  maxMarks : "
                + maxMarks);
    }
}

public class SCLoops {
    public static void main(String[] args) {
        Subject[] subs = new Subject[3];
        subs[0] = new Subject("s101", "DSAP", 70, 100);
        subs[1] = new Subject("s102", "ALGO", 60, 100);
        subs[2] = new Subject("s103", "CNOS", 50, 100);
        for (Subject s : subs) {
            System.out.println(s);
        }
        Subject s = new Subject("ABC", "s123", 40, 100);
        System.out.println(s.isPass());
        System.out.println(s.getName());
        System.out.println(s.getSubjectID());
    }
}