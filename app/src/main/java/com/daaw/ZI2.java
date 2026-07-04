package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public final class ZI2 extends AbstractC4449f43 implements V43 {
    private static final InterfaceC7259p43 zzb = new XI2();
    private static final ZI2 zzd;
    private int zzA;
    private int zzB;
    private long zzC;
    private int zzD;
    private long zzP;
    private int zzQ;
    private int zzR;
    private int zze;
    private int zzf;
    private long zzh;
    private long zzi;
    private long zzj;
    private boolean zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private int zzq;
    private int zzw;
    private String zzg = "";
    private InterfaceC6980o43 zzk = AbstractC4449f43.t();
    private String zzr = "";
    private String zzs = "";
    private String zzt = "";
    private String zzu = "";
    private String zzv = "";
    private String zzx = "";
    private String zzy = "";
    private InterfaceC7816r43 zzz = AbstractC4449f43.v();
    private String zzE = "";
    private String zzF = "";
    private String zzG = "";
    private String zzH = "";
    private String zzI = "";
    private String zzJ = "";
    private String zzK = "";
    private String zzL = "";
    private String zzM = "";
    private String zzN = "";
    private String zzO = "";

    static {
        ZI2 zi2 = new ZI2();
        zzd = zi2;
        AbstractC4449f43.D(ZI2.class, zi2);
    }

    public static YI2 M() {
        return (YI2) zzd.j();
    }

    public static /* synthetic */ void O(ZI2 zi2, String str) {
        str.getClass();
        zi2.zzN = str;
    }

    public static /* synthetic */ void P(ZI2 zi2, String str) {
        str.getClass();
        zi2.zzO = str;
    }

    public static /* synthetic */ void T(ZI2 zi2, String str) {
        str.getClass();
        zi2.zzr = str;
    }

    public static /* synthetic */ void U(ZI2 zi2, String str) {
        str.getClass();
        zi2.zzu = str;
    }

    public static /* synthetic */ void V(ZI2 zi2, String str) {
        str.getClass();
        zi2.zzv = str;
    }

    public static /* synthetic */ void X(ZI2 zi2, Iterable iterable) {
        InterfaceC7816r43 interfaceC7816r43 = zi2.zzz;
        if (!interfaceC7816r43.zzc()) {
            zi2.zzz = AbstractC4449f43.w(interfaceC7816r43);
        }
        AbstractC4444f33.f(iterable, zi2.zzz);
    }

    public static /* synthetic */ void a0(ZI2 zi2, String str) {
        str.getClass();
        zi2.zzE = str;
    }

    public static /* synthetic */ void b0(ZI2 zi2, String str) {
        str.getClass();
        zi2.zzF = str;
    }

    public static /* synthetic */ void c0(ZI2 zi2, String str) {
        str.getClass();
        zi2.zzJ = str;
    }

    public static /* synthetic */ void e0(ZI2 zi2, String str) {
        str.getClass();
        zi2.zzL = str;
    }

    public static /* synthetic */ void f0(ZI2 zi2, String str) {
        str.getClass();
        zi2.zzM = str;
    }

    public static /* synthetic */ void i0(ZI2 zi2, int i) {
        if (i == 1) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        zi2.zzA = i - 2;
    }

    public static /* synthetic */ void j0(ZI2 zi2, int i) {
        if (i == 1) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        zi2.zzD = i - 2;
    }

    @Override // com.daaw.AbstractC4449f43
    public final Object J(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC4449f43.A(zzd, "\u0000(\u0000\u0000\u0001((\u0000\u0002\u0000\u0001\f\u0002\u0007\u0003\u0002\u0004\f\u0005Ȉ\u0006Ȉ\u0007Ȉ\b\u0004\t\f\n\u0004\u000b\u0002\f\f\rȈ\u000eȈ\u000fȈ\u0010Ȉ\u0011Ȉ\u0012Ȉ\u0013Ȉ\u0014Ȉ\u0015Ȉ\u0016Ȉ\u0017Ȉ\u0018Ȉ\u0019%\u001aȈ\u001bȈ\u001cȈ\u001d\u0002\u001eȈ\u001f\u0002 \u0002!\u0002\"\u0002#\u0002$\u0002%,&\f'\f(\f", new Object[]{"zze", "zzl", "zzm", "zzq", "zzr", "zzu", "zzv", "zzw", "zzA", "zzB", "zzC", "zzD", "zzE", "zzF", "zzJ", "zzK", "zzL", "zzM", "zzN", "zzO", "zzs", "zzt", "zzx", "zzy", "zzz", "zzG", "zzH", "zzI", "zzP", "zzg", "zzh", "zzi", "zzj", "zzn", "zzo", "zzp", "zzk", "zzQ", "zzR", "zzf"});
        }
        if (i2 == 3) {
            return new ZI2();
        }
        XI2 xi2 = null;
        if (i2 == 4) {
            return new YI2(xi2);
        }
        if (i2 != 5) {
            return null;
        }
        return zzd;
    }
}
