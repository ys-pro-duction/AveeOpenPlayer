package com.daaw;

import com.daaw.AbstractC9165vt0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.yt0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C10002yt0 {
    public final List a = new ArrayList();
    public final b b;
    public final b c;
    public final b d;
    public final b e;

    /* JADX INFO: renamed from: com.daaw.yt0$b */
    public static final class b {
        public float a;
        public float b;

        public b(float f, float f2) {
            this.a = f;
            this.b = f2;
        }

        public final float a() {
            return this.a;
        }

        public final float b() {
            return this.b;
        }

        public final void c() {
            this.a = 0.0f;
            this.b = 0.0f;
        }

        public final void d(float f) {
            this.a = f;
        }

        public final void e(float f) {
            this.b = f;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return G10.c(Float.valueOf(this.a), Float.valueOf(bVar.a)) && G10.c(Float.valueOf(this.b), Float.valueOf(bVar.b));
        }

        public int hashCode() {
            return (Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b);
        }

        public String toString() {
            return "PathPoint(x=" + this.a + ", y=" + this.b + ')';
        }

        public /* synthetic */ b(float f, float f2, int i, AbstractC2911Yw abstractC2911Yw) {
            this((i & 1) != 0 ? 0.0f : f, (i & 2) != 0 ? 0.0f : f2);
        }
    }

    public C10002yt0() {
        float f = 0.0f;
        int i = 3;
        AbstractC2911Yw abstractC2911Yw = null;
        this.b = new b(f, f, i, abstractC2911Yw);
        this.c = new b(f, f, i, abstractC2911Yw);
        this.d = new b(f, f, i, abstractC2911Yw);
        this.e = new b(f, f, i, abstractC2911Yw);
    }

    public final void A(AbstractC9165vt0.q qVar, boolean z, InterfaceC6090kt0 interfaceC6090kt0) {
        if (z) {
            this.e.d(this.b.a() - this.c.a());
            this.e.e(this.b.b() - this.c.b());
        } else {
            this.e.c();
        }
        interfaceC6090kt0.i(this.e.a(), this.e.b(), qVar.c(), qVar.d());
        this.c.d(this.b.a() + this.e.a());
        this.c.e(this.b.b() + this.e.b());
        b bVar = this.b;
        bVar.d(bVar.a() + qVar.c());
        b bVar2 = this.b;
        bVar2.e(bVar2.b() + qVar.d());
    }

    public final void B(AbstractC9165vt0.r rVar, InterfaceC6090kt0 interfaceC6090kt0) {
        interfaceC6090kt0.n(0.0f, rVar.c());
        b bVar = this.b;
        bVar.e(bVar.b() + rVar.c());
    }

    public final List C() {
        return this.a;
    }

    public final InterfaceC6090kt0 D(InterfaceC6090kt0 interfaceC6090kt0) {
        G10.g(interfaceC6090kt0, "target");
        interfaceC6090kt0.reset();
        this.b.c();
        this.c.c();
        this.d.c();
        this.e.c();
        List list = this.a;
        int size = list.size();
        AbstractC9165vt0 abstractC9165vt0 = null;
        int i = 0;
        while (i < size) {
            AbstractC9165vt0 abstractC9165vt02 = (AbstractC9165vt0) list.get(i);
            if (abstractC9165vt0 == null) {
                abstractC9165vt0 = abstractC9165vt02;
            }
            if (abstractC9165vt02 instanceof AbstractC9165vt0.b) {
                f(interfaceC6090kt0);
            } else if (abstractC9165vt02 instanceof AbstractC9165vt0.n) {
                x((AbstractC9165vt0.n) abstractC9165vt02, interfaceC6090kt0);
            } else if (abstractC9165vt02 instanceof AbstractC9165vt0.f) {
                n((AbstractC9165vt0.f) abstractC9165vt02, interfaceC6090kt0);
            } else if (abstractC9165vt02 instanceof AbstractC9165vt0.m) {
                w((AbstractC9165vt0.m) abstractC9165vt02, interfaceC6090kt0);
            } else if (abstractC9165vt02 instanceof AbstractC9165vt0.e) {
                m((AbstractC9165vt0.e) abstractC9165vt02, interfaceC6090kt0);
            } else if (abstractC9165vt02 instanceof AbstractC9165vt0.l) {
                v((AbstractC9165vt0.l) abstractC9165vt02, interfaceC6090kt0);
            } else if (abstractC9165vt02 instanceof AbstractC9165vt0.d) {
                l((AbstractC9165vt0.d) abstractC9165vt02, interfaceC6090kt0);
            } else if (abstractC9165vt02 instanceof AbstractC9165vt0.r) {
                B((AbstractC9165vt0.r) abstractC9165vt02, interfaceC6090kt0);
            } else if (abstractC9165vt02 instanceof AbstractC9165vt0.s) {
                F((AbstractC9165vt0.s) abstractC9165vt02, interfaceC6090kt0);
            } else if (abstractC9165vt02 instanceof AbstractC9165vt0.k) {
                u((AbstractC9165vt0.k) abstractC9165vt02, interfaceC6090kt0);
            } else if (abstractC9165vt02 instanceof AbstractC9165vt0.c) {
                h((AbstractC9165vt0.c) abstractC9165vt02, interfaceC6090kt0);
            } else if (abstractC9165vt02 instanceof AbstractC9165vt0.p) {
                G10.d(abstractC9165vt0);
                z((AbstractC9165vt0.p) abstractC9165vt02, abstractC9165vt0.a(), interfaceC6090kt0);
            } else if (abstractC9165vt02 instanceof AbstractC9165vt0.h) {
                G10.d(abstractC9165vt0);
                r((AbstractC9165vt0.h) abstractC9165vt02, abstractC9165vt0.a(), interfaceC6090kt0);
            } else if (abstractC9165vt02 instanceof AbstractC9165vt0.o) {
                y((AbstractC9165vt0.o) abstractC9165vt02, interfaceC6090kt0);
            } else if (abstractC9165vt02 instanceof AbstractC9165vt0.g) {
                q((AbstractC9165vt0.g) abstractC9165vt02, interfaceC6090kt0);
            } else if (abstractC9165vt02 instanceof AbstractC9165vt0.q) {
                G10.d(abstractC9165vt0);
                A((AbstractC9165vt0.q) abstractC9165vt02, abstractC9165vt0.b(), interfaceC6090kt0);
            } else if (abstractC9165vt02 instanceof AbstractC9165vt0.i) {
                G10.d(abstractC9165vt0);
                s((AbstractC9165vt0.i) abstractC9165vt02, abstractC9165vt0.b(), interfaceC6090kt0);
            } else if (abstractC9165vt02 instanceof AbstractC9165vt0.j) {
                t((AbstractC9165vt0.j) abstractC9165vt02, interfaceC6090kt0);
            } else if (abstractC9165vt02 instanceof AbstractC9165vt0.a) {
                c((AbstractC9165vt0.a) abstractC9165vt02, interfaceC6090kt0);
            }
            i++;
            abstractC9165vt0 = abstractC9165vt02;
        }
        return interfaceC6090kt0;
    }

    public final double E(double d) {
        return (d / ((double) 180)) * 3.141592653589793d;
    }

    public final void F(AbstractC9165vt0.s sVar, InterfaceC6090kt0 interfaceC6090kt0) {
        interfaceC6090kt0.c(this.b.a(), sVar.c());
        this.b.e(sVar.c());
    }

    public final void a(char c, float[] fArr) {
        this.a.addAll(AbstractC9444wt0.a(c, fArr));
    }

    public final C10002yt0 b(List list) {
        G10.g(list, "nodes");
        this.a.addAll(list);
        return this;
    }

    public final void c(AbstractC9165vt0.a aVar, InterfaceC6090kt0 interfaceC6090kt0) {
        i(interfaceC6090kt0, this.b.a(), this.b.b(), aVar.c(), aVar.d(), aVar.e(), aVar.g(), aVar.f(), aVar.h(), aVar.i());
        this.b.d(aVar.c());
        this.b.e(aVar.d());
        this.c.d(this.b.a());
        this.c.e(this.b.b());
    }

    public final void d(InterfaceC6090kt0 interfaceC6090kt0, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9) {
        double d10 = 4;
        int iCeil = (int) Math.ceil(Math.abs((d9 * d10) / 3.141592653589793d));
        double dCos = Math.cos(d7);
        double dSin = Math.sin(d7);
        double dCos2 = Math.cos(d8);
        double dSin2 = Math.sin(d8);
        double d11 = -d3;
        double d12 = d11 * dCos;
        double d13 = d4 * dSin;
        double d14 = (d12 * dSin2) - (d13 * dCos2);
        double d15 = d11 * dSin;
        double d16 = d4 * dCos;
        double d17 = (dSin2 * d15) + (dCos2 * d16);
        double d18 = d9 / ((double) iCeil);
        double d19 = d8;
        double d20 = d17;
        double d21 = d14;
        int i = 0;
        double d22 = d5;
        double d23 = d6;
        while (i < iCeil) {
            double d24 = d19 + d18;
            double dSin3 = Math.sin(d24);
            double dCos3 = Math.cos(d24);
            int i2 = i;
            double d25 = (d + ((d3 * dCos) * dCos3)) - (d13 * dSin3);
            double d26 = d10;
            double d27 = d2 + (d3 * dSin * dCos3) + (d16 * dSin3);
            double d28 = (d12 * dSin3) - (d13 * dCos3);
            double d29 = (dSin3 * d15) + (dCos3 * d16);
            double d30 = d24 - d19;
            int i3 = iCeil;
            double dTan = Math.tan(d30 / ((double) 2));
            double dSin4 = (Math.sin(d30) * (Math.sqrt(d26 + ((3.0d * dTan) * dTan)) - ((double) 1))) / ((double) 3);
            interfaceC6090kt0.b((float) (d22 + (d21 * dSin4)), (float) (d23 + (d20 * dSin4)), (float) (d25 - (dSin4 * d28)), (float) (d27 - (dSin4 * d29)), (float) d25, (float) d27);
            dSin = dSin;
            d18 = d18;
            d22 = d25;
            d23 = d27;
            i = i2 + 1;
            d19 = d24;
            d20 = d29;
            iCeil = i3;
            d21 = d28;
            dCos = dCos;
            d10 = d26;
        }
    }

    public final void e() {
        this.a.clear();
    }

    public final void f(InterfaceC6090kt0 interfaceC6090kt0) {
        this.b.d(this.d.a());
        this.b.e(this.d.b());
        this.c.d(this.d.a());
        this.c.e(this.d.b());
        interfaceC6090kt0.close();
        interfaceC6090kt0.a(this.b.a(), this.b.b());
    }

    public final float[] g(float[] fArr, int i, int i2) {
        if (i > i2) {
            throw new IllegalArgumentException();
        }
        int length = fArr.length;
        if (i < 0 || i > length) {
            throw new IndexOutOfBoundsException();
        }
        int i3 = i2 - i;
        int iMin = Math.min(i3, length - i);
        float[] fArr2 = new float[i3];
        AbstractC5152hb.e(fArr, fArr2, 0, i, iMin + i);
        return fArr2;
    }

    public final void h(AbstractC9165vt0.c cVar, InterfaceC6090kt0 interfaceC6090kt0) {
        interfaceC6090kt0.b(cVar.c(), cVar.f(), cVar.d(), cVar.g(), cVar.e(), cVar.h());
        this.c.d(cVar.d());
        this.c.e(cVar.g());
        this.b.d(cVar.e());
        this.b.e(cVar.h());
    }

    public final void i(InterfaceC6090kt0 interfaceC6090kt0, double d, double d2, double d3, double d4, double d5, double d6, double d7, boolean z, boolean z2) {
        double d8;
        double d9;
        double dE = E(d7);
        double dCos = Math.cos(dE);
        double dSin = Math.sin(dE);
        double d10 = ((d * dCos) + (d2 * dSin)) / d5;
        double d11 = (((-d) * dSin) + (d2 * dCos)) / d6;
        double d12 = ((d3 * dCos) + (d4 * dSin)) / d5;
        double d13 = (((-d3) * dSin) + (d4 * dCos)) / d6;
        double d14 = d10 - d12;
        double d15 = d11 - d13;
        double d16 = 2;
        double d17 = (d10 + d12) / d16;
        double d18 = (d11 + d13) / d16;
        double d19 = (d14 * d14) + (d15 * d15);
        if (d19 == 0.0d) {
            return;
        }
        double d20 = (1.0d / d19) - 0.25d;
        if (d20 < 0.0d) {
            double dSqrt = (float) (Math.sqrt(d19) / 1.99999d);
            i(interfaceC6090kt0, d, d2, d3, d4, d5 * dSqrt, d6 * dSqrt, d7, z, z2);
            return;
        }
        double dSqrt2 = Math.sqrt(d20);
        double d21 = d14 * dSqrt2;
        double d22 = dSqrt2 * d15;
        if (z == z2) {
            d8 = d17 - d22;
            d9 = d18 + d21;
        } else {
            d8 = d17 + d22;
            d9 = d18 - d21;
        }
        double dAtan2 = Math.atan2(d11 - d9, d10 - d8);
        double dAtan22 = Math.atan2(d13 - d9, d12 - d8) - dAtan2;
        if (z2 != (dAtan22 >= 0.0d)) {
            dAtan22 = dAtan22 > 0.0d ? dAtan22 - 6.283185307179586d : dAtan22 + 6.283185307179586d;
        }
        double d23 = d8 * d5;
        double d24 = d9 * d6;
        d(interfaceC6090kt0, (d23 * dCos) - (d24 * dSin), (d23 * dSin) + (d24 * dCos), d5, d6, d, d2, dE, dAtan2, dAtan22);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0047 A[LOOP:0: B:3:0x0008->B:30:0x0047, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x004a A[EDGE_INSN: B:34:0x004a->B:31:0x004a BREAK  A[LOOP:0: B:3:0x0008->B:30:0x0047], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j(java.lang.String r9, int r10, com.daaw.C10002yt0.a r11) {
        /*
            r8 = this;
            r0 = 0
            r11.d(r0)
            r1 = r10
            r2 = 0
            r3 = 0
            r4 = 0
        L8:
            int r5 = r9.length()
            if (r1 >= r5) goto L4a
            char r5 = r9.charAt(r1)
            r6 = 32
            r7 = 1
            if (r5 != r6) goto L18
            goto L1c
        L18:
            r6 = 44
            if (r5 != r6) goto L1f
        L1c:
            r2 = 0
            r4 = 1
            goto L44
        L1f:
            r6 = 45
            if (r5 != r6) goto L2b
            if (r1 == r10) goto L43
            if (r2 != 0) goto L43
            r11.d(r7)
            goto L1c
        L2b:
            r2 = 46
            if (r5 != r2) goto L38
            if (r3 != 0) goto L34
            r2 = 0
            r3 = 1
            goto L44
        L34:
            r11.d(r7)
            goto L1c
        L38:
            r2 = 101(0x65, float:1.42E-43)
            if (r5 != r2) goto L3d
            goto L41
        L3d:
            r2 = 69
            if (r5 != r2) goto L43
        L41:
            r2 = 1
            goto L44
        L43:
            r2 = 0
        L44:
            if (r4 == 0) goto L47
            goto L4a
        L47:
            int r1 = r1 + 1
            goto L8
        L4a:
            r11.c(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C10002yt0.j(java.lang.String, int, com.daaw.yt0$a):void");
    }

    public final float[] k(String str) {
        int i = 0;
        byte b2 = 0;
        if (str.charAt(0) == 'z' || str.charAt(0) == 'Z') {
            return new float[0];
        }
        float[] fArr = new float[str.length()];
        a aVar = new a(i, b2 == true ? 1 : 0, 3, null);
        int length = str.length();
        int i2 = 1;
        int i3 = 0;
        while (i2 < length) {
            j(str, i2, aVar);
            int iA = aVar.a();
            if (i2 < iA) {
                String strSubstring = str.substring(i2, iA);
                G10.f(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                fArr[i3] = Float.parseFloat(strSubstring);
                i3++;
            }
            i2 = aVar.b() ? iA : iA + 1;
        }
        return g(fArr, 0, i3);
    }

    public final void l(AbstractC9165vt0.d dVar, InterfaceC6090kt0 interfaceC6090kt0) {
        interfaceC6090kt0.c(dVar.c(), this.b.b());
        this.b.d(dVar.c());
    }

    public final void m(AbstractC9165vt0.e eVar, InterfaceC6090kt0 interfaceC6090kt0) {
        interfaceC6090kt0.c(eVar.c(), eVar.d());
        this.b.d(eVar.c());
        this.b.e(eVar.d());
    }

    public final void n(AbstractC9165vt0.f fVar, InterfaceC6090kt0 interfaceC6090kt0) {
        this.b.d(fVar.c());
        this.b.e(fVar.d());
        interfaceC6090kt0.a(fVar.c(), fVar.d());
        this.d.d(this.b.a());
        this.d.e(this.b.b());
    }

    public final int o(String str, int i) {
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            if (((cCharAt - 'A') * (cCharAt - 'Z') <= 0 || (cCharAt - 'a') * (cCharAt - 'z') <= 0) && cCharAt != 'e' && cCharAt != 'E') {
                break;
            }
            i++;
        }
        return i;
    }

    public final C10002yt0 p(String str) {
        G10.g(str, "pathData");
        this.a.clear();
        int i = 1;
        int i2 = 0;
        while (i < str.length()) {
            int iO = o(str, i);
            String strSubstring = str.substring(i2, iO);
            G10.f(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            int length = strSubstring.length() - 1;
            int i3 = 0;
            boolean z = false;
            while (i3 <= length) {
                boolean z2 = G10.h(strSubstring.charAt(!z ? i3 : length), 32) <= 0;
                if (z) {
                    if (!z2) {
                        break;
                    }
                    length--;
                } else if (z2) {
                    i3++;
                } else {
                    z = true;
                }
            }
            String string = strSubstring.subSequence(i3, length + 1).toString();
            if (string.length() > 0) {
                a(string.charAt(0), k(string));
            }
            i2 = iO;
            i = iO + 1;
        }
        if (i - i2 == 1 && i2 < str.length()) {
            a(str.charAt(i2), new float[0]);
        }
        return this;
    }

    public final void q(AbstractC9165vt0.g gVar, InterfaceC6090kt0 interfaceC6090kt0) {
        interfaceC6090kt0.g(gVar.c(), gVar.e(), gVar.d(), gVar.f());
        this.c.d(gVar.c());
        this.c.e(gVar.e());
        this.b.d(gVar.d());
        this.b.e(gVar.f());
    }

    public final void r(AbstractC9165vt0.h hVar, boolean z, InterfaceC6090kt0 interfaceC6090kt0) {
        if (z) {
            float f = 2;
            this.e.d((this.b.a() * f) - this.c.a());
            this.e.e((f * this.b.b()) - this.c.b());
        } else {
            this.e.d(this.b.a());
            this.e.e(this.b.b());
        }
        interfaceC6090kt0.b(this.e.a(), this.e.b(), hVar.c(), hVar.e(), hVar.d(), hVar.f());
        this.c.d(hVar.c());
        this.c.e(hVar.e());
        this.b.d(hVar.d());
        this.b.e(hVar.f());
    }

    public final void s(AbstractC9165vt0.i iVar, boolean z, InterfaceC6090kt0 interfaceC6090kt0) {
        if (z) {
            float f = 2;
            this.e.d((this.b.a() * f) - this.c.a());
            this.e.e((f * this.b.b()) - this.c.b());
        } else {
            this.e.d(this.b.a());
            this.e.e(this.b.b());
        }
        interfaceC6090kt0.g(this.e.a(), this.e.b(), iVar.c(), iVar.d());
        this.c.d(this.e.a());
        this.c.e(this.e.b());
        this.b.d(iVar.c());
        this.b.e(iVar.d());
    }

    public final void t(AbstractC9165vt0.j jVar, InterfaceC6090kt0 interfaceC6090kt0) {
        float fC = jVar.c() + this.b.a();
        float fD = jVar.d() + this.b.b();
        i(interfaceC6090kt0, this.b.a(), this.b.b(), fC, fD, jVar.e(), jVar.g(), jVar.f(), jVar.h(), jVar.i());
        this.b.d(fC);
        this.b.e(fD);
        this.c.d(this.b.a());
        this.c.e(this.b.b());
    }

    public final void u(AbstractC9165vt0.k kVar, InterfaceC6090kt0 interfaceC6090kt0) {
        interfaceC6090kt0.f(kVar.c(), kVar.f(), kVar.d(), kVar.g(), kVar.e(), kVar.h());
        this.c.d(this.b.a() + kVar.d());
        this.c.e(this.b.b() + kVar.g());
        b bVar = this.b;
        bVar.d(bVar.a() + kVar.e());
        b bVar2 = this.b;
        bVar2.e(bVar2.b() + kVar.h());
    }

    public final void v(AbstractC9165vt0.l lVar, InterfaceC6090kt0 interfaceC6090kt0) {
        interfaceC6090kt0.n(lVar.c(), 0.0f);
        b bVar = this.b;
        bVar.d(bVar.a() + lVar.c());
    }

    public final void w(AbstractC9165vt0.m mVar, InterfaceC6090kt0 interfaceC6090kt0) {
        interfaceC6090kt0.n(mVar.c(), mVar.d());
        b bVar = this.b;
        bVar.d(bVar.a() + mVar.c());
        b bVar2 = this.b;
        bVar2.e(bVar2.b() + mVar.d());
    }

    public final void x(AbstractC9165vt0.n nVar, InterfaceC6090kt0 interfaceC6090kt0) {
        b bVar = this.b;
        bVar.d(bVar.a() + nVar.c());
        b bVar2 = this.b;
        bVar2.e(bVar2.b() + nVar.d());
        interfaceC6090kt0.e(nVar.c(), nVar.d());
        this.d.d(this.b.a());
        this.d.e(this.b.b());
    }

    public final void y(AbstractC9165vt0.o oVar, InterfaceC6090kt0 interfaceC6090kt0) {
        interfaceC6090kt0.i(oVar.c(), oVar.e(), oVar.d(), oVar.f());
        this.c.d(this.b.a() + oVar.c());
        this.c.e(this.b.b() + oVar.e());
        b bVar = this.b;
        bVar.d(bVar.a() + oVar.d());
        b bVar2 = this.b;
        bVar2.e(bVar2.b() + oVar.f());
    }

    public final void z(AbstractC9165vt0.p pVar, boolean z, InterfaceC6090kt0 interfaceC6090kt0) {
        if (z) {
            this.e.d(this.b.a() - this.c.a());
            this.e.e(this.b.b() - this.c.b());
        } else {
            this.e.c();
        }
        interfaceC6090kt0.f(this.e.a(), this.e.b(), pVar.c(), pVar.e(), pVar.d(), pVar.f());
        this.c.d(this.b.a() + pVar.c());
        this.c.e(this.b.b() + pVar.e());
        b bVar = this.b;
        bVar.d(bVar.a() + pVar.d());
        b bVar2 = this.b;
        bVar2.e(bVar2.b() + pVar.f());
    }

    /* JADX INFO: renamed from: com.daaw.yt0$a */
    public static final class a {
        public int a;
        public boolean b;

        public a(int i, boolean z) {
            this.a = i;
            this.b = z;
        }

        public final int a() {
            return this.a;
        }

        public final boolean b() {
            return this.b;
        }

        public final void c(int i) {
            this.a = i;
        }

        public final void d(boolean z) {
            this.b = z;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [int] */
        /* JADX WARN: Type inference failed for: r1v2 */
        /* JADX WARN: Type inference failed for: r1v3 */
        public int hashCode() {
            int i = this.a * 31;
            boolean z = this.b;
            ?? r1 = z;
            if (z) {
                r1 = 1;
            }
            return i + r1;
        }

        public String toString() {
            return "ExtractFloatResult(endPosition=" + this.a + ", endWithNegativeOrDot=" + this.b + ')';
        }

        public /* synthetic */ a(int i, boolean z, int i2, AbstractC2911Yw abstractC2911Yw) {
            this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? false : z);
        }
    }
}
