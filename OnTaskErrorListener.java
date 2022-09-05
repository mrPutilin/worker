package core.hw1.worker;

@FunctionalInterface
public interface OnTaskErrorListener {
    void onError(String error);
}
