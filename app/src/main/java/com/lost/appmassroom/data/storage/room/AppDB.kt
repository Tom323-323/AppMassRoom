package com.lost.appmassroom.data.storage.room

import androidx.room.Database
import androidx.room.RoomDatabase


@Database(entities = [EntityUser::class], version = 1)
abstract class AppDB: RoomDatabase() {
    abstract fun userEntityDao(): EntityUserDAO
}