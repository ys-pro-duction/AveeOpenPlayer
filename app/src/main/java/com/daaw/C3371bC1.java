package com.daaw;

/* JADX INFO: renamed from: com.daaw.bC1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3371bC1 extends AbstractC4449f43 implements V43 {
    private static final C3371bC1 zzb;
    private int zzd;
    private int zze;
    private C9816yD1 zzf;
    private C9816yD1 zzg;
    private C9816yD1 zzh;
    private InterfaceC8095s43 zzi = AbstractC4449f43.x();
    private int zzj;

    static {
        C3371bC1 c3371bC1 = new C3371bC1();
        zzb = c3371bC1;
        AbstractC4449f43.D(C3371bC1.class, c3371bC1);
    }

    @Override // com.daaw.AbstractC4449f43
    public final Object J(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC4449f43.A(zzb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005\u001b\u0006င\u0004", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", C9816yD1.class, "zzj"});
        }
        if (i2 == 3) {
            return new C3371bC1();
        }
        AbstractC9529xB1 abstractC9529xB1 = null;
        if (i2 == 4) {
            return new C3092aC1(abstractC9529xB1);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
