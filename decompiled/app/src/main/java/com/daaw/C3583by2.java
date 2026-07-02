package com.daaw;

/* JADX INFO: renamed from: com.daaw.by2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3583by2 extends AbstractC3772cf3 implements Mg3 {
    private static final C3583by2 zza;
    private int zzd;
    private int zze;
    private boolean zzf;
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";

    static {
        C3583by2 c3583by2 = new C3583by2();
        zza = c3583by2;
        AbstractC3772cf3.w(C3583by2.class, c3583by2);
    }

    public static C3583by2 C() {
        return zza;
    }

    @Override // com.daaw.AbstractC3772cf3
    public final Object A(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC3772cf3.t(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"zzd", "zze", C2290Sw2.a, "zzf", "zzg", "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new C3583by2();
        }
        AbstractC1103Hr2 abstractC1103Hr2 = null;
        if (i2 == 4) {
            return new C1327Jv2(abstractC1103Hr2);
        }
        if (i2 != 5) {
            return null;
        }
        return zza;
    }

    public final String D() {
        return this.zzg;
    }

    public final String E() {
        return this.zzi;
    }

    public final String F() {
        return this.zzh;
    }

    public final boolean G() {
        return this.zzf;
    }

    public final boolean H() {
        return (this.zzd & 1) != 0;
    }

    public final boolean I() {
        return (this.zzd & 4) != 0;
    }

    public final boolean J() {
        return (this.zzd & 2) != 0;
    }

    public final boolean K() {
        return (this.zzd & 16) != 0;
    }

    public final boolean L() {
        return (this.zzd & 8) != 0;
    }

    public final int M() {
        int iA = AbstractC9463wx2.a(this.zze);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }
}
