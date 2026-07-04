package com.daaw;

import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: renamed from: com.daaw.nn1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6898nn1 {
    public final C5214hn1 a;
    public final InterfaceC6619mn1 b;
    public C5773jn1 c;
    public final int d;

    public AbstractC6898nn1(InterfaceC6052kn1 interfaceC6052kn1, InterfaceC6619mn1 interfaceC6619mn1, long j, long j2, long j3, long j4, long j5, long j6, int i) {
        this.b = interfaceC6619mn1;
        this.d = i;
        this.a = new C5214hn1(interfaceC6052kn1, j, 0L, j3, j4, j5, j6);
    }

    public static final int f(InterfaceC1190In1 interfaceC1190In1, long j, C6057ko1 c6057ko1) {
        if (j == interfaceC1190In1.zzf()) {
            return 0;
        }
        c6057ko1.a = j;
        return 1;
    }

    public static final boolean g(InterfaceC1190In1 interfaceC1190In1, long j) throws EOFException, InterruptedIOException {
        long jZzf = j - interfaceC1190In1.zzf();
        if (jZzf < 0 || jZzf > 262144) {
            return false;
        }
        ((C9694xn1) interfaceC1190In1).m((int) jZzf, false);
        return true;
    }

    public final int a(InterfaceC1190In1 interfaceC1190In1, C6057ko1 c6057ko1) throws EOFException, InterruptedIOException {
        while (true) {
            C5773jn1 c5773jn1 = this.c;
            AbstractC6048km2.b(c5773jn1);
            long j = c5773jn1.f;
            long j2 = c5773jn1.g - j;
            int i = this.d;
            long j3 = c5773jn1.h;
            if (j2 <= i) {
                c(false, j);
                return f(interfaceC1190In1, j, c6057ko1);
            }
            if (!g(interfaceC1190In1, j3)) {
                return f(interfaceC1190In1, j3, c6057ko1);
            }
            interfaceC1190In1.zzj();
            C6340ln1 c6340ln1A = this.b.a(interfaceC1190In1, c5773jn1.b);
            int i2 = c6340ln1A.a;
            if (i2 == -3) {
                c(false, j3);
                return f(interfaceC1190In1, j3, c6057ko1);
            }
            if (i2 == -2) {
                C5773jn1.h(c5773jn1, c6340ln1A.b, c6340ln1A.c);
            } else {
                if (i2 != -1) {
                    g(interfaceC1190In1, c6340ln1A.c);
                    c(true, c6340ln1A.c);
                    return f(interfaceC1190In1, c6340ln1A.c, c6057ko1);
                }
                C5773jn1.g(c5773jn1, c6340ln1A.b, c6340ln1A.c);
            }
        }
    }

    public final InterfaceC6903no1 b() {
        return this.a;
    }

    public final void c(boolean z, long j) {
        this.c = null;
        this.b.zzb();
    }

    public final void d(long j) {
        C5773jn1 c5773jn1 = this.c;
        if (c5773jn1 == null || c5773jn1.a != j) {
            C5214hn1 c5214hn1 = this.a;
            this.c = new C5773jn1(j, c5214hn1.g(j), 0L, c5214hn1.c, c5214hn1.d, c5214hn1.e, c5214hn1.f);
        }
    }

    public final boolean e() {
        return this.c != null;
    }
}
