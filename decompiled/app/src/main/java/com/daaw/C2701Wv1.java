package com.daaw;

import com.google.android.gms.ads.AdRequest;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: com.daaw.Wv1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2701Wv1 extends AbstractC4449f43 implements V43 {
    private static final C2701Wv1 zzb;
    private int zzd;
    private long zzt;
    private long zzu;
    private long zze = -1;
    private long zzf = -1;
    private long zzg = -1;
    private long zzh = -1;
    private long zzi = -1;
    private long zzj = -1;
    private int zzk = 1000;
    private long zzl = -1;
    private long zzm = -1;
    private long zzn = -1;
    private int zzo = 1000;
    private long zzp = -1;
    private long zzq = -1;
    private long zzr = -1;
    private long zzs = -1;
    private long zzv = -1;
    private long zzw = -1;
    private long zzx = -1;
    private long zzy = -1;

    static {
        C2701Wv1 c2701Wv1 = new C2701Wv1();
        zzb = c2701Wv1;
        AbstractC4449f43.D(C2701Wv1.class, c2701Wv1);
    }

    public static C2597Vv1 M() {
        return (C2597Vv1) zzb.j();
    }

    public static /* synthetic */ void O(C2701Wv1 c2701Wv1, long j) {
        c2701Wv1.zzd |= 1;
        c2701Wv1.zze = j;
    }

    public static /* synthetic */ void P(C2701Wv1 c2701Wv1, long j) {
        c2701Wv1.zzd |= 2;
        c2701Wv1.zzf = j;
    }

    public static /* synthetic */ void Q(C2701Wv1 c2701Wv1, long j) {
        c2701Wv1.zzd |= 4;
        c2701Wv1.zzg = j;
    }

    public static /* synthetic */ void R(C2701Wv1 c2701Wv1, long j) {
        c2701Wv1.zzd |= 8;
        c2701Wv1.zzh = j;
    }

    public static /* synthetic */ void S(C2701Wv1 c2701Wv1) {
        c2701Wv1.zzd &= -9;
        c2701Wv1.zzh = -1L;
    }

    public static /* synthetic */ void T(C2701Wv1 c2701Wv1, long j) {
        c2701Wv1.zzd |= 16;
        c2701Wv1.zzi = j;
    }

    public static /* synthetic */ void U(C2701Wv1 c2701Wv1, long j) {
        c2701Wv1.zzd |= 32;
        c2701Wv1.zzj = j;
    }

    public static /* synthetic */ void V(C2701Wv1 c2701Wv1, long j) {
        c2701Wv1.zzd |= 128;
        c2701Wv1.zzl = j;
    }

    public static /* synthetic */ void W(C2701Wv1 c2701Wv1, long j) {
        c2701Wv1.zzd |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        c2701Wv1.zzm = j;
    }

    public static /* synthetic */ void X(C2701Wv1 c2701Wv1, long j) {
        c2701Wv1.zzd |= AdRequest.MAX_CONTENT_URL_LENGTH;
        c2701Wv1.zzn = j;
    }

    public static /* synthetic */ void Y(C2701Wv1 c2701Wv1, long j) {
        c2701Wv1.zzd |= 2048;
        c2701Wv1.zzp = j;
    }

    public static /* synthetic */ void Z(C2701Wv1 c2701Wv1, long j) {
        c2701Wv1.zzd |= 4096;
        c2701Wv1.zzq = j;
    }

    public static /* synthetic */ void a0(C2701Wv1 c2701Wv1, long j) {
        c2701Wv1.zzd |= 8192;
        c2701Wv1.zzr = j;
    }

    public static /* synthetic */ void b0(C2701Wv1 c2701Wv1, long j) {
        c2701Wv1.zzd |= 16384;
        c2701Wv1.zzs = j;
    }

    public static /* synthetic */ void c0(C2701Wv1 c2701Wv1, long j) {
        c2701Wv1.zzd |= 32768;
        c2701Wv1.zzt = j;
    }

    public static /* synthetic */ void d0(C2701Wv1 c2701Wv1, long j) {
        c2701Wv1.zzd |= 65536;
        c2701Wv1.zzu = j;
    }

    public static /* synthetic */ void e0(C2701Wv1 c2701Wv1, long j) {
        c2701Wv1.zzd |= 131072;
        c2701Wv1.zzv = j;
    }

    public static /* synthetic */ void f0(C2701Wv1 c2701Wv1, long j) {
        c2701Wv1.zzd |= 262144;
        c2701Wv1.zzw = j;
    }

    public static /* synthetic */ void g0(C2701Wv1 c2701Wv1, int i) {
        c2701Wv1.zzk = i - 1;
        c2701Wv1.zzd |= 64;
    }

    public static /* synthetic */ void h0(C2701Wv1 c2701Wv1, int i) {
        c2701Wv1.zzo = i - 1;
        c2701Wv1.zzd |= 1024;
    }

    @Override // com.daaw.AbstractC4449f43
    public final Object J(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            InterfaceC6701n43 interfaceC6701n43 = C4699fw1.a;
            return AbstractC4449f43.A(zzb, "\u0001\u0015\u0000\u0001\u0001\u0015\u0015\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007᠌\u0006\bဂ\u0007\tဂ\b\nဂ\t\u000b᠌\n\fဂ\u000b\rဂ\f\u000eဂ\r\u000fဂ\u000e\u0010ဂ\u000f\u0011ဂ\u0010\u0012ဂ\u0011\u0013ဂ\u0012\u0014ဂ\u0013\u0015ဂ\u0014", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", interfaceC6701n43, "zzl", "zzm", "zzn", "zzo", interfaceC6701n43, "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy"});
        }
        if (i2 == 3) {
            return new C2701Wv1();
        }
        AbstractC9454wv1 abstractC9454wv1 = null;
        if (i2 == 4) {
            return new C2597Vv1(abstractC9454wv1);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
