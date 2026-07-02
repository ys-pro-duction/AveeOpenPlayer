package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public final class X63 extends AbstractC4449f43 implements V43 {
    private static final X63 zzb;
    private int zzd;
    private int zze;
    private String zzf = "";
    private AbstractC9213w33 zzg;
    private AbstractC9213w33 zzh;

    static {
        X63 x63 = new X63();
        zzb = x63;
        AbstractC4449f43.D(X63.class, x63);
    }

    public X63() {
        AbstractC9213w33 abstractC9213w33 = AbstractC9213w33.C;
        this.zzg = abstractC9213w33;
        this.zzh = abstractC9213w33;
    }

    public static V63 M() {
        return (V63) zzb.j();
    }

    public static /* synthetic */ void O(X63 x63, String str) {
        x63.zzd |= 2;
        x63.zzf = "image/png";
    }

    public static /* synthetic */ void P(X63 x63, AbstractC9213w33 abstractC9213w33) {
        abstractC9213w33.getClass();
        x63.zzd |= 4;
        x63.zzg = abstractC9213w33;
    }

    public static /* synthetic */ void Q(X63 x63, int i) {
        x63.zze = 1;
        x63.zzd = 1 | x63.zzd;
    }

    @Override // com.daaw.AbstractC4449f43
    public final Object J(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC4449f43.A(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"zzd", "zze", W63.a, "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new X63();
        }
        Y53 y53 = null;
        if (i2 == 4) {
            return new V63(y53);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
