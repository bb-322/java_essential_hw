package hw3.task2;

public class ClassRoom {
    Pupil pupil1, pupil2, pupil3, pupil4;


    public ClassRoom(Pupil pupil1, Pupil pupil2) {
        this.pupil1 = pupil1;
        this.pupil2 = pupil2;
        this.pupil3 = new GoodPupil();
        this.pupil4 = new BadPupil();
    }

    public ClassRoom(Pupil pupil1, Pupil pupil2, Pupil pupil3) {
        this.pupil1 = pupil1;
        this.pupil2 = pupil2;
        this.pupil3 = pupil3;
        this.pupil4 = new BadPupil();
    }

    public void inspect() {
        System.out.println("Pupil 1: ");
        this.pupil1.study();
        this.pupil1.read();
        this.pupil1.write();
        this.pupil1.relax();

        System.out.println("\nPupil 2: ");
        this.pupil2.study();
        this.pupil2.read();
        this.pupil2.write();
        this.pupil2.relax();

        System.out.println("\nPupil 3: ");
        this.pupil3.study();
        this.pupil3.read();
        this.pupil3.write();
        this.pupil3.relax();

        System.out.println("\nPupil 4: ");
        this.pupil4.study();
        this.pupil4.read();
        this.pupil4.write();
        this.pupil4.relax();
    }

}
