package com.daaw;

import com.daaw.AbstractC3808cn;
import java.util.Arrays;

/* JADX INFO: renamed from: com.daaw.Mq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1615Mq {
    public static final a g = new a(null);
    public final AbstractC4933gn a;
    public final AbstractC4933gn b;
    public final AbstractC4933gn c;
    public final AbstractC4933gn d;
    public final int e;
    public final float[] f;

    /* JADX INFO: renamed from: com.daaw.Mq$a */
    public static final class a {

        /* JADX INFO: renamed from: com.daaw.Mq$a$a, reason: collision with other inner class name */
        public static final class C0093a extends C1615Mq {
            public C0093a(AbstractC4933gn abstractC4933gn, int i) {
                super(abstractC4933gn, abstractC4933gn, i, null);
            }

            @Override // com.daaw.C1615Mq
            public float[] a(float[] fArr) {
                G10.g(fArr, "v");
                return fArr;
            }
        }

        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public final float[] b(AbstractC4933gn abstractC4933gn, AbstractC4933gn abstractC4933gn2, int i) {
            if (!VG0.e(i, VG0.a.a())) {
                return null;
            }
            long jF = abstractC4933gn.f();
            AbstractC3808cn.a aVar = AbstractC3808cn.a;
            boolean zE = AbstractC3808cn.e(jF, aVar.b());
            boolean zE2 = AbstractC3808cn.e(abstractC4933gn2.f(), aVar.b());
            if (zE && zE2) {
                return null;
            }
            if (!zE && !zE2) {
                return null;
            }
            if (!zE) {
                abstractC4933gn = abstractC4933gn2;
            }
            C9002vJ0 c9002vJ0 = (C9002vJ0) abstractC4933gn;
            float[] fArrC = zE ? c9002vJ0.r().c() : C4292eY.a.c();
            float[] fArrC2 = zE2 ? c9002vJ0.r().c() : C4292eY.a.c();
            return new float[]{fArrC[0] / fArrC2[0], fArrC[1] / fArrC2[1], fArrC[2] / fArrC2[2]};
        }

        public final C1615Mq c(AbstractC4933gn abstractC4933gn) {
            G10.g(abstractC4933gn, "source");
            return new C0093a(abstractC4933gn, VG0.a.c());
        }

        public a() {
        }
    }

    /* JADX INFO: renamed from: com.daaw.Mq$b */
    public static final class b extends C1615Mq {
        public final C9002vJ0 h;
        public final C9002vJ0 i;
        public final float[] j;

        public /* synthetic */ b(C9002vJ0 c9002vJ0, C9002vJ0 c9002vJ02, int i, AbstractC2911Yw abstractC2911Yw) {
            this(c9002vJ0, c9002vJ02, i);
        }

        @Override // com.daaw.C1615Mq
        public float[] a(float[] fArr) {
            G10.g(fArr, "v");
            fArr[0] = (float) ((Number) this.h.l().invoke(Double.valueOf(fArr[0]))).doubleValue();
            fArr[1] = (float) ((Number) this.h.l().invoke(Double.valueOf(fArr[1]))).doubleValue();
            fArr[2] = (float) ((Number) this.h.l().invoke(Double.valueOf(fArr[2]))).doubleValue();
            AbstractC5212hn.m(this.j, fArr);
            fArr[0] = (float) ((Number) this.i.o().invoke(Double.valueOf(fArr[0]))).doubleValue();
            fArr[1] = (float) ((Number) this.i.o().invoke(Double.valueOf(fArr[1]))).doubleValue();
            fArr[2] = (float) ((Number) this.i.o().invoke(Double.valueOf(fArr[2]))).doubleValue();
            return fArr;
        }

        public final float[] b(C9002vJ0 c9002vJ0, C9002vJ0 c9002vJ02, int i) {
            if (AbstractC5212hn.f(c9002vJ0.r(), c9002vJ02.r())) {
                return AbstractC5212hn.k(c9002vJ02.n(), c9002vJ0.q());
            }
            float[] fArrQ = c9002vJ0.q();
            float[] fArrN = c9002vJ02.n();
            float[] fArrC = c9002vJ0.r().c();
            float[] fArrC2 = c9002vJ02.r().c();
            C2433Ug1 c2433Ug1R = c9002vJ0.r();
            C4292eY c4292eY = C4292eY.a;
            if (!AbstractC5212hn.f(c2433Ug1R, c4292eY.b())) {
                float[] fArrB = V2.b.a().b();
                float[] fArrC3 = c4292eY.c();
                float[] fArrCopyOf = Arrays.copyOf(fArrC3, fArrC3.length);
                G10.f(fArrCopyOf, "copyOf(this, size)");
                fArrQ = AbstractC5212hn.k(AbstractC5212hn.e(fArrB, fArrC, fArrCopyOf), c9002vJ0.q());
            }
            if (!AbstractC5212hn.f(c9002vJ02.r(), c4292eY.b())) {
                float[] fArrB2 = V2.b.a().b();
                float[] fArrC4 = c4292eY.c();
                float[] fArrCopyOf2 = Arrays.copyOf(fArrC4, fArrC4.length);
                G10.f(fArrCopyOf2, "copyOf(this, size)");
                fArrN = AbstractC5212hn.j(AbstractC5212hn.k(AbstractC5212hn.e(fArrB2, fArrC2, fArrCopyOf2), c9002vJ02.q()));
            }
            if (VG0.e(i, VG0.a.a())) {
                fArrQ = AbstractC5212hn.l(new float[]{fArrC[0] / fArrC2[0], fArrC[1] / fArrC2[1], fArrC[2] / fArrC2[2]}, fArrQ);
            }
            return AbstractC5212hn.k(fArrN, fArrQ);
        }

        public b(C9002vJ0 c9002vJ0, C9002vJ0 c9002vJ02, int i) {
            super(c9002vJ0, c9002vJ02, c9002vJ0, c9002vJ02, i, null, null);
            this.h = c9002vJ0;
            this.i = c9002vJ02;
            this.j = b(c9002vJ0, c9002vJ02, i);
        }
    }

    public /* synthetic */ C1615Mq(AbstractC4933gn abstractC4933gn, AbstractC4933gn abstractC4933gn2, int i, AbstractC2911Yw abstractC2911Yw) {
        this(abstractC4933gn, abstractC4933gn2, i);
    }

    public float[] a(float[] fArr) {
        G10.g(fArr, "v");
        float[] fArrI = this.c.i(fArr);
        float[] fArr2 = this.f;
        if (fArr2 != null) {
            fArrI[0] = fArrI[0] * fArr2[0];
            fArrI[1] = fArrI[1] * fArr2[1];
            fArrI[2] = fArrI[2] * fArr2[2];
        }
        return this.d.a(fArrI);
    }

    public /* synthetic */ C1615Mq(AbstractC4933gn abstractC4933gn, AbstractC4933gn abstractC4933gn2, AbstractC4933gn abstractC4933gn3, AbstractC4933gn abstractC4933gn4, int i, float[] fArr, AbstractC2911Yw abstractC2911Yw) {
        this(abstractC4933gn, abstractC4933gn2, abstractC4933gn3, abstractC4933gn4, i, fArr);
    }

    public C1615Mq(AbstractC4933gn abstractC4933gn, AbstractC4933gn abstractC4933gn2, AbstractC4933gn abstractC4933gn3, AbstractC4933gn abstractC4933gn4, int i, float[] fArr) {
        this.a = abstractC4933gn;
        this.b = abstractC4933gn2;
        this.c = abstractC4933gn3;
        this.d = abstractC4933gn4;
        this.e = i;
        this.f = fArr;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1615Mq(AbstractC4933gn abstractC4933gn, AbstractC4933gn abstractC4933gn2, int i) {
        long jF = abstractC4933gn.f();
        AbstractC3808cn.a aVar = AbstractC3808cn.a;
        this(abstractC4933gn, abstractC4933gn2, AbstractC3808cn.e(jF, aVar.b()) ? AbstractC5212hn.d(abstractC4933gn, C4292eY.a.b(), null, 2, null) : abstractC4933gn, AbstractC3808cn.e(abstractC4933gn2.f(), aVar.b()) ? AbstractC5212hn.d(abstractC4933gn2, C4292eY.a.b(), null, 2, null) : abstractC4933gn2, i, g.b(abstractC4933gn, abstractC4933gn2, i), null);
    }
}
