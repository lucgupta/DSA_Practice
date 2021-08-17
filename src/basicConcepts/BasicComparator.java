package basicConcepts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student1 {
    int rollNo;
    String name;
    int age;

    public Student1(int rollNo, String name, int age) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student1{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class AgeComparator implements Comparator<Student1> {

    @Override
    public int compare(Student1 s1, Student1 s2) {
        if(s1.age==s2.age)
            return 0;
        else if(s1.age>s2.age)
            return 1;
        else
            return -1;
    }
}

class NameComparator implements Comparator<Student1>{
    public int compare(Student1 s1,Student1 s2){
        return s1.name.compareTo(s2.name);
    }
}

public class BasicComparator {
    public static void main(String[] args) {
        List<Student1> stud = new ArrayList<>();
        stud.add(new Student1(56, "John", 45));
        stud.add(new Student1(45, "Lucky", 42));
        stud.add(new Student1(66, "Lovey", 52));
        stud.add(new Student1(23, "Yash", 44));

        Collections.sort(stud, new AgeComparator());

        for(Student1 s : stud) {
            System.out.println(s);
        }

        Collections.sort(stud, new NameComparator());

        for(Student1 s : stud) {
            System.out.println(s);
        }
    }
}
