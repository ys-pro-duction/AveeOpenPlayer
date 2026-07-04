package com.daaw;

import java.util.List;

/* JADX INFO: renamed from: com.daaw.Xt2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2798Xt2 extends AbstractC3772cf3 implements Mg3 {
    private static final C2798Xt2 zza;
    private int zzd;
    private int zze;
    private String zzf = "";
    private InterfaceC9377wf3 zzg = AbstractC3772cf3.p();
    private boolean zzh;
    private C3583by2 zzi;
    private boolean zzj;
    private boolean zzk;
    private boolean zzl;

    static {
        C2798Xt2 c2798Xt2 = new C2798Xt2();
        zza = c2798Xt2;
        AbstractC3772cf3.w(C2798Xt2.class, c2798Xt2);
    }

    public static C8602tt2 D() {
        return (C8602tt2) zza.i();
    }

    public static /* synthetic */ void J(C2798Xt2 c2798Xt2, String str) {
        c2798Xt2.zzd |= 2;
        c2798Xt2.zzf = str;
    }

    public static /* synthetic */ void K(C2798Xt2 c2798Xt2, int i, C4696fv2 c4696fv2) {
        c4696fv2.getClass();
        InterfaceC9377wf3 interfaceC9377wf3 = c2798Xt2.zzg;
        if (!interfaceC9377wf3.zzc()) {
            c2798Xt2.zzg = AbstractC3772cf3.q(interfaceC9377wf3);
        }
        c2798Xt2.zzg.set(i, c4696fv2);
    }

    @Override // com.daaw.AbstractC3772cf3
    public final Object A(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC3772cf3.t(zza, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဇ\u0002\u0005ဉ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006", new Object[]{"zzd", "zze", "zzf", "zzg", C4696fv2.class, "zzh", "zzi", "zzj", "zzk", "zzl"});
        }
        if (i2 == 3) {
            return new C2798Xt2();
        }
        AbstractC1103Hr2 abstractC1103Hr2 = null;
        if (i2 == 4) {
            return new C8602tt2(abstractC1103Hr2);
        }
        if (i2 != 5) {
            return null;
        }
        return zza;
    }

    public final int B() {
        return this.zzg.size();
    }

    public final int C() {
        return this.zze;
    }

    public final C4696fv2 F(int i) {
        return (C4696fv2) this.zzg.get(i);
    }

    public final C3583by2 G() {
        C3583by2 c3583by2 = this.zzi;
        return c3583by2 == null ? C3583by2.C() : c3583by2;
    }

    public final String H() {
        return this.zzf;
    }

    public final List I() {
        return this.zzg;
    }

    public final boolean L() {
        return this.zzj;
    }

    public final boolean M() {
        return this.zzk;
    }

    public final boolean N() {
        return this.zzl;
    }

    public final boolean O() {
        return (this.zzd & 8) != 0;
    }

    public final boolean P() {
        return (this.zzd & 1) != 0;
    }

    public final boolean Q() {
        return (this.zzd & 64) != 0;
    }
}
