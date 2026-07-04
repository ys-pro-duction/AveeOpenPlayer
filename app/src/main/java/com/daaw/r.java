package com.daaw;

import com.daaw.AbstractC4451f50;
import com.daaw.AbstractC5674jS;
import com.daaw.AbstractC7261p50;
import com.daaw.C5193hj0;
import com.daaw.C6607ml;
import com.daaw.C9245wA0;
import com.daaw.InterfaceC10072z80;
import com.daaw.TA0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public abstract class r implements R7 {
    public static final b b = new b(null);
    public final InterfaceC8956v80 a;

    public static abstract class a {
        public abstract Map a();
    }

    public static final class b {
        public /* synthetic */ b(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public final InterfaceC10072z80 a(TA0 ta0, boolean z, boolean z2, Boolean bool, boolean z3, InterfaceC8956v80 interfaceC8956v80, C4740g50 c4740g50) {
            TA0.a aVarH;
            G10.g(ta0, "container");
            G10.g(interfaceC8956v80, "kotlinClassFinder");
            G10.g(c4740g50, "jvmMetadataVersion");
            if (z) {
                if (bool == null) {
                    throw new IllegalStateException(("isConst should not be null for property (container=" + ta0 + ')').toString());
                }
                if (ta0 instanceof TA0.a) {
                    TA0.a aVar = (TA0.a) ta0;
                    if (aVar.g() == C9245wA0.c.INTERFACE) {
                        C6607ml c6607mlE = aVar.e();
                        C2352Tm0 c2352Tm0L = C2352Tm0.l("DefaultImpls");
                        G10.f(c2352Tm0L, "identifier(...)");
                        return AbstractC9235w80.a(interfaceC8956v80, c6607mlE.d(c2352Tm0L), c4740g50);
                    }
                }
                if (bool.booleanValue() && (ta0 instanceof TA0.b)) {
                    RU0 ru0C = ta0.c();
                    C5857k50 c5857k50 = ru0C instanceof C5857k50 ? (C5857k50) ru0C : null;
                    Y40 y40F = c5857k50 != null ? c5857k50.f() : null;
                    if (y40F != null) {
                        C6607ml.a aVar2 = C6607ml.d;
                        String strF = y40F.f();
                        G10.f(strF, "getInternalName(...)");
                        return AbstractC9235w80.a(interfaceC8956v80, aVar2.c(new AP(AY0.r(strF, '/', '.', false, 4, null))), c4740g50);
                    }
                }
            }
            if (z2 && (ta0 instanceof TA0.a)) {
                TA0.a aVar3 = (TA0.a) ta0;
                if (aVar3.g() == C9245wA0.c.COMPANION_OBJECT && (aVarH = aVar3.h()) != null && (aVarH.g() == C9245wA0.c.CLASS || aVarH.g() == C9245wA0.c.ENUM_CLASS || (z3 && (aVarH.g() == C9245wA0.c.INTERFACE || aVarH.g() == C9245wA0.c.ANNOTATION_CLASS)))) {
                    RU0 ru0C2 = aVarH.c();
                    B80 b80 = ru0C2 instanceof B80 ? (B80) ru0C2 : null;
                    if (b80 != null) {
                        return b80.d();
                    }
                    return null;
                }
            }
            if (!(ta0 instanceof TA0.b) || !(ta0.c() instanceof C5857k50)) {
                return null;
            }
            RU0 ru0C3 = ta0.c();
            G10.e(ru0C3, "null cannot be cast to non-null type org.jetbrains.kotlin.load.kotlin.JvmPackagePartSource");
            C5857k50 c5857k502 = (C5857k50) ru0C3;
            InterfaceC10072z80 interfaceC10072z80G = c5857k502.g();
            return interfaceC10072z80G == null ? AbstractC9235w80.a(interfaceC8956v80, c5857k502.d(), c4740g50) : interfaceC10072z80G;
        }

        public b() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class c {
        public static final c B = new c("PROPERTY", 0);
        public static final c C = new c("BACKING_FIELD", 1);
        public static final c D = new c("DELEGATE_FIELD", 2);
        public static final /* synthetic */ c[] E;
        public static final /* synthetic */ YG F;

        static {
            c[] cVarArrA = a();
            E = cVarArrA;
            F = AbstractC3110aH.a(cVarArrA);
        }

        public c(String str, int i) {
        }

        public static final /* synthetic */ c[] a() {
            return new c[]{B, C, D};
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) E.clone();
        }
    }

    public /* synthetic */ class d {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[B7.values().length];
            try {
                iArr[B7.PROPERTY_GETTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[B7.PROPERTY_SETTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[B7.PROPERTY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    public r(InterfaceC8956v80 interfaceC8956v80) {
        G10.g(interfaceC8956v80, "kotlinClassFinder");
        this.a = interfaceC8956v80;
    }

    public static /* synthetic */ List o(r rVar, TA0 ta0, C5193hj0 c5193hj0, boolean z, boolean z2, Boolean bool, boolean z3, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: findClassAndLoadMemberAnnotations");
        }
        if ((i & 4) != 0) {
            z = false;
        }
        if ((i & 8) != 0) {
            z2 = false;
        }
        if ((i & 16) != 0) {
            bool = null;
        }
        if ((i & 32) != 0) {
            z3 = false;
        }
        return rVar.n(ta0, c5193hj0, z, z2, bool, z3);
    }

    public static /* synthetic */ C5193hj0 t(r rVar, InterfaceC2026Qj0 interfaceC2026Qj0, InterfaceC2664Wm0 interfaceC2664Wm0, B81 b81, B7 b7, boolean z, int i, Object obj) {
        if (obj == null) {
            return rVar.s(interfaceC2026Qj0, interfaceC2664Wm0, b81, b7, (i & 16) != 0 ? false : z);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getCallableSignature");
    }

    public final InterfaceC10072z80 A(TA0.a aVar) {
        RU0 ru0C = aVar.c();
        B80 b80 = ru0C instanceof B80 ? (B80) ru0C : null;
        if (b80 != null) {
            return b80.d();
        }
        return null;
    }

    @Override // com.daaw.R7
    public List a(TA0 ta0, InterfaceC2026Qj0 interfaceC2026Qj0, B7 b7) {
        G10.g(ta0, "container");
        G10.g(interfaceC2026Qj0, "proto");
        G10.g(b7, "kind");
        C5193hj0 c5193hj0T = t(this, interfaceC2026Qj0, ta0.b(), ta0.d(), b7, false, 16, null);
        return c5193hj0T != null ? o(this, ta0, C5193hj0.b.e(c5193hj0T, 0), false, false, null, false, 60, null) : AbstractC1599Mm.k();
    }

    @Override // com.daaw.R7
    public List b(KA0 ka0, InterfaceC2664Wm0 interfaceC2664Wm0) {
        G10.g(ka0, "proto");
        G10.g(interfaceC2664Wm0, "nameResolver");
        Object objX = ka0.x(AbstractC7261p50.f);
        G10.f(objX, "getExtension(...)");
        Iterable<C8966vA0> iterable = (Iterable) objX;
        ArrayList arrayList = new ArrayList(AbstractC1703Nm.v(iterable, 10));
        for (C8966vA0 c8966vA0 : iterable) {
            G10.d(c8966vA0);
            arrayList.add(k(c8966vA0, interfaceC2664Wm0));
        }
        return arrayList;
    }

    @Override // com.daaw.R7
    public List c(TA0 ta0, HA0 ha0) {
        G10.g(ta0, "container");
        G10.g(ha0, "proto");
        return z(ta0, ha0, c.C);
    }

    @Override // com.daaw.R7
    public List d(TA0 ta0, InterfaceC2026Qj0 interfaceC2026Qj0, B7 b7, int i, OA0 oa0) {
        G10.g(ta0, "container");
        G10.g(interfaceC2026Qj0, "callableProto");
        G10.g(b7, "kind");
        G10.g(oa0, "proto");
        C5193hj0 c5193hj0T = t(this, interfaceC2026Qj0, ta0.b(), ta0.d(), b7, false, 16, null);
        if (c5193hj0T == null) {
            return AbstractC1599Mm.k();
        }
        return o(this, ta0, C5193hj0.b.e(c5193hj0T, i + m(ta0, interfaceC2026Qj0)), false, false, null, false, 60, null);
    }

    @Override // com.daaw.R7
    public List f(TA0.a aVar) {
        G10.g(aVar, "container");
        InterfaceC10072z80 interfaceC10072z80A = A(aVar);
        if (interfaceC10072z80A != null) {
            ArrayList arrayList = new ArrayList(1);
            interfaceC10072z80A.c(new e(arrayList), r(interfaceC10072z80A));
            return arrayList;
        }
        throw new IllegalStateException(("Class for loading annotations is not found: " + aVar.a()).toString());
    }

    @Override // com.daaw.R7
    public List h(TA0 ta0, InterfaceC2026Qj0 interfaceC2026Qj0, B7 b7) {
        G10.g(ta0, "container");
        G10.g(interfaceC2026Qj0, "proto");
        G10.g(b7, "kind");
        if (b7 == B7.PROPERTY) {
            return z(ta0, (HA0) interfaceC2026Qj0, c.B);
        }
        C5193hj0 c5193hj0T = t(this, interfaceC2026Qj0, ta0.b(), ta0.d(), b7, false, 16, null);
        return c5193hj0T == null ? AbstractC1599Mm.k() : o(this, ta0, c5193hj0T, false, false, null, false, 60, null);
    }

    @Override // com.daaw.R7
    public List i(TA0 ta0, HA0 ha0) {
        G10.g(ta0, "container");
        G10.g(ha0, "proto");
        return z(ta0, ha0, c.D);
    }

    @Override // com.daaw.R7
    public List j(TA0 ta0, AA0 aa0) {
        G10.g(ta0, "container");
        G10.g(aa0, "proto");
        return o(this, ta0, C5193hj0.b.a(ta0.b().getString(aa0.I()), C7444pl.b(((TA0.a) ta0).e().b())), false, false, null, false, 60, null);
    }

    @Override // com.daaw.R7
    public abstract Object k(C8966vA0 c8966vA0, InterfaceC2664Wm0 interfaceC2664Wm0);

    @Override // com.daaw.R7
    public List l(MA0 ma0, InterfaceC2664Wm0 interfaceC2664Wm0) {
        G10.g(ma0, "proto");
        G10.g(interfaceC2664Wm0, "nameResolver");
        Object objX = ma0.x(AbstractC7261p50.h);
        G10.f(objX, "getExtension(...)");
        Iterable<C8966vA0> iterable = (Iterable) objX;
        ArrayList arrayList = new ArrayList(AbstractC1703Nm.v(iterable, 10));
        for (C8966vA0 c8966vA0 : iterable) {
            G10.d(c8966vA0);
            arrayList.add(k(c8966vA0, interfaceC2664Wm0));
        }
        return arrayList;
    }

    public final int m(TA0 ta0, InterfaceC2026Qj0 interfaceC2026Qj0) {
        if (interfaceC2026Qj0 instanceof CA0) {
            return AbstractC3366bB0.g((CA0) interfaceC2026Qj0) ? 1 : 0;
        }
        if (interfaceC2026Qj0 instanceof HA0) {
            return AbstractC3366bB0.h((HA0) interfaceC2026Qj0) ? 1 : 0;
        }
        if (!(interfaceC2026Qj0 instanceof C9524xA0)) {
            throw new UnsupportedOperationException("Unsupported message: " + interfaceC2026Qj0.getClass());
        }
        G10.e(ta0, "null cannot be cast to non-null type org.jetbrains.kotlin.serialization.deserialization.ProtoContainer.Class");
        TA0.a aVar = (TA0.a) ta0;
        if (aVar.g() == C9245wA0.c.ENUM_CLASS) {
            return 2;
        }
        return aVar.i() ? 1 : 0;
    }

    public final List n(TA0 ta0, C5193hj0 c5193hj0, boolean z, boolean z2, Boolean bool, boolean z3) {
        InterfaceC10072z80 interfaceC10072z80P = p(ta0, b.a(ta0, z, z2, bool, z3, this.a, u()));
        if (interfaceC10072z80P == null) {
            return AbstractC1599Mm.k();
        }
        List list = (List) q(interfaceC10072z80P).a().get(c5193hj0);
        return list == null ? AbstractC1599Mm.k() : list;
    }

    public final InterfaceC10072z80 p(TA0 ta0, InterfaceC10072z80 interfaceC10072z80) {
        G10.g(ta0, "container");
        if (interfaceC10072z80 != null) {
            return interfaceC10072z80;
        }
        if (ta0 instanceof TA0.a) {
            return A((TA0.a) ta0);
        }
        return null;
    }

    public abstract a q(InterfaceC10072z80 interfaceC10072z80);

    public byte[] r(InterfaceC10072z80 interfaceC10072z80) {
        G10.g(interfaceC10072z80, "kotlinClass");
        return null;
    }

    public final C5193hj0 s(InterfaceC2026Qj0 interfaceC2026Qj0, InterfaceC2664Wm0 interfaceC2664Wm0, B81 b81, B7 b7, boolean z) {
        G10.g(interfaceC2026Qj0, "proto");
        G10.g(interfaceC2664Wm0, "nameResolver");
        G10.g(b81, "typeTable");
        G10.g(b7, "kind");
        if (interfaceC2026Qj0 instanceof C9524xA0) {
            C5193hj0.a aVar = C5193hj0.b;
            AbstractC4451f50.b bVarB = C7540q50.a.b((C9524xA0) interfaceC2026Qj0, interfaceC2664Wm0, b81);
            if (bVarB == null) {
                return null;
            }
            return aVar.b(bVarB);
        }
        if (interfaceC2026Qj0 instanceof CA0) {
            C5193hj0.a aVar2 = C5193hj0.b;
            AbstractC4451f50.b bVarE = C7540q50.a.e((CA0) interfaceC2026Qj0, interfaceC2664Wm0, b81);
            if (bVarE == null) {
                return null;
            }
            return aVar2.b(bVarE);
        }
        if (interfaceC2026Qj0 instanceof HA0) {
            AbstractC5674jS.f fVar = AbstractC7261p50.d;
            G10.f(fVar, "propertySignature");
            AbstractC7261p50.d dVar = (AbstractC7261p50.d) SA0.a((AbstractC5674jS.d) interfaceC2026Qj0, fVar);
            if (dVar == null) {
                return null;
            }
            int i = d.a[b7.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return AbstractC8070s.a((HA0) interfaceC2026Qj0, interfaceC2664Wm0, b81, true, true, z);
                }
                if (!dVar.K()) {
                    return null;
                }
                C5193hj0.a aVar3 = C5193hj0.b;
                AbstractC7261p50.c cVarF = dVar.F();
                G10.f(cVarF, "getSetter(...)");
                return aVar3.c(interfaceC2664Wm0, cVarF);
            }
            if (dVar.J()) {
                C5193hj0.a aVar4 = C5193hj0.b;
                AbstractC7261p50.c cVarE = dVar.E();
                G10.f(cVarE, "getGetter(...)");
                return aVar4.c(interfaceC2664Wm0, cVarE);
            }
        }
        return null;
    }

    public abstract C4740g50 u();

    public final InterfaceC8956v80 v() {
        return this.a;
    }

    public final boolean w(C6607ml c6607ml) {
        InterfaceC10072z80 interfaceC10072z80A;
        G10.g(c6607ml, "classId");
        return c6607ml.e() != null && G10.c(c6607ml.h().c(), "Container") && (interfaceC10072z80A = AbstractC9235w80.a(this.a, c6607ml, u())) != null && C6812nV0.a.c(interfaceC10072z80A);
    }

    public abstract InterfaceC10072z80.a x(C6607ml c6607ml, RU0 ru0, List list);

    public final InterfaceC10072z80.a y(C6607ml c6607ml, RU0 ru0, List list) {
        G10.g(c6607ml, "annotationClassId");
        G10.g(ru0, "source");
        G10.g(list, "result");
        if (C6812nV0.a.b().contains(c6607ml)) {
            return null;
        }
        return x(c6607ml, ru0, list);
    }

    public final List z(TA0 ta0, HA0 ha0, c cVar) {
        Boolean boolD = SM.B.d(ha0.e0());
        G10.f(boolD, "get(...)");
        boolD.booleanValue();
        boolean zF = C7540q50.f(ha0);
        if (cVar == c.B) {
            C5193hj0 c5193hj0B = AbstractC8070s.b(ha0, ta0.b(), ta0.d(), false, true, false, 40, null);
            return c5193hj0B == null ? AbstractC1599Mm.k() : o(this, ta0, c5193hj0B, true, false, boolD, zF, 8, null);
        }
        C5193hj0 c5193hj0B2 = AbstractC8070s.b(ha0, ta0.b(), ta0.d(), true, false, false, 48, null);
        if (c5193hj0B2 == null) {
            return AbstractC1599Mm.k();
        }
        return BY0.z(c5193hj0B2.a(), "$delegate", false, 2, null) != (cVar == c.D) ? AbstractC1599Mm.k() : n(ta0, c5193hj0B2, true, true, boolD, zF);
    }

    public static final class e implements InterfaceC10072z80.c {
        public final /* synthetic */ ArrayList b;

        public e(ArrayList arrayList) {
            this.b = arrayList;
        }

        @Override // com.daaw.InterfaceC10072z80.c
        public InterfaceC10072z80.a c(C6607ml c6607ml, RU0 ru0) {
            G10.g(c6607ml, "classId");
            G10.g(ru0, "source");
            return r.this.y(c6607ml, ru0, this.b);
        }

        @Override // com.daaw.InterfaceC10072z80.c
        public void a() {
        }
    }
}
