package core.hw1.worker;

@FunctionalInterface
public interface OnTaskDoneListener {
    void onDone(String result);

}
