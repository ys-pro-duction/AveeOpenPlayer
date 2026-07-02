package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public abstract class T73 {
    public static T73 b(Class cls) {
        return System.getProperty("java.vm.name").equalsIgnoreCase("Dalvik") ? new O73(cls.getSimpleName()) : new Q73(cls.getSimpleName());
    }

    public abstract void a(String str);
}
