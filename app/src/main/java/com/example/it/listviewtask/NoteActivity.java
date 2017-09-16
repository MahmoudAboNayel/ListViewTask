package com.example.it.listviewtask;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

/**
 * Created by it on 9/15/2017.
 */

public class NoteActivity extends AppCompatActivity {
    CheckBox x;
    TextView t;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.note_item);
        x = (CheckBox) findViewById(R.id.checkBox);
        t = (TextView) findViewById(R.id.status);
//        x.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
//                t.setText("Done");
//            }
//        });
    }
    public void checked(View v){
        if(x.isChecked()){
            t.setText("Done");
        }
        else t.setText("Pending");
    }
}

