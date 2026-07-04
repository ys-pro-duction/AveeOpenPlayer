package com.daaw;

/* JADX INFO: renamed from: com.daaw.l23, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6133l23 extends AbstractC4449f43 implements V43 {
    private static final C6133l23 zzb;
    private int zzd;

    static {
        C6133l23 c6133l23 = new C6133l23();
        zzb = c6133l23;
        AbstractC4449f43.D(C6133l23.class, c6133l23);
    }

    public static C6133l23 N() {
        return zzb;
    }

    public static C6133l23 O(AbstractC9213w33 abstractC9213w33, U33 u33) {
        return (C6133l23) AbstractC4449f43.p(zzb, abstractC9213w33, u33);
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
            return new C6133l23();
        }
        AbstractC5563j23 abstractC5563j23 = null;
        if (i2 == 4) {
            return new C5845k23(abstractC5563j23);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
