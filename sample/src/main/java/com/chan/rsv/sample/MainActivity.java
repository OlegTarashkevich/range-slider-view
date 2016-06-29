package com.chan.rsv.sample;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.github.channguyen.rsv.RangeSliderView;

public class MainActivity extends AppCompatActivity {

  private RangeSliderView largeSlider;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    largeSlider = (RangeSliderView) findViewById(R.id.rsv_large);
    final RangeSliderView.OnSlideListener listener = new RangeSliderView.OnSlideListener() {
      @Override
      public void onSlide(int index) {
        Toast.makeText(
                getApplicationContext(),
                "Hi index: " + index,
                Toast.LENGTH_SHORT)
                .show();
      }
    };
    largeSlider.setOnSlideListener(listener);

    largeSlider.setEmptyColor(Color.parseColor("#f2f2f2"));
    largeSlider.setLinesColor(Color.parseColor("#c1c1c1"));
    largeSlider.setSliderColor(Color.parseColor("#5986e5"));

    largeSlider.setInitialIndex(2);
    largeSlider.setLeftRange(1);
    largeSlider.setRightRange(3);

  }
}