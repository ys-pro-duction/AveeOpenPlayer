package com.daaw;

/* JADX INFO: renamed from: com.daaw.a03, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3036a03 extends AbstractC4449f43 implements V43 {
    private static final C3036a03 zzb;
    private int zzd;

    static {
        C3036a03 c3036a03 = new C3036a03();
        zzb = c3036a03;
        AbstractC4449f43.D(C3036a03.class, c3036a03);
    }

    public static ZZ2 N() {
        return (ZZ2) zzb.j();
    }

    public static C3036a03 P() {
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
            return new C3036a03();
        }
        YZ2 yz2 = null;
        if (i2 == 4) {
            return new ZZ2(yz2);
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
