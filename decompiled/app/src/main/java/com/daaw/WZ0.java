package com.daaw;

import com.daaw.AbstractC10093zD;
import com.daaw.InterfaceC1073Hk0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class WZ0 {

    public static final class a extends AbstractC4192e90 implements InterfaceC3429bR {
        public static final a B = new a();

        public a() {
            super(2);
        }

        @Override // com.daaw.InterfaceC3429bR
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final OM invoke(Object obj, Object obj2) {
            return new OM(C6460mD.l(56), null);
        }
    }

    public static final class b extends AbstractC4192e90 implements InterfaceC3986dR {
        public final /* synthetic */ Map B;
        public final /* synthetic */ XZ0 C;
        public final /* synthetic */ EnumC5792jr0 D;
        public final /* synthetic */ boolean E;
        public final /* synthetic */ InterfaceC4650fm0 F;
        public final /* synthetic */ boolean G;
        public final /* synthetic */ BI0 H;
        public final /* synthetic */ InterfaceC3429bR I;
        public final /* synthetic */ float J;

        public static final class a extends SZ0 implements InterfaceC3429bR {
            public int F;
            public final /* synthetic */ XZ0 G;
            public final /* synthetic */ Map H;
            public final /* synthetic */ BI0 I;
            public final /* synthetic */ InterfaceC4988gz J;
            public final /* synthetic */ InterfaceC3429bR K;
            public final /* synthetic */ float L;

            /* JADX INFO: renamed from: com.daaw.WZ0$b$a$a, reason: collision with other inner class name */
            public static final class C0128a extends AbstractC4192e90 implements InterfaceC3429bR {
                public final /* synthetic */ Map B;
                public final /* synthetic */ InterfaceC3429bR C;
                public final /* synthetic */ InterfaceC4988gz D;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0128a(Map map, InterfaceC3429bR interfaceC3429bR, InterfaceC4988gz interfaceC4988gz) {
                    super(2);
                    this.B = map;
                    this.C = interfaceC3429bR;
                    this.D = interfaceC4988gz;
                }

                public final Float a(float f, float f2) {
                    return Float.valueOf(((InterfaceC8367t31) this.C.invoke(AbstractC1473Lg0.i(this.B, Float.valueOf(f)), AbstractC1473Lg0.i(this.B, Float.valueOf(f2)))).a(this.D, f, f2));
                }

                @Override // com.daaw.InterfaceC3429bR
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    return a(((Number) obj).floatValue(), ((Number) obj2).floatValue());
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(XZ0 xz0, Map map, BI0 bi0, InterfaceC4988gz interfaceC4988gz, InterfaceC3429bR interfaceC3429bR, float f, InterfaceC1416Ks interfaceC1416Ks) {
                super(2, interfaceC1416Ks);
                this.G = xz0;
                this.H = map;
                this.I = bi0;
                this.J = interfaceC4988gz;
                this.K = interfaceC3429bR;
                this.L = f;
            }

            @Override // com.daaw.AbstractC7409pe
            public final InterfaceC1416Ks a(Object obj, InterfaceC1416Ks interfaceC1416Ks) {
                return new a(this.G, this.H, this.I, this.J, this.K, this.L, interfaceC1416Ks);
            }

            @Override // com.daaw.AbstractC7409pe
            public final Object q(Object obj) throws Throwable {
                Object objC = I10.c();
                int i = this.F;
                if (i == 0) {
                    AbstractC4801gJ0.b(obj);
                    Map mapL = this.G.l();
                    this.G.z(this.H);
                    this.G.C(this.I);
                    this.G.D(new C0128a(this.H, this.K, this.J));
                    this.G.E(this.J.O(this.L));
                    XZ0 xz0 = this.G;
                    Map map = this.H;
                    this.F = 1;
                    if (xz0.y(mapL, map, this) == objC) {
                        return objC;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC4801gJ0.b(obj);
                }
                return G91.a;
            }

            @Override // com.daaw.InterfaceC3429bR
            /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC7484pt interfaceC7484pt, InterfaceC1416Ks interfaceC1416Ks) {
                return ((a) a(interfaceC7484pt, interfaceC1416Ks)).q(G91.a);
            }
        }

        /* JADX INFO: renamed from: com.daaw.WZ0$b$b, reason: collision with other inner class name */
        public static final class C0129b extends SZ0 implements InterfaceC3986dR {
            public int F;
            public /* synthetic */ Object G;
            public /* synthetic */ float H;
            public final /* synthetic */ XZ0 I;

            /* JADX INFO: renamed from: com.daaw.WZ0$b$b$a */
            public static final class a extends SZ0 implements InterfaceC3429bR {
                public int F;
                public final /* synthetic */ XZ0 G;
                public final /* synthetic */ float H;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(XZ0 xz0, float f, InterfaceC1416Ks interfaceC1416Ks) {
                    super(2, interfaceC1416Ks);
                    this.G = xz0;
                    this.H = f;
                }

                @Override // com.daaw.AbstractC7409pe
                public final InterfaceC1416Ks a(Object obj, InterfaceC1416Ks interfaceC1416Ks) {
                    return new a(this.G, this.H, interfaceC1416Ks);
                }

                @Override // com.daaw.AbstractC7409pe
                public final Object q(Object obj) throws Throwable {
                    Object objC = I10.c();
                    int i = this.F;
                    if (i == 0) {
                        AbstractC4801gJ0.b(obj);
                        XZ0 xz0 = this.G;
                        float f = this.H;
                        this.F = 1;
                        if (xz0.x(f, this) == objC) {
                            return objC;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC4801gJ0.b(obj);
                    }
                    return G91.a;
                }

                @Override // com.daaw.InterfaceC3429bR
                /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
                public final Object invoke(InterfaceC7484pt interfaceC7484pt, InterfaceC1416Ks interfaceC1416Ks) {
                    return ((a) a(interfaceC7484pt, interfaceC1416Ks)).q(G91.a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0129b(XZ0 xz0, InterfaceC1416Ks interfaceC1416Ks) {
                super(3, interfaceC1416Ks);
                this.I = xz0;
            }

            @Override // com.daaw.InterfaceC3986dR
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return u((InterfaceC7484pt) obj, ((Number) obj2).floatValue(), (InterfaceC1416Ks) obj3);
            }

            @Override // com.daaw.AbstractC7409pe
            public final Object q(Object obj) throws Throwable {
                I10.c();
                if (this.F != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC4801gJ0.b(obj);
                AbstractC9104vh.d((InterfaceC7484pt) this.G, null, null, new a(this.I, this.H, null), 3, null);
                return G91.a;
            }

            public final Object u(InterfaceC7484pt interfaceC7484pt, float f, InterfaceC1416Ks interfaceC1416Ks) {
                C0129b c0129b = new C0129b(this.I, interfaceC1416Ks);
                c0129b.G = interfaceC7484pt;
                c0129b.H = f;
                return c0129b.q(G91.a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Map map, XZ0 xz0, EnumC5792jr0 enumC5792jr0, boolean z, InterfaceC4650fm0 interfaceC4650fm0, boolean z2, BI0 bi0, InterfaceC3429bR interfaceC3429bR, float f) {
            super(3);
            this.B = map;
            this.C = xz0;
            this.D = enumC5792jr0;
            this.E = z;
            this.F = interfaceC4650fm0;
            this.G = z2;
            this.H = bi0;
            this.I = interfaceC3429bR;
            this.J = f;
        }

        public final InterfaceC1073Hk0 a(InterfaceC1073Hk0 interfaceC1073Hk0, InterfaceC5781jp interfaceC5781jp, int i) {
            G10.g(interfaceC1073Hk0, "$this$composed");
            interfaceC5781jp.e(43594985);
            if (AbstractC6348lp.O()) {
                AbstractC6348lp.Z(43594985, i, -1, "androidx.compose.material.swipeable.<anonymous> (Swipeable.kt:585)");
            }
            if (this.B.isEmpty()) {
                throw new IllegalArgumentException("You must have at least one anchor.");
            }
            if (AbstractC2455Um.X(this.B.values()).size() != this.B.size()) {
                throw new IllegalArgumentException("You cannot have two anchors mapped to the same state.");
            }
            InterfaceC4988gz interfaceC4988gz = (InterfaceC4988gz) interfaceC5781jp.O(AbstractC2259Sp.d());
            this.C.k(this.B);
            Map map = this.B;
            XZ0 xz0 = this.C;
            AbstractC8420tF.d(map, xz0, new a(xz0, map, this.H, interfaceC4988gz, this.I, this.J, null), interfaceC5781jp, 520);
            InterfaceC1073Hk0.a aVar = InterfaceC1073Hk0.m;
            boolean zW = this.C.w();
            BD bdP = this.C.p();
            EnumC5792jr0 enumC5792jr0 = this.D;
            boolean z = this.E;
            InterfaceC4650fm0 interfaceC4650fm0 = this.F;
            XZ0 xz02 = this.C;
            interfaceC5781jp.e(1157296644);
            boolean zP = interfaceC5781jp.P(xz02);
            Object objF = interfaceC5781jp.f();
            if (zP || objF == InterfaceC5781jp.a.a()) {
                objF = new C0129b(xz02, null);
                interfaceC5781jp.H(objF);
            }
            interfaceC5781jp.L();
            InterfaceC1073Hk0 interfaceC1073Hk0H = AbstractC10093zD.h(aVar, bdP, enumC5792jr0, (32 & 4) != 0 ? true : z, (32 & 8) != 0 ? null : interfaceC4650fm0, (32 & 16) != 0 ? false : zW, (32 & 32) != 0 ? new AbstractC10093zD.e(null) : null, (32 & 64) != 0 ? new AbstractC10093zD.f(null) : (InterfaceC3986dR) objF, (32 & 128) != 0 ? false : this.G);
            if (AbstractC6348lp.O()) {
                AbstractC6348lp.Y();
            }
            interfaceC5781jp.L();
            return interfaceC1073Hk0H;
        }

        @Override // com.daaw.InterfaceC3986dR
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a((InterfaceC1073Hk0) obj, (InterfaceC5781jp) obj2, ((Number) obj3).intValue());
        }
    }

    public static final class c extends AbstractC4192e90 implements NQ {
        public final /* synthetic */ XZ0 B;
        public final /* synthetic */ Map C;
        public final /* synthetic */ EnumC5792jr0 D;
        public final /* synthetic */ boolean E;
        public final /* synthetic */ boolean F;
        public final /* synthetic */ InterfaceC4650fm0 G;
        public final /* synthetic */ InterfaceC3429bR H;
        public final /* synthetic */ BI0 I;
        public final /* synthetic */ float J;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(XZ0 xz0, Map map, EnumC5792jr0 enumC5792jr0, boolean z, boolean z2, InterfaceC4650fm0 interfaceC4650fm0, InterfaceC3429bR interfaceC3429bR, BI0 bi0, float f) {
            super(1);
            this.B = xz0;
            this.C = map;
            this.D = enumC5792jr0;
            this.E = z;
            this.F = z2;
            this.G = interfaceC4650fm0;
            this.H = interfaceC3429bR;
            this.I = bi0;
            this.J = f;
        }

        public final void a(AbstractC6120l00 abstractC6120l00) {
            G10.g(abstractC6120l00, "$this$null");
            throw null;
        }

        @Override // com.daaw.NQ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            AbstractC6314li0.a(obj);
            a(null);
            return G91.a;
        }
    }

    public static final float c(float f, float f2, Set set, InterfaceC3429bR interfaceC3429bR, float f3, float f4) {
        List listD = d(f, set);
        int size = listD.size();
        if (size == 0) {
            return f2;
        }
        if (size == 1) {
            return ((Number) listD.get(0)).floatValue();
        }
        float fFloatValue = ((Number) listD.get(0)).floatValue();
        float fFloatValue2 = ((Number) listD.get(1)).floatValue();
        return (f2 > f ? f3 > (-f4) && f > ((Number) interfaceC3429bR.invoke(Float.valueOf(fFloatValue2), Float.valueOf(fFloatValue))).floatValue() : f3 >= f4 || f >= ((Number) interfaceC3429bR.invoke(Float.valueOf(fFloatValue), Float.valueOf(fFloatValue2))).floatValue()) ? fFloatValue2 : fFloatValue;
    }

    public static final List d(float f, Set set) {
        Set set2 = set;
        ArrayList arrayList = new ArrayList();
        for (Object obj : set2) {
            if (((Number) obj).floatValue() <= ((double) f) + 0.001d) {
                arrayList.add(obj);
            }
        }
        Float fT0 = AbstractC2455Um.t0(arrayList);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : set2) {
            if (((Number) obj2).floatValue() >= ((double) f) - 0.001d) {
                arrayList2.add(obj2);
            }
        }
        Float fV0 = AbstractC2455Um.v0(arrayList2);
        return fT0 == null ? AbstractC1599Mm.o(fV0) : fV0 == null ? AbstractC1496Lm.e(fT0) : G10.b(fT0, fV0) ? AbstractC1496Lm.e(fT0) : AbstractC1599Mm.n(fT0, fV0);
    }

    public static final Float e(Map map, Object obj) {
        Object next;
        Iterator it = map.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (G10.c(((Map.Entry) next).getValue(), obj)) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return (Float) entry.getKey();
        }
        return null;
    }

    public static final InterfaceC1073Hk0 f(InterfaceC1073Hk0 interfaceC1073Hk0, XZ0 xz0, Map map, EnumC5792jr0 enumC5792jr0, boolean z, boolean z2, InterfaceC4650fm0 interfaceC4650fm0, InterfaceC3429bR interfaceC3429bR, BI0 bi0, float f) {
        G10.g(interfaceC1073Hk0, "$this$swipeable");
        G10.g(xz0, "state");
        G10.g(map, "anchors");
        G10.g(enumC5792jr0, "orientation");
        G10.g(interfaceC3429bR, "thresholds");
        return AbstractC5500ip.a(interfaceC1073Hk0, AbstractC5550j00.c() ? new c(xz0, map, enumC5792jr0, z, z2, interfaceC4650fm0, interfaceC3429bR, bi0, f) : AbstractC5550j00.a(), new b(map, xz0, enumC5792jr0, z, interfaceC4650fm0, z2, bi0, interfaceC3429bR, f));
    }
}
