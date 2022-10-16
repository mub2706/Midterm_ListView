package com.college.listviewtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

/*
    This application displays an array of items in a  Listview
    When the user clicks on the 'Add' Button:
            the Counter is incremented
            An an item is added to the list
            The listview display the latet values of the list

    The code below is incomplete.

    TODO:
    Complete the code to achieve the expected result

 */
public class MainActivity extends AppCompatActivity {

    //Counter to generate integers in the ArrayList
    private Integer mCounter = 0;

    //Array of items to display in listview
    private ArrayList<Integer> myItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Get the listview in the layout
        ListView  myListView = findViewById(R.id.listviewId);

        //Access the button in the layout
        Button addBtn = findViewById(R.id.addBtnId);

        //Create the adapter
        ArrayAdapter<Integer> myAdapter = new ArrayAdapter<>(this,
                                        android.R.layout.simple_expandable_list_item_1,
                                        myItems);

        addBtn.setOnClickListener( c -> {
            myItems.add( mCounter++ );

        });

    }
}