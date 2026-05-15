package Pratik.StudentApi_5.Model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "studentschemas")
@NoArgsConstructor
public class StudentModel {
        @Id
        private Object id;
        @Indexed(unique = true)
        private String name;
        private String sub;

}


