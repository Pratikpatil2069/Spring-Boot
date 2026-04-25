package Pratik.StudentApi_5.Controllers;

import Pratik.StudentApi_5.Model.ClassModel;
import Pratik.StudentApi_5.Services.ClassServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/ClassApi")
public class ClassController {
    @Autowired
    private ClassServices classServices;

    @GetMapping("/findAll")
    public List<ClassModel> findAll(){
        return classServices.findAll();
    }

    @PostMapping("/save")
    public ClassModel save(@RequestBody ClassModel classModel){
        return classServices.save(classModel);
    }

    @GetMapping("/getById/{id}")
    public ClassModel getById(@PathVariable Object id){
        return classServices.findById(id);
    }

    @DeleteMapping("/deleteById/{id}")
    public boolean deleteById(@PathVariable Object id){
        return classServices.deleteById(id);
    }

    @PutMapping("/updateById/{id}")
    public Optional<ClassModel> updateById(@PathVariable Object id){
        return classServices.updateById(id);
    }
}
