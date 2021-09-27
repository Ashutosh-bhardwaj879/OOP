package JAVA.Objects;

class Student {
    public int rollNo;
    public String name;
    public String course;
    public int m1, m2, m3;

    public int total() {
        return (m1 + m2 + m3);
    }

    public String getName() {
        return name;
    }

    public String getCourse() {
        return course;
    }

    public double average() {
        return (m1 + m2 + m3) / 3;
    }

    public char grade() {
        if (average() > 70) {
            return 'A';
        } else {
            return 'B';
        }
    }
}

public class StudentChallenge3 {
    public static void main(String[] args) {
        Student s = new Student();
        s.m1 = 90;
        s.m2 = 80;
        s.m3 = 40;
        s.rollNo = 19114;
        s.course = "MATHEMATICS";
        s.name = "ASHUTOSH";
        System.out.println(s.total());
        System.out.println(s.average());
        System.out.println(s.getCourse());
        System.out.println(s.getName());
        System.out.println(s.grade());
    }
}
