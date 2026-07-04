package com.daaw;

import java.util.List;

/* JADX INFO: renamed from: com.daaw.Ps2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1938Ps2 extends AbstractC3772cf3 implements Mg3 {
    private static final C1938Ps2 zza;
    private int zzd;
    private int zze;
    private InterfaceC9377wf3 zzf = AbstractC3772cf3.p();
    private InterfaceC9377wf3 zzg = AbstractC3772cf3.p();
    private boolean zzh;
    private boolean zzi;

    static {
        C1938Ps2 c1938Ps2 = new C1938Ps2();
        zza = c1938Ps2;
        AbstractC3772cf3.w(C1938Ps2.class, c1938Ps2);
    }

    public static /* synthetic */ void J(C1938Ps2 c1938Ps2, int i, C6117kz2 c6117kz2) {
        c6117kz2.getClass();
        InterfaceC9377wf3 interfaceC9377wf3 = c1938Ps2.zzf;
        if (!interfaceC9377wf3.zzc()) {
            c1938Ps2.zzf = AbstractC3772cf3.q(interfaceC9377wf3);
        }
        c1938Ps2.zzf.set(i, c6117kz2);
    }

    public static /* synthetic */ void K(C1938Ps2 c1938Ps2, int i, C2798Xt2 c2798Xt2) {
        c2798Xt2.getClass();
        InterfaceC9377wf3 interfaceC9377wf3 = c1938Ps2.zzg;
        if (!interfaceC9377wf3.zzc()) {
            c1938Ps2.zzg = AbstractC3772cf3.q(interfaceC9377wf3);
        }
        c1938Ps2.zzg.set(i, c2798Xt2);
    }

    @Override // com.daaw.AbstractC3772cf3
    public final Object A(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC3772cf3.t(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"zzd", "zze", "zzf", C6117kz2.class, "zzg", C2798Xt2.class, "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new C1938Ps2();
        }
        AbstractC1103Hr2 abstractC1103Hr2 = null;
        if (i2 == 4) {
            return new C6366ls2(abstractC1103Hr2);
        }
        if (i2 != 5) {
            return null;
        }
        return zza;
    }

    public final int B() {
        return this.zze;
    }

    public final int C() {
        return this.zzg.size();
    }

    public final int D() {
        return this.zzf.size();
    }

    public final C2798Xt2 F(int i) {
        return (C2798Xt2) this.zzg.get(i);
    }

    public final C6117kz2 G(int i) {
        return (C6117kz2) this.zzf.get(i);
    }

    public final List H() {
        return this.zzg;
    }

    public final List I() {
        return this.zzf;
    }

    public final boolean L() {
        return (this.zzd & 1) != 0;
    }
}
