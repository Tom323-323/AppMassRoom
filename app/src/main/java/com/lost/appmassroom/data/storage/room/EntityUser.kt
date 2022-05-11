package com.lost.appmassroom.data.storage.room

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "UserData")
data class EntityUser (
    @PrimaryKey (autoGenerate = true) val id: Long = 0,
    @ColumnInfo (name = "idData") val idData: String?,
    @ColumnInfo (name = "email") val email: String?,
    @ColumnInfo (name = "password") val password: String?

    )