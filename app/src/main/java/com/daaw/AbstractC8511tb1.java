package com.daaw;

import com.daaw.C5024h60;
import com.daaw.C9285wK0;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: com.daaw.tb1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC8511tb1 {
    public static final AP a = new AP("kotlin.jvm.JvmStatic");

    /* JADX INFO: renamed from: com.daaw.tb1$a */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[EnumC8067rz0.values().length];
            try {
                iArr[EnumC8067rz0.H.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC8067rz0.I.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC8067rz0.J.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC8067rz0.K.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC8067rz0.L.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[EnumC8067rz0.M.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[EnumC8067rz0.N.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[EnumC8067rz0.O.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object a(C4027db c4027db, ClassLoader classLoader) {
        I80 i80E;
        Class clsO;
        O81 o81 = c4027db instanceof O81 ? (O81) c4027db : null;
        if (o81 == null || (i80E = o81.e()) == null) {
            return null;
        }
        Iterable iterable = (Iterable) c4027db.b();
        ArrayList arrayList = new ArrayList(AbstractC1703Nm.v(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(s((AbstractC2887Yq) it.next(), classLoader));
        }
        EnumC8067rz0 enumC8067rz0N = AbstractC8670u80.N(i80E);
        int i = 0;
        switch (enumC8067rz0N == null ? -1 : a.a[enumC8067rz0N.ordinal()]) {
            case -1:
                if (!AbstractC8670u80.c0(i80E)) {
                    throw new IllegalStateException(("Not an array type: " + i80E).toString());
                }
                I80 type = ((InterfaceC6440m81) AbstractC2455Um.C0(i80E.L0())).getType();
                G10.f(type, "getType(...)");
                InterfaceC10240zl interfaceC10240zlC = type.N0().c();
                InterfaceC4923gl interfaceC4923gl = interfaceC10240zlC instanceof InterfaceC4923gl ? (InterfaceC4923gl) interfaceC10240zlC : null;
                if (interfaceC4923gl == null) {
                    throw new IllegalStateException(("Not a class type: " + type).toString());
                }
                if (AbstractC8670u80.v0(type)) {
                    int size = ((List) c4027db.b()).size();
                    String[] strArr = new String[size];
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        G10.e(obj, "null cannot be cast to non-null type kotlin.String");
                        strArr[i] = obj;
                        i++;
                    }
                    return strArr;
                }
                if (AbstractC8670u80.l0(interfaceC4923gl)) {
                    int size2 = ((List) c4027db.b()).size();
                    Class[] clsArr = new Class[size2];
                    while (i < size2) {
                        Object obj2 = arrayList.get(i);
                        G10.e(obj2, "null cannot be cast to non-null type java.lang.Class<*>");
                        clsArr[i] = obj2;
                        i++;
                    }
                    return clsArr;
                }
                C6607ml c6607mlN = AbstractC8400tA.n(interfaceC4923gl);
                if (c6607mlN == null || (clsO = o(classLoader, c6607mlN, 0, 4, null)) == null) {
                    return null;
                }
                Object objNewInstance = Array.newInstance((Class<?>) clsO, ((List) c4027db.b()).size());
                G10.e(objNewInstance, "null cannot be cast to non-null type kotlin.Array<in kotlin.Any?>");
                Object[] objArr = (Object[]) objNewInstance;
                int size3 = arrayList.size();
                while (i < size3) {
                    objArr[i] = arrayList.get(i);
                    i++;
                }
                return objArr;
            case 0:
            default:
                throw new C6902no0();
            case 1:
                int size4 = ((List) c4027db.b()).size();
                boolean[] zArr = new boolean[size4];
                while (i < size4) {
                    Object obj3 = arrayList.get(i);
                    G10.e(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                    zArr[i] = ((Boolean) obj3).booleanValue();
                    i++;
                }
                return zArr;
            case 2:
                int size5 = ((List) c4027db.b()).size();
                char[] cArr = new char[size5];
                while (i < size5) {
                    Object obj4 = arrayList.get(i);
                    G10.e(obj4, "null cannot be cast to non-null type kotlin.Char");
                    cArr[i] = ((Character) obj4).charValue();
                    i++;
                }
                return cArr;
            case 3:
                int size6 = ((List) c4027db.b()).size();
                byte[] bArr = new byte[size6];
                while (i < size6) {
                    Object obj5 = arrayList.get(i);
                    G10.e(obj5, "null cannot be cast to non-null type kotlin.Byte");
                    bArr[i] = ((Byte) obj5).byteValue();
                    i++;
                }
                return bArr;
            case 4:
                int size7 = ((List) c4027db.b()).size();
                short[] sArr = new short[size7];
                while (i < size7) {
                    Object obj6 = arrayList.get(i);
                    G10.e(obj6, "null cannot be cast to non-null type kotlin.Short");
                    sArr[i] = ((Short) obj6).shortValue();
                    i++;
                }
                return sArr;
            case 5:
                int size8 = ((List) c4027db.b()).size();
                int[] iArr = new int[size8];
                while (i < size8) {
                    Object obj7 = arrayList.get(i);
                    G10.e(obj7, "null cannot be cast to non-null type kotlin.Int");
                    iArr[i] = ((Integer) obj7).intValue();
                    i++;
                }
                return iArr;
            case 6:
                int size9 = ((List) c4027db.b()).size();
                float[] fArr = new float[size9];
                while (i < size9) {
                    Object obj8 = arrayList.get(i);
                    G10.e(obj8, "null cannot be cast to non-null type kotlin.Float");
                    fArr[i] = ((Float) obj8).floatValue();
                    i++;
                }
                return fArr;
            case 7:
                int size10 = ((List) c4027db.b()).size();
                long[] jArr = new long[size10];
                while (i < size10) {
                    Object obj9 = arrayList.get(i);
                    G10.e(obj9, "null cannot be cast to non-null type kotlin.Long");
                    jArr[i] = ((Long) obj9).longValue();
                    i++;
                }
                return jArr;
            case 8:
                int size11 = ((List) c4027db.b()).size();
                double[] dArr = new double[size11];
                while (i < size11) {
                    Object obj10 = arrayList.get(i);
                    G10.e(obj10, "null cannot be cast to non-null type kotlin.Double");
                    dArr[i] = ((Double) obj10).doubleValue();
                    i++;
                }
                return dArr;
        }
    }

    public static final H50 b(Object obj) {
        H50 h50 = obj instanceof H50 ? (H50) obj : null;
        if (h50 != null) {
            return h50;
        }
        C9504x60 c9504x60C = c(obj);
        return c9504x60C != null ? c9504x60C : d(obj);
    }

    public static final C9504x60 c(Object obj) {
        C9504x60 c9504x60 = obj instanceof C9504x60 ? (C9504x60) obj : null;
        if (c9504x60 != null) {
            return c9504x60;
        }
        AbstractC9312wR abstractC9312wR = obj instanceof AbstractC9312wR ? (AbstractC9312wR) obj : null;
        InterfaceC9220w50 interfaceC9220w50Compute = abstractC9312wR != null ? abstractC9312wR.compute() : null;
        if (interfaceC9220w50Compute instanceof C9504x60) {
            return (C9504x60) interfaceC9220w50Compute;
        }
        return null;
    }

    public static final AbstractC5867k70 d(Object obj) {
        AbstractC5867k70 abstractC5867k70 = obj instanceof AbstractC5867k70 ? (AbstractC5867k70) obj : null;
        if (abstractC5867k70 != null) {
            return abstractC5867k70;
        }
        AbstractC7007oA0 abstractC7007oA0 = obj instanceof AbstractC7007oA0 ? (AbstractC7007oA0) obj : null;
        InterfaceC9220w50 interfaceC9220w50Compute = abstractC7007oA0 != null ? abstractC7007oA0.compute() : null;
        if (interfaceC9220w50Compute instanceof AbstractC5867k70) {
            return (AbstractC5867k70) interfaceC9220w50Compute;
        }
        return null;
    }

    public static final List e(A7 a7) {
        Annotation annotationP;
        G10.g(a7, "<this>");
        InterfaceC3072a8<O7> annotations = a7.getAnnotations();
        ArrayList arrayList = new ArrayList();
        for (O7 o7 : annotations) {
            RU0 ru0J = o7.j();
            if (ru0J instanceof C8421tF0) {
                annotationP = ((C8421tF0) ru0J).d();
            } else if (ru0J instanceof C9285wK0.a) {
                OF0 of0B = ((C9285wK0.a) ru0J).b();
                C9823yF0 c9823yF0 = of0B instanceof C9823yF0 ? (C9823yF0) of0B : null;
                annotationP = c9823yF0 != null ? c9823yF0.R() : null;
            } else {
                annotationP = p(o7);
            }
            if (annotationP != null) {
                arrayList.add(annotationP);
            }
        }
        return t(arrayList);
    }

    public static final Class f(Class cls) {
        G10.g(cls, "<this>");
        return Array.newInstance((Class<?>) cls, 0).getClass();
    }

    public static final Object g(Type type) {
        G10.g(type, "type");
        if (!(type instanceof Class)) {
            return null;
        }
        Class cls = (Class) type;
        if (!cls.isPrimitive()) {
            return null;
        }
        if (G10.c(cls, Boolean.TYPE)) {
            return Boolean.FALSE;
        }
        if (G10.c(cls, Character.TYPE)) {
            return (char) 0;
        }
        if (G10.c(cls, Byte.TYPE)) {
            return (byte) 0;
        }
        if (G10.c(cls, Short.TYPE)) {
            return (short) 0;
        }
        if (G10.c(cls, Integer.TYPE)) {
            return 0;
        }
        if (G10.c(cls, Float.TYPE)) {
            return Float.valueOf(0.0f);
        }
        if (G10.c(cls, Long.TYPE)) {
            return 0L;
        }
        if (G10.c(cls, Double.TYPE)) {
            return Double.valueOf(0.0d);
        }
        if (G10.c(cls, Void.TYPE)) {
            throw new IllegalStateException("Parameter with void type is illegal");
        }
        throw new UnsupportedOperationException("Unknown primitive: " + type);
    }

    public static final InterfaceC1376Ki h(Class cls, InterfaceC2026Qj0 interfaceC2026Qj0, InterfaceC2664Wm0 interfaceC2664Wm0, B81 b81, AbstractC1156If abstractC1156If, InterfaceC3429bR interfaceC3429bR) {
        List listQ0;
        G10.g(cls, "moduleAnchor");
        G10.g(interfaceC2026Qj0, "proto");
        G10.g(interfaceC2664Wm0, "nameResolver");
        G10.g(b81, "typeTable");
        G10.g(abstractC1156If, "metadataVersion");
        G10.g(interfaceC3429bR, "createDescriptor");
        C9006vK0 c9006vK0A = AbstractC2344Tk0.a(cls);
        if (interfaceC2026Qj0 instanceof CA0) {
            listQ0 = ((CA0) interfaceC2026Qj0).p0();
        } else {
            if (!(interfaceC2026Qj0 instanceof HA0)) {
                throw new IllegalStateException(("Unsupported message: " + interfaceC2026Qj0).toString());
            }
            listQ0 = ((HA0) interfaceC2026Qj0).q0();
        }
        List list = listQ0;
        C9523xA c9523xAA = c9006vK0A.a();
        InterfaceC2968Zk0 interfaceC2968Zk0B = c9006vK0A.b();
        C10202zd1 c10202zd1B = C10202zd1.b.b();
        G10.d(list);
        return (InterfaceC1376Ki) interfaceC3429bR.invoke(new C3511bj0(new BA(c9523xAA, interfaceC2664Wm0, interfaceC2968Zk0B, b81, c10202zd1B, abstractC1156If, null, null, list)), interfaceC2026Qj0);
    }

    public static final RE0 i(InterfaceC1376Ki interfaceC1376Ki) {
        G10.g(interfaceC1376Ki, "<this>");
        if (interfaceC1376Ki.c0() == null) {
            return null;
        }
        InterfaceC8612tw interfaceC8612twB = interfaceC1376Ki.b();
        G10.e(interfaceC8612twB, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        return ((InterfaceC4923gl) interfaceC8612twB).J0();
    }

    public static final AP j() {
        return a;
    }

    public static final boolean k(InterfaceC7550q70 interfaceC7550q70) {
        I80 i80W;
        G10.g(interfaceC7550q70, "<this>");
        C9230w70 c9230w70 = interfaceC7550q70 instanceof C9230w70 ? (C9230w70) interfaceC7550q70 : null;
        return (c9230w70 == null || (i80W = c9230w70.w()) == null || !JZ.i(i80W)) ? false : true;
    }

    public static final boolean l(InterfaceC7550q70 interfaceC7550q70) {
        I80 i80W;
        G10.g(interfaceC7550q70, "<this>");
        C9230w70 c9230w70 = interfaceC7550q70 instanceof C9230w70 ? (C9230w70) interfaceC7550q70 : null;
        return (c9230w70 == null || (i80W = c9230w70.w()) == null || !JZ.c(i80W)) ? false : true;
    }

    public static final Class m(ClassLoader classLoader, C6607ml c6607ml, int i) {
        C9489x30 c9489x30 = C9489x30.a;
        BP bpJ = c6607ml.a().j();
        G10.f(bpJ, "toUnsafe(...)");
        C6607ml c6607mlN = c9489x30.n(bpJ);
        if (c6607mlN != null) {
            c6607ml = c6607mlN;
        }
        String strB = c6607ml.f().b();
        G10.f(strB, "asString(...)");
        String strB2 = c6607ml.g().b();
        G10.f(strB2, "asString(...)");
        return n(classLoader, strB, strB2, i);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final Class n(ClassLoader classLoader, String str, String str2, int i) {
        if (G10.c(str, "kotlin")) {
            switch (str2.hashCode()) {
                case -901856463:
                    if (str2.equals("BooleanArray")) {
                        return boolean[].class;
                    }
                    break;
                case -763279523:
                    if (str2.equals("ShortArray")) {
                        return short[].class;
                    }
                    break;
                case -755911549:
                    if (str2.equals("CharArray")) {
                        return char[].class;
                    }
                    break;
                case -74930671:
                    if (str2.equals("ByteArray")) {
                        return byte[].class;
                    }
                    break;
                case 22374632:
                    if (str2.equals("DoubleArray")) {
                        return double[].class;
                    }
                    break;
                case 63537721:
                    if (str2.equals("Array")) {
                        return Object[].class;
                    }
                    break;
                case 601811914:
                    if (str2.equals("IntArray")) {
                        return int[].class;
                    }
                    break;
                case 948852093:
                    if (str2.equals("FloatArray")) {
                        return float[].class;
                    }
                    break;
                case 2104330525:
                    if (str2.equals("LongArray")) {
                        return long[].class;
                    }
                    break;
            }
        }
        StringBuilder sb = new StringBuilder();
        if (i > 0) {
            for (int i2 = 0; i2 < i; i2++) {
                sb.append("[");
            }
            sb.append("L");
        }
        if (str.length() > 0) {
            sb.append(str + '.');
        }
        sb.append(AY0.r(str2, '.', '$', false, 4, null));
        if (i > 0) {
            sb.append(";");
        }
        String string = sb.toString();
        G10.f(string, "toString(...)");
        return KF0.a(classLoader, string);
    }

    public static /* synthetic */ Class o(ClassLoader classLoader, C6607ml c6607ml, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return m(classLoader, c6607ml, i);
    }

    public static final Annotation p(O7 o7) {
        InterfaceC4923gl interfaceC4923glL = AbstractC8400tA.l(o7);
        Class clsQ = interfaceC4923glL != null ? q(interfaceC4923glL) : null;
        if (!AbstractC2988Zp0.a(clsQ)) {
            clsQ = null;
        }
        if (clsQ == null) {
            return null;
        }
        Set<Map.Entry> setEntrySet = o7.k().entrySet();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : setEntrySet) {
            C2352Tm0 c2352Tm0 = (C2352Tm0) entry.getKey();
            AbstractC2887Yq abstractC2887Yq = (AbstractC2887Yq) entry.getValue();
            ClassLoader classLoader = clsQ.getClassLoader();
            G10.f(classLoader, "getClassLoader(...)");
            Object objS = s(abstractC2887Yq, classLoader);
            C0576Cs0 c0576Cs0A = objS != null ? D61.a(c2352Tm0.c(), objS) : null;
            if (c0576Cs0A != null) {
                arrayList.add(c0576Cs0A);
            }
        }
        return (Annotation) N7.h(clsQ, AbstractC1473Lg0.t(arrayList), null, 4, null);
    }

    public static final Class q(InterfaceC4923gl interfaceC4923gl) {
        G10.g(interfaceC4923gl, "<this>");
        RU0 ru0J = interfaceC4923gl.j();
        G10.f(ru0J, "getSource(...)");
        if (ru0J instanceof B80) {
            InterfaceC10072z80 interfaceC10072z80D = ((B80) ru0J).d();
            G10.e(interfaceC10072z80D, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.runtime.components.ReflectKotlinClass");
            return ((C3943dG0) interfaceC10072z80D).d();
        }
        if (ru0J instanceof C9285wK0.a) {
            OF0 of0B = ((C9285wK0.a) ru0J).b();
            G10.e(of0B, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.runtime.structure.ReflectJavaClass");
            return ((IF0) of0B).v();
        }
        C6607ml c6607mlN = AbstractC8400tA.n(interfaceC4923gl);
        if (c6607mlN == null) {
            return null;
        }
        return m(AbstractC9544xF0.j(interfaceC4923gl.getClass()), c6607mlN, 0);
    }

    public static final E70 r(AbstractC8965vA abstractC8965vA) {
        G10.g(abstractC8965vA, "<this>");
        if (G10.c(abstractC8965vA, AbstractC8679uA.e)) {
            return E70.B;
        }
        if (G10.c(abstractC8965vA, AbstractC8679uA.c)) {
            return E70.C;
        }
        if (G10.c(abstractC8965vA, AbstractC8679uA.d)) {
            return E70.D;
        }
        if (G10.c(abstractC8965vA, AbstractC8679uA.a) || G10.c(abstractC8965vA, AbstractC8679uA.b)) {
            return E70.E;
        }
        return null;
    }

    public static final Object s(AbstractC2887Yq abstractC2887Yq, ClassLoader classLoader) {
        if (abstractC2887Yq instanceof Z7) {
            return p((O7) ((Z7) abstractC2887Yq).b());
        }
        if (abstractC2887Yq instanceof C4027db) {
            return a((C4027db) abstractC2887Yq, classLoader);
        }
        if (abstractC2887Yq instanceof C3946dH) {
            C0576Cs0 c0576Cs0 = (C0576Cs0) ((C3946dH) abstractC2887Yq).b();
            C6607ml c6607ml = (C6607ml) c0576Cs0.a();
            C2352Tm0 c2352Tm0 = (C2352Tm0) c0576Cs0.b();
            Class clsO = o(classLoader, c6607ml, 0, 4, null);
            if (clsO != null) {
                return AbstractC7396pb1.a(clsO, c2352Tm0.c());
            }
            return null;
        }
        if (!(abstractC2887Yq instanceof C5024h60)) {
            if ((abstractC2887Yq instanceof CH) || (abstractC2887Yq instanceof C2568Vo0)) {
                return null;
            }
            return abstractC2887Yq.b();
        }
        C5024h60.b bVar = (C5024h60.b) ((C5024h60) abstractC2887Yq).b();
        if (bVar instanceof C5024h60.b.C0182b) {
            C5024h60.b.C0182b c0182b = (C5024h60.b.C0182b) bVar;
            return m(classLoader, c0182b.b(), c0182b.a());
        }
        if (!(bVar instanceof C5024h60.b.a)) {
            throw new C6902no0();
        }
        InterfaceC10240zl interfaceC10240zlC = ((C5024h60.b.a) bVar).a().N0().c();
        InterfaceC4923gl interfaceC4923gl = interfaceC10240zlC instanceof InterfaceC4923gl ? (InterfaceC4923gl) interfaceC10240zlC : null;
        if (interfaceC4923gl != null) {
            return q(interfaceC4923gl);
        }
        return null;
    }

    public static final List t(List list) throws IllegalAccessException, InvocationTargetException {
        List listE;
        List<Annotation> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return list;
        }
        Iterator it = list2.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if (G10.c(X40.b(X40.a((Annotation) it.next())).getSimpleName(), "Container")) {
                list = new ArrayList();
                for (Annotation annotation : list2) {
                    Class clsB = X40.b(X40.a(annotation));
                    if (!G10.c(clsB.getSimpleName(), "Container") || clsB.getAnnotation(InterfaceC3672cI0.class) == null) {
                        listE = AbstractC1496Lm.e(annotation);
                    } else {
                        Object objInvoke = clsB.getDeclaredMethod("value", null).invoke(annotation, null);
                        G10.e(objInvoke, "null cannot be cast to non-null type kotlin.Array<out kotlin.Annotation>");
                        listE = AbstractC5152hb.d((Annotation[]) objInvoke);
                    }
                    AbstractC2141Rm.A(list, listE);
                }
            }
        }
        return list;
    }
}
