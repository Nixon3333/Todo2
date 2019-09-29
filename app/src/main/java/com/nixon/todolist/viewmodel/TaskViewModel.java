package com.nixon.todolist.viewmodel;

import androidx.lifecycle.ViewModel;

/**
 * Created by Drygin Nikita on 29,Сентябрь,2019
 */
public class TaskViewModel extends ViewModel {

    private int id;
    private String title;
    private String content;
    private String imagePath;

    public TaskViewModel() {

    }

    public TaskViewModel(int id, String title, String content, String imagePath) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.imagePath = imagePath;
    }
}
