package com.daaw;

import com.daaw.AbstractC3775cg1;
import com.daaw.VX0;
import com.google.android.exoplayer2.Format;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.daaw.bg1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3497bg1 extends VX0 {
    public a n;
    public int o;
    public boolean p;
    public AbstractC3775cg1.d q;
    public AbstractC3775cg1.b r;

    /* JADX INFO: renamed from: com.daaw.bg1$a */
    public static final class a {
        public final AbstractC3775cg1.d a;
        public final AbstractC3775cg1.b b;
        public final byte[] c;
        public final AbstractC3775cg1.c[] d;
        public final int e;

        public a(AbstractC3775cg1.d dVar, AbstractC3775cg1.b bVar, byte[] bArr, AbstractC3775cg1.c[] cVarArr, int i) {
            this.a = dVar;
            this.b = bVar;
            this.c = bArr;
            this.d = cVarArr;
            this.e = i;
        }
    }

    public static void l(C2584Vs0 c2584Vs0, long j) {
        c2584Vs0.I(c2584Vs0.d() + 4);
        c2584Vs0.a[c2584Vs0.d() - 4] = (byte) (j & 255);
        c2584Vs0.a[c2584Vs0.d() - 3] = (byte) ((j >>> 8) & 255);
        c2584Vs0.a[c2584Vs0.d() - 2] = (byte) ((j >>> 16) & 255);
        c2584Vs0.a[c2584Vs0.d() - 1] = (byte) ((j >>> 24) & 255);
    }

    public static int m(byte b, a aVar) {
        return !aVar.d[n(b, aVar.e, 1)].a ? aVar.a.g : aVar.a.h;
    }

    public static int n(byte b, int i, int i2) {
        return (b >> i2) & (255 >>> (8 - i));
    }

    public static boolean p(C2584Vs0 c2584Vs0) {
        try {
            return AbstractC3775cg1.k(1, c2584Vs0, true);
        } catch (C3000Zs0 unused) {
            return false;
        }
    }

    @Override // com.daaw.VX0
    public void d(long j) {
        super.d(j);
        this.p = j != 0;
        AbstractC3775cg1.d dVar = this.q;
        this.o = dVar != null ? dVar.g : 0;
    }

    @Override // com.daaw.VX0
    public long e(C2584Vs0 c2584Vs0) {
        byte b = c2584Vs0.a[0];
        if ((b & 1) == 1) {
            return -1L;
        }
        int iM = m(b, this.n);
        long j = this.p ? (this.o + iM) / 4 : 0;
        l(c2584Vs0, j);
        this.p = true;
        this.o = iM;
        return j;
    }

    @Override // com.daaw.VX0
    public boolean h(C2584Vs0 c2584Vs0, long j, VX0.b bVar) throws C3000Zs0 {
        if (this.n != null) {
            return false;
        }
        a aVarO = o(c2584Vs0);
        this.n = aVarO;
        if (aVarO == null) {
            return true;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.n.a.j);
        arrayList.add(this.n.c);
        AbstractC3775cg1.d dVar = this.n.a;
        bVar.a = Format.k(null, "audio/vorbis", null, dVar.e, -1, dVar.b, (int) dVar.c, arrayList, null, 0, null);
        return true;
    }

    @Override // com.daaw.VX0
    public void j(boolean z) {
        super.j(z);
        if (z) {
            this.n = null;
            this.q = null;
            this.r = null;
        }
        this.o = 0;
        this.p = false;
    }

    public a o(C2584Vs0 c2584Vs0) throws C3000Zs0 {
        if (this.q == null) {
            this.q = AbstractC3775cg1.i(c2584Vs0);
            return null;
        }
        if (this.r == null) {
            this.r = AbstractC3775cg1.h(c2584Vs0);
            return null;
        }
        byte[] bArr = new byte[c2584Vs0.d()];
        System.arraycopy(c2584Vs0.a, 0, bArr, 0, c2584Vs0.d());
        return new a(this.q, this.r, bArr, AbstractC3775cg1.j(c2584Vs0, this.q.b), AbstractC3775cg1.a(r5.length - 1));
    }
}
