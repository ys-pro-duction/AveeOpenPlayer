package com.daaw;

import com.daaw.AbstractC7898rO;

/* JADX INFO: renamed from: com.daaw.uO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C8735uO implements AbstractC7898rO.b {
    public final InterfaceC2592Vu0 a;
    public final InterfaceC4405ev0 b;
    public final C3915d91 c;
    public final AO d;
    public final C2488Uu0 e;
    public final NQ f;

    /* JADX INFO: renamed from: com.daaw.uO$a */
    public static final class a extends AbstractC4192e90 implements NQ {
        public a() {
            super(1);
        }

        @Override // com.daaw.NQ
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C3636c91 c3636c91) {
            G10.g(c3636c91, "it");
            return C8735uO.this.g(C3636c91.b(c3636c91, null, null, 0, 0, null, 30, null)).getValue();
        }
    }

    /* JADX INFO: renamed from: com.daaw.uO$b */
    public static final class b extends AbstractC4192e90 implements NQ {
        public final /* synthetic */ C3636c91 C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C3636c91 c3636c91) {
            super(1);
            this.C = c3636c91;
        }

        @Override // com.daaw.NQ
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC4193e91 invoke(NQ nq) {
            G10.g(nq, "onAsyncCompletion");
            InterfaceC4193e91 interfaceC4193e91A = C8735uO.this.d.a(this.C, C8735uO.this.f(), nq, C8735uO.this.f);
            if (interfaceC4193e91A != null) {
                return interfaceC4193e91A;
            }
            InterfaceC4193e91 interfaceC4193e91A2 = C8735uO.this.e.a(this.C, C8735uO.this.f(), nq, C8735uO.this.f);
            if (interfaceC4193e91A2 != null) {
                return interfaceC4193e91A2;
            }
            throw new IllegalStateException("Could not load font");
        }
    }

    public C8735uO(InterfaceC2592Vu0 interfaceC2592Vu0, InterfaceC4405ev0 interfaceC4405ev0, C3915d91 c3915d91, AO ao, C2488Uu0 c2488Uu0) {
        G10.g(interfaceC2592Vu0, "platformFontLoader");
        G10.g(interfaceC4405ev0, "platformResolveInterceptor");
        G10.g(c3915d91, "typefaceRequestCache");
        G10.g(ao, "fontListFontFamilyTypefaceAdapter");
        G10.g(c2488Uu0, "platformFamilyTypefaceAdapter");
        this.a = interfaceC2592Vu0;
        this.b = interfaceC4405ev0;
        this.c = c3915d91;
        this.d = ao;
        this.e = c2488Uu0;
        this.f = new a();
    }

    @Override // com.daaw.AbstractC7898rO.b
    public InterfaceC6258lW0 a(AbstractC7898rO abstractC7898rO, SO so, int i, int i2) {
        G10.g(so, "fontWeight");
        return g(new C3636c91(this.b.c(abstractC7898rO), this.b.d(so), this.b.a(i), this.b.b(i2), this.a.c(), null));
    }

    public final InterfaceC2592Vu0 f() {
        return this.a;
    }

    public final InterfaceC6258lW0 g(C3636c91 c3636c91) {
        return this.c.c(c3636c91, new b(c3636c91));
    }

    public /* synthetic */ C8735uO(InterfaceC2592Vu0 interfaceC2592Vu0, InterfaceC4405ev0 interfaceC4405ev0, C3915d91 c3915d91, AO ao, C2488Uu0 c2488Uu0, int i, AbstractC2911Yw abstractC2911Yw) {
        this(interfaceC2592Vu0, (i & 2) != 0 ? InterfaceC4405ev0.a.a() : interfaceC4405ev0, (i & 4) != 0 ? AbstractC9021vO.b() : c3915d91, (i & 8) != 0 ? new AO(AbstractC9021vO.a(), null, 2, 0 == true ? 1 : 0) : ao, (i & 16) != 0 ? new C2488Uu0() : c2488Uu0);
    }
}
