package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public final class Q13 extends AbstractC4449f43 implements V43 {
    private static final Q13 zzb;
    private String zzd = "";

    static {
        Q13 q13 = new Q13();
        zzb = q13;
        AbstractC4449f43.D(Q13.class, q13);
    }

    public static Q13 N() {
        return zzb;
    }

    public static Q13 O(AbstractC9213w33 abstractC9213w33, U33 u33) {
        return (Q13) AbstractC4449f43.p(zzb, abstractC9213w33, u33);
    }

    @Override // com.daaw.AbstractC4449f43
    public final Object J(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC4449f43.A(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"zzd"});
        }
        if (i2 == 3) {
            return new Q13();
        }
        O13 o13 = null;
        if (i2 == 4) {
            return new P13(o13);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final String P() {
        return this.zzd;
    }
}
