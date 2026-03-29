package StudentsApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentsApiApplication {

	public static void main(String[] args) {

		SpringApplication.run(StudentsApiApplication.class, args);
	}

}
/* ---this api is created using HashMap there is no any database configuration---
	Step1:Create Model for Student.
		1.ShortCut For Getter and Setter (right click on particular class->Generate->Getter & Setter).
   	Step2:Crete Controller.
   		1.@RestController:-this annotation is place above class ,use of this annotation is to register class with ioc container
   		 				   and convert returned data into json formate.
   		2.@RequestMapping(url):-this annotation is also place above class,when request hit then it check first class if match then it go inside
   								that class for matching further url with particular method.
   		3.@PostMapping(url):-when data is add or put in database then this is use.
   							1.@RequestBody:-this annotation is used to get data from client .
   		4.@GetMapping(url):-for fetching data into database.

   		4.@DeleteMapping(url/{id}):-for Deleting data into database using id.
   									1.req=http://localhost:8080/StudentApi/Id/1
   									2.@PathVariable long id
   		4.@putMapping(url/{id}):-for updating data into database using id.
*/