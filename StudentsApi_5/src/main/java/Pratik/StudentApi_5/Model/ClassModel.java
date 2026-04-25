package Pratik.StudentApi_5.Model;

import lombok.Data;
import lombok.NonNull;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;
@Document
@Data
public class ClassModel {
    @Id
    private Object id;
    @Indexed(unique = true)
    @NonNull
    private String name;
    @DBRef
    private List<StudentModel>studentModels=new ArrayList<>();
}
