package com.beastek.tareas;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.Date;


public class Note {

    private String mTitle;
    private String mDescription;
    private boolean mIdea;
    private boolean mTodo;
    private boolean mImportant;
    private boolean mHasReminder;
    private Date mToDoDate;


    private static final String JSON_TITLE = "title";
    private static final String JSON_DESCRIPTION = "description";
    private static final String JSON_IDEA = "idea";
    private static final String JSON_TODO = "todo";
    private static final String JSON_IMPORTANT = "important";
    private static final String JSON_HASREMINDER = "reminder";
    private static final String JSON_DATETIME = "datetime";


    //Constructor base vacío
    public Note(){

    }

    //Constructor para crear una nota a partir de un objeto JSON
    public Note(JSONObject jo) throws JSONException{
        mTitle = jo.getString(JSON_TITLE);
        mDescription = jo.getString(JSON_DESCRIPTION);
        mIdea = jo.getBoolean(JSON_IDEA);
        mTodo = jo.getBoolean(JSON_TODO);
        mImportant = jo.getBoolean(JSON_IMPORTANT);
        mHasReminder = jo.getBoolean(JSON_HASREMINDER);
        if (jo.has(JSON_DATETIME)) {
            mToDoDate = new Date(jo.getLong(JSON_DATETIME));
        }

    }


    //El método toma las 7 variables de la nota y las serializa en un objeto tipo JSON
    public JSONObject convertNoteToJSON() throws JSONException{

        JSONObject jo = new JSONObject();

        jo.put(JSON_TITLE, mTitle);
        jo.put(JSON_DESCRIPTION, mDescription);
        jo.put(JSON_IDEA, mIdea);
        jo.put(JSON_TODO, mTodo);
        jo.put(JSON_IMPORTANT, mImportant);
        jo.put(JSON_HASREMINDER, mHasReminder);
        if (mToDoDate != null) {
            jo.put(JSON_DATETIME, mToDoDate.getTime());
        }

        return jo;
    }


    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String mDescription) {
        this.mDescription = mDescription;
    }

    public boolean isIdea() {
        return mIdea;
    }

    public void setIdea(boolean mIdea) {
        this.mIdea = mIdea;
    }

    public boolean isTodo() {
        return mTodo;
    }

    public void setTodo(boolean mTodo) {
        this.mTodo = mTodo;
    }

    public boolean isImportant() {
        return mImportant;
    }

    public void setImportant(boolean mImportant) {
        this.mImportant = mImportant;
    }

    public boolean HasReminder() {
        return mHasReminder;
    }

    public void setReminder(boolean mHasReminder) {
        this.mHasReminder = mHasReminder;
    }

    public Date getToDoDate() {
        return mToDoDate;
    }


    public void setToDoDate(Date mToDoDate) {
        this.mToDoDate = mToDoDate;
    }

}