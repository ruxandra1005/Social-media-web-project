package socialmedia.user;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity //automat se va crea in mod similar o tabela in baza de date care reflecta clasa

public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //creez un user si imi da id ul imediat disponibil
    private Integer id;
    private String name;
    private String email;
}
