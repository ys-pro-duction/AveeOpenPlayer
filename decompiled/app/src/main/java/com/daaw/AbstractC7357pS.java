package com.daaw;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* JADX INFO: renamed from: com.daaw.pS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7357pS implements Cloneable {
    public final Class B;
    public final Context C;
    public final WS D;
    public final Class E;
    public final C9835yI0 F;
    public final InterfaceC1141Ib0 G;
    public C1488Lk H;
    public Object I;
    public boolean K;
    public int L;
    public int M;
    public InterfaceC8433tI0 N;
    public Float O;
    public AbstractC7357pS P;
    public Drawable R;
    public Drawable S;
    public boolean a0;
    public boolean b0;
    public Drawable c0;
    public int d0;
    public H70 J = C8989vG.b();
    public Float Q = Float.valueOf(1.0f);
    public EnumC9190vz0 T = null;
    public boolean U = true;
    public YS V = C3536bo0.d();
    public int W = -1;
    public int X = -1;
    public EnumC4772gC Y = EnumC4772gC.RESULT;
    public InterfaceC6983o51 Z = I91.b();

    /* JADX INFO: renamed from: com.daaw.pS$a */
    public class a implements Runnable {
        public final /* synthetic */ RunnableC7875rI0 B;

        public a(RunnableC7875rI0 runnableC7875rI0) {
            this.B = runnableC7875rI0;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.B.isCancelled()) {
                return;
            }
            AbstractC7357pS.this.o(this.B);
        }
    }

    /* JADX INFO: renamed from: com.daaw.pS$b */
    public static /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            a = iArr;
            try {
                iArr[ImageView.ScaleType.CENTER_CROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[ImageView.ScaleType.FIT_CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[ImageView.ScaleType.FIT_START.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[ImageView.ScaleType.FIT_END.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public AbstractC7357pS(Context context, Class cls, InterfaceC0729Ec0 interfaceC0729Ec0, Class cls2, WS ws, C9835yI0 c9835yI0, InterfaceC1141Ib0 interfaceC1141Ib0) {
        this.C = context;
        this.B = cls;
        this.E = cls2;
        this.D = ws;
        this.F = c9835yI0;
        this.G = interfaceC1141Ib0;
        this.H = interfaceC0729Ec0 != null ? new C1488Lk(interfaceC0729Ec0) : null;
        if (context == null) {
            throw new NullPointerException("Context can't be null");
        }
        if (cls != null && interfaceC0729Ec0 == null) {
            throw new NullPointerException("LoadProvider must not be null");
        }
    }

    public AbstractC7357pS b(YS ys) {
        if (ys == null) {
            throw new NullPointerException("Animation factory must not be null!");
        }
        this.V = ys;
        return this;
    }

    public final InterfaceC7039oI0 e(InterfaceC3596c11 interfaceC3596c11) {
        if (this.T == null) {
            this.T = EnumC9190vz0.NORMAL;
        }
        return f(interfaceC3596c11, null);
    }

    public final InterfaceC7039oI0 f(InterfaceC3596c11 interfaceC3596c11, A31 a31) {
        AbstractC7357pS abstractC7357pS = this.P;
        if (abstractC7357pS == null) {
            if (this.O == null) {
                return r(interfaceC3596c11, this.Q.floatValue(), this.T, a31);
            }
            A31 a312 = new A31(a31);
            a312.m(r(interfaceC3596c11, this.Q.floatValue(), this.T, a312), r(interfaceC3596c11, this.O.floatValue(), l(), a312));
            return a312;
        }
        if (this.b0) {
            throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
        }
        if (abstractC7357pS.V.equals(C3536bo0.d())) {
            this.P.V = this.V;
        }
        AbstractC7357pS abstractC7357pS2 = this.P;
        if (abstractC7357pS2.T == null) {
            abstractC7357pS2.T = l();
        }
        if (AbstractC6559mb1.l(this.X, this.W)) {
            AbstractC7357pS abstractC7357pS3 = this.P;
            if (!AbstractC6559mb1.l(abstractC7357pS3.X, abstractC7357pS3.W)) {
                this.P.t(this.X, this.W);
            }
        }
        A31 a313 = new A31(a31);
        InterfaceC7039oI0 interfaceC7039oI0R = r(interfaceC3596c11, this.Q.floatValue(), this.T, a313);
        this.b0 = true;
        InterfaceC7039oI0 interfaceC7039oI0F = this.P.f(interfaceC3596c11, a313);
        this.b0 = false;
        a313.m(interfaceC7039oI0R, interfaceC7039oI0F);
        return a313;
    }

    @Override // 
    public AbstractC7357pS g() {
        try {
            AbstractC7357pS abstractC7357pS = (AbstractC7357pS) super.clone();
            C1488Lk c1488Lk = this.H;
            abstractC7357pS.H = c1488Lk != null ? c1488Lk.clone() : null;
            return abstractC7357pS;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public AbstractC7357pS h(NI0 ni0) {
        C1488Lk c1488Lk = this.H;
        if (c1488Lk != null) {
            c1488Lk.i(ni0);
        }
        return this;
    }

    public AbstractC7357pS i(EnumC4772gC enumC4772gC) {
        this.Y = enumC4772gC;
        return this;
    }

    public AbstractC7357pS j() {
        return b(C3536bo0.d());
    }

    public AbstractC7357pS k(int i) {
        this.M = i;
        return this;
    }

    public final EnumC9190vz0 l() {
        EnumC9190vz0 enumC9190vz0 = this.T;
        return enumC9190vz0 == EnumC9190vz0.LOW ? EnumC9190vz0.NORMAL : enumC9190vz0 == EnumC9190vz0.NORMAL ? EnumC9190vz0.HIGH : EnumC9190vz0.IMMEDIATE;
    }

    public JR m(int i, int i2) {
        RunnableC7875rI0 runnableC7875rI0 = new RunnableC7875rI0(this.D.p(), i, i2);
        this.D.p().post(new a(runnableC7875rI0));
        return runnableC7875rI0;
    }

    public InterfaceC3596c11 n(ImageView imageView) {
        AbstractC6559mb1.b();
        if (imageView == null) {
            throw new IllegalArgumentException("You must pass in a non null View");
        }
        if (!this.a0 && imageView.getScaleType() != null) {
            int i = b.a[imageView.getScaleType().ordinal()];
            if (i == 1) {
                c();
            } else if (i == 2 || i == 3 || i == 4) {
                d();
            }
        }
        return o(this.D.c(imageView, this.E));
    }

    public InterfaceC3596c11 o(InterfaceC3596c11 interfaceC3596c11) {
        AbstractC6559mb1.b();
        if (interfaceC3596c11 == null) {
            throw new IllegalArgumentException("You must pass in a non null Target");
        }
        if (!this.K) {
            throw new IllegalArgumentException("You must first set a model (try #load())");
        }
        InterfaceC7039oI0 interfaceC7039oI0J = interfaceC3596c11.j();
        if (interfaceC7039oI0J != null) {
            interfaceC7039oI0J.clear();
            this.F.c(interfaceC7039oI0J);
            interfaceC7039oI0J.c();
        }
        InterfaceC7039oI0 interfaceC7039oI0E = e(interfaceC3596c11);
        interfaceC3596c11.c(interfaceC7039oI0E);
        this.G.a(interfaceC3596c11);
        this.F.f(interfaceC7039oI0E);
        return interfaceC3596c11;
    }

    public AbstractC7357pS p(InterfaceC8433tI0 interfaceC8433tI0) {
        this.N = interfaceC8433tI0;
        return this;
    }

    public AbstractC7357pS q(Object obj) {
        this.I = obj;
        this.K = true;
        return this;
    }

    public final InterfaceC7039oI0 r(InterfaceC3596c11 interfaceC3596c11, float f, EnumC9190vz0 enumC9190vz0, InterfaceC7318pI0 interfaceC7318pI0) {
        return C7078oS.v(this.H, this.I, this.J, this.C, enumC9190vz0, interfaceC3596c11, f, this.R, this.L, this.S, this.M, this.c0, this.d0, this.N, interfaceC7318pI0, this.D.n(), this.Z, this.E, this.U, this.V, this.X, this.W, this.Y);
    }

    public AbstractC7357pS t(int i, int i2) {
        if (!AbstractC6559mb1.l(i, i2)) {
            throw new IllegalArgumentException("Width and height must be Target#SIZE_ORIGINAL or > 0");
        }
        this.X = i;
        this.W = i2;
        return this;
    }

    public AbstractC7357pS u(int i) {
        this.L = i;
        return this;
    }

    public AbstractC7357pS v(H70 h70) {
        if (h70 == null) {
            throw new NullPointerException("Signature must not be null");
        }
        this.J = h70;
        return this;
    }

    public AbstractC7357pS w(boolean z) {
        this.U = !z;
        return this;
    }

    public AbstractC7357pS x(CG cg) {
        C1488Lk c1488Lk = this.H;
        if (c1488Lk != null) {
            c1488Lk.j(cg);
        }
        return this;
    }

    public AbstractC7357pS y(InterfaceC6983o51... interfaceC6983o51Arr) {
        this.a0 = true;
        if (interfaceC6983o51Arr.length == 1) {
            this.Z = interfaceC6983o51Arr[0];
            return this;
        }
        this.Z = new C2660Wl0(interfaceC6983o51Arr);
        return this;
    }

    public void c() {
    }

    public void d() {
    }
}
