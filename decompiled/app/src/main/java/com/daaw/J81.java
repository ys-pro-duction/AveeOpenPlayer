package com.daaw;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class J81 {
    public static final J81 C = new J81("IN", 0, "in");
    public static final J81 D = new J81("OUT", 1, "out");
    public static final J81 E = new J81("INV", 2, "");
    public static final /* synthetic */ J81[] F;
    public static final /* synthetic */ YG G;
    public final String B;

    static {
        J81[] j81ArrA = a();
        F = j81ArrA;
        G = AbstractC3110aH.a(j81ArrA);
    }

    public J81(String str, int i, String str2) {
        this.B = str2;
    }

    public static final /* synthetic */ J81[] a() {
        return new J81[]{C, D, E};
    }

    public static J81 valueOf(String str) {
        return (J81) Enum.valueOf(J81.class, str);
    }

    public static J81[] values() {
        return (J81[]) F.clone();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.B;
    }
}
