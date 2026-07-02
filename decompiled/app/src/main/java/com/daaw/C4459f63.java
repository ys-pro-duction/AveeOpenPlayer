package com.daaw;

import java.util.List;

/* JADX INFO: renamed from: com.daaw.f63, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4459f63 extends AbstractC3772cf3 implements Mg3 {
    private static final C4459f63 zza;
    private int zzd;
    private int zze;
    private InterfaceC9377wf3 zzf = AbstractC3772cf3.p();
    private String zzg = "";
    private String zzh = "";
    private boolean zzi;
    private double zzj;

    static {
        C4459f63 c4459f63 = new C4459f63();
        zza = c4459f63;
        AbstractC3772cf3.w(C4459f63.class, c4459f63);
    }

    @Override // com.daaw.AbstractC3772cf3
    public final Object A(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC3772cf3.t(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဇ\u0003\u0006က\u0004", new Object[]{"zzd", "zze", C6148l53.a, "zzf", C4459f63.class, "zzg", "zzh", "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new C4459f63();
        }
        AbstractC4997h03 abstractC4997h03 = null;
        if (i2 == 4) {
            return new C4738g43(abstractC4997h03);
        }
        if (i2 != 5) {
            return null;
        }
        return zza;
    }

    public final double B() {
        return this.zzj;
    }

    public final String D() {
        return this.zzg;
    }

    public final String E() {
        return this.zzh;
    }

    public final List F() {
        return this.zzf;
    }

    public final boolean G() {
        return this.zzi;
    }

    public final boolean H() {
        return (this.zzd & 8) != 0;
    }

    public final boolean I() {
        return (this.zzd & 16) != 0;
    }

    public final boolean J() {
        return (this.zzd & 4) != 0;
    }

    public final int K() {
        int iA = D53.a(this.zze);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }
}
