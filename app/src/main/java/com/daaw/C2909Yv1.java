package com.daaw;

/* JADX INFO: renamed from: com.daaw.Yv1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2909Yv1 extends AbstractC4449f43 implements V43 {
    private static final C2909Yv1 zzb;
    private int zzd;
    private long zze = -1;
    private long zzf = -1;
    private long zzg = -1;
    private long zzh = -1;
    private long zzi = -1;
    private long zzj = -1;
    private long zzk = -1;
    private long zzl = -1;

    static {
        C2909Yv1 c2909Yv1 = new C2909Yv1();
        zzb = c2909Yv1;
        AbstractC4449f43.D(C2909Yv1.class, c2909Yv1);
    }

    public static C2805Xv1 M() {
        return (C2805Xv1) zzb.j();
    }

    public static /* synthetic */ void O(C2909Yv1 c2909Yv1, long j) {
        c2909Yv1.zzd |= 1;
        c2909Yv1.zze = j;
    }

    public static /* synthetic */ void P(C2909Yv1 c2909Yv1, long j) {
        c2909Yv1.zzd |= 4;
        c2909Yv1.zzg = j;
    }

    public static /* synthetic */ void Q(C2909Yv1 c2909Yv1, long j) {
        c2909Yv1.zzd |= 8;
        c2909Yv1.zzh = j;
    }

    public static /* synthetic */ void R(C2909Yv1 c2909Yv1, long j) {
        c2909Yv1.zzd |= 16;
        c2909Yv1.zzi = j;
    }

    public static /* synthetic */ void S(C2909Yv1 c2909Yv1, long j) {
        c2909Yv1.zzd |= 32;
        c2909Yv1.zzj = j;
    }

    @Override // com.daaw.AbstractC4449f43
    public final Object J(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC4449f43.A(zzb, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
        }
        if (i2 == 3) {
            return new C2909Yv1();
        }
        AbstractC9454wv1 abstractC9454wv1 = null;
        if (i2 == 4) {
            return new C2805Xv1(abstractC9454wv1);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
