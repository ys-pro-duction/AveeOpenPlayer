package com.daaw;

/* JADX INFO: renamed from: com.daaw.dw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4129dw {
    public final C3851cw a;
    public final String b;
    public final String c;
    public final boolean d;

    public C4129dw(C3851cw c3851cw, String str, String str2, boolean z) {
        this.a = c3851cw;
        this.b = str;
        this.c = str2;
        this.d = z;
    }

    public C3851cw a() {
        return this.a;
    }

    public String b() {
        return this.c;
    }

    public String c() {
        return this.b;
    }

    public boolean d() {
        return this.d;
    }

    public String toString() {
        return "DatabaseInfo(databaseId:" + this.a + " host:" + this.c + ")";
    }
}
