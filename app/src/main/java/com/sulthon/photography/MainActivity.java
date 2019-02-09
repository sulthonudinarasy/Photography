package com.sulthon.photography;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    private RelativeLayout relativeLoadiing;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        relativeLoadiing = findViewById(R.id.relative_loading);
        RecyclerView recycler = findViewById(R.id.recycler);
        recycler.setLayoutManager(new LinearLayoutManager(this));

        DataDummy dataDummy = new DataDummy();
        RecycleAdapter adapter = new RecycleAdapter(dataDummy);

        recycler.setAdapter(adapter);

    }
    private void showLoading(){
        relativeLoadiing.setVisibility(View.VISIBLE);

    }
    private void hideLoading(){

        relativeLoadiing.setVisibility(View.GONE);
    }

}
