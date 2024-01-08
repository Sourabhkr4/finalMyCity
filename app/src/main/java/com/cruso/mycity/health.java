package com.cruso.mycity;

import android.content.Intent;
import android.graphics.drawable.Icon;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

import android.widget.TextView;
import android.widget.Toast;


import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class health extends AppCompatActivity  implements  hotel_interface{



    ArrayList<hotel_model> h_model=new ArrayList<>();
    int [] img={R.drawable.altius,R.drawable.apollo,R.drawable.aster,R.drawable.baptist};
    int [] icon1={R.drawable.surgeon,R.drawable.drug,R.drawable.canteen,R.drawable.drug};
    int [] icon2={R.drawable.ambulance,R.drawable.ambulance,R.drawable.ambulance,R.drawable.ambulance};
    int [] icon3={R.drawable.parking,R.drawable.parking,R.drawable.parking,R.drawable.parking};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotels);






        // Ensure that the transition name matches the one in activity_next.xml
        ImageView imageView = findViewById(R.id.hotel);
        imageView.setTransitionName("sharedImage");
        RecyclerView recyclerView=findViewById(R.id.hotellist);

        setUpHotelModel();
        hotelAdapter adapter=new hotelAdapter(this,h_model,this);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        recyclerView.setAdapter(adapter);
    }



    private  void setUpHotelModel(){
        String[] hotel_names=getResources().getStringArray(R.array.hos_names);
        String[] hotel_dis=getResources().getStringArray(R.array.hos_dis);
        String[] hotel_contact=getResources().getStringArray(R.array.hos_contact);


        for( int i=0;i<hotel_names.length;i++){
            h_model.add(new hotel_model(hotel_names[i],hotel_dis[i],hotel_contact[i],img[i],icon1[i],icon2[i],icon3[3]));


        }
    }


    @Override
    public void onItemClick(int position) {
        Intent intent=new Intent(health.this,hotel_dis.class );
        intent.putExtra("Name",h_model.get(position).getHotel_name());
        intent.putExtra("Dis",h_model.get(position).getHotelDes());
        intent.putExtra("Contact",h_model.get(position).getHotelContact());
        intent.putExtra("Image",h_model.get(position).getImg());

        intent.putExtra("Icon1",h_model.get(position).getIcon1());
        intent.putExtra("Icon2",h_model.get(position).getIcon2());
        intent.putExtra("Icon3",h_model.get(position).getIcon3());

        startActivity(intent);


    }



}