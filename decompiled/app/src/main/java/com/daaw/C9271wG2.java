package com.daaw;

import java.util.List;

/* JADX INFO: renamed from: com.daaw.wG2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9271wG2 extends AbstractC3772cf3 implements Mg3 {
    private static final C9271wG2 zza;
    private int zzd;
    private long zze;
    private int zzg;
    private boolean zzl;
    private String zzf = "";
    private InterfaceC9377wf3 zzh = AbstractC3772cf3.p();
    private InterfaceC9377wf3 zzi = AbstractC3772cf3.p();
    private InterfaceC9377wf3 zzj = AbstractC3772cf3.p();
    private String zzk = "";
    private InterfaceC9377wf3 zzm = AbstractC3772cf3.p();
    private InterfaceC9377wf3 zzn = AbstractC3772cf3.p();
    private String zzo = "";
    private String zzp = "";
    private String zzq = "";
    private String zzr = "";

    static {
        C9271wG2 c9271wG2 = new C9271wG2();
        zza = c9271wG2;
        AbstractC3772cf3.w(C9271wG2.class, c9271wG2);
    }

    public static SF2 F() {
        return (SF2) zza.i();
    }

    public static C9271wG2 H() {
        return zza;
    }

    public static /* synthetic */ void Q(C9271wG2 c9271wG2, int i, C7029oF2 c7029oF2) {
        c7029oF2.getClass();
        InterfaceC9377wf3 interfaceC9377wf3 = c9271wG2.zzi;
        if (!interfaceC9377wf3.zzc()) {
            c9271wG2.zzi = AbstractC3772cf3.q(interfaceC9377wf3);
        }
        c9271wG2.zzi.set(i, c7029oF2);
    }

    @Override // com.daaw.AbstractC3772cf3
    public final Object A(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC3772cf3.t(zza, "\u0001\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0005\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007ဈ\u0003\bဇ\u0004\t\u001b\n\u001b\u000bဈ\u0005\fဈ\u0006\rဈ\u0007\u000eဈ\b", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", LI2.class, "zzi", C7029oF2.class, "zzj", C1938Ps2.class, "zzk", "zzl", "zzm", F33.class, "zzn", C5062hE2.class, "zzo", "zzp", "zzq", "zzr"});
        }
        if (i2 == 3) {
            return new C9271wG2();
        }
        NC2 nc2 = null;
        if (i2 == 4) {
            return new SF2(nc2);
        }
        if (i2 != 5) {
            return null;
        }
        return zza;
    }

    public final int B() {
        return this.zzm.size();
    }

    public final int C() {
        return this.zzi.size();
    }

    public final long D() {
        return this.zze;
    }

    public final C7029oF2 E(int i) {
        return (C7029oF2) this.zzi.get(i);
    }

    public final String I() {
        return this.zzf;
    }

    public final String J() {
        return this.zzq;
    }

    public final String K() {
        return this.zzp;
    }

    public final String L() {
        return this.zzo;
    }

    public final List M() {
        return this.zzj;
    }

    public final List N() {
        return this.zzn;
    }

    public final List O() {
        return this.zzm;
    }

    public final List P() {
        return this.zzh;
    }

    public final boolean T() {
        return this.zzl;
    }

    public final boolean V() {
        return (this.zzd & 2) != 0;
    }

    public final boolean W() {
        return (this.zzd & 1) != 0;
    }
}
