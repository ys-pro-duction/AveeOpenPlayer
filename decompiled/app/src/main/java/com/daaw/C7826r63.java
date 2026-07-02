package com.daaw;

/* JADX INFO: renamed from: com.daaw.r63, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7826r63 extends AbstractC4449f43 implements V43 {
    private static final C7826r63 zzb;
    private int zzd;
    private AbstractC9213w33 zze = AbstractC9213w33.C;

    static {
        C7826r63 c7826r63 = new C7826r63();
        zzb = c7826r63;
        AbstractC4449f43.D(C7826r63.class, c7826r63);
    }

    @Override // com.daaw.AbstractC4449f43
    public final Object J(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC4449f43.A(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ည\u0000", new Object[]{"zzd", "zze"});
        }
        if (i2 == 3) {
            return new C7826r63();
        }
        Y53 y53 = null;
        if (i2 == 4) {
            return new C7548q63(y53);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
