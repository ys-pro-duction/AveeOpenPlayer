package com.daaw;

import com.daaw.InterfaceC1583Mi;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.mm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C6612mm extends VS {
    public static final a e = new a(null);
    public static final C2352Tm0 f;

    /* JADX INFO: renamed from: com.daaw.mm$a */
    public static final class a {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public final C2352Tm0 a() {
            return C6612mm.f;
        }

        public a() {
        }
    }

    static {
        C2352Tm0 c2352Tm0L = C2352Tm0.l("clone");
        G10.f(c2352Tm0L, "identifier(...)");
        f = c2352Tm0L;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6612mm(InterfaceC10174zX0 interfaceC10174zX0, InterfaceC4923gl interfaceC4923gl) {
        super(interfaceC10174zX0, interfaceC4923gl);
        G10.g(interfaceC10174zX0, "storageManager");
        G10.g(interfaceC4923gl, "containingClass");
    }

    @Override // com.daaw.VS
    public List j() {
        JS0 js0L1 = JS0.l1(m(), InterfaceC3072a8.b.b(), f, InterfaceC1583Mi.a.DECLARATION, RU0.a);
        js0L1.R0(null, m().J0(), AbstractC1599Mm.k(), AbstractC1599Mm.k(), AbstractC1599Mm.k(), AbstractC8400tA.m(m()).i(), EnumC0336Ak0.E, AbstractC8679uA.c);
        return AbstractC1496Lm.e(js0L1);
    }
}
