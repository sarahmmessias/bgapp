package com.example.pamiia2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ConstraintLayout bgElement = (ConstraintLayout) findViewById(R.id.activity_main);
        bgElement.setBackgroundColor(Color.RED);
        myButtonListenerMethod();
    }


    public void myButtonListenerMethod() {
        final Button button = (Button) findViewById(R.id.mybutton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ConstraintLayout bgElement = (ConstraintLayout) findViewById(R.id.activity_main);
                int color = ((ColorDrawable) bgElement.getBackground()).getColor();
                if (color == Color.BLUE) {
                    bgElement.setBackgroundColor(Color.RED);
                    button.setText("AZUL");
                    button.setTextColor(Color.BLUE);
                } else {
                    bgElement.setBackgroundColor(Color.BLUE);
                    button.setText("VERMELHO");
                    button.setTextColor(Color.RED);
                }
            }
        });
    }

}
