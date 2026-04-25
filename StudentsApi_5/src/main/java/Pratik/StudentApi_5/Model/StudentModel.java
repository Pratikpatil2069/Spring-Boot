package Pratik.StudentApi_5.Model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "studentschemas")
public class StudentModel {
        @Id
        private String id;
        @Indexed(unique = true)
        private String name;
        private String sub;

}


