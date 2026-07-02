package com.daaw;

/* JADX INFO: renamed from: com.daaw.lJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6205lJ {
    public static final Class a = c();

    public static C6484mJ a() {
        C6484mJ c6484mJB = b("getEmptyRegistry");
        return c6484mJB != null ? c6484mJB : C6484mJ.d;
    }

    public static final C6484mJ b(String str) {
        Class cls = a;
        if (cls == null) {
            return null;
        }
        try {
            return (C6484mJ) cls.getDeclaredMethod(str, null).invoke(null, null);
        } catch (Exception unused) {
            return null;
        }
    }

    public static Class c() {
        try {
            return Class.forName("com.google.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
