
package com.acadgild.fujitsu.assignment4session1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Switch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import static java.util.Collections.sort;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ListView morderview;
    private Adapter mNameAdapter;

    private ArrayList<String> dummydata;
    Button mascendingbtn, mdescendingbtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mascendingbtn = (Button) findViewById(R.id.ascending_btn);
        mdescendingbtn = (Button) findViewById(R.id.descending_btn);
        mdescendingbtn.setOnClickListener(this);
        mascendingbtn.setOnClickListener(this);

        morderview = (ListView) findViewById(R.id.order_view);

        dummydata = new ArrayList<>();
        dummydata.add("Jan");
        dummydata.add("feb");
        dummydata.add("march");
        dummydata.add("april");
        dummydata.add("may");
        dummydata.add("jun");
        dummydata.add("july");
        dummydata.add("august");
        dummydata.add("sept");
        dummydata.add("oct");
        dummydata.add("nov");

        mNameAdapter = new Adapter(MainActivity.this, dummydata);

        morderview.setAdapter(mNameAdapter);


    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.ascending_btn:



                 Collections.sort(dummydata);

                mNameAdapter = new Adapter(MainActivity.this, dummydata);

                morderview.setAdapter(mNameAdapter);

                break;

            case R.id.descending_btn:


                Comparator comparator = Collections.reverseOrder();
                Collections.sort(dummydata,comparator);

                mNameAdapter = new Adapter(MainActivity.this, dummydata);

                morderview.setAdapter(mNameAdapter);

                break;


        }
    }

}