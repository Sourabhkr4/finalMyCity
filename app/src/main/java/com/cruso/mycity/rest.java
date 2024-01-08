package com.cruso.mycity;

import android.content.Intent;
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

public class rest extends AppCompatActivity  implements  hotel_interface{



    ArrayList<hotel_model> h_model=new ArrayList<>();
    int [] img={R.drawable.salt,R.drawable.ministry,R.drawable.loya,R.drawable.durbar,R.drawable.nook,R.drawable.ounces,R.drawable.bangcafe};
    int [] icon1={R.drawable.takeaway,R.drawable.parking,R.drawable.dinein,R.drawable.takeaway,R.drawable.fooddelivery,R.drawable.takeaway,R.drawable.fooddelivery,};
    int [] icon2={R.drawable.dinein,R.drawable.dinein,R.drawable.parking,R.drawable.fooddelivery,R.drawable.takeaway,R.drawable.dinein,R.drawable.parking};
    int [] icon3={R.drawable.fooddelivery,R.drawable.takeaway,R.drawable.takeaway,R.drawable.parking,R.drawable.dinein,R.drawable.parking,R.drawable.dinein};


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
        String[] hotel_names=getResources().getStringArray(R.array.res_names);
        String[] hotel_dis=getResources().getStringArray(R.array.res_dis);
        String[] hotel_contact=getResources().getStringArray(R.array.res_contact);


        for( int i=0;i<hotel_names.length;i++){
            h_model.add(new hotel_model(hotel_names[i],hotel_dis[i],hotel_contact[i],img[i],icon1[i],icon2[i],icon3[i]));


        }
    }


    @Override
    public void onItemClick(int position) {
        Intent intent=new Intent(rest.this,hotel_dis.class );
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