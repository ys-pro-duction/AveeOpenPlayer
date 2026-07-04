package com.daaw;

import com.daaw.AbstractC2923Yz;
import com.daaw.C0560Co0;
import com.daaw.C5024h60;
import com.daaw.InterfaceC1583Mi;
import com.daaw.YV0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: com.daaw.fA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4475fA extends AbstractC2923Yz implements InterfaceC5043hA {
    public final C5881kA m;
    public final O90 n;

    /* JADX INFO: renamed from: com.daaw.fA$a */
    public final class a implements InterfaceC9735xw {

        /* JADX INFO: renamed from: com.daaw.fA$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0172a {
            public static final /* synthetic */ int[] a;

            static {
                int[] iArr = new int[EnumC4197eA0.values().length];
                try {
                    iArr[EnumC4197eA0.B.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC4197eA0.C.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[EnumC4197eA0.D.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                a = iArr;
            }
        }

        public a() {
        }

        public void A(InterfaceC9918yc1 interfaceC9918yc1, StringBuilder sb) {
            G10.g(interfaceC9918yc1, "descriptor");
            G10.g(sb, "builder");
            C4475fA.this.z2(interfaceC9918yc1, true, sb, true);
        }

        @Override // com.daaw.InterfaceC9735xw
        public /* bridge */ /* synthetic */ Object a(RE0 re0, Object obj) {
            x(re0, (StringBuilder) obj);
            return G91.a;
        }

        @Override // com.daaw.InterfaceC9735xw
        public /* bridge */ /* synthetic */ Object b(InterfaceC5044hA0 interfaceC5044hA0, Object obj) throws IOException {
            v(interfaceC5044hA0, (StringBuilder) obj);
            return G91.a;
        }

        @Override // com.daaw.InterfaceC9735xw
        public /* bridge */ /* synthetic */ Object c(InterfaceC7195or interfaceC7195or, Object obj) throws IOException {
            o(interfaceC7195or, (StringBuilder) obj);
            return G91.a;
        }

        @Override // com.daaw.InterfaceC9735xw
        public /* bridge */ /* synthetic */ Object d(InterfaceC4476fA0 interfaceC4476fA0, Object obj) throws IOException {
            u(interfaceC4476fA0, (StringBuilder) obj);
            return G91.a;
        }

        @Override // com.daaw.InterfaceC9735xw
        public /* bridge */ /* synthetic */ Object e(InterfaceC2372Tr0 interfaceC2372Tr0, Object obj) {
            r(interfaceC2372Tr0, (StringBuilder) obj);
            return G91.a;
        }

        @Override // com.daaw.InterfaceC9735xw
        public /* bridge */ /* synthetic */ Object f(InterfaceC8468tR interfaceC8468tR, Object obj) throws IOException {
            p(interfaceC8468tR, (StringBuilder) obj);
            return G91.a;
        }

        @Override // com.daaw.InterfaceC9735xw
        public /* bridge */ /* synthetic */ Object g(InterfaceC9918yc1 interfaceC9918yc1, Object obj) {
            A(interfaceC9918yc1, (StringBuilder) obj);
            return G91.a;
        }

        @Override // com.daaw.InterfaceC9735xw
        public /* bridge */ /* synthetic */ Object h(InterfaceC2968Zk0 interfaceC2968Zk0, Object obj) {
            q(interfaceC2968Zk0, (StringBuilder) obj);
            return G91.a;
        }

        @Override // com.daaw.InterfaceC9735xw
        public /* bridge */ /* synthetic */ Object i(Z71 z71, Object obj) {
            z(z71, (StringBuilder) obj);
            return G91.a;
        }

        @Override // com.daaw.InterfaceC9735xw
        public /* bridge */ /* synthetic */ Object j(InterfaceC5586j71 interfaceC5586j71, Object obj) {
            y(interfaceC5586j71, (StringBuilder) obj);
            return G91.a;
        }

        @Override // com.daaw.InterfaceC9735xw
        public /* bridge */ /* synthetic */ Object k(InterfaceC5516is0 interfaceC5516is0, Object obj) {
            s(interfaceC5516is0, (StringBuilder) obj);
            return G91.a;
        }

        @Override // com.daaw.InterfaceC9735xw
        public /* bridge */ /* synthetic */ Object l(InterfaceC4923gl interfaceC4923gl, Object obj) throws IOException {
            n(interfaceC4923gl, (StringBuilder) obj);
            return G91.a;
        }

        @Override // com.daaw.InterfaceC9735xw
        public /* bridge */ /* synthetic */ Object m(InterfaceC7565qA0 interfaceC7565qA0, Object obj) throws IOException {
            w(interfaceC7565qA0, (StringBuilder) obj);
            return G91.a;
        }

        public void n(InterfaceC4923gl interfaceC4923gl, StringBuilder sb) throws IOException {
            G10.g(interfaceC4923gl, "descriptor");
            G10.g(sb, "builder");
            C4475fA.this.B1(interfaceC4923gl, sb);
        }

        public void o(InterfaceC7195or interfaceC7195or, StringBuilder sb) throws IOException {
            G10.g(interfaceC7195or, "constructorDescriptor");
            G10.g(sb, "builder");
            C4475fA.this.G1(interfaceC7195or, sb);
        }

        public void p(InterfaceC8468tR interfaceC8468tR, StringBuilder sb) throws IOException {
            G10.g(interfaceC8468tR, "descriptor");
            G10.g(sb, "builder");
            C4475fA.this.N1(interfaceC8468tR, sb);
        }

        public void q(InterfaceC2968Zk0 interfaceC2968Zk0, StringBuilder sb) {
            G10.g(interfaceC2968Zk0, "descriptor");
            G10.g(sb, "builder");
            C4475fA.this.X1(interfaceC2968Zk0, sb, true);
        }

        public void r(InterfaceC2372Tr0 interfaceC2372Tr0, StringBuilder sb) {
            G10.g(interfaceC2372Tr0, "descriptor");
            G10.g(sb, "builder");
            C4475fA.this.b2(interfaceC2372Tr0, sb);
        }

        public void s(InterfaceC5516is0 interfaceC5516is0, StringBuilder sb) {
            G10.g(interfaceC5516is0, "descriptor");
            G10.g(sb, "builder");
            C4475fA.this.d2(interfaceC5516is0, sb);
        }

        public final void t(InterfaceC3640cA0 interfaceC3640cA0, StringBuilder sb, String str) throws IOException {
            int i = C0172a.a[C4475fA.this.P0().ordinal()];
            if (i != 1) {
                if (i == 2) {
                    p(interfaceC3640cA0, sb);
                    return;
                } else {
                    if (i != 3) {
                        throw new C6902no0();
                    }
                    return;
                }
            }
            C4475fA.this.v1(interfaceC3640cA0, sb);
            sb.append(str + " for ");
            C4475fA c4475fA = C4475fA.this;
            InterfaceC4476fA0 interfaceC4476fA0A0 = interfaceC3640cA0.A0();
            G10.f(interfaceC4476fA0A0, "getCorrespondingProperty(...)");
            c4475fA.f2(interfaceC4476fA0A0, sb);
        }

        public void u(InterfaceC4476fA0 interfaceC4476fA0, StringBuilder sb) throws IOException {
            G10.g(interfaceC4476fA0, "descriptor");
            G10.g(sb, "builder");
            C4475fA.this.f2(interfaceC4476fA0, sb);
        }

        public void v(InterfaceC5044hA0 interfaceC5044hA0, StringBuilder sb) throws IOException {
            G10.g(interfaceC5044hA0, "descriptor");
            G10.g(sb, "builder");
            t(interfaceC5044hA0, sb, "getter");
        }

        public void w(InterfaceC7565qA0 interfaceC7565qA0, StringBuilder sb) throws IOException {
            G10.g(interfaceC7565qA0, "descriptor");
            G10.g(sb, "builder");
            t(interfaceC7565qA0, sb, "setter");
        }

        public void x(RE0 re0, StringBuilder sb) {
            G10.g(re0, "descriptor");
            G10.g(sb, "builder");
            sb.append(re0.getName());
        }

        public void y(InterfaceC5586j71 interfaceC5586j71, StringBuilder sb) {
            G10.g(interfaceC5586j71, "descriptor");
            G10.g(sb, "builder");
            C4475fA.this.o2(interfaceC5586j71, sb);
        }

        public void z(Z71 z71, StringBuilder sb) {
            G10.g(z71, "descriptor");
            G10.g(sb, "builder");
            C4475fA.this.u2(z71, sb, true);
        }
    }

    /* JADX INFO: renamed from: com.daaw.fA$b */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[EnumC3115aI0.values().length];
            try {
                iArr[EnumC3115aI0.B.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC3115aI0.C.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
            int[] iArr2 = new int[EnumC1728Ns0.values().length];
            try {
                iArr2[EnumC1728Ns0.B.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[EnumC1728Ns0.C.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[EnumC1728Ns0.D.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            b = iArr2;
        }
    }

    public C4475fA(C5881kA c5881kA) {
        G10.g(c5881kA, "options");
        this.m = c5881kA;
        c5881kA.o0();
        this.n = AbstractC3192ab0.a(new C3027Zz(this));
    }

    public static final CharSequence H1(InterfaceC9918yc1 interfaceC9918yc1) {
        return "";
    }

    public static final CharSequence m2(C4475fA c4475fA, I80 i80) {
        G10.g(c4475fA, "this$0");
        G10.d(i80);
        return c4475fA.U(i80);
    }

    public static final CharSequence q0(C4475fA c4475fA, InterfaceC6440m81 interfaceC6440m81) {
        G10.g(c4475fA, "this$0");
        G10.g(interfaceC6440m81, "it");
        if (interfaceC6440m81.c()) {
            return "*";
        }
        I80 type = interfaceC6440m81.getType();
        G10.f(type, "getType(...)");
        String strU = c4475fA.U(type);
        if (interfaceC6440m81.b() == EnumC1042Hc1.F) {
            return strU;
        }
        return interfaceC6440m81.b() + ' ' + strU;
    }

    public static final Object r2(I80 i80) {
        G10.g(i80, "it");
        return i80;
    }

    public static final C4475fA t0(C4475fA c4475fA) {
        G10.g(c4475fA, "this$0");
        AbstractC2923Yz abstractC2923YzW = c4475fA.W(C4196eA.B);
        G10.e(abstractC2923YzW, "null cannot be cast to non-null type org.jetbrains.kotlin.renderer.DescriptorRendererImpl");
        return (C4475fA) abstractC2923YzW;
    }

    public static /* synthetic */ void t2(C4475fA c4475fA, StringBuilder sb, I80 i80, C71 c71, int i, Object obj) {
        if ((i & 2) != 0) {
            c71 = i80.N0();
        }
        c4475fA.s2(sb, i80, c71);
    }

    public static final G91 u0(InterfaceC5043hA interfaceC5043hA) {
        G10.g(interfaceC5043hA, "$this$withOptions");
        interfaceC5043hA.a(AbstractC10146zQ0.j(interfaceC5043hA.n(), AbstractC1599Mm.n(YV0.a.C, YV0.a.D)));
        return G91.a;
    }

    public static /* synthetic */ void y2(C4475fA c4475fA, InterfaceC0626Dc1 interfaceC0626Dc1, StringBuilder sb, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        c4475fA.x2(interfaceC0626Dc1, sb, z);
    }

    public static /* synthetic */ void z1(C4475fA c4475fA, StringBuilder sb, A7 a7, W7 w7, int i, Object obj) {
        if ((i & 2) != 0) {
            w7 = null;
        }
        c4475fA.y1(sb, a7, w7);
    }

    public InterfaceC0443Bl A0() {
        return this.m.B();
    }

    public final void A1(InterfaceC0339Al interfaceC0339Al, StringBuilder sb) {
        List listV = interfaceC0339Al.v();
        G10.f(listV, "getDeclaredTypeParameters(...)");
        List parameters = interfaceC0339Al.k().getParameters();
        G10.f(parameters, "getParameters(...)");
        if (i1() && interfaceC0339Al.K() && parameters.size() > listV.size()) {
            sb.append(" /*captured type parameters: ");
            v2(sb, parameters.subList(listV.size(), parameters.size()));
            sb.append("*/");
        }
    }

    public final void A2(Collection collection, boolean z, StringBuilder sb) {
        boolean zF2 = F2(z);
        int size = collection.size();
        h1().b(size, sb);
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            InterfaceC9918yc1 interfaceC9918yc1 = (InterfaceC9918yc1) it.next();
            h1().a(interfaceC9918yc1, i, size, sb);
            z2(interfaceC9918yc1, zF2, sb, false);
            h1().c(interfaceC9918yc1, i, size, sb);
            i++;
        }
        h1().d(size, sb);
    }

    public NQ B0() {
        return this.m.C();
    }

    public final void B1(InterfaceC4923gl interfaceC4923gl, StringBuilder sb) throws IOException {
        InterfaceC3241al interfaceC3241alN;
        boolean z = interfaceC4923gl.i() == EnumC6886nl.F;
        if (!c1()) {
            z1(this, sb, interfaceC4923gl, null, 2, null);
            List listH0 = interfaceC4923gl.H0();
            G10.f(listH0, "getContextReceivers(...)");
            I1(listH0, sb);
            if (!z) {
                AbstractC8965vA visibility = interfaceC4923gl.getVisibility();
                G10.f(visibility, "getVisibility(...)");
                C2(visibility, sb);
            }
            if ((interfaceC4923gl.i() != EnumC6886nl.D || interfaceC4923gl.l() != EnumC0336Ak0.F) && (!interfaceC4923gl.i().c() || interfaceC4923gl.l() != EnumC0336Ak0.C)) {
                EnumC0336Ak0 enumC0336Ak0L = interfaceC4923gl.l();
                G10.f(enumC0336Ak0L, "getModality(...)");
                U1(enumC0336Ak0L, sb, q1(interfaceC4923gl));
            }
            S1(interfaceC4923gl, sb);
            W1(sb, I0().contains(EnumC4764gA.J) && interfaceC4923gl.K(), "inner");
            W1(sb, I0().contains(EnumC4764gA.L) && interfaceC4923gl.I0(), "data");
            W1(sb, I0().contains(EnumC4764gA.M) && interfaceC4923gl.isInline(), "inline");
            W1(sb, I0().contains(EnumC4764gA.S) && interfaceC4923gl.n(), "value");
            W1(sb, I0().contains(EnumC4764gA.R) && interfaceC4923gl.B(), "fun");
            C1(interfaceC4923gl, sb);
        }
        if (AbstractC7006oA.x(interfaceC4923gl)) {
            E1(interfaceC4923gl, sb);
        } else {
            if (!c1()) {
                k2(sb);
            }
            X1(interfaceC4923gl, sb, true);
        }
        if (z) {
            return;
        }
        List listV = interfaceC4923gl.v();
        G10.f(listV, "getDeclaredTypeParameters(...)");
        w2(listV, sb, false);
        A1(interfaceC4923gl, sb);
        if (!interfaceC4923gl.i().c() && z0() && (interfaceC3241alN = interfaceC4923gl.N()) != null) {
            sb.append(" ");
            z1(this, sb, interfaceC3241alN, null, 2, null);
            AbstractC8965vA visibility2 = interfaceC3241alN.getVisibility();
            G10.f(visibility2, "getVisibility(...)");
            C2(visibility2, sb);
            sb.append(Q1("constructor"));
            List listH = interfaceC3241alN.h();
            G10.f(listH, "getValueParameters(...)");
            A2(listH, interfaceC3241alN.E(), sb);
        }
        l2(interfaceC4923gl, sb);
        D2(listV, sb);
    }

    public final void B2(InterfaceC0626Dc1 interfaceC0626Dc1, boolean z, StringBuilder sb, boolean z2, boolean z3) {
        I80 type = interfaceC0626Dc1.getType();
        G10.f(type, "getType(...)");
        InterfaceC9918yc1 interfaceC9918yc1 = interfaceC0626Dc1 instanceof InterfaceC9918yc1 ? (InterfaceC9918yc1) interfaceC0626Dc1 : null;
        I80 i80G0 = interfaceC9918yc1 != null ? interfaceC9918yc1.g0() : null;
        I80 i80 = i80G0 == null ? type : i80G0;
        W1(sb, i80G0 != null, "vararg");
        if (z3 || (z2 && !c1())) {
            x2(interfaceC0626Dc1, sb, z3);
        }
        if (z) {
            X1(interfaceC0626Dc1, sb, z2);
            sb.append(": ");
        }
        sb.append(U(i80));
        P1(interfaceC0626Dc1, sb);
        if (!i1() || i80G0 == null) {
            return;
        }
        sb.append(" /*");
        sb.append(U(type));
        sb.append("*/");
    }

    public boolean C0() {
        return this.m.D();
    }

    public final void C1(InterfaceC4923gl interfaceC4923gl, StringBuilder sb) {
        sb.append(Q1(AbstractC2923Yz.a.a(interfaceC4923gl)));
    }

    public final boolean C2(AbstractC8965vA abstractC8965vA, StringBuilder sb) {
        if (!I0().contains(EnumC4764gA.F)) {
            return false;
        }
        if (J0()) {
            abstractC8965vA = abstractC8965vA.f();
        }
        if (!W0() && G10.c(abstractC8965vA, AbstractC8679uA.l)) {
            return false;
        }
        sb.append(Q1(abstractC8965vA.c()));
        sb.append(" ");
        return true;
    }

    public Set D0() {
        return this.m.E();
    }

    public String D1(InterfaceC10240zl interfaceC10240zl) {
        G10.g(interfaceC10240zl, "klass");
        return BH.m(interfaceC10240zl) ? interfaceC10240zl.k().toString() : A0().a(interfaceC10240zl, this);
    }

    public final void D2(List list, StringBuilder sb) throws IOException {
        if (n1()) {
            return;
        }
        ArrayList arrayList = new ArrayList(0);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Z71 z71 = (Z71) it.next();
            List upperBounds = z71.getUpperBounds();
            G10.f(upperBounds, "getUpperBounds(...)");
            for (I80 i80 : AbstractC2455Um.Y(upperBounds, 1)) {
                StringBuilder sb2 = new StringBuilder();
                C2352Tm0 name = z71.getName();
                G10.f(name, "getName(...)");
                sb2.append(T(name, false));
                sb2.append(" : ");
                G10.d(i80);
                sb2.append(U(i80));
                arrayList.add(sb2.toString());
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        sb.append(" ");
        sb.append(Q1("where"));
        sb.append(" ");
        AbstractC2455Um.k0(arrayList, sb, (124 & 2) != 0 ? ", " : ", ", (124 & 4) != 0 ? "" : null, (124 & 8) == 0 ? null : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : null);
    }

    public final C4475fA E0() {
        return (C4475fA) this.n.getValue();
    }

    public final void E1(InterfaceC8612tw interfaceC8612tw, StringBuilder sb) {
        if (R0()) {
            if (c1()) {
                sb.append("companion object");
            }
            k2(sb);
            InterfaceC8612tw interfaceC8612twB = interfaceC8612tw.b();
            if (interfaceC8612twB != null) {
                sb.append("of ");
                C2352Tm0 name = interfaceC8612twB.getName();
                G10.f(name, "getName(...)");
                sb.append(T(name, false));
            }
        }
        if (i1() || !G10.c(interfaceC8612tw.getName(), C7091oV0.d)) {
            if (!c1()) {
                k2(sb);
            }
            C2352Tm0 name2 = interfaceC8612tw.getName();
            G10.f(name2, "getName(...)");
            sb.append(T(name2, true));
        }
    }

    public final boolean E2(I80 i80) {
        if (!AR.p(i80)) {
            return false;
        }
        List listL0 = i80.L0();
        if ((listL0 instanceof Collection) && listL0.isEmpty()) {
            return true;
        }
        Iterator it = listL0.iterator();
        while (it.hasNext()) {
            if (((InterfaceC6440m81) it.next()).c()) {
                return false;
            }
        }
        return true;
    }

    public boolean F0() {
        return this.m.F();
    }

    public final String F1(AbstractC2887Yq abstractC2887Yq) {
        NQ nqP = this.m.P();
        if (nqP != null) {
            return (String) nqP.invoke(abstractC2887Yq);
        }
        if (abstractC2887Yq instanceof C4027db) {
            Iterable iterable = (Iterable) ((C4027db) abstractC2887Yq).b();
            ArrayList arrayList = new ArrayList();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                String strF1 = F1((AbstractC2887Yq) it.next());
                if (strF1 != null) {
                    arrayList.add(strF1);
                }
            }
            return AbstractC2455Um.n0(arrayList, ", ", "{", "}", 0, null, null, 56, null);
        }
        if (abstractC2887Yq instanceof Z7) {
            return BY0.b0(AbstractC2923Yz.Q(this, (O7) ((Z7) abstractC2887Yq).b(), null, 2, null), "@");
        }
        if (!(abstractC2887Yq instanceof C5024h60)) {
            return abstractC2887Yq.toString();
        }
        C5024h60.b bVar = (C5024h60.b) ((C5024h60) abstractC2887Yq).b();
        if (bVar instanceof C5024h60.b.a) {
            return ((C5024h60.b.a) bVar).a() + "::class";
        }
        if (!(bVar instanceof C5024h60.b.C0182b)) {
            throw new C6902no0();
        }
        C5024h60.b.C0182b c0182b = (C5024h60.b.C0182b) bVar;
        String strB = c0182b.b().a().b();
        G10.f(strB, "asString(...)");
        for (int i = 0; i < c0182b.a(); i++) {
            strB = "kotlin.Array<" + strB + '>';
        }
        return strB + "::class";
    }

    public final boolean F2(boolean z) {
        int i = b.b[M0().ordinal()];
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            return !z;
        }
        if (i == 3) {
            return false;
        }
        throw new C6902no0();
    }

    public boolean G0() {
        return this.m.G();
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void G1(com.daaw.InterfaceC7195or r18, java.lang.StringBuilder r19) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 268
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C4475fA.G1(com.daaw.or, java.lang.StringBuilder):void");
    }

    public boolean H0() {
        return this.m.H();
    }

    public Set I0() {
        return this.m.I();
    }

    public final void I1(List list, StringBuilder sb) {
        if (list.isEmpty()) {
            return;
        }
        sb.append("context(");
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            int i2 = i + 1;
            RE0 re0 = (RE0) it.next();
            y1(sb, re0, W7.H);
            I80 type = re0.getType();
            G10.f(type, "getType(...)");
            sb.append(L1(type));
            if (i == AbstractC1599Mm.m(list)) {
                sb.append(") ");
            } else {
                sb.append(", ");
            }
            i = i2;
        }
    }

    public boolean J0() {
        return this.m.J();
    }

    public final void J1(StringBuilder sb, I80 i80) {
        z1(this, sb, i80, null, 2, null);
        C8906uy c8906uy = i80 instanceof C8906uy ? (C8906uy) i80 : null;
        if (c8906uy != null) {
            c8906uy.Z0();
        }
        if (!N80.a(i80)) {
            t2(this, sb, i80, null, 2, null);
            G91 g91 = G91.a;
        } else if (H81.z(i80) && O0()) {
            sb.append(K1(BH.a.p(i80)));
        } else {
            if (!(i80 instanceof C9830yH) || H0()) {
                sb.append(i80.N0().toString());
            } else {
                sb.append(((C9830yH) i80).W0());
            }
            sb.append(p2(i80.L0()));
        }
        if (i80.O0()) {
            sb.append("?");
        }
        if (AbstractC7370pV0.c(i80)) {
            sb.append(" & Any");
        }
    }

    public final C5881kA K0() {
        return this.m;
    }

    public final String K1(String str) {
        int i = b.a[d1().ordinal()];
        if (i == 1) {
            return str;
        }
        if (i != 2) {
            throw new C6902no0();
        }
        return "<font color=red><b>" + str + "</b></font>";
    }

    public EnumC0572Cr0 L0() {
        return this.m.K();
    }

    public final String L1(I80 i80) {
        String strU = U(i80);
        if ((!E2(i80) || D81.l(i80)) && !(i80 instanceof C8906uy)) {
            return strU;
        }
        return '(' + strU + ')';
    }

    public EnumC1728Ns0 M0() {
        return this.m.L();
    }

    public final String M1(List list) {
        return s0(AbstractC3394bI0.c(list));
    }

    public boolean N0() {
        return this.m.M();
    }

    public final void N1(InterfaceC8468tR interfaceC8468tR, StringBuilder sb) throws IOException {
        InterfaceC8468tR interfaceC8468tR2;
        StringBuilder sb2;
        if (c1()) {
            interfaceC8468tR2 = interfaceC8468tR;
            sb2 = sb;
        } else {
            if (b1()) {
                interfaceC8468tR2 = interfaceC8468tR;
                sb2 = sb;
            } else {
                interfaceC8468tR2 = interfaceC8468tR;
                sb2 = sb;
                z1(this, sb2, interfaceC8468tR2, null, 2, null);
                List listO0 = interfaceC8468tR2.o0();
                G10.f(listO0, "getContextReceiverParameters(...)");
                I1(listO0, sb2);
                AbstractC8965vA visibility = interfaceC8468tR2.getVisibility();
                G10.f(visibility, "getVisibility(...)");
                C2(visibility, sb2);
                V1(interfaceC8468tR2, sb2);
                if (F0()) {
                    S1(interfaceC8468tR2, sb2);
                }
                a2(interfaceC8468tR2, sb2);
                if (F0()) {
                    w1(interfaceC8468tR2, sb2);
                } else {
                    n2(interfaceC8468tR2, sb2);
                }
                R1(interfaceC8468tR2, sb2);
                if (i1()) {
                    if (interfaceC8468tR2.u0()) {
                        sb2.append("/*isHiddenToOvercomeSignatureClash*/ ");
                    }
                    if (interfaceC8468tR2.B0()) {
                        sb2.append("/*isHiddenForResolutionEverywhereBesideSupercalls*/ ");
                    }
                }
            }
            sb2.append(Q1("fun"));
            sb2.append(" ");
            List typeParameters = interfaceC8468tR2.getTypeParameters();
            G10.f(typeParameters, "getTypeParameters(...)");
            w2(typeParameters, sb2, true);
            h2(interfaceC8468tR2, sb2);
        }
        X1(interfaceC8468tR2, sb2, true);
        List listH = interfaceC8468tR2.h();
        G10.f(listH, "getValueParameters(...)");
        A2(listH, interfaceC8468tR2.E(), sb2);
        i2(interfaceC8468tR2, sb2);
        I80 returnType = interfaceC8468tR2.getReturnType();
        if (!l1() && (g1() || returnType == null || !AbstractC8670u80.C0(returnType))) {
            sb2.append(": ");
            sb2.append(returnType == null ? "[NULL]" : U(returnType));
        }
        List typeParameters2 = interfaceC8468tR2.getTypeParameters();
        G10.f(typeParameters2, "getTypeParameters(...)");
        D2(typeParameters2, sb2);
    }

    @Override // com.daaw.AbstractC2923Yz
    public String O(InterfaceC8612tw interfaceC8612tw) {
        G10.g(interfaceC8612tw, "declarationDescriptor");
        StringBuilder sb = new StringBuilder();
        interfaceC8612tw.h0(new a(), sb);
        if (j1()) {
            o0(sb, interfaceC8612tw);
        }
        String string = sb.toString();
        G10.f(string, "toString(...)");
        return string;
    }

    public boolean O0() {
        return this.m.N();
    }

    public final void O1(StringBuilder sb, I80 i80) {
        C2352Tm0 c2352Tm0D;
        int length = sb.length();
        z1(E0(), sb, i80, null, 2, null);
        boolean z = sb.length() != length;
        I80 i80K = AR.k(i80);
        List listE = AR.e(i80);
        if (!listE.isEmpty()) {
            sb.append("context(");
            Iterator it = listE.subList(0, AbstractC1599Mm.m(listE)).iterator();
            while (it.hasNext()) {
                Y1(sb, (I80) it.next());
                sb.append(", ");
            }
            Y1(sb, (I80) AbstractC2455Um.p0(listE));
            sb.append(") ");
        }
        boolean zR = AR.r(i80);
        boolean zO0 = i80.O0();
        boolean z2 = zO0 || (z && i80K != null);
        if (z2) {
            if (zR) {
                sb.insert(length, '(');
            } else {
                if (z) {
                    AbstractC9956yk.c(DY0.H0(sb));
                    if (sb.charAt(BY0.G(sb) - 1) != ')') {
                        sb.insert(BY0.G(sb), "()");
                    }
                }
                sb.append("(");
            }
        }
        W1(sb, zR, "suspend");
        if (i80K != null) {
            boolean z3 = (E2(i80K) && !i80K.O0()) || p1(i80K) || (i80K instanceof C8906uy);
            if (z3) {
                sb.append("(");
            }
            Y1(sb, i80K);
            if (z3) {
                sb.append(")");
            }
            sb.append(".");
        }
        sb.append("(");
        if (!AR.n(i80) || i80.L0().size() > 1) {
            int i = 0;
            for (InterfaceC6440m81 interfaceC6440m81 : AR.m(i80)) {
                int i2 = i + 1;
                if (i > 0) {
                    sb.append(", ");
                }
                if (N0()) {
                    I80 type = interfaceC6440m81.getType();
                    G10.f(type, "getType(...)");
                    c2352Tm0D = AR.d(type);
                } else {
                    c2352Tm0D = null;
                }
                if (c2352Tm0D != null) {
                    sb.append(T(c2352Tm0D, false));
                    sb.append(": ");
                }
                sb.append(V(interfaceC6440m81));
                i = i2;
            }
        } else {
            sb.append("???");
        }
        sb.append(") ");
        sb.append(r0());
        sb.append(" ");
        Y1(sb, AR.l(i80));
        if (z2) {
            sb.append(")");
        }
        if (zO0) {
            sb.append("?");
        }
    }

    @Override // com.daaw.AbstractC2923Yz
    public String P(O7 o7, W7 w7) throws IOException {
        G10.g(o7, "annotation");
        StringBuilder sb = new StringBuilder();
        sb.append('@');
        if (w7 != null) {
            sb.append(w7.c() + ':');
        }
        I80 type = o7.getType();
        sb.append(U(type));
        if (m()) {
            List listX1 = x1(o7);
            if (b() || !listX1.isEmpty()) {
                AbstractC2455Um.k0(listX1, sb, (124 & 2) != 0 ? ", " : ", ", (124 & 4) != 0 ? "" : "(", (124 & 8) == 0 ? ")" : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : null);
            }
        }
        if (i1() && (N80.a(type) || (type.N0().c() instanceof C0560Co0.b))) {
            sb.append(" /* annotation class not found */");
        }
        String string = sb.toString();
        G10.f(string, "toString(...)");
        return string;
    }

    public EnumC4197eA0 P0() {
        return this.m.O();
    }

    public final void P1(InterfaceC0626Dc1 interfaceC0626Dc1, StringBuilder sb) {
        AbstractC2887Yq abstractC2887YqT;
        String strF1;
        if (!G0() || (abstractC2887YqT = interfaceC0626Dc1.T()) == null || (strF1 = F1(abstractC2887YqT)) == null) {
            return;
        }
        sb.append(" = ");
        sb.append(s0(strF1));
    }

    public boolean Q0() {
        return this.m.Q();
    }

    public final String Q1(String str) {
        int i = b.a[d1().ordinal()];
        if (i != 1) {
            if (i != 2) {
                throw new C6902no0();
            }
            if (!y0()) {
                return "<b>" + str + "</b>";
            }
        }
        return str;
    }

    @Override // com.daaw.AbstractC2923Yz
    public String R(String str, String str2, AbstractC8670u80 abstractC8670u80) {
        G10.g(str, "lowerRendered");
        G10.g(str2, "upperRendered");
        G10.g(abstractC8670u80, "builtIns");
        if (AbstractC3394bI0.f(str, str2)) {
            if (!AY0.u(str2, "(", false, 2, null)) {
                return str + '!';
            }
            return '(' + str + ")!";
        }
        InterfaceC0443Bl interfaceC0443BlA0 = A0();
        InterfaceC4923gl interfaceC4923glW = abstractC8670u80.w();
        G10.f(interfaceC4923glW, "getCollection(...)");
        String strZ0 = BY0.z0(interfaceC0443BlA0.a(interfaceC4923glW, this), "Collection", null, 2, null);
        String strD = AbstractC3394bI0.d(str, strZ0 + "Mutable", str2, strZ0, strZ0 + "(Mutable)");
        if (strD != null) {
            return strD;
        }
        String strD2 = AbstractC3394bI0.d(str, strZ0 + "MutableMap.MutableEntry", str2, strZ0 + "Map.Entry", strZ0 + "(Mutable)Map.(Mutable)Entry");
        if (strD2 != null) {
            return strD2;
        }
        InterfaceC0443Bl interfaceC0443BlA02 = A0();
        InterfaceC4923gl interfaceC4923glJ = abstractC8670u80.j();
        G10.f(interfaceC4923glJ, "getArray(...)");
        String strZ02 = BY0.z0(interfaceC0443BlA02.a(interfaceC4923glJ, this), "Array", null, 2, null);
        String strD3 = AbstractC3394bI0.d(str, strZ02 + s0("Array<"), str2, strZ02 + s0("Array<out "), strZ02 + s0("Array<(out) "));
        if (strD3 != null) {
            return strD3;
        }
        return '(' + str + ".." + str2 + ')';
    }

    public boolean R0() {
        return this.m.R();
    }

    public final void R1(InterfaceC1583Mi interfaceC1583Mi, StringBuilder sb) {
        if (I0().contains(EnumC4764gA.K) && i1() && interfaceC1583Mi.i() != InterfaceC1583Mi.a.DECLARATION) {
            sb.append("/*");
            sb.append(AbstractC9393wj.f(interfaceC1583Mi.i().name()));
            sb.append("*/ ");
        }
    }

    @Override // com.daaw.AbstractC2923Yz
    public String S(BP bp) {
        G10.g(bp, "fqName");
        List listH = bp.h();
        G10.f(listH, "pathSegments(...)");
        return M1(listH);
    }

    public boolean S0() {
        return this.m.S();
    }

    public final void S1(InterfaceC2232Si0 interfaceC2232Si0, StringBuilder sb) {
        W1(sb, interfaceC2232Si0.isExternal(), "external");
        boolean z = false;
        W1(sb, I0().contains(EnumC4764gA.N) && interfaceC2232Si0.J(), "expect");
        if (I0().contains(EnumC4764gA.O) && interfaceC2232Si0.E0()) {
            z = true;
        }
        W1(sb, z, "actual");
    }

    @Override // com.daaw.AbstractC2923Yz
    public String T(C2352Tm0 c2352Tm0, boolean z) {
        G10.g(c2352Tm0, "name");
        String strS0 = s0(AbstractC3394bI0.b(c2352Tm0));
        if (!y0() || d1() != EnumC3115aI0.C || !z) {
            return strS0;
        }
        return "<b>" + strS0 + "</b>";
    }

    public boolean T0() {
        return this.m.T();
    }

    public String T1(String str) {
        G10.g(str, "message");
        int i = b.a[d1().ordinal()];
        if (i == 1) {
            return str;
        }
        if (i != 2) {
            throw new C6902no0();
        }
        return "<i>" + str + "</i>";
    }

    @Override // com.daaw.AbstractC2923Yz
    public String U(I80 i80) {
        G10.g(i80, "type");
        StringBuilder sb = new StringBuilder();
        Y1(sb, (I80) e1().invoke(i80));
        String string = sb.toString();
        G10.f(string, "toString(...)");
        return string;
    }

    public boolean U0() {
        return this.m.U();
    }

    public final void U1(EnumC0336Ak0 enumC0336Ak0, StringBuilder sb, EnumC0336Ak0 enumC0336Ak02) {
        if (V0() || enumC0336Ak0 != enumC0336Ak02) {
            W1(sb, I0().contains(EnumC4764gA.G), AbstractC9393wj.f(enumC0336Ak0.name()));
        }
    }

    @Override // com.daaw.AbstractC2923Yz
    public String V(InterfaceC6440m81 interfaceC6440m81) throws IOException {
        G10.g(interfaceC6440m81, "typeProjection");
        StringBuilder sb = new StringBuilder();
        p0(sb, AbstractC1496Lm.e(interfaceC6440m81));
        String string = sb.toString();
        G10.f(string, "toString(...)");
        return string;
    }

    public boolean V0() {
        return this.m.V();
    }

    public final void V1(InterfaceC1583Mi interfaceC1583Mi, StringBuilder sb) {
        if (AbstractC7006oA.J(interfaceC1583Mi) && interfaceC1583Mi.l() == EnumC0336Ak0.C) {
            return;
        }
        if (L0() == EnumC0572Cr0.B && interfaceC1583Mi.l() == EnumC0336Ak0.E && t1(interfaceC1583Mi)) {
            return;
        }
        EnumC0336Ak0 enumC0336Ak0L = interfaceC1583Mi.l();
        G10.f(enumC0336Ak0L, "getModality(...)");
        U1(enumC0336Ak0L, sb, q1(interfaceC1583Mi));
    }

    public boolean W0() {
        return this.m.W();
    }

    public final void W1(StringBuilder sb, boolean z, String str) {
        if (z) {
            sb.append(Q1(str));
            sb.append(" ");
        }
    }

    public boolean X0() {
        return this.m.X();
    }

    public final void X1(InterfaceC8612tw interfaceC8612tw, StringBuilder sb, boolean z) {
        C2352Tm0 name = interfaceC8612tw.getName();
        G10.f(name, "getName(...)");
        sb.append(T(name, z));
    }

    public boolean Y0() {
        return this.m.Y();
    }

    public final void Y1(StringBuilder sb, I80 i80) {
        AbstractC5708ja1 abstractC5708ja1Q0 = i80.Q0();
        C3310b c3310b = abstractC5708ja1Q0 instanceof C3310b ? (C3310b) abstractC5708ja1Q0 : null;
        if (c3310b == null) {
            Z1(sb, i80);
            return;
        }
        if (Y0()) {
            Z1(sb, c3310b.S());
            return;
        }
        Z1(sb, c3310b.Z0());
        if (Z0()) {
            u1(sb, c3310b);
        }
    }

    public boolean Z0() {
        return this.m.Z();
    }

    public final void Z1(StringBuilder sb, I80 i80) {
        if ((i80 instanceof AbstractC4347ej1) && o() && !((AbstractC4347ej1) i80).S0()) {
            sb.append("<Not computed yet>");
            return;
        }
        AbstractC5708ja1 abstractC5708ja1Q0 = i80.Q0();
        if (abstractC5708ja1Q0 instanceof UM) {
            sb.append(((UM) abstractC5708ja1Q0).X0(this, this));
        } else {
            if (!(abstractC5708ja1Q0 instanceof YS0)) {
                throw new C6902no0();
            }
            j2(sb, (YS0) abstractC5708ja1Q0);
        }
    }

    @Override // com.daaw.InterfaceC5043hA
    public void a(Set set) {
        G10.g(set, "<set-?>");
        this.m.a(set);
    }

    public boolean a1() {
        return this.m.a0();
    }

    public final void a2(InterfaceC1583Mi interfaceC1583Mi, StringBuilder sb) {
        if (I0().contains(EnumC4764gA.H) && t1(interfaceC1583Mi) && L0() != EnumC0572Cr0.C) {
            W1(sb, true, "override");
            if (i1()) {
                sb.append("/*");
                sb.append(interfaceC1583Mi.e().size());
                sb.append("*/ ");
            }
        }
    }

    @Override // com.daaw.InterfaceC5043hA
    public boolean b() {
        return this.m.b();
    }

    public boolean b1() {
        return this.m.b0();
    }

    public final void b2(InterfaceC2372Tr0 interfaceC2372Tr0, StringBuilder sb) {
        c2(interfaceC2372Tr0.d(), "package-fragment", sb);
        if (o()) {
            sb.append(" in ");
            X1(interfaceC2372Tr0.b(), sb, false);
        }
    }

    @Override // com.daaw.InterfaceC5043hA
    public void c(boolean z) {
        this.m.c(z);
    }

    public boolean c1() {
        return this.m.c0();
    }

    public final void c2(AP ap, String str, StringBuilder sb) {
        sb.append(Q1(str));
        BP bpJ = ap.j();
        G10.f(bpJ, "toUnsafe(...)");
        String strS = S(bpJ);
        if (strS.length() > 0) {
            sb.append(" ");
            sb.append(strS);
        }
    }

    @Override // com.daaw.InterfaceC5043hA
    public void d(Set set) {
        G10.g(set, "<set-?>");
        this.m.d(set);
    }

    public EnumC3115aI0 d1() {
        return this.m.d0();
    }

    public final void d2(InterfaceC5516is0 interfaceC5516is0, StringBuilder sb) {
        c2(interfaceC5516is0.d(), "package", sb);
        if (o()) {
            sb.append(" in context of ");
            X1(interfaceC5516is0.t0(), sb, false);
        }
    }

    @Override // com.daaw.InterfaceC5043hA
    public void e(boolean z) {
        this.m.e(z);
    }

    public NQ e1() {
        return this.m.e0();
    }

    public final void e2(StringBuilder sb, C2292Sx0 c2292Sx0) {
        C2292Sx0 c2292Sx0C = c2292Sx0.c();
        if (c2292Sx0C != null) {
            e2(sb, c2292Sx0C);
            sb.append('.');
            C2352Tm0 name = c2292Sx0.b().getName();
            G10.f(name, "getName(...)");
            sb.append(T(name, false));
        } else {
            C71 c71K = c2292Sx0.b().k();
            G10.f(c71K, "getTypeConstructor(...)");
            sb.append(q2(c71K));
        }
        sb.append(p2(c2292Sx0.a()));
    }

    @Override // com.daaw.InterfaceC5043hA
    public void f(EnumC3115aI0 enumC3115aI0) {
        G10.g(enumC3115aI0, "<set-?>");
        this.m.f(enumC3115aI0);
    }

    public boolean f1() {
        return this.m.f0();
    }

    public final void f2(InterfaceC4476fA0 interfaceC4476fA0, StringBuilder sb) throws IOException {
        InterfaceC4476fA0 interfaceC4476fA02;
        StringBuilder sb2;
        if (c1()) {
            interfaceC4476fA02 = interfaceC4476fA0;
            sb2 = sb;
        } else {
            if (!b1()) {
                g2(interfaceC4476fA0, sb);
                List listO0 = interfaceC4476fA0.o0();
                G10.f(listO0, "getContextReceiverParameters(...)");
                I1(listO0, sb);
                AbstractC8965vA visibility = interfaceC4476fA0.getVisibility();
                G10.f(visibility, "getVisibility(...)");
                C2(visibility, sb);
                boolean z = false;
                W1(sb, I0().contains(EnumC4764gA.P) && interfaceC4476fA0.y(), "const");
                S1(interfaceC4476fA0, sb);
                V1(interfaceC4476fA0, sb);
                a2(interfaceC4476fA0, sb);
                if (I0().contains(EnumC4764gA.Q) && interfaceC4476fA0.p0()) {
                    z = true;
                }
                W1(sb, z, "lateinit");
                R1(interfaceC4476fA0, sb);
            }
            interfaceC4476fA02 = interfaceC4476fA0;
            sb2 = sb;
            y2(this, interfaceC4476fA02, sb2, false, 4, null);
            List typeParameters = interfaceC4476fA02.getTypeParameters();
            G10.f(typeParameters, "getTypeParameters(...)");
            w2(typeParameters, sb2, true);
            h2(interfaceC4476fA02, sb2);
        }
        X1(interfaceC4476fA02, sb2, true);
        sb2.append(": ");
        I80 type = interfaceC4476fA02.getType();
        G10.f(type, "getType(...)");
        sb2.append(U(type));
        i2(interfaceC4476fA02, sb2);
        P1(interfaceC4476fA02, sb2);
        List typeParameters2 = interfaceC4476fA02.getTypeParameters();
        G10.f(typeParameters2, "getTypeParameters(...)");
        D2(typeParameters2, sb2);
    }

    @Override // com.daaw.InterfaceC5043hA
    public boolean g() {
        return this.m.g();
    }

    public boolean g1() {
        return this.m.g0();
    }

    public final void g2(InterfaceC4476fA0 interfaceC4476fA0, StringBuilder sb) {
        if (I0().contains(EnumC4764gA.I)) {
            z1(this, sb, interfaceC4476fA0, null, 2, null);
            InterfaceC3401bK interfaceC3401bKN0 = interfaceC4476fA0.n0();
            if (interfaceC3401bKN0 != null) {
                y1(sb, interfaceC3401bKN0, W7.C);
            }
            InterfaceC3401bK interfaceC3401bKK0 = interfaceC4476fA0.k0();
            if (interfaceC3401bKK0 != null) {
                y1(sb, interfaceC3401bKK0, W7.K);
            }
            if (P0() == EnumC4197eA0.D) {
                InterfaceC5044hA0 interfaceC5044hA0F = interfaceC4476fA0.f();
                if (interfaceC5044hA0F != null) {
                    y1(sb, interfaceC5044hA0F, W7.F);
                }
                InterfaceC7565qA0 interfaceC7565qA0G = interfaceC4476fA0.g();
                if (interfaceC7565qA0G != null) {
                    y1(sb, interfaceC7565qA0G, W7.G);
                    List listH = interfaceC7565qA0G.h();
                    G10.f(listH, "getValueParameters(...)");
                    InterfaceC9918yc1 interfaceC9918yc1 = (InterfaceC9918yc1) AbstractC2455Um.C0(listH);
                    G10.d(interfaceC9918yc1);
                    y1(sb, interfaceC9918yc1, W7.J);
                }
            }
        }
    }

    @Override // com.daaw.InterfaceC5043hA
    public void h(EnumC1728Ns0 enumC1728Ns0) {
        G10.g(enumC1728Ns0, "<set-?>");
        this.m.h(enumC1728Ns0);
    }

    public AbstractC2923Yz.b h1() {
        return this.m.h0();
    }

    public final void h2(InterfaceC1376Ki interfaceC1376Ki, StringBuilder sb) {
        RE0 re0I0 = interfaceC1376Ki.i0();
        if (re0I0 != null) {
            y1(sb, re0I0, W7.H);
            I80 type = re0I0.getType();
            G10.f(type, "getType(...)");
            sb.append(L1(type));
            sb.append(".");
        }
    }

    @Override // com.daaw.InterfaceC5043hA
    public void i(boolean z) {
        this.m.i(z);
    }

    public boolean i1() {
        return this.m.i0();
    }

    public final void i2(InterfaceC1376Ki interfaceC1376Ki, StringBuilder sb) {
        RE0 re0I0;
        if (Q0() && (re0I0 = interfaceC1376Ki.i0()) != null) {
            sb.append(" on ");
            I80 type = re0I0.getType();
            G10.f(type, "getType(...)");
            sb.append(U(type));
        }
    }

    @Override // com.daaw.InterfaceC5043hA
    public void j(boolean z) {
        this.m.j(z);
    }

    public boolean j1() {
        return this.m.j0();
    }

    public final void j2(StringBuilder sb, YS0 ys0) {
        if (G10.c(ys0, D81.b) || D81.k(ys0)) {
            sb.append("???");
            return;
        }
        if (BH.o(ys0)) {
            if (!f1()) {
                sb.append("???");
                return;
            }
            C71 c71N0 = ys0.N0();
            G10.e(c71N0, "null cannot be cast to non-null type org.jetbrains.kotlin.types.error.ErrorTypeConstructor");
            sb.append(K1(((C10109zH) c71N0).g(0)));
            return;
        }
        if (N80.a(ys0)) {
            J1(sb, ys0);
        } else if (E2(ys0)) {
            O1(sb, ys0);
        } else {
            J1(sb, ys0);
        }
    }

    @Override // com.daaw.InterfaceC5043hA
    public void k(boolean z) {
        this.m.k(z);
    }

    public boolean k1() {
        return this.m.k0();
    }

    public final void k2(StringBuilder sb) {
        int length = sb.length();
        if (length == 0 || sb.charAt(length - 1) != ' ') {
            sb.append(' ');
        }
    }

    @Override // com.daaw.InterfaceC5043hA
    public void l(boolean z) {
        this.m.l(z);
    }

    public boolean l1() {
        return this.m.l0();
    }

    public final void l2(InterfaceC4923gl interfaceC4923gl, StringBuilder sb) throws IOException {
        if (m1() || AbstractC8670u80.n0(interfaceC4923gl.s())) {
            return;
        }
        Collection collectionB = interfaceC4923gl.k().b();
        G10.f(collectionB, "getSupertypes(...)");
        if (collectionB.isEmpty()) {
            return;
        }
        if (collectionB.size() == 1 && AbstractC8670u80.b0((I80) collectionB.iterator().next())) {
            return;
        }
        k2(sb);
        sb.append(": ");
        AbstractC2455Um.k0(collectionB, sb, (124 & 2) != 0 ? ", " : ", ", (124 & 4) != 0 ? "" : null, (124 & 8) == 0 ? null : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : new C3918dA(this));
    }

    @Override // com.daaw.InterfaceC5043hA
    public boolean m() {
        return this.m.m();
    }

    public boolean m1() {
        return this.m.m0();
    }

    @Override // com.daaw.InterfaceC5043hA
    public Set n() {
        return this.m.n();
    }

    public boolean n1() {
        return this.m.n0();
    }

    public final void n2(InterfaceC8468tR interfaceC8468tR, StringBuilder sb) {
        W1(sb, interfaceC8468tR.isSuspend(), "suspend");
    }

    @Override // com.daaw.InterfaceC5043hA
    public boolean o() {
        return this.m.o();
    }

    public final void o0(StringBuilder sb, InterfaceC8612tw interfaceC8612tw) {
        InterfaceC8612tw interfaceC8612twB;
        String name;
        if ((interfaceC8612tw instanceof InterfaceC2372Tr0) || (interfaceC8612tw instanceof InterfaceC5516is0) || (interfaceC8612twB = interfaceC8612tw.b()) == null || (interfaceC8612twB instanceof InterfaceC2968Zk0)) {
            return;
        }
        sb.append(" ");
        sb.append(T1("defined in"));
        sb.append(" ");
        BP bpM = AbstractC7006oA.m(interfaceC8612twB);
        G10.f(bpM, "getFqName(...)");
        sb.append(bpM.e() ? "root package" : S(bpM));
        if (k1() && (interfaceC8612twB instanceof InterfaceC2372Tr0) && (interfaceC8612tw instanceof InterfaceC10293zw) && (name = ((InterfaceC10293zw) interfaceC8612tw).j().a().getName()) != null) {
            sb.append(" ");
            sb.append(T1("in file"));
            sb.append(" ");
            sb.append(name);
        }
    }

    public final String o1() {
        return s0(">");
    }

    public final void o2(InterfaceC5586j71 interfaceC5586j71, StringBuilder sb) {
        z1(this, sb, interfaceC5586j71, null, 2, null);
        AbstractC8965vA visibility = interfaceC5586j71.getVisibility();
        G10.f(visibility, "getVisibility(...)");
        C2(visibility, sb);
        S1(interfaceC5586j71, sb);
        sb.append(Q1("typealias"));
        sb.append(" ");
        X1(interfaceC5586j71, sb, true);
        List listV = interfaceC5586j71.v();
        G10.f(listV, "getDeclaredTypeParameters(...)");
        w2(listV, sb, false);
        A1(interfaceC5586j71, sb);
        sb.append(" = ");
        sb.append(U(interfaceC5586j71.d0()));
    }

    @Override // com.daaw.InterfaceC5043hA
    public H7 p() {
        return this.m.p();
    }

    public final void p0(StringBuilder sb, List list) throws IOException {
        AbstractC2455Um.k0(list, sb, (124 & 2) != 0 ? ", " : ", ", (124 & 4) != 0 ? "" : null, (124 & 8) == 0 ? null : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : new C3361bA(this));
    }

    public final boolean p1(I80 i80) {
        return AR.r(i80) || !i80.getAnnotations().isEmpty();
    }

    public String p2(List list) throws IOException {
        G10.g(list, "typeArguments");
        if (list.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(s1());
        p0(sb, list);
        sb.append(o1());
        String string = sb.toString();
        G10.f(string, "toString(...)");
        return string;
    }

    @Override // com.daaw.InterfaceC5043hA
    public void q(InterfaceC0443Bl interfaceC0443Bl) {
        G10.g(interfaceC0443Bl, "<set-?>");
        this.m.q(interfaceC0443Bl);
    }

    public final EnumC0336Ak0 q1(InterfaceC2232Si0 interfaceC2232Si0) {
        if (interfaceC2232Si0 instanceof InterfaceC4923gl) {
            return ((InterfaceC4923gl) interfaceC2232Si0).i() == EnumC6886nl.D ? EnumC0336Ak0.F : EnumC0336Ak0.C;
        }
        InterfaceC8612tw interfaceC8612twB = interfaceC2232Si0.b();
        InterfaceC4923gl interfaceC4923gl = interfaceC8612twB instanceof InterfaceC4923gl ? (InterfaceC4923gl) interfaceC8612twB : null;
        if (interfaceC4923gl == null) {
            return EnumC0336Ak0.C;
        }
        if (!(interfaceC2232Si0 instanceof InterfaceC1583Mi)) {
            return EnumC0336Ak0.C;
        }
        InterfaceC1583Mi interfaceC1583Mi = (InterfaceC1583Mi) interfaceC2232Si0;
        Collection collectionE = interfaceC1583Mi.e();
        G10.f(collectionE, "getOverriddenDescriptors(...)");
        if (!collectionE.isEmpty() && interfaceC4923gl.l() != EnumC0336Ak0.C) {
            return EnumC0336Ak0.E;
        }
        if (interfaceC4923gl.i() != EnumC6886nl.D || G10.c(interfaceC1583Mi.getVisibility(), AbstractC8679uA.a)) {
            return EnumC0336Ak0.C;
        }
        EnumC0336Ak0 enumC0336Ak0L = interfaceC1583Mi.l();
        EnumC0336Ak0 enumC0336Ak0 = EnumC0336Ak0.F;
        return enumC0336Ak0L == enumC0336Ak0 ? enumC0336Ak0 : EnumC0336Ak0.E;
    }

    public String q2(C71 c71) {
        G10.g(c71, "typeConstructor");
        InterfaceC10240zl interfaceC10240zlC = c71.c();
        if ((interfaceC10240zlC instanceof Z71) || (interfaceC10240zlC instanceof InterfaceC4923gl) || (interfaceC10240zlC instanceof InterfaceC5586j71)) {
            return D1(interfaceC10240zlC);
        }
        if (interfaceC10240zlC == null) {
            return c71 instanceof B10 ? ((B10) c71).m(C3082aA.B) : c71.toString();
        }
        throw new IllegalStateException(("Unexpected classifier: " + interfaceC10240zlC.getClass()).toString());
    }

    @Override // com.daaw.InterfaceC5043hA
    public void r(boolean z) {
        this.m.r(z);
    }

    public final String r0() {
        int i = b.a[d1().ordinal()];
        if (i == 1) {
            return s0("->");
        }
        if (i == 2) {
            return "&rarr;";
        }
        throw new C6902no0();
    }

    public final boolean r1(O7 o7) {
        return G10.c(o7.d(), YV0.a.E);
    }

    public final String s0(String str) {
        return d1().c(str);
    }

    public final String s1() {
        return s0("<");
    }

    public final void s2(StringBuilder sb, I80 i80, C71 c71) {
        C2292Sx0 c2292Sx0D = AbstractC6161l81.d(i80);
        if (c2292Sx0D != null) {
            e2(sb, c2292Sx0D);
        } else {
            sb.append(q2(c71));
            sb.append(p2(i80.L0()));
        }
    }

    public final boolean t1(InterfaceC1583Mi interfaceC1583Mi) {
        return !interfaceC1583Mi.e().isEmpty();
    }

    public final void u1(StringBuilder sb, C3310b c3310b) {
        EnumC3115aI0 enumC3115aI0D1 = d1();
        EnumC3115aI0 enumC3115aI0 = EnumC3115aI0.C;
        if (enumC3115aI0D1 == enumC3115aI0) {
            sb.append("<font color=\"808080\"><i>");
        }
        sb.append(" /* = ");
        Z1(sb, c3310b.S());
        sb.append(" */");
        if (d1() == enumC3115aI0) {
            sb.append("</i></font>");
        }
    }

    public final void u2(Z71 z71, StringBuilder sb, boolean z) {
        if (z) {
            sb.append(s1());
        }
        if (i1()) {
            sb.append("/*");
            sb.append(z71.getIndex());
            sb.append("*/ ");
        }
        W1(sb, z71.D(), "reified");
        String strG = z71.o().g();
        boolean z2 = true;
        W1(sb, strG.length() > 0, strG);
        z1(this, sb, z71, null, 2, null);
        X1(z71, sb, z);
        int size = z71.getUpperBounds().size();
        if ((size > 1 && !z) || size == 1) {
            I80 i80 = (I80) z71.getUpperBounds().iterator().next();
            if (!AbstractC8670u80.j0(i80)) {
                sb.append(" : ");
                G10.d(i80);
                sb.append(U(i80));
            }
        } else if (z) {
            for (I80 i802 : z71.getUpperBounds()) {
                if (!AbstractC8670u80.j0(i802)) {
                    if (z2) {
                        sb.append(" : ");
                    } else {
                        sb.append(" & ");
                    }
                    G10.d(i802);
                    sb.append(U(i802));
                    z2 = false;
                }
            }
        }
        if (z) {
            sb.append(o1());
        }
    }

    public boolean v0() {
        return this.m.w();
    }

    public final void v1(InterfaceC3640cA0 interfaceC3640cA0, StringBuilder sb) {
        S1(interfaceC3640cA0, sb);
    }

    public final void v2(StringBuilder sb, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            u2((Z71) it.next(), sb, false);
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
    }

    public boolean w0() {
        return this.m.x();
    }

    public final void w1(InterfaceC8468tR interfaceC8468tR, StringBuilder sb) {
        boolean z;
        boolean z2 = false;
        if (interfaceC8468tR.isOperator()) {
            Collection collectionE = interfaceC8468tR.e();
            G10.f(collectionE, "getOverriddenDescriptors(...)");
            Collection collection = collectionE;
            if (!collection.isEmpty()) {
                Iterator it = collection.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (((InterfaceC8468tR) it.next()).isOperator()) {
                        if (w0()) {
                            break;
                        }
                    }
                }
                z = false;
            }
            z = true;
        } else {
            z = false;
        }
        if (interfaceC8468tR.isInfix()) {
            Collection collectionE2 = interfaceC8468tR.e();
            G10.f(collectionE2, "getOverriddenDescriptors(...)");
            Collection collection2 = collectionE2;
            if (collection2.isEmpty()) {
                z2 = true;
            } else {
                Iterator it2 = collection2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    } else if (((InterfaceC8468tR) it2.next()).isInfix()) {
                        if (w0()) {
                            break;
                        }
                    }
                }
            }
        }
        W1(sb, interfaceC8468tR.M(), "tailrec");
        n2(interfaceC8468tR, sb);
        W1(sb, interfaceC8468tR.isInline(), "inline");
        W1(sb, z2, "infix");
        W1(sb, z, "operator");
    }

    public final void w2(List list, StringBuilder sb, boolean z) {
        if (n1() || list.isEmpty()) {
            return;
        }
        sb.append(s1());
        v2(sb, list);
        sb.append(o1());
        if (z) {
            sb.append(" ");
        }
    }

    public NQ x0() {
        return this.m.y();
    }

    public final List x1(O7 o7) {
        InterfaceC3241al interfaceC3241alN;
        List listH;
        Map mapK = o7.k();
        List listK = null;
        InterfaceC4923gl interfaceC4923glL = U0() ? AbstractC8400tA.l(o7) : null;
        if (interfaceC4923glL != null && (interfaceC3241alN = interfaceC4923glL.N()) != null && (listH = interfaceC3241alN.h()) != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : listH) {
                if (((InterfaceC9918yc1) obj).s0()) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(AbstractC1703Nm.v(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((InterfaceC9918yc1) it.next()).getName());
            }
            listK = arrayList2;
        }
        if (listK == null) {
            listK = AbstractC1599Mm.k();
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : listK) {
            if (!mapK.containsKey((C2352Tm0) obj2)) {
                arrayList3.add(obj2);
            }
        }
        ArrayList arrayList4 = new ArrayList(AbstractC1703Nm.v(arrayList3, 10));
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            arrayList4.add(((C2352Tm0) it2.next()).c() + " = ...");
        }
        Set<Map.Entry> setEntrySet = mapK.entrySet();
        ArrayList arrayList5 = new ArrayList(AbstractC1703Nm.v(setEntrySet, 10));
        for (Map.Entry entry : setEntrySet) {
            C2352Tm0 c2352Tm0 = (C2352Tm0) entry.getKey();
            AbstractC2887Yq abstractC2887Yq = (AbstractC2887Yq) entry.getValue();
            StringBuilder sb = new StringBuilder();
            sb.append(c2352Tm0.c());
            sb.append(" = ");
            sb.append(!listK.contains(c2352Tm0) ? F1(abstractC2887Yq) : "...");
            arrayList5.add(sb.toString());
        }
        return AbstractC2455Um.G0(AbstractC2455Um.z0(arrayList4, arrayList5));
    }

    public final void x2(InterfaceC0626Dc1 interfaceC0626Dc1, StringBuilder sb, boolean z) {
        if (z || !(interfaceC0626Dc1 instanceof InterfaceC9918yc1)) {
            sb.append(Q1(interfaceC0626Dc1.f0() ? "var" : "val"));
            sb.append(" ");
        }
    }

    public boolean y0() {
        return this.m.z();
    }

    public final void y1(StringBuilder sb, A7 a7, W7 w7) {
        if (I0().contains(EnumC4764gA.I)) {
            Set setN = a7 instanceof I80 ? n() : D0();
            NQ nqX0 = x0();
            for (O7 o7 : a7.getAnnotations()) {
                if (!AbstractC2455Um.W(setN, o7.d()) && !r1(o7) && (nqX0 == null || ((Boolean) nqX0.invoke(o7)).booleanValue())) {
                    sb.append(P(o7, w7));
                    if (C0()) {
                        sb.append('\n');
                        G10.f(sb, "append(...)");
                    } else {
                        sb.append(" ");
                    }
                }
            }
        }
    }

    public boolean z0() {
        return this.m.A();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void z2(com.daaw.InterfaceC9918yc1 r9, boolean r10, java.lang.StringBuilder r11, boolean r12) {
        /*
            r8 = this;
            if (r12 == 0) goto L10
            java.lang.String r2 = "value-parameter"
            java.lang.String r2 = r8.Q1(r2)
            r11.append(r2)
            java.lang.String r2 = " "
            r11.append(r2)
        L10:
            boolean r2 = r8.i1()
            if (r2 == 0) goto L27
            java.lang.String r2 = "/*"
            r11.append(r2)
            int r2 = r9.getIndex()
            r11.append(r2)
        */
        //  java.lang.String r2 = "*/ "
        /*
            r11.append(r2)
        L27:
            r4 = 2
            r5 = 0
            r3 = 0
            r0 = r8
            r2 = r9
            r1 = r11
            z1(r0, r1, r2, r3, r4, r5)
            boolean r2 = r9.Z()
            java.lang.String r3 = "crossinline"
            r8.W1(r11, r2, r3)
            boolean r2 = r9.V()
            java.lang.String r3 = "noinline"
            r8.W1(r11, r2, r3)
            boolean r2 = r8.X0()
            r6 = 0
            r7 = 1
            if (r2 == 0) goto L60
            com.daaw.Ki r2 = r9.b()
            boolean r3 = r2 instanceof com.daaw.InterfaceC3241al
            if (r3 == 0) goto L55
            com.daaw.al r2 = (com.daaw.InterfaceC3241al) r2
            goto L56
        L55:
            r2 = 0
        L56:
            if (r2 == 0) goto L60
            boolean r2 = r2.z()
            if (r2 != r7) goto L60
            r5 = 1
            goto L61
        L60:
            r5 = 0
        L61:
            if (r5 == 0) goto L6c
            boolean r2 = r8.v0()
            java.lang.String r3 = "actual"
            r8.W1(r11, r2, r3)
        L6c:
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r0.B2(r1, r2, r3, r4, r5)
            com.daaw.NQ r0 = r8.B0()
            if (r0 == 0) goto L8c
            boolean r0 = r8.o()
            if (r0 == 0) goto L85
            boolean r0 = r9.s0()
            goto L89
        L85:
            boolean r0 = com.daaw.AbstractC8400tA.f(r9)
        L89:
            if (r0 == 0) goto L8c
            r6 = 1
        L8c:
            if (r6 == 0) goto Laf
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = " = "
            r0.append(r2)
            com.daaw.NQ r2 = r8.B0()
            com.daaw.G10.d(r2)
            java.lang.Object r2 = r2.invoke(r9)
            java.lang.String r2 = (java.lang.String) r2
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r11.append(r0)
        Laf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C4475fA.z2(com.daaw.yc1, boolean, java.lang.StringBuilder, boolean):void");
    }
}
