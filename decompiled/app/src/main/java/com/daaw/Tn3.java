package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Tn3 {
    public static final boolean a;

    static {
        boolean z = false;
        if ("Amazon".equals(AbstractC9004vJ2.c)) {
            String str = AbstractC9004vJ2.d;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z = true;
            }
        }
        a = z;
    }
}
