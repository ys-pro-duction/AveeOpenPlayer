package com.daaw;

/* JADX INFO: renamed from: com.daaw.vv1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9175vv1 extends AbstractC4449f43 implements V43 {
    private static final C9175vv1 zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";

    static {
        C9175vv1 c9175vv1 = new C9175vv1();
        zzb = c9175vv1;
        AbstractC4449f43.D(C9175vv1.class, c9175vv1);
    }

    @Override // com.daaw.AbstractC4449f43
    public final Object J(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC4449f43.A(zzb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new C9175vv1();
        }
        AbstractC7216ov1 abstractC7216ov1 = null;
        if (i2 == 4) {
            return new C8896uv1(abstractC7216ov1);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
