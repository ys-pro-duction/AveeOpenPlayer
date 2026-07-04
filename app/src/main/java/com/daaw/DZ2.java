package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public final class DZ2 extends AbstractC3772cf3 implements Mg3 {
    private static final DZ2 zza;
    private int zzd;
    private long zze;
    private String zzf = "";
    private String zzg = "";
    private long zzh;
    private float zzi;
    private double zzj;

    static {
        DZ2 dz2 = new DZ2();
        zza = dz2;
        AbstractC3772cf3.w(DZ2.class, dz2);
    }

    public static ZY2 E() {
        return (ZY2) zza.i();
    }

    public static /* synthetic */ void I(DZ2 dz2, long j) {
        dz2.zzd |= 1;
        dz2.zze = j;
    }

    public static /* synthetic */ void J(DZ2 dz2, String str) {
        str.getClass();
        dz2.zzd |= 2;
        dz2.zzf = str;
    }

    public static /* synthetic */ void K(DZ2 dz2, String str) {
        str.getClass();
        dz2.zzd |= 4;
        dz2.zzg = str;
    }

    public static /* synthetic */ void L(DZ2 dz2) {
        dz2.zzd &= -5;
        dz2.zzg = zza.zzg;
    }

    public static /* synthetic */ void M(DZ2 dz2, long j) {
        dz2.zzd |= 8;
        dz2.zzh = j;
    }

    public static /* synthetic */ void N(DZ2 dz2) {
        dz2.zzd &= -9;
        dz2.zzh = 0L;
    }

    public static /* synthetic */ void O(DZ2 dz2, double d) {
        dz2.zzd |= 32;
        dz2.zzj = d;
    }

    public static /* synthetic */ void P(DZ2 dz2) {
        dz2.zzd &= -33;
        dz2.zzj = 0.0d;
    }

    @Override // com.daaw.AbstractC3772cf3
    public final Object A(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC3772cf3.t(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ခ\u0004\u0006က\u0005", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new DZ2();
        }
        AbstractC8160sJ2 abstractC8160sJ2 = null;
        if (i2 == 4) {
            return new ZY2(abstractC8160sJ2);
        }
        if (i2 != 5) {
            return null;
        }
        return zza;
    }

    public final double B() {
        return this.zzj;
    }

    public final long C() {
        return this.zzh;
    }

    public final long D() {
        return this.zze;
    }

    public final String G() {
        return this.zzf;
    }

    public final String H() {
        return this.zzg;
    }

    public final boolean Q() {
        return (this.zzd & 32) != 0;
    }

    public final boolean S() {
        return (this.zzd & 8) != 0;
    }

    public final boolean T() {
        return (this.zzd & 1) != 0;
    }

    public final boolean V() {
        return (this.zzd & 4) != 0;
    }
}
