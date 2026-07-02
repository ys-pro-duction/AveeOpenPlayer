package com.daaw;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.s73, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8110s73 {
    public long A;
    public long B;
    public long C;
    public long D;
    public String E;
    public boolean F;
    public long G;
    public long H;
    public final C9327wU2 a;
    public final String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public long g;
    public long h;
    public long i;
    public String j;
    public long k;
    public String l;
    public long m;
    public long n;
    public boolean o;
    public boolean p;
    public String q;
    public Boolean r;
    public long s;
    public List t;
    public String u;
    public boolean v;
    public long w;
    public long x;
    public long y;
    public long z;

    public C8110s73(C9327wU2 c9327wU2, String str) {
        AbstractC7506py0.l(c9327wU2);
        AbstractC7506py0.f(str);
        this.a = c9327wU2;
        this.b = str;
        c9327wU2.x().d();
    }

    public final long A() {
        this.a.x().d();
        return 0L;
    }

    public final void B(String str) {
        this.a.x().d();
        this.F |= !FS2.a(this.E, str);
        this.E = str;
    }

    public final void C(long j) {
        this.a.x().d();
        this.F |= this.i != j;
        this.i = j;
    }

    public final void D(long j) {
        AbstractC7506py0.a(j >= 0);
        this.a.x().d();
        this.F |= this.g != j;
        this.g = j;
    }

    public final void E(long j) {
        this.a.x().d();
        this.F |= this.h != j;
        this.h = j;
    }

    public final void F(boolean z) {
        this.a.x().d();
        this.F |= this.o != z;
        this.o = z;
    }

    public final void G(Boolean bool) {
        this.a.x().d();
        this.F |= !FS2.a(this.r, bool);
        this.r = bool;
    }

    public final void H(String str) {
        this.a.x().d();
        this.F |= !FS2.a(this.e, str);
        this.e = str;
    }

    public final void I(List list) {
        this.a.x().d();
        if (FS2.a(this.t, list)) {
            return;
        }
        this.F = true;
        this.t = list != null ? new ArrayList(list) : null;
    }

    public final void J(String str) {
        this.a.x().d();
        this.F |= !FS2.a(this.u, str);
        this.u = str;
    }

    public final void K(long j) {
        this.a.x().d();
        this.F |= this.x != j;
        this.x = j;
    }

    public final void L(boolean z) {
        this.a.x().d();
        this.F |= this.v != z;
        this.v = z;
    }

    public final void M(long j) {
        this.a.x().d();
        this.F |= this.w != j;
        this.w = j;
    }

    public final boolean N() {
        this.a.x().d();
        return this.p;
    }

    public final boolean O() {
        this.a.x().d();
        return this.o;
    }

    public final boolean P() {
        this.a.x().d();
        return this.F;
    }

    public final boolean Q() {
        this.a.x().d();
        return this.v;
    }

    public final long R() {
        this.a.x().d();
        return this.k;
    }

    public final long S() {
        this.a.x().d();
        return this.G;
    }

    public final long T() {
        this.a.x().d();
        return this.B;
    }

    public final long U() {
        this.a.x().d();
        return this.C;
    }

    public final long V() {
        this.a.x().d();
        return this.A;
    }

    public final long W() {
        this.a.x().d();
        return this.z;
    }

    public final long X() {
        this.a.x().d();
        return this.D;
    }

    public final long Y() {
        this.a.x().d();
        return this.y;
    }

    public final long Z() {
        this.a.x().d();
        return this.n;
    }

    public final String a() {
        this.a.x().d();
        return this.d;
    }

    public final long a0() {
        this.a.x().d();
        return this.s;
    }

    public final String b() {
        this.a.x().d();
        return this.E;
    }

    public final long b0() {
        this.a.x().d();
        return this.H;
    }

    public final String c() {
        this.a.x().d();
        return this.e;
    }

    public final long c0() {
        this.a.x().d();
        return this.m;
    }

    public final String d() {
        this.a.x().d();
        return this.u;
    }

    public final long d0() {
        this.a.x().d();
        return this.i;
    }

    public final List e() {
        this.a.x().d();
        return this.t;
    }

    public final long e0() {
        this.a.x().d();
        return this.g;
    }

    public final void f() {
        this.a.x().d();
        this.F = false;
    }

    public final long f0() {
        this.a.x().d();
        return this.h;
    }

    public final void g() {
        this.a.x().d();
        long j = this.g + 1;
        if (j > 2147483647L) {
            this.a.w().t().b("Bundle index overflow. appId", C6675mz2.z(this.b));
            j = 0;
        }
        this.F = true;
        this.g = j;
    }

    public final long g0() {
        this.a.x().d();
        return this.x;
    }

    public final void h(String str) {
        this.a.x().d();
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.F |= true ^ FS2.a(this.q, str);
        this.q = str;
    }

    public final long h0() {
        this.a.x().d();
        return this.w;
    }

    public final void i(boolean z) {
        this.a.x().d();
        this.F |= this.p != z;
        this.p = z;
    }

    public final Boolean i0() {
        this.a.x().d();
        return this.r;
    }

    public final void j(String str) {
        this.a.x().d();
        this.F |= !FS2.a(this.c, str);
        this.c = str;
    }

    public final String j0() {
        this.a.x().d();
        return this.q;
    }

    public final void k(String str) {
        this.a.x().d();
        this.F |= !FS2.a(this.l, str);
        this.l = str;
    }

    public final String k0() {
        this.a.x().d();
        String str = this.E;
        B(null);
        return str;
    }

    public final void l(String str) {
        this.a.x().d();
        this.F |= !FS2.a(this.j, str);
        this.j = str;
    }

    public final String l0() {
        this.a.x().d();
        return this.b;
    }

    public final void m(long j) {
        this.a.x().d();
        this.F |= this.k != j;
        this.k = j;
    }

    public final String m0() {
        this.a.x().d();
        return this.c;
    }

    public final void n(long j) {
        this.a.x().d();
        this.F |= this.G != j;
        this.G = j;
    }

    public final String n0() {
        this.a.x().d();
        return this.l;
    }

    public final void o(long j) {
        this.a.x().d();
        this.F |= this.B != j;
        this.B = j;
    }

    public final String o0() {
        this.a.x().d();
        return this.j;
    }

    public final void p(long j) {
        this.a.x().d();
        this.F |= this.C != j;
        this.C = j;
    }

    public final String p0() {
        this.a.x().d();
        return this.f;
    }

    public final void q(long j) {
        this.a.x().d();
        this.F |= this.A != j;
        this.A = j;
    }

    public final void r(long j) {
        this.a.x().d();
        this.F |= this.z != j;
        this.z = j;
    }

    public final void s(long j) {
        this.a.x().d();
        this.F |= this.D != j;
        this.D = j;
    }

    public final void t(long j) {
        this.a.x().d();
        this.F |= this.y != j;
        this.y = j;
    }

    public final void u(long j) {
        this.a.x().d();
        this.F |= this.n != j;
        this.n = j;
    }

    public final void v(long j) {
        this.a.x().d();
        this.F |= this.s != j;
        this.s = j;
    }

    public final void w(long j) {
        this.a.x().d();
        this.F |= this.H != j;
        this.H = j;
    }

    public final void x(String str) {
        this.a.x().d();
        this.F |= !FS2.a(this.f, str);
        this.f = str;
    }

    public final void y(String str) {
        this.a.x().d();
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.F |= true ^ FS2.a(this.d, str);
        this.d = str;
    }

    public final void z(long j) {
        this.a.x().d();
        this.F |= this.m != j;
        this.m = j;
    }
}
