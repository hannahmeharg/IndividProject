package hannahmeharg.example.individproject;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


public class TaskLab {
    private static TaskLab sTaskLab;

    private List<Tasks> mTasks;

    public static TaskLab get(Context context) {
        if (sTaskLab == null) {
            sTaskLab = new TaskLab(context);
        }
        return sTaskLab;
    }

    private TaskLab(Context context) {
        mTasks = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            Tasks task = new Tasks();
            task.setTitle("Crime #" + i);
            task.setSolved(i % 2 == 0); // Every other one
            mTasks.add(task);
        }
    }

    public List<Tasks> getTasks() {
        return mTasks;
    }
    public Tasks getCrime(UUID id) {
        for (Tasks crime : mTasks) {
            if (crime.getId().equals(id)) {
                return crime;
            }
        }
        return null;
    }
}
