package com.daaw;

import com.daaw.AbstractC5347iG0;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.w70, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C9230w70 implements InterfaceC7828r70 {
    public static final /* synthetic */ W60[] F = {AbstractC5624jG0.h(new C6728nA0(AbstractC5624jG0.b(C9230w70.class), "classifier", "getClassifier()Lkotlin/reflect/KClassifier;")), AbstractC5624jG0.h(new C6728nA0(AbstractC5624jG0.b(C9230w70.class), "arguments", "getArguments()Ljava/util/List;"))};
    public final I80 B;
    public final AbstractC5347iG0.a C;
    public final AbstractC5347iG0.a D;
    public final AbstractC5347iG0.a E;

    /* JADX INFO: renamed from: com.daaw.w70$a */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[EnumC1042Hc1.values().length];
            try {
                iArr[EnumC1042Hc1.F.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC1042Hc1.G.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC1042Hc1.H.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    public C9230w70(I80 i80, LQ lq) {
        G10.g(i80, "type");
        this.B = i80;
        AbstractC5347iG0.a aVarB = null;
        AbstractC5347iG0.a aVar = lq instanceof AbstractC5347iG0.a ? (AbstractC5347iG0.a) lq : null;
        if (aVar != null) {
            aVarB = aVar;
        } else if (lq != null) {
            aVarB = AbstractC5347iG0.b(lq);
        }
        this.C = aVarB;
        this.D = AbstractC5347iG0.b(new C8107s70(this));
        this.E = AbstractC5347iG0.b(new C8386t70(this, lq));
    }

    public static final List p(C9230w70 c9230w70, LQ lq) {
        B70 b70D;
        G10.g(c9230w70, "this$0");
        List listL0 = c9230w70.B.L0();
        if (listL0.isEmpty()) {
            return AbstractC1599Mm.k();
        }
        O90 o90B = AbstractC3192ab0.b(EnumC7395pb0.C, new C8665u70(c9230w70));
        List list = listL0;
        ArrayList arrayList = new ArrayList(AbstractC1703Nm.v(list, 10));
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC1599Mm.u();
            }
            InterfaceC6440m81 interfaceC6440m81 = (InterfaceC6440m81) obj;
            if (interfaceC6440m81.c()) {
                b70D = B70.c.c();
            } else {
                I80 type = interfaceC6440m81.getType();
                G10.f(type, "getType(...)");
                C9230w70 c9230w702 = new C9230w70(type, lq == null ? null : new C8951v70(c9230w70, i, o90B));
                int i3 = a.a[interfaceC6440m81.b().ordinal()];
                if (i3 == 1) {
                    b70D = B70.c.d(c9230w702);
                } else if (i3 == 2) {
                    b70D = B70.c.a(c9230w702);
                } else {
                    if (i3 != 3) {
                        throw new C6902no0();
                    }
                    b70D = B70.c.b(c9230w702);
                }
            }
            arrayList.add(b70D);
            i = i2;
        }
        return arrayList;
    }

    public static final List r(C9230w70 c9230w70) {
        G10.g(c9230w70, "this$0");
        Type typeK = c9230w70.k();
        G10.d(typeK);
        return AbstractC9544xF0.h(typeK);
    }

    public static final List s(O90 o90) {
        return (List) o90.getValue();
    }

    public static final Type t(C9230w70 c9230w70, int i, O90 o90) {
        Type typeK = c9230w70.k();
        if (typeK instanceof Class) {
            Class cls = (Class) typeK;
            Class componentType = cls.isArray() ? cls.getComponentType() : Object.class;
            G10.d(componentType);
            return componentType;
        }
        if (typeK instanceof GenericArrayType) {
            if (i == 0) {
                Type genericComponentType = ((GenericArrayType) typeK).getGenericComponentType();
                G10.d(genericComponentType);
                return genericComponentType;
            }
            throw new E80("Array type has been queried for a non-0th argument: " + c9230w70);
        }
        if (!(typeK instanceof ParameterizedType)) {
            throw new E80("Non-generic type has been queried for arguments: " + c9230w70);
        }
        Type type = (Type) s(o90).get(i);
        if (!(type instanceof WildcardType)) {
            return type;
        }
        WildcardType wildcardType = (WildcardType) type;
        Type[] lowerBounds = wildcardType.getLowerBounds();
        G10.f(lowerBounds, "getLowerBounds(...)");
        Type type2 = (Type) AbstractC5431ib.G(lowerBounds);
        if (type2 == null) {
            Type[] upperBounds = wildcardType.getUpperBounds();
            G10.f(upperBounds, "getUpperBounds(...)");
            type2 = (Type) AbstractC5431ib.F(upperBounds);
        }
        G10.d(type2);
        return type2;
    }

    public static final InterfaceC5580j60 u(C9230w70 c9230w70) {
        G10.g(c9230w70, "this$0");
        return c9230w70.v(c9230w70.B);
    }

    @Override // com.daaw.InterfaceC7550q70
    public List c() {
        Object objC = this.E.c(this, F[1]);
        G10.f(objC, "getValue(...)");
        return (List) objC;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C9230w70)) {
            return false;
        }
        C9230w70 c9230w70 = (C9230w70) obj;
        return G10.c(this.B, c9230w70.B) && G10.c(j(), c9230w70.j()) && G10.c(c(), c9230w70.c());
    }

    public int hashCode() {
        int iHashCode = this.B.hashCode() * 31;
        InterfaceC5580j60 interfaceC5580j60J = j();
        return ((iHashCode + (interfaceC5580j60J != null ? interfaceC5580j60J.hashCode() : 0)) * 31) + c().hashCode();
    }

    @Override // com.daaw.InterfaceC7550q70
    public InterfaceC5580j60 j() {
        return (InterfaceC5580j60) this.D.c(this, F[0]);
    }

    @Override // com.daaw.InterfaceC7828r70
    public Type k() {
        AbstractC5347iG0.a aVar = this.C;
        if (aVar != null) {
            return (Type) aVar.invoke();
        }
        return null;
    }

    public String toString() {
        return C7310pG0.a.l(this.B);
    }

    public final InterfaceC5580j60 v(I80 i80) {
        I80 type;
        InterfaceC10240zl interfaceC10240zlC = i80.N0().c();
        if (!(interfaceC10240zlC instanceof InterfaceC4923gl)) {
            if (interfaceC10240zlC instanceof Z71) {
                return new C10067z70(null, (Z71) interfaceC10240zlC);
            }
            if (!(interfaceC10240zlC instanceof InterfaceC5586j71)) {
                return null;
            }
            throw new C0673Do0("An operation is not implemented: Type alias classifiers are not yet supported");
        }
        Class clsQ = AbstractC8511tb1.q((InterfaceC4923gl) interfaceC10240zlC);
        if (clsQ == null) {
            return null;
        }
        if (!clsQ.isArray()) {
            if (D81.l(i80)) {
                return new C4745g60(clsQ);
            }
            Class clsI = AbstractC9544xF0.i(clsQ);
            if (clsI != null) {
                clsQ = clsI;
            }
            return new C4745g60(clsQ);
        }
        InterfaceC6440m81 interfaceC6440m81 = (InterfaceC6440m81) AbstractC2455Um.E0(i80.L0());
        if (interfaceC6440m81 == null || (type = interfaceC6440m81.getType()) == null) {
            return new C4745g60(clsQ);
        }
        InterfaceC5580j60 interfaceC5580j60V = v(type);
        if (interfaceC5580j60V != null) {
            return new C4745g60(AbstractC8511tb1.f(X40.b(C70.a(interfaceC5580j60V))));
        }
        throw new E80("Cannot determine classifier for array element type: " + this);
    }

    public final I80 w() {
        return this.B;
    }

    public /* synthetic */ C9230w70(I80 i80, LQ lq, int i, AbstractC2911Yw abstractC2911Yw) {
        this(i80, (i & 2) != 0 ? null : lq);
    }
}
