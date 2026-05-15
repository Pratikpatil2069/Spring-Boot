package Pratik.StudentApi_5.Services;

import Pratik.StudentApi_5.Model.ClassModel;
import Pratik.StudentApi_5.Model.StudentModel;
import Pratik.StudentApi_5.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class StudentServices {
        @Autowired
        private StudentRepository studentRepository;
        @Autowired
        private ClassServices classServices;

        public StudentModel save(StudentModel studentModel,Object id){
            Optional<ClassModel> classModel =classServices.findById(id);
            StudentModel st= studentRepository.save(studentModel);
            if(classModel.isPresent()){
                ClassModel c=classModel.get();
                c.getStudentModels().add(st);
                classServices.save(c);
            }
            return st;

        }
        public List<StudentModel> findAll(){
            return studentRepository.findAll();
        }
        public StudentModel findById(Object id){
            return studentRepository.findById(id).orElse(null);
        }
        public void deleteById(Object id){
            Optional<StudentModel> st=studentRepository.findById(id);
            if(st.isPresent()){
                StudentModel st1=st.get();
                ClassModel cm=classServices.findByStudentModelsContaining(st1);
                cm.getStudentModels().remove(id);
            }

            studentRepository.deleteById(id);
        }
        public StudentModel updateById( Object id , StudentModel studentModel){
            StudentModel old=this.findById(id);
            ClassModel cm=classServices.findByStudentModelsContaining(old);
            int ind= cm.getStudentModels().indexOf(old);
            if(old!=null){
                old.setName((studentModel.getName()==null)? old.getName() : studentModel.getName());
                old.setSub((studentModel.getSub()==null)? old.getSub() : studentModel.getSub());
            }
            cm.getStudentModels().set(ind,old);
            this.save(old,cm.getId());
            return old;
        }

    }


