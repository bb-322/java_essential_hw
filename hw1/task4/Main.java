package hw1.task4;

class Computer {
    private String name;

    public Computer() {
        this.name = "undefined";
    }

    public Computer(String name) {
        this.name = name;
    }

    void show() {
        System.out.println(name);
    }
}

public class Main {
    static void main(String[] args) {
        Computer[] computers = {
                new Computer("computer1"),
                new Computer("computer2"),
                new Computer("computer3"),
                new Computer("computer4"),
                new Computer("computer5")
        };

        for (Computer computer : computers) {
            computer.show();
        }
    }
}
