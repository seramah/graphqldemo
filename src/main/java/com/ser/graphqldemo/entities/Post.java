package com.ser.graphqldemo.entities;

import java.util.Arrays;
import java.util.List;

public class Post {
    private final int id;
    private final String title;
    private final String authorId;

    public Post(int id, String title, String authorId) {
        this.id = id;
        this.title = title;
        this.authorId = authorId;
    }

    private static final List<Post> posts = Arrays.asList(
            new Post(1, "Title 1",  "author-1"),
            new Post(2, "Title 2",  "author-2"),
            new Post(3, "Title 3",  "author-3")
    );

    public static Post getById(int id) {
        return posts.stream().filter(p -> p.getId() == id).findFirst().orElse(null);
    }

    public int getId() {
        return id;
    }

    public String getAuthorId() {
        return authorId;
    }

    public String getTitle() {
        return title;
    }
}
