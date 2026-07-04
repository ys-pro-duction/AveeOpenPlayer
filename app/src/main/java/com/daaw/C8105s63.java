package com.daaw;

/* JADX INFO: renamed from: com.daaw.s63, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8105s63 extends AbstractC4449f43 implements V43 {
    private static final C8105s63 zzb;
    private int zzd;
    private C7826r63 zzf;
    private long zzg;
    private String zze = "";
    private String zzh = "";

    static {
        C8105s63 c8105s63 = new C8105s63();
        zzb = c8105s63;
        AbstractC4449f43.D(C8105s63.class, c8105s63);
    }

    @Override // com.daaw.AbstractC4449f43
    public final Object J(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC4449f43.A(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဂ\u0002\u0004ဈ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new C8105s63();
        }
        Y53 y53 = null;
        if (i2 == 4) {
            return new C7269p63(y53);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
