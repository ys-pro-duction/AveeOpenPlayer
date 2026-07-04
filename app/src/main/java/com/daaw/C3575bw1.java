package com.daaw;

/* JADX INFO: renamed from: com.daaw.bw1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3575bw1 extends AbstractC4449f43 implements V43 {
    private static final C3575bw1 zzb;
    private int zzd;
    private long zze;
    private int zzf;
    private boolean zzg;
    private InterfaceC6980o43 zzh = AbstractC4449f43.t();
    private long zzi;

    static {
        C3575bw1 c3575bw1 = new C3575bw1();
        zzb = c3575bw1;
        AbstractC4449f43.D(C3575bw1.class, c3575bw1);
    }

    @Override // com.daaw.AbstractC4449f43
    public final Object J(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC4449f43.A(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဂ\u0000\u0002င\u0001\u0003ဇ\u0002\u0004\u0016\u0005ဃ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new C3575bw1();
        }
        AbstractC9454wv1 abstractC9454wv1 = null;
        if (i2 == 4) {
            return new C3296aw1(abstractC9454wv1);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
