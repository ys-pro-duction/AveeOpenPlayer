package com.daaw;

import com.daaw.C9038vS0;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.Wy0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC2712Wy0 {
    public static final I30 a = new I30(EnumC3262ap0.C, null, false, false, 8, null);
    public static final I30 b;
    public static final I30 c;
    public static final Map d;

    static {
        EnumC3262ap0 enumC3262ap0 = EnumC3262ap0.D;
        b = new I30(enumC3262ap0, null, false, false, 8, null);
        c = new I30(enumC3262ap0, null, true, false, 8, null);
        C7079oS0 c7079oS0 = C7079oS0.a;
        String strH = c7079oS0.h("Object");
        String strG = c7079oS0.g("Predicate");
        String strG2 = c7079oS0.g("Function");
        String strG3 = c7079oS0.g("Consumer");
        String strG4 = c7079oS0.g("BiFunction");
        String strG5 = c7079oS0.g("BiConsumer");
        String strG6 = c7079oS0.g("UnaryOperator");
        String strI = c7079oS0.i("stream/Stream");
        String strI2 = c7079oS0.i("Optional");
        C9038vS0 c9038vS0 = new C9038vS0();
        new C9038vS0.a(c9038vS0, c7079oS0.i("Iterator")).a("forEachRemaining", new C8907uy0(strG3));
        new C9038vS0.a(c9038vS0, c7079oS0.h("Iterable")).a("spliterator", new C0921Fy0(c7079oS0));
        C9038vS0.a aVar = new C9038vS0.a(c9038vS0, c7079oS0.i("Collection"));
        aVar.a("removeIf", new C1856Oy0(strG));
        aVar.a("stream", new C1960Py0(strI));
        aVar.a("parallelStream", new C2086Qy0(strI));
        new C9038vS0.a(c9038vS0, c7079oS0.i("List")).a("replaceAll", new C2190Ry0(strG6));
        C9038vS0.a aVar2 = new C9038vS0.a(c9038vS0, c7079oS0.i("Map"));
        aVar2.a("forEach", new C2296Sy0(strG5));
        aVar2.a("putIfAbsent", new C2400Ty0(strH));
        aVar2.a("replace", new C2504Uy0(strH));
        aVar2.a("replace", new C2608Vy0(strH));
        aVar2.a("replaceAll", new C9186vy0(strG4));
        aVar2.a("compute", new C9465wy0(strH, strG4));
        aVar2.a("computeIfAbsent", new C9744xy0(strH, strG2));
        aVar2.a("computeIfPresent", new C10023yy0(strH, strG4));
        aVar2.a("merge", new C10302zy0(strH, strG4));
        C9038vS0.a aVar3 = new C9038vS0.a(c9038vS0, strI2);
        aVar3.a("empty", new C0392Ay0(strI2));
        aVar3.a("of", new C0496By0(strH, strI2));
        aVar3.a("ofNullable", new C0600Cy0(strH, strI2));
        aVar3.a("get", new C0713Dy0(strH));
        aVar3.a("ifPresent", new C0817Ey0(strG3));
        new C9038vS0.a(c9038vS0, c7079oS0.h("ref/Reference")).a("get", new C1025Gy0(strH));
        new C9038vS0.a(c9038vS0, strG).a("test", new C1129Hy0(strH));
        new C9038vS0.a(c9038vS0, c7079oS0.g("BiPredicate")).a("test", new C1233Iy0(strH));
        new C9038vS0.a(c9038vS0, strG3).a("accept", new C1337Jy0(strH));
        new C9038vS0.a(c9038vS0, strG5).a("accept", new C1441Ky0(strH));
        new C9038vS0.a(c9038vS0, strG2).a("apply", new C1544Ly0(strH));
        new C9038vS0.a(c9038vS0, strG4).a("apply", new C1648My0(strH));
        new C9038vS0.a(c9038vS0, c7079oS0.g("Supplier")).a("get", new C1752Ny0(strH));
        d = c9038vS0.b();
    }

    public static final G91 A(String str, C9038vS0.a.C0246a c0246a) {
        G10.g(str, "$JUStream");
        G10.g(c0246a, "$this$function");
        I30 i30 = b;
        c0246a.d(str, i30, i30);
        return G91.a;
    }

    public static final G91 B(String str, C9038vS0.a.C0246a c0246a) {
        G10.g(str, "$JFUnaryOperator");
        G10.g(c0246a, "$this$function");
        I30 i30 = b;
        c0246a.b(str, i30, i30);
        return G91.a;
    }

    public static final G91 a(String str, C9038vS0.a.C0246a c0246a) {
        G10.g(str, "$JFConsumer");
        G10.g(c0246a, "$this$function");
        I30 i30 = b;
        c0246a.b(str, i30, i30);
        return G91.a;
    }

    public static final G91 b(String str, C9038vS0.a.C0246a c0246a) {
        G10.g(str, "$JFBiConsumer");
        G10.g(c0246a, "$this$function");
        I30 i30 = b;
        c0246a.b(str, i30, i30, i30);
        return G91.a;
    }

    public static final G91 c(String str, C9038vS0.a.C0246a c0246a) {
        G10.g(str, "$JLObject");
        G10.g(c0246a, "$this$function");
        I30 i30 = b;
        c0246a.b(str, i30);
        c0246a.b(str, i30);
        c0246a.d(str, a);
        return G91.a;
    }

    public static final G91 d(String str, C9038vS0.a.C0246a c0246a) {
        G10.g(str, "$JLObject");
        G10.g(c0246a, "$this$function");
        I30 i30 = b;
        c0246a.b(str, i30);
        c0246a.b(str, i30);
        c0246a.d(str, a);
        return G91.a;
    }

    public static final G91 e(String str, C9038vS0.a.C0246a c0246a) {
        G10.g(str, "$JLObject");
        G10.g(c0246a, "$this$function");
        I30 i30 = b;
        c0246a.b(str, i30);
        c0246a.b(str, i30);
        c0246a.b(str, i30);
        c0246a.c(EnumC6703n50.BOOLEAN);
        return G91.a;
    }

    public static final Map e0() {
        return d;
    }

    public static final G91 f(String str, C9038vS0.a.C0246a c0246a) {
        G10.g(str, "$JFBiFunction");
        G10.g(c0246a, "$this$function");
        I30 i30 = b;
        c0246a.b(str, i30, i30, i30, i30);
        return G91.a;
    }

    public static final G91 g(String str, String str2, C9038vS0.a.C0246a c0246a) {
        G10.g(str, "$JLObject");
        G10.g(str2, "$JFBiFunction");
        G10.g(c0246a, "$this$function");
        I30 i30 = b;
        c0246a.b(str, i30);
        I30 i302 = a;
        c0246a.b(str2, i30, i30, i302, i302);
        c0246a.d(str, i302);
        return G91.a;
    }

    public static final G91 h(String str, String str2, C9038vS0.a.C0246a c0246a) {
        G10.g(str, "$JLObject");
        G10.g(str2, "$JFFunction");
        G10.g(c0246a, "$this$function");
        I30 i30 = b;
        c0246a.b(str, i30);
        c0246a.b(str2, i30, i30, i30);
        c0246a.d(str, i30);
        return G91.a;
    }

    public static final G91 i(String str, String str2, C9038vS0.a.C0246a c0246a) {
        G10.g(str, "$JLObject");
        G10.g(str2, "$JFBiFunction");
        G10.g(c0246a, "$this$function");
        I30 i30 = b;
        c0246a.b(str, i30);
        I30 i302 = a;
        c0246a.b(str2, i30, i30, c, i302);
        c0246a.d(str, i302);
        return G91.a;
    }

    public static final G91 j(String str, String str2, C9038vS0.a.C0246a c0246a) {
        G10.g(str, "$JLObject");
        G10.g(str2, "$JFBiFunction");
        G10.g(c0246a, "$this$function");
        I30 i30 = b;
        c0246a.b(str, i30);
        I30 i302 = c;
        c0246a.b(str, i302);
        I30 i303 = a;
        c0246a.b(str2, i30, i302, i302, i303);
        c0246a.d(str, i303);
        return G91.a;
    }

    public static final G91 k(String str, C9038vS0.a.C0246a c0246a) {
        G10.g(str, "$JUOptional");
        G10.g(c0246a, "$this$function");
        c0246a.d(str, b, c);
        return G91.a;
    }

    public static final G91 l(String str, String str2, C9038vS0.a.C0246a c0246a) {
        G10.g(str, "$JLObject");
        G10.g(str2, "$JUOptional");
        G10.g(c0246a, "$this$function");
        I30 i30 = c;
        c0246a.b(str, i30);
        c0246a.d(str2, b, i30);
        return G91.a;
    }

    public static final G91 m(String str, String str2, C9038vS0.a.C0246a c0246a) {
        G10.g(str, "$JLObject");
        G10.g(str2, "$JUOptional");
        G10.g(c0246a, "$this$function");
        c0246a.b(str, a);
        c0246a.d(str2, b, c);
        return G91.a;
    }

    public static final G91 n(String str, C9038vS0.a.C0246a c0246a) {
        G10.g(str, "$JLObject");
        G10.g(c0246a, "$this$function");
        c0246a.d(str, c);
        return G91.a;
    }

    public static final G91 o(String str, C9038vS0.a.C0246a c0246a) {
        G10.g(str, "$JFConsumer");
        G10.g(c0246a, "$this$function");
        c0246a.b(str, b, c);
        return G91.a;
    }

    public static final G91 p(String str, C9038vS0.a.C0246a c0246a) {
        G10.g(str, "$JLObject");
        G10.g(c0246a, "$this$function");
        c0246a.d(str, a);
        return G91.a;
    }

    public static final G91 q(String str, C9038vS0.a.C0246a c0246a) {
        G10.g(str, "$JLObject");
        G10.g(c0246a, "$this$function");
        c0246a.b(str, b);
        c0246a.c(EnumC6703n50.BOOLEAN);
        return G91.a;
    }

    public static final G91 r(C7079oS0 c7079oS0, C9038vS0.a.C0246a c0246a) {
        G10.g(c7079oS0, "$this_signatures");
        G10.g(c0246a, "$this$function");
        String strI = c7079oS0.i("Spliterator");
        I30 i30 = b;
        c0246a.d(strI, i30, i30);
        return G91.a;
    }

    public static final G91 s(String str, C9038vS0.a.C0246a c0246a) {
        G10.g(str, "$JLObject");
        G10.g(c0246a, "$this$function");
        I30 i30 = b;
        c0246a.b(str, i30);
        c0246a.b(str, i30);
        c0246a.c(EnumC6703n50.BOOLEAN);
        return G91.a;
    }

    public static final G91 t(String str, C9038vS0.a.C0246a c0246a) {
        G10.g(str, "$JLObject");
        G10.g(c0246a, "$this$function");
        c0246a.b(str, b);
        return G91.a;
    }

    public static final G91 u(String str, C9038vS0.a.C0246a c0246a) {
        G10.g(str, "$JLObject");
        G10.g(c0246a, "$this$function");
        I30 i30 = b;
        c0246a.b(str, i30);
        c0246a.b(str, i30);
        return G91.a;
    }

    public static final G91 v(String str, C9038vS0.a.C0246a c0246a) {
        G10.g(str, "$JLObject");
        G10.g(c0246a, "$this$function");
        I30 i30 = b;
        c0246a.b(str, i30);
        c0246a.d(str, i30);
        return G91.a;
    }

    public static final G91 w(String str, C9038vS0.a.C0246a c0246a) {
        G10.g(str, "$JLObject");
        G10.g(c0246a, "$this$function");
        I30 i30 = b;
        c0246a.b(str, i30);
        c0246a.b(str, i30);
        c0246a.d(str, i30);
        return G91.a;
    }

    public static final G91 x(String str, C9038vS0.a.C0246a c0246a) {
        G10.g(str, "$JLObject");
        G10.g(c0246a, "$this$function");
        c0246a.d(str, b);
        return G91.a;
    }

    public static final G91 y(String str, C9038vS0.a.C0246a c0246a) {
        G10.g(str, "$JFPredicate");
        G10.g(c0246a, "$this$function");
        I30 i30 = b;
        c0246a.b(str, i30, i30);
        c0246a.c(EnumC6703n50.BOOLEAN);
        return G91.a;
    }

    public static final G91 z(String str, C9038vS0.a.C0246a c0246a) {
        G10.g(str, "$JUStream");
        G10.g(c0246a, "$this$function");
        I30 i30 = b;
        c0246a.d(str, i30, i30);
        return G91.a;
    }
}
