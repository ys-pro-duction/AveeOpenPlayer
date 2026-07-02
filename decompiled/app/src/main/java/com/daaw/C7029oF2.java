package com.daaw;

/* JADX INFO: renamed from: com.daaw.oF2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7029oF2 extends AbstractC3772cf3 implements Mg3 {
    private static final C7029oF2 zza;
    private int zzd;
    private String zze = "";
    private boolean zzf;
    private boolean zzg;
    private int zzh;

    static {
        C7029oF2 c7029oF2 = new C7029oF2();
        zza = c7029oF2;
        AbstractC3772cf3.w(C7029oF2.class, c7029oF2);
    }

    public static /* synthetic */ void E(C7029oF2 c7029oF2, String str) {
        str.getClass();
        c7029oF2.zzd |= 1;
        c7029oF2.zze = str;
    }

    @Override // com.daaw.AbstractC3772cf3
    public final Object A(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC3772cf3.t(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004င\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new C7029oF2();
        }
        NC2 nc2 = null;
        if (i2 == 4) {
            return new LE2(nc2);
        }
        if (i2 != 5) {
            return null;
        }
        return zza;
    }

    public final int B() {
        return this.zzh;
    }

    public final String D() {
        return this.zze;
    }

    public final boolean F() {
        return this.zzf;
    }

    public final boolean G() {
        return this.zzg;
    }

    public final boolean H() {
        return (this.zzd & 2) != 0;
    }

    public final boolean I() {
        return (this.zzd & 4) != 0;
    }

    public final boolean J() {
        return (this.zzd & 8) != 0;
    }
}
