package Pratik.StudentApi_5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentApi5Application {

	public static void main(String[] args) {
		SpringApplication.run(StudentApi5Application.class, args);
	}

}
/* So in this Project i Learn how to connect two collections by using primary key and foreign key
	1.first create Student model
	2.then create Class Model
	so now my task is to connect classModel to studentModel


	   @DBRef:- mongoDb stores the reference of student documents into class document.
	   @NoArgsConstructor:-  It automatically creates a constructor with no parameters.



*/



