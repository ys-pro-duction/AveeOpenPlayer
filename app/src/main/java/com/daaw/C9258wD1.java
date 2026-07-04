package com.daaw;

/* JADX INFO: renamed from: com.daaw.wD1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9258wD1 extends AbstractC4449f43 implements V43 {
    private static final C9258wD1 zzb;
    private int zzd;
    private String zze = "";
    private int zzf;
    private C9816yD1 zzg;

    static {
        C9258wD1 c9258wD1 = new C9258wD1();
        zzb = c9258wD1;
        AbstractC4449f43.D(C9258wD1.class, c9258wD1);
    }

    @Override // com.daaw.AbstractC4449f43
    public final Object J(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC4449f43.A(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003ဉ\u0002", new Object[]{"zzd", "zze", "zzf", C5332iC1.a, "zzg"});
        }
        if (i2 == 3) {
            return new C9258wD1();
        }
        AbstractC9529xB1 abstractC9529xB1 = null;
        if (i2 == 4) {
            return new C8979vD1(abstractC9529xB1);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
