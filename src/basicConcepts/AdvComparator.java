package basicConcepts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student2 {
    int rollNo;
    String name;
    int age;

    public Student2(int rollNo, String name, int age) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class AdvComparator {
    public static void main(String[] args) {
        List<Student2> stud = new ArrayList<>();
        stud.add(new Student2(56, "John", 45));
        stud.add(new Student2(45, "Lucky", 42));
        stud.add(new Student2(66, "Lovey", 52));
        stud.add(new Student2(23, "Yash", 44));

        Comparator<Student2> com1 = Comparator.comparing(Student2:: getAge);
        Collections.sort(stud, com1);

        for(Student2 st: stud){
            System.out.println(st.rollNo+" "+st.name+" "+st.age);
        }
    }
}
