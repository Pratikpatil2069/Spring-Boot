package Pratik.StudentApi_3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentApi3Application {

	public static void main(String[] args) {
		SpringApplication.run(StudentApi3Application.class, args);
	}

}

/* 1.@Document(Collection="studentSchemas"):-this annotation is used to specify the collections in database for store documents.
   2.@Autowire:- this ask the spring to give the object of particular class from ioc container.
   3.@PathVariable:- this annotation is used to get the variables that shared from request.
   4.@RequestBody:- used to get the request body that send from front end through url.
   5.@Services:-this class contains main logic and spring creates automatically object of that class.
*/
