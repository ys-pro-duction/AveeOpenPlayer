package com.daaw;

import java.util.List;

/* JADX INFO: renamed from: com.daaw.vY2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9064vY2 extends AbstractC3772cf3 implements Mg3 {
    private static final C9064vY2 zza;
    private int zzd;
    private int zze;
    private InterfaceC8533tf3 zzf = AbstractC3772cf3.n();

    static {
        C9064vY2 c9064vY2 = new C9064vY2();
        zza = c9064vY2;
        AbstractC3772cf3.w(C9064vY2.class, c9064vY2);
    }

    public static RX2 E() {
        return (RX2) zza.i();
    }

    public static /* synthetic */ void H(C9064vY2 c9064vY2, int i) {
        c9064vY2.zzd |= 1;
        c9064vY2.zze = i;
    }

    public static /* synthetic */ void I(C9064vY2 c9064vY2, Iterable iterable) {
        InterfaceC8533tf3 interfaceC8533tf3 = c9064vY2.zzf;
        if (!interfaceC8533tf3.zzc()) {
            c9064vY2.zzf = AbstractC3772cf3.o(interfaceC8533tf3);
        }
        AbstractC8797uc3.f(iterable, c9064vY2.zzf);
    }

    @Override // com.daaw.AbstractC3772cf3
    public final Object A(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC3772cf3.t(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new C9064vY2();
        }
        AbstractC8160sJ2 abstractC8160sJ2 = null;
        if (i2 == 4) {
            return new RX2(abstractC8160sJ2);
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
        return this.zze;
    }

    public final long D(int i) {
        return this.zzf.c(i);
    }

    public final List G() {
        return this.zzf;
    }

    public final boolean J() {
        return (this.zzd & 1) != 0;
    }
}
