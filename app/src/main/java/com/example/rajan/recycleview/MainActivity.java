package com.example.rajan.recycleview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView mRecyclerView;
    ArrayList<Contact_info> result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRecyclerView=(RecyclerView)findViewById(R.id.cardList);
        mRecyclerView.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        mRecyclerView.setLayoutManager(linearLayoutManager);

        CustomAdapter customAdapter=new CustomAdapter(create_list());
        mRecyclerView.setAdapter(customAdapter);


    }

    public ArrayList<Contact_info> create_list()
    {
        result = new ArrayList<Contact_info>();
        result.add(new Contact_info("Akar","1","123456789"));
        result.add(new Contact_info("Rajan","2","12345678"));
        result.add(new Contact_info("Nishit","3","1234569"));
        result.add(new Contact_info("Milap","4","12345789"));
        result.add(new Contact_info("Tirth","5","1236789"));
        result.add(new Contact_info("Urvashi","6","12789"));


        return result;
    }


}
