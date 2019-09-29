package com.nixon.todolist.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.nixon.todolist.R;
import com.nixon.todolist.databinding.RvItemLayoutBinding;
import com.nixon.todolist.model.Task;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Drygin Nikita on 29,Сентябрь,2019
 */
public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder> {

    private List<Task> taskList;

    public RecyclerAdapter(List<Task> taskList) {
        this.taskList = taskList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        RvItemLayoutBinding itemLayoutBinding = DataBindingUtil.inflate(
                LayoutInflater.from(parent.getContext()), R.layout.rv_item_layout, parent, false);

        return new MyViewHolder(itemLayoutBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        Task task = taskList.get(position);
        holder.itemLayoutBinding.setTask(task);
    }


    @Override
    public int getItemCount() {
        return taskList.size();
    }

    static class MyViewHolder extends RecyclerView.ViewHolder {

        RvItemLayoutBinding itemLayoutBinding;
        MyViewHolder(@NonNull RvItemLayoutBinding itemView) {
            super(itemView.getRoot());
            itemLayoutBinding = itemView;
        }
    }
}
