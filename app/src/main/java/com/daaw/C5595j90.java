package com.daaw;

import java.util.List;
import java.util.Locale;

/* JADX INFO: renamed from: com.daaw.j90, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C5595j90 {
    public final List a;
    public final C0737Ee0 b;
    public final String c;
    public final long d;
    public final a e;
    public final long f;
    public final String g;
    public final List h;
    public final V6 i;
    public final int j;
    public final int k;
    public final int l;
    public final float m;
    public final float n;
    public final int o;
    public final int p;
    public final S6 q;
    public final T6 r;
    public final I6 s;
    public final List t;
    public final b u;
    public final boolean v;
    public final C5177hg w;
    public final C8416tE x;

    /* JADX INFO: renamed from: com.daaw.j90$a */
    public enum a {
        PRE_COMP,
        SOLID,
        IMAGE,
        NULL,
        SHAPE,
        TEXT,
        UNKNOWN
    }

    /* JADX INFO: renamed from: com.daaw.j90$b */
    public enum b {
        NONE,
        ADD,
        INVERT,
        LUMA,
        LUMA_INVERTED,
        UNKNOWN
    }

    public C5595j90(List list, C0737Ee0 c0737Ee0, String str, long j, a aVar, long j2, String str2, List list2, V6 v6, int i, int i2, int i3, float f, float f2, int i4, int i5, S6 s6, T6 t6, List list3, b bVar, I6 i6, boolean z, C5177hg c5177hg, C8416tE c8416tE) {
        this.a = list;
        this.b = c0737Ee0;
        this.c = str;
        this.d = j;
        this.e = aVar;
        this.f = j2;
        this.g = str2;
        this.h = list2;
        this.i = v6;
        this.j = i;
        this.k = i2;
        this.l = i3;
        this.m = f;
        this.n = f2;
        this.o = i4;
        this.p = i5;
        this.q = s6;
        this.r = t6;
        this.t = list3;
        this.u = bVar;
        this.s = i6;
        this.v = z;
        this.w = c5177hg;
        this.x = c8416tE;
    }

    public C5177hg a() {
        return this.w;
    }

    public C0737Ee0 b() {
        return this.b;
    }

    public C8416tE c() {
        return this.x;
    }

    public long d() {
        return this.d;
    }

    public List e() {
        return this.t;
    }

    public a f() {
        return this.e;
    }

    public List g() {
        return this.h;
    }

    public b h() {
        return this.u;
    }

    public String i() {
        return this.c;
    }

    public long j() {
        return this.f;
    }

    public int k() {
        return this.p;
    }

    public int l() {
        return this.o;
    }

    public String m() {
        return this.g;
    }

    public List n() {
        return this.a;
    }

    public int o() {
        return this.l;
    }

    public int p() {
        return this.k;
    }

    public int q() {
        return this.j;
    }

    public float r() {
        return this.n / this.b.e();
    }

    public S6 s() {
        return this.q;
    }

    public T6 t() {
        return this.r;
    }

    public String toString() {
        return y("");
    }

    public I6 u() {
        return this.s;
    }

    public float v() {
        return this.m;
    }

    public V6 w() {
        return this.i;
    }

    public boolean x() {
        return this.v;
    }

    public String y(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(i());
        sb.append("\n");
        C5595j90 c5595j90U = this.b.u(j());
        if (c5595j90U != null) {
            sb.append("\t\tParents: ");
            sb.append(c5595j90U.i());
            C5595j90 c5595j90U2 = this.b.u(c5595j90U.j());
            while (c5595j90U2 != null) {
                sb.append("->");
                sb.append(c5595j90U2.i());
                c5595j90U2 = this.b.u(c5595j90U2.j());
            }
            sb.append(str);
            sb.append("\n");
        }
        if (!g().isEmpty()) {
            sb.append(str);
            sb.append("\tMasks: ");
            sb.append(g().size());
            sb.append("\n");
        }
        if (q() != 0 && p() != 0) {
            sb.append(str);
            sb.append("\tBackground: ");
            sb.append(String.format(Locale.US, "%dx%d %X\n", Integer.valueOf(q()), Integer.valueOf(p()), Integer.valueOf(o())));
        }
        if (!this.a.isEmpty()) {
            sb.append(str);
            sb.append("\tShapes:\n");
            for (Object obj : this.a) {
                sb.append(str);
                sb.append("\t\t");
                sb.append(obj);
                sb.append("\n");
            }
        }
        return sb.toString();
    }
}
