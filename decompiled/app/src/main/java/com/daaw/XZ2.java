package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public final class XZ2 extends AbstractC4449f43 implements V43 {
    private static final XZ2 zzb;
    private int zzd;
    private int zze;
    private C3036a03 zzf;

    static {
        XZ2 xz2 = new XZ2();
        zzb = xz2;
        AbstractC4449f43.D(XZ2.class, xz2);
    }

    public static WZ2 N() {
        return (WZ2) zzb.j();
    }

    public static XZ2 P(AbstractC9213w33 abstractC9213w33, U33 u33) {
        return (XZ2) AbstractC4449f43.p(zzb, abstractC9213w33, u33);
    }

    public static /* synthetic */ void S(XZ2 xz2, C3036a03 c3036a03) {
        c3036a03.getClass();
        xz2.zzf = c3036a03;
        xz2.zzd |= 1;
    }

    @Override // com.daaw.AbstractC4449f43
    public final Object J(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC4449f43.A(zzb, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new XZ2();
        }
        VZ2 vz2 = null;
        if (i2 == 4) {
            return new WZ2(vz2);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final int M() {
        return this.zze;
    }

    public final C3036a03 Q() {
        C3036a03 c3036a03 = this.zzf;
        return c3036a03 == null ? C3036a03.P() : c3036a03;
    }
}
