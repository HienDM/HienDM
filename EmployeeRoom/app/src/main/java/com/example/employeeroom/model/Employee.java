package com.example.employeeroom.model;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity
public class Employee {
    @PrimaryKey(autoGenerate = true)
    public long emPloyId;
    @ColumnInfo(name = "employee_name")
    public String name;

    public String designation;
}
