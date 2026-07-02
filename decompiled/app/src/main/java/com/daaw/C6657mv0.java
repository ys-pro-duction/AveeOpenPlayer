package com.daaw;

import android.graphics.Typeface;
import com.daaw.PO;

/* JADX INFO: renamed from: com.daaw.mv0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6657mv0 implements InterfaceC6099kv0 {
    @Override // com.daaw.InterfaceC6099kv0
    public Typeface a(SO so, int i) {
        G10.g(so, "fontWeight");
        return c(null, so, i);
    }

    @Override // com.daaw.InterfaceC6099kv0
    public Typeface b(C6520mS c6520mS, SO so, int i) {
        G10.g(c6520mS, "name");
        G10.g(so, "fontWeight");
        return c(c6520mS.m(), so, i);
    }

    public final Typeface c(String str, SO so, int i) {
        PO.a aVar = PO.b;
        if (PO.f(i, aVar.b()) && G10.c(so, SO.C.d()) && (str == null || str.length() == 0)) {
            Typeface typeface = Typeface.DEFAULT;
            G10.f(typeface, "DEFAULT");
            return typeface;
        }
        Typeface typefaceCreate = Typeface.create(str == null ? Typeface.DEFAULT : Typeface.create(str, 0), so.o(), PO.f(i, aVar.a()));
        G10.f(typefaceCreate, "create(\n            fami…ontStyle.Italic\n        )");
        return typefaceCreate;
    }
}
