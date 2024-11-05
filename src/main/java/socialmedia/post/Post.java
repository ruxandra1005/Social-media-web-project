package socialmedia.post;

import jakarta.persistence.*;
import jdk.jshell.Snippet;
import lombok.Data;
import org.hibernate.annotations.Collate;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;

@Entity
@Data //specifica ca se creaza automat settere gettere automate pt acest Post
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //creez un user si imi da id ul imediat disponibil
    private Integer id;
    private String title;
    private String content;
    @CreationTimestamp
    @Column(updatable = false, nullable = false)
    private Date createdOn; //momentul cand s a creat postarea se ia automat cu ajutorul @ + sa nu mai fie niciodata schimbat
    private Status status;


}
