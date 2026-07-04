package com.daaw;

/* JADX INFO: renamed from: com.daaw.i23, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5286i23 extends AbstractC4449f43 implements V43 {
    private static final C5286i23 zzb;
    private int zzd;
    private AbstractC9213w33 zze = AbstractC9213w33.C;

    static {
        C5286i23 c5286i23 = new C5286i23();
        zzb = c5286i23;
        AbstractC4449f43.D(C5286i23.class, c5286i23);
    }

    public static C5007h23 N() {
        return (C5007h23) zzb.j();
    }

    public static C5286i23 P(AbstractC9213w33 abstractC9213w33, U33 u33) {
        return (C5286i23) AbstractC4449f43.p(zzb, abstractC9213w33, u33);
    }

    @Override // com.daaw.AbstractC4449f43
    public final Object J(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC4449f43.A(zzb, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zzd", "zze"});
        }
        if (i2 == 3) {
            return new C5286i23();
        }
        AbstractC4728g23 abstractC4728g23 = null;
        if (i2 == 4) {
            return new C5007h23(abstractC4728g23);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final int M() {
        return this.zzd;
    }

    public final AbstractC9213w33 Q() {
        return this.zze;
    }
}
