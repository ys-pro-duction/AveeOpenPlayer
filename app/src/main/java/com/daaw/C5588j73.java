package com.daaw;

/* JADX INFO: renamed from: com.daaw.j73, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5588j73 extends AbstractC4449f43 implements V43 {
    private static final C5588j73 zzb;
    private int zzd;
    private String zze = "";
    private AbstractC9213w33 zzf = AbstractC9213w33.C;

    static {
        C5588j73 c5588j73 = new C5588j73();
        zzb = c5588j73;
        AbstractC4449f43.D(C5588j73.class, c5588j73);
    }

    @Override // com.daaw.AbstractC4449f43
    public final Object J(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC4449f43.A(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new C5588j73();
        }
        Y53 y53 = null;
        if (i2 == 4) {
            return new C5311i73(y53);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
