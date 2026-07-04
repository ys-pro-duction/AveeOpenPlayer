package com.daaw;

/* JADX INFO: renamed from: com.daaw.iw1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5534iw1 extends AbstractC4449f43 implements V43 {
    private static final C5534iw1 zzb;
    private int zzd;
    private long zze;
    private String zzf = "";
    private AbstractC9213w33 zzg = AbstractC9213w33.C;

    static {
        C5534iw1 c5534iw1 = new C5534iw1();
        zzb = c5534iw1;
        AbstractC4449f43.D(C5534iw1.class, c5534iw1);
    }

    public static C5534iw1 O() {
        return zzb;
    }

    @Override // com.daaw.AbstractC4449f43
    public final Object J(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC4449f43.A(zzb, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0003ဈ\u0001\u0004ည\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new C5534iw1();
        }
        AbstractC9454wv1 abstractC9454wv1 = null;
        if (i2 == 4) {
            return new C5257hw1(abstractC9454wv1);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final long M() {
        return this.zze;
    }

    public final boolean P() {
        return (this.zzd & 1) != 0;
    }
}
