package com.daaw;

/* JADX INFO: renamed from: com.daaw.Tl2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C2350Tl2 extends Exception {
    public final int B;

    public C2350Tl2(int i) {
        this.B = i;
    }

    public final int a() {
        return this.B;
    }

    public C2350Tl2(int i, String str) {
        super(str);
        this.B = i;
    }

    public C2350Tl2(int i, String str, Throwable th) {
        super(str, th);
        this.B = 1;
    }
}
