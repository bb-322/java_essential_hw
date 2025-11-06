package hw3.task2;

public class Main {
    static void main() {
        Pupil p1 = new ExcellentPupil();
        Pupil p2 = new GoodPupil();
        Pupil p3 = new BadPupil();

        ClassRoom c1 = new ClassRoom(p1, p2);
        ClassRoom c2 = new ClassRoom(p1, p2, p3);

        System.out.println("Class 1: ");
        c1.inspect();
        System.out.println("\nClass 2: ");
        c2.inspect();
    }
}
