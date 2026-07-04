package com.google.android.exoplayer2.trackselection;

import com.daaw.AbstractC1360Ke;
import com.daaw.AbstractC3506bi0;
import com.daaw.AbstractC6280lb1;
import com.daaw.InterfaceC5207hm;
import com.daaw.InterfaceC5446ie;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.trackselection.c;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class a extends AbstractC1360Ke {
    public final InterfaceC5446ie g;
    public final long h;
    public final long i;
    public final long j;
    public final float k;
    public final float l;
    public final long m;
    public final InterfaceC5207hm n;
    public float o;
    public int p;
    public int q;
    public long r;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.trackselection.a$a, reason: collision with other inner class name */
    public static final class C0261a implements c.a {
        public final InterfaceC5446ie a;
        public final int b;
        public final int c;
        public final int d;
        public final float e;
        public final float f;
        public final long g;
        public final InterfaceC5207hm h;

        public C0261a(InterfaceC5446ie interfaceC5446ie) {
            this(interfaceC5446ie, 10000, 25000, 25000, 0.75f, 0.75f, 2000L, InterfaceC5207hm.a);
        }

        @Override // com.google.android.exoplayer2.trackselection.c.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a a(TrackGroup trackGroup, int... iArr) {
            return new a(trackGroup, iArr, this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
        }

        public C0261a(InterfaceC5446ie interfaceC5446ie, int i, int i2, int i3, float f, float f2, long j, InterfaceC5207hm interfaceC5207hm) {
            this.a = interfaceC5446ie;
            this.b = i;
            this.c = i2;
            this.d = i3;
            this.e = f;
            this.f = f2;
            this.g = j;
            this.h = interfaceC5207hm;
        }
    }

    public a(TrackGroup trackGroup, int[] iArr, InterfaceC5446ie interfaceC5446ie, long j, long j2, long j3, float f, float f2, long j4, InterfaceC5207hm interfaceC5207hm) {
        super(trackGroup, iArr);
        this.g = interfaceC5446ie;
        this.h = j * 1000;
        this.i = j2 * 1000;
        this.j = j3 * 1000;
        this.k = f;
        this.l = f2;
        this.m = j4;
        this.n = interfaceC5207hm;
        this.o = 1.0f;
        this.q = 1;
        this.r = -9223372036854775807L;
        this.p = r(Long.MIN_VALUE);
    }

    @Override // com.google.android.exoplayer2.trackselection.c
    public int b() {
        return this.p;
    }

    @Override // com.daaw.AbstractC1360Ke, com.google.android.exoplayer2.trackselection.c
    public void f() {
        this.r = -9223372036854775807L;
    }

    @Override // com.daaw.AbstractC1360Ke, com.google.android.exoplayer2.trackselection.c
    public int h(long j, List list) {
        int i;
        int i2;
        long jB = this.n.b();
        long j2 = this.r;
        if (j2 != -9223372036854775807L && jB - j2 < this.m) {
            return list.size();
        }
        this.r = jB;
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        if (AbstractC6280lb1.z(((AbstractC3506bi0) list.get(size - 1)).f - j, this.o) >= this.j) {
            Format formatD = d(r(jB));
            for (int i3 = 0; i3 < size; i3++) {
                AbstractC3506bi0 abstractC3506bi0 = (AbstractC3506bi0) list.get(i3);
                Format format = abstractC3506bi0.c;
                if (AbstractC6280lb1.z(abstractC3506bi0.f - j, this.o) >= this.j && format.C < formatD.C && (i = format.L) != -1 && i < 720 && (i2 = format.K) != -1 && i2 < 1280 && i < formatD.L) {
                    return i3;
                }
            }
        }
        return size;
    }

    @Override // com.google.android.exoplayer2.trackselection.c
    public int l() {
        return this.q;
    }

    @Override // com.daaw.AbstractC1360Ke, com.google.android.exoplayer2.trackselection.c
    public void m(float f) {
        this.o = f;
    }

    @Override // com.google.android.exoplayer2.trackselection.c
    public void n(long j, long j2, long j3) {
        long jB = this.n.b();
        int i = this.p;
        int iR = r(jB);
        this.p = iR;
        if (iR == i) {
            return;
        }
        if (!q(i, jB)) {
            Format formatD = d(i);
            Format formatD2 = d(this.p);
            if (formatD2.C > formatD.C && j2 < s(j3)) {
                this.p = i;
            } else if (formatD2.C < formatD.C && j2 >= this.i) {
                this.p = i;
            }
        }
        if (this.p != i) {
            this.q = 3;
        }
    }

    @Override // com.google.android.exoplayer2.trackselection.c
    public Object o() {
        return null;
    }

    public final int r(long j) {
        long jD = (long) (this.g.d() * this.k);
        int i = 0;
        for (int i2 = 0; i2 < this.b; i2++) {
            if (j == Long.MIN_VALUE || !q(i2, j)) {
                if (Math.round(d(i2).C * this.o) <= jD) {
                    return i2;
                }
                i = i2;
            }
        }
        return i;
    }

    public final long s(long j) {
        return (j == -9223372036854775807L || j > this.h) ? this.h : (long) (j * this.l);
    }
}
