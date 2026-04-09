package Pratik.StudentApi_4.Services;

import Pratik.StudentApi_4.Model.StudentModel;
import Pratik.StudentApi_4.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class StudentServices {
        @Autowired
        private StudentRepository studentRepository;

        public StudentModel save(StudentModel studentModel){
            return studentRepository.save(studentModel);
        }
        public List<StudentModel> findAll(){
            return studentRepository.findAll();
        }
        public StudentModel findById(String id){
            return studentRepository.findById(id).orElse(null);
        }
        public void deleteById(String id){
             studentRepository.deleteById(id);
        }
        public StudentModel updateById( String id , StudentModel studentModel){
            StudentModel old=this.findById(id);
            if(old!=null){
                old.setName((studentModel.getName()==null)? old.getName() : studentModel.getName());
                old.setSub((studentModel.getSub()==null)? old.getSub() : studentModel.getSub());
            }
            this.save(old);
            return old;
        }

    }


