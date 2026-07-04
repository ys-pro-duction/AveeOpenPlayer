package com.daaw;

import com.google.android.gms.ads.AdRequest;
import java.util.Iterator;
import java.util.List;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: com.daaw.jD1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5613jD1 extends AbstractC4449f43 implements V43 {
    private static final InterfaceC7259p43 zzb = new C5057hD1();
    private static final C5613jD1 zzd;
    private int zze;
    private long zzf;
    private int zzg;
    private long zzh;
    private long zzi;
    private InterfaceC6980o43 zzj = AbstractC4449f43.t();
    private C10091zC1 zzk;
    private int zzl;
    private int zzm;
    private int zzn;
    private int zzo;
    private int zzp;
    private int zzq;
    private long zzr;

    static {
        C5613jD1 c5613jD1 = new C5613jD1();
        zzd = c5613jD1;
        AbstractC4449f43.D(C5613jD1.class, c5613jD1);
    }

    public static /* synthetic */ void M(C5613jD1 c5613jD1, int i) {
        c5613jD1.zzm = i - 1;
        c5613jD1.zze |= 64;
    }

    public static /* synthetic */ void N(C5613jD1 c5613jD1, int i) {
        c5613jD1.zzn = i - 1;
        c5613jD1.zze |= 128;
    }

    public static /* synthetic */ void O(C5613jD1 c5613jD1, int i) {
        c5613jD1.zzp = i - 1;
        c5613jD1.zze |= AdRequest.MAX_CONTENT_URL_LENGTH;
    }

    public static C5336iD1 U() {
        return (C5336iD1) zzd.j();
    }

    public static C5613jD1 W(byte[] bArr) {
        return (C5613jD1) AbstractC4449f43.o(zzd, bArr);
    }

    public static /* synthetic */ void Z(C5613jD1 c5613jD1, long j) {
        c5613jD1.zze |= 1;
        c5613jD1.zzf = j;
    }

    public static /* synthetic */ void a0(C5613jD1 c5613jD1, long j) {
        c5613jD1.zze |= 4;
        c5613jD1.zzh = j;
    }

    public static /* synthetic */ void b0(C5613jD1 c5613jD1, long j) {
        c5613jD1.zze |= 8;
        c5613jD1.zzi = j;
    }

    public static /* synthetic */ void c0(C5613jD1 c5613jD1, Iterable iterable) {
        InterfaceC6980o43 interfaceC6980o43 = c5613jD1.zzj;
        if (!interfaceC6980o43.zzc()) {
            c5613jD1.zzj = AbstractC4449f43.u(interfaceC6980o43);
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            c5613jD1.zzj.g(((OB1) it.next()).zza());
        }
    }

    public static /* synthetic */ void d0(C5613jD1 c5613jD1, C10091zC1 c10091zC1) {
        c10091zC1.getClass();
        c5613jD1.zzk = c10091zC1;
        c5613jD1.zze |= 16;
    }

    public static /* synthetic */ void e0(C5613jD1 c5613jD1, int i) {
        c5613jD1.zze |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        c5613jD1.zzo = i;
    }

    public static /* synthetic */ void f0(C5613jD1 c5613jD1, EnumC6741nD1 enumC6741nD1) {
        c5613jD1.zzq = enumC6741nD1.zza();
        c5613jD1.zze |= 1024;
    }

    public static /* synthetic */ void g0(C5613jD1 c5613jD1, long j) {
        c5613jD1.zze |= 2048;
        c5613jD1.zzr = j;
    }

    public static /* synthetic */ void m0(C5613jD1 c5613jD1, int i) {
        c5613jD1.zzg = i - 1;
        c5613jD1.zze |= 2;
    }

    public static /* synthetic */ void n0(C5613jD1 c5613jD1, int i) {
        c5613jD1.zzl = i - 1;
        c5613jD1.zze |= 32;
    }

    @Override // com.daaw.AbstractC4449f43
    public final Object J(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            InterfaceC6701n43 interfaceC6701n43 = C5332iC1.a;
            return AbstractC4449f43.A(zzd, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001ဂ\u0000\u0002᠌\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ࠞ\u0006ဉ\u0004\u0007᠌\u0005\b᠌\u0006\t᠌\u0007\nင\b\u000b᠌\t\f᠌\n\rဂ\u000b", new Object[]{"zze", "zzf", "zzg", interfaceC6701n43, "zzh", "zzi", "zzj", NB1.a, "zzk", "zzl", interfaceC6701n43, "zzm", interfaceC6701n43, "zzn", interfaceC6701n43, "zzo", "zzp", interfaceC6701n43, "zzq", C6462mD1.a, "zzr"});
        }
        if (i2 == 3) {
            return new C5613jD1();
        }
        AbstractC9529xB1 abstractC9529xB1 = null;
        if (i2 == 4) {
            return new C5336iD1(abstractC9529xB1);
        }
        if (i2 != 5) {
            return null;
        }
        return zzd;
    }

    public final int P() {
        return this.zzo;
    }

    public final long Q() {
        return this.zzi;
    }

    public final long R() {
        return this.zzh;
    }

    public final long S() {
        return this.zzf;
    }

    public final C10091zC1 T() {
        C10091zC1 c10091zC1 = this.zzk;
        return c10091zC1 == null ? C10091zC1.O() : c10091zC1;
    }

    public final EnumC6741nD1 X() {
        EnumC6741nD1 enumC6741nD1A = EnumC6741nD1.a(this.zzq);
        return enumC6741nD1A == null ? EnumC6741nD1.UNSPECIFIED : enumC6741nD1A;
    }

    public final List Y() {
        return new C7538q43(this.zzj, zzb);
    }

    public final int h0() {
        int iA = AbstractC5609jC1.a(this.zzm);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }

    public final int i0() {
        int iA = AbstractC5609jC1.a(this.zzn);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }

    public final int j0() {
        int iA = AbstractC5609jC1.a(this.zzp);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }

    public final int k0() {
        int iA = AbstractC5609jC1.a(this.zzg);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }

    public final int l0() {
        int iA = AbstractC5609jC1.a(this.zzl);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }
}
