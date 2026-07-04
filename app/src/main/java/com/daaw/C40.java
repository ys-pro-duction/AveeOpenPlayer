package com.daaw;

import com.daaw.YV0;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public abstract class C40 {
    public static final AP a;
    public static final AP b;
    public static final AP c;
    public static final AP d;
    public static final AP e;
    public static final AP f;
    public static final AP g;
    public static final List h;
    public static final AP i;
    public static final AP j;
    public static final List k;
    public static final AP l;
    public static final AP m;
    public static final AP n;
    public static final AP o;
    public static final Set p;
    public static final Set q;
    public static final Set r;
    public static final Map s;

    static {
        AP ap = new AP("org.jspecify.nullness.Nullable");
        a = ap;
        b = new AP("org.jspecify.nullness.NullnessUnspecified");
        AP ap2 = new AP("org.jspecify.nullness.NullMarked");
        c = ap2;
        AP ap3 = new AP("org.jspecify.annotations.Nullable");
        d = ap3;
        e = new AP("org.jspecify.annotations.NullnessUnspecified");
        AP ap4 = new AP("org.jspecify.annotations.NullMarked");
        f = ap4;
        g = new AP("org.jspecify.annotations.NonNull");
        List listN = AbstractC1599Mm.n(B40.m, new AP("androidx.annotation.Nullable"), new AP("androidx.annotation.Nullable"), new AP("android.annotation.Nullable"), new AP("com.android.annotations.Nullable"), new AP("org.eclipse.jdt.annotation.Nullable"), new AP("org.checkerframework.checker.nullness.qual.Nullable"), new AP("javax.annotation.Nullable"), new AP("javax.annotation.CheckForNull"), new AP("edu.umd.cs.findbugs.annotations.CheckForNull"), new AP("edu.umd.cs.findbugs.annotations.Nullable"), new AP("edu.umd.cs.findbugs.annotations.PossiblyNull"), new AP("io.reactivex.annotations.Nullable"), new AP("io.reactivex.rxjava3.annotations.Nullable"));
        h = listN;
        AP ap5 = new AP("javax.annotation.Nonnull");
        i = ap5;
        j = new AP("javax.annotation.CheckForNull");
        List listN2 = AbstractC1599Mm.n(B40.l, new AP("edu.umd.cs.findbugs.annotations.NonNull"), new AP("androidx.annotation.NonNull"), new AP("androidx.annotation.NonNull"), new AP("android.annotation.NonNull"), new AP("com.android.annotations.NonNull"), new AP("org.eclipse.jdt.annotation.NonNull"), new AP("org.checkerframework.checker.nullness.qual.NonNull"), new AP("lombok.NonNull"), new AP("io.reactivex.annotations.NonNull"), new AP("io.reactivex.rxjava3.annotations.NonNull"));
        k = listN2;
        AP ap6 = new AP("org.checkerframework.checker.nullness.compatqual.NullableDecl");
        l = ap6;
        AP ap7 = new AP("org.checkerframework.checker.nullness.compatqual.NonNullDecl");
        m = ap7;
        AP ap8 = new AP("androidx.annotation.RecentlyNullable");
        n = ap8;
        AP ap9 = new AP("androidx.annotation.RecentlyNonNull");
        o = ap9;
        p = AbstractC10146zQ0.k(AbstractC10146zQ0.k(AbstractC10146zQ0.k(AbstractC10146zQ0.k(AbstractC10146zQ0.k(AbstractC10146zQ0.k(AbstractC10146zQ0.k(AbstractC10146zQ0.k(AbstractC10146zQ0.j(AbstractC10146zQ0.k(AbstractC10146zQ0.j(new LinkedHashSet(), listN), ap5), listN2), ap6), ap7), ap8), ap9), ap), ap2), ap3), ap4);
        q = AbstractC9867yQ0.g(B40.o, B40.p);
        r = AbstractC9867yQ0.g(B40.n, B40.q);
        s = AbstractC1473Lg0.k(D61.a(B40.d, YV0.a.H), D61.a(B40.f, YV0.a.L), D61.a(B40.h, YV0.a.y), D61.a(B40.i, YV0.a.P));
    }

    public static final AP a() {
        return o;
    }

    public static final AP b() {
        return n;
    }

    public static final AP c() {
        return m;
    }

    public static final AP d() {
        return l;
    }

    public static final AP e() {
        return j;
    }

    public static final AP f() {
        return i;
    }

    public static final AP g() {
        return g;
    }

    public static final AP h() {
        return d;
    }

    public static final AP i() {
        return e;
    }

    public static final AP j() {
        return f;
    }

    public static final AP k() {
        return a;
    }

    public static final AP l() {
        return b;
    }

    public static final AP m() {
        return c;
    }

    public static final Set n() {
        return r;
    }

    public static final List o() {
        return k;
    }

    public static final List p() {
        return h;
    }

    public static final Set q() {
        return q;
    }
}
