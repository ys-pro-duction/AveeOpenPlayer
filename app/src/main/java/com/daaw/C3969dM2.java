package com.daaw;

/* JADX INFO: renamed from: com.daaw.dM2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3969dM2 extends AbstractC3772cf3 implements Mg3 {
    private static final C3969dM2 zza;
    private int zzd;
    private int zze;
    private C6822nX2 zzf;
    private C6822nX2 zzg;
    private boolean zzh;

    static {
        C3969dM2 c3969dM2 = new C3969dM2();
        zza = c3969dM2;
        AbstractC3772cf3.w(C3969dM2.class, c3969dM2);
    }

    public static GL2 C() {
        return (GL2) zza.i();
    }

    public static /* synthetic */ void G(C3969dM2 c3969dM2, int i) {
        c3969dM2.zzd |= 1;
        c3969dM2.zze = i;
    }

    public static /* synthetic */ void H(C3969dM2 c3969dM2, C6822nX2 c6822nX2) {
        c6822nX2.getClass();
        c3969dM2.zzf = c6822nX2;
        c3969dM2.zzd |= 2;
    }

    public static /* synthetic */ void I(C3969dM2 c3969dM2, C6822nX2 c6822nX2) {
        c3969dM2.zzg = c6822nX2;
        c3969dM2.zzd |= 4;
    }

    public static /* synthetic */ void J(C3969dM2 c3969dM2, boolean z) {
        c3969dM2.zzd |= 8;
        c3969dM2.zzh = z;
    }

    @Override // com.daaw.AbstractC3772cf3
    public final Object A(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC3772cf3.t(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new C3969dM2();
        }
        AbstractC8160sJ2 abstractC8160sJ2 = null;
        if (i2 == 4) {
            return new GL2(abstractC8160sJ2);
        }
        if (i2 != 5) {
            return null;
        }
        return zza;
    }

    public final int B() {
        return this.zze;
    }

    public final C6822nX2 E() {
        C6822nX2 c6822nX2 = this.zzf;
        return c6822nX2 == null ? C6822nX2.H() : c6822nX2;
    }

    public final C6822nX2 F() {
        C6822nX2 c6822nX2 = this.zzg;
        return c6822nX2 == null ? C6822nX2.H() : c6822nX2;
    }

    public final boolean K() {
        return this.zzh;
    }

    public final boolean L() {
        return (this.zzd & 1) != 0;
    }

    public final boolean M() {
        return (this.zzd & 8) != 0;
    }

    public final boolean N() {
        return (this.zzd & 4) != 0;
    }
}
