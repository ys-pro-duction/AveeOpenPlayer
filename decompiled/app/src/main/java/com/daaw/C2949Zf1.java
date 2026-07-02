package com.daaw;

import android.graphics.Point;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageButton;
import android.widget.PopupWindow;
import android.widget.SeekBar;
import android.widget.TextView;

/* JADX INFO: renamed from: com.daaw.Zf1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2949Zf1 extends PopupWindow {
    public Handler a;
    public ImageButton b;
    public ImageButton c;
    public View d;
    public SeekBar e;
    public TextView f;
    public SeekBar g;
    public TextView h;
    public float i;
    public float j;
    public SeekBar k;
    public TextView l;
    public ImageButton m;

    /* JADX INFO: renamed from: com.daaw.Zf1$a */
    public class a implements Handler.Callback {
        public a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            return false;
        }
    }

    /* JADX INFO: renamed from: com.daaw.Zf1$b */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C7151oi0.Y.a();
            C2949Zf1.this.a.sendEmptyMessageDelayed(0, 900L);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Zf1$c */
    public class c implements SeekBar.OnSeekBarChangeListener {
        public final /* synthetic */ B61 a;

        public c(B61 b61) {
            this.a = b61;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            C2949Zf1.this.h(i, ((Integer) this.a.b).intValue(), true);
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            C2949Zf1.this.a.removeMessages(0);
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            C2949Zf1.this.a.sendEmptyMessageDelayed(0, 900L);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Zf1$d */
    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (C2949Zf1.this.d.getVisibility() == 0) {
                C2949Zf1.this.l(false, false);
                C7151oi0.X.a(Boolean.FALSE);
            } else {
                C2949Zf1.this.l(true, false);
                C7151oi0.X.a(Boolean.TRUE);
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.Zf1$g */
    public class g implements View.OnClickListener {
        public g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C2949Zf1.this.a.sendEmptyMessageDelayed(0, 900L);
            C7151oi0.Z.a();
        }
    }

    public C2949Zf1(LayoutInflater layoutInflater, View view) {
        super(view.getContext(), (AttributeSet) null, 0, RD0.k);
        this.a = new Handler(new a());
        View viewInflate = View.inflate(view.getContext(), AbstractC9815yD0.y0, null);
        ImageButton imageButton = (ImageButton) viewInflate.findViewById(AbstractC5056hD0.i0);
        this.b = imageButton;
        imageButton.setOnClickListener(new b());
        this.k = (SeekBar) viewInflate.findViewById(AbstractC5056hD0.V2);
        this.l = (TextView) viewInflate.findViewById(AbstractC5056hD0.k4);
        B61 b61 = (B61) C7151oi0.P.a(new B61(0, 0));
        h(((Integer) b61.a).intValue(), ((Integer) b61.b).intValue(), false);
        this.k.setOnSeekBarChangeListener(new c(b61));
        C0746Eg1 c0746Eg1 = C7151oi0.W;
        Boolean bool = Boolean.FALSE;
        boolean zBooleanValue = ((Boolean) c0746Eg1.a(bool)).booleanValue();
        this.d = viewInflate.findViewById(AbstractC5056hD0.E1);
        this.c = (ImageButton) viewInflate.findViewById(AbstractC5056hD0.C);
        l(zBooleanValue, true);
        this.c.setOnClickListener(new d());
        this.e = (SeekBar) viewInflate.findViewById(AbstractC5056hD0.W2);
        this.f = (TextView) viewInflate.findViewById(AbstractC5056hD0.l4);
        B61 b612 = (B61) C7151oi0.Q.a(new B61(0, 0));
        g(((Integer) b612.a).intValue(), ((Integer) b612.b).intValue(), false);
        this.e.setOnSeekBarChangeListener(new e(b612));
        this.g = (SeekBar) viewInflate.findViewById(AbstractC5056hD0.S2);
        this.h = (TextView) viewInflate.findViewById(AbstractC5056hD0.O3);
        this.i = layoutInflater.getContext().getResources().getDimensionPixelSize(WC0.d);
        this.j = this.h.getTextSize();
        C61 c61 = (C61) C7151oi0.S.a(new C61(0, 0, Float.valueOf(1.0f)));
        i(((Integer) c61.a).intValue(), ((Integer) c61.b).intValue(), ((Float) c61.c).floatValue(), false);
        this.g.setOnSeekBarChangeListener(new f(c61));
        ImageButton imageButton2 = (ImageButton) viewInflate.findViewById(AbstractC5056hD0.B);
        this.m = imageButton2;
        imageButton2.setOnClickListener(new g());
        setContentView(viewInflate);
        setHeight(-2);
        setWidth(-2);
        setOutsideTouchable(true);
        setFocusable(true);
        k(((Boolean) C7151oi0.F.a(bool)).booleanValue(), ((Boolean) C7151oi0.G.a(bool)).booleanValue());
        j(((Boolean) C7151oi0.a0.a(bool)).booleanValue());
        Point point = new Point();
        int[] iArr = {0, i};
        view.getLocationInWindow(iArr);
        view.getDisplay().getRealSize(point);
        int i = point.y - iArr[1];
        showAtLocation(view, 8388691, iArr[0], i);
    }

    public final void g(int i, int i2, boolean z) {
        int iRound = Math.round(((i - r0) / (i2 / 2)) * 100.0f);
        TextView textView = this.f;
        textView.setText(textView.getResources().getQuantityString(FD0.c, iRound, Integer.valueOf(iRound)));
        if (z) {
            C7151oi0.U.a(Integer.valueOf(i), Integer.valueOf(i2));
        } else {
            this.e.setMax(i2);
            this.e.setProgress(i);
        }
    }

    public final void h(int i, int i2, boolean z) {
        int iRound = Math.round((i / i2) * 100.0f);
        TextView textView = this.l;
        textView.setText(textView.getResources().getQuantityString(FD0.e, iRound, Integer.valueOf(iRound)));
        if (z) {
            C7151oi0.T.a(Integer.valueOf(i), Integer.valueOf(i2));
        } else {
            this.k.setMax(i2);
            this.k.setProgress(i);
        }
    }

    public final void i(int i, int i2, float f2, boolean z) {
        if (i == 0) {
            this.h.setText(JD0.m4);
        } else if (i == 1) {
            this.h.setText(JD0.n4);
        } else {
            float f3 = (i - 1) * f2;
            TextView textView = this.h;
            textView.setText(textView.getResources().getQuantityString(FD0.f, (int) f3, Float.valueOf(f3)));
        }
        if (z) {
            C7151oi0.V.a(Integer.valueOf(i), Integer.valueOf(i2));
        } else {
            this.g.setMax(i2);
            this.g.setProgress(i);
        }
    }

    public void j(boolean z) {
        if (z) {
            this.m.setColorFilter(AbstractC1765Ob1.n(this.b, IC0.h));
        } else {
            this.m.setColorFilter(AbstractC1765Ob1.n(this.b, IC0.g));
        }
    }

    public void k(boolean z, boolean z2) {
        if (z) {
            ImageButton imageButton = this.b;
            imageButton.setColorFilter(AbstractC1765Ob1.n(imageButton, IC0.h));
        } else {
            ImageButton imageButton2 = this.b;
            imageButton2.setColorFilter(AbstractC1765Ob1.n(imageButton2, IC0.g));
        }
    }

    public final void l(boolean z, boolean z2) {
        if (z) {
            ViewPropertyAnimator viewPropertyAnimatorRotation = this.c.animate().rotation(90.0f);
            if (z2) {
                viewPropertyAnimatorRotation.setDuration(0L);
            }
            this.d.setVisibility(0);
            return;
        }
        ViewPropertyAnimator viewPropertyAnimatorRotation2 = this.c.animate().rotation(0.0f);
        if (z2) {
            viewPropertyAnimatorRotation2.setDuration(0L);
        }
        this.d.setVisibility(8);
    }

    /* JADX INFO: renamed from: com.daaw.Zf1$e */
    public class e implements SeekBar.OnSeekBarChangeListener {
        public final /* synthetic */ B61 a;

        public e(B61 b61) {
            this.a = b61;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            C2949Zf1.this.g(i, ((Integer) this.a.b).intValue(), true);
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    /* JADX INFO: renamed from: com.daaw.Zf1$f */
    public class f implements SeekBar.OnSeekBarChangeListener {
        public final /* synthetic */ C61 a;

        public f(C61 c61) {
            this.a = c61;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            C2949Zf1.this.i(i, ((Integer) this.a.b).intValue(), ((Float) this.a.c).floatValue(), true);
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    }
}
