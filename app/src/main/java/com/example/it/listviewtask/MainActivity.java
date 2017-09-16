package com.example.it.listviewtask;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Button add;
    EditText e;
    ArrayList<Note> arrayOfNotes = new ArrayList<>();
    NotesAdapter adapter;
    CheckBox x;
    TextView t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        add = (Button) findViewById(R.id.add);
        e = (EditText) findViewById(R.id.nota);
        x = (CheckBox) findViewById(R.id.checkBox);
        t = (TextView) findViewById(R.id.status);
//        x.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
//                t.setText("Done");
//            }
//        });


        // Create the adapter to convert the array to views
        adapter = new NotesAdapter(this, arrayOfNotes);
        // Attach the adapter to a ListView
        ListView listView = (ListView) findViewById(R.id.myNotes);
        listView.setAdapter(adapter);


    }

    public void addItems(View v) {
        arrayOfNotes.add(new Note(e.getText().toString(), "Pending"));
        adapter.notifyDataSetChanged();
    }
    public void done(View v){
        if(x.isChecked()){
            t.setText("Done");
        }
        else t.setText("Pending");
    }
}
