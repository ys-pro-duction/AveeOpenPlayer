package com.daaw;

/* JADX INFO: renamed from: com.daaw.kz1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6116kz1 extends AbstractC4449f43 implements V43 {
    private static final C6116kz1 zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";
    private long zzg;
    private long zzh;
    private long zzi;

    static {
        C6116kz1 c6116kz1 = new C6116kz1();
        zzb = c6116kz1;
        AbstractC4449f43.D(C6116kz1.class, c6116kz1);
    }

    public static C5828jz1 P() {
        return (C5828jz1) zzb.j();
    }

    public static C6116kz1 R() {
        return zzb;
    }

    public static C6116kz1 S(AbstractC9213w33 abstractC9213w33) {
        return (C6116kz1) AbstractC4449f43.n(zzb, abstractC9213w33);
    }

    public static C6116kz1 T(AbstractC9213w33 abstractC9213w33, U33 u33) {
        return (C6116kz1) AbstractC4449f43.p(zzb, abstractC9213w33, u33);
    }

    public static /* synthetic */ void W(C6116kz1 c6116kz1, String str) {
        str.getClass();
        c6116kz1.zzd |= 1;
        c6116kz1.zze = str;
    }

    public static /* synthetic */ void X(C6116kz1 c6116kz1, long j) {
        c6116kz1.zzd |= 16;
        c6116kz1.zzi = j;
    }

    public static /* synthetic */ void Y(C6116kz1 c6116kz1, String str) {
        str.getClass();
        c6116kz1.zzd |= 2;
        c6116kz1.zzf = str;
    }

    public static /* synthetic */ void Z(C6116kz1 c6116kz1, long j) {
        c6116kz1.zzd |= 4;
        c6116kz1.zzg = j;
    }

    public static /* synthetic */ void a0(C6116kz1 c6116kz1, long j) {
        c6116kz1.zzd |= 8;
        c6116kz1.zzh = j;
    }

    @Override // com.daaw.AbstractC4449f43
    public final Object J(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC4449f43.A(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဃ\u0002\u0004ဃ\u0003\u0005ဃ\u0004", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new C6116kz1();
        }
        AbstractC5546iz1 abstractC5546iz1 = null;
        if (i2 == 4) {
            return new C5828jz1(abstractC5546iz1);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final long M() {
        return this.zzh;
    }

    public final long N() {
        return this.zzg;
    }

    public final long O() {
        return this.zzi;
    }

    public final String U() {
        return this.zzf;
    }

    public final String V() {
        return this.zze;
    }
}
