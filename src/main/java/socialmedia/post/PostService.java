package socialmedia.post;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostService {

    @Autowired //imi initializeaza asta in loc sa scriu new bla bla
    private PostRepository postRepostitory;

    public Post createPost(Post myPost){
        //aici putem pune fct de verificarei daca avem injuraturi, titlu etc
        return postRepostitory.save(myPost);
    }
}
