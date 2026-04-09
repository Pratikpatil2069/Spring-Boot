package Pratik.StudentApi_4.Controllers;

import Pratik.StudentApi_4.Model.StudentModel;
import Pratik.StudentApi_4.Services.StudentServices;
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
    public ResponseEntity<StudentModel> findById(@PathVariable String id){
        try{
            return new ResponseEntity<>(studentsServices.findById(id),HttpStatus.OK);
        }catch(Exception e){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

    }

    @PostMapping("/add")
    public ResponseEntity<StudentModel> addStudent(@RequestBody StudentModel studentModel){
        try{
            return new ResponseEntity<>(studentModel, HttpStatus.CREATED);
        }catch (Exception e){
            return new ResponseEntity<>(studentModel, HttpStatus.BAD_REQUEST);
        }


    }

    @DeleteMapping("/deleteById/{id}")
    public ResponseEntity<?> deleteStudentById(@PathVariable String id){
        studentsServices.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PutMapping("/updateById/{id}")
    public ResponseEntity<StudentModel> updateById(@PathVariable String id , @RequestBody StudentModel studentModel){
        try{
            return new ResponseEntity<>(studentsServices.updateById(id,studentModel),HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

}