package dev.aquashdw.gradledemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GradledemoApplication {

	public static void main(String[] args) {
//		TestComponent testComponent = new TestComponent(
//				new TestInterface() {
//					@Override
//					public void sayHello() {
//						System.out.println("hello world! this is temp interface.");
//					}
//				}
//
//		);
//		testComponent.sayHello();
		SpringApplication.run(GradledemoApplication.class, args);
	}

}
