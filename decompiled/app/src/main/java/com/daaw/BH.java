package com.daaw;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class BH {
    public static final BH a = new BH();
    public static final InterfaceC2968Zk0 b = C8428tH.B;
    public static final C6755nH c;
    public static final I80 d;
    public static final I80 e;
    public static final InterfaceC4476fA0 f;
    public static final Set g;

    static {
        String str = String.format(EnumC7592qH.C.c(), Arrays.copyOf(new Object[]{"unknown class"}, 1));
        G10.f(str, "format(...)");
        C2352Tm0 c2352Tm0O = C2352Tm0.o(str);
        G10.f(c2352Tm0O, "special(...)");
        c = new C6755nH(c2352Tm0O);
        d = d(AH.W, new String[0]);
        e = d(AH.T0, new String[0]);
        C8707uH c8707uH = new C8707uH();
        f = c8707uH;
        g = AbstractC9588xQ0.c(c8707uH);
    }

    public static final C9272wH a(EnumC9551xH enumC9551xH, boolean z, String... strArr) {
        G10.g(enumC9551xH, "kind");
        G10.g(strArr, "formatParams");
        return z ? new C10048z31(enumC9551xH, (String[]) Arrays.copyOf(strArr, strArr.length)) : new C9272wH(enumC9551xH, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static final C9272wH b(EnumC9551xH enumC9551xH, String... strArr) {
        G10.g(enumC9551xH, "kind");
        G10.g(strArr, "formatParams");
        return a(enumC9551xH, false, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static final C9830yH d(AH ah, String... strArr) {
        G10.g(ah, "kind");
        G10.g(strArr, "formatParams");
        return a.g(ah, AbstractC1599Mm.k(), (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static final boolean m(InterfaceC8612tw interfaceC8612tw) {
        if (interfaceC8612tw == null) {
            return false;
        }
        BH bh = a;
        return bh.n(interfaceC8612tw) || bh.n(interfaceC8612tw.b()) || interfaceC8612tw == b;
    }

    public static final boolean o(I80 i80) {
        if (i80 == null) {
            return false;
        }
        C71 c71N0 = i80.N0();
        return (c71N0 instanceof C10109zH) && ((C10109zH) c71N0).f() == AH.Z;
    }

    public final C9830yH c(AH ah, C71 c71, String... strArr) {
        G10.g(ah, "kind");
        G10.g(c71, "typeConstructor");
        G10.g(strArr, "formatParams");
        return f(ah, AbstractC1599Mm.k(), c71, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public final C10109zH e(AH ah, String... strArr) {
        G10.g(ah, "kind");
        G10.g(strArr, "formatParams");
        return new C10109zH(ah, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public final C9830yH f(AH ah, List list, C71 c71, String... strArr) {
        G10.g(ah, "kind");
        G10.g(list, "arguments");
        G10.g(c71, "typeConstructor");
        G10.g(strArr, "formatParams");
        return new C9830yH(c71, b(EnumC9551xH.I, c71.toString()), ah, list, false, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public final C9830yH g(AH ah, List list, String... strArr) {
        G10.g(ah, "kind");
        G10.g(list, "arguments");
        G10.g(strArr, "formatParams");
        return f(ah, list, e(ah, (String[]) Arrays.copyOf(strArr, strArr.length)), (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public final C6755nH h() {
        return c;
    }

    public final InterfaceC2968Zk0 i() {
        return b;
    }

    public final Set j() {
        return g;
    }

    public final I80 k() {
        return e;
    }

    public final I80 l() {
        return d;
    }

    public final boolean n(InterfaceC8612tw interfaceC8612tw) {
        return interfaceC8612tw instanceof C6755nH;
    }

    public final String p(I80 i80) {
        G10.g(i80, "type");
        H81.z(i80);
        C71 c71N0 = i80.N0();
        G10.e(c71N0, "null cannot be cast to non-null type org.jetbrains.kotlin.types.error.ErrorTypeConstructor");
        return ((C10109zH) c71N0).g(0);
    }
}
