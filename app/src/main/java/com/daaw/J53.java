package com.daaw;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes3.dex */
public abstract class J53 {
    public final Unsafe a;

    public J53(Unsafe unsafe) {
        this.a = unsafe;
    }

    public abstract byte a(long j);

    public abstract double b(Object obj, long j);

    public abstract float c(Object obj, long j);

    public abstract void d(long j, byte[] bArr, long j2, long j3);

    public abstract void e(Object obj, long j, boolean z);

    public abstract void f(Object obj, long j, byte b);

    public abstract void g(Object obj, long j, double d);

    public abstract void h(Object obj, long j, float f);

    public abstract boolean i(Object obj, long j);
}
