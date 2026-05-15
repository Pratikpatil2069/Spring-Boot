package Pratik.StudentApi_5.Services;

import Pratik.StudentApi_5.Model.ClassModel;
import Pratik.StudentApi_5.Model.StudentModel;
import Pratik.StudentApi_5.Repository.ClassRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClassServices {
    @Autowired
    private ClassRepository classRepository;

    public ClassModel save(ClassModel classModel){
        return classRepository.save(classModel);
    }
    public List<ClassModel> findAll(){
        return classRepository.findAll();
    }
    public Optional<ClassModel> findById(Object id){
        return classRepository.findById(id);
    }
    public boolean deleteById(Object id){
        try{
            classRepository.deleteById(id);
            return true;
        }catch (Exception e){
            return false;
        }
        
    }
    public Optional<ClassModel> updateById(Object id){
        return classRepository.findById(id);
    }
    public ClassModel findByStudentModelsContaining(StudentModel studentModel){
        return classRepository.findByStudentModelsContaining(studentModel);
    }


}




