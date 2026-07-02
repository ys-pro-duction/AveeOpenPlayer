package com.daaw;

/* JADX INFO: renamed from: com.daaw.t03, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8354t03 extends AbstractC4449f43 implements V43 {
    private static final C8354t03 zzb;
    private int zzd;

    static {
        C8354t03 c8354t03 = new C8354t03();
        zzb = c8354t03;
        AbstractC4449f43.D(C8354t03.class, c8354t03);
    }

    public static C8075s03 N() {
        return (C8075s03) zzb.j();
    }

    public static C8354t03 P() {
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
            return new C8354t03();
        }
        AbstractC7796r03 abstractC7796r03 = null;
        if (i2 == 4) {
            return new C8075s03(abstractC7796r03);
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
