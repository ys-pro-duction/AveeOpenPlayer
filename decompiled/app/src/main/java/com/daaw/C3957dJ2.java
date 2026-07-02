package com.daaw;

/* JADX INFO: renamed from: com.daaw.dJ2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3957dJ2 extends AbstractC4449f43 implements V43 {
    private static final C3957dJ2 zzb;
    private int zzd;
    private ZI2 zze;

    static {
        C3957dJ2 c3957dJ2 = new C3957dJ2();
        zzb = c3957dJ2;
        AbstractC4449f43.D(C3957dJ2.class, c3957dJ2);
    }

    public static C3678cJ2 M() {
        return (C3678cJ2) zzb.j();
    }

    public static /* synthetic */ void O(C3957dJ2 c3957dJ2, ZI2 zi2) {
        zi2.getClass();
        c3957dJ2.zze = zi2;
        c3957dJ2.zzd |= 1;
    }

    @Override // com.daaw.AbstractC4449f43
    public final Object J(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC4449f43.A(zzb, "\u0000\u0001\u0000\u0001\u0006\u0006\u0001\u0000\u0000\u0000\u0006ဉ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i2 == 3) {
            return new C3957dJ2();
        }
        AbstractC3121aJ2 abstractC3121aJ2 = null;
        if (i2 == 4) {
            return new C3678cJ2(abstractC3121aJ2);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
