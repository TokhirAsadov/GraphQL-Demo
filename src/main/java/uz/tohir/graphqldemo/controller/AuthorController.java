package uz.tohir.graphqldemo.controller;

import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import uz.tohir.graphqldemo.model.Author;
import uz.tohir.graphqldemo.repository.AuthorRepository;

import java.util.List;

@Controller
public class AuthorController {

    private final AuthorRepository authorRepository;

    public AuthorController(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @QueryMapping
    public List<Author> allAuthors() {
        return authorRepository.findAll();
    }

}
