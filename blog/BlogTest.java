package blog;

import blog.Interfaces.Commands;
import blog.enums.Categories;
import blog.post.Post;
import blog.post.PostStorageImpl;

import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class BlogTest implements Commands {
    static Scanner scan = new Scanner(System.in);
    static PostStorageImpl postStorage = new PostStorageImpl();


    public static void main(String[] args) {
        boolean run = true;
        while (run) {
            Commands.printCommands();
            String num = scan.nextLine();
            try {
                int number = Integer.parseInt(num);
                switch (number) {
                    case EXIT:
                        run = false;
                        break;
                    case ADD_POST:
                        addPost();
                        break;
                    case SEARCH_POST_BY_KEYWORD:
                        searchPostByKeyword();
                        break;
                    case SEARCH_POST:
                        searchPostByTitle();
                        break;
                    case POSTS_BY_CATEGORY:
                        searchPostByCategory();
                        break;
                    case ALL_POSTS:
                        postStorage.printAllPosts();
                        break;
                    case DELETE_POST:
                        deletePostByTitle();
                        break;
                    case CHANGE_POST:
                        changePost();
                        break;
                    case DELETE_BY_CATEGORY:
                        deletePostByCategory();
                        break;
                    default:
                        System.out.println("Wrong Command");
                        break;
                }
            } catch (NumberFormatException e) {
                System.err.println("Please input valid number");
                Commands.printCommands();
            }
        }
    }

    private static void deletePostByCategory() {
        System.out.println("please input category");
        String category = scan.nextLine();
        String categoryString = category.toUpperCase(Locale.ROOT);
        Categories delCategory = Categories.valueOf(categoryString);
        postStorage.deleteByCategory(delCategory);
    }

    private static void changePost() {
        System.out.println("Please input title");
        String title = scan.nextLine();
        System.out.println("please input new title and new category. Categories are:");
        Categories[] category = Categories.values();
        for (Categories categories : category) {
            System.out.println(categories);
        }
        String changePost = scan.nextLine();
        String newTitle = changePost.split(",")[0];
        String categoryString = changePost.split(",")[1].toUpperCase(Locale.ROOT);
        Categories newCategory = Categories.valueOf(categoryString);
        postStorage.postChanger(title, newTitle, newCategory);
    }

    private static void deletePostByTitle() {
        System.out.println("Please input title for delete");
        String title = scan.nextLine();
        postStorage.deleteByTitle(title);
    }

    private static void searchPostByCategory() {
        System.out.println("Please input category");
        String categoryStr = scan.nextLine();
        Categories category = Categories.valueOf(categoryStr);
        postStorage.printPostsByCategory(category);
    }

    private static void searchPostByKeyword() {
        System.out.println("please input keyword");
        String key = scan.nextLine();
        postStorage.searchPostsByKeyword(key);
    }

    private static void searchPostByTitle() {
        System.out.println("Input title for search");
        String title = scan.nextLine();
        blog.Post postByTitle = postStorage.getPostByTitle(title);
        System.out.println(postByTitle);
    }

    private static void addPost() {
        Date date = new Date();
        Post post = new Post();
        System.out.println("Categories are:");
        Categories[] category = Categories.values();
        for (Categories categories : category) {
            System.out.println(categories);
        }
        System.out.println("====================");
        System.out.println("Please input title, text, category");
        String addPost = scan.nextLine();
        post.setTitle(addPost.split(",")[0]);
        post.setText(addPost.split(",")[1]);
        String categoryString = addPost.split(",")[2].toUpperCase(Locale.ROOT);
        Categories categoriesEnum = Categories.valueOf(categoryString);
        post.setCategory(categoriesEnum);
        post.setCreatedDate(date);
        postStorage.add(post);
    }
}
