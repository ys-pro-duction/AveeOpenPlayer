package com.daaw;

import com.daaw.C5024h60;
import com.daaw.C5193hj0;
import com.daaw.InterfaceC10072z80;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC7513q extends r implements F7 {
    public final InterfaceC5471ij0 c;

    /* JADX INFO: renamed from: com.daaw.q$a */
    public static final class a implements InterfaceC10072z80.d {
        public final /* synthetic */ HashMap b;
        public final /* synthetic */ InterfaceC10072z80 c;
        public final /* synthetic */ HashMap d;
        public final /* synthetic */ HashMap e;

        /* JADX INFO: renamed from: com.daaw.q$a$a, reason: collision with other inner class name */
        public final class C0224a extends b implements InterfaceC10072z80.e {
            public final /* synthetic */ a d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0224a(a aVar, C5193hj0 c5193hj0) {
                super(aVar, c5193hj0);
                G10.g(c5193hj0, "signature");
                this.d = aVar;
            }

            @Override // com.daaw.InterfaceC10072z80.e
            public InterfaceC10072z80.a b(int i, C6607ml c6607ml, RU0 ru0) {
                G10.g(c6607ml, "classId");
                G10.g(ru0, "source");
                C5193hj0 c5193hj0E = C5193hj0.b.e(d(), i);
                List arrayList = (List) this.d.b.get(c5193hj0E);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    this.d.b.put(c5193hj0E, arrayList);
                }
                return AbstractC7513q.this.y(c6607ml, ru0, arrayList);
            }
        }

        /* JADX INFO: renamed from: com.daaw.q$a$b */
        public class b implements InterfaceC10072z80.c {
            public final C5193hj0 a;
            public final ArrayList b;
            public final /* synthetic */ a c;

            public b(a aVar, C5193hj0 c5193hj0) {
                G10.g(c5193hj0, "signature");
                this.c = aVar;
                this.a = c5193hj0;
                this.b = new ArrayList();
            }

            @Override // com.daaw.InterfaceC10072z80.c
            public void a() {
                if (this.b.isEmpty()) {
                    return;
                }
                this.c.b.put(this.a, this.b);
            }

            @Override // com.daaw.InterfaceC10072z80.c
            public InterfaceC10072z80.a c(C6607ml c6607ml, RU0 ru0) {
                G10.g(c6607ml, "classId");
                G10.g(ru0, "source");
                return AbstractC7513q.this.y(c6607ml, ru0, this.b);
            }

            public final C5193hj0 d() {
                return this.a;
            }
        }

        public a(HashMap map, InterfaceC10072z80 interfaceC10072z80, HashMap map2, HashMap map3) {
            this.b = map;
            this.c = interfaceC10072z80;
            this.d = map2;
            this.e = map3;
        }

        @Override // com.daaw.InterfaceC10072z80.d
        public InterfaceC10072z80.c a(C2352Tm0 c2352Tm0, String str, Object obj) {
            Object objI;
            G10.g(c2352Tm0, "name");
            G10.g(str, "desc");
            C5193hj0.a aVar = C5193hj0.b;
            String strC = c2352Tm0.c();
            G10.f(strC, "asString(...)");
            C5193hj0 c5193hj0A = aVar.a(strC, str);
            if (obj != null && (objI = AbstractC7513q.this.I(str, obj)) != null) {
                this.e.put(c5193hj0A, objI);
            }
            return new b(this, c5193hj0A);
        }

        @Override // com.daaw.InterfaceC10072z80.d
        public InterfaceC10072z80.e b(C2352Tm0 c2352Tm0, String str) {
            G10.g(c2352Tm0, "name");
            G10.g(str, "desc");
            C5193hj0.a aVar = C5193hj0.b;
            String strC = c2352Tm0.c();
            G10.f(strC, "asString(...)");
            return new C0224a(this, aVar.d(strC, str));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC7513q(InterfaceC10174zX0 interfaceC10174zX0, InterfaceC8956v80 interfaceC8956v80) {
        super(interfaceC8956v80);
        G10.g(interfaceC10174zX0, "storageManager");
        G10.g(interfaceC8956v80, "kotlinClassFinder");
        this.c = interfaceC10174zX0.g(new C6676n(this));
    }

    public static final Object G(C3351b8 c3351b8, C5193hj0 c5193hj0) {
        G10.g(c3351b8, "$this$loadConstantFromProperty");
        G10.g(c5193hj0, "it");
        return c3351b8.b().get(c5193hj0);
    }

    public static final Object K(C3351b8 c3351b8, C5193hj0 c5193hj0) {
        G10.g(c3351b8, "$this$loadConstantFromProperty");
        G10.g(c5193hj0, "it");
        return c3351b8.c().get(c5193hj0);
    }

    public static final C3351b8 L(AbstractC7513q abstractC7513q, InterfaceC10072z80 interfaceC10072z80) {
        G10.g(abstractC7513q, "this$0");
        G10.g(interfaceC10072z80, "kotlinClass");
        return abstractC7513q.H(interfaceC10072z80);
    }

    @Override // com.daaw.r
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public C3351b8 q(InterfaceC10072z80 interfaceC10072z80) {
        G10.g(interfaceC10072z80, "binaryClass");
        return (C3351b8) this.c.invoke(interfaceC10072z80);
    }

    public final boolean F(C6607ml c6607ml, Map map) {
        G10.g(c6607ml, "annotationClassId");
        G10.g(map, "arguments");
        if (!G10.c(c6607ml, C6812nV0.a.a())) {
            return false;
        }
        Object obj = map.get(C2352Tm0.l("value"));
        C5024h60 c5024h60 = obj instanceof C5024h60 ? (C5024h60) obj : null;
        if (c5024h60 == null) {
            return false;
        }
        Object objB = c5024h60.b();
        C5024h60.b.C0182b c0182b = objB instanceof C5024h60.b.C0182b ? (C5024h60.b.C0182b) objB : null;
        if (c0182b == null) {
            return false;
        }
        return w(c0182b.b());
    }

    public final C3351b8 H(InterfaceC10072z80 interfaceC10072z80) {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        interfaceC10072z80.b(new a(map, interfaceC10072z80, map3, map2), r(interfaceC10072z80));
        return new C3351b8(map, map2, map3);
    }

    public abstract Object I(String str, Object obj);

    public final Object J(TA0 ta0, HA0 ha0, B7 b7, I80 i80, InterfaceC3429bR interfaceC3429bR) {
        Object objInvoke;
        InterfaceC10072z80 interfaceC10072z80P = p(ta0, r.b.a(ta0, true, true, SM.B.d(ha0.e0()), C7540q50.f(ha0), v(), u()));
        if (interfaceC10072z80P == null) {
            return null;
        }
        C5193hj0 c5193hj0S = s(ha0, ta0.b(), ta0.d(), b7, interfaceC10072z80P.a().d().d(ZA.b.a()));
        if (c5193hj0S == null || (objInvoke = interfaceC3429bR.invoke(this.c.invoke(interfaceC10072z80P), c5193hj0S)) == null) {
            return null;
        }
        return C4302ea1.d(i80) ? M(objInvoke) : objInvoke;
    }

    public abstract Object M(Object obj);

    @Override // com.daaw.F7
    public Object e(TA0 ta0, HA0 ha0, I80 i80) {
        G10.g(ta0, "container");
        G10.g(ha0, "proto");
        G10.g(i80, "expectedType");
        return J(ta0, ha0, B7.PROPERTY_GETTER, i80, C6955o.B);
    }

    @Override // com.daaw.F7
    public Object g(TA0 ta0, HA0 ha0, I80 i80) {
        G10.g(ta0, "container");
        G10.g(ha0, "proto");
        G10.g(i80, "expectedType");
        return J(ta0, ha0, B7.PROPERTY, i80, C7234p.B);
    }
}
