package com.daaw;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.daaw.Zy1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractCallableC3025Zy1 implements Callable {
    public final String a = getClass().getSimpleName();
    public final C2813Xx1 b;
    public final String c;
    public final String d;
    public final C9733xv1 e;
    public Method f;
    public final int g;
    public final int h;

    public AbstractCallableC3025Zy1(C2813Xx1 c2813Xx1, String str, String str2, C9733xv1 c9733xv1, int i, int i2) {
        this.b = c2813Xx1;
        this.c = str;
        this.d = str2;
        this.e = c9733xv1;
        this.g = i;
        this.h = i2;
    }

    public abstract void a();

    public Void b() {
        int i;
        try {
            long jNanoTime = System.nanoTime();
            Method methodJ = this.b.j(this.c, this.d);
            this.f = methodJ;
            if (methodJ == null) {
                return null;
            }
            a();
            C6387lx1 c6387lx1D = this.b.d();
            if (c6387lx1D != null && (i = this.g) != Integer.MIN_VALUE) {
                c6387lx1D.c(this.h, i, (System.nanoTime() - jNanoTime) / 1000, null, null);
            }
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
        return null;
    }

    @Override // java.util.concurrent.Callable
    public /* bridge */ /* synthetic */ Object call() {
        b();
        return null;
    }
}
