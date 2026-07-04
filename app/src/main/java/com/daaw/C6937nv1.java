package com.daaw;

/* JADX INFO: renamed from: com.daaw.nv1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6937nv1 extends AbstractC4449f43 implements V43 {
    private static final C6937nv1 zzb;
    private int zzd;
    private long zzf;
    private long zzj;
    private long zzk;
    private long zzm;
    private int zzq;
    private String zze = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private String zzl = "";
    private String zzn = "";
    private String zzo = "";
    private InterfaceC8095s43 zzp = AbstractC4449f43.x();

    static {
        C6937nv1 c6937nv1 = new C6937nv1();
        zzb = c6937nv1;
        AbstractC4449f43.D(C6937nv1.class, c6937nv1);
    }

    public static C3849cv1 M() {
        return (C3849cv1) zzb.j();
    }

    public static /* synthetic */ void O(C6937nv1 c6937nv1, long j) {
        c6937nv1.zzd |= 2;
        c6937nv1.zzf = j;
    }

    public static /* synthetic */ void P(C6937nv1 c6937nv1, String str) {
        str.getClass();
        c6937nv1.zzd |= 4;
        c6937nv1.zzg = str;
    }

    public static /* synthetic */ void Q(C6937nv1 c6937nv1, String str) {
        str.getClass();
        c6937nv1.zzd |= 8;
        c6937nv1.zzh = str;
    }

    public static /* synthetic */ void R(C6937nv1 c6937nv1, String str) {
        c6937nv1.zzd |= 16;
        c6937nv1.zzi = str;
    }

    public static /* synthetic */ void S(C6937nv1 c6937nv1, String str) {
        c6937nv1.zzd |= 1024;
        c6937nv1.zzo = str;
    }

    public static /* synthetic */ void T(C6937nv1 c6937nv1, String str) {
        str.getClass();
        c6937nv1.zzd |= 1;
        c6937nv1.zze = str;
    }

    public static /* synthetic */ void U(C6937nv1 c6937nv1, int i) {
        c6937nv1.zzq = i - 1;
        c6937nv1.zzd |= 2048;
    }

    @Override // com.daaw.AbstractC4449f43
    public final Object J(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC4449f43.A(zzb, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဈ\u0007\tဂ\b\nဈ\t\u000bဈ\n\f\u001b\r᠌\u000b", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", C6379lv1.class, "zzq", C6658mv1.a});
        }
        if (i2 == 3) {
            return new C6937nv1();
        }
        AbstractC3571bv1 abstractC3571bv1 = null;
        if (i2 == 4) {
            return new C3849cv1(abstractC3571bv1);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
