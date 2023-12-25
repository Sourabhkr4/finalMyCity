package com.cruso.mycity;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.cruso.mycity.R;

public class about extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        // Ensure that the transition name matches the one in activity_next.xml
        ImageView imageView=findViewById(R.id.about);
        imageView.setTransitionName("sharedImage");
    }
}
