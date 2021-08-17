package basicConcepts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student {
    int rollNo;
    String name;
    int age;

    public Student(int rollNo, String name, int age) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class ObjComparator {
    public static void main(String[] args) {
        List<Student> studs  = new ArrayList<>();
        studs.add(new Student(56, "John", 45));
        studs.add(new Student(45, "Lucky", 42));
        studs.add(new Student(66, "Lovey", 52));
        studs.add(new Student(23, "Yash", 44));

        Collections.sort(studs, (s1, s2) ->
        {
            return s1.age>s2.age?-1:s1.age<s2.age?1:0;
        });

        for(Student s : studs) {
            System.out.println(s);
        }
    }

}
