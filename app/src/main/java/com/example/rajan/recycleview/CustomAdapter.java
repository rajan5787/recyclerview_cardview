package com.example.rajan.recycleview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by Rajan on 2/20/2016.
 */
public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.Viewholder>{

    private ArrayList<Contact_info> mArrayList;
    CustomAdapter(ArrayList<Contact_info> mArrayList){
        this.mArrayList=mArrayList;
    }
    @Override
    public CustomAdapter.Viewholder onCreateViewHolder(final ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview,parent,false);

        return new CustomAdapter.Viewholder(view);
    }
    @Override
    public void onBindViewHolder(CustomAdapter.Viewholder holder, int position) {


        Contact_info mContact_info=mArrayList.get(position);
        holder.vName.setText("Name:"+mContact_info.name);
        holder.vSurname.setText("Id: "+mContact_info.id);
        holder.vEmail.setText("Number: "+mContact_info.number);
        holder.vTitle.setText("Member");

    }

    @Override
    public int getItemCount()
    {
        return mArrayList.size();
    }

    public class Viewholder extends RecyclerView.ViewHolder
    {
        protected TextView vName;
        protected TextView vSurname;
        protected TextView vEmail;
        protected TextView vTitle;

        public Viewholder(View v)
        {
            super(v);
            vName =  (TextView) v.findViewById(R.id.txtName);
            vSurname = (TextView)  v.findViewById(R.id.txtid);
            vEmail = (TextView)  v.findViewById(R.id.txtnumber);
            vTitle = (TextView) v.findViewById(R.id.title);
        }
    }
}
