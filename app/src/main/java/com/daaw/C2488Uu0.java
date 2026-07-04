package com.daaw;

import android.graphics.Typeface;
import com.daaw.InterfaceC4193e91;

/* JADX INFO: renamed from: com.daaw.Uu0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2488Uu0 {
    public final InterfaceC6099kv0 a = AbstractC7215ov0.a();

    public InterfaceC4193e91 a(C3636c91 c3636c91, InterfaceC2592Vu0 interfaceC2592Vu0, NQ nq, NQ nq2) {
        Typeface typefaceB;
        G10.g(c3636c91, "typefaceRequest");
        G10.g(interfaceC2592Vu0, "platformFontLoader");
        G10.g(nq, "onAsyncCompletion");
        G10.g(nq2, "createDefaultTypeface");
        AbstractC7898rO abstractC7898rOC = c3636c91.c();
        if (abstractC7898rOC == null ? true : abstractC7898rOC instanceof C8058rx) {
            typefaceB = this.a.a(c3636c91.f(), c3636c91.d());
        } else {
            if (!(abstractC7898rOC instanceof C6520mS)) {
                return null;
            }
            typefaceB = this.a.b((C6520mS) c3636c91.c(), c3636c91.f(), c3636c91.d());
        }
        return new InterfaceC4193e91.b(typefaceB, false, 2, null);
    }
}
