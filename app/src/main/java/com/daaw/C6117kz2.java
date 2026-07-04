package com.daaw;

/* JADX INFO: renamed from: com.daaw.kz2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6117kz2 extends AbstractC3772cf3 implements Mg3 {
    private static final C6117kz2 zza;
    private int zzd;
    private int zze;
    private String zzf = "";
    private C4696fv2 zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;

    static {
        C6117kz2 c6117kz2 = new C6117kz2();
        zza = c6117kz2;
        AbstractC3772cf3.w(C6117kz2.class, c6117kz2);
    }

    public static C0923Fy2 D() {
        return (C0923Fy2) zza.i();
    }

    public static /* synthetic */ void G(C6117kz2 c6117kz2, String str) {
        c6117kz2.zzd |= 2;
        c6117kz2.zzf = str;
    }

    @Override // com.daaw.AbstractC3772cf3
    public final Object A(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC3772cf3.t(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new C6117kz2();
        }
        AbstractC1103Hr2 abstractC1103Hr2 = null;
        if (i2 == 4) {
            return new C0923Fy2(abstractC1103Hr2);
        }
        if (i2 != 5) {
            return null;
        }
        return zza;
    }

    public final int B() {
        return this.zze;
    }

    public final C4696fv2 C() {
        C4696fv2 c4696fv2 = this.zzg;
        return c4696fv2 == null ? C4696fv2.C() : c4696fv2;
    }

    public final String F() {
        return this.zzf;
    }

    public final boolean H() {
        return this.zzh;
    }

    public final boolean I() {
        return this.zzi;
    }

    public final boolean J() {
        return this.zzj;
    }

    public final boolean K() {
        return (this.zzd & 1) != 0;
    }

    public final boolean L() {
        return (this.zzd & 32) != 0;
    }
}
