package com.daaw;

import com.google.android.gms.ads.AdRequest;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: com.daaw.Zv1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3013Zv1 extends AbstractC4449f43 implements V43 {
    private static final C3013Zv1 zzb;
    private long zzA;
    private long zzB;
    private long zzF;
    private long zzG;
    private long zzH;
    private long zzJ;
    private C3575bw1 zzM;
    private C2493Uv1 zzaC;
    private long zzaI;
    private C1014Gv1 zzaL;
    private C1222Iv1 zzaM;
    private int zzaP;
    private long zzaQ;
    private boolean zzaT;
    private long zzaV;
    private C5534iw1 zzaW;
    private C2701Wv1 zzae;
    private C2909Yv1 zzag;
    private int zzar;
    private int zzas;
    private int zzat;
    private C6104kw1 zzau;
    private int zzd;
    private int zze;
    private int zzf;
    private long zzi;
    private long zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private long zzq;
    private long zzr;
    private long zzt;
    private long zzu;
    private long zzv;
    private long zzw;
    private long zzx;
    private long zzy;
    private long zzz;
    private String zzg = "";
    private String zzh = "";
    private String zzs = "";
    private String zzC = "";
    private String zzD = "D";
    private String zzE = "";
    private String zzI = "";
    private long zzK = -1;
    private long zzL = -1;
    private long zzN = -1;
    private long zzO = -1;
    private long zzP = -1;
    private long zzQ = -1;
    private long zzR = -1;
    private long zzS = -1;
    private String zzT = "D";
    private String zzU = "D";
    private long zzV = -1;
    private int zzW = 1000;
    private int zzX = 1000;
    private long zzY = -1;
    private long zzZ = -1;
    private long zzaa = -1;
    private long zzab = -1;
    private long zzac = -1;
    private int zzad = 1000;
    private InterfaceC8095s43 zzaf = AbstractC4449f43.x();
    private long zzah = -1;
    private long zzai = -1;
    private long zzaj = -1;
    private long zzak = -1;
    private long zzal = -1;
    private long zzam = -1;
    private long zzan = -1;
    private long zzao = -1;
    private String zzap = "D";
    private long zzaq = -1;
    private long zzav = -1;
    private int zzaw = 1000;
    private int zzax = 1000;
    private String zzay = "D";
    private InterfaceC8095s43 zzaz = AbstractC4449f43.x();
    private int zzaA = 1000;
    private InterfaceC8095s43 zzaB = AbstractC4449f43.x();
    private String zzaD = "";
    private long zzaE = -1;
    private long zzaF = -1;
    private long zzaG = -1;
    private long zzaH = -1;
    private long zzaJ = -1;
    private String zzaK = "";
    private long zzaN = -1;
    private long zzaO = -1;
    private String zzaR = "";
    private int zzaS = 2;
    private String zzaU = "";
    private long zzaX = -1;
    private String zzaY = "";

    static {
        C3013Zv1 c3013Zv1 = new C3013Zv1();
        zzb = c3013Zv1;
        AbstractC4449f43.D(C3013Zv1.class, c3013Zv1);
    }

    public static /* synthetic */ void A0(C3013Zv1 c3013Zv1, int i) {
        c3013Zv1.zzX = i - 1;
        c3013Zv1.zze |= 2048;
    }

    public static /* synthetic */ void B0(C3013Zv1 c3013Zv1, int i) {
        c3013Zv1.zzad = i - 1;
        c3013Zv1.zze |= 131072;
    }

    public static /* synthetic */ void C0(C3013Zv1 c3013Zv1, int i) {
        c3013Zv1.zzaw = i - 1;
        c3013Zv1.zzf |= 8;
    }

    public static /* synthetic */ void D0(C3013Zv1 c3013Zv1, int i) {
        c3013Zv1.zzax = i - 1;
        c3013Zv1.zzf |= 16;
    }

    public static /* synthetic */ void E0(C3013Zv1 c3013Zv1, int i) {
        c3013Zv1.zzaP = i - 1;
        c3013Zv1.zzf |= 1048576;
    }

    public static /* synthetic */ void F0(C3013Zv1 c3013Zv1, int i) {
        c3013Zv1.zzaS = 5;
        c3013Zv1.zzf |= 8388608;
    }

    public static C3013Zv1 H0() {
        return zzb;
    }

    public static C3013Zv1 I0(byte[] bArr, U33 u33) {
        return (C3013Zv1) AbstractC4449f43.s(zzb, bArr, u33);
    }

    public static /* synthetic */ void M(C3013Zv1 c3013Zv1, long j) {
        c3013Zv1.zzd |= 134217728;
        c3013Zv1.zzH = j;
    }

    public static /* synthetic */ void M0(C3013Zv1 c3013Zv1, String str) {
        str.getClass();
        c3013Zv1.zzd |= 1;
        c3013Zv1.zzg = str;
    }

    public static /* synthetic */ void N(C3013Zv1 c3013Zv1, String str) {
        str.getClass();
        c3013Zv1.zzd |= 268435456;
        c3013Zv1.zzI = str;
    }

    public static /* synthetic */ void N0(C3013Zv1 c3013Zv1, String str) {
        str.getClass();
        c3013Zv1.zzd |= 2;
        c3013Zv1.zzh = str;
    }

    public static /* synthetic */ void O(C3013Zv1 c3013Zv1, long j) {
        c3013Zv1.zzd |= 536870912;
        c3013Zv1.zzJ = j;
    }

    public static /* synthetic */ void O0(C3013Zv1 c3013Zv1, long j) {
        c3013Zv1.zzd |= 4;
        c3013Zv1.zzi = j;
    }

    public static /* synthetic */ void P(C3013Zv1 c3013Zv1, long j) {
        c3013Zv1.zzd |= 1073741824;
        c3013Zv1.zzK = j;
    }

    public static /* synthetic */ void P0(C3013Zv1 c3013Zv1, long j) {
        c3013Zv1.zzd |= 16;
        c3013Zv1.zzk = j;
    }

    public static /* synthetic */ void Q(C3013Zv1 c3013Zv1, long j) {
        c3013Zv1.zzd |= Integer.MIN_VALUE;
        c3013Zv1.zzL = j;
    }

    public static /* synthetic */ void Q0(C3013Zv1 c3013Zv1, long j) {
        c3013Zv1.zzd |= 32;
        c3013Zv1.zzl = j;
    }

    public static /* synthetic */ void R(C3013Zv1 c3013Zv1, long j) {
        c3013Zv1.zze |= 2;
        c3013Zv1.zzN = j;
    }

    public static /* synthetic */ void R0(C3013Zv1 c3013Zv1, long j) {
        c3013Zv1.zzd |= 1024;
        c3013Zv1.zzq = j;
    }

    public static /* synthetic */ void S(C3013Zv1 c3013Zv1, long j) {
        c3013Zv1.zze |= 4;
        c3013Zv1.zzO = j;
    }

    public static /* synthetic */ void S0(C3013Zv1 c3013Zv1, long j) {
        c3013Zv1.zzd |= 2048;
        c3013Zv1.zzr = j;
    }

    public static /* synthetic */ void T(C3013Zv1 c3013Zv1, long j) {
        c3013Zv1.zze |= 8;
        c3013Zv1.zzP = j;
    }

    public static /* synthetic */ void T0(C3013Zv1 c3013Zv1, long j) {
        c3013Zv1.zzd |= 8192;
        c3013Zv1.zzt = j;
    }

    public static /* synthetic */ void U(C3013Zv1 c3013Zv1, long j) {
        c3013Zv1.zze |= 16;
        c3013Zv1.zzQ = j;
    }

    public static /* synthetic */ void U0(C3013Zv1 c3013Zv1, long j) {
        c3013Zv1.zzd |= 16384;
        c3013Zv1.zzu = j;
    }

    public static /* synthetic */ void V(C3013Zv1 c3013Zv1, long j) {
        c3013Zv1.zze |= 32;
        c3013Zv1.zzR = j;
    }

    public static /* synthetic */ void V0(C3013Zv1 c3013Zv1, long j) {
        c3013Zv1.zzd |= 32768;
        c3013Zv1.zzv = j;
    }

    public static /* synthetic */ void W(C3013Zv1 c3013Zv1, long j) {
        c3013Zv1.zze |= 64;
        c3013Zv1.zzS = j;
    }

    public static /* synthetic */ void W0(C3013Zv1 c3013Zv1, long j) {
        c3013Zv1.zzd |= 65536;
        c3013Zv1.zzw = j;
    }

    public static /* synthetic */ void X(C3013Zv1 c3013Zv1, String str) {
        str.getClass();
        c3013Zv1.zze |= 128;
        c3013Zv1.zzT = str;
    }

    public static /* synthetic */ void X0(C3013Zv1 c3013Zv1, long j) {
        c3013Zv1.zzd |= 524288;
        c3013Zv1.zzz = j;
    }

    public static /* synthetic */ void Y(C3013Zv1 c3013Zv1, String str) {
        str.getClass();
        c3013Zv1.zze |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        c3013Zv1.zzU = str;
    }

    public static /* synthetic */ void Y0(C3013Zv1 c3013Zv1, long j) {
        c3013Zv1.zzd |= 1048576;
        c3013Zv1.zzA = j;
    }

    public static /* synthetic */ void Z(C3013Zv1 c3013Zv1, long j) {
        c3013Zv1.zze |= 4096;
        c3013Zv1.zzY = j;
    }

    public static /* synthetic */ void Z0(C3013Zv1 c3013Zv1, long j) {
        c3013Zv1.zzd |= 2097152;
        c3013Zv1.zzB = j;
    }

    public static /* synthetic */ void a0(C3013Zv1 c3013Zv1, long j) {
        c3013Zv1.zze |= 8192;
        c3013Zv1.zzZ = j;
    }

    public static /* synthetic */ void a1(C3013Zv1 c3013Zv1, String str) {
        str.getClass();
        c3013Zv1.zzd |= 4194304;
        c3013Zv1.zzC = str;
    }

    public static /* synthetic */ void b0(C3013Zv1 c3013Zv1, long j) {
        c3013Zv1.zze |= 16384;
        c3013Zv1.zzaa = j;
    }

    public static /* synthetic */ void b1(C3013Zv1 c3013Zv1, String str) {
        str.getClass();
        c3013Zv1.zzd |= 16777216;
        c3013Zv1.zzE = str;
    }

    public static /* synthetic */ void c0(C3013Zv1 c3013Zv1, C2701Wv1 c2701Wv1) {
        c2701Wv1.getClass();
        c3013Zv1.zzae = c2701Wv1;
        c3013Zv1.zze |= 262144;
    }

    public static /* synthetic */ void c1(C3013Zv1 c3013Zv1, long j) {
        c3013Zv1.zzd |= 33554432;
        c3013Zv1.zzF = j;
    }

    public static /* synthetic */ void d0(C3013Zv1 c3013Zv1, C2701Wv1 c2701Wv1) {
        c2701Wv1.getClass();
        InterfaceC8095s43 interfaceC8095s43 = c3013Zv1.zzaf;
        if (!interfaceC8095s43.zzc()) {
            c3013Zv1.zzaf = AbstractC4449f43.y(interfaceC8095s43);
        }
        c3013Zv1.zzaf.add(c2701Wv1);
    }

    public static /* synthetic */ void d1(C3013Zv1 c3013Zv1, long j) {
        c3013Zv1.zzd |= 67108864;
        c3013Zv1.zzG = j;
    }

    public static /* synthetic */ void f0(C3013Zv1 c3013Zv1, C2909Yv1 c2909Yv1) {
        c2909Yv1.getClass();
        c3013Zv1.zzag = c2909Yv1;
        c3013Zv1.zze |= 524288;
    }

    public static /* synthetic */ void g0(C3013Zv1 c3013Zv1, long j) {
        c3013Zv1.zze |= 2097152;
        c3013Zv1.zzai = j;
    }

    public static /* synthetic */ void h0(C3013Zv1 c3013Zv1, long j) {
        c3013Zv1.zze |= 4194304;
        c3013Zv1.zzaj = j;
    }

    public static /* synthetic */ void i0(C3013Zv1 c3013Zv1, long j) {
        c3013Zv1.zze |= 8388608;
        c3013Zv1.zzak = j;
    }

    public static /* synthetic */ void j0(C3013Zv1 c3013Zv1, long j) {
        c3013Zv1.zze |= 67108864;
        c3013Zv1.zzan = j;
    }

    public static /* synthetic */ void k0(C3013Zv1 c3013Zv1, long j) {
        c3013Zv1.zze |= 134217728;
        c3013Zv1.zzao = j;
    }

    public static /* synthetic */ void l0(C3013Zv1 c3013Zv1, String str) {
        str.getClass();
        c3013Zv1.zze |= 268435456;
        c3013Zv1.zzap = str;
    }

    public static C9733xv1 m0() {
        return (C9733xv1) zzb.j();
    }

    public static /* synthetic */ void n0(C3013Zv1 c3013Zv1, long j) {
        c3013Zv1.zzf |= AdRequest.MAX_CONTENT_URL_LENGTH;
        c3013Zv1.zzaE = j;
    }

    public static /* synthetic */ void o0(C3013Zv1 c3013Zv1, long j) {
        c3013Zv1.zzf |= 1024;
        c3013Zv1.zzaF = j;
    }

    public static /* synthetic */ void p0(C3013Zv1 c3013Zv1, long j) {
        c3013Zv1.zzf |= 2048;
        c3013Zv1.zzaG = j;
    }

    public static /* synthetic */ void q0(C3013Zv1 c3013Zv1, long j) {
        c3013Zv1.zzf |= 4096;
        c3013Zv1.zzaH = j;
    }

    public static /* synthetic */ void r0(C3013Zv1 c3013Zv1, String str) {
        str.getClass();
        c3013Zv1.zzf |= 32768;
        c3013Zv1.zzaK = str;
    }

    public static /* synthetic */ void s0(C3013Zv1 c3013Zv1, String str) {
        str.getClass();
        c3013Zv1.zzf |= 4194304;
        c3013Zv1.zzaR = str;
    }

    public static /* synthetic */ void t0(C3013Zv1 c3013Zv1, boolean z) {
        c3013Zv1.zzf |= 16777216;
        c3013Zv1.zzaT = z;
    }

    public static /* synthetic */ void u0(C3013Zv1 c3013Zv1, long j) {
        c3013Zv1.zzf |= 67108864;
        c3013Zv1.zzaV = j;
    }

    public static /* synthetic */ void z0(C3013Zv1 c3013Zv1, int i) {
        c3013Zv1.zzW = i - 1;
        c3013Zv1.zze |= 1024;
    }

    @Override // com.daaw.AbstractC4449f43
    public final Object J(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            InterfaceC6701n43 interfaceC6701n43 = C4699fw1.a;
            return AbstractC4449f43.A(zzb, "\u0001a\u0000\u0003\u0001Įa\u0000\u0003\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007\tဂ\b\nဂ\t\u000bဂ\n\fဂ\u000b\rဈ\f\u000eဂ\r\u000fဂ\u000e\u0010ဂ\u000f\u0011ဂ\u0010\u0012ဂ\u0011\u0013ဂ\u0012\u0014ဂ\u0013\u0015ဂU\u0016ဂ\u0014\u0017ဂ\u0015\u0018ဈV\u0019ဂZ\u001a᠌W\u001bဈ\u0016\u001cဇX\u001dဈ\u0018\u001eဈY\u001fဂ\u0019 ဂ\u001a!ဂ\u001b\"ဈ\u001c#ဂ\u001d$ဂ\u001e%ဂ\u001f&ဉ 'ဂ!(ဂ\")ဂ#*ဂ$+\u001b,ဂ%-ဂ&.ဈ'/ဈ(0᠌*1᠌+2ဉ23ဂ,4ဂ-5ဂ.6ဂ/7ဂ08᠌19ဉ3:ဂ4;ဂ5<ဂ6=ဂ7>ဂ:?ဂ;@ဂ=A᠌>B᠌?Cဈ<D᠌@EဉAFဂBGဂ8Hဂ9I᠌CJဂ)Kဈ\u0017L᠌DMဈEN\u001bO᠌FP\u001bQဉGRဈHSဂITဂJUဂKVဂLWဂMXဂNYဈOZဉP[ဉQ\\ဂR]ဂS^᠌TÉဉ[ĭဂ\\Įဈ]", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzaQ", "zzA", "zzB", "zzaR", "zzaV", "zzaS", C0589Cv1.a, "zzC", "zzaT", "zzE", "zzaU", "zzF", "zzG", "zzH", "zzI", "zzJ", "zzK", "zzL", "zzM", "zzN", "zzO", "zzP", "zzQ", "zzaf", C2701Wv1.class, "zzR", "zzS", "zzT", "zzU", "zzW", interfaceC6701n43, "zzX", interfaceC6701n43, "zzae", "zzY", "zzZ", "zzaa", "zzab", "zzac", "zzad", interfaceC6701n43, "zzag", "zzah", "zzai", "zzaj", "zzak", "zzan", "zzao", "zzaq", "zzar", C4410ew1.a, "zzas", C4978gw1.a, "zzap", "zzat", C10012yv1.a, "zzau", "zzav", "zzal", "zzam", "zzaw", interfaceC6701n43, "zzV", "zzD", "zzax", interfaceC6701n43, "zzay", "zzaz", C2285Sv1.class, "zzaA", interfaceC6701n43, "zzaB", C0381Av1.class, "zzaC", "zzaD", "zzaE", "zzaF", "zzaG", "zzaH", "zzaI", "zzaJ", "zzaK", "zzaL", "zzaM", "zzaN", "zzaO", "zzaP", C1430Kv1.a, "zzaW", "zzaX", "zzaY"});
        }
        if (i2 == 3) {
            return new C3013Zv1();
        }
        AbstractC9454wv1 abstractC9454wv1 = null;
        if (i2 == 4) {
            return new C9733xv1(abstractC9454wv1);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final C5534iw1 J0() {
        C5534iw1 c5534iw1 = this.zzaW;
        return c5534iw1 == null ? C5534iw1.O() : c5534iw1;
    }

    public final String K0() {
        return this.zzaR;
    }

    public final String L0() {
        return this.zzC;
    }

    public final boolean v0() {
        return this.zzaT;
    }

    public final boolean w0() {
        return (this.zzd & 4194304) != 0;
    }

    public final boolean x0() {
        return (this.zzf & 134217728) != 0;
    }

    public final int y0() {
        int iA = AbstractC0702Dv1.a(this.zzaS);
        if (iA == 0) {
            return 3;
        }
        return iA;
    }
}
