package com.example.seekbar2;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myButtonListenerMethod();
        btnImagem();

        final ImageView imagemDado = findViewById(R.id.imagemDado);
        SeekBar seekBar = findViewById(R.id.slide);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                float scale = ((i / 100.0f) + 1);
                imagemDado.setScaleX(scale);
                imagemDado.setScaleY(scale);

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                imagemDado.setVisibility(View.VISIBLE);
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                imagemDado.setVisibility(View.INVISIBLE);
            }
        });

    }

    public void btnImagem() {
        Button btn = findViewById(R.id.showImg);
        final ImageView imagemDado = findViewById(R.id.imagemDado);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imagemDado.setVisibility(View.VISIBLE);
            }
        });
    }



    public void myButtonListenerMethod(){
        Button botao = findViewById(R.id.botaoRolarDado);
        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random rand = new Random();
                int resultadoRand = rand.nextInt(6) + 1;
                TextView textoRetorno = findViewById(R.id.resultadoDado);
                textoRetorno.setText("Resultado: " + Integer.toString(resultadoRand));
                ImageView imagemDado = findViewById(R.id.imagemDado);
                switch (resultadoRand){
                    case 1:
                        imagemDado.setImageResource(R.drawable.f1);
                        break;
                    case 2:
                        imagemDado.setImageResource(R.drawable.f2);
                        break;
                    case 3:
                        imagemDado.setImageResource(R.drawable.f3);
                        break;
                    case 4:
                        imagemDado.setImageResource(R.drawable.f4);
                        break;
                    case 5:
                        imagemDado.setImageResource(R.drawable.f5);
                        break;
                    case 6:
                        imagemDado.setImageResource(R.drawable.f6);
                        break;
                }
            }
        });
    }
}
