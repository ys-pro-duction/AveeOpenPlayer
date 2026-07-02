package com.daaw;

/* JADX INFO: loaded from: classes4.dex */
public final class UN0 {
    public final InterfaceC4923gl a;
    public final NQ b;
    public final Q80 c;
    public final InterfaceC0881Fo0 d;
    public static final /* synthetic */ W60[] f = {AbstractC5624jG0.h(new C6728nA0(AbstractC5624jG0.b(UN0.class), "scopeForOwnerModule", "getScopeForOwnerModule()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;"))};
    public static final a e = new a(null);

    public static final class a {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public final UN0 a(InterfaceC4923gl interfaceC4923gl, InterfaceC10174zX0 interfaceC10174zX0, Q80 q80, NQ nq) {
            G10.g(interfaceC4923gl, "classDescriptor");
            G10.g(interfaceC10174zX0, "storageManager");
            G10.g(q80, "kotlinTypeRefinerForOwnerModule");
            G10.g(nq, "scopeFactory");
            return new UN0(interfaceC4923gl, interfaceC10174zX0, nq, q80, null);
        }

        public a() {
        }
    }

    public /* synthetic */ UN0(InterfaceC4923gl interfaceC4923gl, InterfaceC10174zX0 interfaceC10174zX0, NQ nq, Q80 q80, AbstractC2911Yw abstractC2911Yw) {
        this(interfaceC4923gl, interfaceC10174zX0, nq, q80);
    }

    public static final InterfaceC4346ej0 d(UN0 un0, Q80 q80) {
        G10.g(un0, "this$0");
        G10.g(q80, "$kotlinTypeRefiner");
        return (InterfaceC4346ej0) un0.b.invoke(q80);
    }

    public static final InterfaceC4346ej0 f(UN0 un0) {
        G10.g(un0, "this$0");
        return (InterfaceC4346ej0) un0.b.invoke(un0.c);
    }

    public final InterfaceC4346ej0 c(Q80 q80) {
        G10.g(q80, "kotlinTypeRefiner");
        if (!q80.d(AbstractC8400tA.s(this.a))) {
            return e();
        }
        C71 c71K = this.a.k();
        G10.f(c71K, "getTypeConstructor(...)");
        return !q80.e(c71K) ? e() : q80.c(this.a, new TN0(this, q80));
    }

    public final InterfaceC4346ej0 e() {
        return (InterfaceC4346ej0) AbstractC9895yX0.a(this.d, this, f[0]);
    }

    public UN0(InterfaceC4923gl interfaceC4923gl, InterfaceC10174zX0 interfaceC10174zX0, NQ nq, Q80 q80) {
        this.a = interfaceC4923gl;
        this.b = nq;
        this.c = q80;
        this.d = interfaceC10174zX0.h(new SN0(this));
    }
}
