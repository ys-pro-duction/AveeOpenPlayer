package com.daaw;

import com.daaw.AbstractC2923Yz;
import com.daaw.InterfaceC0443Bl;
import com.daaw.InterfaceC5043hA;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: com.daaw.kA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C5881kA implements InterfaceC5043hA {
    public static final /* synthetic */ W60[] Y = {AbstractC5624jG0.e(new C6334lm0(AbstractC5624jG0.b(C5881kA.class), "classifierNamePolicy", "getClassifierNamePolicy()Lorg/jetbrains/kotlin/renderer/ClassifierNamePolicy;")), AbstractC5624jG0.e(new C6334lm0(AbstractC5624jG0.b(C5881kA.class), "withDefinedIn", "getWithDefinedIn()Z")), AbstractC5624jG0.e(new C6334lm0(AbstractC5624jG0.b(C5881kA.class), "withSourceFileForTopLevel", "getWithSourceFileForTopLevel()Z")), AbstractC5624jG0.e(new C6334lm0(AbstractC5624jG0.b(C5881kA.class), "modifiers", "getModifiers()Ljava/util/Set;")), AbstractC5624jG0.e(new C6334lm0(AbstractC5624jG0.b(C5881kA.class), "startFromName", "getStartFromName()Z")), AbstractC5624jG0.e(new C6334lm0(AbstractC5624jG0.b(C5881kA.class), "startFromDeclarationKeyword", "getStartFromDeclarationKeyword()Z")), AbstractC5624jG0.e(new C6334lm0(AbstractC5624jG0.b(C5881kA.class), "debugMode", "getDebugMode()Z")), AbstractC5624jG0.e(new C6334lm0(AbstractC5624jG0.b(C5881kA.class), "classWithPrimaryConstructor", "getClassWithPrimaryConstructor()Z")), AbstractC5624jG0.e(new C6334lm0(AbstractC5624jG0.b(C5881kA.class), "verbose", "getVerbose()Z")), AbstractC5624jG0.e(new C6334lm0(AbstractC5624jG0.b(C5881kA.class), "unitReturnType", "getUnitReturnType()Z")), AbstractC5624jG0.e(new C6334lm0(AbstractC5624jG0.b(C5881kA.class), "withoutReturnType", "getWithoutReturnType()Z")), AbstractC5624jG0.e(new C6334lm0(AbstractC5624jG0.b(C5881kA.class), "enhancedTypes", "getEnhancedTypes()Z")), AbstractC5624jG0.e(new C6334lm0(AbstractC5624jG0.b(C5881kA.class), "normalizedVisibilities", "getNormalizedVisibilities()Z")), AbstractC5624jG0.e(new C6334lm0(AbstractC5624jG0.b(C5881kA.class), "renderDefaultVisibility", "getRenderDefaultVisibility()Z")), AbstractC5624jG0.e(new C6334lm0(AbstractC5624jG0.b(C5881kA.class), "renderDefaultModality", "getRenderDefaultModality()Z")), AbstractC5624jG0.e(new C6334lm0(AbstractC5624jG0.b(C5881kA.class), "renderConstructorDelegation", "getRenderConstructorDelegation()Z")), AbstractC5624jG0.e(new C6334lm0(AbstractC5624jG0.b(C5881kA.class), "renderPrimaryConstructorParametersAsProperties", "getRenderPrimaryConstructorParametersAsProperties()Z")), AbstractC5624jG0.e(new C6334lm0(AbstractC5624jG0.b(C5881kA.class), "actualPropertiesInPrimaryConstructor", "getActualPropertiesInPrimaryConstructor()Z")), AbstractC5624jG0.e(new C6334lm0(AbstractC5624jG0.b(C5881kA.class), "uninferredTypeParameterAsName", "getUninferredTypeParameterAsName()Z")), AbstractC5624jG0.e(new C6334lm0(AbstractC5624jG0.b(C5881kA.class), "includePropertyConstant", "getIncludePropertyConstant()Z")), AbstractC5624jG0.e(new C6334lm0(AbstractC5624jG0.b(C5881kA.class), "propertyConstantRenderer", "getPropertyConstantRenderer()Lkotlin/jvm/functions/Function1;")), AbstractC5624jG0.e(new C6334lm0(AbstractC5624jG0.b(C5881kA.class), "withoutTypeParameters", "getWithoutTypeParameters()Z")), AbstractC5624jG0.e(new C6334lm0(AbstractC5624jG0.b(C5881kA.class), "withoutSuperTypes", "getWithoutSuperTypes()Z")), AbstractC5624jG0.e(new C6334lm0(AbstractC5624jG0.b(C5881kA.class), "typeNormalizer", "getTypeNormalizer()Lkotlin/jvm/functions/Function1;")), AbstractC5624jG0.e(new C6334lm0(AbstractC5624jG0.b(C5881kA.class), "defaultParameterValueRenderer", "getDefaultParameterValueRenderer()Lkotlin/jvm/functions/Function1;")), AbstractC5624jG0.e(new C6334lm0(AbstractC5624jG0.b(C5881kA.class), "secondaryConstructorsAsPrimary", "getSecondaryConstructorsAsPrimary()Z")), AbstractC5624jG0.e(new C6334lm0(AbstractC5624jG0.b(C5881kA.class), "overrideRenderingPolicy", "getOverrideRenderingPolicy()Lorg/jetbrains/kotlin/renderer/OverrideRenderingPolicy;")), AbstractC5624jG0.e(new C6334lm0(AbstractC5624jG0.b(C5881kA.class), "valueParametersHandler", "getValueParametersHandler()Lorg/jetbrains/kotlin/renderer/DescriptorRenderer$ValueParametersHandler;")), AbstractC5624jG0.e(new C6334lm0(AbstractC5624jG0.b(C5881kA.class), "textFormat", "getTextFormat()Lorg/jetbrains/kotlin/renderer/RenderingFormat;")), AbstractC5624jG0.e(new C6334lm0(AbstractC5624jG0.b(C5881kA.class), "parameterNameRenderingPolicy", "getParameterNameRenderingPolicy()Lorg/jetbrains/kotlin/renderer/ParameterNameRenderingPolicy;")), AbstractC5624jG0.e(new C6334lm0(AbstractC5624jG0.b(C5881kA.class), "receiverAfterName", "getReceiverAfterName()Z")), AbstractC5624jG0.e(new C6334lm0(AbstractC5624jG0.b(C5881kA.class), "renderCompanionObjectName", "getRenderCompanionObjectName()Z")), AbstractC5624jG0.e(new C6334lm0(AbstractC5624jG0.b(C5881kA.class), "propertyAccessorRenderingPolicy", "getPropertyAccessorRenderingPolicy()Lorg/jetbrains/kotlin/renderer/PropertyAccessorRenderingPolicy;")), AbstractC5624jG0.e(new C6334lm0(AbstractC5624jG0.b(C5881kA.class), "renderDefaultAnnotationArguments", "getRenderDefaultAnnotationArguments()Z")), AbstractC5624jG0.e(new C6334lm0(AbstractC5624jG0.b(C5881kA.class), "eachAnnotationOnNewLine", "getEachAnnotationOnNewLine()Z")), AbstractC5624jG0.e(new C6334lm0(AbstractC5624jG0.b(C5881kA.class), "excludedAnnotationClasses", "getExcludedAnnotationClasses()Ljava/util/Set;")), AbstractC5624jG0.e(new C6334lm0(AbstractC5624jG0.b(C5881kA.class), "excludedTypeAnnotationClasses", "getExcludedTypeAnnotationClasses()Ljava/util/Set;")), AbstractC5624jG0.e(new C6334lm0(AbstractC5624jG0.b(C5881kA.class), "annotationFilter", "getAnnotationFilter()Lkotlin/jvm/functions/Function1;")), AbstractC5624jG0.e(new C6334lm0(AbstractC5624jG0.b(C5881kA.class), "annotationArgumentsRenderingPolicy", "getAnnotationArgumentsRenderingPolicy()Lorg/jetbrains/kotlin/renderer/AnnotationArgumentsRenderingPolicy;")), AbstractC5624jG0.e(new C6334lm0(AbstractC5624jG0.b(C5881kA.class), "alwaysRenderModifiers", "getAlwaysRenderModifiers()Z")), AbstractC5624jG0.e(new C6334lm0(AbstractC5624jG0.b(C5881kA.class), "renderConstructorKeyword", "getRenderConstructorKeyword()Z")), AbstractC5624jG0.e(new C6334lm0(AbstractC5624jG0.b(C5881kA.class), "renderUnabbreviatedType", "getRenderUnabbreviatedType()Z")), AbstractC5624jG0.e(new C6334lm0(AbstractC5624jG0.b(C5881kA.class), "renderTypeExpansions", "getRenderTypeExpansions()Z")), AbstractC5624jG0.e(new C6334lm0(AbstractC5624jG0.b(C5881kA.class), "includeAdditionalModifiers", "getIncludeAdditionalModifiers()Z")), AbstractC5624jG0.e(new C6334lm0(AbstractC5624jG0.b(C5881kA.class), "parameterNamesInFunctionalTypes", "getParameterNamesInFunctionalTypes()Z")), AbstractC5624jG0.e(new C6334lm0(AbstractC5624jG0.b(C5881kA.class), "renderFunctionContracts", "getRenderFunctionContracts()Z")), AbstractC5624jG0.e(new C6334lm0(AbstractC5624jG0.b(C5881kA.class), "presentableUnresolvedTypes", "getPresentableUnresolvedTypes()Z")), AbstractC5624jG0.e(new C6334lm0(AbstractC5624jG0.b(C5881kA.class), "boldOnlyForNamesInHtml", "getBoldOnlyForNamesInHtml()Z")), AbstractC5624jG0.e(new C6334lm0(AbstractC5624jG0.b(C5881kA.class), "informativeErrorType", "getInformativeErrorType()Z"))};
    public final HE0 A;
    public final HE0 B;
    public final HE0 C;
    public final HE0 D;
    public final HE0 E;
    public final HE0 F;
    public final HE0 G;
    public final HE0 H;
    public final HE0 I;
    public final HE0 J;
    public final HE0 K;
    public final HE0 L;
    public final HE0 M;
    public final HE0 N;
    public final HE0 O;
    public final HE0 P;
    public final HE0 Q;
    public final HE0 R;
    public final HE0 S;
    public final HE0 T;
    public final HE0 U;
    public final HE0 V;
    public final HE0 W;
    public final HE0 X;
    public boolean a;
    public final HE0 b = q0(InterfaceC0443Bl.c.a);
    public final HE0 c;
    public final HE0 d;
    public final HE0 e;
    public final HE0 f;
    public final HE0 g;
    public final HE0 h;
    public final HE0 i;
    public final HE0 j;
    public final HE0 k;
    public final HE0 l;
    public final HE0 m;
    public final HE0 n;
    public final HE0 o;
    public final HE0 p;
    public final HE0 q;
    public final HE0 r;
    public final HE0 s;
    public final HE0 t;
    public final HE0 u;
    public final HE0 v;
    public final HE0 w;
    public final HE0 x;
    public final HE0 y;
    public final HE0 z;

    /* JADX INFO: renamed from: com.daaw.kA$a */
    public static final class a extends AbstractC8859up0 {
        public final /* synthetic */ C5881kA b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Object obj, C5881kA c5881kA) {
            super(obj);
            this.b = c5881kA;
        }

        @Override // com.daaw.AbstractC8859up0
        public boolean d(W60 w60, Object obj, Object obj2) {
            G10.g(w60, "property");
            if (this.b.o0()) {
                throw new IllegalStateException("Cannot modify readonly DescriptorRendererOptions");
            }
            return true;
        }
    }

    public C5881kA() {
        Boolean bool = Boolean.TRUE;
        this.c = q0(bool);
        this.d = q0(bool);
        this.e = q0(EnumC4764gA.D);
        Boolean bool2 = Boolean.FALSE;
        this.f = q0(bool2);
        this.g = q0(bool2);
        this.h = q0(bool2);
        this.i = q0(bool2);
        this.j = q0(bool2);
        this.k = q0(bool);
        this.l = q0(bool2);
        this.m = q0(bool2);
        this.n = q0(bool2);
        this.o = q0(bool);
        this.p = q0(bool);
        this.q = q0(bool2);
        this.r = q0(bool2);
        this.s = q0(bool2);
        this.t = q0(bool2);
        this.u = q0(bool2);
        this.v = q0(null);
        this.w = q0(bool2);
        this.x = q0(bool2);
        this.y = q0(C5322iA.B);
        this.z = q0(C5599jA.B);
        this.A = q0(bool);
        this.B = q0(EnumC0572Cr0.C);
        this.C = q0(AbstractC2923Yz.b.a.a);
        this.D = q0(EnumC3115aI0.B);
        this.E = q0(EnumC1728Ns0.B);
        this.F = q0(bool2);
        this.G = q0(bool2);
        this.H = q0(EnumC4197eA0.C);
        this.I = q0(bool2);
        this.J = q0(bool2);
        this.K = q0(AbstractC9867yQ0.d());
        this.L = q0(C8711uI.a.a());
        this.M = q0(null);
        this.N = q0(H7.D);
        this.O = q0(bool2);
        this.P = q0(bool);
        this.Q = q0(bool);
        this.R = q0(bool2);
        this.S = q0(bool);
        this.T = q0(bool);
        this.U = q0(bool2);
        this.V = q0(bool2);
        this.W = q0(bool2);
        this.X = q0(bool);
    }

    public static final I80 r0(I80 i80) {
        G10.g(i80, "it");
        return i80;
    }

    public static final String v(InterfaceC9918yc1 interfaceC9918yc1) {
        G10.g(interfaceC9918yc1, "it");
        return "...";
    }

    public boolean A() {
        return ((Boolean) this.i.a(this, Y[7])).booleanValue();
    }

    public InterfaceC0443Bl B() {
        return (InterfaceC0443Bl) this.b.a(this, Y[0]);
    }

    public NQ C() {
        return (NQ) this.z.a(this, Y[24]);
    }

    public boolean D() {
        return ((Boolean) this.J.a(this, Y[34])).booleanValue();
    }

    public Set E() {
        return (Set) this.K.a(this, Y[35]);
    }

    public boolean F() {
        return ((Boolean) this.S.a(this, Y[43])).booleanValue();
    }

    public boolean G() {
        return ((Boolean) this.u.a(this, Y[19])).booleanValue();
    }

    public boolean H() {
        return ((Boolean) this.X.a(this, Y[48])).booleanValue();
    }

    public Set I() {
        return (Set) this.e.a(this, Y[3]);
    }

    public boolean J() {
        return ((Boolean) this.n.a(this, Y[12])).booleanValue();
    }

    public EnumC0572Cr0 K() {
        return (EnumC0572Cr0) this.B.a(this, Y[26]);
    }

    public EnumC1728Ns0 L() {
        return (EnumC1728Ns0) this.E.a(this, Y[29]);
    }

    public boolean M() {
        return ((Boolean) this.T.a(this, Y[44])).booleanValue();
    }

    public boolean N() {
        return ((Boolean) this.V.a(this, Y[46])).booleanValue();
    }

    public EnumC4197eA0 O() {
        return (EnumC4197eA0) this.H.a(this, Y[32]);
    }

    public NQ P() {
        return (NQ) this.v.a(this, Y[20]);
    }

    public boolean Q() {
        return ((Boolean) this.F.a(this, Y[30])).booleanValue();
    }

    public boolean R() {
        return ((Boolean) this.G.a(this, Y[31])).booleanValue();
    }

    public boolean S() {
        return ((Boolean) this.q.a(this, Y[15])).booleanValue();
    }

    public boolean T() {
        return ((Boolean) this.P.a(this, Y[40])).booleanValue();
    }

    public boolean U() {
        return ((Boolean) this.I.a(this, Y[33])).booleanValue();
    }

    public boolean V() {
        return ((Boolean) this.p.a(this, Y[14])).booleanValue();
    }

    public boolean W() {
        return ((Boolean) this.o.a(this, Y[13])).booleanValue();
    }

    public boolean X() {
        return ((Boolean) this.r.a(this, Y[16])).booleanValue();
    }

    public boolean Y() {
        return ((Boolean) this.R.a(this, Y[42])).booleanValue();
    }

    public boolean Z() {
        return ((Boolean) this.Q.a(this, Y[41])).booleanValue();
    }

    @Override // com.daaw.InterfaceC5043hA
    public void a(Set set) {
        G10.g(set, "<set-?>");
        this.L.b(this, Y[36], set);
    }

    public boolean a0() {
        return ((Boolean) this.A.a(this, Y[25])).booleanValue();
    }

    @Override // com.daaw.InterfaceC5043hA
    public boolean b() {
        return InterfaceC5043hA.a.b(this);
    }

    public boolean b0() {
        return ((Boolean) this.g.a(this, Y[5])).booleanValue();
    }

    @Override // com.daaw.InterfaceC5043hA
    public void c(boolean z) {
        this.f.b(this, Y[4], Boolean.valueOf(z));
    }

    public boolean c0() {
        return ((Boolean) this.f.a(this, Y[4])).booleanValue();
    }

    @Override // com.daaw.InterfaceC5043hA
    public void d(Set set) {
        G10.g(set, "<set-?>");
        this.e.b(this, Y[3], set);
    }

    public EnumC3115aI0 d0() {
        return (EnumC3115aI0) this.D.a(this, Y[28]);
    }

    @Override // com.daaw.InterfaceC5043hA
    public void e(boolean z) {
        this.c.b(this, Y[1], Boolean.valueOf(z));
    }

    public NQ e0() {
        return (NQ) this.y.a(this, Y[23]);
    }

    @Override // com.daaw.InterfaceC5043hA
    public void f(EnumC3115aI0 enumC3115aI0) {
        G10.g(enumC3115aI0, "<set-?>");
        this.D.b(this, Y[28], enumC3115aI0);
    }

    public boolean f0() {
        return ((Boolean) this.t.a(this, Y[18])).booleanValue();
    }

    @Override // com.daaw.InterfaceC5043hA
    public boolean g() {
        return ((Boolean) this.m.a(this, Y[11])).booleanValue();
    }

    public boolean g0() {
        return ((Boolean) this.k.a(this, Y[9])).booleanValue();
    }

    @Override // com.daaw.InterfaceC5043hA
    public void h(EnumC1728Ns0 enumC1728Ns0) {
        G10.g(enumC1728Ns0, "<set-?>");
        this.E.b(this, Y[29], enumC1728Ns0);
    }

    public AbstractC2923Yz.b h0() {
        return (AbstractC2923Yz.b) this.C.a(this, Y[27]);
    }

    @Override // com.daaw.InterfaceC5043hA
    public void i(boolean z) {
        this.x.b(this, Y[22], Boolean.valueOf(z));
    }

    public boolean i0() {
        return ((Boolean) this.j.a(this, Y[8])).booleanValue();
    }

    @Override // com.daaw.InterfaceC5043hA
    public void j(boolean z) {
        this.h.b(this, Y[6], Boolean.valueOf(z));
    }

    public boolean j0() {
        return ((Boolean) this.c.a(this, Y[1])).booleanValue();
    }

    @Override // com.daaw.InterfaceC5043hA
    public void k(boolean z) {
        this.G.b(this, Y[31], Boolean.valueOf(z));
    }

    public boolean k0() {
        return ((Boolean) this.d.a(this, Y[2])).booleanValue();
    }

    @Override // com.daaw.InterfaceC5043hA
    public void l(boolean z) {
        this.F.b(this, Y[30], Boolean.valueOf(z));
    }

    public boolean l0() {
        return ((Boolean) this.l.a(this, Y[10])).booleanValue();
    }

    @Override // com.daaw.InterfaceC5043hA
    public boolean m() {
        return InterfaceC5043hA.a.a(this);
    }

    public boolean m0() {
        return ((Boolean) this.x.a(this, Y[22])).booleanValue();
    }

    @Override // com.daaw.InterfaceC5043hA
    public Set n() {
        return (Set) this.L.a(this, Y[36]);
    }

    public boolean n0() {
        return ((Boolean) this.w.a(this, Y[21])).booleanValue();
    }

    @Override // com.daaw.InterfaceC5043hA
    public boolean o() {
        return ((Boolean) this.h.a(this, Y[6])).booleanValue();
    }

    public final boolean o0() {
        return this.a;
    }

    @Override // com.daaw.InterfaceC5043hA
    public H7 p() {
        return (H7) this.N.a(this, Y[38]);
    }

    public final void p0() {
        this.a = true;
    }

    @Override // com.daaw.InterfaceC5043hA
    public void q(InterfaceC0443Bl interfaceC0443Bl) {
        G10.g(interfaceC0443Bl, "<set-?>");
        this.b.b(this, Y[0], interfaceC0443Bl);
    }

    public final HE0 q0(Object obj) {
        C1128Hy c1128Hy = C1128Hy.a;
        return new a(obj, this);
    }

    @Override // com.daaw.InterfaceC5043hA
    public void r(boolean z) {
        this.w.b(this, Y[21], Boolean.valueOf(z));
    }

    public final C5881kA u() {
        C5881kA c5881kA = new C5881kA();
        Iterator itA = AbstractC2093Ra.a(C5881kA.class.getDeclaredFields());
        while (itA.hasNext()) {
            Field field = (Field) itA.next();
            if ((field.getModifiers() & 8) == 0) {
                field.setAccessible(true);
                Object obj = field.get(this);
                AbstractC8859up0 abstractC8859up0 = obj instanceof AbstractC8859up0 ? (AbstractC8859up0) obj : null;
                if (abstractC8859up0 != null) {
                    String name = field.getName();
                    G10.f(name, "getName(...)");
                    AY0.u(name, "is", false, 2, null);
                    J50 j50B = AbstractC5624jG0.b(C5881kA.class);
                    String name2 = field.getName();
                    StringBuilder sb = new StringBuilder();
                    sb.append("get");
                    String name3 = field.getName();
                    G10.f(name3, "getName(...)");
                    if (name3.length() > 0) {
                        char upperCase = Character.toUpperCase(name3.charAt(0));
                        String strSubstring = name3.substring(1);
                        G10.f(strSubstring, "substring(...)");
                        name3 = upperCase + strSubstring;
                    }
                    sb.append(name3);
                    field.set(c5881kA, c5881kA.q0(abstractC8859up0.a(this, new C6728nA0(j50B, name2, sb.toString()))));
                }
            }
        }
        return c5881kA;
    }

    public boolean w() {
        return ((Boolean) this.s.a(this, Y[17])).booleanValue();
    }

    public boolean x() {
        return ((Boolean) this.O.a(this, Y[39])).booleanValue();
    }

    public NQ y() {
        return (NQ) this.M.a(this, Y[37]);
    }

    public boolean z() {
        return ((Boolean) this.W.a(this, Y[47])).booleanValue();
    }
}
