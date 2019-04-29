package com.example.reorder;

import android.provider.ContactsContract;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class MenuAdapter extends RecyclerView.Adapter<MenuAdapter.ViewHolder> {
    private ArrayList<MenuData>listData=new ArrayList<>();


    @NonNull
    @Override
    public MenuAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.menu,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MenuAdapter.ViewHolder viewHolder, int position) {
        viewHolder.tv_menu_name.setText(MenuData.getMenu_name());
        viewHolder.tv_menu_price.setText(Integer.toString(MenuData.getMenu_price()));
        viewHolder.tv_menu_info.setText(MenuData.getMenu_info());
        //viewHolder.onBind(listData.get(position));

    }

    @Override
    public int getItemCount() {
        return listData.size();
    }

    void addItem(MenuData data){
        listData.add(data);
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView tv_menu_name;
        private TextView tv_menu_price;
        private TextView tv_menu_info;

        ViewHolder(View itemView){
            super(itemView);

            tv_menu_name=itemView.findViewById(R.id.tv_menu_name);
            tv_menu_price=itemView.findViewById(R.id.tv_menu_price);
            tv_menu_info=itemView.findViewById(R.id.tv_menu_info);
        }
//        void onBind(MenuData data){
//            tv_menu_name.setText(data.getMenu_name);
//            tv_menu_price.setText(data.getMenu_price);
//            tv_menu_info.setText(data.getMenu_info);
//        }
    }
}
