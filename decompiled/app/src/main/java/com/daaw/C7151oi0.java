package com.daaw;

import android.R;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import com.daaw.C2078Qw0;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.daaw.oi0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C7151oi0 {
    public static C0746Eg1 F = new C0746Eg1();
    public static C0746Eg1 G = new C0746Eg1();
    public static C0746Eg1 H = new C0746Eg1();
    public static C9938yg1 I = new C9938yg1();
    public static C9938yg1 J = new C9938yg1();
    public static C9938yg1 K = new C9938yg1();
    public static C0746Eg1 L = new C0746Eg1();
    public static C0746Eg1 M = new C0746Eg1();
    public static C0746Eg1 N = new C0746Eg1();
    public static C10217zg1 O = new C10217zg1();
    public static C0746Eg1 P = new C0746Eg1();
    public static C0746Eg1 Q = new C0746Eg1();
    public static C0746Eg1 R = new C0746Eg1();
    public static C0746Eg1 S = new C0746Eg1();
    public static C0321Ag1 T = new C0321Ag1();
    public static C0321Ag1 U = new C0321Ag1();
    public static C0321Ag1 V = new C0321Ag1();
    public static C0746Eg1 W = new C0746Eg1();
    public static C10217zg1 X = new C10217zg1();
    public static C9938yg1 Y = new C9938yg1();
    public static C9938yg1 Z = new C9938yg1();
    public static C0746Eg1 a0 = new C0746Eg1();
    public static C0746Eg1 b0 = new C0746Eg1();
    public static C10217zg1 c0 = new C10217zg1();
    public static C0746Eg1 d0 = new C0746Eg1();
    public static C10217zg1 e0 = new C10217zg1();
    public static C0746Eg1 f0 = new C0746Eg1();
    public static C10217zg1 g0 = new C10217zg1();
    public static C9938yg1 h0 = new C9938yg1();
    public static C0746Eg1 i0 = new C0746Eg1();
    public static C9938yg1 j0 = new C9938yg1();
    public static C9938yg1 k0 = new C9938yg1();
    public static final Object l0 = new Object();
    public static C7151oi0 m0 = null;
    public RotateAnimation A;
    public RotateAnimation B;
    public final Handler a;
    public ImageButton d;
    public ImageButton e;
    public ImageButton f;
    public ImageView g;
    public TextView h;
    public TextView i;
    public SeekBar j;
    public TextView k;
    public TextView l;
    public TextView m;
    public ImageView n;
    public ImageButton o;
    public ImageButton p;
    public SeekBar q;
    public TextView r;
    public long u;
    public float w;
    public View x;
    public View y;
    public View z;
    public WeakReference b = new WeakReference(null);
    public WeakReference c = new WeakReference(null);
    public long s = 1000;
    public long t = -1;
    public int v = -1;
    public Runnable C = new a();
    public Runnable D = new b();
    public SeekBar.OnSeekBarChangeListener E = new c();

    /* JADX INFO: renamed from: com.daaw.oi0$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C7151oi0.this.x.setVisibility(4);
        }
    }

    /* JADX INFO: renamed from: com.daaw.oi0$b */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C7151oi0.this.z != null) {
                C7151oi0.this.z.setVisibility(4);
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.oi0$c */
    public class c implements SeekBar.OnSeekBarChangeListener {
        public c() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            if (z) {
                C7151oi0 c7151oi0 = C7151oi0.this;
                c7151oi0.t = (c7151oi0.s * ((long) i)) / 1000;
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                if (jElapsedRealtime - C7151oi0.this.u > 250) {
                    C7151oi0.this.u = jElapsedRealtime;
                    C7151oi0.O.a(Long.valueOf(C7151oi0.this.t));
                }
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            C7151oi0.this.u = 0L;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            C7151oi0.O.a(Long.valueOf(C7151oi0.this.t));
            C7151oi0.this.t = -1L;
        }
    }

    /* JADX INFO: renamed from: com.daaw.oi0$d */
    public class d implements Handler.Callback {
        public d() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            C7151oi0.this.A(C7151oi0.this.B());
            return false;
        }
    }

    /* JADX INFO: renamed from: com.daaw.oi0$e */
    public class e implements View.OnClickListener {
        public e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            LayoutInflater layoutInflaterFrom = LayoutInflater.from(view.getContext());
            AbstractC1765Ob1.k((C2949Zf1) C7151oi0.this.b.get());
            C7151oi0.this.b = new WeakReference(new C2949Zf1(layoutInflaterFrom, view));
        }
    }

    /* JADX INFO: renamed from: com.daaw.oi0$f */
    public class f implements View.OnClickListener {
        public f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            AbstractC1765Ob1.k((C8088s31) C7151oi0.this.c.get());
            C7151oi0.this.c = new WeakReference(new C8088s31(view));
        }
    }

    /* JADX INFO: renamed from: com.daaw.oi0$g */
    public class g implements View.OnClickListener {
        public g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C7151oi0.K.a();
        }
    }

    /* JADX INFO: renamed from: com.daaw.oi0$h */
    public class h implements View.OnClickListener {
        public h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C7151oi0.K.a();
        }
    }

    public C7151oi0() {
        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
        this.A = rotateAnimation;
        rotateAnimation.setInterpolator(new LinearInterpolator());
        this.A.setDuration(6000L);
        this.A.setRepeatCount(-1);
        RotateAnimation rotateAnimation2 = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
        this.B = rotateAnimation2;
        rotateAnimation2.setInterpolator(new LinearInterpolator());
        this.B.setDuration(6000L);
        this.B.setRepeatCount(-1);
        this.a = new Handler(new d());
    }

    public static C7151oi0 q() {
        C7151oi0 c7151oi0;
        C7151oi0 c7151oi02 = m0;
        if (c7151oi02 != null) {
            return c7151oi02;
        }
        synchronized (l0) {
            try {
                if (m0 == null) {
                    m0 = new C7151oi0();
                }
                c7151oi0 = m0;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c7151oi0;
    }

    public final void A(long j) {
        Message messageObtainMessage = this.a.obtainMessage(1);
        this.a.removeMessages(1);
        this.a.sendMessageDelayed(messageObtainMessage, j);
    }

    public final long B() {
        long jLongValue = ((Long) L.a(-1L)).longValue();
        C0746Eg1 c0746Eg1 = N;
        Boolean bool = Boolean.FALSE;
        B61 b61 = (B61) c0746Eg1.a(new B61(bool, bool));
        if (jLongValue < 0) {
            return 500L;
        }
        try {
            long j = this.t;
            if (j >= 0) {
                jLongValue = j;
            }
            if (jLongValue < 0 || this.s < 0) {
                this.h.setText("--:--");
                this.j.setProgress(1000);
                SeekBar seekBar = this.q;
                if (seekBar != null) {
                    seekBar.setProgress(1000);
                }
            } else {
                this.h.setText(AbstractC0405Bb1.o((int) (jLongValue / 1000)));
                int i = (int) ((jLongValue * 1000) / this.s);
                this.j.setProgress(i);
                SeekBar seekBar2 = this.q;
                if (seekBar2 != null) {
                    seekBar2.setProgress(i);
                }
                int i2 = 0;
                if (!((Boolean) b61.a).booleanValue()) {
                    int visibility = this.h.getVisibility();
                    TextView textView = this.h;
                    if (visibility != 4) {
                        i2 = 4;
                    }
                    textView.setVisibility(i2);
                    return 500L;
                }
                this.h.setVisibility(0);
            }
            long j2 = 1000 - (jLongValue % 1000);
            int width = this.j.getWidth();
            if (width == 0) {
                width = 320;
            }
            long j3 = this.s / ((long) width);
            if (j3 > j2) {
                return j2;
            }
            if (j3 < 20) {
                return 20L;
            }
            return j3;
        } catch (Exception unused) {
            return 500L;
        }
    }

    public final void C(boolean z, boolean z2) {
        int iN = AbstractC1765Ob1.n(this.e, IC0.g);
        if (z) {
            int iN2 = AbstractC1765Ob1.n(this.e, IC0.h);
            this.e.setImageResource(AbstractC3374bD0.L);
            this.e.setColorFilter(iN2);
            ImageButton imageButton = this.p;
            if (imageButton != null) {
                imageButton.setImageResource(AbstractC3374bD0.L);
                this.p.setColorFilter(iN2);
                return;
            }
            return;
        }
        if (z2) {
            this.e.setImageResource(AbstractC3374bD0.U);
            this.e.setColorFilter(iN);
            ImageButton imageButton2 = this.p;
            if (imageButton2 != null) {
                imageButton2.setImageResource(AbstractC3374bD0.U);
                this.p.setColorFilter(iN);
                return;
            }
            return;
        }
        this.e.setImageResource(AbstractC3374bD0.V);
        this.e.setColorFilter(iN);
        ImageButton imageButton3 = this.p;
        if (imageButton3 != null) {
            imageButton3.setImageResource(AbstractC3374bD0.V);
            this.p.setColorFilter(iN);
        }
    }

    public final void D(boolean z, boolean z2) {
        if (!z2) {
            ImageView imageView = this.g;
            if (imageView != null && this.d != null) {
                imageView.clearAnimation();
                this.g.setVisibility(4);
                this.d.setImageResource(AbstractC3374bD0.z);
            }
            ImageView imageView2 = this.n;
            if (imageView2 == null || this.o == null) {
                return;
            }
            imageView2.clearAnimation();
            this.n.setVisibility(4);
            this.o.setImageResource(AbstractC3374bD0.z);
            return;
        }
        ImageView imageView3 = this.g;
        if (imageView3 != null && this.d != null) {
            if (!z) {
                imageView3.clearAnimation();
            } else if (imageView3.getAnimation() == null || !this.g.getAnimation().hasStarted()) {
                this.g.startAnimation(this.A);
            }
            this.g.setVisibility(0);
            this.d.setImageResource(AbstractC3374bD0.x);
        }
        ImageView imageView4 = this.n;
        if (imageView4 == null || this.o == null) {
            return;
        }
        if (!z) {
            imageView4.clearAnimation();
        } else if (imageView4.getAnimation() == null || !this.n.getAnimation().hasStarted()) {
            this.n.startAnimation(this.B);
        }
        this.n.setVisibility(0);
        this.o.setImageResource(AbstractC3374bD0.y);
    }

    public final void E() {
        ImageView imageView = this.g;
        if (imageView != null && imageView.getAnimation() != null && this.g.getAnimation().hasStarted()) {
            this.g.clearAnimation();
            this.g.startAnimation(this.A);
        }
        ImageView imageView2 = this.n;
        if (imageView2 == null || imageView2.getAnimation() == null || !this.n.getAnimation().hasStarted()) {
            return;
        }
        this.n.clearAnimation();
        this.n.startAnimation(this.B);
    }

    public void F(boolean z, boolean z2) {
        if (r()) {
            D(z, z2);
        }
    }

    public void G(C2078Qw0.b bVar, C0705Dw0 c0705Dw0) {
        if (r()) {
            long j = c0705Dw0.a;
            this.s = j;
            this.i.setText(AbstractC0405Bb1.o((int) (j / 1000)));
            this.k.setText(bVar.e);
            this.k.setSelected(true);
            this.k.setEllipsize(TextUtils.TruncateAt.END);
            this.k.setClickable(false);
            this.k.setLongClickable(false);
            TextView textView = this.r;
            if (textView != null) {
                textView.setText(bVar.e);
                this.r.setSelected(true);
                this.r.setEllipsize(TextUtils.TruncateAt.MARQUEE);
                this.r.setMovementMethod(new C1600Mm0());
                this.r.setClickable(false);
                this.r.setLongClickable(false);
            }
            TextView textView2 = this.l;
            if (textView2 != null) {
                textView2.setText("");
            }
            TextView textView3 = this.m;
            if (textView3 != null) {
                textView3.setText(bVar.i() ? bVar.h : "");
            }
            A(100L);
            E();
        }
    }

    public void H(int i) {
        C8088s31 c8088s31 = (C8088s31) this.c.get();
        if (c8088s31 == null || !c8088s31.isShowing()) {
            return;
        }
        c8088s31.d(i);
    }

    public void p(int i) {
        if (r()) {
            if (i == 1 && this.z == null) {
                i = 2;
            }
            if (this.v != i) {
                C2949Zf1 c2949Zf1 = (C2949Zf1) this.b.get();
                if (c2949Zf1 != null) {
                    AbstractC1765Ob1.k(c2949Zf1);
                    this.b.clear();
                }
                C8088s31 c8088s31 = (C8088s31) this.c.get();
                if (c8088s31 != null) {
                    AbstractC1765Ob1.k(c8088s31);
                    this.c.clear();
                }
            }
            this.v = i;
            View view = this.x;
            int integer = view.getResources().getInteger(R.integer.config_shortAnimTime);
            float dimension = this.y.getResources().getDimension(WC0.c);
            if (i == 0) {
                this.y.animate().cancel();
                long j = integer;
                this.y.animate().translationY(dimension).alpha(0.0f).setDuration(j);
                view.animate().cancel();
                view.animate().withEndAction(this.C).translationY(dimension).alpha(0.0f).setDuration(j);
                View view2 = this.z;
                if (view2 != null) {
                    view2.animate().cancel();
                    this.z.animate().withEndAction(this.D).translationY(this.w).alpha(0.0f).setDuration(j);
                    return;
                }
                return;
            }
            if (i == 1) {
                long j2 = integer;
                this.y.animate().translationY(dimension - this.w).alpha(1.0f).setDuration(j2);
                view.animate().cancel();
                view.animate().withEndAction(this.C);
                view.animate().translationY(dimension).alpha(0.0f).setDuration(j2);
                View view3 = this.z;
                if (view3 != null) {
                    view3.animate().cancel();
                    this.z.animate().withEndAction(null);
                    this.z.setVisibility(0);
                    this.z.animate().translationY(0.0f).alpha(1.0f).setDuration(j2);
                    return;
                }
                return;
            }
            if (i == 2) {
                long j3 = integer;
                this.y.animate().translationY(0.0f).alpha(1.0f).setDuration(j3);
                view.animate().cancel();
                view.setVisibility(0);
                view.animate().withEndAction(null);
                view.animate().translationY(0.0f).alpha(1.0f).setDuration(j3);
                View view4 = this.z;
                if (view4 != null) {
                    view4.animate().cancel();
                    this.z.animate().withEndAction(this.D);
                    this.z.animate().translationY(-this.w).alpha(0.0f).setDuration(j3);
                }
            }
        }
    }

    public final boolean r() {
        return this.y != null;
    }

    public void s(boolean z) {
        if (r()) {
            z(((Boolean) F.a(Boolean.FALSE)).booleanValue(), z);
        }
    }

    public void t(View view, View view2, View view3) {
        e eVar = new e();
        f fVar = new f();
        this.w = view.getResources().getDimension(WC0.a);
        this.x = view;
        this.y = view3;
        if (view.getResources().getConfiguration().orientation == 2) {
            this.z = null;
            view2.setVisibility(8);
        } else {
            this.z = view2;
        }
        View view4 = this.x;
        AbstractC1765Ob1.i(view4, view4.getParent());
        this.h = (TextView) view.findViewById(AbstractC5056hD0.a4);
        this.i = (TextView) view.findViewById(AbstractC5056hD0.d4);
        this.j = (SeekBar) view.findViewById(AbstractC5056hD0.T2);
        this.k = (TextView) view.findViewById(AbstractC5056hD0.e4);
        this.j.setOnSeekBarChangeListener(this.E);
        view.findViewById(AbstractC5056hD0.S).setOnClickListener(new View.OnClickListener() { // from class: com.daaw.mi0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view5) {
                C7151oi0.I.a();
            }
        });
        view.findViewById(AbstractC5056hD0.M).setOnClickListener(new View.OnClickListener() { // from class: com.daaw.ni0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view5) {
                C7151oi0.J.a();
            }
        });
        ImageButton imageButton = (ImageButton) view.findViewById(AbstractC5056hD0.N);
        this.d = imageButton;
        if (imageButton != null) {
            imageButton.setOnClickListener(new g());
        }
        this.g = (ImageView) view.findViewById(AbstractC5056hD0.r4);
        ImageButton imageButton2 = (ImageButton) view.findViewById(AbstractC5056hD0.h0);
        this.e = imageButton2;
        imageButton2.setOnClickListener(eVar);
        ImageButton imageButton3 = (ImageButton) view.findViewById(AbstractC5056hD0.K);
        this.f = imageButton3;
        imageButton3.setOnClickListener(fVar);
        this.l = (TextView) view.findViewById(AbstractC5056hD0.b4);
        this.m = (TextView) view.findViewById(AbstractC5056hD0.c4);
        View view5 = this.z;
        if (view5 != null) {
            this.q = (SeekBar) view5.findViewById(AbstractC5056hD0.T2);
            this.r = (TextView) this.z.findViewById(AbstractC5056hD0.e4);
            this.q.setOnSeekBarChangeListener(this.E);
            ImageButton imageButton4 = (ImageButton) this.z.findViewById(AbstractC5056hD0.h0);
            this.p = imageButton4;
            imageButton4.setOnClickListener(eVar);
            ((ImageButton) this.z.findViewById(AbstractC5056hD0.K)).setOnClickListener(fVar);
        }
        View view6 = this.z;
        if (view6 == null) {
            view6 = this.x;
        }
        ImageButton imageButton5 = (ImageButton) view6.findViewById(AbstractC5056hD0.O);
        this.o = imageButton5;
        if (imageButton5 != null) {
            imageButton5.setOnClickListener(new h());
        }
        this.n = (ImageView) view6.findViewById(AbstractC5056hD0.s4);
        int iIntValue = ((Integer) H.a(2)).intValue();
        this.v = -1;
        p(iIntValue);
        C0746Eg1 c0746Eg1 = N;
        Boolean bool = Boolean.FALSE;
        B61 b61 = (B61) c0746Eg1.a(new B61(bool, bool));
        F(((Boolean) b61.a).booleanValue(), ((Boolean) b61.b).booleanValue());
        B61 b612 = (B61) M.a(new B61(C2078Qw0.h, C0705Dw0.c));
        G((C2078Qw0.b) b612.a, (C0705Dw0) b612.b);
        z(((Boolean) F.a(bool)).booleanValue(), ((Boolean) G.a(bool)).booleanValue());
        A(100L);
    }

    public void u(boolean z) {
        C2949Zf1 c2949Zf1 = (C2949Zf1) this.b.get();
        if (c2949Zf1 == null || !c2949Zf1.isShowing()) {
            return;
        }
        c2949Zf1.j(z);
    }

    public void v(int i) {
        C8088s31 c8088s31 = (C8088s31) this.c.get();
        if (c8088s31 == null || !c8088s31.isShowing()) {
            return;
        }
        c8088s31.a(i);
    }

    public void w(int i) {
        C8088s31 c8088s31 = (C8088s31) this.c.get();
        if (c8088s31 == null || !c8088s31.isShowing()) {
            return;
        }
        c8088s31.b(i);
    }

    public void x(int i) {
        C8088s31 c8088s31 = (C8088s31) this.c.get();
        if (c8088s31 == null || !c8088s31.isShowing()) {
            return;
        }
        c8088s31.c(i);
    }

    public void y(boolean z) {
        if (r()) {
            z(z, ((Boolean) G.a(Boolean.FALSE)).booleanValue());
        }
    }

    public final void z(boolean z, boolean z2) {
        C2949Zf1 c2949Zf1 = (C2949Zf1) this.b.get();
        if (c2949Zf1 != null && c2949Zf1.isShowing()) {
            c2949Zf1.k(z, z2);
        }
        C(z, z2);
    }
}
