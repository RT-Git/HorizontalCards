package com.wordpress.obliviouscode.horizontalcards;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LinearLayoutManager lLayout;
        List<ItemObject> rowListItem = getAllItemList();
        //No of items per row  is second argument
        lLayout = new LinearLayoutManager(MainActivity.this, LinearLayoutManager.HORIZONTAL, true);
        lLayout.setStackFromEnd(true);

        RecyclerView rView = (RecyclerView) findViewById(R.id.recycler_view);
        rView.setLayoutManager(lLayout);

        RecyclerViewAdapter rcAdapter = new RecyclerViewAdapter(MainActivity.this, rowListItem);
        rView.setAdapter(rcAdapter);
    }

    private List<ItemObject> getAllItemList() {

        List<ItemObject> allItems = new ArrayList<ItemObject>();
        allItems.add(new ItemObject("Physics", R.drawable.ic_access_time_black_90dp, "Total Time"));
        allItems.add(new ItemObject("Chemistry", R.drawable.ic_live_help_black_90dp, "Total Questions"));
        allItems.add(new ItemObject("Maths", R.drawable.ic_assignment_turned_in_black_90dp, "Maximum Marks"));
        allItems.add(new ItemObject("Random", R.drawable.ic_restore_black_90dp, "Previous Attempts"));
        return allItems;
    }
}
