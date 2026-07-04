package com.daaw;

/* JADX INFO: renamed from: com.daaw.hE2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5062hE2 extends AbstractC3772cf3 implements Mg3 {
    private static final C5062hE2 zza;
    private int zzd;
    private String zze = "";
    private InterfaceC9377wf3 zzf = AbstractC3772cf3.p();
    private boolean zzg;

    static {
        C5062hE2 c5062hE2 = new C5062hE2();
        zza = c5062hE2;
        AbstractC3772cf3.w(C5062hE2.class, c5062hE2);
    }

    @Override // com.daaw.AbstractC3772cf3
    public final Object A(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC3772cf3.t(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဇ\u0001", new Object[]{"zzd", "zze", "zzf", DH2.class, "zzg"});
        }
        if (i2 == 3) {
            return new C5062hE2();
        }
        NC2 nc2 = null;
        if (i2 == 4) {
            return new DD2(nc2);
        }
        if (i2 != 5) {
            return null;
        }
        return zza;
    }

    public final String C() {
        return this.zze;
    }
}
