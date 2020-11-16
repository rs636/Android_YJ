package com.example.rup_ing;

import android.media.Image;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class MainFragmentActivity extends Fragment {

    private Button btn_count;
    private ImageView image_plant;
    int count=0;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.main_fragment,container,false);

        btn_count=(Button)view.findViewById(R.id.btn_count);
        image_plant=(ImageView)view.findViewById(R.id.im_plant);

        btn_count.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                count=count+1;
                if(count<=10){
                    image_plant.setImageResource(R.drawable.plant1);
                }
                else if(count>10 && count<=20){
                    image_plant.setImageResource(R.drawable.plant2);
                }
                else if(count>20 && count<=30){
                    image_plant.setImageResource(R.drawable.plant3);
                }
                else if(count>30 && count<=40){
                    image_plant.setImageResource(R.drawable.plant4);
                }
                else{
                    image_plant.setImageResource(R.drawable.plant5);
                }
            }
        });



        return view;
    }




}
