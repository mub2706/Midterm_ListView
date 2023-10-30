package com.college.listviewcounter;

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
            An item is added to the list
            The listview display the latest values of the list

    The code below is incomplete.

    TODO:
    Complete the code to achieve the expected result

 */
public class MainActivity extends AppCompatActivity {

    //Counter to generate integers in the ArrayList
    private Integer myCounter = 0;

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

        //TODO:Create the ArrayList

        //Create the adapter
        ArrayAdapter<Integer> myAdapter = new ArrayAdapter<>(this,
                                        android.R.layout.simple_expandable_list_item_1,
                                        myItems);

        //TODO:Set the adapter to the listview


        //TODO:
        //When the button is clicked, the counter is incremented
        //and the new value is added to the list
        //The listview is updated to display the new values
        addBtn.setOnClickListener( c -> {
            myItems.add( myCounter++ );

        });

    }
}