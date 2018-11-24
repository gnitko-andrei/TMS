package homework;

public interface RunnableHomework {
    void runTask() throws InvalidTaskNumberException;
    void chooseTask(int[] numbers, int i) throws InvalidTaskNumberException;
}
