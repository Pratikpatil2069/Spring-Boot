package Pratik.StudentApi_5.Repository;

import Pratik.StudentApi_5.Model.StudentModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepository extends MongoRepository<StudentModel,Object> {

}


