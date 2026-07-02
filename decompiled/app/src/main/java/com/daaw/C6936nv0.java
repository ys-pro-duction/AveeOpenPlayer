package com.daaw;

import android.graphics.Typeface;

/* JADX INFO: renamed from: com.daaw.nv0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6936nv0 implements InterfaceC6099kv0 {
    @Override // com.daaw.InterfaceC6099kv0
    public Typeface a(SO so, int i) {
        G10.g(so, "fontWeight");
        return c(null, so, i);
    }

    @Override // com.daaw.InterfaceC6099kv0
    public Typeface b(C6520mS c6520mS, SO so, int i) {
        G10.g(c6520mS, "name");
        G10.g(so, "fontWeight");
        Typeface typefaceD = d(AbstractC7215ov0.b(c6520mS.m(), so), so, i);
        return typefaceD == null ? c(c6520mS.m(), so, i) : typefaceD;
    }

    public final Typeface c(String str, SO so, int i) {
        if (PO.f(i, PO.b.b()) && G10.c(so, SO.C.d()) && (str == null || str.length() == 0)) {
            Typeface typeface = Typeface.DEFAULT;
            G10.f(typeface, "DEFAULT");
            return typeface;
        }
        int iC = O5.c(so, i);
        if (str == null || str.length() == 0) {
            Typeface typefaceDefaultFromStyle = Typeface.defaultFromStyle(iC);
            G10.f(typefaceDefaultFromStyle, "{\n            Typeface.d…le(targetStyle)\n        }");
            return typefaceDefaultFromStyle;
        }
        Typeface typefaceCreate = Typeface.create(str, iC);
        G10.f(typefaceCreate, "{\n            Typeface.c…y, targetStyle)\n        }");
        return typefaceCreate;
    }

    public final Typeface d(String str, SO so, int i) {
        if (str.length() == 0) {
            return null;
        }
        Typeface typefaceC = c(str, so, i);
        if (G10.c(typefaceC, Typeface.create(Typeface.DEFAULT, O5.c(so, i))) || G10.c(typefaceC, c(null, so, i))) {
            return null;
        }
        return typefaceC;
    }
}
