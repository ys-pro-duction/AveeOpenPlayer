package com.daaw;

/* JADX INFO: loaded from: classes.dex */
public abstract class QF {
    public static final AbstractC6453mB0 a = AbstractC2153Rp.d(b.B);
    public static final AbstractC6453mB0 b = AbstractC2153Rp.c(null, a.B, 1, null);

    public static final class a extends AbstractC4192e90 implements LQ {
        public static final a B = new a();

        public a() {
            super(0);
        }

        public final float a() {
            return C6460mD.l(0);
        }

        @Override // com.daaw.LQ
        public /* bridge */ /* synthetic */ Object invoke() {
            return C6460mD.g(a());
        }
    }

    public static final class b extends AbstractC4192e90 implements LQ {
        public static final b B = new b();

        public b() {
            super(0);
        }

        @Override // com.daaw.LQ
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PF invoke() {
            return C4701fx.a;
        }
    }

    public static final long b(long j, float f, InterfaceC5781jp interfaceC5781jp, int i) {
        if (AbstractC6348lp.O()) {
            AbstractC6348lp.Z(1613340891, i, -1, "androidx.compose.material.calculateForegroundColor (ElevationOverlay.kt:86)");
        }
        long jM = C2559Vm.m(AbstractC7733qn.b(j, interfaceC5781jp, i & 14), ((((float) Math.log(f + 1)) * 4.5f) + 2.0f) / 100.0f, 0.0f, 0.0f, 0.0f, 14, null);
        if (AbstractC6348lp.O()) {
            AbstractC6348lp.Y();
        }
        return jM;
    }

    public static final AbstractC6453mB0 c() {
        return b;
    }

    public static final AbstractC6453mB0 d() {
        return a;
    }
}
