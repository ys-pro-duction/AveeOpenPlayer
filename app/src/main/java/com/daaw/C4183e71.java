package com.daaw;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.nio.charset.Charset;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.e71, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4183e71 extends US0 {
    public static final int v = AbstractC6280lb1.v("styl");
    public static final int w = AbstractC6280lb1.v("tbox");
    public final C2584Vs0 o;
    public boolean p;
    public int q;
    public int r;
    public String s;
    public float t;
    public int u;

    public C4183e71(List list) {
        super("Tx3gDecoder");
        this.o = new C2584Vs0();
        H(list);
    }

    public static void D(boolean z) throws C7107oZ0 {
        if (!z) {
            throw new C7107oZ0("Unexpected subtitle format.");
        }
    }

    public static void E(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i >>> 8) | ((i & 255) << 24)), i3, i4, i5 | 33);
        }
    }

    public static void F(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            int i6 = i5 | 33;
            boolean z = (i & 1) != 0;
            boolean z2 = (i & 2) != 0;
            if (z) {
                if (z2) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i3, i4, i6);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i3, i4, i6);
                }
            } else if (z2) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i3, i4, i6);
            }
            boolean z3 = (i & 4) != 0;
            if (z3) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i3, i4, i6);
            }
            if (z3 || z || z2) {
                return;
            }
            spannableStringBuilder.setSpan(new StyleSpan(0), i3, i4, i6);
        }
    }

    public static void G(SpannableStringBuilder spannableStringBuilder, String str, String str2, int i, int i2, int i3) {
        if (str != str2) {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), i, i2, i3 | 33);
        }
    }

    public static String I(C2584Vs0 c2584Vs0) throws C7107oZ0 {
        char cE;
        D(c2584Vs0.a() >= 2);
        int iD = c2584Vs0.D();
        return iD == 0 ? "" : (c2584Vs0.a() < 2 || !((cE = c2584Vs0.e()) == 65279 || cE == 65534)) ? c2584Vs0.v(iD, Charset.forName("UTF-8")) : c2584Vs0.v(iD, Charset.forName("UTF-16"));
    }

    public final void C(C2584Vs0 c2584Vs0, SpannableStringBuilder spannableStringBuilder) throws C7107oZ0 {
        D(c2584Vs0.a() >= 12);
        int iD = c2584Vs0.D();
        int iD2 = c2584Vs0.D();
        c2584Vs0.K(2);
        int iX = c2584Vs0.x();
        c2584Vs0.K(1);
        int i = c2584Vs0.i();
        F(spannableStringBuilder, iX, this.q, iD, iD2, 0);
        E(spannableStringBuilder, i, this.r, iD, iD2, 0);
    }

    public final void H(List list) {
        if (list == null || list.size() != 1 || (((byte[]) list.get(0)).length != 48 && ((byte[]) list.get(0)).length != 53)) {
            this.q = 0;
            this.r = -1;
            this.s = "sans-serif";
            this.p = false;
            this.t = 0.85f;
            return;
        }
        byte[] bArr = (byte[]) list.get(0);
        this.q = bArr[24];
        this.r = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
        this.s = "Serif".equals(AbstractC6280lb1.q(bArr, 43, bArr.length - 43)) ? "serif" : "sans-serif";
        int i = bArr[25] * 20;
        this.u = i;
        boolean z = (bArr[0] & 32) != 0;
        this.p = z;
        if (!z) {
            this.t = 0.85f;
            return;
        }
        float f = ((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i;
        this.t = f;
        this.t = AbstractC6280lb1.k(f, 0.0f, 0.95f);
    }

    @Override // com.daaw.US0
    public InterfaceC6549mZ0 z(byte[] bArr, int i, boolean z) throws C7107oZ0 {
        this.o.H(bArr, i);
        String strI = I(this.o);
        if (strI.isEmpty()) {
            return C4462f71.C;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strI);
        F(spannableStringBuilder, this.q, 0, 0, spannableStringBuilder.length(), 16711680);
        E(spannableStringBuilder, this.r, -1, 0, spannableStringBuilder.length(), 16711680);
        G(spannableStringBuilder, this.s, "sans-serif", 0, spannableStringBuilder.length(), 16711680);
        float fK = this.t;
        while (this.o.a() >= 8) {
            int iC = this.o.c();
            int i2 = this.o.i();
            int i3 = this.o.i();
            if (i3 == v) {
                D(this.o.a() >= 2);
                int iD = this.o.D();
                for (int i4 = 0; i4 < iD; i4++) {
                    C(this.o, spannableStringBuilder);
                }
            } else if (i3 == w && this.p) {
                D(this.o.a() >= 2);
                fK = AbstractC6280lb1.k(this.o.D() / this.u, 0.0f, 0.95f);
            }
            this.o.J(iC + i2);
        }
        return new C4462f71(new C1631Mu(spannableStringBuilder, null, fK, 0, 0, Float.MIN_VALUE, Integer.MIN_VALUE, Float.MIN_VALUE));
    }
}
