package socialmedia.comment;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Comment {

    @Id
    private Integer id;
    private String content;


}
