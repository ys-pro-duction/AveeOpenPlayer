package com.daaw;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class J01 {
    public static final int a = Runtime.getRuntime().availableProcessors();

    public static final int a() {
        return a;
    }

    public static final String b(String str) {
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }
}
