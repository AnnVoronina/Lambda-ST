import java.io.Serializable;

public class Worker implements OnTaskDoneListener, Serializable,OnTaskErrorListener {


    private final OnTaskDoneListener callback;
    private OnTaskErrorListener errorCallback;

    public Worker(OnTaskDoneListener callback, OnTaskErrorListener errorCallback) {
        this.callback = callback;
        this.errorCallback = errorCallback;
    }

    public void start() {

        for (int i = 0; i < 50; i++) {
            if (i == 33){
                errorCallback.onError("Task " + i + " is error !");
            } else
            callback.oneDone("Tasks " + i + " is done!!");
        }
    }

    @Override
    public void oneDone(String result) {

    }

    @Override
    public void onError(String string) {

    }
}
