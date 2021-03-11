package cn.edu.guet.coursetable.database;

import java.lang.System;

@androidx.room.Database(entities = {cn.edu.guet.coursetable.model.TermInfo.class, cn.edu.guet.coursetable.model.Account.class, cn.edu.guet.coursetable.model.Course.class, cn.edu.guet.coursetable.model.ExamData.class, cn.edu.guet.coursetable.model.Experimental.class}, version = 1)
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0005"}, d2 = {"Lcn/edu/guet/coursetable/database/AppDatabase;", "Landroidx/room/RoomDatabase;", "()V", "userDao", "Lcn/edu/guet/coursetable/database/Dao;", "app_release"})
public abstract class AppDatabase extends androidx.room.RoomDatabase {
    
    @org.jetbrains.annotations.NotNull()
    public abstract cn.edu.guet.coursetable.database.Dao userDao();
    
    public AppDatabase() {
        super();
    }
}