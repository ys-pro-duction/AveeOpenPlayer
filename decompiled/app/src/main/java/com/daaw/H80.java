package com.daaw;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class H80 {
    public static final a D;
    public static final HashMap E;
    public static final Set F;
    public static final Set G;
    public static final List H;
    public static final List I;
    public static final List J;
    public static final List K;
    public static final List L;
    public static final /* synthetic */ H80[] L0;
    public static final List M;
    public static final /* synthetic */ YG M0;
    public static final List N;
    public static final List O;
    public static final List P;
    public static final List Q;
    public static final List R;
    public static final List S;
    public static final Map T;
    public final String B;
    public final boolean C;
    public static final H80 U = new H80("CLASS", 0, "class", false, 2, null);
    public static final H80 V = new H80("ANNOTATION_CLASS", 1, "annotation class", false, 2, null);
    public static final H80 W = new H80("TYPE_PARAMETER", 2, "type parameter", false);
    public static final H80 X = new H80("PROPERTY", 3, "property", false, 2, null);
    public static final H80 Y = new H80("FIELD", 4, "field", false, 2, null);
    public static final H80 Z = new H80("LOCAL_VARIABLE", 5, "local variable", false, 2, null);
    public static final H80 a0 = new H80("VALUE_PARAMETER", 6, "value parameter", false, 2, null);
    public static final H80 b0 = new H80("CONSTRUCTOR", 7, "constructor", false, 2, null);
    public static final H80 c0 = new H80("FUNCTION", 8, "function", false, 2, null);
    public static final H80 d0 = new H80("PROPERTY_GETTER", 9, "getter", false, 2, null);
    public static final H80 e0 = new H80("PROPERTY_SETTER", 10, "setter", false, 2, null);
    public static final H80 f0 = new H80("TYPE", 11, "type usage", false);
    public static final H80 g0 = new H80("EXPRESSION", 12, "expression", false);
    public static final H80 h0 = new H80("FILE", 13, "file", false);
    public static final H80 i0 = new H80("TYPEALIAS", 14, "typealias", false);
    public static final H80 j0 = new H80("TYPE_PROJECTION", 15, "type projection", false);
    public static final H80 k0 = new H80("STAR_PROJECTION", 16, "star projection", false);
    public static final H80 l0 = new H80("PROPERTY_PARAMETER", 17, "property constructor parameter", false);
    public static final H80 m0 = new H80("CLASS_ONLY", 18, "class", false);
    public static final H80 n0 = new H80("OBJECT", 19, "object", false);
    public static final H80 o0 = new H80("STANDALONE_OBJECT", 20, "standalone object", false);
    public static final H80 p0 = new H80("COMPANION_OBJECT", 21, "companion object", false);
    public static final H80 q0 = new H80("INTERFACE", 22, "interface", false);
    public static final H80 r0 = new H80("ENUM_CLASS", 23, "enum class", false);
    public static final H80 s0 = new H80("ENUM_ENTRY", 24, "enum entry", false);
    public static final H80 t0 = new H80("LOCAL_CLASS", 25, "local class", false);
    public static final H80 u0 = new H80("LOCAL_FUNCTION", 26, "local function", false);
    public static final H80 v0 = new H80("MEMBER_FUNCTION", 27, "member function", false);
    public static final H80 w0 = new H80("TOP_LEVEL_FUNCTION", 28, "top level function", false);
    public static final H80 x0 = new H80("MEMBER_PROPERTY", 29, "member property", false);
    public static final H80 y0 = new H80("MEMBER_PROPERTY_WITH_BACKING_FIELD", 30, "member property with backing field", false);
    public static final H80 z0 = new H80("MEMBER_PROPERTY_WITH_DELEGATE", 31, "member property with delegate", false);
    public static final H80 A0 = new H80("MEMBER_PROPERTY_WITHOUT_FIELD_OR_DELEGATE", 32, "member property without backing field or delegate", false);
    public static final H80 B0 = new H80("TOP_LEVEL_PROPERTY", 33, "top level property", false);
    public static final H80 C0 = new H80("TOP_LEVEL_PROPERTY_WITH_BACKING_FIELD", 34, "top level property with backing field", false);
    public static final H80 D0 = new H80("TOP_LEVEL_PROPERTY_WITH_DELEGATE", 35, "top level property with delegate", false);
    public static final H80 E0 = new H80("TOP_LEVEL_PROPERTY_WITHOUT_FIELD_OR_DELEGATE", 36, "top level property without backing field or delegate", false);
    public static final H80 F0 = new H80("BACKING_FIELD", 37, "backing field", false, 2, null);
    public static final H80 G0 = new H80("INITIALIZER", 38, "initializer", false);
    public static final H80 H0 = new H80("DESTRUCTURING_DECLARATION", 39, "destructuring declaration", false);
    public static final H80 I0 = new H80("LAMBDA_EXPRESSION", 40, "lambda expression", false);
    public static final H80 J0 = new H80("ANONYMOUS_FUNCTION", 41, "anonymous function", false);
    public static final H80 K0 = new H80("OBJECT_LITERAL", 42, "object literal", false);

    public static final class a {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public a() {
        }
    }

    static {
        H80[] h80ArrA = a();
        L0 = h80ArrA;
        M0 = AbstractC3110aH.a(h80ArrA);
        D = new a(null);
        E = new HashMap();
        for (H80 h80 : c()) {
            E.put(h80.name(), h80);
        }
        YG ygC = c();
        ArrayList arrayList = new ArrayList();
        for (Object obj : ygC) {
            if (((H80) obj).C) {
                arrayList.add(obj);
            }
        }
        F = AbstractC2455Um.Q0(arrayList);
        G = AbstractC2455Um.Q0(c());
        H80 h802 = U;
        H = AbstractC1599Mm.n(V, h802);
        I = AbstractC1599Mm.n(t0, h802);
        J = AbstractC1599Mm.n(m0, h802);
        H80 h803 = n0;
        K = AbstractC1599Mm.n(p0, h803, h802);
        L = AbstractC1599Mm.n(o0, h803, h802);
        M = AbstractC1599Mm.n(q0, h802);
        N = AbstractC1599Mm.n(r0, h802);
        H80 h804 = X;
        H80 h805 = Y;
        O = AbstractC1599Mm.n(s0, h804, h805);
        H80 h806 = e0;
        P = AbstractC1496Lm.e(h806);
        H80 h807 = d0;
        Q = AbstractC1496Lm.e(h807);
        R = AbstractC1496Lm.e(c0);
        H80 h808 = h0;
        S = AbstractC1496Lm.e(h808);
        W7 w7 = W7.I;
        H80 h809 = a0;
        T = AbstractC1473Lg0.k(D61.a(w7, h809), D61.a(W7.C, h805), D61.a(W7.E, h804), D61.a(W7.D, h808), D61.a(W7.F, h807), D61.a(W7.G, h806), D61.a(W7.H, h809), D61.a(W7.J, h809), D61.a(W7.K, h805));
    }

    public H80(String str, int i, String str2, boolean z) {
        this.B = str2;
        this.C = z;
    }

    public static final /* synthetic */ H80[] a() {
        return new H80[]{U, V, W, X, Y, Z, a0, b0, c0, d0, e0, f0, g0, h0, i0, j0, k0, l0, m0, n0, o0, p0, q0, r0, s0, t0, u0, v0, w0, x0, y0, z0, A0, B0, C0, D0, E0, F0, G0, H0, I0, J0, K0};
    }

    public static YG c() {
        return M0;
    }

    public static H80 valueOf(String str) {
        return (H80) Enum.valueOf(H80.class, str);
    }

    public static H80[] values() {
        return (H80[]) L0.clone();
    }

    public /* synthetic */ H80(String str, int i, String str2, boolean z, int i2, AbstractC2911Yw abstractC2911Yw) {
        this(str, i, str2, (i2 & 2) != 0 ? true : z);
    }
}
