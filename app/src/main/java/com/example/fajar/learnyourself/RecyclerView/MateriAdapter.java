package com.example.fajar.learnyourself.RecyclerView;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.fajar.learnyourself.R;

import java.util.List;

/**
 * Created by Fajar on 6/5/2017.
 */

public class MateriAdapter extends RecyclerView.Adapter<MateriAdapter.MyViewHolder> {

    private List<MateriModel> materiList;
    Context context;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView icon;
        TextView title;
        TextView intro;
        TextView content;

        public MyViewHolder(View itemView) {
            super(itemView);
            icon = (ImageView) itemView.findViewById(R.id.icon);
            title = (TextView) itemView.findViewById(R.id.title);
            intro = (TextView) itemView.findViewById(R.id.intro);
            content = (TextView) itemView.findViewById(R.id.content);
        }
    }

    public MateriAdapter(Context context, List<MateriModel>materiList) {
        this.materiList = materiList;
        this.context = context;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate
                (R.layout.sample, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        final MateriModel materi = materiList.get(position);
        holder.icon.setImageResource(materi.getIcon());
        holder.title.setText(materi.getTitle());
        holder.intro.setText(materi.getIntro());
        holder.content.setText(materi.getContent());
    }

    @Override
    public int getItemCount() {
        return materiList.size();
    }
}
