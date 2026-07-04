package com.daaw;

/* JADX INFO: renamed from: com.daaw.d63, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3902d63 extends AbstractC4449f43 implements V43 {
    private static final C3902d63 zzb;
    private int zzd;
    private int zze;
    private long zzf;
    private AbstractC9213w33 zzg = AbstractC9213w33.C;

    static {
        C3902d63 c3902d63 = new C3902d63();
        zzb = c3902d63;
        AbstractC4449f43.D(C3902d63.class, c3902d63);
    }

    @Override // com.daaw.AbstractC4449f43
    public final Object J(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC4449f43.A(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဂ\u0001\u0003ည\u0002", new Object[]{"zzd", "zze", C3623c63.a, "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new C3902d63();
        }
        Y53 y53 = null;
        if (i2 == 4) {
            return new C3345b63(y53);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
