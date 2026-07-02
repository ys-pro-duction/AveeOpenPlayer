package com.daaw;

import java.util.List;

/* JADX INFO: renamed from: com.daaw.mO2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6507mO2 extends AbstractC3772cf3 implements Mg3 {
    private static final C6507mO2 zza;
    private int zzd;
    private InterfaceC9377wf3 zze = AbstractC3772cf3.p();
    private String zzf = "";
    private long zzg;
    private long zzh;
    private int zzi;

    static {
        C6507mO2 c6507mO2 = new C6507mO2();
        zza = c6507mO2;
        AbstractC3772cf3.w(C6507mO2.class, c6507mO2);
    }

    public static IN2 F() {
        return (IN2) zza.i();
    }

    public static /* synthetic */ void K(C6507mO2 c6507mO2, int i, C9869yQ2 c9869yQ2) {
        c9869yQ2.getClass();
        c6507mO2.X();
        c6507mO2.zze.set(i, c9869yQ2);
    }

    public static /* synthetic */ void L(C6507mO2 c6507mO2, C9869yQ2 c9869yQ2) {
        c9869yQ2.getClass();
        c6507mO2.X();
        c6507mO2.zze.add(c9869yQ2);
    }

    public static /* synthetic */ void M(C6507mO2 c6507mO2, Iterable iterable) {
        c6507mO2.X();
        AbstractC8797uc3.f(iterable, c6507mO2.zze);
    }

    public static /* synthetic */ void O(C6507mO2 c6507mO2, int i) {
        c6507mO2.X();
        c6507mO2.zze.remove(i);
    }

    public static /* synthetic */ void P(C6507mO2 c6507mO2, String str) {
        str.getClass();
        c6507mO2.zzd |= 1;
        c6507mO2.zzf = str;
    }

    public static /* synthetic */ void Q(C6507mO2 c6507mO2, long j) {
        c6507mO2.zzd |= 2;
        c6507mO2.zzg = j;
    }

    public static /* synthetic */ void S(C6507mO2 c6507mO2, long j) {
        c6507mO2.zzd |= 4;
        c6507mO2.zzh = j;
    }

    @Override // com.daaw.AbstractC3772cf3
    public final Object A(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC3772cf3.t(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005င\u0003", new Object[]{"zzd", "zze", C9869yQ2.class, "zzf", "zzg", "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new C6507mO2();
        }
        AbstractC8160sJ2 abstractC8160sJ2 = null;
        if (i2 == 4) {
            return new IN2(abstractC8160sJ2);
        }
        if (i2 != 5) {
            return null;
        }
        return zza;
    }

    public final int B() {
        return this.zzi;
    }

    public final int C() {
        return this.zze.size();
    }

    public final long D() {
        return this.zzh;
    }

    public final long E() {
        return this.zzg;
    }

    public final C9869yQ2 H(int i) {
        return (C9869yQ2) this.zze.get(i);
    }

    public final String I() {
        return this.zzf;
    }

    public final List J() {
        return this.zze;
    }

    public final boolean T() {
        return (this.zzd & 8) != 0;
    }

    public final boolean V() {
        return (this.zzd & 4) != 0;
    }

    public final boolean W() {
        return (this.zzd & 2) != 0;
    }

    public final void X() {
        InterfaceC9377wf3 interfaceC9377wf3 = this.zze;
        if (interfaceC9377wf3.zzc()) {
            return;
        }
        this.zze = AbstractC3772cf3.q(interfaceC9377wf3);
    }
}
