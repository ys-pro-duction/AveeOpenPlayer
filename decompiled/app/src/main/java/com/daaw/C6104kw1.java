package com.daaw;

/* JADX INFO: renamed from: com.daaw.kw1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6104kw1 extends AbstractC4449f43 implements V43 {
    private static final C6104kw1 zzb;
    private int zzd;
    private String zze = "";

    static {
        C6104kw1 c6104kw1 = new C6104kw1();
        zzb = c6104kw1;
        AbstractC4449f43.D(C6104kw1.class, c6104kw1);
    }

    @Override // com.daaw.AbstractC4449f43
    public final Object J(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC4449f43.A(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i2 == 3) {
            return new C6104kw1();
        }
        AbstractC9454wv1 abstractC9454wv1 = null;
        if (i2 == 4) {
            return new C5816jw1(abstractC9454wv1);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
