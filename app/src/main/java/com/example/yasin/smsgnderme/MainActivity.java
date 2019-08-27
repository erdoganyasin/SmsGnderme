    package com.example.yasin.smsgnderme;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

    public class MainActivity extends AppCompatActivity {

    List<Model> list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListeDoldur();
        Tanımla();
    }


    public void ListeDoldur()
    {
        list = new ArrayList<>();
        Model m1 = new Model("murat","00000");
        Model m2 = new Model("basar","1111111");
        Model m3 = new Model("yasin","333333");
        Model m4 = new Model("tamer","444444");
        Model m5 = new Model("erdi","555555");

        list.add(m1);
        list.add(m2);
        list.add(m3);
        list.add(m4);
        list.add(m5);



    }

    public void Tanımla()
    {
        ListView listView = findViewById(R.id.mesajList);
        adapter adapter = new adapter(list,this,this);
        listView.setAdapter(adapter);
    }
}
