package com.daaw;

import java.util.List;

/* JADX INFO: renamed from: com.daaw.x23, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9487x23 extends AbstractC3772cf3 implements Mg3 {
    private static final C9487x23 zza;
    private int zzd;
    private String zze = "";
    private InterfaceC9377wf3 zzf = AbstractC3772cf3.p();

    static {
        C9487x23 c9487x23 = new C9487x23();
        zza = c9487x23;
        AbstractC3772cf3.w(C9487x23.class, c9487x23);
    }

    @Override // com.daaw.AbstractC3772cf3
    public final Object A(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC3772cf3.t(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"zzd", "zze", "zzf", C4459f63.class});
        }
        if (i2 == 3) {
            return new C9487x23();
        }
        AbstractC4997h03 abstractC4997h03 = null;
        if (i2 == 4) {
            return new T13(abstractC4997h03);
        }
        if (i2 != 5) {
            return null;
        }
        return zza;
    }

    public final String C() {
        return this.zze;
    }

    public final List D() {
        return this.zzf;
    }
}
