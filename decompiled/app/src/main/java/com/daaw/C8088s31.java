package com.daaw;

import android.graphics.Point;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;

/* JADX INFO: renamed from: com.daaw.s31, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C8088s31 extends PopupWindow {
    public Handler a;
    public ImageView b;
    public ImageView c;
    public ImageView d;
    public ImageView e;
    public ImageView f;
    public ImageView g;
    public TextView[] h;
    public ImageView[] i;
    public int j;

    /* JADX INFO: renamed from: com.daaw.s31$a */
    public class a implements Handler.Callback {
        public a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            AbstractC1765Ob1.k(C8088s31.this);
            return false;
        }
    }

    /* JADX INFO: renamed from: com.daaw.s31$b */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C7151oi0.g0.a(0);
        }
    }

    /* JADX INFO: renamed from: com.daaw.s31$c */
    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C7151oi0.g0.a(1);
        }
    }

    /* JADX INFO: renamed from: com.daaw.s31$d */
    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C7151oi0.j0.a();
        }
    }

    /* JADX INFO: renamed from: com.daaw.s31$e */
    public class e implements View.OnClickListener {
        public e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C7151oi0.k0.a();
        }
    }

    /* JADX INFO: renamed from: com.daaw.s31$f */
    public class f implements View.OnClickListener {
        public f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C7151oi0.e0.a(Integer.valueOf(((Integer) C7151oi0.d0.a(0)).intValue() != 1 ? 1 : 0));
        }
    }

    /* JADX INFO: renamed from: com.daaw.s31$g */
    public class g implements View.OnClickListener {
        public g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C7151oi0.e0.a(Integer.valueOf(((Integer) C7151oi0.d0.a(0)).intValue() != 2 ? 2 : 0));
        }
    }

    public C8088s31(View view) {
        super(view.getContext(), (AttributeSet) null, 0, RD0.k);
        this.h = new TextView[7];
        this.i = new ImageView[7];
        this.a = new Handler(new a());
        this.j = AbstractC1765Ob1.n(view, IC0.g);
        View viewInflate = View.inflate(view.getContext(), AbstractC9815yD0.x0, null);
        View[] viewArr = new View[7];
        viewArr[0] = viewInflate.findViewById(AbstractC5056hD0.i1);
        viewArr[1] = viewInflate.findViewById(AbstractC5056hD0.j1);
        viewArr[2] = viewInflate.findViewById(AbstractC5056hD0.o1);
        viewArr[3] = viewInflate.findViewById(AbstractC5056hD0.m1);
        viewArr[4] = viewInflate.findViewById(AbstractC5056hD0.l1);
        viewArr[5] = viewInflate.findViewById(AbstractC5056hD0.k1);
        this.d = (ImageView) viewInflate.findViewById(AbstractC5056hD0.Q);
        viewArr[0].setOnClickListener(new b());
        this.e = (ImageView) viewInflate.findViewById(AbstractC5056hD0.R);
        viewArr[1].setOnClickListener(new c());
        this.f = (ImageView) viewInflate.findViewById(AbstractC5056hD0.g0);
        viewArr[2].setOnClickListener(new d());
        this.g = (ImageView) viewInflate.findViewById(AbstractC5056hD0.e0);
        viewArr[3].setOnClickListener(new e());
        this.b = (ImageView) viewInflate.findViewById(AbstractC5056hD0.X);
        viewArr[4].setOnClickListener(new f());
        this.c = (ImageView) viewInflate.findViewById(AbstractC5056hD0.W);
        viewArr[5].setOnClickListener(new g());
        setContentView(viewInflate);
        setHeight(-2);
        setWidth(-2);
        setOutsideTouchable(true);
        setFocusable(true);
        this.g.setColorFilter(this.j);
        d(((Integer) C7151oi0.i0.a(0)).intValue());
        a(((Integer) C7151oi0.f0.a(-1)).intValue());
        b(((Integer) C7151oi0.d0.a(0)).intValue());
        c(((Integer) C7151oi0.b0.a(0)).intValue());
        Point point = new Point();
        int[] iArr = {0, i};
        view.getLocationInWindow(iArr);
        view.getDisplay().getRealSize(point);
        int i = point.y - iArr[1];
        showAtLocation(view, 8388691, iArr[0], i);
    }

    public void a(int i) {
        if (i == 0) {
            ImageView imageView = this.d;
            imageView.setColorFilter(AbstractC1765Ob1.n(imageView, IC0.h));
            ImageView imageView2 = this.e;
            imageView2.setColorFilter(AbstractC1765Ob1.n(imageView2, IC0.g));
            return;
        }
        ImageView imageView3 = this.d;
        imageView3.setColorFilter(AbstractC1765Ob1.n(imageView3, IC0.g));
        ImageView imageView4 = this.e;
        imageView4.setColorFilter(AbstractC1765Ob1.n(imageView4, IC0.h));
    }

    public void b(int i) {
        if (i == 1) {
            ImageView imageView = this.b;
            imageView.setColorFilter(AbstractC1765Ob1.n(imageView, IC0.h));
            this.c.setColorFilter(this.j);
        } else if (i != 2) {
            this.b.setColorFilter(this.j);
            this.c.setColorFilter(this.j);
        } else {
            this.b.setColorFilter(this.j);
            ImageView imageView2 = this.c;
            imageView2.setColorFilter(AbstractC1765Ob1.n(imageView2, IC0.h));
        }
    }

    public void d(int i) {
        if (i == 1) {
            this.f.setImageResource(AbstractC3374bD0.Z);
        } else if (i == 2) {
            this.f.setImageResource(AbstractC3374bD0.a0);
        } else if (i == 3) {
            this.f.setImageResource(AbstractC3374bD0.b0);
        }
        this.f.setColorFilter(this.j);
    }

    public void c(int i) {
    }
}
