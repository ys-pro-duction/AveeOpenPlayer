package com.daaw;

/* JADX INFO: loaded from: classes.dex */
public abstract class K21 {
    public static final AbstractC6453mB0 a = AbstractC2153Rp.c(null, a.B, 1, null);
    public static final long b;
    public static final J21 c;

    public static final class a extends AbstractC4192e90 implements LQ {
        public static final a B = new a();

        public a() {
            super(0);
        }

        @Override // com.daaw.LQ
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final J21 invoke() {
            return K21.c;
        }
    }

    static {
        long jC = AbstractC3530bn.c(4282550004L);
        b = jC;
        c = new J21(jC, C2559Vm.m(jC, 0.4f, 0.0f, 0.0f, 0.0f, 14, null), null);
    }

    public static final AbstractC6453mB0 b() {
        return a;
    }
}
