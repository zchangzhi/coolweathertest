package com.coolweather.coolweathertest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private SwipeRefreshLayout swipeRefreshLayout;
    private int status = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*swipeRefreshLayout=findViewById(R.id.swipe_data);
        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                new ChooseAreaFragment(1,swipeRefreshLayout);
            }
        });*/

        /*Intent i =getIntent();
        status=i.getIntExtra("status",status);
        Log.d("zhouchangzhi", String.valueOf(status));
        if (status==1){
            refresh();
        }*/

        SharedPreferences prefs= PreferenceManager.getDefaultSharedPreferences(this);
        if (prefs.getString("weather",null)!=null){
            Intent intent =new Intent(this,WeatherActivity.class);
            startActivity(intent);
            finish();
        }
    }
   /* public void refresh(){
        finish();
        Intent intent = new Intent(MainActivity.this, MainActivity.class);
        startActivity(intent);
       //
        //finish();
    }*/

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}