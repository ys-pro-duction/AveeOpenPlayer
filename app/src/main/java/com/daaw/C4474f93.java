package com.daaw;

/* JADX INFO: renamed from: com.daaw.f93, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4474f93 extends F32 implements InterfaceC2366Tp2 {
    private static final C4474f93 zzb;
    private int zzd;
    private int zze;

    static {
        C4474f93 c4474f93 = new C4474f93();
        zzb = c4474f93;
        F32.q(C4474f93.class, c4474f93);
    }

    public static C4474f93 y() {
        return zzb;
    }

    @Override // com.daaw.F32
    public final Object u(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return F32.n(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", C3360b93.a});
        }
        if (i2 == 3) {
            return new C4474f93();
        }
        T83 t83 = null;
        if (i2 == 4) {
            return new X83(t83);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
