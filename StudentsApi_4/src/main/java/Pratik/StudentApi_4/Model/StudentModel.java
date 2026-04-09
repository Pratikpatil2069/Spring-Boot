package Pratik.StudentApi_4.Model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "studentschemas")
public class StudentModel {
        @Id
        private String id;
        private String name;
        private String sub;

}


