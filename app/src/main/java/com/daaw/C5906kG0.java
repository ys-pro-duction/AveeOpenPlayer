package com.daaw;

import java.util.List;

/* JADX INFO: renamed from: com.daaw.kG0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C5906kG0 {
    public J50 b(Class cls) {
        return new C8001rl(cls);
    }

    public InterfaceC6429m60 c(Class cls, String str) {
        return new C5238hs0(cls, str);
    }

    public String g(InterfaceC7353pR interfaceC7353pR) {
        String string = interfaceC7353pR.getClass().getGenericInterfaces()[0].toString();
        return string.startsWith("kotlin.jvm.functions.") ? string.substring(21) : string;
    }

    public String h(AbstractC4192e90 abstractC4192e90) {
        return g(abstractC4192e90);
    }

    public InterfaceC7550q70 i(InterfaceC5580j60 interfaceC5580j60, List list, boolean z) {
        return new C7277p81(interfaceC5580j60, list, z);
    }

    public InterfaceC8381t60 a(AbstractC9312wR abstractC9312wR) {
        return abstractC9312wR;
    }

    public F60 d(AbstractC6046km0 abstractC6046km0) {
        return abstractC6046km0;
    }

    public X60 e(AbstractC5882kA0 abstractC5882kA0) {
        return abstractC5882kA0;
    }

    public InterfaceC3347b70 f(AbstractC6449mA0 abstractC6449mA0) {
        return abstractC6449mA0;
    }
}
