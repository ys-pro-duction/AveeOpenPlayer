package com.daaw;

/* JADX INFO: renamed from: com.daaw.y23, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9766y23 extends F32 implements InterfaceC2366Tp2 {
    private static final InterfaceC5031h72 zzb = new C3185aZ2();
    private static final C9766y23 zzd;
    private int zze;
    private int zzg;
    private C9343wY2 zzj;
    private boolean zzk;
    private boolean zzl;
    private String zzf = "";
    private D62 zzh = F32.k();
    private M72 zzi = F32.l();

    static {
        C9766y23 c9766y23 = new C9766y23();
        zzd = c9766y23;
        F32.q(C9766y23.class, c9766y23);
    }

    @Override // com.daaw.F32
    public final Object u(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return F32.n(zzd, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0002\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003ࠬ\u0004\u001b\u0005ဉ\u0002\u0006ဇ\u0003\u0007ဇ\u0004", new Object[]{"zze", "zzf", "zzg", U13.a, "zzh", C5276i03.a, "zzi", P83.class, "zzj", "zzk", "zzl"});
        }
        if (i2 == 3) {
            return new C9766y23();
        }
        C3185aZ2 c3185aZ2 = null;
        if (i2 == 4) {
            return new C7523q13(c3185aZ2);
        }
        if (i2 != 5) {
            return null;
        }
        return zzd;
    }
}
