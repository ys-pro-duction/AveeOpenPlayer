package com.daaw;

import java.util.List;

/* JADX INFO: renamed from: com.daaw.nX2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6822nX2 extends AbstractC3772cf3 implements Mg3 {
    private static final C6822nX2 zza;
    private InterfaceC8533tf3 zzd = AbstractC3772cf3.n();
    private InterfaceC8533tf3 zze = AbstractC3772cf3.n();
    private InterfaceC9377wf3 zzf = AbstractC3772cf3.p();
    private InterfaceC9377wf3 zzg = AbstractC3772cf3.p();

    static {
        C6822nX2 c6822nX2 = new C6822nX2();
        zza = c6822nX2;
        AbstractC3772cf3.w(C6822nX2.class, c6822nX2);
    }

    public static KW2 F() {
        return (KW2) zza.i();
    }

    public static C6822nX2 H() {
        return zza;
    }

    public static /* synthetic */ void M(C6822nX2 c6822nX2, Iterable iterable) {
        InterfaceC8533tf3 interfaceC8533tf3 = c6822nX2.zzd;
        if (!interfaceC8533tf3.zzc()) {
            c6822nX2.zzd = AbstractC3772cf3.o(interfaceC8533tf3);
        }
        AbstractC8797uc3.f(iterable, c6822nX2.zzd);
    }

    public static /* synthetic */ void O(C6822nX2 c6822nX2, Iterable iterable) {
        InterfaceC8533tf3 interfaceC8533tf3 = c6822nX2.zze;
        if (!interfaceC8533tf3.zzc()) {
            c6822nX2.zze = AbstractC3772cf3.o(interfaceC8533tf3);
        }
        AbstractC8797uc3.f(iterable, c6822nX2.zze);
    }

    public static /* synthetic */ void Q(C6822nX2 c6822nX2, Iterable iterable) {
        InterfaceC9377wf3 interfaceC9377wf3 = c6822nX2.zzf;
        if (!interfaceC9377wf3.zzc()) {
            c6822nX2.zzf = AbstractC3772cf3.q(interfaceC9377wf3);
        }
        AbstractC8797uc3.f(iterable, c6822nX2.zzf);
    }

    public static /* synthetic */ void T(C6822nX2 c6822nX2, Iterable iterable) {
        InterfaceC9377wf3 interfaceC9377wf3 = c6822nX2.zzg;
        if (!interfaceC9377wf3.zzc()) {
            c6822nX2.zzg = AbstractC3772cf3.q(interfaceC9377wf3);
        }
        AbstractC8797uc3.f(iterable, c6822nX2.zzg);
    }

    @Override // com.daaw.AbstractC3772cf3
    public final Object A(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC3772cf3.t(zza, "\u0001\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"zzd", "zze", "zzf", C5098hN2.class, "zzg", C9064vY2.class});
        }
        if (i2 == 3) {
            return new C6822nX2();
        }
        AbstractC8160sJ2 abstractC8160sJ2 = null;
        if (i2 == 4) {
            return new KW2(abstractC8160sJ2);
        }
        if (i2 != 5) {
            return null;
        }
        return zza;
    }

    public final int B() {
        return this.zzf.size();
    }

    public final int C() {
        return this.zze.size();
    }

    public final int D() {
        return this.zzg.size();
    }

    public final int E() {
        return this.zzd.size();
    }

    public final List I() {
        return this.zzf;
    }

    public final List J() {
        return this.zze;
    }

    public final List K() {
        return this.zzg;
    }

    public final List L() {
        return this.zzd;
    }
}
