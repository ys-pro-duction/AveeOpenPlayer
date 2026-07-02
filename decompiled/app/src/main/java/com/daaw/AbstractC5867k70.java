package com.daaw;

import com.daaw.AbstractC4451f50;
import com.daaw.AbstractC5347iG0;
import com.daaw.AbstractC6982o50;
import com.daaw.AbstractC7261p50;
import com.daaw.C60;
import com.daaw.InterfaceC3072a8;
import com.daaw.W60;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: com.daaw.k70, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC5867k70 extends H50 implements W60 {
    public static final b N = new b(null);
    public static final Object O = new Object();
    public final AbstractC7823r60 H;
    public final String I;
    public final String J;
    public final Object K;
    public final O90 L;
    public final AbstractC5347iG0.a M;

    /* JADX INFO: renamed from: com.daaw.k70$a */
    public static abstract class a extends H50 implements InterfaceC8381t60, W60.a {
        @Override // com.daaw.H50
        public AbstractC7823r60 Q() {
            return m().Q();
        }

        @Override // com.daaw.H50
        public InterfaceC2231Si R() {
            return null;
        }

        @Override // com.daaw.H50
        public boolean V() {
            return m().V();
        }

        public abstract InterfaceC3640cA0 X();

        /* JADX INFO: renamed from: Y */
        public abstract AbstractC5867k70 m();

        @Override // com.daaw.InterfaceC8381t60
        public boolean isExternal() {
            return X().isExternal();
        }

        @Override // com.daaw.InterfaceC8381t60
        public boolean isInfix() {
            return X().isInfix();
        }

        @Override // com.daaw.InterfaceC8381t60
        public boolean isInline() {
            return X().isInline();
        }

        @Override // com.daaw.InterfaceC8381t60
        public boolean isOperator() {
            return X().isOperator();
        }

        @Override // com.daaw.InterfaceC9220w50
        public boolean isSuspend() {
            return X().isSuspend();
        }
    }

    /* JADX INFO: renamed from: com.daaw.k70$b */
    public static final class b {
        public /* synthetic */ b(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public b() {
        }
    }

    /* JADX INFO: renamed from: com.daaw.k70$c */
    public static abstract class c extends a implements W60.b {
        public static final /* synthetic */ W60[] J = {AbstractC5624jG0.h(new C6728nA0(AbstractC5624jG0.b(c.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertyGetterDescriptor;"))};
        public final AbstractC5347iG0.a H = AbstractC5347iG0.b(new C6155l70(this));
        public final O90 I = AbstractC3192ab0.b(EnumC7395pb0.C, new C6434m70(this));

        public static final InterfaceC2231Si b0(c cVar) {
            G10.g(cVar, "this$0");
            return AbstractC7271p70.b(cVar, true);
        }

        public static final InterfaceC5044hA0 c0(c cVar) {
            G10.g(cVar, "this$0");
            InterfaceC5044hA0 interfaceC5044hA0F = cVar.m().X().f();
            if (interfaceC5044hA0F != null) {
                return interfaceC5044hA0F;
            }
            C5323iA0 c5323iA0D = AbstractC1444Kz.d(cVar.m().X(), InterfaceC3072a8.b.b());
            G10.f(c5323iA0D, "createDefaultGetter(...)");
            return c5323iA0D;
        }

        @Override // com.daaw.H50
        public InterfaceC2231Si P() {
            return (InterfaceC2231Si) this.I.getValue();
        }

        @Override // com.daaw.AbstractC5867k70.a
        /* JADX INFO: renamed from: d0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public InterfaceC5044hA0 X() {
            Object objC = this.H.c(this, J[0]);
            G10.f(objC, "getValue(...)");
            return (InterfaceC5044hA0) objC;
        }

        public boolean equals(Object obj) {
            return (obj instanceof c) && G10.c(m(), ((c) obj).m());
        }

        @Override // com.daaw.InterfaceC9220w50
        public String getName() {
            return "<get-" + m().getName() + '>';
        }

        public int hashCode() {
            return m().hashCode();
        }

        public String toString() {
            return "getter of " + m();
        }
    }

    /* JADX INFO: renamed from: com.daaw.k70$d */
    public static abstract class d extends a implements C60.a {
        public static final /* synthetic */ W60[] J = {AbstractC5624jG0.h(new C6728nA0(AbstractC5624jG0.b(d.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertySetterDescriptor;"))};
        public final AbstractC5347iG0.a H = AbstractC5347iG0.b(new C6713n70(this));
        public final O90 I = AbstractC3192ab0.b(EnumC7395pb0.C, new C6992o70(this));

        public static final InterfaceC2231Si b0(d dVar) {
            G10.g(dVar, "this$0");
            return AbstractC7271p70.b(dVar, false);
        }

        public static final InterfaceC7565qA0 c0(d dVar) {
            G10.g(dVar, "this$0");
            InterfaceC7565qA0 interfaceC7565qA0G = dVar.m().X().g();
            if (interfaceC7565qA0G != null) {
                return interfaceC7565qA0G;
            }
            InterfaceC4476fA0 interfaceC4476fA0X = dVar.m().X();
            InterfaceC3072a8.a aVar = InterfaceC3072a8.b;
            C7843rA0 c7843rA0E = AbstractC1444Kz.e(interfaceC4476fA0X, aVar.b(), aVar.b());
            G10.f(c7843rA0E, "createDefaultSetter(...)");
            return c7843rA0E;
        }

        @Override // com.daaw.H50
        public InterfaceC2231Si P() {
            return (InterfaceC2231Si) this.I.getValue();
        }

        @Override // com.daaw.AbstractC5867k70.a
        /* JADX INFO: renamed from: d0, reason: merged with bridge method [inline-methods] */
        public InterfaceC7565qA0 X() {
            Object objC = this.H.c(this, J[0]);
            G10.f(objC, "getValue(...)");
            return (InterfaceC7565qA0) objC;
        }

        public boolean equals(Object obj) {
            return (obj instanceof d) && G10.c(m(), ((d) obj).m());
        }

        @Override // com.daaw.InterfaceC9220w50
        public String getName() {
            return "<set-" + m().getName() + '>';
        }

        public int hashCode() {
            return m().hashCode();
        }

        public String toString() {
            return "setter of " + m();
        }
    }

    public AbstractC5867k70(AbstractC7823r60 abstractC7823r60, String str, String str2, InterfaceC4476fA0 interfaceC4476fA0, Object obj) {
        this.H = abstractC7823r60;
        this.I = str;
        this.J = str2;
        this.K = obj;
        this.L = AbstractC3192ab0.b(EnumC7395pb0.C, new C5308i70(this));
        AbstractC5347iG0.a aVarC = AbstractC5347iG0.c(interfaceC4476fA0, new C5585j70(this));
        G10.f(aVarC, "lazySoft(...)");
        this.M = aVarC;
    }

    public static final InterfaceC4476fA0 X(AbstractC5867k70 abstractC5867k70) {
        G10.g(abstractC5867k70, "this$0");
        return abstractC5867k70.Q().B(abstractC5867k70.getName(), abstractC5867k70.J);
    }

    public static final Field Y(AbstractC5867k70 abstractC5867k70) {
        Class<?> enclosingClass;
        G10.g(abstractC5867k70, "this$0");
        AbstractC6982o50 abstractC6982o50F = C9564xK0.a.f(abstractC5867k70.X());
        if (!(abstractC6982o50F instanceof AbstractC6982o50.c)) {
            if (abstractC6982o50F instanceof AbstractC6982o50.a) {
                return ((AbstractC6982o50.a) abstractC6982o50F).b();
            }
            if ((abstractC6982o50F instanceof AbstractC6982o50.b) || (abstractC6982o50F instanceof AbstractC6982o50.d)) {
                return null;
            }
            throw new C6902no0();
        }
        AbstractC6982o50.c cVar = (AbstractC6982o50.c) abstractC6982o50F;
        InterfaceC4476fA0 interfaceC4476fA0B = cVar.b();
        AbstractC4451f50.a aVarD = C7540q50.d(C7540q50.a, cVar.e(), cVar.d(), cVar.g(), false, 8, null);
        if (aVarD == null) {
            return null;
        }
        if (AbstractC9244wA.e(interfaceC4476fA0B) || C7540q50.f(cVar.e())) {
            enclosingClass = abstractC5867k70.Q().b().getEnclosingClass();
        } else {
            InterfaceC8612tw interfaceC8612twB = interfaceC4476fA0B.b();
            enclosingClass = interfaceC8612twB instanceof InterfaceC4923gl ? AbstractC8511tb1.q((InterfaceC4923gl) interfaceC8612twB) : abstractC5867k70.Q().b();
        }
        if (enclosingClass == null) {
            return null;
        }
        try {
            return enclosingClass.getDeclaredField(aVarD.e());
        } catch (NoSuchFieldException unused) {
            return null;
        }
    }

    @Override // com.daaw.H50
    public InterfaceC2231Si P() {
        return f0().P();
    }

    @Override // com.daaw.H50
    public AbstractC7823r60 Q() {
        return this.H;
    }

    @Override // com.daaw.H50
    public InterfaceC2231Si R() {
        return f0().R();
    }

    @Override // com.daaw.H50
    public boolean V() {
        return this.K != AbstractC1687Ni.NO_RECEIVER;
    }

    public final Member b0() {
        if (!X().L()) {
            return null;
        }
        AbstractC6982o50 abstractC6982o50F = C9564xK0.a.f(X());
        if (abstractC6982o50F instanceof AbstractC6982o50.c) {
            AbstractC6982o50.c cVar = (AbstractC6982o50.c) abstractC6982o50F;
            if (cVar.f().H()) {
                AbstractC7261p50.c cVarC = cVar.f().C();
                if (!cVarC.C() || !cVarC.B()) {
                    return null;
                }
                return Q().A(cVar.d().getString(cVarC.A()), cVar.d().getString(cVarC.z()));
            }
        }
        return g0();
    }

    public final Object c0() {
        return AbstractC7680qc1.h(this.K, X());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object d0(Member member, Object obj, Object obj2) throws C3735cY {
        try {
            Object obj3 = O;
            if ((obj == obj3 || obj2 == obj3) && X().i0() == null) {
                throw new RuntimeException('\'' + this + "' is not an extension property and thus getExtensionDelegate() is not going to work, use getDelegate() instead");
            }
            Object objC0 = V() ? c0() : obj;
            if (objC0 == obj3) {
                objC0 = null;
            }
            if (!V()) {
                obj = obj2;
            }
            if (obj == obj3) {
                obj = null;
            }
            AccessibleObject accessibleObject = member instanceof AccessibleObject ? (AccessibleObject) member : null;
            if (accessibleObject != null) {
                accessibleObject.setAccessible(I50.a(this));
            }
            if (member == 0) {
                return null;
            }
            if (member instanceof Field) {
                return ((Field) member).get(objC0);
            }
            if (!(member instanceof Method)) {
                throw new AssertionError("delegate field/method " + member + " neither field nor method");
            }
            int length = ((Method) member).getParameterTypes().length;
            if (length == 0) {
                return ((Method) member).invoke(null, null);
            }
            if (length == 1) {
                Method method = (Method) member;
                if (objC0 == null) {
                    Class<?> cls = ((Method) member).getParameterTypes()[0];
                    G10.f(cls, "get(...)");
                    objC0 = AbstractC8511tb1.g(cls);
                }
                return method.invoke(null, objC0);
            }
            if (length != 2) {
                throw new AssertionError("delegate method " + member + " should take 0, 1, or 2 parameters");
            }
            Method method2 = (Method) member;
            if (obj == null) {
                Class<?> cls2 = ((Method) member).getParameterTypes()[1];
                G10.f(cls2, "get(...)");
                obj = AbstractC8511tb1.g(cls2);
            }
            return method2.invoke(null, objC0, obj);
        } catch (IllegalAccessException e) {
            throw new C3735cY(e);
        }
    }

    @Override // com.daaw.H50
    /* JADX INFO: renamed from: e0, reason: merged with bridge method [inline-methods] */
    public InterfaceC4476fA0 X() {
        Object objInvoke = this.M.invoke();
        G10.f(objInvoke, "invoke(...)");
        return (InterfaceC4476fA0) objInvoke;
    }

    public boolean equals(Object obj) {
        AbstractC5867k70 abstractC5867k70D = AbstractC8511tb1.d(obj);
        return abstractC5867k70D != null && G10.c(Q(), abstractC5867k70D.Q()) && G10.c(getName(), abstractC5867k70D.getName()) && G10.c(this.J, abstractC5867k70D.J) && G10.c(this.K, abstractC5867k70D.K);
    }

    public abstract c f0();

    public final Field g0() {
        return (Field) this.L.getValue();
    }

    @Override // com.daaw.InterfaceC9220w50
    public String getName() {
        return this.I;
    }

    public final String h0() {
        return this.J;
    }

    public int hashCode() {
        return (((Q().hashCode() * 31) + getName().hashCode()) * 31) + this.J.hashCode();
    }

    @Override // com.daaw.InterfaceC9220w50
    public boolean isSuspend() {
        return false;
    }

    public String toString() {
        return C7310pG0.a.k(X());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AbstractC5867k70(AbstractC7823r60 abstractC7823r60, String str, String str2, Object obj) {
        this(abstractC7823r60, str, str2, null, obj);
        G10.g(abstractC7823r60, "container");
        G10.g(str, "name");
        G10.g(str2, "signature");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AbstractC5867k70(AbstractC7823r60 abstractC7823r60, InterfaceC4476fA0 interfaceC4476fA0) {
        G10.g(abstractC7823r60, "container");
        G10.g(interfaceC4476fA0, "descriptor");
        String strC = interfaceC4476fA0.getName().c();
        G10.f(strC, "asString(...)");
        this(abstractC7823r60, strC, C9564xK0.a.f(interfaceC4476fA0).a(), interfaceC4476fA0, AbstractC1687Ni.NO_RECEIVER);
    }
}
