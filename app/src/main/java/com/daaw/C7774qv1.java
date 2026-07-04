package com.daaw;

/* JADX INFO: renamed from: com.daaw.qv1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7774qv1 extends AbstractC4449f43 implements V43 {
    private static final C7774qv1 zzb;
    private int zzd;
    private C8331sv1 zze;
    private C9175vv1 zzf;

    static {
        C7774qv1 c7774qv1 = new C7774qv1();
        zzb = c7774qv1;
        AbstractC4449f43.D(C7774qv1.class, c7774qv1);
    }

    @Override // com.daaw.AbstractC4449f43
    public final Object J(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC4449f43.A(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new C7774qv1();
        }
        AbstractC7216ov1 abstractC7216ov1 = null;
        if (i2 == 4) {
            return new C7495pv1(abstractC7216ov1);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
