package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public enum HJ2 {
    NATIVE("native"),
    JAVASCRIPT("javascript"),
    NONE("none");

    public final String B;

    HJ2(String str) {
        this.B = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.B;
    }
}
