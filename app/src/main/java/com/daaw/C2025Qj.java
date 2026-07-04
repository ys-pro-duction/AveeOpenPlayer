package com.daaw;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import com.google.ads.AdSize;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.Qj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2025Qj extends AbstractC2129Rj {
    public final C2584Vs0 g = new C2584Vs0();
    public final C2480Us0 h = new C2480Us0();
    public final int i;
    public final a[] j;
    public a k;
    public List l;
    public List m;
    public b n;
    public int o;

    /* JADX INFO: renamed from: com.daaw.Qj$a */
    public static final class a {
        public static final int[] A;
        public static final int[] B;
        public static final boolean[] C;
        public static final int[] D;
        public static final int[] E;
        public static final int[] F;
        public static final int[] G;
        public static final int w = h(2, 2, 2, 0);
        public static final int x;
        public static final int y;
        public static final int[] z;
        public final List a = new ArrayList();
        public final SpannableStringBuilder b = new SpannableStringBuilder();
        public boolean c;
        public boolean d;
        public int e;
        public boolean f;
        public int g;
        public int h;
        public int i;
        public int j;
        public boolean k;
        public int l;
        public int m;
        public int n;
        public int o;
        public int p;
        public int q;
        public int r;
        public int s;
        public int t;
        public int u;
        public int v;

        static {
            int iH = h(0, 0, 0, 0);
            x = iH;
            int iH2 = h(0, 0, 0, 3);
            y = iH2;
            z = new int[]{0, 0, 0, 0, 0, 2, 0};
            A = new int[]{0, 0, 0, 0, 0, 0, 2};
            B = new int[]{3, 3, 3, 3, 3, 3, 1};
            C = new boolean[]{false, false, false, true, true, true, false};
            D = new int[]{iH, iH2, iH, iH, iH2, iH, iH};
            E = new int[]{0, 1, 2, 3, 4, 3, 4};
            F = new int[]{0, 0, 0, 0, 0, 3, 3};
            G = new int[]{iH, iH, iH, iH, iH, iH2, iH2};
        }

        public a() {
            l();
        }

        public static int g(int i, int i2, int i3) {
            return h(i, i2, i3, 0);
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static int h(int r4, int r5, int r6, int r7) {
            /*
                r0 = 0
                r1 = 4
                com.daaw.AbstractC7115ob.c(r4, r0, r1)
                com.daaw.AbstractC7115ob.c(r5, r0, r1)
                com.daaw.AbstractC7115ob.c(r6, r0, r1)
                com.daaw.AbstractC7115ob.c(r7, r0, r1)
                r1 = 1
                r2 = 255(0xff, float:3.57E-43)
                if (r7 == 0) goto L1b
                if (r7 == r1) goto L1b
                r3 = 2
                if (r7 == r3) goto L20
                r3 = 3
                if (r7 == r3) goto L1e
            L1b:
                r7 = 255(0xff, float:3.57E-43)
                goto L22
            L1e:
                r7 = 0
                goto L22
            L20:
                r7 = 127(0x7f, float:1.78E-43)
            L22:
                if (r4 <= r1) goto L27
                r4 = 255(0xff, float:3.57E-43)
                goto L28
            L27:
                r4 = 0
            L28:
                if (r5 <= r1) goto L2d
                r5 = 255(0xff, float:3.57E-43)
                goto L2e
            L2d:
                r5 = 0
            L2e:
                if (r6 <= r1) goto L32
                r0 = 255(0xff, float:3.57E-43)
            L32:
                int r4 = android.graphics.Color.argb(r7, r4, r5, r0)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.daaw.C2025Qj.a.h(int, int, int, int):int");
        }

        public void a(char c) {
            if (c != '\n') {
                this.b.append(c);
                return;
            }
            this.a.add(d());
            this.b.clear();
            if (this.p != -1) {
                this.p = 0;
            }
            if (this.q != -1) {
                this.q = 0;
            }
            if (this.r != -1) {
                this.r = 0;
            }
            if (this.t != -1) {
                this.t = 0;
            }
            while (true) {
                if ((!this.k || this.a.size() < this.j) && this.a.size() < 15) {
                    return;
                } else {
                    this.a.remove(0);
                }
            }
        }

        public void b() {
            int length = this.b.length();
            if (length > 0) {
                this.b.delete(length - 1, length);
            }
        }

        public C1899Pj c() {
            Layout.Alignment alignment;
            float f;
            float f2;
            int i;
            float f3;
            int i2;
            if (j()) {
                return null;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i3 = 0; i3 < this.a.size(); i3++) {
                spannableStringBuilder.append((CharSequence) this.a.get(i3));
                spannableStringBuilder.append('\n');
            }
            spannableStringBuilder.append((CharSequence) d());
            int i4 = this.l;
            int i5 = 2;
            if (i4 == 0) {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else if (i4 == 1) {
                alignment = Layout.Alignment.ALIGN_OPPOSITE;
            } else if (i4 != 2) {
                if (i4 != 3) {
                    throw new IllegalArgumentException("Unexpected justification value: " + this.l);
                }
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else {
                alignment = Layout.Alignment.ALIGN_CENTER;
            }
            if (this.f) {
                f = this.h / 99.0f;
                f2 = this.g / 99.0f;
            } else {
                f = this.h / 209.0f;
                f2 = this.g / 74.0f;
            }
            float f4 = (f * 0.9f) + 0.05f;
            float f5 = (f2 * 0.9f) + 0.05f;
            int i6 = this.i;
            if (i6 % 3 == 0) {
                i = i6;
                f3 = f4;
                i2 = 0;
            } else if (i6 % 3 == 1) {
                i = i6;
                f3 = f4;
                i2 = 1;
            } else {
                i = i6;
                f3 = f4;
                i2 = 2;
            }
            if (i / 3 == 0) {
                i5 = 0;
            } else if (i / 3 == 1) {
                i5 = 1;
            }
            int i7 = this.o;
            return new C1899Pj(spannableStringBuilder, alignment, f5, 0, i2, f3, i5, Float.MIN_VALUE, i7 != x, i7, this.e);
        }

        public SpannableString d() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.b);
            int length = spannableStringBuilder.length();
            if (length > 0) {
                if (this.p != -1) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), this.p, length, 33);
                }
                if (this.q != -1) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), this.q, length, 33);
                }
                if (this.r != -1) {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(this.s), this.r, length, 33);
                }
                if (this.t != -1) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(this.u), this.t, length, 33);
                }
            }
            return new SpannableString(spannableStringBuilder);
        }

        public void e() {
            this.a.clear();
            this.b.clear();
            this.p = -1;
            this.q = -1;
            this.r = -1;
            this.t = -1;
            this.v = 0;
        }

        public void f(boolean z2, boolean z3, boolean z4, int i, boolean z5, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            this.c = true;
            this.d = z2;
            this.k = z3;
            this.e = i;
            this.f = z5;
            this.g = i2;
            this.h = i3;
            this.i = i6;
            int i9 = i4 + 1;
            if (this.j != i9) {
                this.j = i9;
                while (true) {
                    if ((!z3 || this.a.size() < this.j) && this.a.size() < 15) {
                        break;
                    } else {
                        this.a.remove(0);
                    }
                }
            }
            if (i7 != 0 && this.m != i7) {
                this.m = i7;
                int i10 = i7 - 1;
                q(D[i10], y, C[i10], 0, A[i10], B[i10], z[i10]);
            }
            if (i8 == 0 || this.n == i8) {
                return;
            }
            this.n = i8;
            int i11 = i8 - 1;
            m(0, 1, 1, false, false, F[i11], E[i11]);
            n(w, G[i11], x);
        }

        public boolean i() {
            return this.c;
        }

        public boolean j() {
            if (i()) {
                return this.a.isEmpty() && this.b.length() == 0;
            }
            return true;
        }

        public boolean k() {
            return this.d;
        }

        public void l() {
            e();
            this.c = false;
            this.d = false;
            this.e = 4;
            this.f = false;
            this.g = 0;
            this.h = 0;
            this.i = 0;
            this.j = 15;
            this.k = true;
            this.l = 0;
            this.m = 0;
            this.n = 0;
            int i = x;
            this.o = i;
            this.s = w;
            this.u = i;
        }

        public void m(int i, int i2, int i3, boolean z2, boolean z3, int i4, int i5) {
            if (this.p != -1) {
                if (!z2) {
                    this.b.setSpan(new StyleSpan(2), this.p, this.b.length(), 33);
                    this.p = -1;
                }
            } else if (z2) {
                this.p = this.b.length();
            }
            if (this.q == -1) {
                if (z3) {
                    this.q = this.b.length();
                }
            } else {
                if (z3) {
                    return;
                }
                this.b.setSpan(new UnderlineSpan(), this.q, this.b.length(), 33);
                this.q = -1;
            }
        }

        public void n(int i, int i2, int i3) {
            if (this.r != -1 && this.s != i) {
                this.b.setSpan(new ForegroundColorSpan(this.s), this.r, this.b.length(), 33);
            }
            if (i != w) {
                this.r = this.b.length();
                this.s = i;
            }
            if (this.t != -1 && this.u != i2) {
                this.b.setSpan(new BackgroundColorSpan(this.u), this.t, this.b.length(), 33);
            }
            if (i2 != x) {
                this.t = this.b.length();
                this.u = i2;
            }
        }

        public void o(int i, int i2) {
            if (this.v != i) {
                a('\n');
            }
            this.v = i;
        }

        public void p(boolean z2) {
            this.d = z2;
        }

        public void q(int i, int i2, boolean z2, int i3, int i4, int i5, int i6) {
            this.o = i;
            this.l = i6;
        }
    }

    /* JADX INFO: renamed from: com.daaw.Qj$b */
    public static final class b {
        public final int a;
        public final int b;
        public final byte[] c;
        public int d = 0;

        public b(int i, int i2) {
            this.a = i;
            this.b = i2;
            this.c = new byte[(i2 * 2) - 1];
        }
    }

    public C2025Qj(int i) {
        this.i = i == -1 ? 1 : i;
        this.j = new a[8];
        for (int i2 = 0; i2 < 8; i2++) {
            this.j[i2] = new a();
        }
        this.k = this.j[0];
        D();
    }

    private void D() {
        for (int i = 0; i < 8; i++) {
            this.j[i].l();
        }
    }

    private List o() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 8; i++) {
            if (!this.j[i].j() && this.j[i].k()) {
                arrayList.add(this.j[i].c());
            }
        }
        Collections.sort(arrayList);
        return DesugarCollections.unmodifiableList(arrayList);
    }

    public final void A() {
        this.h.o(4);
        int iH = this.h.h(4);
        this.h.o(2);
        this.k.o(iH, this.h.h(6));
    }

    public final void B() {
        int iH = a.h(this.h.h(2), this.h.h(2), this.h.h(2), this.h.h(2));
        int iH2 = this.h.h(2);
        int iG = a.g(this.h.h(2), this.h.h(2), this.h.h(2));
        if (this.h.g()) {
            iH2 |= 4;
        }
        boolean zG = this.h.g();
        int iH3 = this.h.h(2);
        int iH4 = this.h.h(2);
        int iH5 = this.h.h(2);
        this.h.o(8);
        this.k.q(iH, iG, zG, iH2, iH3, iH4, iH5);
    }

    public final void C() {
        b bVar = this.n;
        int i = bVar.d;
        if (i != (bVar.b * 2) - 1) {
            b bVar2 = this.n;
            int i2 = bVar2.b;
            int i3 = bVar2.d;
            int i4 = bVar2.a;
            return;
        }
        this.h.l(bVar.c, i);
        int iH = this.h.h(3);
        int iH2 = this.h.h(5);
        if (iH == 7) {
            this.h.o(2);
            iH += this.h.h(6);
        }
        if (iH2 != 0 && iH == this.i) {
            boolean z = false;
            while (this.h.b() > 0) {
                int iH3 = this.h.h(8);
                if (iH3 == 16) {
                    int iH4 = this.h.h(8);
                    if (iH4 <= 31) {
                        r(iH4);
                    } else {
                        if (iH4 <= 127) {
                            w(iH4);
                        } else if (iH4 <= 159) {
                            s(iH4);
                        } else if (iH4 <= 255) {
                            x(iH4);
                        }
                        z = true;
                    }
                } else if (iH3 <= 31) {
                    p(iH3);
                } else {
                    if (iH3 <= 127) {
                        u(iH3);
                    } else if (iH3 <= 159) {
                        q(iH3);
                    } else if (iH3 <= 255) {
                        v(iH3);
                    }
                    z = true;
                }
            }
            if (z) {
                this.l = o();
            }
        }
    }

    @Override // com.daaw.AbstractC2129Rj, com.daaw.InterfaceC0808Ew
    public /* bridge */ /* synthetic */ void a() {
        super.a();
    }

    @Override // com.daaw.AbstractC2129Rj, com.daaw.InterfaceC6828nZ0
    public /* bridge */ /* synthetic */ void b(long j) {
        super.b(j);
    }

    @Override // com.daaw.AbstractC2129Rj
    public InterfaceC6549mZ0 f() {
        List list = this.l;
        this.m = list;
        return new C2235Sj(list);
    }

    @Override // com.daaw.AbstractC2129Rj, com.daaw.InterfaceC0808Ew
    public void flush() {
        super.flush();
        this.l = null;
        this.m = null;
        this.o = 0;
        this.k = this.j[0];
        D();
        this.n = null;
    }

    @Override // com.daaw.AbstractC2129Rj
    public void g(C7665qZ0 c7665qZ0) {
        this.g.H(c7665qZ0.D.array(), c7665qZ0.D.limit());
        while (this.g.a() >= 3) {
            int iX = this.g.x();
            int i = iX & 3;
            boolean z = (iX & 4) == 4;
            byte bX = (byte) this.g.x();
            byte bX2 = (byte) this.g.x();
            if (i == 2 || i == 3) {
                if (z) {
                    if (i == 3) {
                        n();
                        int i2 = (bX & 192) >> 6;
                        int i3 = bX & 63;
                        if (i3 == 0) {
                            i3 = 64;
                        }
                        b bVar = new b(i2, i3);
                        this.n = bVar;
                        byte[] bArr = bVar.c;
                        int i4 = bVar.d;
                        bVar.d = i4 + 1;
                        bArr[i4] = bX2;
                    } else {
                        AbstractC7115ob.a(i == 2);
                        b bVar2 = this.n;
                        if (bVar2 != null) {
                            byte[] bArr2 = bVar2.c;
                            int i5 = bVar2.d;
                            int i6 = i5 + 1;
                            bVar2.d = i6;
                            bArr2[i5] = bX;
                            bVar2.d = i5 + 2;
                            bArr2[i6] = bX2;
                        }
                    }
                    b bVar3 = this.n;
                    if (bVar3.d == (bVar3.b * 2) - 1) {
                        n();
                    }
                }
            }
        }
    }

    @Override // com.daaw.AbstractC2129Rj
    /* JADX INFO: renamed from: h */
    public /* bridge */ /* synthetic */ C7665qZ0 d() {
        return super.d();
    }

    @Override // com.daaw.AbstractC2129Rj
    /* JADX INFO: renamed from: i */
    public /* bridge */ /* synthetic */ AbstractC7943rZ0 c() {
        return super.c();
    }

    @Override // com.daaw.AbstractC2129Rj
    public boolean j() {
        return this.l != this.m;
    }

    @Override // com.daaw.AbstractC2129Rj
    /* JADX INFO: renamed from: k */
    public /* bridge */ /* synthetic */ void e(C7665qZ0 c7665qZ0) {
        super.e(c7665qZ0);
    }

    public final void n() {
        if (this.n == null) {
            return;
        }
        C();
        this.n = null;
    }

    public final void p(int i) {
        if (i != 0) {
            if (i == 3) {
                this.l = o();
                return;
            }
            if (i == 8) {
                this.k.b();
                return;
            }
            switch (i) {
                case 12:
                    D();
                    break;
                case 13:
                    this.k.a('\n');
                    break;
                case 14:
                    break;
                default:
                    if (i >= 17 && i <= 23) {
                        this.h.o(8);
                        break;
                    } else if (i >= 24 && i <= 31) {
                        this.h.o(16);
                        break;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void q(int i) {
        int i2 = 1;
        switch (i) {
            case 128:
            case 129:
            case 130:
            case 131:
            case 132:
            case 133:
            case 134:
            case 135:
                int i3 = i - 128;
                if (this.o != i3) {
                    this.o = i3;
                    this.k = this.j[i3];
                }
                break;
            case 136:
                while (i2 <= 8) {
                    if (this.h.g()) {
                        this.j[8 - i2].e();
                    }
                    i2++;
                }
                break;
            case 137:
                for (int i4 = 1; i4 <= 8; i4++) {
                    if (this.h.g()) {
                        this.j[8 - i4].p(true);
                    }
                }
                break;
            case 138:
                while (i2 <= 8) {
                    if (this.h.g()) {
                        this.j[8 - i2].p(false);
                    }
                    i2++;
                }
                break;
            case 139:
                for (int i5 = 1; i5 <= 8; i5++) {
                    if (this.h.g()) {
                        this.j[8 - i5].p(!r0.k());
                    }
                }
                break;
            case 140:
                while (i2 <= 8) {
                    if (this.h.g()) {
                        this.j[8 - i2].l();
                    }
                    i2++;
                }
                break;
            case 141:
                this.h.o(8);
                break;
            case 143:
                D();
                break;
            case 144:
                if (this.k.i()) {
                    y();
                } else {
                    this.h.o(16);
                }
                break;
            case 145:
                if (this.k.i()) {
                    z();
                } else {
                    this.h.o(24);
                }
                break;
            case 146:
                if (this.k.i()) {
                    A();
                } else {
                    this.h.o(16);
                }
                break;
            case 151:
                if (this.k.i()) {
                    B();
                } else {
                    this.h.o(32);
                }
                break;
            case 152:
            case 153:
            case 154:
            case 155:
            case 156:
            case 157:
            case 158:
            case 159:
                int i6 = i - 152;
                t(i6);
                if (this.o != i6) {
                    this.o = i6;
                    this.k = this.j[i6];
                }
                break;
        }
    }

    public final void r(int i) {
        if (i <= 7) {
            return;
        }
        if (i <= 15) {
            this.h.o(8);
        } else if (i <= 23) {
            this.h.o(16);
        } else if (i <= 31) {
            this.h.o(24);
        }
    }

    public final void s(int i) {
        if (i <= 135) {
            this.h.o(32);
            return;
        }
        if (i <= 143) {
            this.h.o(40);
        } else if (i <= 159) {
            this.h.o(2);
            this.h.o(this.h.h(6) * 8);
        }
    }

    public final void t(int i) {
        a aVar = this.j[i];
        this.h.o(2);
        boolean zG = this.h.g();
        boolean zG2 = this.h.g();
        boolean zG3 = this.h.g();
        int iH = this.h.h(3);
        boolean zG4 = this.h.g();
        int iH2 = this.h.h(7);
        int iH3 = this.h.h(8);
        int iH4 = this.h.h(4);
        int iH5 = this.h.h(4);
        this.h.o(2);
        int iH6 = this.h.h(6);
        this.h.o(2);
        aVar.f(zG, zG2, zG3, iH, zG4, iH2, iH3, iH5, iH6, iH4, this.h.h(3), this.h.h(3));
    }

    public final void u(int i) {
        if (i == 127) {
            this.k.a((char) 9835);
        } else {
            this.k.a((char) (i & 255));
        }
    }

    public final void v(int i) {
        this.k.a((char) (i & 255));
    }

    public final void w(int i) {
        if (i == 32) {
            this.k.a(' ');
            return;
        }
        if (i == 33) {
            this.k.a((char) 160);
            return;
        }
        if (i == 37) {
            this.k.a((char) 8230);
            return;
        }
        if (i == 42) {
            this.k.a((char) 352);
            return;
        }
        if (i == 44) {
            this.k.a((char) 338);
            return;
        }
        if (i == 63) {
            this.k.a((char) 376);
            return;
        }
        if (i == 57) {
            this.k.a((char) 8482);
            return;
        }
        if (i == 58) {
            this.k.a((char) 353);
            return;
        }
        if (i == 60) {
            this.k.a((char) 339);
            return;
        }
        if (i == 61) {
            this.k.a((char) 8480);
            return;
        }
        switch (i) {
            case 48:
                this.k.a((char) 9608);
                break;
            case 49:
                this.k.a((char) 8216);
                break;
            case AdSize.PORTRAIT_AD_HEIGHT /* 50 */:
                this.k.a((char) 8217);
                break;
            case 51:
                this.k.a((char) 8220);
                break;
            case 52:
                this.k.a((char) 8221);
                break;
            case 53:
                this.k.a((char) 8226);
                break;
            default:
                switch (i) {
                    case 118:
                        this.k.a((char) 8539);
                        break;
                    case 119:
                        this.k.a((char) 8540);
                        break;
                    case 120:
                        this.k.a((char) 8541);
                        break;
                    case 121:
                        this.k.a((char) 8542);
                        break;
                    case 122:
                        this.k.a((char) 9474);
                        break;
                    case 123:
                        this.k.a((char) 9488);
                        break;
                    case 124:
                        this.k.a((char) 9492);
                        break;
                    case 125:
                        this.k.a((char) 9472);
                        break;
                    case 126:
                        this.k.a((char) 9496);
                        break;
                    case 127:
                        this.k.a((char) 9484);
                        break;
                }
                break;
        }
    }

    public final void x(int i) {
        if (i == 160) {
            this.k.a((char) 13252);
        } else {
            this.k.a('_');
        }
    }

    public final void y() {
        this.k.m(this.h.h(4), this.h.h(2), this.h.h(2), this.h.g(), this.h.g(), this.h.h(3), this.h.h(3));
    }

    public final void z() {
        int iH = a.h(this.h.h(2), this.h.h(2), this.h.h(2), this.h.h(2));
        int iH2 = a.h(this.h.h(2), this.h.h(2), this.h.h(2), this.h.h(2));
        this.h.o(2);
        this.k.n(iH, iH2, a.g(this.h.h(2), this.h.h(2), this.h.h(2)));
    }
}
