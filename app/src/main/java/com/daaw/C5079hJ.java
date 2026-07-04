package com.daaw;

import com.daaw.InterfaceC4888ge;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.daaw.hJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5079hJ implements InterfaceC4888ge {
    public Random a = new Random();
    public long b = TimeUnit.SECONDS.toNanos(1);
    public long c = TimeUnit.MINUTES.toNanos(2);
    public double d = 1.6d;
    public double e = 0.2d;
    public long f = this.b;

    /* JADX INFO: renamed from: com.daaw.hJ$a */
    public static final class a implements InterfaceC4888ge.a {
        @Override // com.daaw.InterfaceC4888ge.a
        public InterfaceC4888ge get() {
            return new C5079hJ();
        }
    }

    @Override // com.daaw.InterfaceC4888ge
    public long a() {
        long j = this.f;
        double d = j;
        this.f = Math.min((long) (this.d * d), this.c);
        double d2 = this.e;
        return j + b((-d2) * d, d2 * d);
    }

    public final long b(double d, double d2) {
        AbstractC7785qy0.d(d2 >= d);
        return (long) ((this.a.nextDouble() * (d2 - d)) + d);
    }
}
