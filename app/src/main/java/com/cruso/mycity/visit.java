package com.cruso.mycity;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class visit extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visit);
        TextView p=findViewById(R.id.palacelocation);
        p.setMovementMethod(LinkMovementMethod.getInstance());

        // Ensure that the transition name matches the one in activity_next.xml
        ImageView imageView=findViewById(R.id.visit);
        imageView.setTransitionName("sharedImage");
    }
}
