package com.example.clickcounter;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.example.clickcounter.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    int count, count2, count3, count4, countAll;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());



        // botones de sumar
        binding.augmentar1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                countAll++;
                binding.contador1.setText(String.valueOf(count));
                binding.contadorAll.setText(String.valueOf(countAll));
            }
        });

        binding.augmentar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count2++;
                countAll++;
                binding.contador2.setText(String.valueOf(count2));
                binding.contadorAll.setText(String.valueOf(countAll));
            }
        });

        binding.augmentar3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count3++;
                countAll++;
                binding.contador3.setText(String.valueOf(count3));
                binding.contadorAll.setText(String.valueOf(countAll));
            }
        });

        binding.augmentar4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count4++;
                countAll++;
                binding.contador4.setText(String.valueOf(count4));
                binding.contadorAll.setText(String.valueOf(countAll));
            }
        });

        // botones reset

        binding.reset1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                countAll = countAll - count;
                binding.contadorAll.setText(String.valueOf(countAll));
                count = 0;
                binding.contador1.setText(String.valueOf(count));

            }
        });

        binding.reset2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                countAll = countAll - count2;
                binding.contadorAll.setText(String.valueOf(countAll));
                count2 = 0;
                binding.contador2.setText(String.valueOf(count2));

            }
        });

        binding.reset3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                countAll = countAll - count3;
                binding.contadorAll.setText(String.valueOf(countAll));
                count3 = 0;
                binding.contador3.setText(String.valueOf(count3));

            }
        });

        binding.reset4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                countAll = countAll - count4;
                binding.contadorAll.setText(String.valueOf(countAll));
                count4 = 0;
                binding.contador4.setText(String.valueOf(count4));

            }
        });

        binding.resetAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count = 0;
                count2 = 0;
                count3 = 0;
                count4= 0;
                countAll = 0;
                binding.contador1.setText(String.valueOf(count));
                binding.contador2.setText(String.valueOf(count2));
                binding.contador3.setText(String.valueOf(count3));
                binding.contador4.setText(String.valueOf(count4));
                binding.contadorAll.setText(String.valueOf(countAll));

            }
        });


            }
        }
