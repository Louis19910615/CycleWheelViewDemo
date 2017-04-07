package louis.cyclewheelviewdemo;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import louis.cyclewheelviewlib.CycleWheelView;

public class MainActivity extends AppCompatActivity {

    private CycleWheelView cycleWheelView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cycleWheelView2 = (CycleWheelView) findViewById(R.id.cycleWheelView2);
        List<String> labels2 = new ArrayList<>();
        labels2.add("AQI");
        labels2.add("CO");
        labels2.add("NO²");
        labels2.add("PM2.5");
        labels2.add("PM10");
        labels2.add("SO²");
        labels2.add("O³");

        cycleWheelView2.setLabels(labels2);
        try {
            cycleWheelView2.setWheelSize(7);
        } catch (CycleWheelView.CycleWheelViewException e) {
            e.printStackTrace();
        }
        cycleWheelView2.setCycleEnable(true);
        cycleWheelView2.setSelection(3);
        cycleWheelView2.setAlphaGradual(1.0f);
        cycleWheelView2.setDivider(Color.TRANSPARENT, 2);
        cycleWheelView2.setSolid(Color.TRANSPARENT,Color.TRANSPARENT);
        cycleWheelView2.setLabelColor(Color.argb(76, 255, 255, 255));
        cycleWheelView2.setLabelSelectColor(Color.WHITE);
        cycleWheelView2.setOnWheelItemSelectedListener(new CycleWheelView.WheelItemSelectedListener() {
            @Override
            public void onItemSelected(int position, String label) {
                Log.d("test", label);
            }
        });
    }
}
