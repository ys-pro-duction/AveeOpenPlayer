package com.daaw;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class BA {
    public final C9523xA a;
    public final InterfaceC2664Wm0 b;
    public final InterfaceC8612tw c;
    public final B81 d;
    public final C10202zd1 e;
    public final AbstractC1156If f;
    public final WA g;
    public final K71 h;
    public final C3511bj0 i;

    public BA(C9523xA c9523xA, InterfaceC2664Wm0 interfaceC2664Wm0, InterfaceC8612tw interfaceC8612tw, B81 b81, C10202zd1 c10202zd1, AbstractC1156If abstractC1156If, WA wa, K71 k71, List list) {
        String strC;
        G10.g(c9523xA, "components");
        G10.g(interfaceC2664Wm0, "nameResolver");
        G10.g(interfaceC8612tw, "containingDeclaration");
        G10.g(b81, "typeTable");
        G10.g(c10202zd1, "versionRequirementTable");
        G10.g(abstractC1156If, "metadataVersion");
        G10.g(list, "typeParameters");
        this.a = c9523xA;
        this.b = interfaceC2664Wm0;
        this.c = interfaceC8612tw;
        this.d = b81;
        this.e = c10202zd1;
        this.f = abstractC1156If;
        this.g = wa;
        this.h = new K71(this, k71, list, "Deserializer for \"" + interfaceC8612tw.getName() + '\"', (wa == null || (strC = wa.c()) == null) ? "[container not found]" : strC);
        this.i = new C3511bj0(this);
    }

    public static /* synthetic */ BA b(BA ba, InterfaceC8612tw interfaceC8612tw, List list, InterfaceC2664Wm0 interfaceC2664Wm0, B81 b81, C10202zd1 c10202zd1, AbstractC1156If abstractC1156If, int i, Object obj) {
        if ((i & 4) != 0) {
            interfaceC2664Wm0 = ba.b;
        }
        InterfaceC2664Wm0 interfaceC2664Wm02 = interfaceC2664Wm0;
        if ((i & 8) != 0) {
            b81 = ba.d;
        }
        B81 b812 = b81;
        if ((i & 16) != 0) {
            c10202zd1 = ba.e;
        }
        C10202zd1 c10202zd12 = c10202zd1;
        if ((i & 32) != 0) {
            abstractC1156If = ba.f;
        }
        return ba.a(interfaceC8612tw, list, interfaceC2664Wm02, b812, c10202zd12, abstractC1156If);
    }

    public final BA a(InterfaceC8612tw interfaceC8612tw, List list, InterfaceC2664Wm0 interfaceC2664Wm0, B81 b81, C10202zd1 c10202zd1, AbstractC1156If abstractC1156If) {
        G10.g(interfaceC8612tw, "descriptor");
        G10.g(list, "typeParameterProtos");
        G10.g(interfaceC2664Wm0, "nameResolver");
        G10.g(b81, "typeTable");
        G10.g(c10202zd1, "versionRequirementTable");
        G10.g(abstractC1156If, "metadataVersion");
        return new BA(this.a, interfaceC2664Wm0, interfaceC8612tw, b81, AbstractC0309Ad1.b(abstractC1156If) ? c10202zd1 : this.e, abstractC1156If, this.g, this.h, list);
    }

    public final C9523xA c() {
        return this.a;
    }

    public final WA d() {
        return this.g;
    }

    public final InterfaceC8612tw e() {
        return this.c;
    }

    public final C3511bj0 f() {
        return this.i;
    }

    public final InterfaceC2664Wm0 g() {
        return this.b;
    }

    public final InterfaceC10174zX0 h() {
        return this.a.u();
    }

    public final K71 i() {
        return this.h;
    }

    public final B81 j() {
        return this.d;
    }

    public final C10202zd1 k() {
        return this.e;
    }
}
