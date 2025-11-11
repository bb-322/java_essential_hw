package hw4.task2;

public abstract class AbstractHandler {

    void open() {
    }

    void create() {

    }

    void change() {

    }

    void save() {

    }
}

class XMLHandler extends AbstractHandler {
    @Override
    void open() {
        System.out.println("open XML");
    }

    @Override
    void create() {
        System.out.println("create XML");
    }

    @Override
    void change() {
        System.out.println("change XML");
    }

    @Override
    void save() {
        System.out.println("save XML");
    }
}

class TXTHandler extends AbstractHandler {
    @Override
    void open() {
        System.out.println("open TXT");
    }

    @Override
    void create() {
        System.out.println("create TXT");
    }

    @Override
    void change() {
        System.out.println("change TXT");
    }

    @Override
    void save() {
        System.out.println("save TXT");
    }
}

class DOCHandler extends AbstractHandler {
    @Override
    void open() {
        System.out.println("open DOC");
    }

    @Override
    void create() {
        System.out.println("create DOC");
    }

    @Override
    void change() {
        System.out.println("change DOC");
    }

    @Override
    void save() {
        System.out.println("save DOC");
    }
}
