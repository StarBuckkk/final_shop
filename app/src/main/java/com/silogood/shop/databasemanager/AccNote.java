package com.silogood.shop.databasemanager;

public class AccNote {
    public static final String TABLE_NAME_ACC = "acc";

    public static final String COLUMN_ID = "id";
    public static final String COLUMN_NAME = "name";
    public static final String COLUMN_CODE = "code";
    public static final String COLUMN_BQT = "bqt";
    public static final String COLUMN_TIMESTAMP = "timestamp";

    private int id;
    private String name;
    private String code;
    private int bqt;
    private String timestamp;


    // Create table SQL query
    public static final String CREATE_TABLE_ACC =
            "CREATE TABLE " + TABLE_NAME_ACC + "("
                    + COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
                    + COLUMN_NAME + " TEXT,"
                    + COLUMN_CODE + " TEXT UNIQUE,"
                    + COLUMN_BQT + " INTEGER,"
                    + COLUMN_TIMESTAMP + " DATETIME DEFAULT CURRENT_TIMESTAMP"
                    + ")";

    public AccNote() {
    }

    public AccNote(int id, String name, String code , int bqt , String timestamp) {
        this.id = id;
        this.name = name;
        this.code = code;
        this.bqt = bqt;
        this.timestamp = timestamp;
    }

    public int getId() {
        return id;
    }
    public String getName() { return name; }
    public String getCode(){ return code; }
    public int getBqt(){ return bqt; }
    public String getTimestamp() { return timestamp; }

    public void setId(int id) {
        this.id = id;
    }
    public void setCode(String code) { this.code = code; }
    public void setName(String name){ this.name = name; }
    public void setBqt(int bqt) {
        this.bqt = bqt;
    }
    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }
}
