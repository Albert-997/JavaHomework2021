package blog.post;

import blog.Interfaces.Storage;
import blog.Post;
import blog.enums.Categories;

public class PostStorageImpl implements Storage {
    private Post[] posts = new Post[10];
    private int size = 0;


    private void extend() {
        Post[] temp = new Post[posts.length + 10];
        for (int i = 0; i < posts.length; i++) {
            temp[i] = posts[i];
        }
        posts = temp;
    }

    @Override
    public void add(Post post) {
        if (size == posts.length) {
            extend();
        }
        posts[size++] = post;
    }

    @Override
    public void add(blog.post.Post post) {
        
    }

    @Override
    public Post getPostByTitle(String title) {
        for (int i = 0; i < size; i++) {
            if (title.equalsIgnoreCase(posts[i].getTitle())) {
                return posts[i];
            }
        }
        return null;
    }

    @Override
    public void searchPostsByKeyword(String keyword) {
        for (int i = 0; i < size; i++) {
            if (keyword.contains(posts[i].getText()) | keyword.contains(posts[i].getTitle())) {
                System.out.println(posts[i]);
            }
        }
    }

    @Override
    public void printAllPosts() {
        for (int i = 0; i < size; i++) {
            System.out.println(posts[i]);
        }
    }

    public void printPostsByCategory(Categories category) {
        for (int i = 0; i < size; i++) {
            if (category == posts[i].getCategory()) {
                System.out.println(posts[i]);
            }
        }

    }

    @Override
    public void deleteByTitle(String title) {
        for (int i = 0; i < size; i++) {
            if (title.equalsIgnoreCase(posts[i].getTitle())) {
                for (int j = i + 1; j < size; j++) {
                    posts[j - 1] = posts[j];
                }
                size--;
            }
        }
    }


    public void postChanger(String title, String newTitle, Categories category) {
        for (int i = 0; i < size; i++) {
            if (title.equalsIgnoreCase(posts[i].getTitle())) {
                posts[i].setTitle(newTitle);
                posts[i].setCategory(category);
            }
        }
    }

    @Override
    public void deleteByCategory(Categories category) {
        for (int i = 0; i < size; i++) {
            while (category == posts[i].getCategory()) {
                for (int j = i + 1; j < size; j++) {
                    posts[j - 1] = posts[j];
                }
                size--;
            }
        }
    }
}