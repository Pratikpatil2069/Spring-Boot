package Pratik.StudentApi_5.Repository;

import Pratik.StudentApi_5.Model.ClassModel;
import Pratik.StudentApi_5.Model.StudentModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ClassRepository extends MongoRepository<ClassModel,Object> {
    ClassModel findByStudentModelsContaining(StudentModel studentmodel);
}
