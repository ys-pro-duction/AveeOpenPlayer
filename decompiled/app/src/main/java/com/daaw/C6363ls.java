package com.daaw;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.daaw.C1748Nx0;
import com.daaw.C5004h20;

/* JADX INFO: renamed from: com.daaw.ls, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C6363ls extends AbstractC1464Le {
    public static C0425Bg1 I = new C0425Bg1();
    public static C0746Eg1 J = new C0746Eg1();
    public static C10217zg1 K = new C10217zg1();
    public TextView A;
    public TextView B;
    public TextView C;
    public ImageButton D;
    public Drawable E;
    public AbstractC7524q2[] F;
    public boolean G;
    public InterfaceC5559j2 H;
    public C5004h20.a u;
    public Object v;
    public int w;
    public View x;
    public ImageView y;
    public TextView z;

    /* JADX INFO: renamed from: com.daaw.ls$a */
    public class a implements View.OnClickListener {
        public final /* synthetic */ NW B;

        public a(NW nw) {
            this.B = nw;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.B.m(C6363ls.this.w, view.getContext());
        }
    }

    /* JADX INFO: renamed from: com.daaw.ls$b */
    public class b implements View.OnLongClickListener {
        public b() {
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            return false;
        }
    }

    /* JADX INFO: renamed from: com.daaw.ls$c */
    public class c implements View.OnTouchListener {
        public c() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return false;
        }
    }

    /* JADX INFO: renamed from: com.daaw.ls$d */
    public class d implements View.OnLongClickListener {
        public final /* synthetic */ NW B;

        public d(NW nw) {
            this.B = nw;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            if (this.B.u() == null) {
                return false;
            }
            this.B.u().a(C6363ls.this.a);
            return true;
        }
    }

    /* JADX INFO: renamed from: com.daaw.ls$e */
    public class e implements View.OnTouchListener {
        public final /* synthetic */ boolean B;
        public final /* synthetic */ NW C;

        public e(boolean z, NW nw) {
            this.B = z;
            this.C = nw;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (!this.B || !((Boolean) C6363ls.J.a(Boolean.FALSE)).booleanValue() || motionEvent.getAction() != 0 || this.C.u() == null) {
                return false;
            }
            this.C.u().a(C6363ls.this.a);
            return true;
        }
    }

    /* JADX INFO: renamed from: com.daaw.ls$f */
    public class f implements View.OnClickListener {
        public final /* synthetic */ boolean B;

        /* JADX INFO: renamed from: com.daaw.ls$f$a */
        public class a implements C1748Nx0.c {
            public a() {
            }

            @Override // com.daaw.C1748Nx0.c
            public boolean onMenuItemClick(MenuItem menuItem) {
                C6363ls.this.F[menuItem.getItemId()].a(C6363ls.this.u.d());
                return true;
            }
        }

        public f(boolean z) {
            this.B = z;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.B && ((Boolean) C6363ls.J.a(Boolean.FALSE)).booleanValue()) {
                return;
            }
            C6363ls.K.a(C6363ls.this.u.d());
            C1748Nx0 c1748Nx0 = new C1748Nx0(view.getContext(), view);
            c1748Nx0.b(new a());
            for (int i = 0; i < C6363ls.this.F.length; i++) {
                if (C6363ls.this.F[i].b().e() && C6363ls.this.F[i].b().g()) {
                    c1748Nx0.a().add(0, i, C6363ls.this.F[i].b().c(), C6363ls.this.F[i].b().d());
                }
            }
            c1748Nx0.c();
        }
    }

    /* JADX INFO: renamed from: com.daaw.ls$g */
    public class g implements View.OnClickListener {
        public final /* synthetic */ AbstractC7524q2 B;

        public g(AbstractC7524q2 abstractC7524q2) {
            this.B = abstractC7524q2;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C6363ls.K.a(C6363ls.this.u.d());
            if (!((Boolean) C6363ls.J.a(Boolean.FALSE)).booleanValue()) {
                if (this.B.b().h()) {
                    C6363ls.this.b0(true);
                }
                this.B.a(C6363ls.this.u.d());
            } else {
                C6363ls c6363ls = C6363ls.this;
                if (c6363ls.u != null) {
                    C6363ls.I.a(c6363ls.F, Boolean.valueOf(true ^ C6363ls.this.x.isSelected()), C6363ls.this.u);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.ls$h */
    public class h implements View.OnClickListener {
        public final /* synthetic */ NW B;

        public h(NW nw) {
            this.B = nw;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (!((Boolean) C6363ls.J.a(Boolean.FALSE)).booleanValue()) {
                this.B.m(C6363ls.this.w, view.getContext());
                return;
            }
            C6363ls c6363ls = C6363ls.this;
            if (c6363ls.u != null) {
                C6363ls.I.a(c6363ls.F, Boolean.valueOf(!C6363ls.this.x.isSelected()), C6363ls.this.u);
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.ls$i */
    public class i implements View.OnLongClickListener {
        public i() {
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            C6363ls.I.a(C6363ls.this.F, Boolean.valueOf(!C6363ls.this.x.isSelected()), C6363ls.this.u);
            return true;
        }
    }

    public C6363ls(ViewGroup viewGroup) {
        super(LayoutInflater.from(viewGroup.getContext()).inflate(AbstractC9815yD0.q0, viewGroup, false));
        this.u = null;
        this.v = null;
        this.F = null;
        this.G = false;
        this.H = null;
        View view = this.a;
        this.x = view.findViewById(AbstractC5056hD0.q4);
        this.y = (ImageView) view.findViewById(AbstractC5056hD0.w1);
        this.z = (TextView) view.findViewById(AbstractC5056hD0.W3);
        this.A = (TextView) view.findViewById(AbstractC5056hD0.T3);
        this.B = (TextView) view.findViewById(AbstractC5056hD0.U3);
        this.C = (TextView) view.findViewById(AbstractC5056hD0.S3);
        ImageButton imageButton = (ImageButton) view.findViewById(AbstractC5056hD0.I);
        this.D = imageButton;
        this.E = imageButton.getBackground();
        this.a.setLongClickable(true);
    }

    public void T() {
        InterfaceC5559j2 interfaceC5559j2 = this.H;
        if (interfaceC5559j2 != null) {
            interfaceC5559j2.a(this);
        }
        if (((Boolean) J.a(Boolean.FALSE)).booleanValue()) {
            return;
        }
        b0(false);
    }

    public final void U(int i2) {
        this.D.setColorFilter((16777215 & i2) - 16777216);
        this.D.setImageAlpha(Color.alpha(i2));
    }

    public void V(int i2) {
        this.D.setImageResource(i2);
    }

    public void W(Drawable drawable) {
        new E3().j(this.y);
        this.y.setImageDrawable(drawable);
    }

    public void X(int i2) {
        if (i2 == -1) {
            this.y.setColorFilter(i2 & 16777215);
            this.y.setImageAlpha(255);
        } else {
            this.y.setColorFilter((16777215 & i2) - 16777216);
            this.y.setImageAlpha(Color.alpha(i2));
        }
    }

    public void Y(int i2) {
        new E3().j(this.y);
        this.y.setImageResource(i2);
    }

    public void Z(AbstractC7524q2[] abstractC7524q2Arr, int i2, NW nw) {
        a0(abstractC7524q2Arr, i2, nw, false, false, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a0(com.daaw.AbstractC7524q2[] r1, int r2, com.daaw.NW r3, boolean r4, boolean r5, com.daaw.InterfaceC5559j2 r6) {
        /*
            r0 = this;
            r0.H = r6
            r0.F = r1
            if (r1 != 0) goto L7
            r2 = -1
        L7:
            r1 = 0
            if (r4 == 0) goto L1c
            android.widget.ImageButton r5 = r0.D
            int r6 = com.daaw.AbstractC3374bD0.v0
            r5.setBackgroundResource(r6)
            android.widget.ImageButton r5 = r0.D
            com.daaw.ls$d r6 = new com.daaw.ls$d
            r6.<init>(r3)
            r5.setOnLongClickListener(r6)
            goto L28
        L1c:
            android.widget.ImageButton r5 = r0.D
            android.graphics.drawable.Drawable r6 = r0.E
            r5.setBackground(r6)
            android.widget.ImageButton r5 = r0.D
            r5.setOnLongClickListener(r1)
        L28:
            com.daaw.q2[] r5 = r0.F
            if (r5 == 0) goto L51
            int r5 = r5.length
            if (r5 <= 0) goto L51
            android.widget.ImageButton r1 = r0.D
            r5 = 0
            r1.setVisibility(r5)
            android.widget.ImageButton r1 = r0.D
            int r5 = com.daaw.AbstractC3374bD0.M
            r1.setImageResource(r5)
            android.widget.ImageButton r1 = r0.D
            com.daaw.ls$e r5 = new com.daaw.ls$e
            r5.<init>(r4, r3)
            r1.setOnTouchListener(r5)
            android.widget.ImageButton r1 = r0.D
            com.daaw.ls$f r5 = new com.daaw.ls$f
            r5.<init>(r4)
            r1.setOnClickListener(r5)
            goto L62
        L51:
            android.widget.ImageButton r4 = r0.D
            r5 = 8
            r4.setVisibility(r5)
            android.widget.ImageButton r4 = r0.D
            r4.setOnTouchListener(r1)
            android.widget.ImageButton r4 = r0.D
            r4.setOnClickListener(r1)
        L62:
            if (r2 < 0) goto L76
            com.daaw.q2[] r1 = r0.F
            int r4 = r1.length
            if (r4 <= 0) goto L76
            r1 = r1[r2]
            android.view.View r2 = r0.a
            com.daaw.ls$g r3 = new com.daaw.ls$g
            r3.<init>(r1)
            r2.setOnClickListener(r3)
            goto L80
        L76:
            android.view.View r1 = r0.a
            com.daaw.ls$h r2 = new com.daaw.ls$h
            r2.<init>(r3)
            r1.setOnClickListener(r2)
        L80:
            com.daaw.q2[] r1 = r0.F
            if (r1 == 0) goto L95
            int r1 = r1.length
            if (r1 <= 0) goto L95
            com.daaw.h20$a r1 = r0.u
            if (r1 == 0) goto L95
            android.view.View r1 = r0.a
            com.daaw.ls$i r2 = new com.daaw.ls$i
            r2.<init>()
            r1.setOnLongClickListener(r2)
        L95:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C6363ls.a0(com.daaw.q2[], int, com.daaw.NW, boolean, boolean, com.daaw.j2):void");
    }

    public final void b0(boolean z) {
        this.a.setSelected(z);
    }

    public void c0(NW nw, InterfaceC5694jX interfaceC5694jX) {
        d0(nw, null, interfaceC5694jX);
    }

    public void d0(NW nw, Object obj, InterfaceC5694jX interfaceC5694jX) {
        B61 b61S = nw.s();
        this.G = !((Boolean) b61S.b).booleanValue();
        ViewGroup.LayoutParams layoutParams = this.x.getLayoutParams();
        layoutParams.height = ((Integer) b61S.a).intValue();
        this.x.setLayoutParams(layoutParams);
        ViewGroup.LayoutParams layoutParams2 = this.y.getLayoutParams();
        layoutParams2.width = ((Integer) b61S.a).intValue();
        this.y.setLayoutParams(layoutParams2);
        this.v = null;
        if (obj != null) {
            this.u = new C5004h20.a(interfaceC5694jX, obj);
        } else {
            this.u = null;
        }
        this.a.setOnClickListener(new a(nw));
        this.a.setOnLongClickListener(new b());
        this.D.setVisibility(8);
        this.D.setImageResource(AbstractC3374bD0.M);
        U(AbstractC1765Ob1.n(this.D, IC0.i));
        this.x.setActivated(false);
        Z(null, -1, nw);
        this.a.setOnTouchListener(new c());
    }

    public void e0(String str) {
        this.B.setText(str);
    }

    public void f0(int i2) {
        if (this.G) {
            this.B.setVisibility(8);
        } else {
            this.B.setVisibility(i2);
        }
    }

    @Override // com.daaw.AbstractC1464Le
    public void Q(NW nw, int i2) {
    }
}
