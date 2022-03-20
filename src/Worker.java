import java.io.Serializable;

public class Worker implements OnTaskDoneListener, Serializable {


    private OnTaskDoneListener callback;

    public Worker(OnTaskDoneListener callback) {
        this.callback = callback;
    }

    public void start () {

        for (int i = 0; i < 50; i++) {

            System.out.println("Tasks" + i + " is done!!");
        }
    }

    @Override
    public void oneDone(String result) {

    }
}
