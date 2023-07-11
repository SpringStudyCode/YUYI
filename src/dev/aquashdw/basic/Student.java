package dev.aquashdw.basic;

public class Student extends AbstractPerson{

    public Student(String name, int age){
        super(name, age);
    }

    @Override
    public void speak(){
        //super.speak();
        System.out.println(String.format("Hi, my name is %s, and I am a student", getName()));
    }


}
