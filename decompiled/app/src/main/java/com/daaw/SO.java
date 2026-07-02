package com.daaw;

import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class SO implements Comparable {
    public static final a C = new a(null);
    public static final SO D;
    public static final SO E;
    public static final SO F;
    public static final SO G;
    public static final SO H;
    public static final SO I;
    public static final SO J;
    public static final SO K;
    public static final SO L;
    public static final SO M;
    public static final SO N;
    public static final SO O;
    public static final SO P;
    public static final SO Q;
    public static final SO R;
    public static final SO S;
    public static final SO T;
    public static final SO U;
    public static final List V;
    public final int B;

    public static final class a {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public final SO a() {
            return SO.S;
        }

        public final SO b() {
            return SO.O;
        }

        public final SO c() {
            return SO.Q;
        }

        public final SO d() {
            return SO.P;
        }

        public final SO e() {
            return SO.G;
        }

        public final SO f() {
            return SO.H;
        }

        public final SO g() {
            return SO.I;
        }

        public a() {
        }
    }

    static {
        SO so = new SO(100);
        D = so;
        SO so2 = new SO(RCHTTPStatusCodes.SUCCESS);
        E = so2;
        SO so3 = new SO(RCHTTPStatusCodes.UNSUCCESSFUL);
        F = so3;
        SO so4 = new SO(RCHTTPStatusCodes.BAD_REQUEST);
        G = so4;
        SO so5 = new SO(500);
        H = so5;
        SO so6 = new SO(600);
        I = so6;
        SO so7 = new SO(700);
        J = so7;
        SO so8 = new SO(800);
        K = so8;
        SO so9 = new SO(900);
        L = so9;
        M = so;
        N = so2;
        O = so3;
        P = so4;
        Q = so5;
        R = so6;
        S = so7;
        T = so8;
        U = so9;
        V = AbstractC1599Mm.n(so, so2, so3, so4, so5, so6, so7, so8, so9);
    }

    public SO(int i) {
        this.B = i;
        if (1 > i || i >= 1001) {
            throw new IllegalArgumentException(("Font weight can be in range [1, 1000]. Current value: " + i).toString());
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SO) && this.B == ((SO) obj).B;
    }

    public int hashCode() {
        return this.B;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public int compareTo(SO so) {
        G10.g(so, "other");
        return G10.h(this.B, so.B);
    }

    public final int o() {
        return this.B;
    }

    public String toString() {
        return "FontWeight(weight=" + this.B + ')';
    }
}
