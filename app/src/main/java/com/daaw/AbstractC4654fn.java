package com.daaw;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: com.daaw.fn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4654fn extends View {
    public Bitmap B;
    public Canvas C;
    public Bitmap D;
    public Canvas E;
    public boolean F;
    public int G;
    public float H;
    public float I;
    public int J;
    public Integer[] K;
    public int L;
    public Integer M;
    public Integer N;
    public Paint O;
    public Paint P;
    public Paint Q;
    public C2663Wm R;
    public ArrayList S;
    public ArrayList T;
    public AbstractC2412Ub0 U;
    public P3 V;
    public EditText W;
    public TextWatcher a0;
    public LinearLayout b0;
    public InterfaceC6896nn c0;
    public int d0;
    public int e0;

    /* JADX INFO: renamed from: com.daaw.fn$b */
    public enum b {
        FLOWER,
        CIRCLE;

        public static b a(int i) {
            return i != 0 ? i != 1 ? FLOWER : CIRCLE : FLOWER;
        }
    }

    public AbstractC4654fn(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.G = 8;
        this.H = 1.0f;
        this.I = 1.0f;
        this.J = 0;
        this.K = new Integer[]{null, null, null, null, null};
        this.L = 0;
        this.O = AbstractC8874us0.c().b(0).a();
        this.P = AbstractC8874us0.c().b(0).a();
        this.Q = AbstractC8874us0.c().a();
        this.S = new ArrayList();
        this.T = new ArrayList();
        this.a0 = new a();
        g(context, attributeSet);
    }

    private void setColorPreviewColor(int i) {
        Integer[] numArr;
        int i2;
        LinearLayout linearLayout = this.b0;
        if (linearLayout == null || (numArr = this.K) == null || (i2 = this.L) > numArr.length || numArr[i2] == null || linearLayout.getChildCount() == 0 || this.b0.getVisibility() != 0) {
            return;
        }
        View childAt = this.b0.getChildAt(this.L);
        if (childAt instanceof LinearLayout) {
            ((ImageView) ((LinearLayout) childAt).findViewById(AbstractC5612jD0.a)).setImageDrawable(new C2767Xm(i));
        }
    }

    private void setColorText(int i) {
        EditText editText = this.W;
        if (editText == null) {
            return;
        }
        editText.setText(AbstractC0509Cb1.e(i, this.V != null));
    }

    private void setColorToSliders(int i) {
        AbstractC2412Ub0 abstractC2412Ub0 = this.U;
        if (abstractC2412Ub0 != null) {
            abstractC2412Ub0.setColor(i);
        }
        P3 p3 = this.V;
        if (p3 != null) {
            p3.setColor(i);
        }
    }

    private void setHighlightedColor(int i) {
        int childCount = this.b0.getChildCount();
        if (childCount == 0 || this.b0.getVisibility() != 0) {
            return;
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = this.b0.getChildAt(i2);
            if (childAt instanceof LinearLayout) {
                LinearLayout linearLayout = (LinearLayout) childAt;
                if (i2 == i) {
                    linearLayout.setBackgroundColor(-1);
                } else {
                    linearLayout.setBackgroundColor(0);
                }
            }
        }
    }

    public void a(InterfaceC4670fq0 interfaceC4670fq0) {
        this.S.add(interfaceC4670fq0);
    }

    public void b(InterfaceC4949gq0 interfaceC4949gq0) {
        this.T.add(interfaceC4949gq0);
    }

    public void c(int i, int i2) {
        ArrayList arrayList = this.S;
        if (arrayList == null || i == i2) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            try {
                ((InterfaceC4670fq0) it.next()).a(i2);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public final void d() {
        Canvas canvas = this.C;
        PorterDuff.Mode mode = PorterDuff.Mode.CLEAR;
        canvas.drawColor(0, mode);
        this.E.drawColor(0, mode);
        if (this.c0 == null) {
            return;
        }
        float width = this.C.getWidth() / 2.0f;
        float f = (width - 1.5374999f) - (width / this.G);
        C6617mn c6617mnB = this.c0.b();
        c6617mnB.a = this.G;
        c6617mnB.b = f;
        c6617mnB.c = (f / (r4 - 1)) / 2.0f;
        c6617mnB.d = 1.5374999f;
        c6617mnB.e = this.I;
        c6617mnB.f = this.H;
        c6617mnB.g = this.C;
        this.c0.c(c6617mnB);
        this.c0.a();
    }

    public final C2663Wm e(int i) {
        float[] fArr = new float[3];
        Color.colorToHSV(i, fArr);
        double d = 3.141592653589793d;
        double d2 = 180.0d;
        double dCos = ((double) fArr[1]) * Math.cos((((double) fArr[0]) * 3.141592653589793d) / 180.0d);
        double dSin = ((double) fArr[1]) * Math.sin((((double) fArr[0]) * 3.141592653589793d) / 180.0d);
        C2663Wm c2663Wm = null;
        double d3 = Double.MAX_VALUE;
        for (C2663Wm c2663Wm2 : this.c0.d()) {
            float[] fArrB = c2663Wm2.b();
            double d4 = dSin;
            double d5 = d;
            double d6 = d2;
            double dCos2 = dCos - (((double) fArrB[1]) * Math.cos((((double) fArrB[0]) * d5) / d2));
            double dSin2 = d4 - (((double) fArrB[1]) * Math.sin((((double) fArrB[0]) * d5) / d6));
            double d7 = (dCos2 * dCos2) + (dSin2 * dSin2);
            if (d7 < d3) {
                d3 = d7;
                c2663Wm = c2663Wm2;
            }
            dSin = d4;
            d = d5;
            d2 = d6;
        }
        return c2663Wm;
    }

    public final C2663Wm f(float f, float f2) {
        C2663Wm c2663Wm = null;
        double d = Double.MAX_VALUE;
        for (C2663Wm c2663Wm2 : this.c0.d()) {
            double dG = c2663Wm2.g(f, f2);
            if (d > dG) {
                c2663Wm = c2663Wm2;
                d = dG;
            }
        }
        return c2663Wm;
    }

    public final void g(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, UD0.s);
        this.G = typedArrayObtainStyledAttributes.getInt(UD0.u, 10);
        this.M = Integer.valueOf(typedArrayObtainStyledAttributes.getInt(UD0.v, -1));
        this.N = Integer.valueOf(typedArrayObtainStyledAttributes.getInt(UD0.x, -1));
        InterfaceC6896nn interfaceC6896nnA = AbstractC7175on.a(b.a(typedArrayObtainStyledAttributes.getInt(UD0.y, 0)));
        this.d0 = typedArrayObtainStyledAttributes.getResourceId(UD0.t, 0);
        this.e0 = typedArrayObtainStyledAttributes.getResourceId(UD0.w, 0);
        setRenderer(interfaceC6896nnA);
        setDensity(this.G);
        i(this.M.intValue(), true);
        typedArrayObtainStyledAttributes.recycle();
    }

    public Integer[] getAllColors() {
        return this.K;
    }

    public int getSelectedColor() {
        C2663Wm c2663Wm = this.R;
        return AbstractC0509Cb1.a(this.I, c2663Wm != null ? AbstractC0509Cb1.c(c2663Wm.a(), this.H) : 0);
    }

    public void h(int i, boolean z) {
        i(i, z);
        j();
        invalidate();
    }

    public void i(int i, boolean z) {
        float[] fArr = new float[3];
        Color.colorToHSV(i, fArr);
        this.I = AbstractC0509Cb1.d(i);
        this.H = fArr[2];
        this.K[this.L] = Integer.valueOf(i);
        this.M = Integer.valueOf(i);
        setColorPreviewColor(i);
        setColorToSliders(i);
        if (this.W != null && z) {
            setColorText(i);
        }
        this.R = e(i);
    }

    public final void j() {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (measuredHeight < measuredWidth) {
            measuredWidth = measuredHeight;
        }
        if (measuredWidth <= 0) {
            return;
        }
        Bitmap bitmap = this.B;
        if (bitmap == null || bitmap.getWidth() != measuredWidth) {
            this.B = Bitmap.createBitmap(measuredWidth, measuredWidth, Bitmap.Config.ARGB_8888);
            this.C = new Canvas(this.B);
            this.Q.setShader(AbstractC8874us0.b(26));
        }
        Bitmap bitmap2 = this.D;
        if (bitmap2 == null || bitmap2.getWidth() != measuredWidth) {
            this.D = Bitmap.createBitmap(measuredWidth, measuredWidth, Bitmap.Config.ARGB_8888);
            this.E = new Canvas(this.D);
        }
        d();
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        C2663Wm c2663Wm;
        super.onDraw(canvas);
        canvas.drawColor(this.J);
        float width = ((canvas.getWidth() / 1.025f) / this.G) / 2.0f;
        if (this.B == null || (c2663Wm = this.R) == null) {
            return;
        }
        this.O.setColor(Color.HSVToColor(c2663Wm.c(this.H)));
        this.O.setAlpha((int) (this.I * 255.0f));
        float f = 4.0f + width;
        this.E.drawCircle(this.R.d(), this.R.e(), f, this.Q);
        this.E.drawCircle(this.R.d(), this.R.e(), f, this.O);
        this.P = AbstractC8874us0.c().b(-1).e(Paint.Style.STROKE).d(0.5f * width).f(PorterDuff.Mode.CLEAR).a();
        if (this.F) {
            this.C.drawCircle(this.R.d(), this.R.e(), (this.P.getStrokeWidth() / 2.0f) + width, this.P);
        }
        canvas.drawBitmap(this.B, 0.0f, 0.0f, (Paint) null);
        this.E.drawCircle(this.R.d(), this.R.e(), width + (this.P.getStrokeWidth() / 2.0f), this.P);
        canvas.drawBitmap(this.D, 0.0f, 0.0f, (Paint) null);
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.d0 != 0) {
            setAlphaSlider((P3) getRootView().findViewById(this.d0));
        }
        if (this.e0 != 0) {
            setLightnessSlider((AbstractC2412Ub0) getRootView().findViewById(this.e0));
        }
        j();
        this.R = e(this.M.intValue());
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        if (mode != 0) {
            i = (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.getSize(i) : 0;
        }
        int mode2 = View.MeasureSpec.getMode(i2);
        if (mode2 != 0) {
            i2 = (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) ? View.MeasureSpec.getSize(i2) : 0;
        }
        if (i2 < i) {
            i = i2;
        }
        setMeasuredDimension(i, i);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        j();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003b  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r4) {
        /*
            r3 = this;
            int r0 = r4.getAction()
            r1 = 1
            if (r0 == 0) goto L3b
            if (r0 == r1) goto Ld
            r2 = 2
            if (r0 == r2) goto L3b
            goto L63
        Ld:
            int r4 = r3.getSelectedColor()
            java.util.ArrayList r0 = r3.T
            if (r0 == 0) goto L2e
            java.util.Iterator r0 = r0.iterator()
        L19:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L2e
            java.lang.Object r2 = r0.next()
            com.daaw.gq0 r2 = (com.daaw.InterfaceC4949gq0) r2
            r2.a(r4)     // Catch: java.lang.Exception -> L29
            goto L19
        L29:
            r2 = move-exception
            r2.printStackTrace()
            goto L19
        L2e:
            r3.setColorToSliders(r4)
            r3.setColorText(r4)
            r3.setColorPreviewColor(r4)
            r3.invalidate()
            goto L63
        L3b:
            int r0 = r3.getSelectedColor()
            float r2 = r4.getX()
            float r4 = r4.getY()
            com.daaw.Wm r4 = r3.f(r2, r4)
            r3.R = r4
            int r4 = r3.getSelectedColor()
            r3.c(r0, r4)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            r3.M = r0
            r3.setColorToSliders(r4)
            r3.j()
            r3.invalidate()
        L63:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.AbstractC4654fn.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        j();
        this.R = e(this.M.intValue());
    }

    public void setAlphaSlider(P3 p3) {
        this.V = p3;
        if (p3 != null) {
            p3.setColorPicker(this);
            this.V.setColor(getSelectedColor());
        }
    }

    public void setAlphaValue(float f) {
        Integer num;
        int selectedColor = getSelectedColor();
        this.I = f;
        Integer numValueOf = Integer.valueOf(Color.HSVToColor(AbstractC0509Cb1.b(f), this.R.c(this.H)));
        this.M = numValueOf;
        EditText editText = this.W;
        if (editText != null) {
            editText.setText(AbstractC0509Cb1.e(numValueOf.intValue(), this.V != null));
        }
        AbstractC2412Ub0 abstractC2412Ub0 = this.U;
        if (abstractC2412Ub0 != null && (num = this.M) != null) {
            abstractC2412Ub0.setColor(num.intValue());
        }
        c(selectedColor, this.M.intValue());
        j();
        invalidate();
    }

    public void setColorEdit(EditText editText) {
        this.W = editText;
        if (editText != null) {
            editText.setVisibility(0);
            this.W.addTextChangedListener(this.a0);
            setColorEditTextColor(this.N.intValue());
        }
    }

    public void setColorEditTextColor(int i) {
        this.N = Integer.valueOf(i);
        EditText editText = this.W;
        if (editText != null) {
            editText.setTextColor(i);
        }
    }

    public void setDensity(int i) {
        this.G = Math.max(2, i);
        invalidate();
    }

    public void setLightness(float f) {
        Integer num;
        int selectedColor = getSelectedColor();
        this.H = f;
        if (this.R != null) {
            Integer numValueOf = Integer.valueOf(Color.HSVToColor(AbstractC0509Cb1.b(this.I), this.R.c(f)));
            this.M = numValueOf;
            EditText editText = this.W;
            if (editText != null) {
                editText.setText(AbstractC0509Cb1.e(numValueOf.intValue(), this.V != null));
            }
            P3 p3 = this.V;
            if (p3 != null && (num = this.M) != null) {
                p3.setColor(num.intValue());
            }
            c(selectedColor, this.M.intValue());
            j();
            invalidate();
        }
    }

    public void setLightnessSlider(AbstractC2412Ub0 abstractC2412Ub0) {
        this.U = abstractC2412Ub0;
        if (abstractC2412Ub0 != null) {
            abstractC2412Ub0.setColorPicker(this);
            this.U.setColor(getSelectedColor());
        }
    }

    public void setRenderer(InterfaceC6896nn interfaceC6896nn) {
        this.c0 = interfaceC6896nn;
        invalidate();
    }

    public void setSelectedColor(int i) {
        Integer[] numArr = this.K;
        if (numArr == null || numArr.length < i) {
            return;
        }
        this.L = i;
        setHighlightedColor(i);
        Integer num = this.K[i];
        if (num == null) {
            return;
        }
        h(num.intValue(), true);
    }

    public void setShowBorder(boolean z) {
        this.F = z;
    }

    /* JADX INFO: renamed from: com.daaw.fn$a */
    public class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            try {
                AbstractC4654fn.this.h(Color.parseColor(charSequence.toString()), false);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }
}
