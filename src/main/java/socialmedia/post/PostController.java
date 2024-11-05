package socialmedia.post;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

//stie sa faca mapari de json, endpoint etc
@RestController
public class PostController {

    @Autowired
    private PostService postService;

    @PostMapping("/post") //endpoint - adresa pe care eu o apelez se gaseste metoda respectiva - de tip post
    public Post create(@RequestBody Post myPost){ // se pune in postman la body
        //verificari de autorizare, autentificare etc
        return postService.createPost(myPost);
    }
}
