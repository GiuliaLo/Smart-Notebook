package com.example.prova2.database;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.support.annotation.NonNull;


import static android.arch.persistence.room.ForeignKey.CASCADE;

@Entity(tableName = "content_table", foreignKeys = @ForeignKey(entity = Notebook.class, parentColumns = "id", childColumns = "notebook", onDelete = CASCADE, onUpdate = CASCADE), primaryKeys = {"notebook", "file_number"})
public class NotebookContent {
    @ColumnInfo(name = "notebook")
    @NonNull
    private int notebook;

    @NonNull
    @ColumnInfo(name = "file_number")
    private int num;

    @ColumnInfo(name = "path")
    private String filePath;

    public NotebookContent(int notebook, String filePath) {this.notebook = notebook; this.filePath = filePath;}

    public int getNum() {return this.num;}

    public void setNum(int num) {this.num = num;}

    public int getNotebook() {return this.notebook;}

    public void setNotebook(int notebook) {this.notebook = notebook;}

    public String getFilePath() {return this.filePath;}

    public void setFilePath(String filePath) {this.filePath = filePath;}

}