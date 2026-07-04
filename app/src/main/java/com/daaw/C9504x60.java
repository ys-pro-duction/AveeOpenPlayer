package com.daaw;

import com.daaw.AbstractC2335Ti;
import com.daaw.AbstractC3894d50;
import com.daaw.AbstractC5347iG0;
import com.daaw.BR;
import com.daaw.C7401pc1;
import com.daaw.I7;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.x60, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C9504x60 extends H50 implements InterfaceC7353pR, InterfaceC8381t60, BR {
    public static final /* synthetic */ W60[] N = {AbstractC5624jG0.h(new C6728nA0(AbstractC5624jG0.b(C9504x60.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;"))};
    public final AbstractC7823r60 H;
    public final String I;
    public final Object J;
    public final AbstractC5347iG0.a K;
    public final O90 L;
    public final O90 M;

    public /* synthetic */ C9504x60(AbstractC7823r60 abstractC7823r60, String str, String str2, InterfaceC8468tR interfaceC8468tR, Object obj, int i, AbstractC2911Yw abstractC2911Yw) {
        this(abstractC7823r60, str, str2, interfaceC8468tR, (i & 16) != 0 ? AbstractC1687Ni.NO_RECEIVER : obj);
    }

    public static final InterfaceC2231Si a0(C9504x60 c9504x60) {
        Object objD;
        AbstractC2335Ti abstractC2335TiC0;
        G10.g(c9504x60, "this$0");
        AbstractC3894d50 abstractC3894d50G = C9564xK0.a.g(c9504x60.X());
        if (abstractC3894d50G instanceof AbstractC3894d50.d) {
            if (c9504x60.U()) {
                Class clsB = c9504x60.Q().b();
                List parameters = c9504x60.getParameters();
                ArrayList arrayList = new ArrayList(AbstractC1703Nm.v(parameters, 10));
                Iterator it = parameters.iterator();
                while (it.hasNext()) {
                    String name = ((S60) it.next()).getName();
                    G10.d(name);
                    arrayList.add(name);
                }
                return new I7(clsB, arrayList, I7.a.C, I7.b.C, null, 16, null);
            }
            objD = c9504x60.Q().v(((AbstractC3894d50.d) abstractC3894d50G).b());
        } else if (abstractC3894d50G instanceof AbstractC3894d50.e) {
            InterfaceC8468tR interfaceC8468tRX = c9504x60.X();
            InterfaceC8612tw interfaceC8612twB = interfaceC8468tRX.b();
            G10.f(interfaceC8612twB, "getContainingDeclaration(...)");
            if (JZ.d(interfaceC8612twB) && (interfaceC8468tRX instanceof InterfaceC7195or) && ((InterfaceC7195or) interfaceC8468tRX).z()) {
                InterfaceC8468tR interfaceC8468tRX2 = c9504x60.X();
                AbstractC7823r60 abstractC7823r60Q = c9504x60.Q();
                String strB = ((AbstractC3894d50.e) abstractC3894d50G).b();
                List listH = c9504x60.X().h();
                G10.f(listH, "getValueParameters(...)");
                return new C7401pc1.b(interfaceC8468tRX2, abstractC7823r60Q, strB, listH);
            }
            AbstractC3894d50.e eVar = (AbstractC3894d50.e) abstractC3894d50G;
            objD = c9504x60.Q().A(eVar.c(), eVar.b());
        } else if (abstractC3894d50G instanceof AbstractC3894d50.c) {
            objD = ((AbstractC3894d50.c) abstractC3894d50G).b();
            G10.e(objD, "null cannot be cast to non-null type java.lang.reflect.Member");
        } else {
            if (!(abstractC3894d50G instanceof AbstractC3894d50.b)) {
                if (!(abstractC3894d50G instanceof AbstractC3894d50.a)) {
                    throw new C6902no0();
                }
                List listD = ((AbstractC3894d50.a) abstractC3894d50G).d();
                Class clsB2 = c9504x60.Q().b();
                List list = listD;
                ArrayList arrayList2 = new ArrayList(AbstractC1703Nm.v(list, 10));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((Method) it2.next()).getName());
                }
                return new I7(clsB2, arrayList2, I7.a.C, I7.b.B, listD);
            }
            objD = ((AbstractC3894d50.b) abstractC3894d50G).d();
            G10.e(objD, "null cannot be cast to non-null type java.lang.reflect.Member");
        }
        if (objD instanceof Constructor) {
            abstractC2335TiC0 = c9504x60.b0((Constructor) objD, c9504x60.X(), false);
        } else {
            if (!(objD instanceof Method)) {
                throw new E80("Could not compute caller for function: " + c9504x60.X() + " (member = " + objD + ')');
            }
            Method method = (Method) objD;
            abstractC2335TiC0 = !Modifier.isStatic(method.getModifiers()) ? c9504x60.c0(method) : c9504x60.X().getAnnotations().i(AbstractC8511tb1.j()) != null ? c9504x60.d0(method) : c9504x60.e0(method);
        }
        return AbstractC7680qc1.j(abstractC2335TiC0, c9504x60.X(), false, 2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0180  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final com.daaw.InterfaceC2231Si f0(com.daaw.C9504x60 r11) {
        /*
            Method dump skipped, instruction units count: 404
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C9504x60.f0(com.daaw.x60):com.daaw.Si");
    }

    public static final InterfaceC8468tR g0(C9504x60 c9504x60, String str) {
        G10.g(c9504x60, "this$0");
        G10.g(str, "$name");
        return c9504x60.Q().y(str, c9504x60.I);
    }

    private final Object h0() {
        return AbstractC7680qc1.h(this.J, X());
    }

    @Override // com.daaw.H50
    public InterfaceC2231Si P() {
        return (InterfaceC2231Si) this.L.getValue();
    }

    @Override // com.daaw.H50
    public AbstractC7823r60 Q() {
        return this.H;
    }

    @Override // com.daaw.H50
    public InterfaceC2231Si R() {
        return (InterfaceC2231Si) this.M.getValue();
    }

    @Override // com.daaw.H50
    public boolean V() {
        return this.J != AbstractC1687Ni.NO_RECEIVER;
    }

    @Override // com.daaw.InterfaceC4553fR
    public Object b(Object obj, Object obj2, Object obj3, Object obj4) {
        return BR.a.e(this, obj, obj2, obj3, obj4);
    }

    public final AbstractC2335Ti b0(Constructor constructor, InterfaceC8468tR interfaceC8468tR, boolean z) {
        return (z || !HZ.f(interfaceC8468tR)) ? V() ? new AbstractC2335Ti.c(constructor, h0()) : new AbstractC2335Ti.e(constructor) : V() ? new AbstractC2335Ti.a(constructor, h0()) : new AbstractC2335Ti.b(constructor);
    }

    public final AbstractC2335Ti.h c0(Method method) {
        return V() ? new AbstractC2335Ti.h.a(method, h0()) : new AbstractC2335Ti.h.e(method);
    }

    public final AbstractC2335Ti.h d0(Method method) {
        return V() ? new AbstractC2335Ti.h.b(method) : new AbstractC2335Ti.h.f(method);
    }

    @Override // com.daaw.InterfaceC5111hR
    public Object e(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return BR.a.f(this, obj, obj2, obj3, obj4, obj5);
    }

    public final AbstractC2335Ti.h e0(Method method) {
        if (V()) {
            return new AbstractC2335Ti.h.c(method, k0(method) ? this.J : h0());
        }
        return new AbstractC2335Ti.h.g(method);
    }

    public boolean equals(Object obj) {
        C9504x60 c9504x60C = AbstractC8511tb1.c(obj);
        return c9504x60C != null && G10.c(Q(), c9504x60C.Q()) && G10.c(getName(), c9504x60C.getName()) && G10.c(this.I, c9504x60C.I) && G10.c(this.J, c9504x60C.J);
    }

    @Override // com.daaw.InterfaceC7353pR
    public int getArity() {
        return AbstractC2439Ui.a(P());
    }

    @Override // com.daaw.InterfaceC9220w50
    public String getName() {
        String strC = X().getName().c();
        G10.f(strC, "asString(...)");
        return strC;
    }

    public int hashCode() {
        return (((Q().hashCode() * 31) + getName().hashCode()) * 31) + this.I.hashCode();
    }

    @Override // com.daaw.H50
    /* JADX INFO: renamed from: i0, reason: merged with bridge method [inline-methods] */
    public InterfaceC8468tR X() {
        Object objC = this.K.c(this, N[0]);
        G10.f(objC, "getValue(...)");
        return (InterfaceC8468tR) objC;
    }

    @Override // com.daaw.LQ
    public Object invoke() {
        return BR.a.a(this);
    }

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

    /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.daaw.InterfaceC8468tR j0(com.daaw.InterfaceC8468tR r6) {
        /*
            r5 = this;
            java.util.List r0 = r6.h()
            java.lang.String r1 = "getValueParameters(...)"
            com.daaw.G10.f(r0, r1)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            boolean r2 = r0 instanceof java.util.Collection
            r3 = 0
            if (r2 == 0) goto L1a
            r2 = r0
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L1a
            goto L32
        L1a:
            java.util.Iterator r0 = r0.iterator()
        L1e:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L32
            java.lang.Object r2 = r0.next()
            com.daaw.yc1 r2 = (com.daaw.InterfaceC9918yc1) r2
            boolean r2 = r2.s0()
            if (r2 == 0) goto L1e
            goto La2
        L32:
            com.daaw.tw r0 = r6.b()
            java.lang.String r2 = "getContainingDeclaration(...)"
            com.daaw.G10.f(r0, r2)
            boolean r0 = com.daaw.JZ.g(r0)
            if (r0 == 0) goto La2
            com.daaw.Si r0 = r5.P()
            java.lang.reflect.Member r0 = r0.b()
            com.daaw.G10.d(r0)
            int r0 = r0.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isStatic(r0)
            if (r0 == 0) goto La2
            r0 = 0
            com.daaw.KP0 r6 = com.daaw.AbstractC8400tA.z(r6, r0)
            java.util.Iterator r6 = r6.iterator()
        L5f:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L9a
            java.lang.Object r0 = r6.next()
            r2 = r0
            com.daaw.Mi r2 = (com.daaw.InterfaceC1583Mi) r2
            java.util.List r2 = r2.h()
            com.daaw.G10.f(r2, r1)
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            boolean r4 = r2 instanceof java.util.Collection
            if (r4 == 0) goto L83
            r4 = r2
            java.util.Collection r4 = (java.util.Collection) r4
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L83
            goto L5f
        L83:
            java.util.Iterator r2 = r2.iterator()
        L87:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L5f
            java.lang.Object r4 = r2.next()
            com.daaw.yc1 r4 = (com.daaw.InterfaceC9918yc1) r4
            boolean r4 = r4.s0()
            if (r4 == 0) goto L87
            goto L9b
        L9a:
            r0 = r3
        L9b:
            boolean r6 = r0 instanceof com.daaw.InterfaceC8468tR
            if (r6 == 0) goto La2
            com.daaw.tR r0 = (com.daaw.InterfaceC8468tR) r0
            return r0
        La2:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C9504x60.j0(com.daaw.tR):com.daaw.tR");
    }

    public final boolean k0(Method method) {
        I80 type;
        RE0 re0C0 = X().c0();
        if (re0C0 == null || (type = re0C0.getType()) == null || !JZ.c(type)) {
            return false;
        }
        Class<?>[] parameterTypes = method.getParameterTypes();
        G10.f(parameterTypes, "getParameterTypes(...)");
        Class cls = (Class) AbstractC5431ib.G(parameterTypes);
        return cls != null && cls.isInterface();
    }

    public String toString() {
        return C7310pG0.a.f(X());
    }

    @Override // com.daaw.NQ
    public Object invoke(Object obj) {
        return BR.a.b(this, obj);
    }

    public C9504x60(AbstractC7823r60 abstractC7823r60, String str, String str2, InterfaceC8468tR interfaceC8468tR, Object obj) {
        this.H = abstractC7823r60;
        this.I = str2;
        this.J = obj;
        this.K = AbstractC5347iG0.c(interfaceC8468tR, new C8660u60(this, str));
        EnumC7395pb0 enumC7395pb0 = EnumC7395pb0.C;
        this.L = AbstractC3192ab0.b(enumC7395pb0, new C8946v60(this));
        this.M = AbstractC3192ab0.b(enumC7395pb0, new C9225w60(this));
    }

    @Override // com.daaw.InterfaceC3429bR
    public Object invoke(Object obj, Object obj2) {
        return BR.a.c(this, obj, obj2);
    }

    @Override // com.daaw.InterfaceC3986dR
    public Object invoke(Object obj, Object obj2, Object obj3) {
        return BR.a.d(this, obj, obj2, obj3);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C9504x60(AbstractC7823r60 abstractC7823r60, String str, String str2, Object obj) {
        this(abstractC7823r60, str, str2, null, obj);
        G10.g(abstractC7823r60, "container");
        G10.g(str, "name");
        G10.g(str2, "signature");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C9504x60(AbstractC7823r60 abstractC7823r60, InterfaceC8468tR interfaceC8468tR) {
        G10.g(abstractC7823r60, "container");
        G10.g(interfaceC8468tR, "descriptor");
        String strC = interfaceC8468tR.getName().c();
        G10.f(strC, "asString(...)");
        this(abstractC7823r60, strC, C9564xK0.a.g(interfaceC8468tR).a(), interfaceC8468tR, null, 16, null);
    }
}
