package Pratik.StudentApi_3.Controllers;

import Pratik.StudentApi_3.Model.StudentModel;
import Pratik.StudentApi_3.Services.StudentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/StudentsApi")
public class StudentControllers {
        @Autowired
        private StudentServices studentsServices;

        @GetMapping("/getAll")
        public List<StudentModel> findAll(){
            return studentsServices.findAll();
        }

        @GetMapping("/getById/{id}")
        public StudentModel findById(@PathVariable String id){
            return studentsServices.findById(id);
        }

        @PostMapping("/add")
        public StudentModel addStudent(@RequestBody StudentModel studentModel){
            return studentsServices.save(studentModel);

        }

        @DeleteMapping("/deleteById/{id}")
        public boolean deleteStudentById(@PathVariable String id){
             studentsServices.deleteById(id);
             return true;
        }

        @PutMapping("/updateById/{id}")
        public StudentModel updateById(@PathVariable String id , @RequestBody StudentModel studentModel){
            return studentsServices.updateById(id,studentModel);
        }

    }


