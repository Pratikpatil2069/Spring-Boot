package Pratik.StudentApi_4.Repository;

import Pratik.StudentApi_4.Model.StudentModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepository extends MongoRepository<StudentModel,String> {

}


