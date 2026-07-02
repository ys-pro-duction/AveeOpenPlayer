package com.daaw;

import com.google.android.gms.ads.AdRequest;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: loaded from: classes.dex */
public final class XU0 {
    public final Y11 a;
    public final long b;
    public final SO c;
    public final PO d;
    public final QO e;
    public final AbstractC7898rO f;
    public final String g;
    public final long h;
    public final C1671Ne i;
    public final C4437f21 j;
    public final C4884gd0 k;
    public final long l;
    public final P11 m;
    public final C4265eR0 n;

    public /* synthetic */ XU0(long j, long j2, SO so, PO po, QO qo, AbstractC7898rO abstractC7898rO, String str, long j3, C1671Ne c1671Ne, C4437f21 c4437f21, C4884gd0 c4884gd0, long j4, P11 p11, C4265eR0 c4265eR0, AbstractC2911Yw abstractC2911Yw) {
        this(j, j2, so, po, qo, abstractC7898rO, str, j3, c1671Ne, c4437f21, c4884gd0, j4, p11, c4265eR0);
    }

    public final XU0 a(long j, long j2, SO so, PO po, QO qo, AbstractC7898rO abstractC7898rO, String str, long j3, C1671Ne c1671Ne, C4437f21 c4437f21, C4884gd0 c4884gd0, long j4, P11 p11, C4265eR0 c4265eR0) {
        return new XU0(C2559Vm.o(j, f()) ? this.a : Y11.a.a(j), j2, so, po, qo, abstractC7898rO, str, j3, c1671Ne, c4437f21, c4884gd0, j4, p11, c4265eR0, (AbstractC4973gv0) null, (AbstractC2911Yw) null);
    }

    public final long c() {
        return this.l;
    }

    public final C1671Ne d() {
        return this.i;
    }

    public final AbstractC2117Rg e() {
        return this.a.d();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof XU0)) {
            return false;
        }
        XU0 xu0 = (XU0) obj;
        return t(xu0) && u(xu0);
    }

    public final long f() {
        return this.a.a();
    }

    public final AbstractC7898rO g() {
        return this.f;
    }

    public final String h() {
        return this.g;
    }

    public int hashCode() {
        int iU = C2559Vm.u(f()) * 31;
        AbstractC2117Rg abstractC2117RgE = e();
        int iHashCode = (((iU + (abstractC2117RgE != null ? abstractC2117RgE.hashCode() : 0)) * 31) + S21.i(this.b)) * 31;
        SO so = this.c;
        int iHashCode2 = (iHashCode + (so != null ? so.hashCode() : 0)) * 31;
        PO po = this.d;
        int iG = (iHashCode2 + (po != null ? PO.g(po.i()) : 0)) * 31;
        QO qo = this.e;
        int iF = (iG + (qo != null ? QO.f(qo.j()) : 0)) * 31;
        AbstractC7898rO abstractC7898rO = this.f;
        int iHashCode3 = (iF + (abstractC7898rO != null ? abstractC7898rO.hashCode() : 0)) * 31;
        String str = this.g;
        int iHashCode4 = (((iHashCode3 + (str != null ? str.hashCode() : 0)) * 31) + S21.i(this.h)) * 31;
        C1671Ne c1671Ne = this.i;
        int iF2 = (iHashCode4 + (c1671Ne != null ? C1671Ne.f(c1671Ne.h()) : 0)) * 31;
        C4437f21 c4437f21 = this.j;
        int iHashCode5 = (iF2 + (c4437f21 != null ? c4437f21.hashCode() : 0)) * 31;
        C4884gd0 c4884gd0 = this.k;
        int iHashCode6 = (((iHashCode5 + (c4884gd0 != null ? c4884gd0.hashCode() : 0)) * 31) + C2559Vm.u(this.l)) * 31;
        P11 p11 = this.m;
        int iHashCode7 = (iHashCode6 + (p11 != null ? p11.hashCode() : 0)) * 31;
        C4265eR0 c4265eR0 = this.n;
        return (iHashCode7 + (c4265eR0 != null ? c4265eR0.hashCode() : 0)) * 31;
    }

    public final long i() {
        return this.b;
    }

    public final PO j() {
        return this.d;
    }

    public final QO k() {
        return this.e;
    }

    public final SO l() {
        return this.c;
    }

    public final long m() {
        return this.h;
    }

    public final C4884gd0 n() {
        return this.k;
    }

    public final AbstractC4973gv0 o() {
        return null;
    }

    public final C4265eR0 p() {
        return this.n;
    }

    public final P11 q() {
        return this.m;
    }

    public final Y11 r() {
        return this.a;
    }

    public final C4437f21 s() {
        return this.j;
    }

    public final boolean t(XU0 xu0) {
        G10.g(xu0, "other");
        if (this == xu0) {
            return true;
        }
        return S21.e(this.b, xu0.b) && G10.c(this.c, xu0.c) && G10.c(this.d, xu0.d) && G10.c(this.e, xu0.e) && G10.c(this.f, xu0.f) && G10.c(this.g, xu0.g) && S21.e(this.h, xu0.h) && G10.c(this.i, xu0.i) && G10.c(this.j, xu0.j) && G10.c(this.k, xu0.k) && C2559Vm.o(this.l, xu0.l) && G10.c(null, null);
    }

    public String toString() {
        return "SpanStyle(color=" + ((Object) C2559Vm.v(f())) + ", brush=" + e() + ", fontSize=" + ((Object) S21.j(this.b)) + ", fontWeight=" + this.c + ", fontStyle=" + this.d + ", fontSynthesis=" + this.e + ", fontFamily=" + this.f + ", fontFeatureSettings=" + this.g + ", letterSpacing=" + ((Object) S21.j(this.h)) + ", baselineShift=" + this.i + ", textGeometricTransform=" + this.j + ", localeList=" + this.k + ", background=" + ((Object) C2559Vm.v(this.l)) + ", textDecoration=" + this.m + ", shadow=" + this.n + ", platformStyle=" + ((Object) null) + ')';
    }

    public final boolean u(XU0 xu0) {
        return G10.c(this.a, xu0.a) && G10.c(this.m, xu0.m) && G10.c(this.n, xu0.n);
    }

    public final XU0 v(XU0 xu0) {
        if (xu0 == null) {
            return this;
        }
        Y11 y11B = this.a.b(xu0.a);
        AbstractC7898rO abstractC7898rO = xu0.f;
        if (abstractC7898rO == null) {
            abstractC7898rO = this.f;
        }
        AbstractC7898rO abstractC7898rO2 = abstractC7898rO;
        long j = !T21.e(xu0.b) ? xu0.b : this.b;
        SO so = xu0.c;
        if (so == null) {
            so = this.c;
        }
        SO so2 = so;
        PO po = xu0.d;
        if (po == null) {
            po = this.d;
        }
        PO po2 = po;
        QO qo = xu0.e;
        if (qo == null) {
            qo = this.e;
        }
        QO qo2 = qo;
        String str = xu0.g;
        if (str == null) {
            str = this.g;
        }
        String str2 = str;
        long j2 = !T21.e(xu0.h) ? xu0.h : this.h;
        C1671Ne c1671Ne = xu0.i;
        if (c1671Ne == null) {
            c1671Ne = this.i;
        }
        C1671Ne c1671Ne2 = c1671Ne;
        C4437f21 c4437f21 = xu0.j;
        if (c4437f21 == null) {
            c4437f21 = this.j;
        }
        C4437f21 c4437f212 = c4437f21;
        C4884gd0 c4884gd0 = xu0.k;
        if (c4884gd0 == null) {
            c4884gd0 = this.k;
        }
        C4884gd0 c4884gd02 = c4884gd0;
        long j3 = xu0.l;
        if (j3 == C2559Vm.b.g()) {
            j3 = this.l;
        }
        long j4 = j3;
        P11 p11 = xu0.m;
        if (p11 == null) {
            p11 = this.m;
        }
        P11 p112 = p11;
        C4265eR0 c4265eR0 = xu0.n;
        if (c4265eR0 == null) {
            c4265eR0 = this.n;
        }
        w(null);
        return new XU0(y11B, j, so2, po2, qo2, abstractC7898rO2, str2, j2, c1671Ne2, c4437f212, c4884gd02, j4, p112, c4265eR0, (AbstractC4973gv0) null, (AbstractC2911Yw) null);
    }

    public /* synthetic */ XU0(long j, long j2, SO so, PO po, QO qo, AbstractC7898rO abstractC7898rO, String str, long j3, C1671Ne c1671Ne, C4437f21 c4437f21, C4884gd0 c4884gd0, long j4, P11 p11, C4265eR0 c4265eR0, AbstractC4973gv0 abstractC4973gv0, AbstractC2911Yw abstractC2911Yw) {
        this(j, j2, so, po, qo, abstractC7898rO, str, j3, c1671Ne, c4437f21, c4884gd0, j4, p11, c4265eR0, abstractC4973gv0);
    }

    public /* synthetic */ XU0(Y11 y11, long j, SO so, PO po, QO qo, AbstractC7898rO abstractC7898rO, String str, long j2, C1671Ne c1671Ne, C4437f21 c4437f21, C4884gd0 c4884gd0, long j3, P11 p11, C4265eR0 c4265eR0, AbstractC4973gv0 abstractC4973gv0, AbstractC2911Yw abstractC2911Yw) {
        this(y11, j, so, po, qo, abstractC7898rO, str, j2, c1671Ne, c4437f21, c4884gd0, j3, p11, c4265eR0, abstractC4973gv0);
    }

    public XU0(Y11 y11, long j, SO so, PO po, QO qo, AbstractC7898rO abstractC7898rO, String str, long j2, C1671Ne c1671Ne, C4437f21 c4437f21, C4884gd0 c4884gd0, long j3, P11 p11, C4265eR0 c4265eR0, AbstractC4973gv0 abstractC4973gv0) {
        this.a = y11;
        this.b = j;
        this.c = so;
        this.d = po;
        this.e = qo;
        this.f = abstractC7898rO;
        this.g = str;
        this.h = j2;
        this.i = c1671Ne;
        this.j = c4437f21;
        this.k = c4884gd0;
        this.l = j3;
        this.m = p11;
        this.n = c4265eR0;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ XU0(long j, long j2, SO so, PO po, QO qo, AbstractC7898rO abstractC7898rO, String str, long j3, C1671Ne c1671Ne, C4437f21 c4437f21, C4884gd0 c4884gd0, long j4, P11 p11, C4265eR0 c4265eR0, int i, AbstractC2911Yw abstractC2911Yw) {
        long jG = (i & 1) != 0 ? C2559Vm.b.g() : j;
        long jA = (i & 2) != 0 ? S21.b.a() : j2;
        SO so2 = (i & 4) != 0 ? null : so;
        PO po2 = (i & 8) != 0 ? null : po;
        QO qo2 = (i & 16) != 0 ? null : qo;
        AbstractC7898rO abstractC7898rO2 = (i & 32) != 0 ? null : abstractC7898rO;
        String str2 = (i & 64) != 0 ? null : str;
        long jA2 = (i & 128) != 0 ? S21.b.a() : j3;
        C1671Ne c1671Ne2 = (i & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? null : c1671Ne;
        C4437f21 c4437f212 = (i & AdRequest.MAX_CONTENT_URL_LENGTH) != 0 ? null : c4437f21;
        C4884gd0 c4884gd02 = (i & 1024) != 0 ? null : c4884gd0;
        long jG2 = (i & 2048) != 0 ? C2559Vm.b.g() : j4;
        PO po3 = po2;
        QO qo3 = qo2;
        AbstractC7898rO abstractC7898rO3 = abstractC7898rO2;
        String str3 = str2;
        long j5 = jA2;
        C1671Ne c1671Ne3 = c1671Ne2;
        C4437f21 c4437f213 = c4437f212;
        C4884gd0 c4884gd03 = c4884gd02;
        long j6 = jG2;
        this(jG, jA, so2, po3, qo3, abstractC7898rO3, str3, j5, c1671Ne3, c4437f213, c4884gd03, j6, (i & 4096) != 0 ? null : p11, (i & 8192) != 0 ? null : c4265eR0, (AbstractC2911Yw) null);
    }

    public XU0(long j, long j2, SO so, PO po, QO qo, AbstractC7898rO abstractC7898rO, String str, long j3, C1671Ne c1671Ne, C4437f21 c4437f21, C4884gd0 c4884gd0, long j4, P11 p11, C4265eR0 c4265eR0) {
        this(Y11.a.a(j), j2, so, po, qo, abstractC7898rO, str, j3, c1671Ne, c4437f21, c4884gd0, j4, p11, c4265eR0, (AbstractC4973gv0) null, (AbstractC2911Yw) null);
    }

    public final AbstractC4973gv0 w(AbstractC4973gv0 abstractC4973gv0) {
        return abstractC4973gv0;
    }

    public XU0(long j, long j2, SO so, PO po, QO qo, AbstractC7898rO abstractC7898rO, String str, long j3, C1671Ne c1671Ne, C4437f21 c4437f21, C4884gd0 c4884gd0, long j4, P11 p11, C4265eR0 c4265eR0, AbstractC4973gv0 abstractC4973gv0) {
        this(Y11.a.a(j), j2, so, po, qo, abstractC7898rO, str, j3, c1671Ne, c4437f21, c4884gd0, j4, p11, c4265eR0, abstractC4973gv0, (AbstractC2911Yw) null);
    }
}
