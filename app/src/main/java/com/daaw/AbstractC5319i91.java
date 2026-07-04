package com.daaw;

import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.i91, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5319i91 {

    /* JADX INFO: renamed from: com.daaw.i91$a */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[D70.values().length];
            try {
                iArr[D70.C.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[D70.B.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[D70.D.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    /* JADX INFO: renamed from: com.daaw.i91$b */
    public /* synthetic */ class b extends AbstractC9591xR implements NQ {
        public static final b B = new b();

        public b() {
            super(1, Class.class, "getComponentType", "getComponentType()Ljava/lang/Class;", 0);
        }

        @Override // com.daaw.NQ
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public final Class invoke(Class cls) {
            G10.g(cls, "p0");
            return cls.getComponentType();
        }
    }

    public static final Type c(InterfaceC7550q70 interfaceC7550q70, boolean z) {
        InterfaceC5580j60 interfaceC5580j60J = interfaceC7550q70.j();
        if (interfaceC5580j60J instanceof InterfaceC9509x70) {
            return new I81((InterfaceC9509x70) interfaceC5580j60J);
        }
        if (!(interfaceC5580j60J instanceof J50)) {
            throw new UnsupportedOperationException("Unsupported type classifier: " + interfaceC7550q70);
        }
        J50 j50 = (J50) interfaceC5580j60J;
        Class clsC = z ? X40.c(j50) : X40.b(j50);
        List listC = interfaceC7550q70.c();
        if (listC.isEmpty()) {
            return clsC;
        }
        if (!clsC.isArray()) {
            return e(clsC, listC);
        }
        if (clsC.getComponentType().isPrimitive()) {
            return clsC;
        }
        B70 b70 = (B70) AbstractC2455Um.E0(listC);
        if (b70 == null) {
            throw new IllegalArgumentException("kotlin.Array must have exactly one type argument: " + interfaceC7550q70);
        }
        D70 d70A = b70.a();
        InterfaceC7550q70 interfaceC7550q70B = b70.b();
        int i = d70A == null ? -1 : a.a[d70A.ordinal()];
        if (i == -1 || i == 1) {
            return clsC;
        }
        if (i != 2 && i != 3) {
            throw new C6902no0();
        }
        G10.d(interfaceC7550q70B);
        Type typeD = d(interfaceC7550q70B, false, 1, null);
        return typeD instanceof Class ? clsC : new C6241lS(typeD);
    }

    public static /* synthetic */ Type d(InterfaceC7550q70 interfaceC7550q70, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return c(interfaceC7550q70, z);
    }

    public static final Type e(Class cls, List list) {
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass == null) {
            List list2 = list;
            ArrayList arrayList = new ArrayList(AbstractC1703Nm.v(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(g((B70) it.next()));
            }
            return new C1832Os0(cls, null, arrayList);
        }
        if (Modifier.isStatic(cls.getModifiers())) {
            List list3 = list;
            ArrayList arrayList2 = new ArrayList(AbstractC1703Nm.v(list3, 10));
            Iterator it2 = list3.iterator();
            while (it2.hasNext()) {
                arrayList2.add(g((B70) it2.next()));
            }
            return new C1832Os0(cls, declaringClass, arrayList2);
        }
        int length = cls.getTypeParameters().length;
        Type typeE = e(declaringClass, list.subList(length, list.size()));
        List listSubList = list.subList(0, length);
        ArrayList arrayList3 = new ArrayList(AbstractC1703Nm.v(listSubList, 10));
        Iterator it3 = listSubList.iterator();
        while (it3.hasNext()) {
            arrayList3.add(g((B70) it3.next()));
        }
        return new C1832Os0(cls, typeE, arrayList3);
    }

    public static final Type f(InterfaceC7550q70 interfaceC7550q70) {
        Type typeK;
        G10.g(interfaceC7550q70, "<this>");
        return (!(interfaceC7550q70 instanceof InterfaceC7828r70) || (typeK = ((InterfaceC7828r70) interfaceC7550q70).k()) == null) ? d(interfaceC7550q70, false, 1, null) : typeK;
    }

    public static final Type g(B70 b70) {
        D70 d70D = b70.d();
        if (d70D == null) {
            return C2849Yg1.c.a();
        }
        InterfaceC7550q70 interfaceC7550q70C = b70.c();
        G10.d(interfaceC7550q70C);
        int i = a.a[d70D.ordinal()];
        if (i == 1) {
            return new C2849Yg1(null, c(interfaceC7550q70C, true));
        }
        if (i == 2) {
            return c(interfaceC7550q70C, true);
        }
        if (i == 3) {
            return new C2849Yg1(c(interfaceC7550q70C, true), null);
        }
        throw new C6902no0();
    }

    public static final String h(Type type) {
        String name;
        if (!(type instanceof Class)) {
            return type.toString();
        }
        Class cls = (Class) type;
        if (cls.isArray()) {
            KP0 kp0I = SP0.i(type, b.B);
            name = ((Class) UP0.s(kp0I)).getName() + AY0.o("[]", UP0.l(kp0I));
        } else {
            name = cls.getName();
        }
        G10.d(name);
        return name;
    }
}
