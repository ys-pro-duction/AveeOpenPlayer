package com.daaw;

/* JADX INFO: renamed from: com.daaw.nC1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6737nC1 extends AbstractC4449f43 implements V43 {
    private static final C6737nC1 zzb;
    private int zzd;
    private int zzf;
    private C9816yD1 zzh;
    private String zze = "";
    private InterfaceC6980o43 zzg = AbstractC4449f43.t();

    static {
        C6737nC1 c6737nC1 = new C6737nC1();
        zzb = c6737nC1;
        AbstractC4449f43.D(C6737nC1.class, c6737nC1);
    }

    @Override // com.daaw.AbstractC4449f43
    public final Object J(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC4449f43.A(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003\u0016\u0004ဉ\u0002", new Object[]{"zzd", "zze", "zzf", C5332iC1.a, "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new C6737nC1();
        }
        AbstractC9529xB1 abstractC9529xB1 = null;
        if (i2 == 4) {
            return new C6458mC1(abstractC9529xB1);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
