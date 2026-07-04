package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public final class IJ2 {
    public final String a;
    public final String b;

    public IJ2(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public static IJ2 a(String str, String str2) {
        AbstractC7885rK2.a(str, "Name is null or empty");
        AbstractC7885rK2.a(str2, "Version is null or empty");
        return new IJ2(str, str2);
    }

    public final String b() {
        return this.a;
    }

    public final String c() {
        return this.b;
    }
}
