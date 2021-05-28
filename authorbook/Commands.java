package homework.author;

public interface Commands {

    int EXIT = 0;
    int ADD_AUTHOR = 1;
    int SEARCH_AUTHOR_BY_NAME = 2;
    int PRINT_ALL_AUTHORS = 3;
    int FIND_AUTHOR_BY_EMAIL = 4;
    int ADD_BOOK = 5;
    int PRINT_ALL_BOOKS = 6;
    int PRINT_BOOK_BY_RANGE = 7;
    int CHECK_BOOK = 8;

    static void printCommands() {
        System.out.println("Please input " + EXIT + " for EXIT");
        System.out.println("Please input " + ADD_AUTHOR + " for ADD_AUTHOR");
        System.out.println("Please input " + SEARCH_AUTHOR_BY_NAME + " for SEARCH_AUTHOR_BY_NAME");
        System.out.println("Please input " + PRINT_ALL_AUTHORS + " for PRINT_ALL_AUTHORS");
        System.out.println("Please input " + FIND_AUTHOR_BY_EMAIL + " for FIND_AUTHOR_BY_EMAIL");
        System.out.println("Please input " + ADD_BOOK + " for ADD_BOOK");
        System.out.println("Please input " + PRINT_ALL_BOOKS + " for PRINT_ALL_BOOKS");
        System.out.println("Please input " + PRINT_BOOK_BY_RANGE + " for PRINT_BOOK_BY_RANGE");
        System.out.println("Please input " + CHECK_BOOK + " for CHECK_BOOK");

    }
}
