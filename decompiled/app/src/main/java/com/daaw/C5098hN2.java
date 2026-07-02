package com.daaw;

/* JADX INFO: renamed from: com.daaw.hN2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5098hN2 extends AbstractC3772cf3 implements Mg3 {
    private static final C5098hN2 zza;
    private int zzd;
    private int zze;
    private long zzf;

    static {
        C5098hN2 c5098hN2 = new C5098hN2();
        zza = c5098hN2;
        AbstractC3772cf3.w(C5098hN2.class, c5098hN2);
    }

    public static BM2 D() {
        return (BM2) zza.i();
    }

    public static /* synthetic */ void F(C5098hN2 c5098hN2, int i) {
        c5098hN2.zzd |= 1;
        c5098hN2.zze = i;
    }

    public static /* synthetic */ void G(C5098hN2 c5098hN2, long j) {
        c5098hN2.zzd |= 2;
        c5098hN2.zzf = j;
    }

    @Override // com.daaw.AbstractC3772cf3
    public final Object A(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC3772cf3.t(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new C5098hN2();
        }
        AbstractC8160sJ2 abstractC8160sJ2 = null;
        if (i2 == 4) {
            return new BM2(abstractC8160sJ2);
        }
        if (i2 != 5) {
            return null;
        }
        return zza;
    }

    public final int B() {
        return this.zze;
    }

    public final long C() {
        return this.zzf;
    }

    public final boolean H() {
        return (this.zzd & 2) != 0;
    }

    public final boolean I() {
        return (this.zzd & 1) != 0;
    }
}
