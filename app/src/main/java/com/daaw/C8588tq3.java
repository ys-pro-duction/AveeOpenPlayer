package com.daaw;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.tq3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8588tq3 extends Ep3 {
    public static final YL1 t;
    public final Xp3[] k;
    public final AbstractC8657u52[] l;
    public final ArrayList m;
    public final Map n;
    public final InterfaceC6515mQ2 o;
    public int p;
    public long[][] q;
    public C8309sq3 r;
    public final Gp3 s;

    static {
        C2705Ww1 c2705Ww1 = new C2705Ww1();
        c2705Ww1.a("MergingMediaSource");
        t = c2705Ww1.c();
    }

    public C8588tq3(boolean z, boolean z2, Xp3... xp3Arr) {
        Gp3 gp3 = new Gp3();
        this.k = xp3Arr;
        this.s = gp3;
        this.m = new ArrayList(Arrays.asList(xp3Arr));
        this.p = -1;
        this.l = new AbstractC8657u52[xp3Arr.length];
        this.q = new long[0][];
        this.n = new HashMap();
        this.o = AbstractC8746uQ2.a(8).b(2).c();
    }

    @Override // com.daaw.Ep3
    public final /* bridge */ /* synthetic */ Vp3 D(Object obj, Vp3 vp3) {
        if (((Integer) obj).intValue() == 0) {
            return vp3;
        }
        return null;
    }

    @Override // com.daaw.Xp3
    public final void a(Tp3 tp3) {
        C8030rq3 c8030rq3 = (C8030rq3) tp3;
        int i = 0;
        while (true) {
            Xp3[] xp3Arr = this.k;
            if (i >= xp3Arr.length) {
                return;
            }
            xp3Arr[i].a(c8030rq3.c(i));
            i++;
        }
    }

    @Override // com.daaw.Xp3
    public final YL1 g() {
        Xp3[] xp3Arr = this.k;
        return xp3Arr.length > 0 ? xp3Arr[0].g() : t;
    }

    @Override // com.daaw.Xp3
    public final Tp3 h(Vp3 vp3, Ls3 ls3, long j) {
        AbstractC8657u52[] abstractC8657u52Arr = this.l;
        int length = this.k.length;
        Tp3[] tp3Arr = new Tp3[length];
        int iA = abstractC8657u52Arr[0].a(vp3.a);
        for (int i = 0; i < length; i++) {
            tp3Arr[i] = this.k[i].h(vp3.a(this.l[i].f(iA)), ls3, j - this.q[iA][i]);
        }
        return new C8030rq3(this.s, this.q[iA], tp3Arr);
    }

    @Override // com.daaw.AbstractC7468pp3, com.daaw.Xp3
    public final void i(YL1 yl1) {
        this.k[0].i(yl1);
    }

    @Override // com.daaw.Ep3, com.daaw.AbstractC7468pp3
    public final void v(InterfaceC3917d93 interfaceC3917d93) {
        super.v(interfaceC3917d93);
        int i = 0;
        while (true) {
            Xp3[] xp3Arr = this.k;
            if (i >= xp3Arr.length) {
                return;
            }
            A(Integer.valueOf(i), xp3Arr[i]);
            i++;
        }
    }

    @Override // com.daaw.Ep3, com.daaw.AbstractC7468pp3
    public final void x() {
        super.x();
        Arrays.fill(this.l, (Object) null);
        this.p = -1;
        this.r = null;
        this.m.clear();
        Collections.addAll(this.m, this.k);
    }

    @Override // com.daaw.Ep3
    public final /* bridge */ /* synthetic */ void z(Object obj, Xp3 xp3, AbstractC8657u52 abstractC8657u52) {
        int iB;
        if (this.r != null) {
            return;
        }
        if (this.p == -1) {
            iB = abstractC8657u52.b();
            this.p = iB;
        } else {
            int iB2 = abstractC8657u52.b();
            int i = this.p;
            if (iB2 != i) {
                this.r = new C8309sq3(0);
                return;
            }
            iB = i;
        }
        if (this.q.length == 0) {
            this.q = (long[][]) Array.newInstance((Class<?>) Long.TYPE, iB, this.l.length);
        }
        this.m.remove(xp3);
        this.l[((Integer) obj).intValue()] = abstractC8657u52;
        if (this.m.isEmpty()) {
            w(this.l[0]);
        }
    }

    @Override // com.daaw.Ep3, com.daaw.Xp3
    public final void zzz() throws C8309sq3 {
        C8309sq3 c8309sq3 = this.r;
        if (c8309sq3 != null) {
            throw c8309sq3;
        }
        super.zzz();
    }
}
