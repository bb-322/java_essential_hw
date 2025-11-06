package hw3.task2;

public class Pupil {
    public void study() {
    }

    public void read() {
    }

    public void write() {
    }

    public void relax() {
    }
}

class BadPupil extends Pupil {
    @Override
    public void study() {
        System.out.println("bad studying");
    }

    @Override
    public void read() {
        System.out.println("bad reading");
    }

    @Override
    public void write() {
        System.out.println("bad writing");
    }

    @Override
    public void relax() {
        System.out.println("bad relaxing");
    }
}

class GoodPupil extends Pupil {
    @Override
    public void study() {
        System.out.println("good studying");
    }

    @Override
    public void read() {
        System.out.println("good reading");
    }

    @Override
    public void write() {
        System.out.println("good writing");
    }

    @Override
    public void relax() {
        System.out.println("good relaxing");
    }
}

class ExcellentPupil extends Pupil {
    @Override
    public void study() {
        System.out.println("excellent studying");
    }

    @Override
    public void read() {
        System.out.println("excellent reading");
    }

    @Override
    public void write() {
        System.out.println("excellent writing");
    }

    @Override
    public void relax() {
        System.out.println("excellent relaxing");
    }
}