package com.daaw;

/* JADX INFO: renamed from: com.daaw.xb0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC9633xb0 {
    ERROR(40, "ERROR"),
    WARN(30, "WARN"),
    INFO(20, "INFO"),
    DEBUG(10, "DEBUG"),
    TRACE(0, "TRACE");

    public final int B;
    public final String C;

    EnumC9633xb0(int i, String str) {
        this.B = i;
        this.C = str;
    }

    public int c() {
        return this.B;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.C;
    }
}
