package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public final class RL2 extends Exception {
    public final int B;

    public RL2(int i, String str) {
        super(str);
        this.B = i;
    }

    public final int a() {
        return this.B;
    }

    public RL2(int i, Throwable th) {
        super(th);
        this.B = i;
    }
}
