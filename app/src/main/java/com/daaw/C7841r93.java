package com.daaw;

/* JADX INFO: renamed from: com.daaw.r93, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7841r93 extends F32 implements InterfaceC2366Tp2 {
    private static final C7841r93 zzb;
    private int zzd;
    private int zze;

    static {
        C7841r93 c7841r93 = new C7841r93();
        zzb = c7841r93;
        F32.q(C7841r93.class, c7841r93);
    }

    @Override // com.daaw.F32
    public final Object u(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return F32.n(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"zzd", "zze"});
        }
        if (i2 == 3) {
            return new C7841r93();
        }
        AbstractC5598j93 abstractC5598j93 = null;
        if (i2 == 4) {
            return new C6726n93(abstractC5598j93);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
