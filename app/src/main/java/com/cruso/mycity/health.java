package com.cruso.mycity;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class health extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_health);
        TextView fortis=findViewById(R.id.hospitallocation);
        fortis.setMovementMethod(LinkMovementMethod.getInstance());


        // Ensure that the transition name matches the one in activity_next.xml
        ImageView imageView=findViewById(R.id.health);
        imageView.setTransitionName("sharedImage");
    }
}
