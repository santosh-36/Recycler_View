package com.santosh.android.recycler_card_views;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder>{

    private List<list_item> list_items;
    private Context context;

    public MyAdapter(List<list_item> list_items, Context context) {
        this.list_items = list_items;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item, parent,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        list_item listItem = list_items.get(position);
        holder.name1.setText(listItem.getName1());
        holder.contact.setText(listItem.getContact());
        holder.age.setText(listItem.getAge());
        holder.gender.setText(listItem.getGender());

    }

    @Override
    public int getItemCount() {
        return list_items.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        public TextView name1;
        public TextView contact;
        public TextView age;
        public TextView gender;


        public ViewHolder(View itemView) {
            super(itemView);

            name1 = (TextView) itemView.findViewById(R.id.tv_name1);
            contact = (TextView) itemView.findViewById(R.id.tv_contact);
            age = (TextView) itemView.findViewById(R.id.tv_age);
            gender = (TextView) itemView.findViewById(R.id.tv_gender);

        }
    }
}
