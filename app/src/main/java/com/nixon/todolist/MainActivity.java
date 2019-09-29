package com.nixon.todolist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.nixon.todolist.adapter.RecyclerAdapter;
import com.nixon.todolist.databinding.ActivityMainBinding;
import com.nixon.todolist.model.Task;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding mainBinding;
    private RecyclerAdapter adapter;
    private Repository repository;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        mainBinding.rvTasks.setLayoutManager(new LinearLayoutManager(this));

        repository = Repository.getInstance(this);

        ArrayList<Task> list = new ArrayList<>();
        list.add(new Task(1, "title1", "content", "path"));

        adapter = new RecyclerAdapter(list);

        repository.addTask(new Task(1, "title1", "content", "path"));
        mainBinding.rvTasks.setAdapter(adapter);
    }

    private List<Task> getTaskList() {
        List<Task> tasks = new ArrayList<>();
        repository.addTask(new Task(1, "title1", "content", "path"));
        tasks.add(new Task(1, "title1", "content", "path"));
        tasks.add(new Task(2, "title2", "content", "path"));
        tasks.add(new Task(3, "title3", "content", "path"));

        return tasks;
    }


}
