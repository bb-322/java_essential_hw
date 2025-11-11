package hw4.task3;

class Player implements Recordable, Playable {
    @Override
    public void record() {
        System.out.println("records");
    }

    @Override
    public void play() {
        System.out.println("plays");
    }

    @Override
    public void pause() {
        System.out.println("pauses");
    }

    @Override
    public void stop() {
        System.out.println("stops");
    }
}
