package com.daaw;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.daaw.C2951Zg;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.Vg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2535Vg extends ConstraintLayout {
    public final int b0;
    public View c0;
    public ImageView d0;
    public TextView e0;
    public TextView f0;
    public ImageView g0;
    public ConstraintLayout h0;
    public RectF i0;
    public int j0;
    public ArrayList k0;
    public Paint l0;

    /* JADX INFO: renamed from: com.daaw.Vg$a */
    public static final class a {
        public WeakReference a;
        public RectF b;
        public Drawable c;
        public Boolean d;
        public String e;
        public String f;
        public Drawable g;
        public Integer h;
        public Integer i;
        public Integer j;
        public Integer k;
        public ArrayList l = new ArrayList();
        public InterfaceC4102dq0 m;

        public final a A(String str) {
            this.e = str;
            return this;
        }

        public final a B(Integer num) {
            this.j = num;
            return this;
        }

        public final a a(List list) {
            G10.g(list, "arrowPosition");
            this.l.clear();
            this.l.addAll(list);
            return this;
        }

        public final a b(Integer num) {
            this.h = num;
            return this;
        }

        public final C2535Vg c() {
            Object obj = j().get();
            G10.d(obj);
            return new C2535Vg((Context) obj, this);
        }

        public final a d(Drawable drawable) {
            this.g = drawable;
            return this;
        }

        public final a e(boolean z) {
            this.d = Boolean.valueOf(z);
            return this;
        }

        public final a f(Context context) {
            G10.g(context, "context");
            v(new WeakReference(context));
            return this;
        }

        public final ArrayList g() {
            return this.l;
        }

        public final Integer h() {
            return this.h;
        }

        public final Drawable i() {
            return this.g;
        }

        public final WeakReference j() {
            WeakReference weakReference = this.a;
            if (weakReference != null) {
                return weakReference;
            }
            G10.u("mContext");
            return null;
        }

        public final Boolean k() {
            return this.d;
        }

        public final Drawable l() {
            return this.c;
        }

        public final InterfaceC4102dq0 m() {
            return this.m;
        }

        public final String n() {
            return this.f;
        }

        public final Integer o() {
            return this.k;
        }

        public final RectF p() {
            return this.b;
        }

        public final Integer q() {
            return this.i;
        }

        public final String r() {
            return this.e;
        }

        public final Integer s() {
            return this.j;
        }

        public final a t(Drawable drawable) {
            this.c = drawable;
            return this;
        }

        public final a u(InterfaceC4102dq0 interfaceC4102dq0) {
            this.m = interfaceC4102dq0;
            return this;
        }

        public final void v(WeakReference weakReference) {
            G10.g(weakReference, "<set-?>");
            this.a = weakReference;
        }

        public final a w(String str) {
            this.f = str;
            return this;
        }

        public final a x(Integer num) {
            this.k = num;
            return this;
        }

        public final a y(RectF rectF) {
            G10.g(rectF, "targetViewLocationOnScreen");
            this.b = rectF;
            return this;
        }

        public final a z(Integer num) {
            this.i = num;
            return this;
        }
    }

    /* JADX INFO: renamed from: com.daaw.Vg$b */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[C2951Zg.a.values().length];
            try {
                iArr[C2951Zg.a.D.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[C2951Zg.a.E.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[C2951Zg.a.B.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[C2951Zg.a.C.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2535Vg(Context context, a aVar) {
        super(context);
        G10.g(context, "context");
        G10.g(aVar, "builder");
        this.b0 = 20;
        this.j0 = AbstractC9438ws.c(getContext(), QC0.a);
        this.k0 = new ArrayList();
        C();
        setAttributes(aVar);
        setBubbleListener(aVar);
    }

    public static final void I(a aVar, View view) {
        G10.g(aVar, "$builder");
        InterfaceC4102dq0 interfaceC4102dq0M = aVar.m();
        if (interfaceC4102dq0M != null) {
            interfaceC4102dq0M.a();
        }
    }

    public static final void J(a aVar, View view) {
        G10.g(aVar, "$builder");
        InterfaceC4102dq0 interfaceC4102dq0M = aVar.m();
        if (interfaceC4102dq0M != null) {
            interfaceC4102dq0M.b();
        }
    }

    private final int getMargin() {
        return VN0.a.a(20);
    }

    private final int getSecurityArrowMargin() {
        return getMargin() + VN0.a.a((this.b0 * 2) / 3);
    }

    private final int getViewWidth() {
        return getWidth();
    }

    private final void setAttributes(a aVar) {
        TextView textView;
        TextView textView2;
        ImageView imageView;
        if (aVar.l() != null) {
            ImageView imageView2 = this.d0;
            if (imageView2 != null) {
                imageView2.setVisibility(0);
            }
            ImageView imageView3 = this.d0;
            if (imageView3 != null) {
                Drawable drawableL = aVar.l();
                G10.d(drawableL);
                imageView3.setImageDrawable(drawableL);
            }
        }
        if (aVar.i() != null) {
            ImageView imageView4 = this.g0;
            if (imageView4 != null) {
                imageView4.setVisibility(0);
            }
            ImageView imageView5 = this.g0;
            if (imageView5 != null) {
                Drawable drawableI = aVar.i();
                G10.d(drawableI);
                imageView5.setImageDrawable(drawableI);
            }
        }
        if (aVar.k() != null) {
            Boolean boolK = aVar.k();
            G10.d(boolK);
            if (boolK.booleanValue() && (imageView = this.g0) != null) {
                imageView.setVisibility(4);
            }
        }
        if (aVar.r() != null) {
            TextView textView3 = this.e0;
            if (textView3 != null) {
                textView3.setVisibility(0);
            }
            TextView textView4 = this.e0;
            if (textView4 != null) {
                textView4.setText(aVar.r());
            }
        }
        if (aVar.n() != null) {
            TextView textView5 = this.f0;
            if (textView5 != null) {
                textView5.setVisibility(0);
            }
            TextView textView6 = this.f0;
            if (textView6 != null) {
                textView6.setText(aVar.n());
            }
        }
        if (aVar.q() != null) {
            TextView textView7 = this.e0;
            if (textView7 != null) {
                Integer numQ = aVar.q();
                G10.d(numQ);
                textView7.setTextColor(numQ.intValue());
            }
            TextView textView8 = this.f0;
            if (textView8 != null) {
                Integer numQ2 = aVar.q();
                G10.d(numQ2);
                textView8.setTextColor(numQ2.intValue());
            }
        }
        if (aVar.s() != null && (textView2 = this.e0) != null) {
            G10.d(aVar.s());
            textView2.setTextSize(2, r2.intValue());
        }
        if (aVar.o() != null && (textView = this.f0) != null) {
            G10.d(aVar.o());
            textView.setTextSize(2, r2.intValue());
        }
        if (aVar.h() != null) {
            Integer numH = aVar.h();
            G10.d(numH);
            this.j0 = numH.intValue();
        }
        this.k0 = aVar.g();
        this.i0 = aVar.p();
    }

    private final void setBubbleListener(final a aVar) {
        ImageView imageView = this.g0;
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.daaw.Tg
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C2535Vg.I(aVar, view);
                }
            });
        }
        View view = this.c0;
        if (view != null) {
            view.setOnClickListener(new View.OnClickListener() { // from class: com.daaw.Ug
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    C2535Vg.J(aVar, view2);
                }
            });
        }
    }

    public final int A(RectF rectF) {
        if (D(rectF)) {
            return getHeight() - getSecurityArrowMargin();
        }
        if (G(rectF)) {
            return getSecurityArrowMargin();
        }
        G10.d(rectF);
        float fCenterY = rectF.centerY();
        VN0 vn0 = VN0.a;
        G10.f(getContext(), "getContext(...)");
        return Math.round((fCenterY + vn0.f(r1)) - vn0.c(this));
    }

    public final void B() {
        this.c0 = View.inflate(getContext(), AbstractC10094zD0.a, this);
    }

    public final void C() {
        setWillNotDraw(false);
        B();
        v();
    }

    public final boolean D(RectF rectF) {
        G10.d(rectF);
        float fCenterY = rectF.centerY();
        VN0 vn0 = VN0.a;
        int iC = (vn0.c(this) + getHeight()) - getSecurityArrowMargin();
        Context context = getContext();
        G10.f(context, "getContext(...)");
        return fCenterY > ((float) (iC - vn0.f(context)));
    }

    public final boolean E(RectF rectF) {
        G10.d(rectF);
        return rectF.centerX() < ((float) (VN0.a.b(this) + getSecurityArrowMargin()));
    }

    public final boolean F(RectF rectF) {
        G10.d(rectF);
        return rectF.centerX() > ((float) ((VN0.a.b(this) + getWidth()) - getSecurityArrowMargin()));
    }

    public final boolean G(RectF rectF) {
        G10.d(rectF);
        float fCenterY = rectF.centerY();
        VN0 vn0 = VN0.a;
        int iC = vn0.c(this) + getSecurityArrowMargin();
        Context context = getContext();
        G10.f(context, "getContext(...)");
        return fCenterY < ((float) (iC - vn0.f(context)));
    }

    public final void H() {
        Paint paint = new Paint(1);
        this.l0 = paint;
        G10.d(paint);
        paint.setColor(this.j0);
        Paint paint2 = this.l0;
        G10.d(paint2);
        paint2.setStyle(Paint.Style.FILL);
        Paint paint3 = this.l0;
        G10.d(paint3);
        paint3.setStrokeWidth(4.0f);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        G10.g(canvas, "canvas");
        super.onDraw(canvas);
        H();
        x(canvas);
        for (C2951Zg.a aVar : this.k0) {
            G10.d(aVar);
            w(canvas, aVar, this.i0);
        }
    }

    public final void v() {
        this.d0 = (ImageView) findViewById(AbstractC5335iD0.a);
        this.g0 = (ImageView) findViewById(AbstractC5335iD0.b);
        this.e0 = (TextView) findViewById(AbstractC5335iD0.e);
        this.f0 = (TextView) findViewById(AbstractC5335iD0.d);
        this.h0 = (ConstraintLayout) findViewById(AbstractC5335iD0.c);
    }

    public final void w(Canvas canvas, C2951Zg.a aVar, RectF rectF) {
        int margin;
        int iA;
        int i = b.a[aVar.ordinal()];
        if (i == 1) {
            margin = getMargin();
            iA = rectF != null ? A(rectF) : getHeight() / 2;
        } else if (i == 2) {
            margin = getViewWidth() - getMargin();
            iA = rectF != null ? A(rectF) : getHeight() / 2;
        } else if (i == 3) {
            margin = rectF != null ? z(rectF) : getWidth() / 2;
            iA = getMargin();
        } else {
            if (i != 4) {
                throw new C6902no0();
            }
            margin = rectF != null ? z(rectF) : getWidth() / 2;
            iA = getHeight() - getMargin();
        }
        y(canvas, this.l0, margin, iA, VN0.a.a(this.b0));
    }

    public final void x(Canvas canvas) {
        RectF rectF = new RectF(getMargin(), getMargin(), getViewWidth() - getMargin(), getHeight() - getMargin());
        Paint paint = this.l0;
        G10.d(paint);
        canvas.drawRoundRect(rectF, 10.0f, 10.0f, paint);
    }

    public final void y(Canvas canvas, Paint paint, int i, int i2, int i3) {
        Path path = new Path();
        float f = i;
        float f2 = i2 + (i3 / 2);
        path.moveTo(f, f2);
        float f3 = i2;
        path.lineTo(i - r10, f3);
        path.lineTo(f, i2 - r10);
        path.lineTo(i + r10, f3);
        path.lineTo(f, f2);
        path.close();
        G10.d(paint);
        canvas.drawPath(path, paint);
    }

    public final int z(RectF rectF) {
        if (F(rectF)) {
            return getWidth() - getSecurityArrowMargin();
        }
        if (E(rectF)) {
            return getSecurityArrowMargin();
        }
        G10.d(rectF);
        return Math.round(rectF.centerX() - VN0.a.b(this));
    }
}
