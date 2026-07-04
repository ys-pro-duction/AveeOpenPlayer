package com.daaw;

import com.daaw.AbstractC7898rO;
import com.daaw.T11;
import java.util.List;
import java.util.Locale;

/* JADX INFO: renamed from: com.daaw.h6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5023h6 {
    public static final InterfaceC1105Hs0 a(String str, O21 o21, List list, List list2, InterfaceC4988gz interfaceC4988gz, AbstractC7898rO.b bVar) {
        G10.g(str, "text");
        G10.g(o21, "style");
        G10.g(list, "spanStyles");
        G10.g(list2, "placeholders");
        G10.g(interfaceC4988gz, "density");
        G10.g(bVar, "fontFamilyResolver");
        return new C4744g6(str, o21, list, list2, bVar, interfaceC4988gz);
    }

    public static final int b(T11 t11, C4884gd0 c4884gd0) {
        Locale localeB;
        int iL = t11 != null ? t11.l() : T11.b.a();
        T11.a aVar = T11.b;
        if (T11.i(iL, aVar.b())) {
            return 2;
        }
        if (T11.i(iL, aVar.c())) {
            return 3;
        }
        if (T11.i(iL, aVar.d())) {
            return 0;
        }
        if (T11.i(iL, aVar.e())) {
            return 1;
        }
        if (!T11.i(iL, aVar.a())) {
            throw new IllegalStateException("Invalid TextDirection.");
        }
        if (c4884gd0 == null || (localeB = ((U5) c4884gd0.m(0).a()).b()) == null) {
            localeB = Locale.getDefault();
        }
        int iA = V21.a(localeB);
        return (iA == 0 || iA != 1) ? 2 : 3;
    }
}
