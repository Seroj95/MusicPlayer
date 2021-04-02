package com.sun.cnn.ui.db

import androidx.room.TypeConverter
import com.sun.cnn.ui.models.Source

class Converters {
    @TypeConverter
    fun fromSource(source: Source): String {
        return source.name
    }
    @TypeConverter
    fun toSource(name:String): Source {
        return Source(name,name)
    }
}