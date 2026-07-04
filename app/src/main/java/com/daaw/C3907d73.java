package com.daaw;

/* JADX INFO: renamed from: com.daaw.d73, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3907d73 extends AbstractC4449f43 implements V43 {
    private static final C3907d73 zzb;
    private int zzd;
    private int zze;
    private C63 zzg;
    private G63 zzh;
    private int zzi;
    private int zzl;
    private byte zzn = 2;
    private String zzf = "";
    private InterfaceC6980o43 zzj = AbstractC4449f43.t();
    private String zzk = "";
    private InterfaceC8095s43 zzm = AbstractC4449f43.x();

    static {
        C3907d73 c3907d73 = new C3907d73();
        zzb = c3907d73;
        AbstractC4449f43.D(C3907d73.class, c3907d73);
    }

    public static C3628c73 N() {
        return (C3628c73) zzb.j();
    }

    public static /* synthetic */ void Q(C3907d73 c3907d73, int i) {
        c3907d73.zzd |= 1;
        c3907d73.zze = i;
    }

    public static /* synthetic */ void R(C3907d73 c3907d73, String str) {
        str.getClass();
        c3907d73.zzd |= 2;
        c3907d73.zzf = str;
    }

    public static /* synthetic */ void S(C3907d73 c3907d73, C63 c63) {
        c63.getClass();
        c3907d73.zzg = c63;
        c3907d73.zzd |= 4;
    }

    public static /* synthetic */ void T(C3907d73 c3907d73, String str) {
        str.getClass();
        InterfaceC8095s43 interfaceC8095s43 = c3907d73.zzm;
        if (!interfaceC8095s43.zzc()) {
            c3907d73.zzm = AbstractC4449f43.y(interfaceC8095s43);
        }
        c3907d73.zzm.add(str);
    }

    public static /* synthetic */ void U(C3907d73 c3907d73, int i) {
        c3907d73.zzl = i - 1;
        c3907d73.zzd |= 64;
    }

    @Override // com.daaw.AbstractC4449f43
    public final Object J(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzn);
        }
        if (i2 == 2) {
            return AbstractC4449f43.A(zzb, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0002\u0003\u0001ᔄ\u0000\u0002ဈ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005င\u0004\u0006\u0016\u0007ဈ\u0005\b᠌\u0006\t\u001a", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", C3071a73.a, "zzm"});
        }
        if (i2 == 3) {
            return new C3907d73();
        }
        Y53 y53 = null;
        if (i2 == 4) {
            return new C3628c73(y53);
        }
        if (i2 == 5) {
            return zzb;
        }
        this.zzn = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }

    public final int M() {
        return this.zzm.size();
    }

    public final String P() {
        return this.zzf;
    }
}
