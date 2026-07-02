package com.daaw;

import com.daaw.C6607ml;
import com.daaw.YV0;

/* JADX INFO: renamed from: com.daaw.h60, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C5024h60 extends AbstractC2887Yq {
    public static final a b = new a(null);

    /* JADX INFO: renamed from: com.daaw.h60$a */
    public static final class a {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public final AbstractC2887Yq a(I80 i80) {
            G10.g(i80, "argumentType");
            if (N80.a(i80)) {
                return null;
            }
            I80 type = i80;
            int i = 0;
            while (AbstractC8670u80.c0(type)) {
                type = ((InterfaceC6440m81) AbstractC2455Um.C0(type.L0())).getType();
                i++;
            }
            InterfaceC10240zl interfaceC10240zlC = type.N0().c();
            if (interfaceC10240zlC instanceof InterfaceC4923gl) {
                C6607ml c6607mlN = AbstractC8400tA.n(interfaceC10240zlC);
                return c6607mlN == null ? new C5024h60(new b.a(i80)) : new C5024h60(c6607mlN, i);
            }
            if (!(interfaceC10240zlC instanceof Z71)) {
                return null;
            }
            C6607ml.a aVar = C6607ml.d;
            AP apL = YV0.a.b.l();
            G10.f(apL, "toSafe(...)");
            return new C5024h60(aVar.c(apL), 0);
        }

        public a() {
        }
    }

    /* JADX INFO: renamed from: com.daaw.h60$b */
    public static abstract class b {

        /* JADX INFO: renamed from: com.daaw.h60$b$a */
        public static final class a extends b {
            public final I80 a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(I80 i80) {
                super(null);
                G10.g(i80, "type");
                this.a = i80;
            }

            public final I80 a() {
                return this.a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && G10.c(this.a, ((a) obj).a);
            }

            public int hashCode() {
                return this.a.hashCode();
            }

            public String toString() {
                return "LocalClass(type=" + this.a + ')';
            }
        }

        /* JADX INFO: renamed from: com.daaw.h60$b$b, reason: collision with other inner class name */
        public static final class C0182b extends b {
            public final C7165ol a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0182b(C7165ol c7165ol) {
                super(null);
                G10.g(c7165ol, "value");
                this.a = c7165ol;
            }

            public final int a() {
                return this.a.c();
            }

            public final C6607ml b() {
                return this.a.d();
            }

            public final C7165ol c() {
                return this.a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0182b) && G10.c(this.a, ((C0182b) obj).a);
            }

            public int hashCode() {
                return this.a.hashCode();
            }

            public String toString() {
                return "NormalClass(value=" + this.a + ')';
            }
        }

        public /* synthetic */ b(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public b() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5024h60(b bVar) {
        super(bVar);
        G10.g(bVar, "value");
    }

    @Override // com.daaw.AbstractC2887Yq
    public I80 a(InterfaceC2968Zk0 interfaceC2968Zk0) {
        G10.g(interfaceC2968Zk0, "module");
        C8387t71 c8387t71J = C8387t71.C.j();
        InterfaceC4923gl interfaceC4923glE = interfaceC2968Zk0.p().E();
        G10.f(interfaceC4923glE, "getKClass(...)");
        return M80.h(c8387t71J, interfaceC4923glE, AbstractC1496Lm.e(new C6998o81(c(interfaceC2968Zk0))));
    }

    public final I80 c(InterfaceC2968Zk0 interfaceC2968Zk0) {
        G10.g(interfaceC2968Zk0, "module");
        b bVar = (b) b();
        if (bVar instanceof b.a) {
            return ((b.a) b()).a();
        }
        if (!(bVar instanceof b.C0182b)) {
            throw new C6902no0();
        }
        C7165ol c7165olC = ((b.C0182b) b()).c();
        C6607ml c6607mlA = c7165olC.a();
        int iB = c7165olC.b();
        InterfaceC4923gl interfaceC4923glB = AbstractC5366iL.b(interfaceC2968Zk0, c6607mlA);
        if (interfaceC4923glB == null) {
            return BH.d(AH.I, c6607mlA.toString(), String.valueOf(iB));
        }
        YS0 ys0S = interfaceC4923glB.s();
        G10.f(ys0S, "getDefaultType(...)");
        I80 i80D = H81.D(ys0S);
        for (int i = 0; i < iB; i++) {
            i80D = interfaceC2968Zk0.p().l(EnumC1042Hc1.F, i80D);
        }
        return i80D;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C5024h60(C7165ol c7165ol) {
        this(new b.C0182b(c7165ol));
        G10.g(c7165ol, "value");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C5024h60(C6607ml c6607ml, int i) {
        this(new C7165ol(c6607ml, i));
        G10.g(c6607ml, "classId");
    }
}
