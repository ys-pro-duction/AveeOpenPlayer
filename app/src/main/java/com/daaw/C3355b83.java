package com.daaw;

/* JADX INFO: renamed from: com.daaw.b83, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3355b83 extends F32 implements InterfaceC2366Tp2 {
    private static final C3355b83 zzb;
    private int zzd;
    private int zze;

    static {
        C3355b83 c3355b83 = new C3355b83();
        zzb = c3355b83;
        F32.q(C3355b83.class, c3355b83);
    }

    public static /* synthetic */ void x(C3355b83 c3355b83, int i) {
        c3355b83.zze = i - 1;
        c3355b83.zzd |= 1;
    }

    public static J63 y() {
        return (J63) zzb.e();
    }

    @Override // com.daaw.F32
    public final Object u(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return F32.n(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", C9233w73.a});
        }
        if (i2 == 3) {
            return new C3355b83();
        }
        AbstractC4748g63 abstractC4748g63 = null;
        if (i2 == 4) {
            return new J63(abstractC4748g63);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
