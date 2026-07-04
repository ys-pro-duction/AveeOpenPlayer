package com.daaw;

import com.daaw.AbstractC7898rO;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.x21, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9485x21 {
    public static final boolean a(A21 a21, D7 d7, O21 o21, List list, int i, boolean z, int i2, InterfaceC4988gz interfaceC4988gz, EnumC7560q90 enumC7560q90, AbstractC7898rO.b bVar, long j) {
        G10.g(a21, "$this$canReuse");
        G10.g(d7, "text");
        G10.g(o21, "style");
        G10.g(list, "placeholders");
        G10.g(interfaceC4988gz, "density");
        G10.g(enumC7560q90, "layoutDirection");
        G10.g(bVar, "fontFamilyResolver");
        C9764y21 c9764y21H = a21.h();
        if (a21.p().f().a() || !G10.c(c9764y21H.j(), d7) || !c9764y21H.i().A(o21) || !G10.c(c9764y21H.g(), list) || c9764y21H.e() != i || c9764y21H.h() != z || !C21.d(c9764y21H.f(), i2) || !G10.c(c9764y21H.b(), interfaceC4988gz) || c9764y21H.d() != enumC7560q90 || !G10.c(c9764y21H.c(), bVar) || C6079kr.p(j) != C6079kr.p(c9764y21H.a())) {
            return false;
        }
        if (z || C21.d(i2, C21.a.b())) {
            return C6079kr.n(j) == C6079kr.n(c9764y21H.a()) && C6079kr.m(j) == C6079kr.m(c9764y21H.a());
        }
        return true;
    }
}
