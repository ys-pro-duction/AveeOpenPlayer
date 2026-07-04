package com.daaw;

/* JADX INFO: renamed from: com.daaw.Uv1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2493Uv1 extends AbstractC4449f43 implements V43 {
    private static final C2493Uv1 zzb;
    private int zzd;
    private long zze = -1;
    private int zzf = 1000;

    static {
        C2493Uv1 c2493Uv1 = new C2493Uv1();
        zzb = c2493Uv1;
        AbstractC4449f43.D(C2493Uv1.class, c2493Uv1);
    }

    @Override // com.daaw.AbstractC4449f43
    public final Object J(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC4449f43.A(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002᠌\u0001", new Object[]{"zzd", "zze", "zzf", C4699fw1.a});
        }
        if (i2 == 3) {
            return new C2493Uv1();
        }
        AbstractC9454wv1 abstractC9454wv1 = null;
        if (i2 == 4) {
            return new C2389Tv1(abstractC9454wv1);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
