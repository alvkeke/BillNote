package com.alvkeke.tools.bill;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import com.alvkeke.tools.bill.Components.SlidableListView;
import com.alvkeke.tools.bill.Data.BillItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<BillItem> bills = new ArrayList<>();

        for (int i = 1; i<20; i++)
        {
            int times = 100;
            if (i%2 == 0) times = -times;
            bills.add(new BillItem(i, 1, i*times, 1, 1));
        }

        final SlidableListView lv = findViewById(R.id.lv_bill_item);
        BillListAdapter adapter = new BillListAdapter(this, bills);
        lv.setAdapter(adapter);
        lv.setCallback(adapter);
        if (!lv.setSlideThreshold(0.15f))
        {
            Log.e("debug", "set threshold failed");
        }
    }
}
