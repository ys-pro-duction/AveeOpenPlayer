package com.daaw;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.pc1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C7401pc1 implements InterfaceC2231Si {
    public final boolean a;
    public final InterfaceC2231Si b;
    public final Member c;
    public final a d;
    public final H00[] e;
    public final boolean f;

    /* JADX INFO: renamed from: com.daaw.pc1$a */
    public static final class a {
        public final H00 a;
        public final List[] b;
        public final Method c;

        public a(H00 h00, List[] listArr, Method method) {
            G10.g(h00, "argumentRange");
            G10.g(listArr, "unboxParameters");
            this.a = h00;
            this.b = listArr;
            this.c = method;
        }

        public final H00 a() {
            return this.a;
        }

        public final Method b() {
            return this.c;
        }

        public final List[] c() {
            return this.b;
        }
    }

    /* JADX INFO: renamed from: com.daaw.pc1$b */
    public static final class b implements InterfaceC2231Si {
        public final Method a;
        public final Method b;
        public final List c;
        public final List d;
        public final List e;

        public b(InterfaceC8468tR interfaceC8468tR, AbstractC7823r60 abstractC7823r60, String str, List list) {
            Collection collectionE;
            G10.g(interfaceC8468tR, "descriptor");
            G10.g(abstractC7823r60, "container");
            G10.g(str, "constructorDesc");
            G10.g(list, "originalParameters");
            Method methodA = abstractC7823r60.A("constructor-impl", str);
            G10.d(methodA);
            this.a = methodA;
            Method methodA2 = abstractC7823r60.A("box-impl", BY0.c0(str, "V") + AbstractC9544xF0.f(abstractC7823r60.b()));
            G10.d(methodA2);
            this.b = methodA2;
            List list2 = list;
            ArrayList arrayList = new ArrayList(AbstractC1703Nm.v(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                I80 type = ((InterfaceC1624Ms0) it.next()).getType();
                G10.f(type, "getType(...)");
                arrayList.add(AbstractC7680qc1.p(AbstractC8671u81.a(type), interfaceC8468tR));
            }
            this.c = arrayList;
            ArrayList arrayList2 = new ArrayList(AbstractC1703Nm.v(list2, 10));
            int i = 0;
            for (Object obj : list2) {
                int i2 = i + 1;
                if (i < 0) {
                    AbstractC1599Mm.u();
                }
                InterfaceC10240zl interfaceC10240zlC = ((InterfaceC1624Ms0) obj).getType().N0().c();
                G10.e(interfaceC10240zlC, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                InterfaceC4923gl interfaceC4923gl = (InterfaceC4923gl) interfaceC10240zlC;
                List list3 = (List) this.c.get(i);
                if (list3 != null) {
                    List list4 = list3;
                    collectionE = new ArrayList(AbstractC1703Nm.v(list4, 10));
                    Iterator it2 = list4.iterator();
                    while (it2.hasNext()) {
                        collectionE.add(((Method) it2.next()).getReturnType());
                    }
                } else {
                    Class clsQ = AbstractC8511tb1.q(interfaceC4923gl);
                    G10.d(clsQ);
                    collectionE = AbstractC1496Lm.e(clsQ);
                }
                arrayList2.add(collectionE);
                i = i2;
            }
            this.d = arrayList2;
            this.e = AbstractC1703Nm.x(arrayList2);
        }

        @Override // com.daaw.InterfaceC2231Si
        public List a() {
            return this.e;
        }

        @Override // com.daaw.InterfaceC2231Si
        public /* bridge */ /* synthetic */ Member b() {
            return (Member) c();
        }

        public Void c() {
            return null;
        }

        @Override // com.daaw.InterfaceC2231Si
        public Object call(Object[] objArr) throws IllegalAccessException, InvocationTargetException {
            Collection collectionE;
            G10.g(objArr, "args");
            List<C0576Cs0> listV0 = AbstractC5431ib.v0(objArr, this.c);
            ArrayList arrayList = new ArrayList();
            for (C0576Cs0 c0576Cs0 : listV0) {
                Object objA = c0576Cs0.a();
                List list = (List) c0576Cs0.b();
                if (list != null) {
                    List list2 = list;
                    collectionE = new ArrayList(AbstractC1703Nm.v(list2, 10));
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        collectionE.add(((Method) it.next()).invoke(objA, null));
                    }
                } else {
                    collectionE = AbstractC1496Lm.e(objA);
                }
                AbstractC2141Rm.A(arrayList, collectionE);
            }
            Object[] array = arrayList.toArray(new Object[0]);
            this.a.invoke(null, Arrays.copyOf(array, array.length));
            return this.b.invoke(null, Arrays.copyOf(array, array.length));
        }

        public final List d() {
            return this.d;
        }

        @Override // com.daaw.InterfaceC2231Si
        public Type getReturnType() {
            Class<?> returnType = this.b.getReturnType();
            G10.f(returnType, "getReturnType(...)");
            return returnType;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0082 A[LOOP:1: B:25:0x007c->B:27:0x0082, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C7401pc1(com.daaw.InterfaceC1583Mi r11, com.daaw.InterfaceC2231Si r12, boolean r13) {
        /*
            Method dump skipped, instruction units count: 600
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C7401pc1.<init>(com.daaw.Mi, com.daaw.Si, boolean):void");
    }

    public static final boolean d(InterfaceC4923gl interfaceC4923gl) {
        G10.g(interfaceC4923gl, "$this$makeKotlinParameterTypes");
        return JZ.g(interfaceC4923gl);
    }

    public static final int e(I80 i80) {
        List listN = AbstractC7680qc1.n(AbstractC8671u81.a(i80));
        if (listN != null) {
            return listN.size();
        }
        return 1;
    }

    @Override // com.daaw.InterfaceC2231Si
    public List a() {
        return this.b.a();
    }

    @Override // com.daaw.InterfaceC2231Si
    public Member b() {
        return this.c;
    }

    @Override // com.daaw.InterfaceC2231Si
    public Object call(Object[] objArr) throws IllegalAccessException, InvocationTargetException {
        Object objInvoke;
        Object objG;
        Object objG2;
        G10.g(objArr, "args");
        H00 h00A = this.d.a();
        List[] listArrC = this.d.c();
        Method methodB = this.d.b();
        if (!h00A.isEmpty()) {
            if (this.f) {
                List listD = AbstractC1496Lm.d(objArr.length);
                int iP = h00A.p();
                for (int i = 0; i < iP; i++) {
                    listD.add(objArr[i]);
                }
                int iP2 = h00A.p();
                int iS = h00A.s();
                if (iP2 <= iS) {
                    while (true) {
                        List<Method> list = listArrC[iP2];
                        Object obj = objArr[iP2];
                        if (list != null) {
                            for (Method method : list) {
                                List list2 = listD;
                                if (obj != null) {
                                    objG2 = method.invoke(obj, null);
                                } else {
                                    Class<?> returnType = method.getReturnType();
                                    G10.f(returnType, "getReturnType(...)");
                                    objG2 = AbstractC8511tb1.g(returnType);
                                }
                                list2.add(objG2);
                            }
                        } else {
                            listD.add(obj);
                        }
                        if (iP2 == iS) {
                            break;
                        }
                        iP2++;
                    }
                }
                int iS2 = h00A.s() + 1;
                int iH = AbstractC5431ib.H(objArr);
                if (iS2 <= iH) {
                    while (true) {
                        listD.add(objArr[iS2]);
                        if (iS2 == iH) {
                            break;
                        }
                        iS2++;
                    }
                }
                objArr = AbstractC1496Lm.a(listD).toArray(new Object[0]);
            } else {
                int length = objArr.length;
                Object[] objArr2 = new Object[length];
                for (int i2 = 0; i2 < length; i2++) {
                    int iP3 = h00A.p();
                    if (i2 > h00A.s() || iP3 > i2) {
                        objG = objArr[i2];
                    } else {
                        List list3 = listArrC[i2];
                        Method method2 = list3 != null ? (Method) AbstractC2455Um.C0(list3) : null;
                        objG = objArr[i2];
                        if (method2 != null) {
                            if (objG != null) {
                                objG = method2.invoke(objG, null);
                            } else {
                                Class<?> returnType2 = method2.getReturnType();
                                G10.f(returnType2, "getReturnType(...)");
                                objG = AbstractC8511tb1.g(returnType2);
                            }
                        }
                    }
                    objArr2[i2] = objG;
                }
                objArr = objArr2;
            }
        }
        Object objCall = this.b.call(objArr);
        return (objCall == I10.c() || methodB == null || (objInvoke = methodB.invoke(null, objCall)) == null) ? objCall : objInvoke;
    }

    public final H00 f(int i) {
        if (i >= 0) {
            H00[] h00Arr = this.e;
            if (i < h00Arr.length) {
                return h00Arr[i];
            }
        }
        H00[] h00Arr2 = this.e;
        if (h00Arr2.length == 0) {
            return new H00(i, i);
        }
        int length = (i - h00Arr2.length) + ((H00) AbstractC5431ib.Q(h00Arr2)).s() + 1;
        return new H00(length, length);
    }

    @Override // com.daaw.InterfaceC2231Si
    public Type getReturnType() {
        return this.b.getReturnType();
    }
}
