package com.ser.graphqldemo.controllers;

import com.ser.graphqldemo.entities.Author;
import com.ser.graphqldemo.entities.Post;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

@Controller
public class PostController {


    @QueryMapping
    public Post postById(@Argument int id) {
        return Post.getById(id);
    }

    @SchemaMapping
    public Author author(Post post) {
        return Author.getById(post.getAuthorId());
    }
}
