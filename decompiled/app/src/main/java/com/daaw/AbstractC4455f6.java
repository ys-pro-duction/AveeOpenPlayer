package com.daaw;

import android.text.SpannableString;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.f6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4455f6 {
    public static final CharSequence a(String str, float f, O21 o21, List list, List list2, InterfaceC4988gz interfaceC4988gz, InterfaceC4553fR interfaceC4553fR) {
        float f2;
        InterfaceC4988gz interfaceC4988gz2;
        G10.g(str, "text");
        G10.g(o21, "contextTextStyle");
        G10.g(list, "spanStyles");
        G10.g(list2, "placeholders");
        G10.g(interfaceC4988gz, "density");
        G10.g(interfaceC4553fR, "resolveTypeface");
        if (list.isEmpty() && list2.isEmpty() && G10.c(o21.z(), C4726g21.c.a()) && T21.e(o21.o())) {
            return str;
        }
        SpannableString spannableString = new SpannableString(str);
        if (b(o21) && o21.p() == null) {
            AbstractC3167aV0.o(spannableString, o21.o(), f, interfaceC4988gz);
            f2 = f;
            interfaceC4988gz2 = interfaceC4988gz;
        } else {
            C3197ac0 c3197ac0P = o21.p();
            if (c3197ac0P == null) {
                c3197ac0P = C3197ac0.c.a();
            }
            f2 = f;
            interfaceC4988gz2 = interfaceC4988gz;
            AbstractC3167aV0.n(spannableString, o21.o(), f2, interfaceC4988gz2, c3197ac0P);
        }
        AbstractC3167aV0.v(spannableString, o21.z(), f2, interfaceC4988gz2);
        AbstractC3167aV0.t(spannableString, o21, list, interfaceC4988gz2, interfaceC4553fR);
        AbstractC0905Fu0.b(spannableString, list2, interfaceC4988gz2);
        return spannableString;
    }

    public static final boolean b(O21 o21) {
        G10.g(o21, "<this>");
        o21.s();
        return true;
    }
}
