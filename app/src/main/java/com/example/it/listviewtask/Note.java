package com.example.it.listviewtask;

import android.widget.CheckBox;

/**
 * Created by it on 9/14/2017.
 */

public class Note {
    String note;
    String status;
    CheckBox c;

    public CheckBox getC() {
        return c;
    }

    public void setC(CheckBox c) {
        this.c = c;
    }

    public Note(String note, String status) {
        this.note = note;
        this.status = status;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}