package com.daaw;

import android.net.Uri;
import com.google.android.gms.internal.ads.zzby;
import java.io.EOFException;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.Bq1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0465Bq1 implements InterfaceC1086Hn1 {
    public static final InterfaceC1813On1 q = new InterfaceC1813On1() { // from class: com.daaw.zq1
        @Override // com.daaw.InterfaceC1813On1
        public final /* synthetic */ InterfaceC1086Hn1[] a(Uri uri, Map map) {
            int i = AbstractC1709Nn1.a;
            return new InterfaceC1086Hn1[]{new C0465Bq1(0)};
        }
    };
    public static final InterfaceC2155Rp1 r = new InterfaceC2155Rp1() { // from class: com.daaw.Aq1
    };
    public final InterfaceC8576to1 e;
    public InterfaceC1398Kn1 f;
    public InterfaceC8576to1 g;
    public InterfaceC8576to1 h;
    public int i;
    public zzby j;
    public long l;
    public long m;
    public int n;
    public InterfaceC0682Dq1 o;
    public boolean p;
    public final C5900kE2 a = new C5900kE2(10);
    public final C5219ho1 b = new C5219ho1();
    public final C4093do1 c = new C4093do1();
    public long k = -9223372036854775807L;
    public final C4661fo1 d = new C4661fo1();

    public C0465Bq1(int i) {
        C0982Gn1 c0982Gn1 = new C0982Gn1();
        this.e = c0982Gn1;
        this.h = c0982Gn1;
    }

    public static boolean e(int i, long j) {
        return ((long) (i & (-128000))) == (j & (-128000));
    }

    public final void a() {
        this.p = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0180  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int b(com.daaw.InterfaceC1190In1 r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 635
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C0465Bq1.b(com.daaw.In1):int");
    }

    public final long c(long j) {
        return this.k + ((j * 1000000) / ((long) this.b.d));
    }

    public final InterfaceC0682Dq1 d(InterfaceC1190In1 interfaceC1190In1, boolean z) {
        ((C9694xn1) interfaceC1190In1).h(this.a.i(), 0, 4, false);
        this.a.g(0);
        this.b.a(this.a.o());
        return new C9709xq1(interfaceC1190In1.zzd(), interfaceC1190In1.zzf(), this.b, false);
    }

    public final boolean f(InterfaceC1190In1 interfaceC1190In1) {
        InterfaceC0682Dq1 interfaceC0682Dq1 = this.o;
        if (interfaceC0682Dq1 != null) {
            long jZzc = interfaceC0682Dq1.zzc();
            if (jZzc != -1 && interfaceC1190In1.zze() > jZzc - 4) {
                return true;
            }
        }
        try {
            return !interfaceC1190In1.h(this.a.i(), 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    public final boolean g(InterfaceC1190In1 interfaceC1190In1, boolean z) throws Throwable {
        int i;
        int iZze;
        int iB;
        interfaceC1190In1.zzj();
        if (interfaceC1190In1.zzf() == 0) {
            zzby zzbyVarA = this.d.a(interfaceC1190In1, null);
            this.j = zzbyVarA;
            if (zzbyVarA != null) {
                this.c.b(zzbyVarA);
            }
            iZze = (int) interfaceC1190In1.zze();
            if (!z) {
                ((C9694xn1) interfaceC1190In1).m(iZze, false);
            }
            i = 0;
        } else {
            i = 0;
            iZze = 0;
        }
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (!f(interfaceC1190In1)) {
                this.a.g(0);
                int iO = this.a.o();
                if ((i == 0 || e(iO, i)) && (iB = AbstractC5497io1.b(iO)) != -1) {
                    i2++;
                    if (i2 != 1) {
                        if (i2 == 4) {
                            break;
                        }
                    } else {
                        this.b.a(iO);
                        i = iO;
                    }
                    ((C9694xn1) interfaceC1190In1).l(iB - 4, false);
                } else {
                    int i4 = i3 + 1;
                    if (i3 == (true != z ? 131072 : 32768)) {
                        if (z) {
                            return false;
                        }
                        throw QT1.a("Searched too many bytes.", null);
                    }
                    if (z) {
                        interfaceC1190In1.zzj();
                        ((C9694xn1) interfaceC1190In1).l(iZze + i4, false);
                    } else {
                        ((C9694xn1) interfaceC1190In1).m(1, false);
                    }
                    i3 = i4;
                    i = 0;
                    i2 = 0;
                }
            } else if (i2 <= 0) {
                throw new EOFException();
            }
        }
        if (z) {
            ((C9694xn1) interfaceC1190In1).m(iZze + i3, false);
        } else {
            interfaceC1190In1.zzj();
        }
        this.i = i;
        return true;
    }

    @Override // com.daaw.InterfaceC1086Hn1
    public final void k(long j, long j2) {
        this.i = 0;
        this.k = -9223372036854775807L;
        this.l = 0L;
        this.n = 0;
    }

    @Override // com.daaw.InterfaceC1086Hn1
    public final boolean l(InterfaceC1190In1 interfaceC1190In1) {
        return g(interfaceC1190In1, true);
    }

    @Override // com.daaw.InterfaceC1086Hn1
    public final void m(InterfaceC1398Kn1 interfaceC1398Kn1) {
        this.f = interfaceC1398Kn1;
        InterfaceC8576to1 interfaceC8576to1O = interfaceC1398Kn1.o(0, 1);
        this.g = interfaceC8576to1O;
        this.h = interfaceC8576to1O;
        this.f.b();
    }

    @Override // com.daaw.InterfaceC1086Hn1
    public final int n(InterfaceC1190In1 interfaceC1190In1, C6057ko1 c6057ko1) {
        AbstractC6048km2.b(this.g);
        int i = AbstractC9004vJ2.a;
        return b(interfaceC1190In1);
    }
}
