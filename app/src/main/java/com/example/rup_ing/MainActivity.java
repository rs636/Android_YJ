package com.example.rup_ing;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity{

    private Button btn_garden, btn_main,btn_menu;
    private MainFragmentActivity fragment_main;
    private MenuFragmentActivity fragment_menu;
    private GardenFragmentActivity fragment_garden;
    private FragmentManager fm;
    private FragmentTransaction transaction;
    private Button btn_count;
    int count=0;
    private ImageView im_plant;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        Log.d("메인 액티비티","메인 액티비티!");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        fm=getSupportFragmentManager();

        fragment_main=new MainFragmentActivity();

        transaction=fm.beginTransaction();
        transaction.replace(R.id.framelayout,fragment_main).commitAllowingStateLoss();

        btn_main=(Button)findViewById(R.id.btn_main);
        btn_garden=(Button)findViewById(R.id.btn_garden);
        btn_menu=(Button)findViewById(R.id.btn_menu);

        btn_main.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().replace(R.id.framelayout,new MainFragmentActivity()).commit();
            }

        });

        btn_menu.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().replace(R.id.framelayout,new MenuFragmentActivity()).commit();
            }
        });

        btn_garden.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().replace(R.id.framelayout,new GardenFragmentActivity()).commit();
            }
        });

    }

}
