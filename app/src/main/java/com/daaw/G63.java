package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public final class G63 extends AbstractC4449f43 implements V43 {
    private static final G63 zzb;
    private int zzd;
    private F63 zze;
    private AbstractC9213w33 zzg;
    private AbstractC9213w33 zzh;
    private int zzi;
    private AbstractC9213w33 zzj;
    private byte zzk = 2;
    private InterfaceC8095s43 zzf = AbstractC4449f43.x();

    static {
        G63 g63 = new G63();
        zzb = g63;
        AbstractC4449f43.D(G63.class, g63);
    }

    public G63() {
        AbstractC9213w33 abstractC9213w33 = AbstractC9213w33.C;
        this.zzg = abstractC9213w33;
        this.zzh = abstractC9213w33;
        this.zzj = abstractC9213w33;
    }

    @Override // com.daaw.AbstractC4449f43
    public final Object J(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzk);
        }
        if (i2 == 2) {
            return AbstractC4449f43.A(zzb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003\u0006ည\u0004", new Object[]{"zzd", "zze", "zzf", C9786y63.class, "zzg", "zzh", "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new G63();
        }
        Y53 y53 = null;
        if (i2 == 4) {
            return new D63(y53);
        }
        if (i2 == 5) {
            return zzb;
        }
        this.zzk = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
