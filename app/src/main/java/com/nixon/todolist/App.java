package com.nixon.todolist;

import android.app.Application;

/**
 * Created by Drygin Nikita on 29,Сентябрь,2019
 */
public class App extends Application {

    private static App instance;
    private Repository repository;

    public static App getInstance() {
        return instance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        repository = Repository.getInstance(getApplicationContext());
    }

    public Repository getRepository() {
        return repository;
    }
}
