package com.daaw;

import android.net.Uri;
import com.daaw.GV0;
import com.daaw.HV0;
import com.daaw.InterfaceC2595Vv;
import com.google.android.exoplayer2.Format;
import java.io.IOException;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.ey, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C4416ey implements GV0 {
    public final InterfaceC0937Gc0 a;
    public final int b;
    public final com.google.android.exoplayer2.trackselection.c c;
    public final C1903Pk[] d;
    public final InterfaceC2595Vv e;
    public HV0 f;
    public int g;
    public IOException h;

    /* JADX INFO: renamed from: com.daaw.ey$a */
    public static final class a implements GV0.a {
        public final InterfaceC2595Vv.a a;

        public a(InterfaceC2595Vv.a aVar) {
            this.a = aVar;
        }

        @Override // com.daaw.GV0.a
        public GV0 a(InterfaceC0937Gc0 interfaceC0937Gc0, HV0 hv0, int i, com.google.android.exoplayer2.trackselection.c cVar, W41[] w41Arr) {
            return new C4416ey(interfaceC0937Gc0, hv0, i, cVar, this.a.a(), w41Arr);
        }
    }

    public C4416ey(InterfaceC0937Gc0 interfaceC0937Gc0, HV0 hv0, int i, com.google.android.exoplayer2.trackselection.c cVar, InterfaceC2595Vv interfaceC2595Vv, W41[] w41Arr) {
        this.a = interfaceC0937Gc0;
        this.f = hv0;
        this.b = i;
        this.c = cVar;
        this.e = interfaceC2595Vv;
        HV0.b bVar = hv0.f[i];
        this.d = new C1903Pk[cVar.length()];
        for (int i2 = 0; i2 < this.d.length; i2++) {
            int iG = cVar.g(i2);
            Format format = bVar.j[iG];
            int i3 = bVar.a;
            this.d[i2] = new C1903Pk(new C6791nQ(3, null, new U41(iG, i3, bVar.c, -9223372036854775807L, hv0.g, format, 0, w41Arr, i3 == 2 ? 4 : 0, null, null), null), bVar.a, format);
        }
    }

    public static AbstractC3506bi0 d(Format format, InterfaceC2595Vv interfaceC2595Vv, Uri uri, String str, int i, long j, long j2, long j3, int i2, Object obj, C1903Pk c1903Pk) {
        return new C0996Gr(interfaceC2595Vv, new C2907Yv(uri, 0L, -1L, str), format, i2, obj, j, j2, j3, i, 1, j, c1903Pk);
    }

    private long j(long j) {
        HV0 hv0 = this.f;
        if (!hv0.d) {
            return -9223372036854775807L;
        }
        HV0.b bVar = hv0.f[this.b];
        int i = bVar.k - 1;
        return (bVar.d(i) + bVar.b(i)) - j;
    }

    @Override // com.daaw.GV0
    public void a(HV0 hv0) {
        HV0.b[] bVarArr = this.f.f;
        int i = this.b;
        HV0.b bVar = bVarArr[i];
        int i2 = bVar.k;
        HV0.b bVar2 = hv0.f[i];
        if (i2 == 0 || bVar2.k == 0) {
            this.g += i2;
        } else {
            int i3 = i2 - 1;
            long jD = bVar.d(i3) + bVar.b(i3);
            long jD2 = bVar2.d(0);
            if (jD <= jD2) {
                this.g += i2;
            } else {
                this.g += bVar.c(jD2);
            }
        }
        this.f = hv0;
    }

    @Override // com.daaw.InterfaceC2343Tk
    public void b() throws IOException {
        IOException iOException = this.h;
        if (iOException != null) {
            throw iOException;
        }
        this.a.b();
    }

    @Override // com.daaw.InterfaceC2343Tk
    public long e(long j, DO0 do0) {
        HV0.b bVar = this.f.f[this.b];
        int iC = bVar.c(j);
        long jD = bVar.d(iC);
        return AbstractC6280lb1.S(j, do0, jD, (jD >= j || iC >= bVar.k + (-1)) ? jD : bVar.d(iC + 1));
    }

    @Override // com.daaw.InterfaceC2343Tk
    public boolean g(AbstractC1799Ok abstractC1799Ok, boolean z, Exception exc) {
        if (!z) {
            return false;
        }
        com.google.android.exoplayer2.trackselection.c cVar = this.c;
        return AbstractC2447Uk.a(cVar, cVar.i(abstractC1799Ok.c), exc);
    }

    @Override // com.daaw.InterfaceC2343Tk
    public int h(long j, List list) {
        return (this.h != null || this.c.length() < 2) ? list.size() : this.c.h(j, list);
    }

    @Override // com.daaw.InterfaceC2343Tk
    public final void i(AbstractC3506bi0 abstractC3506bi0, long j, long j2, C2029Qk c2029Qk) {
        int iE;
        if (this.h != null) {
            return;
        }
        HV0.b bVar = this.f.f[this.b];
        if (bVar.k == 0) {
            c2029Qk.b = !r1.d;
            return;
        }
        if (abstractC3506bi0 == null) {
            iE = bVar.c(j2);
        } else {
            iE = (int) (abstractC3506bi0.e() - ((long) this.g));
            if (iE < 0) {
                this.h = new C3768cf();
                return;
            }
        }
        int i = iE;
        if (i >= bVar.k) {
            c2029Qk.b = !this.f.d;
            return;
        }
        this.c.n(j, j2 - j, j(j));
        long jD = bVar.d(i);
        long jB = jD + bVar.b(i);
        long j3 = abstractC3506bi0 == null ? j2 : -9223372036854775807L;
        int i2 = i + this.g;
        int iB = this.c.b();
        c2029Qk.a = d(this.c.k(), this.e, bVar.a(this.c.g(iB), i), null, i2, jD, jB, j3, this.c.l(), this.c.o(), this.d[iB]);
    }

    @Override // com.daaw.InterfaceC2343Tk
    public void f(AbstractC1799Ok abstractC1799Ok) {
    }
}
