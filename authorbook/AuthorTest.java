package authorbook;

import authorbook.model.Author;
import homework.author.model.Book;
import homework.author.storage.AuthorStorage;
import homework.author.storage.BookStorage;

import java.util.Scanner;

public class AuthorTest implements homework.author.Commands {

    static Scanner scanner = new Scanner(System.in);
    static AuthorStorage authorStorage = new AuthorStorage();
    static BookStorage bookStorage = new BookStorage();
    private static Object Author;

    public static void main(String[] args) {
        boolean run = true;
        while (run) {
            homework.author.Commands.printCommands();
            int command;
            try {
                command = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                e.printStackTrace();
                command = -1;
            }
            switch (command) {
                case EXIT:
                    run = false;
                    break;
                case ADD_AUTHOR:
                    addAuthor();
                    break;
                case SEARCH_AUTHOR_BY_NAME:
                    searchByName();
                    break;
                case PRINT_ALL_AUTHORS:
                    authorStorage.print();
                    break;
                case FIND_AUTHOR_BY_EMAIL:
                    findAuthorByEmail();
                    break;
                case ADD_BOOK:
                    addBook();
                    break;
                case PRINT_ALL_BOOKS:
                    bookStorage.print();
                    break;
                case PRINT_BOOK_BY_RANGE:
                    printBooksByPriceRange();
                    break;
                case CHECK_BOOK:
                    checkBookExists();
                    break;
                default:
                    System.out.println("wrong command");
            }

        }

    }


    private static void checkBookExists() {
        System.out.println("please input title");
        String title = scanner.nextLine();
        System.out.println("please input author's email");
        String authorEmail = scanner.nextLine();

        System.out.println(bookStorage.checkBookByTitleAndAuthorEmail(title, authorEmail));
    }

    private static void printBooksByPriceRange() {
        System.out.println("please input min,max prices");
        String range = scanner.nextLine();
        int min = Integer.parseInt(range.split(",")[0]);
        int max = Integer.parseInt(range.split(",")[1]);
        bookStorage.printBooksByPriceRange(min, max);

    }

    private static void addBook() {
        System.out.println("Please input book's title,description,price,count,authorEmail");

        String bookStr = scanner.nextLine();

        String[] bookStrArray = bookStr.split(",");

        try {
            Author author = authorStorage.getByEmail(bookStrArray[4]);

            Book book = new Book();
            book.setTitle(bookStrArray[0]);
            book.setDescription(bookStrArray[1]);
            book.setPrice(Double.parseDouble(bookStrArray[2]));
            book.setCount(Integer.parseInt(bookStrArray[3]));
            book.setAuthor(author);
            bookStorage.add(book);
            System.out.println("Book was added");

        } catch (homework.author.exception.AuthorNotFoundException e) {
            System.err.println(e.getMessage());
            addBook();
        } catch (NumberFormatException e) {
            System.err.println("Please input valid number");
            addBook();
        }


    }

    private static void findAuthorByEmail() {
        System.out.println("Please input email");
        String email = scanner.nextLine();
        Author author = null;
        try {
            author = authorStorage.getByEmail(email);
            System.out.println(author);
        } catch (AuthorNotFoundException e) {
            System.err.println(e.getMessage());
        }

    }

    private static void searchByName() {
        System.out.println("please input name");
        String name = scanner.nextLine();
        authorStorage.searchByName(name);
    }

    public static void addAuthor() {
        System.out.println("please input author's data. ");
        Author author = new Author();
        System.out.println("Please input author's name");
        author.setName(scanner.nextLine());
        System.out.println("Please input author's surname");
        author.setSurname(scanner.nextLine());
        System.out.println("Please input author's email");
        author.setEmail(scanner.nextLine());
        System.out.println("Please input author's age");
        author.setAge(Integer.parseInt(scanner.nextLine()));
        System.out.println("Please input author's gender");
        String gender = scanner.nextLine();
        if (!"MALE".equalsIgnoreCase(gender) &&
                !"FEMALE".equalsIgnoreCase(gender)) {
            System.err.println("Wrong gender");
            return;
        }
        author.setGender(gender);
        authorStorage.add(author);
    }

}
