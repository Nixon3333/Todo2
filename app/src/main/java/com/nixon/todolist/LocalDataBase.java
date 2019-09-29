package com.nixon.todolist;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.nixon.todolist.model.Task;

/**
 * Created by Drygin Nikita on 29,Сентябрь,2019
 */

@Database(entities = {Task.class}, version = 1)
public abstract class LocalDataBase extends RoomDatabase {
    public abstract TaskDAO getTaskDao();
}
