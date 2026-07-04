package com.daaw;

/* JADX INFO: loaded from: classes.dex */
public abstract class V01 {
    public final Z41 a;

    public static final class a extends C3000Zs0 {
        public a(String str) {
            super(str);
        }
    }

    public V01(Z41 z41) {
        this.a = z41;
    }

    public final void a(C2584Vs0 c2584Vs0, long j) {
        if (b(c2584Vs0)) {
            c(c2584Vs0, j);
        }
    }

    public abstract boolean b(C2584Vs0 c2584Vs0);

    public abstract void c(C2584Vs0 c2584Vs0, long j);
}
