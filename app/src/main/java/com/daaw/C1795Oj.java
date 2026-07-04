package com.daaw;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.CharacterStyle;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.Oj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1795Oj extends AbstractC2129Rj {
    public static final int[] s = {11, 1, 3, 12, 14, 5, 7, 9};
    public static final int[] t = {0, 4, 8, 12, 16, 20, 24, 28};
    public static final int[] u = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};
    public static final int[] v = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632};
    public static final int[] w = {174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251};
    public static final int[] x = {193, RCHTTPStatusCodes.CREATED, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, RCHTTPStatusCodes.SUCCESS, 202, 203, 235, 206, 207, 239, 212, 217, 249, 219, 171, 187};
    public static final int[] y = {195, 227, 205, 204, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, 126, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};
    public final int h;
    public final int i;
    public List l;
    public List m;
    public int n;
    public int o;
    public boolean p;
    public byte q;
    public byte r;
    public final C2584Vs0 g = new C2584Vs0();
    public final ArrayList j = new ArrayList();
    public a k = new a(0, 4);

    /* JADX INFO: renamed from: com.daaw.Oj$a */
    public static class a {
        public final List a = new ArrayList();
        public final List b = new ArrayList();
        public final List c = new ArrayList();
        public final SpannableStringBuilder d = new SpannableStringBuilder();
        public int e;
        public int f;
        public int g;
        public int h;
        public int i;
        public int j;

        /* JADX INFO: renamed from: com.daaw.Oj$a$a, reason: collision with other inner class name */
        public static class C0104a {
            public final CharacterStyle a;
            public final int b;
            public final int c;

            public C0104a(CharacterStyle characterStyle, int i, int i2) {
                this.a = characterStyle;
                this.b = i;
                this.c = i2;
            }
        }

        public a(int i, int i2) {
            g(i);
            i(i2);
        }

        public void a(char c) {
            this.d.append(c);
        }

        public void b() {
            int length = this.d.length();
            if (length > 0) {
                this.d.delete(length - 1, length);
            }
        }

        public C1631Mu c() {
            float f;
            int i;
            int i2;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i3 = 0; i3 < this.c.size(); i3++) {
                spannableStringBuilder.append((CharSequence) this.c.get(i3));
                spannableStringBuilder.append('\n');
            }
            spannableStringBuilder.append((CharSequence) d());
            if (spannableStringBuilder.length() == 0) {
                return null;
            }
            int i4 = this.f + this.g;
            int length = (32 - i4) - spannableStringBuilder.length();
            int i5 = i4 - length;
            int i6 = 2;
            if (this.h == 2 && (Math.abs(i5) < 3 || length < 0)) {
                f = 0.5f;
                i6 = 1;
            } else if (this.h != 2 || i5 <= 0) {
                f = ((i4 / 32.0f) * 0.8f) + 0.1f;
                i6 = 0;
            } else {
                f = (((32 - length) / 32.0f) * 0.8f) + 0.1f;
            }
            if (this.h == 1 || (i = this.e) > 7) {
                i = this.e - 17;
                i2 = 2;
            } else {
                i2 = 0;
            }
            return new C1631Mu(spannableStringBuilder, Layout.Alignment.ALIGN_NORMAL, i, 1, i2, f, i6, Float.MIN_VALUE);
        }

        public SpannableString d() {
            int length = this.d.length();
            int i = 0;
            for (int i2 = 0; i2 < this.a.size(); i2++) {
                this.d.setSpan(this.a.get(i2), 0, length, 33);
            }
            while (i < this.b.size()) {
                C0104a c0104a = (C0104a) this.b.get(i);
                int size = this.b.size();
                int i3 = c0104a.c;
                this.d.setSpan(c0104a.a, c0104a.b, i < size - i3 ? ((C0104a) this.b.get(i3 + i)).b : length, 33);
                i++;
            }
            if (this.j != -1) {
                this.d.setSpan(new UnderlineSpan(), this.j, length, 33);
            }
            return new SpannableString(this.d);
        }

        public int e() {
            return this.e;
        }

        public boolean f() {
            return this.a.isEmpty() && this.b.isEmpty() && this.c.isEmpty() && this.d.length() == 0;
        }

        public void g(int i) {
            this.h = i;
            this.a.clear();
            this.b.clear();
            this.c.clear();
            this.d.clear();
            this.e = 15;
            this.f = 0;
            this.g = 0;
            this.j = -1;
        }

        public void h() {
            this.c.add(d());
            this.d.clear();
            this.a.clear();
            this.b.clear();
            this.j = -1;
            int iMin = Math.min(this.i, this.e);
            while (this.c.size() >= iMin) {
                this.c.remove(0);
            }
        }

        public void i(int i) {
            this.i = i;
        }

        public void j(int i) {
            this.f = i;
        }

        public void k(CharacterStyle characterStyle, int i) {
            this.b.add(new C0104a(characterStyle, this.d.length(), i));
        }

        public void l(CharacterStyle characterStyle) {
            this.a.add(characterStyle);
        }

        public void m(int i) {
            this.e = i;
        }

        public void n(int i) {
            this.g = i;
        }

        public void o(boolean z) {
            if (z) {
                this.j = this.d.length();
            } else if (this.j != -1) {
                this.d.setSpan(new UnderlineSpan(), this.j, this.d.length(), 33);
                this.j = -1;
            }
        }

        public String toString() {
            return this.d.toString();
        }
    }

    public C1795Oj(String str, int i) {
        this.h = "application/x-mp4-cea-608".equals(str) ? 2 : 3;
        if (i == 3 || i == 4) {
            this.i = 2;
        } else {
            this.i = 1;
        }
        C(0);
        B();
    }

    public static boolean A(byte b, byte b2) {
        return (b & 247) == 23 && b2 >= 33 && b2 <= 35;
    }

    public static char n(byte b) {
        return (char) v[(b & 127) - 32];
    }

    public static char p(byte b) {
        return (char) x[b & 31];
    }

    public static char q(byte b) {
        return (char) y[b & 31];
    }

    public static char r(byte b) {
        return (char) w[b & 15];
    }

    public static boolean w(byte b, byte b2) {
        return (b & 247) == 17 && (b2 & 240) == 32;
    }

    public static boolean x(byte b, byte b2) {
        return (b & 247) == 20 && (b2 & 240) == 32;
    }

    public static boolean y(byte b, byte b2) {
        return (b & 240) == 16 && (b2 & 192) == 64;
    }

    public static boolean z(byte b) {
        return (b & 240) == 16;
    }

    public final void B() {
        this.k.g(this.n);
        this.j.clear();
        this.j.add(this.k);
    }

    public final void C(int i) {
        int i2 = this.n;
        if (i2 == i) {
            return;
        }
        this.n = i;
        B();
        if (i2 == 3 || i == 1 || i == 0) {
            this.l = null;
        }
    }

    public final void D(int i) {
        this.o = i;
        this.k.i(i);
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
        C(0);
        D(4);
        B();
        this.p = false;
        this.q = (byte) 0;
        this.r = (byte) 0;
    }

    @Override // com.daaw.AbstractC2129Rj
    public void g(C7665qZ0 c7665qZ0) {
        int i;
        this.g.H(c7665qZ0.D.array(), c7665qZ0.D.limit());
        boolean z = false;
        boolean zS = false;
        while (true) {
            int iA = this.g.a();
            int i2 = this.h;
            if (iA < i2) {
                break;
            }
            byte bX = i2 == 2 ? (byte) -4 : (byte) this.g.x();
            byte bX2 = (byte) (this.g.x() & 127);
            byte bX3 = (byte) (this.g.x() & 127);
            if ((bX & 6) == 4 && ((i = this.i) != 1 || (bX & 1) == 0)) {
                if (i != 2 || (bX & 1) == 1) {
                    if (bX2 != 0 || bX3 != 0) {
                        if ((bX2 & 247) == 17 && (bX3 & 240) == 48) {
                            this.k.a(r(bX3));
                        } else if ((bX2 & 246) == 18 && (bX3 & 224) == 32) {
                            this.k.b();
                            if ((bX2 & 1) == 0) {
                                this.k.a(p(bX3));
                            } else {
                                this.k.a(q(bX3));
                            }
                        } else if ((bX2 & 224) == 0) {
                            zS = s(bX2, bX3);
                        } else {
                            this.k.a(n(bX2));
                            if ((bX3 & 224) != 0) {
                                this.k.a(n(bX3));
                            }
                        }
                        z = true;
                    }
                }
            }
        }
        if (z) {
            if (!zS) {
                this.p = false;
            }
            int i3 = this.n;
            if (i3 == 1 || i3 == 3) {
                this.l = o();
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

    public final List o() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.j.size(); i++) {
            C1631Mu c1631MuC = ((a) this.j.get(i)).c();
            if (c1631MuC != null) {
                arrayList.add(c1631MuC);
            }
        }
        return arrayList;
    }

    public final boolean s(byte b, byte b2) {
        boolean z = z(b);
        if (z) {
            if (this.p && this.q == b && this.r == b2) {
                this.p = false;
                return true;
            }
            this.p = true;
            this.q = b;
            this.r = b2;
        }
        if (w(b, b2)) {
            t(b2);
            return z;
        }
        if (y(b, b2)) {
            v(b, b2);
            return z;
        }
        if (A(b, b2)) {
            this.k.n(b2 - 32);
            return z;
        }
        if (x(b, b2)) {
            u(b2);
        }
        return z;
    }

    public final void t(byte b) {
        this.k.a(' ');
        this.k.o((b & 1) == 1);
        int i = (b >> 1) & 15;
        if (i != 7) {
            this.k.k(new ForegroundColorSpan(u[i]), 1);
        } else {
            this.k.k(new StyleSpan(2), 2);
            this.k.k(new ForegroundColorSpan(-1), 1);
        }
    }

    public final void u(byte b) {
        if (b == 32) {
            C(2);
            return;
        }
        if (b == 41) {
            C(3);
            return;
        }
        switch (b) {
            case 37:
                C(1);
                D(2);
                break;
            case 38:
                C(1);
                D(3);
                break;
            case 39:
                C(1);
                D(4);
                break;
            default:
                int i = this.n;
                if (i != 0) {
                    if (b != 33) {
                        switch (b) {
                            case 44:
                                this.l = null;
                                if (i == 1 || i == 3) {
                                    B();
                                }
                                break;
                            case 45:
                                if (i == 1 && !this.k.f()) {
                                    this.k.h();
                                    break;
                                }
                                break;
                            case 46:
                                B();
                                break;
                            case 47:
                                this.l = o();
                                B();
                                break;
                        }
                    } else {
                        this.k.b();
                        break;
                    }
                }
                break;
        }
    }

    public final void v(byte b, byte b2) {
        int i = s[b & 7];
        if ((b2 & 32) != 0) {
            i++;
        }
        if (i != this.k.e()) {
            if (this.n != 1 && !this.k.f()) {
                a aVar = new a(this.n, this.o);
                this.k = aVar;
                this.j.add(aVar);
            }
            this.k.m(i);
        }
        if ((b2 & 1) == 1) {
            this.k.l(new UnderlineSpan());
        }
        int i2 = b2 >> 1;
        int i3 = i2 & 15;
        if (i3 > 7) {
            this.k.j(t[i2 & 7]);
        } else if (i3 != 7) {
            this.k.l(new ForegroundColorSpan(u[i3]));
        } else {
            this.k.l(new StyleSpan(2));
            this.k.l(new ForegroundColorSpan(-1));
        }
    }

    @Override // com.daaw.AbstractC2129Rj, com.daaw.InterfaceC0808Ew
    public void a() {
    }
}
