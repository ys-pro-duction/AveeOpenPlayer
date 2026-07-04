package com.daaw;

import java.util.ArrayList;

/* JADX INFO: renamed from: com.daaw.rd1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7963rd1 {
    public final C2704Ww0[] a;
    public int b;
    public final boolean c;

    public C7963rd1() {
        C2704Ww0[] c2704Ww0Arr = new C2704Ww0[20];
        for (int i = 0; i < 20; i++) {
            c2704Ww0Arr[i] = null;
        }
        this.a = c2704Ww0Arr;
        this.c = true;
    }

    public final void a(long j, long j2) {
        int i = (this.b + 1) % 20;
        this.b = i;
        this.a[i] = new C2704Ww0(j2, j, null);
    }

    public final long b() {
        if (this.c) {
            return c();
        }
        long jB = d().b();
        return AbstractC7685qd1.a(C9982yp0.l(jB), C9982yp0.m(jB));
    }

    public final long c() {
        C2704Ww0 c2704Ww0 = this.a[this.b];
        if (c2704Ww0 == null) {
            return AbstractC7685qd1.a(0.0f, 0.0f);
        }
        YY yy = new YY();
        YY yy2 = new YY();
        int i = this.b;
        int i2 = 0;
        do {
            i = (i + 1) % 20;
            C2704Ww0 c2704Ww02 = this.a[i];
            if (c2704Ww02 != null) {
                long jB = c2704Ww0.b() - c2704Ww02.b();
                long jAbs = Math.abs(c2704Ww02.b() - c2704Ww0.b());
                if (jB <= 100) {
                    if (jAbs > 40) {
                        yy.c();
                        yy2.c();
                    }
                    long j = -jB;
                    yy.a(j, C9982yp0.l(c2704Ww02.a()));
                    yy2.a(j, C9982yp0.m(c2704Ww02.a()));
                    i2++;
                }
            }
            if (i == this.b) {
                break;
            }
        } while (i2 < 20);
        return i2 < 3 ? AbstractC7685qd1.a(0.0f, 0.0f) : AbstractC7685qd1.a(yy.b(), yy2.b());
    }

    public final C7406pd1 d() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int i = this.b;
        C2704Ww0 c2704Ww0 = this.a[i];
        if (c2704Ww0 == null) {
            return C7406pd1.e.a();
        }
        int i2 = 0;
        C2704Ww0 c2704Ww02 = c2704Ww0;
        while (true) {
            C2704Ww0 c2704Ww03 = this.a[i];
            if (c2704Ww03 == null) {
                break;
            }
            float fB = c2704Ww0.b() - c2704Ww03.b();
            float fAbs = Math.abs(c2704Ww03.b() - c2704Ww02.b());
            if (fB > 100.0f || fAbs > 40.0f) {
                break;
            }
            long jA = c2704Ww03.a();
            arrayList.add(Float.valueOf(C9982yp0.l(jA)));
            arrayList2.add(Float.valueOf(C9982yp0.m(jA)));
            arrayList3.add(Float.valueOf(-fB));
            if (i == 0) {
                i = 20;
            }
            i--;
            i2++;
            if (i2 >= 20) {
                c2704Ww02 = c2704Ww03;
                break;
            }
            c2704Ww02 = c2704Ww03;
        }
        if (i2 < 3) {
            return new C7406pd1(C9982yp0.b.c(), 1.0f, c2704Ww0.b() - c2704Ww02.b(), C9982yp0.p(c2704Ww0.a(), c2704Ww02.a()), null);
        }
        try {
            C0388Ax0 c0388Ax0D = AbstractC8800ud1.d(arrayList3, arrayList, 2);
            C0388Ax0 c0388Ax0D2 = AbstractC8800ud1.d(arrayList3, arrayList2, 2);
            float f = 1000;
            return new C7406pd1(AbstractC0460Bp0.a(((Number) c0388Ax0D.a().get(1)).floatValue() * f, ((Number) c0388Ax0D2.a().get(1)).floatValue() * f), c0388Ax0D.b() * c0388Ax0D2.b(), c2704Ww0.b() - c2704Ww02.b(), C9982yp0.p(c2704Ww0.a(), c2704Ww02.a()), null);
        } catch (IllegalArgumentException unused) {
            return C7406pd1.e.a();
        }
    }
}
