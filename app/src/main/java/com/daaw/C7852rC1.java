package com.daaw;

/* JADX INFO: renamed from: com.daaw.rC1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7852rC1 extends AbstractC4449f43 implements V43 {
    private static final C7852rC1 zzb;
    private int zzd;
    private C6737nC1 zze;
    private InterfaceC8095s43 zzf = AbstractC4449f43.x();
    private int zzg;
    private C9816yD1 zzh;

    static {
        C7852rC1 c7852rC1 = new C7852rC1();
        zzb = c7852rC1;
        AbstractC4449f43.D(C7852rC1.class, c7852rC1);
    }

    @Override // com.daaw.AbstractC4449f43
    public final Object J(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC4449f43.A(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b\u0003᠌\u0001\u0004ဉ\u0002", new Object[]{"zzd", "zze", "zzf", C9258wD1.class, "zzg", C5332iC1.a, "zzh"});
        }
        if (i2 == 3) {
            return new C7852rC1();
        }
        AbstractC9529xB1 abstractC9529xB1 = null;
        if (i2 == 4) {
            return new C7574qC1(abstractC9529xB1);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
