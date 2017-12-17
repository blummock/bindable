package com.my.mad7m_000.bindabledata;

import android.databinding.DataBindingUtil;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.SeekBar;

import com.my.mad7m_000.bindabledata.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity  extends AppCompatActivity {

    SeekBar seekBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        final Counter counter = new Counter(0);
        final List<String> numbers = new ArrayList(Arrays.asList("ноль","один", "два", "три", "четыре", "пять", "шесть"));
        final List<Integer> colors = new ArrayList(Arrays.asList(Color.RED, Color.GRAY, Color.BLUE, Color.GREEN,
                Color.MAGENTA, Color.YELLOW, Color.BLACK));
        binding.setCounter(counter);
        binding.setNumbers(numbers);
        binding.setColors(colors);

        seekBar = (SeekBar) findViewById(R.id.seekBar);
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                counter.setCount(progress);
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
