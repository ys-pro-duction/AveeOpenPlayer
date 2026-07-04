package com.daaw;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class UX2 extends IOException {
    public final int B;

    public UX2(int i) {
        this.B = i;
    }

    public UX2(String str, int i) {
        super(str);
        this.B = i;
    }

    public UX2(String str, Throwable th, int i) {
        super(str, th);
        this.B = i;
    }

    public UX2(Throwable th, int i) {
        super(th);
        this.B = i;
    }
}
