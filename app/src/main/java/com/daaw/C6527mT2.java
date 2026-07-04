package com.daaw;

import java.util.List;

/* JADX INFO: renamed from: com.daaw.mT2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6527mT2 extends AbstractC3772cf3 implements Mg3 {
    private static final C6527mT2 zza;
    private InterfaceC9377wf3 zzd = AbstractC3772cf3.p();

    static {
        C6527mT2 c6527mT2 = new C6527mT2();
        zza = c6527mT2;
        AbstractC3772cf3.w(C6527mT2.class, c6527mT2);
    }

    public static IS2 B() {
        return (IS2) zza.i();
    }

    public static /* synthetic */ void F(C6527mT2 c6527mT2, C8762uU2 c8762uU2) {
        c8762uU2.getClass();
        InterfaceC9377wf3 interfaceC9377wf3 = c6527mT2.zzd;
        if (!interfaceC9377wf3.zzc()) {
            c6527mT2.zzd = AbstractC3772cf3.q(interfaceC9377wf3);
        }
        c6527mT2.zzd.add(c8762uU2);
    }

    @Override // com.daaw.AbstractC3772cf3
    public final Object A(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC3772cf3.t(zza, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", C8762uU2.class});
        }
        if (i2 == 3) {
            return new C6527mT2();
        }
        AbstractC8160sJ2 abstractC8160sJ2 = null;
        if (i2 == 4) {
            return new IS2(abstractC8160sJ2);
        }
        if (i2 != 5) {
            return null;
        }
        return zza;
    }

    public final C8762uU2 D(int i) {
        return (C8762uU2) this.zzd.get(0);
    }

    public final List E() {
        return this.zzd;
    }
}
