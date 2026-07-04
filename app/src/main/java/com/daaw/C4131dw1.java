package com.daaw;

/* JADX INFO: renamed from: com.daaw.dw1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4131dw1 extends AbstractC4449f43 implements V43 {
    private static final C4131dw1 zzb;
    private int zzd;
    private AbstractC9213w33 zze;
    private AbstractC9213w33 zzf;
    private AbstractC9213w33 zzg;
    private AbstractC9213w33 zzh;

    static {
        C4131dw1 c4131dw1 = new C4131dw1();
        zzb = c4131dw1;
        AbstractC4449f43.D(C4131dw1.class, c4131dw1);
    }

    public C4131dw1() {
        AbstractC9213w33 abstractC9213w33 = AbstractC9213w33.C;
        this.zze = abstractC9213w33;
        this.zzf = abstractC9213w33;
        this.zzg = abstractC9213w33;
        this.zzh = abstractC9213w33;
    }

    public static C3853cw1 M() {
        return (C3853cw1) zzb.j();
    }

    public static C4131dw1 O(byte[] bArr, U33 u33) {
        return (C4131dw1) AbstractC4449f43.s(zzb, bArr, u33);
    }

    public static /* synthetic */ void T(C4131dw1 c4131dw1, AbstractC9213w33 abstractC9213w33) {
        c4131dw1.zzd |= 1;
        c4131dw1.zze = abstractC9213w33;
    }

    public static /* synthetic */ void U(C4131dw1 c4131dw1, AbstractC9213w33 abstractC9213w33) {
        c4131dw1.zzd |= 2;
        c4131dw1.zzf = abstractC9213w33;
    }

    public static /* synthetic */ void V(C4131dw1 c4131dw1, AbstractC9213w33 abstractC9213w33) {
        c4131dw1.zzd |= 4;
        c4131dw1.zzg = abstractC9213w33;
    }

    public static /* synthetic */ void W(C4131dw1 c4131dw1, AbstractC9213w33 abstractC9213w33) {
        c4131dw1.zzd |= 8;
        c4131dw1.zzh = abstractC9213w33;
    }

    @Override // com.daaw.AbstractC4449f43
    public final Object J(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC4449f43.A(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new C4131dw1();
        }
        AbstractC9454wv1 abstractC9454wv1 = null;
        if (i2 == 4) {
            return new C3853cw1(abstractC9454wv1);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final AbstractC9213w33 P() {
        return this.zze;
    }

    public final AbstractC9213w33 Q() {
        return this.zzf;
    }

    public final AbstractC9213w33 R() {
        return this.zzh;
    }

    public final AbstractC9213w33 S() {
        return this.zzg;
    }
}
