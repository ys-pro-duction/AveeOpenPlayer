package com.daaw;

/* JADX INFO: renamed from: com.daaw.Vf1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2533Vf1 {
    public final int a;
    public final boolean b;

    public C2533Vf1(int i) {
        this.a = i;
        this.b = true;
    }

    public static boolean a(AbstractC8699uF abstractC8699uF, String str, String str2) {
        return abstractC8699uF.h().equals(str) && b(abstractC8699uF.i(), str2);
    }

    public static boolean b(String str, String str2) {
        if (str.length() == 0 && str2.equals("10")) {
            return true;
        }
        if (str.equals("10") && str2.length() == 0) {
            return true;
        }
        return str.equals(str2);
    }

    public C2533Vf1(int i, boolean z) {
        this.a = i;
        this.b = z;
    }
}
