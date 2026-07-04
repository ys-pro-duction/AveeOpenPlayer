package com.daaw;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: com.daaw.fU0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4566fU0 implements Iterable, InterfaceC9783y60 {
    public static final a F = new a(null);
    public static final C4566fU0 G = new C4566fU0(0, 0, 0, null);
    public final long B;
    public final long C;
    public final int D;
    public final int[] E;

    /* JADX INFO: renamed from: com.daaw.fU0$a */
    public static final class a {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public final C4566fU0 a() {
            return C4566fU0.G;
        }

        public a() {
        }
    }

    /* JADX INFO: renamed from: com.daaw.fU0$b */
    public static final class b extends AbstractC4233eJ0 implements InterfaceC3429bR {
        public Object D;
        public int E;
        public int F;
        public int G;
        public /* synthetic */ Object H;

        public b(InterfaceC1416Ks interfaceC1416Ks) {
            super(2, interfaceC1416Ks);
        }

        @Override // com.daaw.AbstractC7409pe
        public final InterfaceC1416Ks a(Object obj, InterfaceC1416Ks interfaceC1416Ks) {
            b bVar = C4566fU0.this.new b(interfaceC1416Ks);
            bVar.H = obj;
            return bVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0079, code lost:
        
            if (r15.b(r4, r19) == r1) goto L40;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x00b4, code lost:
        
            if (r13.b(r4, r19) == r1) goto L40;
         */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0063  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x007f  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x008c  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0090  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00b9  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00c4  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00c7  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0079 -> B:19:0x007d). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x009b -> B:30:0x00b7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00b4 -> B:30:0x00b7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00d2 -> B:43:0x00f2). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00f0 -> B:42:0x00f1). Please report as a decompilation issue!!! */
        @Override // com.daaw.AbstractC7409pe
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object q(java.lang.Object r20) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 247
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.daaw.C4566fU0.b.q(java.lang.Object):java.lang.Object");
        }

        @Override // com.daaw.InterfaceC3429bR
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public final Object invoke(NP0 np0, InterfaceC1416Ks interfaceC1416Ks) {
            return ((b) a(np0, interfaceC1416Ks)).q(G91.a);
        }
    }

    public C4566fU0(long j, long j2, int i, int[] iArr) {
        this.B = j;
        this.C = j2;
        this.D = i;
        this.E = iArr;
    }

    public final boolean D(int i) {
        int[] iArr;
        int i2 = i - this.D;
        return (i2 < 0 || i2 >= 64) ? (i2 < 64 || i2 >= 128) ? i2 <= 0 && (iArr = this.E) != null && AbstractC4845gU0.b(iArr, i) >= 0 : ((1 << (i2 - 64)) & this.B) != 0 : ((1 << i2) & this.C) != 0;
    }

    public final int E(int i) {
        int[] iArr = this.E;
        if (iArr != null) {
            return iArr[0];
        }
        long j = this.C;
        if (j != 0) {
            return this.D + AbstractC4845gU0.c(j);
        }
        long j2 = this.B;
        return j2 != 0 ? this.D + 64 + AbstractC4845gU0.c(j2) : i;
    }

    public final C4566fU0 F(C4566fU0 c4566fU0) {
        G10.g(c4566fU0, "bits");
        C4566fU0 c4566fU02 = G;
        if (c4566fU0 == c4566fU02) {
            return this;
        }
        if (this == c4566fU02) {
            return c4566fU0;
        }
        int i = c4566fU0.D;
        int i2 = this.D;
        if (i == i2) {
            int[] iArr = c4566fU0.E;
            int[] iArr2 = this.E;
            if (iArr == iArr2) {
                return new C4566fU0(this.B | c4566fU0.B, this.C | c4566fU0.C, i2, iArr2);
            }
        }
        if (this.E == null) {
            Iterator it = iterator();
            while (it.hasNext()) {
                c4566fU0 = c4566fU0.G(((Number) it.next()).intValue());
            }
            return c4566fU0;
        }
        Iterator it2 = c4566fU0.iterator();
        C4566fU0 c4566fU0G = this;
        while (it2.hasNext()) {
            c4566fU0G = c4566fU0G.G(((Number) it2.next()).intValue());
        }
        return c4566fU0G;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0085 A[PHI: r9
  0x0085: PHI (r9v5 java.util.ArrayList) = (r9v2 java.util.ArrayList), (r9v7 java.util.ArrayList) binds: [B:24:0x0064, B:26:0x006d] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.daaw.C4566fU0 G(int r22) {
        /*
            Method dump skipped, instruction units count: 270
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C4566fU0.G(int):com.daaw.fU0");
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return QP0.b(new b(null)).iterator();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" [");
        ArrayList arrayList = new ArrayList(AbstractC1703Nm.v(this, 10));
        Iterator it = iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).intValue()));
        }
        sb.append(AbstractC6842nc0.d(arrayList, null, null, null, 0, null, null, 63, null));
        sb.append(']');
        return sb.toString();
    }

    public final C4566fU0 w(C4566fU0 c4566fU0) {
        G10.g(c4566fU0, "bits");
        C4566fU0 c4566fU02 = G;
        if (c4566fU0 == c4566fU02) {
            return this;
        }
        if (this == c4566fU02) {
            return c4566fU02;
        }
        int i = c4566fU0.D;
        int i2 = this.D;
        if (i == i2) {
            int[] iArr = c4566fU0.E;
            int[] iArr2 = this.E;
            if (iArr == iArr2) {
                return new C4566fU0(this.B & (~c4566fU0.B), this.C & (~c4566fU0.C), i2, iArr2);
            }
        }
        Iterator it = c4566fU0.iterator();
        C4566fU0 c4566fU0Y = this;
        while (it.hasNext()) {
            c4566fU0Y = c4566fU0Y.y(((Number) it.next()).intValue());
        }
        return c4566fU0Y;
    }

    public final C4566fU0 y(int i) {
        int[] iArr;
        int iB;
        int i2 = this.D;
        int i3 = i - i2;
        if (i3 >= 0 && i3 < 64) {
            long j = 1 << i3;
            long j2 = this.C;
            if ((j2 & j) != 0) {
                return new C4566fU0(this.B, (~j) & j2, i2, this.E);
            }
        } else if (i3 >= 64 && i3 < 128) {
            long j3 = 1 << (i3 - 64);
            long j4 = this.B;
            if ((j4 & j3) != 0) {
                return new C4566fU0((~j3) & j4, this.C, i2, this.E);
            }
        } else if (i3 < 0 && (iArr = this.E) != null && (iB = AbstractC4845gU0.b(iArr, i)) >= 0) {
            int length = iArr.length;
            int i4 = length - 1;
            if (i4 == 0) {
                return new C4566fU0(this.B, this.C, this.D, null);
            }
            int[] iArr2 = new int[i4];
            if (iB > 0) {
                AbstractC5152hb.f(iArr, iArr2, 0, 0, iB);
            }
            if (iB < i4) {
                AbstractC5152hb.f(iArr, iArr2, iB, iB + 1, length);
            }
            return new C4566fU0(this.B, this.C, this.D, iArr2);
        }
        return this;
    }
}
