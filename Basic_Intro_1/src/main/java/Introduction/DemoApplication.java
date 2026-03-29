package Introduction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);
	}

}
/* Step1:-Create Project Using Spring initializer and add dependencies like spring web.
		Spring web:-is a dependency it provides default Apache Tomcat server instead of use external server.

   Step2:-Install Maven Build Automation Tool.
   		Maven:-
   			1.Helps to Manage Dependencies:-without maven we download the external library and import to our project and then use it.
   											but with maven we simply go to maven repository and copy the library and pest it into pom.xml
   											so maven automatically install and import that library.

   Step3:-Structure of Spring Boot Application:-
   		1. .idea folder:- it is related to intellij idea.
   		2. .mvn:-
		3. .gitignore:- this file avoid the heavy file to push on gitHub.
		4. src->main->java:- here we write the actual code.
		5. src->main->resources->static:- it contains files like css and images.
		6. src->main->resources->templates:- it used to make xml pages.
		7. src->main->resources->application.properties:- here we write all properties that we are use like mongoDB configuration.
		8. src->test->java:- used to test the all methods that are write in main.
		9. pom.xml:-it contains all dependencies with their version.

	Step4:-	@SpringBootApplication internal working:-the main purpose of spring boot is to create automatically object of class
													 and give according to need.

		1. How Spring Create object behind ?
		->  Spring provides ico(inversion of Control) container  or Application Context that container contains some classes.
		->	when we write @Component to above of any class so that class only goes to ioc container.

		2. what is @Component ?
		-> means that class is automatically registered to spring bean ,means the class is gose to ioc container then it called as bean.

		3. @SpringBootApplication:-this is a entry point of project and this annotation is used in project only ones in the main class.
		-> It contains three sub Annotations:
				1.@ComponentScan:-when project run then this scan the package and add the classes which are written
								  with the @Component into the ioc container.
				2.@EnableAutoConfiguration:- It Automatically do Configuration like we want to connect database then add dependency in pom.xml
											 of mongoDB and add properties like database name ,server ,password
											 to  src->main->resources->application.properties here so spring automatically configure.
				3.@Configuration :- this annotation used when we use @bean annotation to function.

*/
