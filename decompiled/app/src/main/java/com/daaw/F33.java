package com.daaw;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class F33 extends AbstractC3772cf3 implements Mg3 {
    private static final F33 zza;
    private int zzd;
    private InterfaceC9377wf3 zze = AbstractC3772cf3.p();
    private C7244p13 zzf;

    static {
        F33 f33 = new F33();
        zza = f33;
        AbstractC3772cf3.w(F33.class, f33);
    }

    @Override // com.daaw.AbstractC3772cf3
    public final Object A(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC3772cf3.t(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zzd", "zze", C4459f63.class, "zzf"});
        }
        if (i2 == 3) {
            return new F33();
        }
        AbstractC4997h03 abstractC4997h03 = null;
        if (i2 == 4) {
            return new C3330b33(abstractC4997h03);
        }
        if (i2 != 5) {
            return null;
        }
        return zza;
    }

    public final C7244p13 B() {
        C7244p13 c7244p13 = this.zzf;
        return c7244p13 == null ? C7244p13.D() : c7244p13;
    }

    public final List D() {
        return this.zze;
    }
}
