package com.daaw;

import com.google.android.exoplayer2.drm.DrmInitData;
import j$.util.DesugarCollections;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.eW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4284eW extends AbstractC4852gW {
    public final int c;
    public final long d;
    public final long e;
    public final boolean f;
    public final int g;
    public final long h;
    public final int i;
    public final long j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final DrmInitData n;
    public final List o;
    public final long p;

    /* JADX INFO: renamed from: com.daaw.eW$a */
    public static final class a implements Comparable {
        public final String B;
        public final a C;
        public final long D;
        public final int E;
        public final long F;
        public final String G;
        public final String H;
        public final long I;
        public final long J;
        public final boolean K;

        public a(String str, long j, long j2) {
            this(str, null, 0L, -1, -9223372036854775807L, null, null, j, j2, false);
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(Long l) {
            if (this.F > l.longValue()) {
                return 1;
            }
            return this.F < l.longValue() ? -1 : 0;
        }

        public a(String str, a aVar, long j, int i, long j2, String str2, String str3, long j3, long j4, boolean z) {
            this.B = str;
            this.C = aVar;
            this.D = j;
            this.E = i;
            this.F = j2;
            this.G = str2;
            this.H = str3;
            this.I = j3;
            this.J = j4;
            this.K = z;
        }
    }

    public C4284eW(int i, String str, List list, long j, long j2, boolean z, int i2, long j3, int i3, long j4, boolean z2, boolean z3, boolean z4, DrmInitData drmInitData, List list2) {
        super(str, list);
        this.c = i;
        this.e = j2;
        this.f = z;
        this.g = i2;
        this.h = j3;
        this.i = i3;
        this.j = j4;
        this.k = z2;
        this.l = z3;
        this.m = z4;
        this.n = drmInitData;
        this.o = DesugarCollections.unmodifiableList(list2);
        if (list2.isEmpty()) {
            this.p = 0L;
        } else {
            a aVar = (a) list2.get(list2.size() - 1);
            this.p = aVar.F + aVar.D;
        }
        if (j == -9223372036854775807L) {
            j = -9223372036854775807L;
        } else if (j < 0) {
            j += this.p;
        }
        this.d = j;
    }

    public C4284eW c(long j, int i) {
        return new C4284eW(this.c, this.a, this.b, this.d, j, true, i, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o);
    }

    public C4284eW d() {
        return this.l ? this : new C4284eW(this.c, this.a, this.b, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, true, this.m, this.n, this.o);
    }

    public long e() {
        return this.e + this.p;
    }

    public boolean f(C4284eW c4284eW) {
        if (c4284eW != null) {
            long j = this.h;
            long j2 = c4284eW.h;
            if (j <= j2) {
                if (j < j2) {
                    return false;
                }
                int size = this.o.size();
                int size2 = c4284eW.o.size();
                if (size <= size2 && (size != size2 || !this.l || c4284eW.l)) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // com.daaw.InterfaceC3962dL
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C4284eW a(List list) {
        return this;
    }
}
