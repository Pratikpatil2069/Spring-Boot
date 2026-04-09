package Pratik.StudentApi_4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentApi4Application {

	public static void main(String[] args) {
		SpringApplication.run(StudentApi4Application.class, args);
	}

}

/* Status codes:-the code that identifies the request is in which state.
   		1.start from 1XX:-this codes tell clients , request successfully go to server and server is now in processing stage.

   		2.Start from 2XX:-this code tell clients request is processed successfully and response is send successfully.
   		     Ex-200:-this status code tell request is send successfully.(get Request)
   		        201:- this status code tell new resource is created successfully (post request)
   		        204:-this is for some resources is delete successfully according to client.(delete request)

   		3.start from 3XX:-The client (browser, Postman, etc.) needs to take additional action to complete the request — usually by going to a different URL.
   		     Ex:-301:-Resource has been permanently moved to a new URL
   		     	 302:-Temporary redirection (URL may change back later)
   		     	 304:-Cached version is still valid (no need to download again)

   		 4. Start from 4XX:-the error is in client side applications.
   		 	 Ex:-400:-Request is invalid (wrong JSON, missing fields, syntax error)
   		 	     401:-Authentication required (login/token missing or wrong)
   		 	     403:-You are authenticated, but not allowed to access
   		 	     404:-Resource (API/URL) does not exist

   		 5. Start from 5XX:-the error is in server side applications.
   		 	 Ex:-500:-Generic error (something broke in backend code)
   		 	     501:-Server doesn’t support this functionality
   		 	     502:-One server got invalid response from another server
   		 	     503:-Server is down / overloaded / under maintenance

   		 6.so now we use ResponseEntity class to rend the response to client.
   		     ResponseEntity:-this class is provided by spring boot.
   		     				 this class contains http methods we need to call then according to need.

   		  7.Lombok:- this is spring boot library used to generate getters and setters automatically without write code.
   		  			 this process is done in compilation phase.
   		  			 @Data:- this annotation is write above your pojo class this automatically creates getter and setters and many more.

*/

