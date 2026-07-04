package com.daaw;

import java.io.InputStream;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class F13 extends AbstractC4449f43 implements V43 {
    private static final F13 zzb;
    private int zzd;
    private InterfaceC8095s43 zze = AbstractC4449f43.x();

    static {
        F13 f13 = new F13();
        zzb = f13;
        AbstractC4449f43.D(F13.class, f13);
    }

    public static C13 O() {
        return (C13) zzb.j();
    }

    public static F13 R(InputStream inputStream, U33 u33) {
        return (F13) AbstractC4449f43.r(zzb, inputStream, u33);
    }

    public static /* synthetic */ void U(F13 f13, E13 e13) {
        e13.getClass();
        InterfaceC8095s43 interfaceC8095s43 = f13.zze;
        if (!interfaceC8095s43.zzc()) {
            f13.zze = AbstractC4449f43.y(interfaceC8095s43);
        }
        f13.zze.add(e13);
    }

    @Override // com.daaw.AbstractC4449f43
    public final Object J(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC4449f43.A(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zzd", "zze", E13.class});
        }
        if (i2 == 3) {
            return new F13();
        }
        B13 b13 = null;
        if (i2 == 4) {
            return new C13(b13);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final int M() {
        return this.zze.size();
    }

    public final int N() {
        return this.zzd;
    }

    public final E13 P(int i) {
        return (E13) this.zze.get(i);
    }

    public final List S() {
        return this.zze;
    }
}
