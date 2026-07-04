package com.daaw;

import android.os.ConditionVariable;
import j$.util.concurrent.ThreadLocalRandom;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Random;

/* JADX INFO: renamed from: com.daaw.lx1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6387lx1 {
    public static final ConditionVariable c = new ConditionVariable();
    public static volatile WL2 d = null;
    public static volatile Random e = null;
    public final C2813Xx1 a;
    public volatile Boolean b;

    public C6387lx1(C2813Xx1 c2813Xx1) {
        this.a = c2813Xx1;
        c2813Xx1.k().execute(new RunnableC6108kx1(this));
    }

    public static final int d() {
        try {
            return ThreadLocalRandom.current().nextInt();
        } catch (RuntimeException unused) {
            return e().nextInt();
        }
    }

    public static Random e() {
        if (e == null) {
            synchronized (C6387lx1.class) {
                try {
                    if (e == null) {
                        e = new Random();
                    }
                } finally {
                }
            }
        }
        return e;
    }

    public final void c(int i, int i2, long j, String str, Exception exc) {
        try {
            c.block();
            if (!this.b.booleanValue() || d == null) {
                return;
            }
            C3849cv1 c3849cv1M = C6937nv1.M();
            c3849cv1M.n(this.a.a.getPackageName());
            c3849cv1M.t(j);
            if (str != null) {
                c3849cv1M.o(str);
            }
            if (exc != null) {
                StringWriter stringWriter = new StringWriter();
                exc.printStackTrace(new PrintWriter(stringWriter));
                c3849cv1M.u(stringWriter.toString());
                c3849cv1M.r(exc.getClass().getName());
            }
            VL2 vl2A = d.a(((C6937nv1) c3849cv1M.j()).h());
            vl2A.a(i);
            if (i2 != -1) {
                vl2A.b(i2);
            }
            vl2A.c();
        } catch (Exception unused) {
        }
    }
}
