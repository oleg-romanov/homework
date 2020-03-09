package HomeWork_26_02_20;

public abstract class Student {
    private int height = 0;
    private int exercises = 0;

    public abstract void doExercises();

    public void setHeight() {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public int getExercises() {
        return exercises;
    }

    public void addExercises(int exercises) {
        this.exercises += exercises;
    }

}
