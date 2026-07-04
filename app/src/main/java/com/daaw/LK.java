package com.daaw;

/* JADX INFO: loaded from: classes.dex */
public enum LK {
    JSON(".json"),
    ZIP(".zip");

    public final String B;

    LK(String str) {
        this.B = str;
    }

    public String a() {
        return ".temp" + this.B;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.B;
    }
}
