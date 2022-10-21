package br.com.bq.calcarearange;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rangeAlturaSelectListener();
        rangeLarguraSelectListener();
    }

    public void calculaArea() {
        final EditText outputArea = findViewById(R.id.outputArea);
        final TextView textSeekBarLargura = findViewById(R.id.textSeekBarLargura);
        final TextView textSeekBarAltura = findViewById(R.id.textSeekBarAltura);
        double alturaDecimal = Double.parseDouble(textSeekBarAltura.getText().toString());
        double larguraDecimal = Double.parseDouble(textSeekBarLargura.getText().toString());
        double areaDecimal = alturaDecimal * larguraDecimal;
        outputArea.setText(Double.toString(areaDecimal));

    }

    public void rangeLarguraSelectListener() {
        SeekBar seekBarTest = findViewById(R.id.seekBar5);
        final TextView textSeekBarLargura = findViewById(R.id.textSeekBarLargura);
        seekBarTest.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                textSeekBarLargura.setText(String.valueOf(i));
                calculaArea();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }

    public void rangeAlturaSelectListener() {
        SeekBar seekBarTest = findViewById(R.id.seekBar3);
        final TextView textSeekBarAltura = findViewById(R.id.textSeekBarAltura);
        seekBarTest.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                textSeekBarAltura.setText(String.valueOf(i));
                calculaArea();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
}
