package com.daaw;

/* JADX INFO: renamed from: com.daaw.f73, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4464f73 extends AbstractC4449f43 implements V43 {
    private static final C4464f73 zzb;
    private int zzd;
    private long zzf;
    private boolean zzg;
    private int zzh;
    private String zze = "";
    private String zzi = "";
    private String zzj = "";

    static {
        C4464f73 c4464f73 = new C4464f73();
        zzb = c4464f73;
        AbstractC4449f43.D(C4464f73.class, c4464f73);
    }

    public static C4185e73 M() {
        return (C4185e73) zzb.j();
    }

    public static /* synthetic */ void O(C4464f73 c4464f73, String str) {
        c4464f73.zzd |= 1;
        c4464f73.zze = str;
    }

    public static /* synthetic */ void P(C4464f73 c4464f73, long j) {
        c4464f73.zzd |= 2;
        c4464f73.zzf = j;
    }

    public static /* synthetic */ void Q(C4464f73 c4464f73, boolean z) {
        c4464f73.zzd |= 4;
        c4464f73.zzg = z;
    }

    @Override // com.daaw.AbstractC4449f43
    public final Object J(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC4449f43.A(zzb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဇ\u0002\u0004᠌\u0003\u0005ဈ\u0004\u0006ဈ\u0005", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", C4753g73.a, "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new C4464f73();
        }
        Y53 y53 = null;
        if (i2 == 4) {
            return new C4185e73(y53);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
