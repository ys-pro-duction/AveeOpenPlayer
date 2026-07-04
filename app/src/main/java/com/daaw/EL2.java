package com.daaw;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes3.dex */
public abstract class EL2 {
    public final Unsafe a;

    public EL2(Unsafe unsafe) {
        this.a = unsafe;
    }

    public abstract double a(Object obj, long j);

    public abstract float b(Object obj, long j);

    public abstract void c(Object obj, long j, boolean z);

    public abstract void d(Object obj, long j, byte b);

    public abstract void e(Object obj, long j, double d);

    public abstract void f(Object obj, long j, float f);

    public abstract boolean g(Object obj, long j);
}
