package com.daaw;

import android.content.Context;
import java.util.Locale;

/* JADX INFO: renamed from: com.daaw.Lh0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1477Lh0 {
    public String a;
    public C1458Lc1 b = new C1458Lc1(0.0f, 0.0f);
    public C1458Lc1 c = new C1458Lc1(0.0f, 0.0f);

    public C1477Lh0(C1477Lh0 c1477Lh0) {
        this.a = c1477Lh0.a;
        C1458Lc1 c1458Lc1 = this.b;
        C1458Lc1 c1458Lc12 = c1477Lh0.b;
        c1458Lc1.a = c1458Lc12.a;
        c1458Lc1.b = c1458Lc12.b;
        c();
    }

    public static final C1477Lh0 a() {
        return new C1477Lh0("Nothing", 0.5f, 0.5f);
    }

    public static C1477Lh0 b(String str, C1477Lh0 c1477Lh0) {
        if (str == null) {
            if (c1477Lh0 != null) {
                return c1477Lh0.clone();
            }
            return null;
        }
        try {
            int iIndexOf = str.indexOf(" ");
            int i = iIndexOf + 1;
            int iIndexOf2 = str.indexOf(" ", i);
            if (iIndexOf >= 0 && iIndexOf2 >= 0) {
                return new C1477Lh0(str.substring(0, iIndexOf), Float.parseFloat(str.substring(i, iIndexOf2)), Float.parseFloat(str.substring(iIndexOf2 + 1)));
            }
            if (c1477Lh0 != null) {
                return c1477Lh0.clone();
            }
            return null;
        } catch (NumberFormatException unused) {
            if (c1477Lh0 != null) {
                return c1477Lh0.clone();
            }
            return null;
        }
    }

    public final void c() {
        String str = this.a;
        if (str == null || str.length() < 1) {
            this.a = "";
        }
    }

    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public C1477Lh0 clone() {
        String str = this.a;
        C1458Lc1 c1458Lc1 = this.b;
        return new C1477Lh0(str, c1458Lc1.a, c1458Lc1.b);
    }

    public String e() {
        return this.a;
    }

    public float f() {
        return this.b.a;
    }

    public C1458Lc1 g() {
        return this.b;
    }

    public String h(Context context) {
        int iA = AbstractC0853Fh0.a(this.a);
        return (iA <= 0 || context == null) ? this.a : context.getString(iA);
    }

    public float i(C6036kk0 c6036kk0) {
        C1458Lc1 c1458Lc1N = c6036kk0.n(this.a, this.b, this.c);
        this.c = c1458Lc1N;
        return c1458Lc1N.a;
    }

    public float j(C6036kk0 c6036kk0, float f) {
        C1458Lc1 c1458Lc1 = this.c;
        c1458Lc1.a = f;
        c1458Lc1.b = f;
        C1458Lc1 c1458Lc1N = c6036kk0.n(this.a, this.b, c1458Lc1);
        this.c = c1458Lc1N;
        return c1458Lc1N.a;
    }

    public String k(C6036kk0 c6036kk0) {
        return c6036kk0.m(this.a);
    }

    public C1458Lc1 l(C6036kk0 c6036kk0) {
        C1458Lc1 c1458Lc1N = c6036kk0.n(this.a, this.b, this.c);
        this.c = c1458Lc1N;
        return c1458Lc1N;
    }

    public void m(C2591Vu c2591Vu, String str, float f) {
        n(c2591Vu, str, f, f);
    }

    public void n(C2591Vu c2591Vu, String str, float f, float f2) {
        if (c2591Vu == null) {
            return;
        }
        this.a = c2591Vu.h("measureWhat").D(str);
        this.b.a = c2591Vu.p("A", f);
        this.b.b = c2591Vu.p("B", f2);
        c();
    }

    public void o(C2591Vu c2591Vu) {
        c2591Vu.G("measureWhat", this.a, "misc", AbstractC0853Fh0.c);
        if (this.a.equals("Nothing")) {
            return;
        }
        c2591Vu.R("A", this.b.a, "misc", 0.0f, 1.0f, AbstractC0853Fh0.b(this.a));
        c2591Vu.R("B", this.b.b, "misc", 0.0f, 1.0f, AbstractC0853Fh0.c(this.a));
    }

    public void p(C2591Vu c2591Vu) {
        c2591Vu.G("measureWhat", this.a, "misc", new String[]{"Nothing", "BeatCamShakeMore", "BeatCamShakeLess", "BeatRandomShake", "ConstantShakeMore", "ConstantShake", "TrackPosition"});
        if (this.a.equals("Nothing")) {
            return;
        }
        c2591Vu.R("A", this.b.a, "misc", 0.0f, 2.0f, AbstractC0853Fh0.b(this.a));
        c2591Vu.R("B", this.b.b, "misc", 0.0f, 2.0f, AbstractC0853Fh0.c(this.a));
    }

    public void q(C2591Vu c2591Vu) {
        c2591Vu.G("measureWhat", this.a, "misc", AbstractC0853Fh0.c);
        if (this.a.equals("Nothing")) {
            return;
        }
        c2591Vu.R("A", this.b.a, "misc", -1.0f, 1.0f, AbstractC0853Fh0.b(this.a));
        c2591Vu.R("B", this.b.b, "misc", -1.0f, 1.0f, AbstractC0853Fh0.c(this.a));
    }

    public void r(C2591Vu c2591Vu) {
        c2591Vu.G("measureWhat", this.a, "misc", AbstractC0853Fh0.c);
        if (this.a.equals("Nothing")) {
            return;
        }
        c2591Vu.R("A", this.b.a, "misc", 0.0f, 2.0f, AbstractC0853Fh0.b(this.a));
        c2591Vu.R("B", this.b.b, "misc", 0.0f, 2.0f, AbstractC0853Fh0.c(this.a));
    }

    public void s(StringBuilder sb, boolean z, Context context) {
        if (!"Constant".equals(this.a) && !"Nothing".equals(this.a)) {
            sb.append(h(context));
            sb.append("(");
            Locale locale = Locale.US;
            sb.append(String.format(locale, "%.3f", Float.valueOf(this.b.a)));
            sb.append(" ");
            sb.append(String.format(locale, "%.3f", Float.valueOf(this.b.b)));
            sb.append(")");
            return;
        }
        if (z) {
            Locale locale2 = Locale.US;
            sb.append(String.format(locale2, "%.3f", Float.valueOf(this.b.a)));
            sb.append(" ");
            sb.append(String.format(locale2, "%.3f", Float.valueOf(this.b.b)));
            return;
        }
        sb.append("(");
        Locale locale3 = Locale.US;
        sb.append(String.format(locale3, "%.3f", Float.valueOf(this.b.a)));
        sb.append(" ");
        sb.append(String.format(locale3, "%.3f", Float.valueOf(this.b.b)));
        sb.append(")");
    }

    public void t(StringBuilder sb, boolean z, Context context) {
        boolean zD = AbstractC0853Fh0.d(this.a);
        if (!"Constant".equals(this.a) && !"Nothing".equals(this.a)) {
            sb.append(h(context));
            sb.append("(");
            Locale locale = Locale.US;
            sb.append(String.format(locale, "%.3f", Float.valueOf(this.b.a)));
            if (zD) {
                sb.append(" ");
                sb.append(String.format(locale, "%.3f", Float.valueOf(this.b.b)));
            }
            sb.append(")");
            return;
        }
        if (z) {
            Locale locale2 = Locale.US;
            sb.append(String.format(locale2, "%.3f", Float.valueOf(this.b.a)));
            if (zD) {
                sb.append(" ");
                sb.append(String.format(locale2, "%.3f", Float.valueOf(this.b.b)));
                return;
            }
            return;
        }
        sb.append("(");
        Locale locale3 = Locale.US;
        sb.append(String.format(locale3, "%.3f", Float.valueOf(this.b.a)));
        if (zD) {
            sb.append(" ");
            sb.append(String.format(locale3, "%.3f", Float.valueOf(this.b.b)));
        }
        sb.append(")");
    }

    public String toString() {
        return String.format(Locale.US, "%s %f %f", this.a, Float.valueOf(this.b.a), Float.valueOf(this.b.b));
    }

    public void u(StringBuilder sb) {
        sb.append(this.a);
        sb.append(" ");
        sb.append(this.b.a);
        sb.append(" ");
        sb.append(this.b.b);
    }

    public C1477Lh0(String str, float f) {
        this.a = str;
        C1458Lc1 c1458Lc1 = this.b;
        c1458Lc1.a = f;
        c1458Lc1.b = f;
        c();
    }

    public C1477Lh0(String str, C1458Lc1 c1458Lc1) {
        this.a = str;
        C1458Lc1 c1458Lc12 = this.b;
        c1458Lc12.a = c1458Lc1.a;
        c1458Lc12.b = c1458Lc1.b;
        c();
    }

    public C1477Lh0(String str, float f, float f2) {
        this.a = str;
        C1458Lc1 c1458Lc1 = this.b;
        c1458Lc1.a = f;
        c1458Lc1.b = f2;
        c();
    }
}
