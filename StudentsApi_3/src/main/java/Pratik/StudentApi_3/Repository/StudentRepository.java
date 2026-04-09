package Pratik.StudentApi_3.Repository;

import Pratik.StudentApi_3.Model.StudentModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepository extends MongoRepository<StudentModel,String> {

}


