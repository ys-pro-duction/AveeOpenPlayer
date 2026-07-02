package com.daaw;

/* JADX INFO: renamed from: com.daaw.fv2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4696fv2 extends AbstractC3772cf3 implements Mg3 {
    private static final C4696fv2 zza;
    private int zzd;
    private C5610jC2 zze;
    private C3583by2 zzf;
    private boolean zzg;
    private String zzh = "";

    static {
        C4696fv2 c4696fv2 = new C4696fv2();
        zza = c4696fv2;
        AbstractC3772cf3.w(C4696fv2.class, c4696fv2);
    }

    public static C4696fv2 C() {
        return zza;
    }

    public static /* synthetic */ void G(C4696fv2 c4696fv2, String str) {
        c4696fv2.zzd |= 8;
        c4696fv2.zzh = str;
    }

    @Override // com.daaw.AbstractC3772cf3
    public final Object A(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC3772cf3.t(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new C4696fv2();
        }
        AbstractC1103Hr2 abstractC1103Hr2 = null;
        if (i2 == 4) {
            return new C0482Bu2(abstractC1103Hr2);
        }
        if (i2 != 5) {
            return null;
        }
        return zza;
    }

    public final C3583by2 D() {
        C3583by2 c3583by2 = this.zzf;
        return c3583by2 == null ? C3583by2.C() : c3583by2;
    }

    public final C5610jC2 E() {
        C5610jC2 c5610jC2 = this.zze;
        return c5610jC2 == null ? C5610jC2.D() : c5610jC2;
    }

    public final String F() {
        return this.zzh;
    }

    public final boolean H() {
        return this.zzg;
    }

    public final boolean I() {
        return (this.zzd & 4) != 0;
    }

    public final boolean J() {
        return (this.zzd & 2) != 0;
    }

    public final boolean K() {
        return (this.zzd & 8) != 0;
    }

    public final boolean L() {
        return (this.zzd & 1) != 0;
    }
}
