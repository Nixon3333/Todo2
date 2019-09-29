package com.nixon.todolist;

import android.content.Context;

import androidx.room.Room;

import com.nixon.todolist.model.Task;

import java.util.List;

/**
 * Created by Drygin Nikita on 29,Сентябрь,2019
 */
public class Repository {

    private static Repository instance;
    private LocalDataBase localDataBase;

    public static Repository getInstance(Context context) {
        if (instance == null)
            instance = new Repository(context);
        return instance;
    }

    private Repository (Context context) {
        localDataBase = Room.databaseBuilder(context, LocalDataBase.class, "local-db")
                .allowMainThreadQueries()
                .build();

    }

    public List<Task> getAllTask() {
        return localDataBase.getTaskDao().getAll();
    }

    public void addTask(Task task) {
        localDataBase.getTaskDao().insert(task);
    }

    public void deleteTask(Task task) {
        localDataBase.getTaskDao().delete(task);
    }
}
