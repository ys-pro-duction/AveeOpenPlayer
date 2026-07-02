package com.daaw;

/* JADX INFO: renamed from: com.daaw.Gv1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1014Gv1 extends AbstractC4449f43 implements V43 {
    private static final C1014Gv1 zzb;
    private int zzd;
    private long zze = -1;
    private int zzf = 1000;
    private int zzg = 1000;

    static {
        C1014Gv1 c1014Gv1 = new C1014Gv1();
        zzb = c1014Gv1;
        AbstractC4449f43.D(C1014Gv1.class, c1014Gv1);
    }

    @Override // com.daaw.AbstractC4449f43
    public final Object J(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            InterfaceC6701n43 interfaceC6701n43 = C4699fw1.a;
            return AbstractC4449f43.A(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"zzd", "zze", "zzf", interfaceC6701n43, "zzg", interfaceC6701n43});
        }
        if (i2 == 3) {
            return new C1014Gv1();
        }
        AbstractC9454wv1 abstractC9454wv1 = null;
        if (i2 == 4) {
            return new C0910Fv1(abstractC9454wv1);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
