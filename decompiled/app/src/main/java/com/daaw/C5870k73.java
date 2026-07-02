package com.daaw;

import java.util.List;

/* JADX INFO: renamed from: com.daaw.k73, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5870k73 extends AbstractC4449f43 implements V43 {
    private static final C5870k73 zzb;
    private C8105s63 zzB;
    private C5865k63 zzD;
    private O63 zzF;
    private int zzG;
    private int zzd;
    private int zze;
    private int zzf;
    private C6990o63 zzj;
    private X63 zzn;
    private boolean zzo;
    private boolean zzr;
    private boolean zzs;
    private C4464f73 zzu;
    private boolean zzv;
    private C5588j73 zzz;
    private byte zzJ = 2;
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private InterfaceC8095s43 zzk = AbstractC4449f43.x();
    private InterfaceC8095s43 zzl = AbstractC4449f43.x();
    private String zzm = "";
    private InterfaceC8095s43 zzp = AbstractC4449f43.x();
    private String zzq = "";
    private AbstractC9213w33 zzt = AbstractC9213w33.C;
    private String zzw = "";
    private InterfaceC8095s43 zzx = AbstractC4449f43.x();
    private InterfaceC8095s43 zzy = AbstractC4449f43.x();
    private InterfaceC8095s43 zzA = AbstractC4449f43.x();
    private String zzC = "";
    private InterfaceC8095s43 zzE = AbstractC4449f43.x();
    private InterfaceC8095s43 zzH = AbstractC4449f43.x();
    private InterfaceC8095s43 zzI = AbstractC4449f43.x();

    static {
        C5870k73 c5870k73 = new C5870k73();
        zzb = c5870k73;
        AbstractC4449f43.D(C5870k73.class, c5870k73);
    }

    public static C6432m63 M() {
        return (C6432m63) zzb.j();
    }

    public static /* synthetic */ void R(C5870k73 c5870k73, String str) {
        str.getClass();
        c5870k73.zzd |= 4;
        c5870k73.zzg = str;
    }

    public static /* synthetic */ void S(C5870k73 c5870k73, String str) {
        str.getClass();
        c5870k73.zzd |= 8;
        c5870k73.zzh = str;
    }

    public static /* synthetic */ void T(C5870k73 c5870k73, C6990o63 c6990o63) {
        c6990o63.getClass();
        c5870k73.zzj = c6990o63;
        c5870k73.zzd |= 32;
    }

    public static /* synthetic */ void U(C5870k73 c5870k73, C3907d73 c3907d73) {
        c3907d73.getClass();
        InterfaceC8095s43 interfaceC8095s43 = c5870k73.zzk;
        if (!interfaceC8095s43.zzc()) {
            c5870k73.zzk = AbstractC4449f43.y(interfaceC8095s43);
        }
        c5870k73.zzk.add(c3907d73);
    }

    public static /* synthetic */ void V(C5870k73 c5870k73, String str) {
        c5870k73.zzd |= 64;
        c5870k73.zzm = str;
    }

    public static /* synthetic */ void W(C5870k73 c5870k73) {
        c5870k73.zzd &= -65;
        c5870k73.zzm = zzb.zzm;
    }

    public static /* synthetic */ void X(C5870k73 c5870k73, X63 x63) {
        x63.getClass();
        c5870k73.zzn = x63;
        c5870k73.zzd |= 128;
    }

    public static /* synthetic */ void Y(C5870k73 c5870k73, C4464f73 c4464f73) {
        c4464f73.getClass();
        c5870k73.zzu = c4464f73;
        c5870k73.zzd |= 8192;
    }

    public static /* synthetic */ void Z(C5870k73 c5870k73, Iterable iterable) {
        InterfaceC8095s43 interfaceC8095s43 = c5870k73.zzx;
        if (!interfaceC8095s43.zzc()) {
            c5870k73.zzx = AbstractC4449f43.y(interfaceC8095s43);
        }
        AbstractC4444f33.f(iterable, c5870k73.zzx);
    }

    public static /* synthetic */ void a0(C5870k73 c5870k73, Iterable iterable) {
        InterfaceC8095s43 interfaceC8095s43 = c5870k73.zzy;
        if (!interfaceC8095s43.zzc()) {
            c5870k73.zzy = AbstractC4449f43.y(interfaceC8095s43);
        }
        AbstractC4444f33.f(iterable, c5870k73.zzy);
    }

    public static /* synthetic */ void b0(C5870k73 c5870k73, int i) {
        c5870k73.zze = i - 1;
        c5870k73.zzd |= 1;
    }

    @Override // com.daaw.AbstractC4449f43
    public final Object J(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzJ);
        }
        if (i2 == 2) {
            return AbstractC4449f43.A(zzb, "\u0001\u001f\u0000\u0001\u0001\u001f\u001f\u0000\t\u0001\u0001ဈ\u0002\u0002ဈ\u0003\u0003ဈ\u0004\u0004Л\u0005ဇ\b\u0006\u001a\u0007ဈ\t\bဇ\n\tဇ\u000b\n᠌\u0000\u000b᠌\u0001\fဉ\u0005\rဈ\u0006\u000eဉ\u0007\u000fည\f\u0010\u001b\u0011ဉ\r\u0012ဇ\u000e\u0013ဈ\u000f\u0014\u001a\u0015\u001a\u0016ဉ\u0010\u0017\u001b\u0018ဉ\u0011\u0019ဈ\u0012\u001aဉ\u0013\u001b\u001b\u001cဉ\u0014\u001d᠌\u0015\u001e\u001b\u001f\u001b", new Object[]{"zzd", "zzg", "zzh", "zzi", "zzk", C3907d73.class, "zzo", "zzp", "zzq", "zzr", "zzs", "zze", Y63.a, "zzf", C6153l63.a, "zzj", "zzm", "zzn", "zzt", "zzl", B73.class, "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", H73.class, "zzB", "zzC", "zzD", "zzE", C9228w63.class, "zzF", "zzG", C5032h73.a, "zzH", R63.class, "zzI", U63.class});
        }
        if (i2 == 3) {
            return new C5870k73();
        }
        Y53 y53 = null;
        if (i2 == 4) {
            return new C6432m63(y53);
        }
        if (i2 == 5) {
            return zzb;
        }
        this.zzJ = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }

    public final String O() {
        return this.zzm;
    }

    public final String P() {
        return this.zzg;
    }

    public final List Q() {
        return this.zzk;
    }
}
