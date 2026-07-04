package com.daaw;

import com.daaw.C9245wA0;

/* JADX INFO: loaded from: classes4.dex */
public abstract class TA0 {
    public final InterfaceC2664Wm0 a;
    public final B81 b;
    public final RU0 c;

    public static final class a extends TA0 {
        public final C9245wA0 d;
        public final a e;
        public final C6607ml f;
        public final C9245wA0.c g;
        public final boolean h;
        public final boolean i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C9245wA0 c9245wA0, InterfaceC2664Wm0 interfaceC2664Wm0, B81 b81, RU0 ru0, a aVar) {
            super(interfaceC2664Wm0, b81, ru0, null);
            G10.g(c9245wA0, "classProto");
            G10.g(interfaceC2664Wm0, "nameResolver");
            G10.g(b81, "typeTable");
            this.d = c9245wA0;
            this.e = aVar;
            this.f = AbstractC3252an0.a(interfaceC2664Wm0, c9245wA0.I0());
            C9245wA0.c cVar = (C9245wA0.c) SM.f.d(c9245wA0.H0());
            this.g = cVar == null ? C9245wA0.c.CLASS : cVar;
            Boolean boolD = SM.g.d(c9245wA0.H0());
            G10.f(boolD, "get(...)");
            this.h = boolD.booleanValue();
            Boolean boolD2 = SM.h.d(c9245wA0.H0());
            G10.f(boolD2, "get(...)");
            this.i = boolD2.booleanValue();
        }

        @Override // com.daaw.TA0
        public AP a() {
            return this.f.a();
        }

        public final C6607ml e() {
            return this.f;
        }

        public final C9245wA0 f() {
            return this.d;
        }

        public final C9245wA0.c g() {
            return this.g;
        }

        public final a h() {
            return this.e;
        }

        public final boolean i() {
            return this.h;
        }
    }

    public static final class b extends TA0 {
        public final AP d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(AP ap, InterfaceC2664Wm0 interfaceC2664Wm0, B81 b81, RU0 ru0) {
            super(interfaceC2664Wm0, b81, ru0, null);
            G10.g(ap, "fqName");
            G10.g(interfaceC2664Wm0, "nameResolver");
            G10.g(b81, "typeTable");
            this.d = ap;
        }

        @Override // com.daaw.TA0
        public AP a() {
            return this.d;
        }
    }

    public /* synthetic */ TA0(InterfaceC2664Wm0 interfaceC2664Wm0, B81 b81, RU0 ru0, AbstractC2911Yw abstractC2911Yw) {
        this(interfaceC2664Wm0, b81, ru0);
    }

    public abstract AP a();

    public final InterfaceC2664Wm0 b() {
        return this.a;
    }

    public final RU0 c() {
        return this.c;
    }

    public final B81 d() {
        return this.b;
    }

    public String toString() {
        return getClass().getSimpleName() + ": " + a();
    }

    public TA0(InterfaceC2664Wm0 interfaceC2664Wm0, B81 b81, RU0 ru0) {
        this.a = interfaceC2664Wm0;
        this.b = b81;
        this.c = ru0;
    }
}
