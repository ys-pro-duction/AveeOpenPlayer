package com.daaw;

/* JADX INFO: renamed from: com.daaw.oD1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7020oD1 extends AbstractC4449f43 implements V43 {
    private static final C7020oD1 zzb;
    private int zzd;
    private int zzf;
    private int zzg;
    private long zzh;
    private long zzk;
    private int zzl;
    private InterfaceC8095s43 zze = AbstractC4449f43.x();
    private String zzi = "";
    private String zzj = "";

    static {
        C7020oD1 c7020oD1 = new C7020oD1();
        zzb = c7020oD1;
        AbstractC4449f43.D(C7020oD1.class, c7020oD1);
    }

    public static C5895kD1 M() {
        return (C5895kD1) zzb.j();
    }

    public static /* synthetic */ void O(C7020oD1 c7020oD1, Iterable iterable) {
        InterfaceC8095s43 interfaceC8095s43 = c7020oD1.zze;
        if (!interfaceC8095s43.zzc()) {
            c7020oD1.zze = AbstractC4449f43.y(interfaceC8095s43);
        }
        AbstractC4444f33.f(iterable, c7020oD1.zze);
    }

    public static /* synthetic */ void P(C7020oD1 c7020oD1, int i) {
        c7020oD1.zzd |= 1;
        c7020oD1.zzf = i;
    }

    public static /* synthetic */ void Q(C7020oD1 c7020oD1, int i) {
        c7020oD1.zzd |= 2;
        c7020oD1.zzg = i;
    }

    public static /* synthetic */ void R(C7020oD1 c7020oD1, long j) {
        c7020oD1.zzd |= 4;
        c7020oD1.zzh = j;
    }

    public static /* synthetic */ void S(C7020oD1 c7020oD1, String str) {
        str.getClass();
        c7020oD1.zzd |= 8;
        c7020oD1.zzi = str;
    }

    public static /* synthetic */ void T(C7020oD1 c7020oD1, String str) {
        str.getClass();
        c7020oD1.zzd |= 16;
        c7020oD1.zzj = str;
    }

    public static /* synthetic */ void U(C7020oD1 c7020oD1, long j) {
        c7020oD1.zzd |= 32;
        c7020oD1.zzk = j;
    }

    public static /* synthetic */ void V(C7020oD1 c7020oD1, int i) {
        c7020oD1.zzd |= 64;
        c7020oD1.zzl = i;
    }

    @Override // com.daaw.AbstractC4449f43
    public final Object J(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC4449f43.A(zzb, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001\u001b\u0002င\u0000\u0003င\u0001\u0004ဂ\u0002\u0005ဈ\u0003\u0006ဈ\u0004\u0007ဂ\u0005\bင\u0006", new Object[]{"zzd", "zze", C5613jD1.class, "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
        }
        if (i2 == 3) {
            return new C7020oD1();
        }
        AbstractC9529xB1 abstractC9529xB1 = null;
        if (i2 == 4) {
            return new C5895kD1(abstractC9529xB1);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
