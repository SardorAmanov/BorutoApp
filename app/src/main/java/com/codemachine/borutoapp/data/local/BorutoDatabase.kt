package com.codemachine.borutoapp.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.codemachine.borutoapp.data.local.dao.HeroDao
import com.codemachine.borutoapp.data.local.dao.HeroRemoteKeyDao
import com.codemachine.borutoapp.domain.model.Hero
import com.codemachine.borutoapp.domain.model.HeroRemoteKey

@Database(entities = [Hero::class, HeroRemoteKey::class], version = 3)
@TypeConverters(DatabaseConverter::class)
abstract class BorutoDatabase : RoomDatabase() {

    abstract fun heroDao(): HeroDao
    abstract fun heroRemoteKeyDao(): HeroRemoteKeyDao
}