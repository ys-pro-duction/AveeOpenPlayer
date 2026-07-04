package com.daaw;

import android.os.Parcel;

/* JADX INFO: loaded from: classes3.dex */
public abstract class DS1 {
    public static final ClassLoader a = DS1.class.getClassLoader();

    public static void a(Parcel parcel, boolean z) {
        parcel.writeInt(1);
    }

    public static boolean b(Parcel parcel) {
        return parcel.readInt() != 0;
    }
}
