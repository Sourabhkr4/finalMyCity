package com.cruso.mycity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.ImageView;
import android.widget.TextView;

public class hotel_dis extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel_dis);
        String name=getIntent().getStringExtra("Name");
        String dis=getIntent().getStringExtra("Dis");
        String contact=getIntent().getStringExtra("Contact");


        int img=getIntent().getIntExtra("Image",0);
        int icon1=getIntent().getIntExtra("Icon1",0);
        int icon2=getIntent().getIntExtra("Icon2",0);
        int icon3=getIntent().getIntExtra("Icon3",0);

        TextView loc1=findViewById(R.id.location1);
        loc1.setMovementMethod(LinkMovementMethod.getInstance());


        TextView h_name=findViewById(R.id.textView5);
        ImageView imageView=findViewById(R.id.imageView2);
        TextView h_dis=findViewById(R.id.textView2);
        TextView h_contact=findViewById(R.id.textView10);
        ImageView iconView1=findViewById(R.id.imageView5);
        ImageView iconView2=findViewById(R.id.imageView6);
        ImageView iconView3=findViewById(R.id.imageView7);


        h_name.setText(name);
        h_dis.setText(dis);
        h_contact.setText(contact);
        imageView.setImageResource(img);
        iconView1.setImageResource(icon1);
        iconView2.setImageResource(icon2);
        iconView3.setImageResource(icon3);



    }
}