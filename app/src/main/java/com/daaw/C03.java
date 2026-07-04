package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public final class C03 extends AbstractC4449f43 implements V43 {
    private static final C03 zzb;
    private int zzd;

    static {
        C03 c03 = new C03();
        zzb = c03;
        AbstractC4449f43.D(C03.class, c03);
    }

    public static B03 N() {
        return (B03) zzb.j();
    }

    public static C03 P() {
        return zzb;
    }

    @Override // com.daaw.AbstractC4449f43
    public final Object J(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC4449f43.A(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zzd"});
        }
        if (i2 == 3) {
            return new C03();
        }
        A03 a03 = null;
        if (i2 == 4) {
            return new B03(a03);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final int M() {
        return this.zzd;
    }
}
