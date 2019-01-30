package com.simplymadeapps.simple_logger_android;


import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

@Database(entities = {RecordedLog.class}, version = 1)
public abstract class RecordedLogDatabase extends RoomDatabase {
    public abstract RecordedLogDao recordedLogDao();
}