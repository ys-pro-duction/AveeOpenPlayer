package com.daaw;

import android.os.SystemClock;
import com.daaw.C0384Aw0;
import com.daaw.InterfaceC0804Ev;
import com.daaw.InterfaceC2595Vv;
import com.daaw.InterfaceC9611xW;
import com.google.android.exoplayer2.Format;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.Zw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C3015Zw implements InterfaceC0804Ev {
    public final InterfaceC0937Gc0 a;
    public final int[] b;
    public final com.google.android.exoplayer2.trackselection.c c;
    public final int d;
    public final InterfaceC2595Vv e;
    public final long f;
    public final int g;
    public final C0384Aw0.c h;
    public final b[] i;
    public C0908Fv j;
    public int k;
    public IOException l;
    public boolean m;
    public long n;

    /* JADX INFO: renamed from: com.daaw.Zw$a */
    public static final class a implements InterfaceC0804Ev.a {
        public final InterfaceC2595Vv.a a;
        public final int b;

        public a(InterfaceC2595Vv.a aVar) {
            this(aVar, 1);
        }

        @Override // com.daaw.InterfaceC0804Ev.a
        public InterfaceC0804Ev a(InterfaceC0937Gc0 interfaceC0937Gc0, C0908Fv c0908Fv, int i, int[] iArr, com.google.android.exoplayer2.trackselection.c cVar, int i2, long j, boolean z, boolean z2, C0384Aw0.c cVar2) {
            return new C3015Zw(interfaceC0937Gc0, c0908Fv, i, iArr, cVar, i2, this.a.a(), j, this.b, z, z2, cVar2);
        }

        public a(InterfaceC2595Vv.a aVar, int i) {
            this.a = aVar;
            this.b = i;
        }
    }

    /* JADX INFO: renamed from: com.daaw.Zw$b */
    public static final class b {
        public final C1903Pk a;
        public AbstractC6202lI0 b;
        public InterfaceC1428Kv c;
        public long d;
        public long e;

        public b(long j, int i, AbstractC6202lI0 abstractC6202lI0, boolean z, boolean z2, Z41 z41) {
            InterfaceC8715uJ c6791nQ;
            this.d = j;
            this.b = abstractC6202lI0;
            String str = abstractC6202lI0.c.F;
            if (g(str)) {
                this.a = null;
            } else {
                if ("application/x-rawcc".equals(str)) {
                    c6791nQ = new C8982vE0(abstractC6202lI0.c);
                } else if (h(str)) {
                    c6791nQ = new C10221zh0(1);
                } else {
                    c6791nQ = new C6791nQ(z ? 4 : 0, null, null, null, z2 ? Collections.singletonList(Format.s(null, "application/cea-608", 0, null)) : Collections.EMPTY_LIST, z41);
                }
                this.a = new C1903Pk(c6791nQ, i, abstractC6202lI0.c);
            }
            this.c = abstractC6202lI0.i();
        }

        public static boolean g(String str) {
            return AbstractC8834uk0.l(str) || "application/ttml+xml".equals(str);
        }

        public static boolean h(String str) {
            return str.startsWith("video/webm") || str.startsWith("audio/webm") || str.startsWith("application/webm");
        }

        public long a() {
            return this.c.g() + this.e;
        }

        public int b() {
            return this.c.h(this.d);
        }

        public long c(long j) {
            return e(j) + this.c.c(j - this.e, this.d);
        }

        public long d(long j) {
            return this.c.e(j, this.d) + this.e;
        }

        public long e(long j) {
            return this.c.b(j - this.e);
        }

        public C7859rE0 f(long j) {
            return this.c.d(j - this.e);
        }

        public void i(long j, AbstractC6202lI0 abstractC6202lI0) throws C3768cf {
            int iH;
            InterfaceC1428Kv interfaceC1428KvI = this.b.i();
            InterfaceC1428Kv interfaceC1428KvI2 = abstractC6202lI0.i();
            this.d = j;
            this.b = abstractC6202lI0;
            if (interfaceC1428KvI == null) {
                return;
            }
            this.c = interfaceC1428KvI2;
            if (interfaceC1428KvI.f() && (iH = interfaceC1428KvI.h(this.d)) != 0) {
                long jG = interfaceC1428KvI.g() + ((long) iH);
                long j2 = jG - 1;
                long jB = interfaceC1428KvI.b(j2) + interfaceC1428KvI.c(j2, this.d);
                long jG2 = interfaceC1428KvI2.g();
                long jB2 = interfaceC1428KvI2.b(jG2);
                if (jB == jB2) {
                    this.e += jG - jG2;
                } else {
                    if (jB < jB2) {
                        throw new C3768cf();
                    }
                    this.e += interfaceC1428KvI.e(jB2, this.d) - jG2;
                }
            }
        }
    }

    public C3015Zw(InterfaceC0937Gc0 interfaceC0937Gc0, C0908Fv c0908Fv, int i, int[] iArr, com.google.android.exoplayer2.trackselection.c cVar, int i2, InterfaceC2595Vv interfaceC2595Vv, long j, int i3, boolean z, boolean z2, C0384Aw0.c cVar2) {
        this.a = interfaceC0937Gc0;
        this.j = c0908Fv;
        this.b = iArr;
        this.c = cVar;
        this.d = i2;
        this.e = interfaceC2595Vv;
        this.k = i;
        this.f = j;
        this.g = i3;
        this.h = cVar2;
        long jG = c0908Fv.g(i);
        this.n = -9223372036854775807L;
        ArrayList arrayListJ = j();
        this.i = new b[cVar.length()];
        int i4 = 0;
        while (i4 < this.i.length) {
            int i5 = i2;
            this.i[i4] = new b(jG, i5, (AbstractC6202lI0) arrayListJ.get(cVar.g(i4)), z, z2, cVar2);
            i4++;
            i2 = i5;
        }
    }

    public static AbstractC1799Ok k(b bVar, InterfaceC2595Vv interfaceC2595Vv, Format format, int i, Object obj, C7859rE0 c7859rE0, C7859rE0 c7859rE02) {
        String str = bVar.b.d;
        if (c7859rE0 == null || (c7859rE02 = c7859rE0.a(c7859rE02, str)) != null) {
            c7859rE0 = c7859rE02;
        }
        return new DZ(interfaceC2595Vv, new C2907Yv(c7859rE0.b(str), c7859rE0.a, c7859rE0.b, bVar.b.a()), format, i, obj, bVar.a);
    }

    public static AbstractC1799Ok l(b bVar, InterfaceC2595Vv interfaceC2595Vv, int i, Format format, int i2, Object obj, long j, int i3, long j2) {
        AbstractC6202lI0 abstractC6202lI0 = bVar.b;
        long jE = bVar.e(j);
        C7859rE0 c7859rE0F = bVar.f(j);
        String str = abstractC6202lI0.d;
        if (bVar.a == null) {
            return new C8477tT0(interfaceC2595Vv, new C2907Yv(c7859rE0F.b(str), c7859rE0F.a, c7859rE0F.b, abstractC6202lI0.a()), format, i2, obj, jE, bVar.c(j), j, i, format);
        }
        int i4 = 1;
        int i5 = 1;
        while (i4 < i3) {
            C7859rE0 c7859rE0A = c7859rE0F.a(bVar.f(j + ((long) i4)), str);
            if (c7859rE0A == null) {
                break;
            }
            i5++;
            i4++;
            c7859rE0F = c7859rE0A;
        }
        return new C0996Gr(interfaceC2595Vv, new C2907Yv(c7859rE0F.b(str), c7859rE0F.a, c7859rE0F.b, abstractC6202lI0.a()), format, i2, obj, jE, bVar.c((j + ((long) i5)) - 1), j2, j, i5, -abstractC6202lI0.e, bVar.a);
    }

    @Override // com.daaw.InterfaceC2343Tk
    public void b() throws IOException {
        IOException iOException = this.l;
        if (iOException != null) {
            throw iOException;
        }
        this.a.b();
    }

    @Override // com.daaw.InterfaceC0804Ev
    public void c(C0908Fv c0908Fv, int i) {
        try {
            this.j = c0908Fv;
            this.k = i;
            long jG = c0908Fv.g(i);
            ArrayList arrayListJ = j();
            for (int i2 = 0; i2 < this.i.length; i2++) {
                this.i[i2].i(jG, (AbstractC6202lI0) arrayListJ.get(this.c.g(i2)));
            }
        } catch (C3768cf e) {
            this.l = e;
        }
    }

    public final long d() {
        return (this.f != 0 ? SystemClock.elapsedRealtime() + this.f : System.currentTimeMillis()) * 1000;
    }

    @Override // com.daaw.InterfaceC2343Tk
    public long e(long j, DO0 do0) {
        for (b bVar : this.i) {
            if (bVar.c != null) {
                long jD = bVar.d(j);
                long jE = bVar.e(jD);
                return AbstractC6280lb1.S(j, do0, jE, (jE >= j || jD >= ((long) (bVar.b() + (-1)))) ? jE : bVar.e(jD + 1));
            }
        }
        return j;
    }

    @Override // com.daaw.InterfaceC2343Tk
    public void f(AbstractC1799Ok abstractC1799Ok) {
        CO0 co0D;
        if (abstractC1799Ok instanceof DZ) {
            b bVar = this.i[this.c.i(((DZ) abstractC1799Ok).c)];
            if (bVar.c == null && (co0D = bVar.a.d()) != null) {
                bVar.c = new C1531Lv((C2133Rk) co0D, bVar.b.e);
            }
        }
        C0384Aw0.c cVar = this.h;
        if (cVar != null) {
            cVar.h(abstractC1799Ok);
        }
    }

    @Override // com.daaw.InterfaceC2343Tk
    public boolean g(AbstractC1799Ok abstractC1799Ok, boolean z, Exception exc) {
        b bVar;
        int iB;
        if (!z) {
            return false;
        }
        C0384Aw0.c cVar = this.h;
        if (cVar != null && cVar.g(abstractC1799Ok)) {
            return true;
        }
        if (!this.j.d && (abstractC1799Ok instanceof AbstractC3506bi0) && (exc instanceof InterfaceC9611xW.d) && ((InterfaceC9611xW.d) exc).D == 404 && (iB = (bVar = this.i[this.c.i(abstractC1799Ok.c)]).b()) != -1 && iB != 0) {
            if (((AbstractC3506bi0) abstractC1799Ok).e() > (bVar.a() + ((long) iB)) - 1) {
                this.m = true;
                return true;
            }
        }
        com.google.android.exoplayer2.trackselection.c cVar2 = this.c;
        return AbstractC2447Uk.a(cVar2, cVar2.i(abstractC1799Ok.c), exc);
    }

    @Override // com.daaw.InterfaceC2343Tk
    public int h(long j, List list) {
        return (this.l != null || this.c.length() < 2) ? list.size() : this.c.h(j, list);
    }

    @Override // com.daaw.InterfaceC2343Tk
    public void i(AbstractC3506bi0 abstractC3506bi0, long j, long j2, C2029Qk c2029Qk) {
        long jD;
        long j3;
        long jE;
        if (this.l != null) {
            return;
        }
        long j4 = j2 - j;
        long jM = m(j);
        long jA = AbstractC6025ki.a(this.j.a) + AbstractC6025ki.a(this.j.d(this.k).b) + j2;
        C0384Aw0.c cVar = this.h;
        if (cVar == null || !cVar.f(jA)) {
            this.c.n(j, j4, jM);
            b bVar = this.i[this.c.b()];
            C1903Pk c1903Pk = bVar.a;
            if (c1903Pk != null) {
                AbstractC6202lI0 abstractC6202lI0 = bVar.b;
                C7859rE0 c7859rE0K = c1903Pk.c() == null ? abstractC6202lI0.k() : null;
                C7859rE0 c7859rE0J = bVar.c == null ? abstractC6202lI0.j() : null;
                if (c7859rE0K != null || c7859rE0J != null) {
                    c2029Qk.a = k(bVar, this.e, this.c.k(), this.c.l(), this.c.o(), c7859rE0K, c7859rE0J);
                    return;
                }
            }
            int iB = bVar.b();
            if (iB == 0) {
                C0908Fv c0908Fv = this.j;
                c2029Qk.b = !c0908Fv.d || this.k < c0908Fv.e() - 1;
                return;
            }
            long jA2 = bVar.a();
            if (iB == -1) {
                long jD2 = (d() - AbstractC6025ki.a(this.j.a)) - AbstractC6025ki.a(this.j.d(this.k).b);
                long j5 = this.j.f;
                if (j5 != -9223372036854775807L) {
                    jA2 = Math.max(jA2, bVar.d(jD2 - AbstractC6025ki.a(j5)));
                }
                jD = bVar.d(jD2);
            } else {
                jD = ((long) iB) + jA2;
            }
            long j6 = jD - 1;
            long j7 = jA2;
            n(bVar, j6);
            if (abstractC3506bi0 == null) {
                j3 = j6;
                jE = AbstractC6280lb1.m(bVar.d(j2), j7, j3);
            } else {
                j3 = j6;
                jE = abstractC3506bi0.e();
                if (jE < j7) {
                    this.l = new C3768cf();
                    return;
                }
            }
            long j8 = jE;
            if (j8 <= j3 && (!this.m || j8 < j3)) {
                c2029Qk.a = l(bVar, this.e, this.d, this.c.k(), this.c.l(), this.c.o(), j8, (int) Math.min(this.g, (j3 - j8) + 1), abstractC3506bi0 == null ? j2 : -9223372036854775807L);
            } else {
                C0908Fv c0908Fv2 = this.j;
                c2029Qk.b = !c0908Fv2.d || this.k < c0908Fv2.e() + (-1);
            }
        }
    }

    public final ArrayList j() {
        List list = this.j.d(this.k).c;
        ArrayList arrayList = new ArrayList();
        for (int i : this.b) {
            arrayList.addAll(((W2) list.get(i)).c);
        }
        return arrayList;
    }

    public final long m(long j) {
        if (this.j.d) {
            long j2 = this.n;
            if (j2 != -9223372036854775807L) {
                return j2 - j;
            }
        }
        return -9223372036854775807L;
    }

    public final void n(b bVar, long j) {
        this.n = this.j.d ? bVar.c(j) : -9223372036854775807L;
    }
}
