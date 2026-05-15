package Pratik.StudentApi_5.Controllers;

import Pratik.StudentApi_5.Model.StudentModel;
import Pratik.StudentApi_5.Services.StudentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/StudentsApi")
public class StudentControllers {
    @Autowired
    private StudentServices studentsServices;

    @GetMapping("/getAll")
    public ResponseEntity<List<StudentModel>> findAll(){
        try{
            return new ResponseEntity<>(studentsServices.findAll(),HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

    }

    @GetMapping("/getById/{id}")
    public ResponseEntity<StudentModel> getById(@PathVariable Object id){
        try{
            return new ResponseEntity<>(studentsServices.findById(id),HttpStatus.OK);
        }catch(Exception e){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

    }

    @PostMapping("/add/{id}")
    public StudentModel addStudent(@RequestBody StudentModel studentModel,@PathVariable Object id){
      return studentsServices.save(studentModel,id);

    }

    @DeleteMapping("/deleteById/{id}")
    public ResponseEntity<?> deleteStudentById(@PathVariable Object id){
        studentsServices.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PutMapping("/updateById/{id}")
    public ResponseEntity<StudentModel> updateById(@PathVariable Object id , @RequestBody StudentModel studentModel){
        try{
            return new ResponseEntity<>(studentsServices.updateById(id,studentModel),HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

}