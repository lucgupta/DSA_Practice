package basicConcepts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student3 implements java.lang.Comparable<Student3> {
    int rollNo;
    String name;
    int age;

    public Student3(int rollNo, String name, int age) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
    }

    public int compareTo(Student3 s1) {
        return this.name.compareTo(s1.name);
    }

    @Override
    public String toString() {
        return "Student3{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class Comparable {
    public static void main(String[] args) {
        List<Student3> stud = new ArrayList<>();
        stud.add(new Student3(56, "John", 45));
        stud.add(new Student3(45, "Lucky", 42));
        stud.add(new Student3(66, "Lovey", 52));
        stud.add(new Student3(23, "Yash", 44));

        Collections.sort(stud);

        for(Student3 s : stud) {
            System.out.println(s);
        }
    }
}
