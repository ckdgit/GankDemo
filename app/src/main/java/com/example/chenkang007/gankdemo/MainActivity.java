package com.example.chenkang007.gankdemo;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.Toast;

import java.util.Calendar;
import java.util.Date;

public class MainActivity extends Activity {

  Button btDate,btSearch;
  Calendar calendar;
  private int myear, mmonth, mday;
  private Date date = new Date();
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    btDate = findViewById(R.id.bt_showDate);
    btSearch = findViewById(R.id.bt_search);

    getDate();
    btDate.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        new DatePickerDialog(MainActivity.this, new DatePickerDialog.OnDateSetListener() {
          @Override
          public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
            myear = year;
            mmonth = ++month;
            mday = dayOfMonth;
            Toast.makeText( MainActivity.this,"" + year +"-" + (++month) + "-"+ dayOfMonth, Toast.LENGTH_LONG).show();
          }
        }, myear, mmonth, mday).show();
      }
    });
    btSearch.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {

      }
    });
  }

  private void getDate() {
    calendar = Calendar.getInstance();
    myear = calendar.get(Calendar.YEAR);
    mmonth = calendar.get(Calendar.MONTH);
    mday = calendar.get(Calendar.DAY_OF_MONTH);
  }
}
