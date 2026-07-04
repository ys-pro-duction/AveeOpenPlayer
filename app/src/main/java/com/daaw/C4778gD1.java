package com.daaw;

/* JADX INFO: renamed from: com.daaw.gD1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4778gD1 extends AbstractC4449f43 implements V43 {
    private static final C4778gD1 zzb;
    private int zzd;
    private int zze;
    private C9816yD1 zzf;

    static {
        C4778gD1 c4778gD1 = new C4778gD1();
        zzb = c4778gD1;
        AbstractC4449f43.D(C4778gD1.class, c4778gD1);
    }

    @Override // com.daaw.AbstractC4449f43
    public final Object J(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC4449f43.A(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001", new Object[]{"zzd", "zze", C5332iC1.a, "zzf"});
        }
        if (i2 == 3) {
            return new C4778gD1();
        }
        AbstractC9529xB1 abstractC9529xB1 = null;
        if (i2 == 4) {
            return new C4489fD1(abstractC9529xB1);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
