package dev.aquashdw.gradledemo;

import org.springframework.stereotype.Component;

@Component
public class Testimplementation implements TestInterface {
    @Override
    public void sayHello(){
        System.out.println("hello, i'm a bean");
    }
}
