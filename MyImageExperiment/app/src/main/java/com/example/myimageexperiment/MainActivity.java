package com.example.myimageexperiment;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private RelativeLayout layout;
    private int currentBackground = 1; // Track the current background

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        layout = findViewById(R.id.layout);
        Button switchBackgroundButton = findViewById(R.id.switchBackgroundButton);
        ImageButton imageButton = findViewById(R.id.imageButton);

        // Switch background on button click
        switchBackgroundButton.setOnClickListener(v -> {
            // Change the background without animation
            switch (currentBackground) {
                case 1:
                    layout.setBackgroundResource(R.drawable.background_image2);
                    currentBackground = 2;
                    break;
                case 2:
                    layout.setBackgroundResource(R.drawable.background_image3);
                    currentBackground = 3;
                    break;
                case 3:
                    layout.setBackgroundResource(R.drawable.background_image4);
                    currentBackground = 4;
                    break;
                default:
                    layout.setBackgroundResource(R.drawable.background_image1);
                    currentBackground = 1;
                    break;
            }
        });

        // Set up additional button click actions if needed
        imageButton.setOnClickListener(v -> {
            // Actions for the ImageButton (e.g., show a message)
        });
    }
}
