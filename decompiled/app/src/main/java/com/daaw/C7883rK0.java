package com.daaw;

import java.util.ArrayList;

/* JADX INFO: renamed from: com.daaw.rK0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C7883rK0 {
    public static int h;
    public AbstractC2745Xg1 c;
    public AbstractC2745Xg1 d;
    public int f;
    public int g;
    public int a = 0;
    public boolean b = false;
    public ArrayList e = new ArrayList();

    public C7883rK0(AbstractC2745Xg1 abstractC2745Xg1, int i) {
        this.c = null;
        this.d = null;
        int i2 = h;
        this.f = i2;
        h = i2 + 1;
        this.c = abstractC2745Xg1;
        this.d = abstractC2745Xg1;
        this.g = i;
    }

    public void a(AbstractC2745Xg1 abstractC2745Xg1) {
        this.e.add(abstractC2745Xg1);
        this.d = abstractC2745Xg1;
    }

    public long b(C5791jr c5791jr, int i) {
        long j;
        int i2;
        AbstractC2745Xg1 abstractC2745Xg1 = this.c;
        if (abstractC2745Xg1 instanceof C2755Xj) {
            if (((C2755Xj) abstractC2745Xg1).f != i) {
                return 0L;
            }
        } else if (i == 0) {
            if (!(abstractC2745Xg1 instanceof C6815nW)) {
                return 0L;
            }
        } else if (!(abstractC2745Xg1 instanceof C0838Fd1)) {
            return 0L;
        }
        C8066rz c8066rz = (i == 0 ? c5791jr.e : c5791jr.f).h;
        C8066rz c8066rz2 = (i == 0 ? c5791jr.e : c5791jr.f).i;
        boolean zContains = abstractC2745Xg1.h.l.contains(c8066rz);
        boolean zContains2 = this.c.i.l.contains(c8066rz2);
        long j2 = this.c.j();
        if (zContains && zContains2) {
            long jD = d(this.c.h, 0L);
            long jC = c(this.c.i, 0L);
            long j3 = jD - j2;
            AbstractC2745Xg1 abstractC2745Xg12 = this.c;
            int i3 = abstractC2745Xg12.i.f;
            if (j3 >= (-i3)) {
                j3 += (long) i3;
            }
            int i4 = abstractC2745Xg12.h.f;
            long j4 = ((-jC) - j2) - ((long) i4);
            if (j4 >= i4) {
                j4 -= (long) i4;
            }
            float fO = abstractC2745Xg12.b.o(i);
            float f = fO > 0.0f ? (long) ((j4 / fO) + (j3 / (1.0f - fO))) : 0L;
            long j5 = ((long) ((f * fO) + 0.5f)) + j2 + ((long) ((f * (1.0f - fO)) + 0.5f));
            AbstractC2745Xg1 abstractC2745Xg13 = this.c;
            j = ((long) abstractC2745Xg13.h.f) + j5;
            i2 = abstractC2745Xg13.i.f;
        } else {
            if (zContains) {
                return Math.max(d(this.c.h, r13.f), ((long) this.c.h.f) + j2);
            }
            if (zContains2) {
                return Math.max(-c(this.c.i, r13.f), ((long) (-this.c.i.f)) + j2);
            }
            AbstractC2745Xg1 abstractC2745Xg14 = this.c;
            j = ((long) abstractC2745Xg14.h.f) + abstractC2745Xg14.j();
            i2 = this.c.i.f;
        }
        return j - ((long) i2);
    }

    public final long c(C8066rz c8066rz, long j) {
        AbstractC2745Xg1 abstractC2745Xg1 = c8066rz.d;
        if (abstractC2745Xg1 instanceof NV) {
            return j;
        }
        int size = c8066rz.k.size();
        long jMin = j;
        for (int i = 0; i < size; i++) {
            InterfaceC6393lz interfaceC6393lz = (InterfaceC6393lz) c8066rz.k.get(i);
            if (interfaceC6393lz instanceof C8066rz) {
                C8066rz c8066rz2 = (C8066rz) interfaceC6393lz;
                if (c8066rz2.d != abstractC2745Xg1) {
                    jMin = Math.min(jMin, c(c8066rz2, ((long) c8066rz2.f) + j));
                }
            }
        }
        if (c8066rz != abstractC2745Xg1.i) {
            return jMin;
        }
        long j2 = j - abstractC2745Xg1.j();
        return Math.min(Math.min(jMin, c(abstractC2745Xg1.h, j2)), j2 - ((long) abstractC2745Xg1.h.f));
    }

    public final long d(C8066rz c8066rz, long j) {
        AbstractC2745Xg1 abstractC2745Xg1 = c8066rz.d;
        if (abstractC2745Xg1 instanceof NV) {
            return j;
        }
        int size = c8066rz.k.size();
        long jMax = j;
        for (int i = 0; i < size; i++) {
            InterfaceC6393lz interfaceC6393lz = (InterfaceC6393lz) c8066rz.k.get(i);
            if (interfaceC6393lz instanceof C8066rz) {
                C8066rz c8066rz2 = (C8066rz) interfaceC6393lz;
                if (c8066rz2.d != abstractC2745Xg1) {
                    jMax = Math.max(jMax, d(c8066rz2, ((long) c8066rz2.f) + j));
                }
            }
        }
        if (c8066rz != abstractC2745Xg1.h) {
            return jMax;
        }
        long j2 = j + abstractC2745Xg1.j();
        return Math.max(Math.max(jMax, d(abstractC2745Xg1.i, j2)), j2 - ((long) abstractC2745Xg1.i.f));
    }
}
