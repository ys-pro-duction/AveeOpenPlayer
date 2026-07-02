package com.daaw;

/* JADX INFO: renamed from: com.daaw.y63, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9786y63 extends AbstractC4449f43 implements V43 {
    private static final C9786y63 zzb;
    private int zzd;
    private AbstractC9213w33 zze;
    private AbstractC9213w33 zzf;
    private byte zzg = 2;

    static {
        C9786y63 c9786y63 = new C9786y63();
        zzb = c9786y63;
        AbstractC4449f43.D(C9786y63.class, c9786y63);
    }

    public C9786y63() {
        AbstractC9213w33 abstractC9213w33 = AbstractC9213w33.C;
        this.zze = abstractC9213w33;
        this.zzf = abstractC9213w33;
    }

    public static C9507x63 M() {
        return (C9507x63) zzb.j();
    }

    public static /* synthetic */ void O(C9786y63 c9786y63, AbstractC9213w33 abstractC9213w33) {
        c9786y63.zzd |= 1;
        c9786y63.zze = abstractC9213w33;
    }

    public static /* synthetic */ void P(C9786y63 c9786y63, AbstractC9213w33 abstractC9213w33) {
        c9786y63.zzd |= 2;
        c9786y63.zzf = abstractC9213w33;
    }

    @Override // com.daaw.AbstractC4449f43
    public final Object J(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzg);
        }
        if (i2 == 2) {
            return AbstractC4449f43.A(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᔊ\u0000\u0002ည\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new C9786y63();
        }
        Y53 y53 = null;
        if (i2 == 4) {
            return new C9507x63(y53);
        }
        if (i2 == 5) {
            return zzb;
        }
        this.zzg = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
