package dev.aquashdw.challenge;

import dev.aquashdw.basic.Lecturer;
import dev.aquashdw.basic.Person;
import dev.aquashdw.basic.Student;

import java.util.*;

public class ChallengeMain {
    public static void main(String[] args) {
//        ArrayList a;
//        LinkedList b;
//        Vector c;
//        HashSet d;

    Person studentKim = new Student("Kim",26);
    Person studentLee = new Student("Lee", 28);
    Student studentPark = new Student("Park", 24);
    Lecturer lecturer = new Lecturer("Park Jeeho", 24);
    List<Person> everyone = new ArrayList<>();

    everyone.add(studentKim);
    everyone.add(studentLee);
    everyone.add(studentPark);
    everyone.add(lecturer);

    printItems(everyone);
    }
    public static <T> void printItems(Iterable<T> iterable){
        Iterator<T> iterator = iterable.iterator();
        if(!iterator.hasNext()){
            System.out.println("No Elements");
            return;
        }

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("idx\t\titem\n");
        for (int i = 0; iterator.hasNext(); i++){
            T item = iterator.next();
            stringBuilder.append(
                    String.format("%d\t\t%s\n", i, item));
        }

        System.out.println(stringBuilder);
    }
}
