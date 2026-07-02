package com.daaw;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import com.daaw.C6423m5;
import com.daaw.InterfaceC5781jp;

/* JADX INFO: loaded from: classes.dex */
public abstract class B5 {
    public static final AbstractC6453mB0 a = AbstractC2153Rp.b(AbstractC7923rU0.f(), a.B);
    public static final AbstractC6453mB0 b = AbstractC2153Rp.d(b.B);
    public static final AbstractC6453mB0 c = AbstractC2153Rp.d(c.B);
    public static final AbstractC6453mB0 d = AbstractC2153Rp.d(d.B);
    public static final AbstractC6453mB0 e = AbstractC2153Rp.d(e.B);
    public static final AbstractC6453mB0 f = AbstractC2153Rp.d(f.B);

    public static final class a extends AbstractC4192e90 implements LQ {
        public static final a B = new a();

        public a() {
            super(0);
        }

        @Override // com.daaw.LQ
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Configuration invoke() {
            B5.j("LocalConfiguration");
            throw new D80();
        }
    }

    public static final class b extends AbstractC4192e90 implements LQ {
        public static final b B = new b();

        public b() {
            super(0);
        }

        @Override // com.daaw.LQ
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Context invoke() {
            B5.j("LocalContext");
            throw new D80();
        }
    }

    public static final class c extends AbstractC4192e90 implements LQ {
        public static final c B = new c();

        public c() {
            super(0);
        }

        @Override // com.daaw.LQ
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C9061vY invoke() {
            B5.j("LocalImageVectorCache");
            throw new D80();
        }
    }

    public static final class d extends AbstractC4192e90 implements LQ {
        public static final d B = new d();

        public d() {
            super(0);
        }

        @Override // com.daaw.LQ
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC1764Ob0 invoke() {
            B5.j("LocalLifecycleOwner");
            throw new D80();
        }
    }

    public static final class e extends AbstractC4192e90 implements LQ {
        public static final e B = new e();

        public e() {
            super(0);
        }

        @Override // com.daaw.LQ
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC3135aN0 invoke() {
            B5.j("LocalSavedStateRegistryOwner");
            throw new D80();
        }
    }

    public static final class f extends AbstractC4192e90 implements LQ {
        public static final f B = new f();

        public f() {
            super(0);
        }

        @Override // com.daaw.LQ
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final View invoke() {
            B5.j("LocalView");
            throw new D80();
        }
    }

    public static final class g extends AbstractC4192e90 implements NQ {
        public final /* synthetic */ InterfaceC8007rm0 B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(InterfaceC8007rm0 interfaceC8007rm0) {
            super(1);
            this.B = interfaceC8007rm0;
        }

        public final void a(Configuration configuration) {
            G10.g(configuration, "it");
            B5.c(this.B, configuration);
        }

        @Override // com.daaw.NQ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Configuration) obj);
            return G91.a;
        }
    }

    public static final class h extends AbstractC4192e90 implements NQ {
        public final /* synthetic */ C9810yC B;

        public static final class a implements InterfaceC8973vC {
            public final /* synthetic */ C9810yC a;

            public a(C9810yC c9810yC) {
                this.a = c9810yC;
            }

            @Override // com.daaw.InterfaceC8973vC
            public void a() {
                this.a.e();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(C9810yC c9810yC) {
            super(1);
            this.B = c9810yC;
        }

        @Override // com.daaw.NQ
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC8973vC invoke(C9252wC c9252wC) {
            G10.g(c9252wC, "$this$DisposableEffect");
            return new a(this.B);
        }
    }

    public static final class i extends AbstractC4192e90 implements InterfaceC3429bR {
        public final /* synthetic */ C6423m5 B;
        public final /* synthetic */ C9503x6 C;
        public final /* synthetic */ InterfaceC3429bR D;
        public final /* synthetic */ int E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(C6423m5 c6423m5, C9503x6 c9503x6, InterfaceC3429bR interfaceC3429bR, int i) {
            super(2);
            this.B = c6423m5;
            this.C = c9503x6;
            this.D = interfaceC3429bR;
            this.E = i;
        }

        public final void a(InterfaceC5781jp interfaceC5781jp, int i) {
            if ((i & 11) == 2 && interfaceC5781jp.t()) {
                interfaceC5781jp.B();
            } else {
                AbstractC2259Sp.a(this.B, this.C, this.D, interfaceC5781jp, ((this.E << 3) & 896) | 72);
            }
        }

        @Override // com.daaw.InterfaceC3429bR
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC5781jp) obj, ((Number) obj2).intValue());
            return G91.a;
        }
    }

    public static final class j extends AbstractC4192e90 implements InterfaceC3429bR {
        public final /* synthetic */ C6423m5 B;
        public final /* synthetic */ InterfaceC3429bR C;
        public final /* synthetic */ int D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(C6423m5 c6423m5, InterfaceC3429bR interfaceC3429bR, int i) {
            super(2);
            this.B = c6423m5;
            this.C = interfaceC3429bR;
            this.D = i;
        }

        public final void a(InterfaceC5781jp interfaceC5781jp, int i) {
            B5.a(this.B, this.C, interfaceC5781jp, this.D | 1);
        }

        @Override // com.daaw.InterfaceC3429bR
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC5781jp) obj, ((Number) obj2).intValue());
            return G91.a;
        }
    }

    public static final class k extends AbstractC4192e90 implements NQ {
        public final /* synthetic */ Context B;
        public final /* synthetic */ l C;

        public static final class a implements InterfaceC8973vC {
            public final /* synthetic */ Context a;
            public final /* synthetic */ l b;

            public a(Context context, l lVar) {
                this.a = context;
                this.b = lVar;
            }

            @Override // com.daaw.InterfaceC8973vC
            public void a() {
                this.a.getApplicationContext().unregisterComponentCallbacks(this.b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(Context context, l lVar) {
            super(1);
            this.B = context;
            this.C = lVar;
        }

        @Override // com.daaw.NQ
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC8973vC invoke(C9252wC c9252wC) {
            G10.g(c9252wC, "$this$DisposableEffect");
            this.B.getApplicationContext().registerComponentCallbacks(this.C);
            return new a(this.B, this.C);
        }
    }

    public static final class l implements ComponentCallbacks2 {
        public final /* synthetic */ C6748nF0 B;
        public final /* synthetic */ C9061vY C;

        public l(C6748nF0 c6748nF0, C9061vY c9061vY) {
            this.B = c6748nF0;
            this.C = c9061vY;
        }

        @Override // android.content.ComponentCallbacks
        public void onConfigurationChanged(Configuration configuration) {
            G10.g(configuration, "configuration");
            Configuration configuration2 = (Configuration) this.B.B;
            this.C.c(configuration2 != null ? configuration2.updateFrom(configuration) : -1);
            this.B.B = configuration;
        }

        @Override // android.content.ComponentCallbacks
        public void onLowMemory() {
            this.C.a();
        }

        @Override // android.content.ComponentCallbacks2
        public void onTrimMemory(int i) {
            this.C.a();
        }
    }

    public static final void a(C6423m5 c6423m5, InterfaceC3429bR interfaceC3429bR, InterfaceC5781jp interfaceC5781jp, int i2) {
        G10.g(c6423m5, "owner");
        G10.g(interfaceC3429bR, "content");
        InterfaceC5781jp interfaceC5781jpQ = interfaceC5781jp.q(1396852028);
        Context context = c6423m5.getContext();
        interfaceC5781jpQ.e(-492369756);
        Object objF = interfaceC5781jpQ.f();
        InterfaceC5781jp.a aVar = InterfaceC5781jp.a;
        if (objF == aVar.a()) {
            objF = AbstractC7923rU0.d(context.getResources().getConfiguration(), AbstractC7923rU0.f());
            interfaceC5781jpQ.H(objF);
        }
        interfaceC5781jpQ.L();
        InterfaceC8007rm0 interfaceC8007rm0 = (InterfaceC8007rm0) objF;
        interfaceC5781jpQ.e(1157296644);
        boolean zP = interfaceC5781jpQ.P(interfaceC8007rm0);
        Object objF2 = interfaceC5781jpQ.f();
        if (zP || objF2 == aVar.a()) {
            objF2 = new g(interfaceC8007rm0);
            interfaceC5781jpQ.H(objF2);
        }
        interfaceC5781jpQ.L();
        c6423m5.setConfigurationChangeObserver((NQ) objF2);
        interfaceC5781jpQ.e(-492369756);
        Object objF3 = interfaceC5781jpQ.f();
        if (objF3 == aVar.a()) {
            G10.f(context, "context");
            objF3 = new C9503x6(context);
            interfaceC5781jpQ.H(objF3);
        }
        interfaceC5781jpQ.L();
        C9503x6 c9503x6 = (C9503x6) objF3;
        C6423m5.b viewTreeOwners = c6423m5.getViewTreeOwners();
        if (viewTreeOwners == null) {
            throw new IllegalStateException("Called when the ViewTreeOwnersAvailability is not yet in Available state");
        }
        interfaceC5781jpQ.e(-492369756);
        Object objF4 = interfaceC5781jpQ.f();
        if (objF4 == aVar.a()) {
            objF4 = AbstractC10089zC.a(c6423m5, viewTreeOwners.b());
            interfaceC5781jpQ.H(objF4);
        }
        interfaceC5781jpQ.L();
        C9810yC c9810yC = (C9810yC) objF4;
        AbstractC8420tF.a(G91.a, new h(c9810yC), interfaceC5781jpQ, 0);
        G10.f(context, "context");
        C9061vY c9061vYK = k(context, b(interfaceC8007rm0), interfaceC5781jpQ, 72);
        AbstractC6453mB0 abstractC6453mB0 = a;
        Configuration configurationB = b(interfaceC8007rm0);
        G10.f(configurationB, "configuration");
        AbstractC2153Rp.a(new C7011oB0[]{abstractC6453mB0.c(configurationB), b.c(context), d.c(viewTreeOwners.a()), e.c(viewTreeOwners.b()), TM0.b().c(c9810yC), f.c(c6423m5.getView()), c.c(c9061vYK)}, AbstractC1815Oo.b(interfaceC5781jpQ, 1471621628, true, new i(c6423m5, c9503x6, interfaceC3429bR, i2)), interfaceC5781jpQ, 56);
        QN0 qn0Z = interfaceC5781jpQ.z();
        if (qn0Z == null) {
            return;
        }
        qn0Z.a(new j(c6423m5, interfaceC3429bR, i2));
    }

    public static final Configuration b(InterfaceC8007rm0 interfaceC8007rm0) {
        return (Configuration) interfaceC8007rm0.getValue();
    }

    public static final void c(InterfaceC8007rm0 interfaceC8007rm0, Configuration configuration) {
        interfaceC8007rm0.setValue(configuration);
    }

    public static final AbstractC6453mB0 f() {
        return a;
    }

    public static final AbstractC6453mB0 g() {
        return b;
    }

    public static final AbstractC6453mB0 h() {
        return c;
    }

    public static final AbstractC6453mB0 i() {
        return f;
    }

    public static final Void j(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }

    public static final C9061vY k(Context context, Configuration configuration, InterfaceC5781jp interfaceC5781jp, int i2) {
        Object obj;
        interfaceC5781jp.e(-485908294);
        interfaceC5781jp.e(-492369756);
        Object objF = interfaceC5781jp.f();
        InterfaceC5781jp.a aVar = InterfaceC5781jp.a;
        if (objF == aVar.a()) {
            objF = new C9061vY();
            interfaceC5781jp.H(objF);
        }
        interfaceC5781jp.L();
        C9061vY c9061vY = (C9061vY) objF;
        C6748nF0 c6748nF0 = new C6748nF0();
        interfaceC5781jp.e(-492369756);
        Object objF2 = interfaceC5781jp.f();
        if (objF2 == aVar.a()) {
            interfaceC5781jp.H(configuration);
            obj = configuration;
        } else {
            obj = objF2;
        }
        interfaceC5781jp.L();
        c6748nF0.B = obj;
        interfaceC5781jp.e(-492369756);
        Object objF3 = interfaceC5781jp.f();
        if (objF3 == aVar.a()) {
            objF3 = new l(c6748nF0, c9061vY);
            interfaceC5781jp.H(objF3);
        }
        interfaceC5781jp.L();
        AbstractC8420tF.a(c9061vY, new k(context, (l) objF3), interfaceC5781jp, 8);
        interfaceC5781jp.L();
        return c9061vY;
    }
}
