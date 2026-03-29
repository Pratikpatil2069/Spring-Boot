package StudentsApi.Controller;

import StudentsApi.model.StudentModel;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
@RestController
@RequestMapping("/StudentApi")
public class StudentController {

   HashMap<Long,StudentModel>map=new HashMap<>();

   @PostMapping("/add")
   public boolean addStudent(@RequestBody StudentModel studentModel){
      map.put(studentModel.getId(),studentModel);
      return true;
   }

   @GetMapping("/get")
   public List<StudentModel> getAllStudents(){
      return new ArrayList<>(map.values());
   }

   @GetMapping("/getById/{myId}")
   public StudentModel getStudentById(@PathVariable long myId){
      return map.get(myId);
   }

   @DeleteMapping("/delete/{myId}")
   public StudentModel deleteStudent(@PathVariable long myId){
      return map.remove(myId);
   }

   @PutMapping("/update/{myId}")
   public StudentModel updateStudent(@PathVariable long myId,@RequestBody StudentModel studentModel){
      return map.put(myId,studentModel);
   }

}
