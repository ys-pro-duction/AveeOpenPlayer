package com.daaw;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: com.daaw.p31, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C7252p31 {
    public static final AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(C7252p31.class, "_size");
    private volatile int _size;
    public InterfaceC7531q31[] a;

    public final void a(InterfaceC7531q31 interfaceC7531q31) {
        interfaceC7531q31.h(this);
        InterfaceC7531q31[] interfaceC7531q31ArrF = f();
        int iC = c();
        j(iC + 1);
        interfaceC7531q31ArrF[iC] = interfaceC7531q31;
        interfaceC7531q31.setIndex(iC);
        l(iC);
    }

    public final InterfaceC7531q31 b() {
        InterfaceC7531q31[] interfaceC7531q31Arr = this.a;
        if (interfaceC7531q31Arr != null) {
            return interfaceC7531q31Arr[0];
        }
        return null;
    }

    public final int c() {
        return b.get(this);
    }

    public final boolean d() {
        return c() == 0;
    }

    public final InterfaceC7531q31 e() {
        InterfaceC7531q31 interfaceC7531q31B;
        synchronized (this) {
            interfaceC7531q31B = b();
        }
        return interfaceC7531q31B;
    }

    public final InterfaceC7531q31[] f() {
        InterfaceC7531q31[] interfaceC7531q31Arr = this.a;
        if (interfaceC7531q31Arr == null) {
            InterfaceC7531q31[] interfaceC7531q31Arr2 = new InterfaceC7531q31[4];
            this.a = interfaceC7531q31Arr2;
            return interfaceC7531q31Arr2;
        }
        if (c() < interfaceC7531q31Arr.length) {
            return interfaceC7531q31Arr;
        }
        Object[] objArrCopyOf = Arrays.copyOf(interfaceC7531q31Arr, c() * 2);
        G10.f(objArrCopyOf, "copyOf(this, newSize)");
        InterfaceC7531q31[] interfaceC7531q31Arr3 = (InterfaceC7531q31[]) objArrCopyOf;
        this.a = interfaceC7531q31Arr3;
        return interfaceC7531q31Arr3;
    }

    public final boolean g(InterfaceC7531q31 interfaceC7531q31) {
        boolean z;
        synchronized (this) {
            if (interfaceC7531q31.g() == null) {
                z = false;
            } else {
                h(interfaceC7531q31.getIndex());
                z = true;
            }
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.daaw.InterfaceC7531q31 h(int r6) {
        /*
            r5 = this;
            com.daaw.q31[] r0 = r5.a
            com.daaw.G10.d(r0)
            int r1 = r5.c()
            r2 = -1
            int r1 = r1 + r2
            r5.j(r1)
            int r1 = r5.c()
            if (r6 >= r1) goto L3d
            int r1 = r5.c()
            r5.m(r6, r1)
            int r1 = r6 + (-1)
            int r1 = r1 / 2
            if (r6 <= 0) goto L3a
            r3 = r0[r6]
            com.daaw.G10.d(r3)
            java.lang.Comparable r3 = (java.lang.Comparable) r3
            r4 = r0[r1]
            com.daaw.G10.d(r4)
            int r3 = r3.compareTo(r4)
            if (r3 >= 0) goto L3a
            r5.m(r6, r1)
            r5.l(r1)
            goto L3d
        L3a:
            r5.k(r6)
        L3d:
            int r6 = r5.c()
            r6 = r0[r6]
            com.daaw.G10.d(r6)
            r1 = 0
            r6.h(r1)
            r6.setIndex(r2)
            int r2 = r5.c()
            r0[r2] = r1
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C7252p31.h(int):com.daaw.q31");
    }

    public final InterfaceC7531q31 i() {
        InterfaceC7531q31 interfaceC7531q31H;
        synchronized (this) {
            interfaceC7531q31H = c() > 0 ? h(0) : null;
        }
        return interfaceC7531q31H;
    }

    public final void j(int i) {
        b.set(this, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k(int r6) {
        /*
            r5 = this;
        L0:
            int r0 = r6 * 2
            int r1 = r0 + 1
            int r2 = r5.c()
            if (r1 < r2) goto Lb
            goto L3e
        Lb:
            com.daaw.q31[] r2 = r5.a
            com.daaw.G10.d(r2)
            int r0 = r0 + 2
            int r3 = r5.c()
            if (r0 >= r3) goto L2b
            r3 = r2[r0]
            com.daaw.G10.d(r3)
            java.lang.Comparable r3 = (java.lang.Comparable) r3
            r4 = r2[r1]
            com.daaw.G10.d(r4)
            int r3 = r3.compareTo(r4)
            if (r3 >= 0) goto L2b
            goto L2c
        L2b:
            r0 = r1
        L2c:
            r1 = r2[r6]
            com.daaw.G10.d(r1)
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            r2 = r2[r0]
            com.daaw.G10.d(r2)
            int r1 = r1.compareTo(r2)
            if (r1 > 0) goto L3f
        L3e:
            return
        L3f:
            r5.m(r6, r0)
            r6 = r0
            goto L0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C7252p31.k(int):void");
    }

    public final void l(int i) {
        while (i > 0) {
            InterfaceC7531q31[] interfaceC7531q31Arr = this.a;
            G10.d(interfaceC7531q31Arr);
            int i2 = (i - 1) / 2;
            InterfaceC7531q31 interfaceC7531q31 = interfaceC7531q31Arr[i2];
            G10.d(interfaceC7531q31);
            InterfaceC7531q31 interfaceC7531q312 = interfaceC7531q31Arr[i];
            G10.d(interfaceC7531q312);
            if (((Comparable) interfaceC7531q31).compareTo(interfaceC7531q312) <= 0) {
                return;
            }
            m(i, i2);
            i = i2;
        }
    }

    public final void m(int i, int i2) {
        InterfaceC7531q31[] interfaceC7531q31Arr = this.a;
        G10.d(interfaceC7531q31Arr);
        InterfaceC7531q31 interfaceC7531q31 = interfaceC7531q31Arr[i2];
        G10.d(interfaceC7531q31);
        InterfaceC7531q31 interfaceC7531q312 = interfaceC7531q31Arr[i];
        G10.d(interfaceC7531q312);
        interfaceC7531q31Arr[i] = interfaceC7531q31;
        interfaceC7531q31Arr[i2] = interfaceC7531q312;
        interfaceC7531q31.setIndex(i);
        interfaceC7531q312.setIndex(i2);
    }
}
