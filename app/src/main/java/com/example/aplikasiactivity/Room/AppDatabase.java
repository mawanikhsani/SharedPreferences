package com.example.aplikasiactivity.Room;


import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {Mahasiswa.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
        public abstract MahasiswaDao userDao();
    }

