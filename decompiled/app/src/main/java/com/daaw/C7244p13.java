package com.daaw;

import java.util.List;

/* JADX INFO: renamed from: com.daaw.p13, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7244p13 extends AbstractC3772cf3 implements Mg3 {
    private static final C7244p13 zza;
    private InterfaceC9377wf3 zzd = AbstractC3772cf3.p();

    static {
        C7244p13 c7244p13 = new C7244p13();
        zza = c7244p13;
        AbstractC3772cf3.w(C7244p13.class, c7244p13);
    }

    public static C7244p13 D() {
        return zza;
    }

    @Override // com.daaw.AbstractC3772cf3
    public final Object A(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC3772cf3.t(zza, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", C9487x23.class});
        }
        if (i2 == 3) {
            return new C7244p13();
        }
        AbstractC4997h03 abstractC4997h03 = null;
        if (i2 == 4) {
            return new L03(abstractC4997h03);
        }
        if (i2 != 5) {
            return null;
        }
        return zza;
    }

    public final int B() {
        return this.zzd.size();
    }

    public final List E() {
        return this.zzd;
    }
}
