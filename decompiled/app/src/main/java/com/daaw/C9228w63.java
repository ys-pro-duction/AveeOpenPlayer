package com.daaw;

/* JADX INFO: renamed from: com.daaw.w63, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9228w63 extends AbstractC4449f43 implements V43 {
    private static final C9228w63 zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private boolean zzg;
    private long zzh;

    static {
        C9228w63 c9228w63 = new C9228w63();
        zzb = c9228w63;
        AbstractC4449f43.D(C9228w63.class, c9228w63);
    }

    @Override // com.daaw.AbstractC4449f43
    public final Object J(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC4449f43.A(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003ဇ\u0002\u0004ဂ\u0003", new Object[]{"zzd", "zze", C8949v63.a, "zzf", C8384t63.a, "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new C9228w63();
        }
        Y53 y53 = null;
        if (i2 == 4) {
            return new C8663u63(y53);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
