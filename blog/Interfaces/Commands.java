package blog.Interfaces;

public interface Commands {
    int EXIT = 0;
    int ADD_POST = 1;
    int SEARCH_POST_BY_KEYWORD = 2;
    int SEARCH_POST = 3;
    int POSTS_BY_CATEGORY = 4;
    int ALL_POSTS = 5;
    int DELETE_POST = 6;
    int CHANGE_POST  = 7;
    int DELETE_BY_CATEGORY   = 8;

    static void printCommands() {
        System.out.println("Please input " + EXIT + " for EXIT");
        System.out.println("Please input " + ADD_POST + " for add Post");
        System.out.println("Please input " + SEARCH_POST_BY_KEYWORD + " for search post by keyword");
        System.out.println("Please input " + SEARCH_POST + " for search post");
        System.out.println("Please input " + POSTS_BY_CATEGORY + " for posts by category");
        System.out.println("Please input " + ALL_POSTS + " for print all posts");
        System.out.println("Please input " + DELETE_POST + " for print delete post");
        System.out.println("Please input " + CHANGE_POST  + " for change post");
        System.out.println("Please input " + DELETE_BY_CATEGORY   + " for delete by category");
    }
}
