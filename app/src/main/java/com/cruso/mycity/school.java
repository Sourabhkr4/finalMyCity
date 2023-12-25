package com.cruso.mycity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.cruso.mycity.R;

public class school extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_school);
        TextView p=findViewById(R.id.schoollocation);
        p.setMovementMethod(LinkMovementMethod.getInstance());

        // Ensure that the transition name matches the one in activity_next.xml
        ImageView imageView=findViewById(R.id.school);
        imageView.setTransitionName("sharedImage");
    }
}
