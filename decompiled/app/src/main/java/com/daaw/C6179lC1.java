package com.daaw;

import com.google.android.gms.ads.AdRequest;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: com.daaw.lC1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6179lC1 extends AbstractC4449f43 implements V43 {
    private static final C6179lC1 zzb;
    private int zzd;
    private int zze;
    private int zzg;
    private AD1 zzi;
    private C3928dC1 zzk;
    private C4774gC1 zzl;
    private C10091zC1 zzm;
    private CB1 zzn;
    private C7020oD1 zzo;
    private C3379bE1 zzp;
    private LB1 zzq;
    private String zzf = "";
    private int zzh = 1000;
    private InterfaceC7816r43 zzj = AbstractC4449f43.v();

    static {
        C6179lC1 c6179lC1 = new C6179lC1();
        zzb = c6179lC1;
        AbstractC4449f43.D(C6179lC1.class, c6179lC1);
    }

    public static C5891kC1 O() {
        return (C5891kC1) zzb.j();
    }

    public static /* synthetic */ void R(C6179lC1 c6179lC1, String str) {
        str.getClass();
        c6179lC1.zzd |= 2;
        c6179lC1.zzf = str;
    }

    public static /* synthetic */ void S(C6179lC1 c6179lC1, Iterable iterable) {
        InterfaceC7816r43 interfaceC7816r43 = c6179lC1.zzj;
        if (!interfaceC7816r43.zzc()) {
            c6179lC1.zzj = AbstractC4449f43.w(interfaceC7816r43);
        }
        AbstractC4444f33.f(iterable, c6179lC1.zzj);
    }

    public static /* synthetic */ void U(C6179lC1 c6179lC1, C3928dC1 c3928dC1) {
        c3928dC1.getClass();
        c6179lC1.zzk = c3928dC1;
        c6179lC1.zzd |= 32;
    }

    public static /* synthetic */ void V(C6179lC1 c6179lC1, CB1 cb1) {
        cb1.getClass();
        c6179lC1.zzn = cb1;
        c6179lC1.zzd |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
    }

    public static /* synthetic */ void W(C6179lC1 c6179lC1, C7020oD1 c7020oD1) {
        c7020oD1.getClass();
        c6179lC1.zzo = c7020oD1;
        c6179lC1.zzd |= AdRequest.MAX_CONTENT_URL_LENGTH;
    }

    public static /* synthetic */ void X(C6179lC1 c6179lC1, C3379bE1 c3379bE1) {
        c3379bE1.getClass();
        c6179lC1.zzp = c3379bE1;
        c6179lC1.zzd |= 1024;
    }

    public static /* synthetic */ void Y(C6179lC1 c6179lC1, LB1 lb1) {
        lb1.getClass();
        c6179lC1.zzq = lb1;
        c6179lC1.zzd |= 2048;
    }

    @Override // com.daaw.AbstractC4449f43
    public final Object J(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC4449f43.A(zzb, "\u0001\r\u0000\u0001\t\u0015\r\u0000\u0001\u0000\tင\u0000\nဈ\u0001\u000bဋ\u0002\f᠌\u0003\rဉ\u0004\u000e\u0015\u000fဉ\u0005\u0010ဉ\u0006\u0011ဉ\u0007\u0012ဉ\b\u0013ဉ\t\u0014ဉ\n\u0015ဉ\u000b", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", C5332iC1.a, "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq"});
        }
        if (i2 == 3) {
            return new C6179lC1();
        }
        AbstractC9529xB1 abstractC9529xB1 = null;
        if (i2 == 4) {
            return new C5891kC1(abstractC9529xB1);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final CB1 M() {
        CB1 cb1 = this.zzn;
        return cb1 == null ? CB1.N() : cb1;
    }

    public final C3928dC1 N() {
        C3928dC1 c3928dC1 = this.zzk;
        return c3928dC1 == null ? C3928dC1.N() : c3928dC1;
    }

    public final String Q() {
        return this.zzf;
    }
}
