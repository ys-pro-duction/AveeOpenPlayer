package com.daaw;

import com.google.android.gms.ads.AdRequest;
import java.util.List;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: com.daaw.uU2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8762uU2 extends AbstractC3772cf3 implements Mg3 {
    public static final /* synthetic */ int zza = 0;
    private static final C8762uU2 zzd;
    private long zzB;
    private int zzC;
    private boolean zzF;
    private int zzI;
    private int zzJ;
    private int zzK;
    private long zzM;
    private long zzN;
    private int zzQ;
    private C4855gW2 zzS;
    private long zzU;
    private long zzV;
    private int zzY;
    private boolean zzZ;
    private boolean zzab;
    private SR2 zzac;
    private long zzag;
    private int zze;
    private int zzf;
    private int zzg;
    private long zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private int zzs;
    private long zzw;
    private long zzx;
    private boolean zzz;
    private InterfaceC9377wf3 zzh = AbstractC3772cf3.p();
    private InterfaceC9377wf3 zzi = AbstractC3772cf3.p();
    private String zzo = "";
    private String zzp = "";
    private String zzq = "";
    private String zzr = "";
    private String zzt = "";
    private String zzu = "";
    private String zzv = "";
    private String zzy = "";
    private String zzA = "";
    private String zzD = "";
    private String zzE = "";
    private InterfaceC9377wf3 zzG = AbstractC3772cf3.p();
    private String zzH = "";
    private String zzL = "";
    private String zzO = "";
    private String zzP = "";
    private String zzR = "";
    private InterfaceC7697qf3 zzT = AbstractC3772cf3.m();
    private String zzW = "";
    private String zzX = "";
    private String zzaa = "";
    private String zzad = "";
    private InterfaceC9377wf3 zzae = AbstractC3772cf3.p();
    private String zzaf = "";

    static {
        C8762uU2 c8762uU2 = new C8762uU2();
        zzd = c8762uU2;
        AbstractC3772cf3.w(C8762uU2.class, c8762uU2);
    }

    public static /* synthetic */ void A0(C8762uU2 c8762uU2) {
        c8762uU2.zze &= -268435457;
        c8762uU2.zzL = zzd.zzL;
    }

    public static /* synthetic */ void B0(C8762uU2 c8762uU2, long j) {
        c8762uU2.zze |= 536870912;
        c8762uU2.zzM = j;
    }

    public static /* synthetic */ void E0(C8762uU2 c8762uU2, Iterable iterable) {
        c8762uU2.f1();
        AbstractC8797uc3.f(iterable, c8762uU2.zzh);
    }

    public static /* synthetic */ void F0(C8762uU2 c8762uU2, String str) {
        str.getClass();
        c8762uU2.zzf |= 8192;
        c8762uU2.zzad = str;
    }

    public static /* synthetic */ void G0(C8762uU2 c8762uU2) {
        c8762uU2.zzf &= -8193;
        c8762uU2.zzad = zzd.zzad;
    }

    public static /* synthetic */ void H0(C8762uU2 c8762uU2, Iterable iterable) {
        InterfaceC9377wf3 interfaceC9377wf3 = c8762uU2.zzae;
        if (!interfaceC9377wf3.zzc()) {
            c8762uU2.zzae = AbstractC3772cf3.q(interfaceC9377wf3);
        }
        AbstractC8797uc3.f(iterable, c8762uU2.zzae);
    }

    public static /* synthetic */ void J0(C8762uU2 c8762uU2, String str) {
        str.getClass();
        c8762uU2.zzf |= 16384;
        c8762uU2.zzaf = str;
    }

    public static /* synthetic */ void K0(C8762uU2 c8762uU2, long j) {
        c8762uU2.zzf |= 32768;
        c8762uU2.zzag = j;
    }

    public static /* synthetic */ void L0(C8762uU2 c8762uU2, int i) {
        c8762uU2.f1();
        c8762uU2.zzh.remove(i);
    }

    public static /* synthetic */ void M0(C8762uU2 c8762uU2, int i, DZ2 dz2) {
        dz2.getClass();
        c8762uU2.g1();
        c8762uU2.zzi.set(i, dz2);
    }

    public static /* synthetic */ void N0(C8762uU2 c8762uU2, DZ2 dz2) {
        dz2.getClass();
        c8762uU2.g1();
        c8762uU2.zzi.add(dz2);
    }

    public static /* synthetic */ void O0(C8762uU2 c8762uU2, Iterable iterable) {
        c8762uU2.g1();
        AbstractC8797uc3.f(iterable, c8762uU2.zzi);
    }

    public static /* synthetic */ void P0(C8762uU2 c8762uU2, int i) {
        c8762uU2.g1();
        c8762uU2.zzi.remove(i);
    }

    public static /* synthetic */ void Q0(C8762uU2 c8762uU2, long j) {
        c8762uU2.zze |= 2;
        c8762uU2.zzj = j;
    }

    public static /* synthetic */ void R0(C8762uU2 c8762uU2, long j) {
        c8762uU2.zze |= 4;
        c8762uU2.zzk = j;
    }

    public static /* synthetic */ void S(C8762uU2 c8762uU2) {
        c8762uU2.zze &= Integer.MAX_VALUE;
        c8762uU2.zzO = zzd.zzO;
    }

    public static /* synthetic */ void S0(C8762uU2 c8762uU2, long j) {
        c8762uU2.zze |= 8;
        c8762uU2.zzl = j;
    }

    public static QT2 S1() {
        return (QT2) zzd.i();
    }

    public static /* synthetic */ void T(C8762uU2 c8762uU2, int i) {
        c8762uU2.zzf |= 2;
        c8762uU2.zzQ = i;
    }

    public static /* synthetic */ void T0(C8762uU2 c8762uU2, long j) {
        c8762uU2.zze |= 16;
        c8762uU2.zzm = j;
    }

    public static /* synthetic */ void U0(C8762uU2 c8762uU2) {
        c8762uU2.zze &= -17;
        c8762uU2.zzm = 0L;
    }

    public static /* synthetic */ void V(C8762uU2 c8762uU2, int i, C6507mO2 c6507mO2) {
        c6507mO2.getClass();
        c8762uU2.f1();
        c8762uU2.zzh.set(i, c6507mO2);
    }

    public static /* synthetic */ void V0(C8762uU2 c8762uU2, long j) {
        c8762uU2.zze |= 32;
        c8762uU2.zzn = j;
    }

    public static /* synthetic */ void W(C8762uU2 c8762uU2, String str) {
        str.getClass();
        c8762uU2.zzf |= 4;
        c8762uU2.zzR = str;
    }

    public static /* synthetic */ void W0(C8762uU2 c8762uU2) {
        c8762uU2.zze &= -33;
        c8762uU2.zzn = 0L;
    }

    public static /* synthetic */ void X(C8762uU2 c8762uU2, C4855gW2 c4855gW2) {
        c4855gW2.getClass();
        c8762uU2.zzS = c4855gW2;
        c8762uU2.zzf |= 8;
    }

    public static /* synthetic */ void X0(C8762uU2 c8762uU2, String str) {
        c8762uU2.zze |= 64;
        c8762uU2.zzo = "android";
    }

    public static /* synthetic */ void Y(C8762uU2 c8762uU2, Iterable iterable) {
        InterfaceC7697qf3 interfaceC7697qf3 = c8762uU2.zzT;
        if (!interfaceC7697qf3.zzc()) {
            int size = interfaceC7697qf3.size();
            c8762uU2.zzT = interfaceC7697qf3.f(size == 0 ? 10 : size + size);
        }
        AbstractC8797uc3.f(iterable, c8762uU2.zzT);
    }

    public static /* synthetic */ void Y0(C8762uU2 c8762uU2, String str) {
        str.getClass();
        c8762uU2.zze |= 128;
        c8762uU2.zzp = str;
    }

    public static /* synthetic */ void Z(C8762uU2 c8762uU2, C6507mO2 c6507mO2) {
        c6507mO2.getClass();
        c8762uU2.f1();
        c8762uU2.zzh.add(c6507mO2);
    }

    public static /* synthetic */ void Z0(C8762uU2 c8762uU2) {
        c8762uU2.zze &= -129;
        c8762uU2.zzp = zzd.zzp;
    }

    public static /* synthetic */ void a0(C8762uU2 c8762uU2, long j) {
        c8762uU2.zzf |= 16;
        c8762uU2.zzU = j;
    }

    public static /* synthetic */ void a1(C8762uU2 c8762uU2, String str) {
        str.getClass();
        c8762uU2.zze |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        c8762uU2.zzq = str;
    }

    public static /* synthetic */ void b0(C8762uU2 c8762uU2, long j) {
        c8762uU2.zzf |= 32;
        c8762uU2.zzV = j;
    }

    public static /* synthetic */ void b1(C8762uU2 c8762uU2) {
        c8762uU2.zze &= -257;
        c8762uU2.zzq = zzd.zzq;
    }

    public static /* synthetic */ void c0(C8762uU2 c8762uU2, String str) {
        c8762uU2.zzf |= 128;
        c8762uU2.zzX = str;
    }

    public static /* synthetic */ void c1(C8762uU2 c8762uU2, String str) {
        str.getClass();
        c8762uU2.zze |= AdRequest.MAX_CONTENT_URL_LENGTH;
        c8762uU2.zzr = str;
    }

    public static /* synthetic */ void d1(C8762uU2 c8762uU2, int i) {
        c8762uU2.zze |= 1024;
        c8762uU2.zzs = i;
    }

    public static /* synthetic */ void e0(C8762uU2 c8762uU2, String str) {
        str.getClass();
        c8762uU2.zze |= 2048;
        c8762uU2.zzt = str;
    }

    public static /* synthetic */ void f0(C8762uU2 c8762uU2, String str) {
        str.getClass();
        c8762uU2.zze |= 4096;
        c8762uU2.zzu = str;
    }

    public static /* synthetic */ void g0(C8762uU2 c8762uU2, String str) {
        str.getClass();
        c8762uU2.zze |= 8192;
        c8762uU2.zzv = str;
    }

    public static /* synthetic */ void h0(C8762uU2 c8762uU2, long j) {
        c8762uU2.zze |= 16384;
        c8762uU2.zzw = j;
    }

    public static /* synthetic */ void i0(C8762uU2 c8762uU2, long j) {
        c8762uU2.zze |= 32768;
        c8762uU2.zzx = 79000L;
    }

    public static /* synthetic */ void j0(C8762uU2 c8762uU2, String str) {
        str.getClass();
        c8762uU2.zze |= 65536;
        c8762uU2.zzy = str;
    }

    public static /* synthetic */ void k0(C8762uU2 c8762uU2) {
        c8762uU2.zze &= -65537;
        c8762uU2.zzy = zzd.zzy;
    }

    public static /* synthetic */ void l0(C8762uU2 c8762uU2, boolean z) {
        c8762uU2.zze |= 131072;
        c8762uU2.zzz = z;
    }

    public static /* synthetic */ void m0(C8762uU2 c8762uU2) {
        c8762uU2.zze &= -131073;
        c8762uU2.zzz = false;
    }

    public static /* synthetic */ void n0(C8762uU2 c8762uU2, String str) {
        str.getClass();
        c8762uU2.zze |= 262144;
        c8762uU2.zzA = str;
    }

    public static /* synthetic */ void o0(C8762uU2 c8762uU2) {
        c8762uU2.zze &= -262145;
        c8762uU2.zzA = zzd.zzA;
    }

    public static /* synthetic */ void p0(C8762uU2 c8762uU2, long j) {
        c8762uU2.zze |= 524288;
        c8762uU2.zzB = j;
    }

    public static /* synthetic */ void q0(C8762uU2 c8762uU2, int i) {
        c8762uU2.zze |= 1048576;
        c8762uU2.zzC = i;
    }

    public static /* synthetic */ void r0(C8762uU2 c8762uU2, String str) {
        c8762uU2.zze |= 2097152;
        c8762uU2.zzD = str;
    }

    public static /* synthetic */ void s0(C8762uU2 c8762uU2) {
        c8762uU2.zze &= -2097153;
        c8762uU2.zzD = zzd.zzD;
    }

    public static /* synthetic */ void t0(C8762uU2 c8762uU2, String str) {
        str.getClass();
        c8762uU2.zze |= 4194304;
        c8762uU2.zzE = str;
    }

    public static /* synthetic */ void u0(C8762uU2 c8762uU2, boolean z) {
        c8762uU2.zze |= 8388608;
        c8762uU2.zzF = z;
    }

    public static /* synthetic */ void v0(C8762uU2 c8762uU2, Iterable iterable) {
        InterfaceC9377wf3 interfaceC9377wf3 = c8762uU2.zzG;
        if (!interfaceC9377wf3.zzc()) {
            c8762uU2.zzG = AbstractC3772cf3.q(interfaceC9377wf3);
        }
        AbstractC8797uc3.f(iterable, c8762uU2.zzG);
    }

    public static /* synthetic */ void x0(C8762uU2 c8762uU2, String str) {
        str.getClass();
        c8762uU2.zze |= 16777216;
        c8762uU2.zzH = str;
    }

    public static /* synthetic */ void y0(C8762uU2 c8762uU2, int i) {
        c8762uU2.zze |= 33554432;
        c8762uU2.zzI = i;
    }

    public static /* synthetic */ void z0(C8762uU2 c8762uU2, int i) {
        c8762uU2.zze |= 1;
        c8762uU2.zzg = 1;
    }

    @Override // com.daaw.AbstractC3772cf3
    public final Object A(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC3772cf3.t(zzd, "\u00015\u0000\u0002\u0001C5\u0000\u0005\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဂ\u0001\u0005ဂ\u0002\u0006ဂ\u0003\u0007ဂ\u0005\bဈ\u0006\tဈ\u0007\nဈ\b\u000bဈ\t\fင\n\rဈ\u000b\u000eဈ\f\u0010ဈ\r\u0011ဂ\u000e\u0012ဂ\u000f\u0013ဈ\u0010\u0014ဇ\u0011\u0015ဈ\u0012\u0016ဂ\u0013\u0017င\u0014\u0018ဈ\u0015\u0019ဈ\u0016\u001aဂ\u0004\u001cဇ\u0017\u001d\u001b\u001eဈ\u0018\u001fင\u0019 င\u001a!င\u001b\"ဈ\u001c#ဂ\u001d$ဂ\u001e%ဈ\u001f&ဈ 'င!)ဈ\",ဉ#-\u001d.ဂ$/ဂ%2ဈ&4ဈ'5ဌ(7ဇ)9ဈ*:ဇ+;ဉ,?ဈ-@\u001aAဈ.Cဂ/", new Object[]{"zze", "zzf", "zzg", "zzh", C6507mO2.class, "zzi", DZ2.class, "zzj", "zzk", "zzl", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", "zzD", "zzE", "zzm", "zzF", "zzG", C3969dM2.class, "zzH", "zzI", "zzJ", "zzK", "zzL", "zzM", "zzN", "zzO", "zzP", "zzQ", "zzR", "zzS", "zzT", "zzU", "zzV", "zzW", "zzX", "zzY", VJ2.a, "zzZ", "zzaa", "zzab", "zzac", "zzad", "zzae", "zzaf", "zzag"});
        }
        if (i2 == 3) {
            return new C8762uU2();
        }
        AbstractC8160sJ2 abstractC8160sJ2 = null;
        if (i2 == 4) {
            return new QT2(abstractC8160sJ2);
        }
        if (i2 != 5) {
            return null;
        }
        return zzd;
    }

    public final boolean A1() {
        return (this.zze & 32768) != 0;
    }

    public final String B() {
        return this.zzt;
    }

    public final int B1() {
        return this.zzh.size();
    }

    public final String C() {
        return this.zzv;
    }

    public final boolean C0() {
        return this.zzz;
    }

    public final int C1() {
        return this.zzg;
    }

    public final String D() {
        return this.zzX;
    }

    public final boolean D0() {
        return this.zzF;
    }

    public final int D1() {
        return this.zzQ;
    }

    public final String E() {
        return this.zzq;
    }

    public final int E1() {
        return this.zzs;
    }

    public final String F() {
        return this.zzO;
    }

    public final int F1() {
        return this.zzi.size();
    }

    public final String G() {
        return this.zzH;
    }

    public final long G1() {
        return this.zzM;
    }

    public final String H() {
        return this.zzE;
    }

    public final long H1() {
        return this.zzB;
    }

    public final String I() {
        return this.zzD;
    }

    public final long I1() {
        return this.zzU;
    }

    public final String J() {
        return this.zzp;
    }

    public final long J1() {
        return this.zzl;
    }

    public final String K() {
        return this.zzo;
    }

    public final long K1() {
        return this.zzw;
    }

    public final String L() {
        return this.zzy;
    }

    public final long L1() {
        return this.zzn;
    }

    public final String M() {
        return this.zzad;
    }

    public final long M1() {
        return this.zzm;
    }

    public final String N() {
        return this.zzr;
    }

    public final long N1() {
        return this.zzk;
    }

    public final List O() {
        return this.zzG;
    }

    public final long O1() {
        return this.zzag;
    }

    public final List P() {
        return this.zzh;
    }

    public final long P1() {
        return this.zzj;
    }

    public final List Q() {
        return this.zzi;
    }

    public final long Q1() {
        return this.zzx;
    }

    public final C6507mO2 R1(int i) {
        return (C6507mO2) this.zzh.get(i);
    }

    public final DZ2 U1(int i) {
        return (DZ2) this.zzi.get(i);
    }

    public final String V1() {
        return this.zzR;
    }

    public final String W1() {
        return this.zzu;
    }

    public final String X1() {
        return this.zzA;
    }

    public final int d0() {
        return this.zzI;
    }

    public final int e1() {
        return this.zzC;
    }

    public final void f1() {
        InterfaceC9377wf3 interfaceC9377wf3 = this.zzh;
        if (interfaceC9377wf3.zzc()) {
            return;
        }
        this.zzh = AbstractC3772cf3.q(interfaceC9377wf3);
    }

    public final void g1() {
        InterfaceC9377wf3 interfaceC9377wf3 = this.zzi;
        if (interfaceC9377wf3.zzc()) {
            return;
        }
        this.zzi = AbstractC3772cf3.q(interfaceC9377wf3);
    }

    public final boolean h1() {
        return (this.zze & 33554432) != 0;
    }

    public final boolean i1() {
        return (this.zze & 1048576) != 0;
    }

    public final boolean j1() {
        return (this.zze & 536870912) != 0;
    }

    public final boolean k1() {
        return (this.zzf & 128) != 0;
    }

    public final boolean l1() {
        return (this.zze & 524288) != 0;
    }

    public final boolean m1() {
        return (this.zzf & 16) != 0;
    }

    public final boolean n1() {
        return (this.zze & 8) != 0;
    }

    public final boolean o1() {
        return (this.zze & 16384) != 0;
    }

    public final boolean p1() {
        return (this.zze & 131072) != 0;
    }

    public final boolean q1() {
        return (this.zze & 32) != 0;
    }

    public final boolean r1() {
        return (this.zze & 16) != 0;
    }

    public final boolean s1() {
        return (this.zze & 1) != 0;
    }

    public final boolean t1() {
        return (this.zzf & 2) != 0;
    }

    public final boolean u1() {
        return (this.zze & 8388608) != 0;
    }

    public final boolean v1() {
        return (this.zzf & 8192) != 0;
    }

    public final boolean w1() {
        return (this.zze & 4) != 0;
    }

    public final boolean x1() {
        return (this.zzf & 32768) != 0;
    }

    public final boolean y1() {
        return (this.zze & 1024) != 0;
    }

    public final boolean z1() {
        return (this.zze & 2) != 0;
    }
}
