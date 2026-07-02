package com.daaw;

import java.util.List;

/* JADX INFO: renamed from: com.daaw.yQ2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9869yQ2 extends AbstractC3772cf3 implements Mg3 {
    private static final C9869yQ2 zza;
    private int zzd;
    private long zzg;
    private float zzh;
    private double zzi;
    private String zze = "";
    private String zzf = "";
    private InterfaceC9377wf3 zzj = AbstractC3772cf3.p();

    static {
        C9869yQ2 c9869yQ2 = new C9869yQ2();
        zza = c9869yQ2;
        AbstractC3772cf3.w(C9869yQ2.class, c9869yQ2);
    }

    public static WP2 F() {
        return (WP2) zza.i();
    }

    public static /* synthetic */ void K(C9869yQ2 c9869yQ2, String str) {
        str.getClass();
        c9869yQ2.zzd |= 1;
        c9869yQ2.zze = str;
    }

    public static /* synthetic */ void L(C9869yQ2 c9869yQ2, String str) {
        str.getClass();
        c9869yQ2.zzd |= 2;
        c9869yQ2.zzf = str;
    }

    public static /* synthetic */ void M(C9869yQ2 c9869yQ2) {
        c9869yQ2.zzd &= -3;
        c9869yQ2.zzf = zza.zzf;
    }

    public static /* synthetic */ void N(C9869yQ2 c9869yQ2, long j) {
        c9869yQ2.zzd |= 4;
        c9869yQ2.zzg = j;
    }

    public static /* synthetic */ void O(C9869yQ2 c9869yQ2) {
        c9869yQ2.zzd &= -5;
        c9869yQ2.zzg = 0L;
    }

    public static /* synthetic */ void P(C9869yQ2 c9869yQ2, double d) {
        c9869yQ2.zzd |= 16;
        c9869yQ2.zzi = d;
    }

    public static /* synthetic */ void Q(C9869yQ2 c9869yQ2) {
        c9869yQ2.zzd &= -17;
        c9869yQ2.zzi = 0.0d;
    }

    public static /* synthetic */ void S(C9869yQ2 c9869yQ2, C9869yQ2 c9869yQ22) {
        c9869yQ22.getClass();
        c9869yQ2.b0();
        c9869yQ2.zzj.add(c9869yQ22);
    }

    public static /* synthetic */ void T(C9869yQ2 c9869yQ2, Iterable iterable) {
        c9869yQ2.b0();
        AbstractC8797uc3.f(iterable, c9869yQ2.zzj);
    }

    @Override // com.daaw.AbstractC3772cf3
    public final Object A(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC3772cf3.t(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ခ\u0003\u0005က\u0004\u0006\u001b", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", C9869yQ2.class});
        }
        if (i2 == 3) {
            return new C9869yQ2();
        }
        AbstractC8160sJ2 abstractC8160sJ2 = null;
        if (i2 == 4) {
            return new WP2(abstractC8160sJ2);
        }
        if (i2 != 5) {
            return null;
        }
        return zza;
    }

    public final double B() {
        return this.zzi;
    }

    public final float C() {
        return this.zzh;
    }

    public final int D() {
        return this.zzj.size();
    }

    public final long E() {
        return this.zzg;
    }

    public final String H() {
        return this.zze;
    }

    public final String I() {
        return this.zzf;
    }

    public final List J() {
        return this.zzj;
    }

    public final boolean W() {
        return (this.zzd & 16) != 0;
    }

    public final boolean X() {
        return (this.zzd & 8) != 0;
    }

    public final boolean Y() {
        return (this.zzd & 4) != 0;
    }

    public final boolean Z() {
        return (this.zzd & 1) != 0;
    }

    public final boolean a0() {
        return (this.zzd & 2) != 0;
    }

    public final void b0() {
        InterfaceC9377wf3 interfaceC9377wf3 = this.zzj;
        if (interfaceC9377wf3.zzc()) {
            return;
        }
        this.zzj = AbstractC3772cf3.q(interfaceC9377wf3);
    }
}
