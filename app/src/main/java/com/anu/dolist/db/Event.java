package com.anu.dolist.db;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.Ignore;
import androidx.room.Index;
import androidx.room.Insert;
import androidx.room.PrimaryKey;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;


/**
 * @author: Limin
 */
@Entity(tableName = "event",
        indices = {@Index("title"), @Index("location"), @Index("starts"), @Index("ends"), @Index("alert"), @Index("url"), @Index("notes")}
)
public class Event {

    // TODO: how to set composite primary key
//    @ColumnInfo(name = "eid")
//    public int id;

    @PrimaryKey
    @ColumnInfo(name = "title")
    @NotNull public String title;

    @ColumnInfo(name = "location")
    public String location;

    @ColumnInfo(name = "starts")
    public String starts;

    @ColumnInfo(name = "ends")
    public String ends;

    @ColumnInfo(name = "alert")
    public String alert;

    @ColumnInfo(name = "url")
    public String url;

    @ColumnInfo(name = "notes")
    public String notes;

    @ColumnInfo(name = "category")
    public Category category;

    public Event(@NotNull String title, String location, String starts, String ends, String alert, String url, String notes) {
        this.title = title;
        this.location = location;
        this.starts = starts;
        this.ends = ends;
        this.alert = alert;
        this.url = url;
        this.notes = notes;
    }

    /**
     * Error: Room cannot pick a constructor since multiple constructors are suitable.
     * use @Ignore to silence multiple constructor
     * @param title
     */
    @Ignore
    public Event(@NotNull String title) {
        this.title = title;
        this.location = "ANU";
        this.starts = "11 AM";
        this.ends = "1 PM";
        this.alert = "5 mins";
        this.url = "";
        this.notes = "Attend lab 5 and get marked";
    }
}


