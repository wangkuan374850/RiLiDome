package com.example.wangkuan.rilidome;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.prolificinteractive.materialcalendarview.CalendarDay;
import com.prolificinteractive.materialcalendarview.MaterialCalendarView;
import com.prolificinteractive.materialcalendarview.OnDateSelectedListener;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MaterialCalendarView rl = (MaterialCalendarView) findViewById(R.id.a1);
        //点击日历的监听以及获取时间
        rl.setOnDateChangedListener(new OnDateSelectedListener() {
            @Override
            public void onDateSelected(MaterialCalendarView widget, CalendarDay date, boolean selected) {
                int mYear = date.getYear();
                int mMonth = date.getMonth() + 1;
                int mDay = date.getDay();

                Toast.makeText(MainActivity.this, mYear + "年" + (mMonth) + "月" + mDay + "日", Toast.LENGTH_SHORT).show();

            }
        });

    }
}
