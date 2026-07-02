package com.daaw;

import java.util.List;

/* JADX INFO: renamed from: com.daaw.jC2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5610jC2 extends AbstractC3772cf3 implements Mg3 {
    private static final C5610jC2 zza;
    private int zzd;
    private int zze;
    private boolean zzg;
    private String zzf = "";
    private InterfaceC9377wf3 zzh = AbstractC3772cf3.p();

    static {
        C5610jC2 c5610jC2 = new C5610jC2();
        zza = c5610jC2;
        AbstractC3772cf3.w(C5610jC2.class, c5610jC2);
    }

    public static C5610jC2 D() {
        return zza;
    }

    @Override // com.daaw.AbstractC3772cf3
    public final Object A(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC3772cf3.t(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004\u001a", new Object[]{"zzd", "zze", YA2.a, "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new C5610jC2();
        }
        AbstractC1103Hr2 abstractC1103Hr2 = null;
        if (i2 == 4) {
            return new C1862Oz2(abstractC1103Hr2);
        }
        if (i2 != 5) {
            return null;
        }
        return zza;
    }

    public final int B() {
        return this.zzh.size();
    }

    public final String E() {
        return this.zzf;
    }

    public final List F() {
        return this.zzh;
    }

    public final boolean G() {
        return this.zzg;
    }

    public final boolean H() {
        return (this.zzd & 4) != 0;
    }

    public final boolean I() {
        return (this.zzd & 2) != 0;
    }

    public final boolean J() {
        return (this.zzd & 1) != 0;
    }

    public final int K() {
        int iA = CB2.a(this.zze);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }
}
