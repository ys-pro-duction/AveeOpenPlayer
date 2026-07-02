package com.daaw;

import com.daaw.C8966vA0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class Q7 {
    public final InterfaceC2968Zk0 a;
    public final C0560Co0 b;

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[C8966vA0.b.c.EnumC0244c.values().length];
            try {
                iArr[C8966vA0.b.c.EnumC0244c.BYTE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[C8966vA0.b.c.EnumC0244c.CHAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[C8966vA0.b.c.EnumC0244c.SHORT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[C8966vA0.b.c.EnumC0244c.INT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[C8966vA0.b.c.EnumC0244c.LONG.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[C8966vA0.b.c.EnumC0244c.FLOAT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[C8966vA0.b.c.EnumC0244c.DOUBLE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[C8966vA0.b.c.EnumC0244c.BOOLEAN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[C8966vA0.b.c.EnumC0244c.STRING.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[C8966vA0.b.c.EnumC0244c.CLASS.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[C8966vA0.b.c.EnumC0244c.ENUM.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[C8966vA0.b.c.EnumC0244c.ANNOTATION.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[C8966vA0.b.c.EnumC0244c.ARRAY.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            a = iArr;
        }
    }

    public Q7(InterfaceC2968Zk0 interfaceC2968Zk0, C0560Co0 c0560Co0) {
        G10.g(interfaceC2968Zk0, "module");
        G10.g(c0560Co0, "notFoundClasses");
        this.a = interfaceC2968Zk0;
        this.b = c0560Co0;
    }

    public final O7 a(C8966vA0 c8966vA0, InterfaceC2664Wm0 interfaceC2664Wm0) {
        G10.g(c8966vA0, "proto");
        G10.g(interfaceC2664Wm0, "nameResolver");
        InterfaceC4923gl interfaceC4923glE = e(AbstractC3252an0.a(interfaceC2664Wm0, c8966vA0.D()));
        Map mapH = AbstractC1473Lg0.h();
        if (c8966vA0.A() != 0 && !BH.m(interfaceC4923glE) && AbstractC7006oA.t(interfaceC4923glE)) {
            Collection collectionM = interfaceC4923glE.m();
            G10.f(collectionM, "getConstructors(...)");
            InterfaceC3241al interfaceC3241al = (InterfaceC3241al) AbstractC2455Um.D0(collectionM);
            if (interfaceC3241al != null) {
                List listH = interfaceC3241al.h();
                G10.f(listH, "getValueParameters(...)");
                List list = listH;
                LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC8417tE0.d(AbstractC1369Kg0.d(AbstractC1703Nm.v(list, 10)), 16));
                for (Object obj : list) {
                    linkedHashMap.put(((InterfaceC9918yc1) obj).getName(), obj);
                }
                List<C8966vA0.b> listB = c8966vA0.B();
                G10.f(listB, "getArgumentList(...)");
                ArrayList arrayList = new ArrayList();
                for (C8966vA0.b bVar : listB) {
                    G10.d(bVar);
                    C0576Cs0 c0576Cs0D = d(bVar, linkedHashMap, interfaceC2664Wm0);
                    if (c0576Cs0D != null) {
                        arrayList.add(c0576Cs0D);
                    }
                }
                mapH = AbstractC1473Lg0.t(arrayList);
            }
        }
        return new P7(interfaceC4923glE.s(), mapH, RU0.a);
    }

    public final boolean b(AbstractC2887Yq abstractC2887Yq, I80 i80, C8966vA0.b.c cVar) {
        C8966vA0.b.c.EnumC0244c enumC0244cW = cVar.W();
        int i = enumC0244cW == null ? -1 : a.a[enumC0244cW.ordinal()];
        if (i == 10) {
            InterfaceC10240zl interfaceC10240zlC = i80.N0().c();
            InterfaceC4923gl interfaceC4923gl = interfaceC10240zlC instanceof InterfaceC4923gl ? (InterfaceC4923gl) interfaceC10240zlC : null;
            return interfaceC4923gl == null || AbstractC8670u80.l0(interfaceC4923gl);
        }
        if (i != 13) {
            return G10.c(abstractC2887Yq.a(this.a), i80);
        }
        if (!(abstractC2887Yq instanceof C4027db) || ((List) ((C4027db) abstractC2887Yq).b()).size() != cVar.M().size()) {
            throw new IllegalStateException(("Deserialized ArrayValue should have the same number of elements as the original array value: " + abstractC2887Yq).toString());
        }
        I80 i80K = c().k(i80);
        G10.f(i80K, "getArrayElementType(...)");
        C4027db c4027db = (C4027db) abstractC2887Yq;
        Iterable iterableL = AbstractC1599Mm.l((Collection) c4027db.b());
        if ((iterableL instanceof Collection) && ((Collection) iterableL).isEmpty()) {
            return true;
        }
        Iterator it = iterableL.iterator();
        while (it.hasNext()) {
            int iB = ((A00) it).b();
            AbstractC2887Yq abstractC2887Yq2 = (AbstractC2887Yq) ((List) c4027db.b()).get(iB);
            C8966vA0.b.c cVarK = cVar.K(iB);
            G10.f(cVarK, "getArrayElement(...)");
            if (!b(abstractC2887Yq2, i80K, cVarK)) {
                return false;
            }
        }
        return true;
    }

    public final AbstractC8670u80 c() {
        return this.a.p();
    }

    public final C0576Cs0 d(C8966vA0.b bVar, Map map, InterfaceC2664Wm0 interfaceC2664Wm0) {
        InterfaceC9918yc1 interfaceC9918yc1 = (InterfaceC9918yc1) map.get(AbstractC3252an0.b(interfaceC2664Wm0, bVar.z()));
        if (interfaceC9918yc1 == null) {
            return null;
        }
        C2352Tm0 c2352Tm0B = AbstractC3252an0.b(interfaceC2664Wm0, bVar.z());
        I80 type = interfaceC9918yc1.getType();
        G10.f(type, "getType(...)");
        C8966vA0.b.c cVarA = bVar.A();
        G10.f(cVarA, "getValue(...)");
        return new C0576Cs0(c2352Tm0B, g(type, cVarA, interfaceC2664Wm0));
    }

    public final InterfaceC4923gl e(C6607ml c6607ml) {
        return AbstractC5366iL.d(this.a, c6607ml, this.b);
    }

    public final AbstractC2887Yq f(I80 i80, C8966vA0.b.c cVar, InterfaceC2664Wm0 interfaceC2664Wm0) {
        G10.g(i80, "expectedType");
        G10.g(cVar, "value");
        G10.g(interfaceC2664Wm0, "nameResolver");
        Boolean boolD = SM.P.d(cVar.S());
        G10.f(boolD, "get(...)");
        boolean zBooleanValue = boolD.booleanValue();
        C8966vA0.b.c.EnumC0244c enumC0244cW = cVar.W();
        switch (enumC0244cW == null ? -1 : a.a[enumC0244cW.ordinal()]) {
            case 1:
                byte bU = (byte) cVar.U();
                return zBooleanValue ? new C6166l91(bU) : new C5187hi(bU);
            case 2:
                return new C9677xk((char) cVar.U());
            case 3:
                short sU = (short) cVar.U();
                return zBooleanValue ? new C7561q91(sU) : new WR0(sU);
            case 4:
                int iU = (int) cVar.U();
                return zBooleanValue ? new C6445m91(iU) : new L00(iU);
            case 5:
                long jU = cVar.U();
                return zBooleanValue ? new C7003o91(jU) : new C7410pe0(jU);
            case 6:
                return new C5654jN(cVar.T());
            case 7:
                return new C5611jD(cVar.Q());
            case 8:
                return new C6582mg(cVar.U() != 0);
            case 9:
                return new C7103oY0(interfaceC2664Wm0.getString(cVar.V()));
            case 10:
                return new C5024h60(AbstractC3252an0.a(interfaceC2664Wm0, cVar.O()), cVar.J());
            case 11:
                return new C3946dH(AbstractC3252an0.a(interfaceC2664Wm0, cVar.O()), AbstractC3252an0.b(interfaceC2664Wm0, cVar.R()));
            case 12:
                C8966vA0 c8966vA0I = cVar.I();
                G10.f(c8966vA0I, "getAnnotation(...)");
                return new Z7(a(c8966vA0I, interfaceC2664Wm0));
            case 13:
                C3271ar c3271ar = C3271ar.a;
                List listM = cVar.M();
                G10.f(listM, "getArrayElementList(...)");
                List<C8966vA0.b.c> list = listM;
                ArrayList arrayList = new ArrayList(AbstractC1703Nm.v(list, 10));
                for (C8966vA0.b.c cVar2 : list) {
                    YS0 ys0I = c().i();
                    G10.f(ys0I, "getAnyType(...)");
                    G10.d(cVar2);
                    arrayList.add(f(ys0I, cVar2, interfaceC2664Wm0));
                }
                return c3271ar.b(arrayList, i80);
            default:
                throw new IllegalStateException(("Unsupported annotation argument type: " + cVar.W() + " (expected " + i80 + ')').toString());
        }
    }

    public final AbstractC2887Yq g(I80 i80, C8966vA0.b.c cVar, InterfaceC2664Wm0 interfaceC2664Wm0) {
        AbstractC2887Yq abstractC2887YqF = f(i80, cVar, interfaceC2664Wm0);
        if (!b(abstractC2887YqF, i80, cVar)) {
            abstractC2887YqF = null;
        }
        if (abstractC2887YqF != null) {
            return abstractC2887YqF;
        }
        return CH.b.a("Unexpected argument value: actual type " + cVar.W() + " != expected type " + i80);
    }
}
