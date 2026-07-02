package com.daaw;

/* JADX INFO: renamed from: com.daaw.Av1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0381Av1 extends AbstractC4449f43 implements V43 {
    private static final C0381Av1 zzb;
    private int zzd;
    private int zze;

    static {
        C0381Av1 c0381Av1 = new C0381Av1();
        zzb = c0381Av1;
        AbstractC4449f43.D(C0381Av1.class, c0381Av1);
    }

    @Override // com.daaw.AbstractC4449f43
    public final Object J(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC4449f43.A(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", C0806Ev1.a});
        }
        if (i2 == 3) {
            return new C0381Av1();
        }
        AbstractC9454wv1 abstractC9454wv1 = null;
        if (i2 == 4) {
            return new C10291zv1(abstractC9454wv1);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
