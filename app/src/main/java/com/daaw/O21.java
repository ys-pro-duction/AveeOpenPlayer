package com.daaw;

import com.google.android.gms.ads.AdRequest;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: loaded from: classes.dex */
public final class O21 {
    public static final a d = new a(null);
    public static final O21 e = new O21(0, 0, null, null, null, null, null, 0, null, null, null, 0, null, null, null, null, 0, null, 262143, null);
    public final XU0 a;
    public final C1417Ks0 b;
    public final AbstractC5529iv0 c;

    public static final class a {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public final O21 a() {
            return O21.e;
        }

        public a() {
        }
    }

    public /* synthetic */ O21(long j, long j2, SO so, PO po, QO qo, AbstractC7898rO abstractC7898rO, String str, long j3, C1671Ne c1671Ne, C4437f21 c4437f21, C4884gd0 c4884gd0, long j4, P11 p11, C4265eR0 c4265eR0, J11 j11, T11 t11, long j5, C4726g21 c4726g21, AbstractC2911Yw abstractC2911Yw) {
        this(j, j2, so, po, qo, abstractC7898rO, str, j3, c1671Ne, c4437f21, c4884gd0, j4, p11, c4265eR0, j11, t11, j5, c4726g21);
    }

    public static /* synthetic */ O21 c(O21 o21, long j, long j2, SO so, PO po, QO qo, AbstractC7898rO abstractC7898rO, String str, long j3, C1671Ne c1671Ne, C4437f21 c4437f21, C4884gd0 c4884gd0, long j4, P11 p11, C4265eR0 c4265eR0, J11 j11, T11 t11, long j5, C4726g21 c4726g21, int i, Object obj) {
        long jF = (i & 1) != 0 ? o21.a.f() : j;
        return o21.b(jF, (i & 2) != 0 ? o21.a.i() : j2, (i & 4) != 0 ? o21.a.l() : so, (i & 8) != 0 ? o21.a.j() : po, (i & 16) != 0 ? o21.a.k() : qo, (i & 32) != 0 ? o21.a.g() : abstractC7898rO, (i & 64) != 0 ? o21.a.h() : str, (i & 128) != 0 ? o21.a.m() : j3, (i & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? o21.a.d() : c1671Ne, (i & AdRequest.MAX_CONTENT_URL_LENGTH) != 0 ? o21.a.s() : c4437f21, (i & 1024) != 0 ? o21.a.n() : c4884gd0, (i & 2048) != 0 ? o21.a.c() : j4, (i & 4096) != 0 ? o21.a.q() : p11, (i & 8192) != 0 ? o21.a.p() : c4265eR0, (i & 16384) != 0 ? o21.b.f() : j11, (i & 32768) != 0 ? o21.b.g() : t11, (i & 65536) != 0 ? o21.b.c() : j5, (i & 131072) != 0 ? o21.b.h() : c4726g21);
    }

    public final boolean A(O21 o21) {
        G10.g(o21, "other");
        if (this != o21) {
            return G10.c(this.b, o21.b) && this.a.t(o21.a);
        }
        return true;
    }

    public final O21 B(C1417Ks0 c1417Ks0) {
        G10.g(c1417Ks0, "other");
        return new O21(E(), D().i(c1417Ks0));
    }

    public final O21 C(O21 o21) {
        return (o21 == null || G10.c(o21, e)) ? this : new O21(E().v(o21.E()), D().i(o21.D()));
    }

    public final C1417Ks0 D() {
        return this.b;
    }

    public final XU0 E() {
        return this.a;
    }

    public final O21 b(long j, long j2, SO so, PO po, QO qo, AbstractC7898rO abstractC7898rO, String str, long j3, C1671Ne c1671Ne, C4437f21 c4437f21, C4884gd0 c4884gd0, long j4, P11 p11, C4265eR0 c4265eR0, J11 j11, T11 t11, long j5, C4726g21 c4726g21) {
        Y11 y11R = C2559Vm.o(j, this.a.f()) ? this.a.r() : Y11.a.a(j);
        this.a.o();
        XU0 xu0 = new XU0(y11R, j2, so, po, qo, abstractC7898rO, str, j3, c1671Ne, c4437f21, c4884gd0, j4, p11, c4265eR0, (AbstractC4973gv0) null, (AbstractC2911Yw) null);
        this.b.e();
        return new O21(xu0, new C1417Ks0(j11, t11, j5, c4726g21, null, p(), null), this.c);
    }

    public final long d() {
        return this.a.c();
    }

    public final C1671Ne e() {
        return this.a.d();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof O21)) {
            return false;
        }
        O21 o21 = (O21) obj;
        return G10.c(this.a, o21.a) && G10.c(this.b, o21.b) && G10.c(this.c, o21.c);
    }

    public final AbstractC2117Rg f() {
        return this.a.e();
    }

    public final long g() {
        return this.a.f();
    }

    public final AbstractC7898rO h() {
        return this.a.g();
    }

    public int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + 0;
    }

    public final String i() {
        return this.a.h();
    }

    public final long j() {
        return this.a.i();
    }

    public final PO k() {
        return this.a.j();
    }

    public final QO l() {
        return this.a.k();
    }

    public final SO m() {
        return this.a.l();
    }

    public final long n() {
        return this.a.m();
    }

    public final long o() {
        return this.b.c();
    }

    public final C3197ac0 p() {
        return this.b.d();
    }

    public final C4884gd0 q() {
        return this.a.n();
    }

    public final C1417Ks0 r() {
        return this.b;
    }

    public final AbstractC5529iv0 s() {
        return this.c;
    }

    public final C4265eR0 t() {
        return this.a.p();
    }

    public String toString() {
        return "TextStyle(color=" + ((Object) C2559Vm.v(g())) + ", brush=" + f() + ", fontSize=" + ((Object) S21.j(j())) + ", fontWeight=" + m() + ", fontStyle=" + k() + ", fontSynthesis=" + l() + ", fontFamily=" + h() + ", fontFeatureSettings=" + i() + ", letterSpacing=" + ((Object) S21.j(n())) + ", baselineShift=" + e() + ", textGeometricTransform=" + y() + ", localeList=" + q() + ", background=" + ((Object) C2559Vm.v(d())) + ", textDecoration=" + w() + ", shadow=" + t() + ", textAlign=" + v() + ", textDirection=" + x() + ", lineHeight=" + ((Object) S21.j(o())) + ", textIndent=" + z() + ", platformStyle=" + this.c + "lineHeightStyle=" + p() + ')';
    }

    public final XU0 u() {
        return this.a;
    }

    public final J11 v() {
        return this.b.f();
    }

    public final P11 w() {
        return this.a.q();
    }

    public final T11 x() {
        return this.b.g();
    }

    public final C4437f21 y() {
        return this.a.s();
    }

    public final C4726g21 z() {
        return this.b.h();
    }

    public O21(XU0 xu0, C1417Ks0 c1417Ks0, AbstractC5529iv0 abstractC5529iv0) {
        G10.g(xu0, "spanStyle");
        G10.g(c1417Ks0, "paragraphStyle");
        this.a = xu0;
        this.b = c1417Ks0;
        this.c = abstractC5529iv0;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public O21(XU0 xu0, C1417Ks0 c1417Ks0) {
        this(xu0, c1417Ks0, P21.b(null, null));
        G10.g(xu0, "spanStyle");
        G10.g(c1417Ks0, "paragraphStyle");
        xu0.o();
        c1417Ks0.e();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ O21(long j, long j2, SO so, PO po, QO qo, AbstractC7898rO abstractC7898rO, String str, long j3, C1671Ne c1671Ne, C4437f21 c4437f21, C4884gd0 c4884gd0, long j4, P11 p11, C4265eR0 c4265eR0, J11 j11, T11 t11, long j5, C4726g21 c4726g21, int i, AbstractC2911Yw abstractC2911Yw) {
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
        P11 p112 = (i & 4096) != 0 ? null : p11;
        long j6 = jG;
        C4265eR0 c4265eR02 = (i & 8192) != 0 ? null : c4265eR0;
        J11 j112 = (i & 16384) != 0 ? null : j11;
        T11 t112 = (i & 32768) != 0 ? null : t11;
        long jA3 = (i & 65536) != 0 ? S21.b.a() : j5;
        long j7 = jA;
        SO so3 = so2;
        P11 p113 = p112;
        PO po3 = po2;
        QO qo3 = qo2;
        AbstractC7898rO abstractC7898rO3 = abstractC7898rO2;
        String str3 = str2;
        long j8 = jA2;
        C1671Ne c1671Ne3 = c1671Ne2;
        C4437f21 c4437f213 = c4437f212;
        C4884gd0 c4884gd03 = c4884gd02;
        long j9 = jG2;
        this(j6, j7, so3, po3, qo3, abstractC7898rO3, str3, j8, c1671Ne3, c4437f213, c4884gd03, j9, p113, c4265eR02, j112, t112, jA3, (i & 131072) != 0 ? null : c4726g21, null);
    }

    public O21(long j, long j2, SO so, PO po, QO qo, AbstractC7898rO abstractC7898rO, String str, long j3, C1671Ne c1671Ne, C4437f21 c4437f21, C4884gd0 c4884gd0, long j4, P11 p11, C4265eR0 c4265eR0, J11 j11, T11 t11, long j5, C4726g21 c4726g21) {
        this(new XU0(j, j2, so, po, qo, abstractC7898rO, str, j3, c1671Ne, c4437f21, c4884gd0, j4, p11, c4265eR0, (AbstractC4973gv0) null, (AbstractC2911Yw) null), new C1417Ks0(j11, t11, j5, c4726g21, null, null, null), null);
    }
}
