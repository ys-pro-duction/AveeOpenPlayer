package com.daaw;

import com.daaw.AbstractC5347iG0;
import com.daaw.S60;
import java.lang.reflect.Array;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public abstract class H50 implements InterfaceC9220w50, A70 {
    public final AbstractC5347iG0.a B;
    public final AbstractC5347iG0.a C;
    public final AbstractC5347iG0.a D;
    public final AbstractC5347iG0.a E;
    public final AbstractC5347iG0.a F;
    public final O90 G;

    public static final class a implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return AbstractC1188In.a(((S60) obj).getName(), ((S60) obj2).getName());
        }
    }

    public H50() {
        AbstractC5347iG0.a aVarB = AbstractC5347iG0.b(new C9499x50(this));
        G10.f(aVarB, "lazySoft(...)");
        this.B = aVarB;
        AbstractC5347iG0.a aVarB2 = AbstractC5347iG0.b(new C9778y50(this));
        G10.f(aVarB2, "lazySoft(...)");
        this.C = aVarB2;
        AbstractC5347iG0.a aVarB3 = AbstractC5347iG0.b(new C10057z50(this));
        G10.f(aVarB3, "lazySoft(...)");
        this.D = aVarB3;
        AbstractC5347iG0.a aVarB4 = AbstractC5347iG0.b(new A50(this));
        G10.f(aVarB4, "lazySoft(...)");
        this.E = aVarB4;
        AbstractC5347iG0.a aVarB5 = AbstractC5347iG0.b(new B50(this));
        G10.f(aVarB5, "lazySoft(...)");
        this.F = aVarB5;
        this.G = AbstractC3192ab0.b(EnumC7395pb0.C, new C50(this));
    }

    public static final boolean W(H50 h50) {
        G10.g(h50, "this$0");
        List parameters = h50.getParameters();
        if ((parameters instanceof Collection) && parameters.isEmpty()) {
            return false;
        }
        Iterator it = parameters.iterator();
        while (it.hasNext()) {
            if (AbstractC8511tb1.k(((S60) it.next()).getType())) {
                return true;
            }
        }
        return false;
    }

    public static final Object[] o(H50 h50) {
        int iT;
        G10.g(h50, "this$0");
        List<S60> parameters = h50.getParameters();
        int size = parameters.size() + (h50.isSuspend() ? 1 : 0);
        if (((Boolean) h50.G.getValue()).booleanValue()) {
            iT = 0;
            for (S60 s60 : parameters) {
                iT += s60.i() == S60.a.D ? h50.T(s60) : 0;
            }
        } else {
            List list = parameters;
            if ((list instanceof Collection) && list.isEmpty()) {
                iT = 0;
            } else {
                Iterator it = list.iterator();
                iT = 0;
                while (it.hasNext()) {
                    if (((S60) it.next()).i() == S60.a.D && (iT = iT + 1) < 0) {
                        AbstractC1599Mm.t();
                    }
                }
            }
        }
        int i = (iT + 31) / 32;
        Object[] objArr = new Object[size + i + 1];
        for (S60 s602 : parameters) {
            if (s602.q() && !AbstractC8511tb1.l(s602.getType())) {
                objArr[s602.getIndex()] = AbstractC8511tb1.g(AbstractC3664cG0.f(s602.getType()));
            } else if (s602.a()) {
                objArr[s602.getIndex()] = h50.M(s602.getType());
            }
        }
        for (int i2 = 0; i2 < i; i2++) {
            objArr[size + i2] = 0;
        }
        return objArr;
    }

    public static final List p(H50 h50) {
        G10.g(h50, "this$0");
        return AbstractC8511tb1.e(h50.X());
    }

    public static final ArrayList r(H50 h50) {
        int i;
        G10.g(h50, "this$0");
        InterfaceC1583Mi interfaceC1583MiS = h50.X();
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        if (h50.V()) {
            i = 0;
        } else {
            RE0 re0I = AbstractC8511tb1.i(interfaceC1583MiS);
            if (re0I != null) {
                arrayList.add(new V60(h50, 0, S60.a.B, new D50(re0I)));
                i = 1;
            } else {
                i = 0;
            }
            RE0 re0I0 = interfaceC1583MiS.i0();
            if (re0I0 != null) {
                arrayList.add(new V60(h50, i, S60.a.C, new E50(re0I0)));
                i++;
            }
        }
        int size = interfaceC1583MiS.h().size();
        while (i2 < size) {
            arrayList.add(new V60(h50, i, S60.a.D, new F50(interfaceC1583MiS, i2)));
            i2++;
            i++;
        }
        if (h50.U() && (interfaceC1583MiS instanceof B20) && arrayList.size() > 1) {
            AbstractC2037Qm.z(arrayList, new a());
        }
        arrayList.trimToSize();
        return arrayList;
    }

    public static final InterfaceC1624Ms0 u(InterfaceC1583Mi interfaceC1583Mi, int i) {
        G10.g(interfaceC1583Mi, "$descriptor");
        Object obj = interfaceC1583Mi.h().get(i);
        G10.f(obj, "get(...)");
        return (InterfaceC1624Ms0) obj;
    }

    public static final C9230w70 v(H50 h50) {
        G10.g(h50, "this$0");
        I80 returnType = h50.X().getReturnType();
        G10.d(returnType);
        return new C9230w70(returnType, new G50(h50));
    }

    public static final Type w(H50 h50) {
        G10.g(h50, "this$0");
        Type typeN = h50.N();
        return typeN == null ? h50.P().getReturnType() : typeN;
    }

    public static final List x(H50 h50) {
        G10.g(h50, "this$0");
        List typeParameters = h50.X().getTypeParameters();
        G10.f(typeParameters, "getTypeParameters(...)");
        List<Z71> list = typeParameters;
        ArrayList arrayList = new ArrayList(AbstractC1703Nm.v(list, 10));
        for (Z71 z71 : list) {
            G10.d(z71);
            arrayList.add(new C10067z70(h50, z71));
        }
        return arrayList;
    }

    public final Object K(Map map) throws C3457bY {
        Object objM;
        List<S60> parameters = getParameters();
        ArrayList arrayList = new ArrayList(AbstractC1703Nm.v(parameters, 10));
        for (S60 s60 : parameters) {
            if (map.containsKey(s60)) {
                objM = map.get(s60);
                if (objM == null) {
                    throw new IllegalArgumentException("Annotation argument value cannot be null (" + s60 + ')');
                }
            } else if (s60.q()) {
                objM = null;
            } else {
                if (!s60.a()) {
                    throw new IllegalArgumentException("No argument provided for a required parameter: " + s60);
                }
                objM = M(s60.getType());
            }
            arrayList.add(objM);
        }
        InterfaceC2231Si interfaceC2231SiR = R();
        if (interfaceC2231SiR != null) {
            try {
                return interfaceC2231SiR.call(arrayList.toArray(new Object[0]));
            } catch (IllegalAccessException e) {
                throw new C3457bY(e);
            }
        }
        throw new E80("This callable does not support a default call: " + X());
    }

    public final Object L(Map map, InterfaceC1416Ks interfaceC1416Ks) throws C3457bY {
        G10.g(map, "args");
        List<S60> parameters = getParameters();
        boolean z = false;
        if (parameters.isEmpty()) {
            try {
                return P().call(isSuspend() ? new InterfaceC1416Ks[]{interfaceC1416Ks} : new InterfaceC1416Ks[0]);
            } catch (IllegalAccessException e) {
                throw new C3457bY(e);
            }
        }
        int size = parameters.size() + (isSuspend() ? 1 : 0);
        Object[] objArrO = O();
        if (isSuspend()) {
            objArrO[parameters.size()] = interfaceC1416Ks;
        }
        boolean zBooleanValue = ((Boolean) this.G.getValue()).booleanValue();
        int i = 0;
        for (S60 s60 : parameters) {
            int iT = zBooleanValue ? T(s60) : 1;
            if (map.containsKey(s60)) {
                objArrO[s60.getIndex()] = map.get(s60);
            } else if (s60.q()) {
                if (zBooleanValue) {
                    int i2 = i + iT;
                    for (int i3 = i; i3 < i2; i3++) {
                        int i4 = (i3 / 32) + size;
                        Object obj = objArrO[i4];
                        G10.e(obj, "null cannot be cast to non-null type kotlin.Int");
                        objArrO[i4] = Integer.valueOf(((Integer) obj).intValue() | (1 << (i3 % 32)));
                    }
                } else {
                    int i5 = (i / 32) + size;
                    Object obj2 = objArrO[i5];
                    G10.e(obj2, "null cannot be cast to non-null type kotlin.Int");
                    objArrO[i5] = Integer.valueOf(((Integer) obj2).intValue() | (1 << (i % 32)));
                }
                z = true;
            } else if (!s60.a()) {
                throw new IllegalArgumentException("No argument provided for a required parameter: " + s60);
            }
            if (s60.i() == S60.a.D) {
                i += iT;
            }
        }
        if (!z) {
            try {
                InterfaceC2231Si interfaceC2231SiP = P();
                Object[] objArrCopyOf = Arrays.copyOf(objArrO, size);
                G10.f(objArrCopyOf, "copyOf(...)");
                return interfaceC2231SiP.call(objArrCopyOf);
            } catch (IllegalAccessException e2) {
                throw new C3457bY(e2);
            }
        }
        InterfaceC2231Si interfaceC2231SiR = R();
        if (interfaceC2231SiR != null) {
            try {
                return interfaceC2231SiR.call(objArrO);
            } catch (IllegalAccessException e3) {
                throw new C3457bY(e3);
            }
        }
        throw new E80("This callable does not support a default call: " + X());
    }

    public final Object M(InterfaceC7550q70 interfaceC7550q70) {
        Class clsB = X40.b(C70.b(interfaceC7550q70));
        if (clsB.isArray()) {
            Object objNewInstance = Array.newInstance(clsB.getComponentType(), 0);
            G10.f(objNewInstance, "run(...)");
            return objNewInstance;
        }
        throw new E80("Cannot instantiate the default empty array of type " + clsB.getSimpleName() + ", because it is not an array type");
    }

    public final Type N() {
        Type[] lowerBounds;
        if (isSuspend()) {
            Object objR0 = AbstractC2455Um.r0(P().a());
            ParameterizedType parameterizedType = objR0 instanceof ParameterizedType ? (ParameterizedType) objR0 : null;
            if (G10.c(parameterizedType != null ? parameterizedType.getRawType() : null, InterfaceC1416Ks.class)) {
                Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                G10.f(actualTypeArguments, "getActualTypeArguments(...)");
                Object objV = AbstractC5431ib.V(actualTypeArguments);
                WildcardType wildcardType = objV instanceof WildcardType ? (WildcardType) objV : null;
                if (wildcardType != null && (lowerBounds = wildcardType.getLowerBounds()) != null) {
                    return (Type) AbstractC5431ib.F(lowerBounds);
                }
            }
        }
        return null;
    }

    public final Object[] O() {
        return (Object[]) ((Object[]) this.F.invoke()).clone();
    }

    public abstract InterfaceC2231Si P();

    public abstract AbstractC7823r60 Q();

    public abstract InterfaceC2231Si R();

    /* JADX INFO: renamed from: S */
    public abstract InterfaceC1583Mi X();

    public final int T(S60 s60) {
        if (!((Boolean) this.G.getValue()).booleanValue()) {
            throw new IllegalArgumentException("Check if parametersNeedMFVCFlattening is true before");
        }
        if (!AbstractC8511tb1.k(s60.getType())) {
            return 1;
        }
        InterfaceC7550q70 type = s60.getType();
        G10.e(type, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KTypeImpl");
        List listN = AbstractC7680qc1.n(AbstractC8671u81.a(((C9230w70) type).w()));
        G10.d(listN);
        return listN.size();
    }

    public final boolean U() {
        return G10.c(getName(), "<init>") && Q().b().isAnnotation();
    }

    public abstract boolean V();

    @Override // com.daaw.InterfaceC9220w50
    public Object call(Object... objArr) throws C3457bY {
        G10.g(objArr, "args");
        try {
            return P().call(objArr);
        } catch (IllegalAccessException e) {
            throw new C3457bY(e);
        }
    }

    @Override // com.daaw.InterfaceC9220w50
    public Object callBy(Map map) {
        G10.g(map, "args");
        return U() ? K(map) : L(map, null);
    }

    @Override // com.daaw.InterfaceC8941v50
    public List getAnnotations() {
        Object objInvoke = this.B.invoke();
        G10.f(objInvoke, "invoke(...)");
        return (List) objInvoke;
    }

    @Override // com.daaw.InterfaceC9220w50
    public List getParameters() {
        Object objInvoke = this.C.invoke();
        G10.f(objInvoke, "invoke(...)");
        return (List) objInvoke;
    }

    @Override // com.daaw.InterfaceC9220w50
    public InterfaceC7550q70 getReturnType() {
        Object objInvoke = this.D.invoke();
        G10.f(objInvoke, "invoke(...)");
        return (InterfaceC7550q70) objInvoke;
    }

    @Override // com.daaw.InterfaceC9220w50
    public List getTypeParameters() {
        Object objInvoke = this.E.invoke();
        G10.f(objInvoke, "invoke(...)");
        return (List) objInvoke;
    }

    @Override // com.daaw.InterfaceC9220w50
    public E70 getVisibility() {
        AbstractC8965vA visibility = X().getVisibility();
        G10.f(visibility, "getVisibility(...)");
        return AbstractC8511tb1.r(visibility);
    }

    @Override // com.daaw.InterfaceC9220w50
    public boolean isAbstract() {
        return X().l() == EnumC0336Ak0.F;
    }

    @Override // com.daaw.InterfaceC9220w50
    public boolean isFinal() {
        return X().l() == EnumC0336Ak0.C;
    }

    @Override // com.daaw.InterfaceC9220w50
    public boolean isOpen() {
        return X().l() == EnumC0336Ak0.E;
    }

    public static final InterfaceC1624Ms0 s(RE0 re0) {
        return re0;
    }

    public static final InterfaceC1624Ms0 t(RE0 re0) {
        return re0;
    }
}
