package hw1.task3;

import java.util.Scanner;

class Title {
    private String title;

    public void setTitle(String title) {
        this.title = title;
    }

    public void show() {
        System.out.println(title);
    }
}

class Author {
    private String author;

    public void setAuthor(String author) {
        this.author = author;
    }

    public void show() {
        System.out.println(author);
    }
}

class Content {
    private String content;

    public void setContent(String content) {
        this.content = content;
    }

    public void show() {
        System.out.println(content);
    }
}

public class Book {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            Title title = new Title();
            Author author = new Author();
            Content content = new Content();

            System.out.print("set title: ");
            title.setTitle(sc.nextLine());
            System.out.print("set author: ");
            author.setAuthor(sc.nextLine());
            System.out.print("set content: ");
            content.setContent(sc.nextLine());

            title.show();
            author.show();
            content.show();
        }
    }
}
