package com.daaw;

/* JADX INFO: renamed from: com.daaw.pC1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7295pC1 extends AbstractC4449f43 implements V43 {
    private static final C7295pC1 zzb;
    private int zzd;
    private int zze;
    private InterfaceC6980o43 zzf = AbstractC4449f43.t();

    static {
        C7295pC1 c7295pC1 = new C7295pC1();
        zzb = c7295pC1;
        AbstractC4449f43.D(C7295pC1.class, c7295pC1);
    }

    @Override // com.daaw.AbstractC4449f43
    public final Object J(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC4449f43.A(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001᠌\u0000\u0002\u0016", new Object[]{"zzd", "zze", C5332iC1.a, "zzf"});
        }
        if (i2 == 3) {
            return new C7295pC1();
        }
        AbstractC9529xB1 abstractC9529xB1 = null;
        if (i2 == 4) {
            return new C7016oC1(abstractC9529xB1);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
