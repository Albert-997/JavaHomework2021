package blog.Interfaces;

import blog.Post;
import blog.enums.Categories;

public interface Storage {
    void add(Post post);



    void add(blog.post.Post post);

    Post getPostByTitle(String title);
    void searchPostsByKeyword(String keyword);
    void printAllPosts();
    void printPostsByCategory(Categories category);
    void deleteByTitle(String title);
    void postChanger(String title,String newTitle, Categories category);

    void deleteByCategory(Categories category);
}
