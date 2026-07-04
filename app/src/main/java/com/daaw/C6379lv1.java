package com.daaw;

/* JADX INFO: renamed from: com.daaw.lv1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6379lv1 extends AbstractC4449f43 implements V43 {
    private static final C6379lv1 zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";

    static {
        C6379lv1 c6379lv1 = new C6379lv1();
        zzb = c6379lv1;
        AbstractC4449f43.D(C6379lv1.class, c6379lv1);
    }

    @Override // com.daaw.AbstractC4449f43
    public final Object J(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC4449f43.A(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new C6379lv1();
        }
        AbstractC3571bv1 abstractC3571bv1 = null;
        if (i2 == 4) {
            return new C4127dv1(abstractC3571bv1);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
