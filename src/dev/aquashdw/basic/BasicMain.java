package dev.aquashdw.basic;

import java.util.ArrayList;
import java.util.List;

public class BasicMain {
    public static void main(String[] args) {
        Person studentKim = new Student("Kim", 26);
        //person.speak();
        Person studentLee = new Student("Lee", 28);
        Student studentPark = new Student("Park", 24);

        Lecturer lecturer = new Lecturer("Park Jeeho", 24);

        List<Person> everyone = new ArrayList<>();
        everyone.add(studentKim);
        everyone.add(studentLee);
        everyone.add(studentPark);
        everyone.add(lecturer);

        for(Person person: everyone){
            person.speak();
        }
    }
}
