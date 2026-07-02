package com.daaw;

import com.daaw.InterfaceC10072z80;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.Gf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0948Gf extends AbstractC7513q {
    public final InterfaceC2968Zk0 d;
    public final C0560Co0 e;
    public final Q7 f;
    public C4740g50 g;

    /* JADX INFO: renamed from: com.daaw.Gf$a */
    public abstract class a implements InterfaceC10072z80.a {

        /* JADX INFO: renamed from: com.daaw.Gf$a$a, reason: collision with other inner class name */
        public static final class C0063a implements InterfaceC10072z80.a {
            public final /* synthetic */ InterfaceC10072z80.a a;
            public final /* synthetic */ InterfaceC10072z80.a b;
            public final /* synthetic */ a c;
            public final /* synthetic */ C2352Tm0 d;
            public final /* synthetic */ ArrayList e;

            public C0063a(InterfaceC10072z80.a aVar, a aVar2, C2352Tm0 c2352Tm0, ArrayList arrayList) {
                this.b = aVar;
                this.c = aVar2;
                this.d = c2352Tm0;
                this.e = arrayList;
                this.a = aVar;
            }

            @Override // com.daaw.InterfaceC10072z80.a
            public void a() {
                this.b.a();
                this.c.h(this.d, new Z7((O7) AbstractC2455Um.C0(this.e)));
            }

            @Override // com.daaw.InterfaceC10072z80.a
            public void b(C2352Tm0 c2352Tm0, C7165ol c7165ol) {
                G10.g(c7165ol, "value");
                this.a.b(c2352Tm0, c7165ol);
            }

            @Override // com.daaw.InterfaceC10072z80.a
            public InterfaceC10072z80.b c(C2352Tm0 c2352Tm0) {
                return this.a.c(c2352Tm0);
            }

            @Override // com.daaw.InterfaceC10072z80.a
            public void d(C2352Tm0 c2352Tm0, Object obj) {
                this.a.d(c2352Tm0, obj);
            }

            @Override // com.daaw.InterfaceC10072z80.a
            public void e(C2352Tm0 c2352Tm0, C6607ml c6607ml, C2352Tm0 c2352Tm02) {
                G10.g(c6607ml, "enumClassId");
                G10.g(c2352Tm02, "enumEntryName");
                this.a.e(c2352Tm0, c6607ml, c2352Tm02);
            }

            @Override // com.daaw.InterfaceC10072z80.a
            public InterfaceC10072z80.a f(C2352Tm0 c2352Tm0, C6607ml c6607ml) {
                G10.g(c6607ml, "classId");
                return this.a.f(c2352Tm0, c6607ml);
            }
        }

        /* JADX INFO: renamed from: com.daaw.Gf$a$b */
        public static final class b implements InterfaceC10072z80.b {
            public final ArrayList a = new ArrayList();
            public final /* synthetic */ C0948Gf b;
            public final /* synthetic */ C2352Tm0 c;
            public final /* synthetic */ a d;

            /* JADX INFO: renamed from: com.daaw.Gf$a$b$a, reason: collision with other inner class name */
            public static final class C0064a implements InterfaceC10072z80.a {
                public final /* synthetic */ InterfaceC10072z80.a a;
                public final /* synthetic */ InterfaceC10072z80.a b;
                public final /* synthetic */ b c;
                public final /* synthetic */ ArrayList d;

                public C0064a(InterfaceC10072z80.a aVar, b bVar, ArrayList arrayList) {
                    this.b = aVar;
                    this.c = bVar;
                    this.d = arrayList;
                    this.a = aVar;
                }

                @Override // com.daaw.InterfaceC10072z80.a
                public void a() {
                    this.b.a();
                    this.c.a.add(new Z7((O7) AbstractC2455Um.C0(this.d)));
                }

                @Override // com.daaw.InterfaceC10072z80.a
                public void b(C2352Tm0 c2352Tm0, C7165ol c7165ol) {
                    G10.g(c7165ol, "value");
                    this.a.b(c2352Tm0, c7165ol);
                }

                @Override // com.daaw.InterfaceC10072z80.a
                public InterfaceC10072z80.b c(C2352Tm0 c2352Tm0) {
                    return this.a.c(c2352Tm0);
                }

                @Override // com.daaw.InterfaceC10072z80.a
                public void d(C2352Tm0 c2352Tm0, Object obj) {
                    this.a.d(c2352Tm0, obj);
                }

                @Override // com.daaw.InterfaceC10072z80.a
                public void e(C2352Tm0 c2352Tm0, C6607ml c6607ml, C2352Tm0 c2352Tm02) {
                    G10.g(c6607ml, "enumClassId");
                    G10.g(c2352Tm02, "enumEntryName");
                    this.a.e(c2352Tm0, c6607ml, c2352Tm02);
                }

                @Override // com.daaw.InterfaceC10072z80.a
                public InterfaceC10072z80.a f(C2352Tm0 c2352Tm0, C6607ml c6607ml) {
                    G10.g(c6607ml, "classId");
                    return this.a.f(c2352Tm0, c6607ml);
                }
            }

            public b(C0948Gf c0948Gf, C2352Tm0 c2352Tm0, a aVar) {
                this.b = c0948Gf;
                this.c = c2352Tm0;
                this.d = aVar;
            }

            @Override // com.daaw.InterfaceC10072z80.b
            public void a() {
                this.d.g(this.c, this.a);
            }

            @Override // com.daaw.InterfaceC10072z80.b
            public void b(Object obj) {
                this.a.add(this.b.O(this.c, obj));
            }

            @Override // com.daaw.InterfaceC10072z80.b
            public void c(C6607ml c6607ml, C2352Tm0 c2352Tm0) {
                G10.g(c6607ml, "enumClassId");
                G10.g(c2352Tm0, "enumEntryName");
                this.a.add(new C3946dH(c6607ml, c2352Tm0));
            }

            @Override // com.daaw.InterfaceC10072z80.b
            public InterfaceC10072z80.a d(C6607ml c6607ml) {
                G10.g(c6607ml, "classId");
                ArrayList arrayList = new ArrayList();
                C0948Gf c0948Gf = this.b;
                RU0 ru0 = RU0.a;
                G10.f(ru0, "NO_SOURCE");
                InterfaceC10072z80.a aVarX = c0948Gf.x(c6607ml, ru0, arrayList);
                G10.d(aVarX);
                return new C0064a(aVarX, this, arrayList);
            }

            @Override // com.daaw.InterfaceC10072z80.b
            public void e(C7165ol c7165ol) {
                G10.g(c7165ol, "value");
                this.a.add(new C5024h60(c7165ol));
            }
        }

        public a() {
        }

        @Override // com.daaw.InterfaceC10072z80.a
        public void b(C2352Tm0 c2352Tm0, C7165ol c7165ol) {
            G10.g(c7165ol, "value");
            h(c2352Tm0, new C5024h60(c7165ol));
        }

        @Override // com.daaw.InterfaceC10072z80.a
        public InterfaceC10072z80.b c(C2352Tm0 c2352Tm0) {
            return new b(C0948Gf.this, c2352Tm0, this);
        }

        @Override // com.daaw.InterfaceC10072z80.a
        public void d(C2352Tm0 c2352Tm0, Object obj) {
            h(c2352Tm0, C0948Gf.this.O(c2352Tm0, obj));
        }

        @Override // com.daaw.InterfaceC10072z80.a
        public void e(C2352Tm0 c2352Tm0, C6607ml c6607ml, C2352Tm0 c2352Tm02) {
            G10.g(c6607ml, "enumClassId");
            G10.g(c2352Tm02, "enumEntryName");
            h(c2352Tm0, new C3946dH(c6607ml, c2352Tm02));
        }

        @Override // com.daaw.InterfaceC10072z80.a
        public InterfaceC10072z80.a f(C2352Tm0 c2352Tm0, C6607ml c6607ml) {
            G10.g(c6607ml, "classId");
            ArrayList arrayList = new ArrayList();
            C0948Gf c0948Gf = C0948Gf.this;
            RU0 ru0 = RU0.a;
            G10.f(ru0, "NO_SOURCE");
            InterfaceC10072z80.a aVarX = c0948Gf.x(c6607ml, ru0, arrayList);
            G10.d(aVarX);
            return new C0063a(aVarX, this, c2352Tm0, arrayList);
        }

        public abstract void g(C2352Tm0 c2352Tm0, ArrayList arrayList);

        public abstract void h(C2352Tm0 c2352Tm0, AbstractC2887Yq abstractC2887Yq);
    }

    /* JADX INFO: renamed from: com.daaw.Gf$b */
    public static final class b extends a {
        public final HashMap b;
        public final /* synthetic */ InterfaceC4923gl d;
        public final /* synthetic */ C6607ml e;
        public final /* synthetic */ List f;
        public final /* synthetic */ RU0 g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC4923gl interfaceC4923gl, C6607ml c6607ml, List list, RU0 ru0) {
            super();
            this.d = interfaceC4923gl;
            this.e = c6607ml;
            this.f = list;
            this.g = ru0;
            this.b = new HashMap();
        }

        @Override // com.daaw.InterfaceC10072z80.a
        public void a() {
            if (C0948Gf.this.F(this.e, this.b) || C0948Gf.this.w(this.e)) {
                return;
            }
            this.f.add(new P7(this.d.s(), this.b, this.g));
        }

        @Override // com.daaw.C0948Gf.a
        public void g(C2352Tm0 c2352Tm0, ArrayList arrayList) {
            G10.g(arrayList, "elements");
            if (c2352Tm0 == null) {
                return;
            }
            InterfaceC9918yc1 interfaceC9918yc1B = AbstractC6169lA.b(c2352Tm0, this.d);
            if (interfaceC9918yc1B != null) {
                HashMap map = this.b;
                C3271ar c3271ar = C3271ar.a;
                List listC = AbstractC1392Km.c(arrayList);
                I80 type = interfaceC9918yc1B.getType();
                G10.f(type, "getType(...)");
                map.put(c2352Tm0, c3271ar.b(listC, type));
                return;
            }
            if (C0948Gf.this.w(this.e) && G10.c(c2352Tm0.c(), "value")) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : arrayList) {
                    if (obj instanceof Z7) {
                        arrayList2.add(obj);
                    }
                }
                List list = this.f;
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    list.add((O7) ((Z7) it.next()).b());
                }
            }
        }

        @Override // com.daaw.C0948Gf.a
        public void h(C2352Tm0 c2352Tm0, AbstractC2887Yq abstractC2887Yq) {
            G10.g(abstractC2887Yq, "value");
            if (c2352Tm0 != null) {
                this.b.put(c2352Tm0, abstractC2887Yq);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0948Gf(InterfaceC2968Zk0 interfaceC2968Zk0, C0560Co0 c0560Co0, InterfaceC10174zX0 interfaceC10174zX0, InterfaceC8956v80 interfaceC8956v80) {
        super(interfaceC10174zX0, interfaceC8956v80);
        G10.g(interfaceC2968Zk0, "module");
        G10.g(c0560Co0, "notFoundClasses");
        G10.g(interfaceC10174zX0, "storageManager");
        G10.g(interfaceC8956v80, "kotlinClassFinder");
        this.d = interfaceC2968Zk0;
        this.e = c0560Co0;
        this.f = new Q7(interfaceC2968Zk0, c0560Co0);
        this.g = C4740g50.i;
    }

    public final AbstractC2887Yq O(C2352Tm0 c2352Tm0, Object obj) {
        AbstractC2887Yq abstractC2887YqE = C3271ar.a.e(obj, this.d);
        if (abstractC2887YqE != null) {
            return abstractC2887YqE;
        }
        return CH.b.a("Unsupported annotation argument: " + c2352Tm0);
    }

    @Override // com.daaw.r, com.daaw.R7
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public O7 k(C8966vA0 c8966vA0, InterfaceC2664Wm0 interfaceC2664Wm0) {
        G10.g(c8966vA0, "proto");
        G10.g(interfaceC2664Wm0, "nameResolver");
        return this.f.a(c8966vA0, interfaceC2664Wm0);
    }

    @Override // com.daaw.AbstractC7513q
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public AbstractC2887Yq I(String str, Object obj) {
        G10.g(str, "desc");
        G10.g(obj, "initializer");
        if (BY0.z("ZBCS", str, false, 2, null)) {
            int iIntValue = ((Integer) obj).intValue();
            int iHashCode = str.hashCode();
            if (iHashCode == 66) {
                if (str.equals("B")) {
                    obj = Byte.valueOf((byte) iIntValue);
                }
                throw new AssertionError(str);
            }
            if (iHashCode == 67) {
                if (str.equals("C")) {
                    obj = Character.valueOf((char) iIntValue);
                }
                throw new AssertionError(str);
            }
            if (iHashCode == 83) {
                if (str.equals("S")) {
                    obj = Short.valueOf((short) iIntValue);
                }
                throw new AssertionError(str);
            }
            if (iHashCode == 90 && str.equals("Z")) {
                obj = Boolean.valueOf(iIntValue != 0);
            }
            throw new AssertionError(str);
        }
        return C3271ar.a.e(obj, this.d);
    }

    public final InterfaceC4923gl R(C6607ml c6607ml) {
        return AbstractC5366iL.d(this.d, c6607ml, this.e);
    }

    public void S(C4740g50 c4740g50) {
        G10.g(c4740g50, "<set-?>");
        this.g = c4740g50;
    }

    @Override // com.daaw.AbstractC7513q
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
    public AbstractC2887Yq M(AbstractC2887Yq abstractC2887Yq) {
        G10.g(abstractC2887Yq, "constant");
        return abstractC2887Yq instanceof C5187hi ? new C6166l91(((Number) ((C5187hi) abstractC2887Yq).b()).byteValue()) : abstractC2887Yq instanceof WR0 ? new C7561q91(((Number) ((WR0) abstractC2887Yq).b()).shortValue()) : abstractC2887Yq instanceof L00 ? new C6445m91(((Number) ((L00) abstractC2887Yq).b()).intValue()) : abstractC2887Yq instanceof C7410pe0 ? new C7003o91(((Number) ((C7410pe0) abstractC2887Yq).b()).longValue()) : abstractC2887Yq;
    }

    @Override // com.daaw.r
    public C4740g50 u() {
        return this.g;
    }

    @Override // com.daaw.r
    public InterfaceC10072z80.a x(C6607ml c6607ml, RU0 ru0, List list) {
        G10.g(c6607ml, "annotationClassId");
        G10.g(ru0, "source");
        G10.g(list, "result");
        return new b(R(c6607ml), c6607ml, list, ru0);
    }
}
