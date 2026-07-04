package com.daaw;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: com.daaw.yD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C9814yD extends RecyclerView.o implements RecyclerView.s {
    public int e;
    public int f;
    public int g;
    public BitmapDrawable j;
    public Rect k;
    public Rect l;
    public b p;
    public boolean q;
    public final String a = "DragSortRecycler";
    public final boolean b = false;
    public int c = 0;
    public int d = -1;
    public float h = 0.1f;
    public float i = 0.5f;
    public float m = 0.5f;
    public int n = 0;
    public int o = -1;
    public View r = null;
    public Paint s = new Paint();
    public RecyclerView.t t = new a();

    /* JADX INFO: renamed from: com.daaw.yD$a */
    public class a extends RecyclerView.t {
        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public void a(RecyclerView recyclerView, int i) {
            super.a(recyclerView, i);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public void b(RecyclerView recyclerView, int i, int i2) {
            super.b(recyclerView, i, i2);
            C9814yD.this.p("Scrolled: " + i + " " + i2);
            C9814yD c9814yD = C9814yD.this;
            c9814yD.e = c9814yD.e - i2;
        }
    }

    /* JADX INFO: renamed from: com.daaw.yD$b */
    public interface b {
        void a(int i, int i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.s
    public void a(RecyclerView recyclerView, MotionEvent motionEvent) {
        float f;
        float f2;
        float height;
        p("onTouchEvent");
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (motionEvent.getAction() == 1 && this.d != -1) {
                int iQ = q(recyclerView);
                b bVar = this.p;
                if (bVar != null) {
                    bVar.a(this.d, iQ);
                }
            }
            this.r = null;
            w(false);
            this.d = -1;
            this.j = null;
            recyclerView.A0();
            return;
        }
        int y = (int) motionEvent.getY();
        this.f = y;
        if (this.j != null) {
            Rect rect = this.l;
            int i = y - this.g;
            rect.top = i;
            if (i < (-this.k.height()) / 2) {
                this.l.top = (-this.k.height()) / 2;
            }
            Rect rect2 = this.l;
            rect2.bottom = rect2.top + this.k.height();
            this.j.setBounds(this.l);
        }
        if (this.f > recyclerView.getHeight() * (1.0f - this.h)) {
            f2 = this.f;
            height = recyclerView.getHeight() * (1.0f - this.h);
        } else {
            if (this.f >= recyclerView.getHeight() * this.h) {
                f = 0.0f;
                p("Scroll: " + f);
                recyclerView.scrollBy(0, (int) (f * this.i));
                recyclerView.A0();
            }
            f2 = this.f;
            height = recyclerView.getHeight() * this.h;
        }
        f = f2 - height;
        p("Scroll: " + f);
        recyclerView.scrollBy(0, (int) (f * this.i));
        recyclerView.A0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.s
    public boolean b(RecyclerView recyclerView, MotionEvent motionEvent) {
        p("onInterceptTouchEvent");
        View view = this.r;
        if (view == null) {
            return false;
        }
        p("Started Drag");
        w(true);
        this.j = o(view);
        int y = (int) motionEvent.getY();
        this.e = y;
        this.g = y - view.getTop();
        this.f = this.e;
        this.d = recyclerView.k0(view);
        p("selectedDragItemPos = " + this.d);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void e(Rect rect, View view, RecyclerView recyclerView, RecyclerView.z zVar) {
        super.e(rect, view, recyclerView, zVar);
        p("getItemOffsets");
        p("View top = " + view.getTop());
        if (this.d == -1) {
            rect.top = 0;
            rect.bottom = 0;
            view.setVisibility(0);
            return;
        }
        int iK0 = recyclerView.k0(view);
        p("itemPos =" + iK0);
        if (n(iK0)) {
            if (iK0 == this.d) {
                view.setVisibility(4);
                return;
            }
            view.setVisibility(0);
            Rect rect2 = this.l;
            float fHeight = rect2.top + (rect2.height() / 2);
            if (iK0 > this.d && view.getTop() < fHeight) {
                float top = (fHeight - view.getTop()) / view.getHeight();
                if (top > 1.0f) {
                    top = 1.0f;
                }
                rect.top = -((int) (this.l.height() * top));
                rect.bottom = (int) (this.l.height() * top);
            }
            if (iK0 >= this.d || view.getBottom() <= fHeight) {
                return;
            }
            float bottom = (view.getBottom() - fHeight) / view.getHeight();
            float f = bottom <= 1.0f ? bottom : 1.0f;
            rect.top = (int) (this.l.height() * f);
            rect.bottom = -((int) (this.l.height() * f));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void i(Canvas canvas, RecyclerView recyclerView, RecyclerView.z zVar) {
        BitmapDrawable bitmapDrawable = this.j;
        if (bitmapDrawable != null) {
            bitmapDrawable.setAlpha((int) (this.m * 255.0f));
            this.s.setColor(this.n);
            canvas.drawRect(this.l, this.s);
            this.j.draw(canvas);
        }
    }

    public void m(View view) {
        this.r = view;
    }

    public boolean n(int i) {
        return true;
    }

    public final BitmapDrawable o(View view) {
        this.k = new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        this.l = new Rect(this.k);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(this.k.width(), this.k.height(), Bitmap.Config.ARGB_8888);
        view.draw(new Canvas(bitmapCreateBitmap));
        BitmapDrawable bitmapDrawable = new BitmapDrawable(view.getResources(), bitmapCreateBitmap);
        bitmapDrawable.setBounds(this.l);
        return bitmapDrawable;
    }

    public final int q(RecyclerView recyclerView) {
        int iK0;
        int iK = recyclerView.getLayoutManager().K();
        Rect rect = this.l;
        float fHeight = rect.top + (rect.height() / 2);
        int i = 0;
        int i2 = Integer.MAX_VALUE;
        for (int i3 = 0; i3 < iK; i3++) {
            View viewJ = recyclerView.getLayoutManager().J(i3);
            if (viewJ.getVisibility() == 0 && (iK0 = recyclerView.k0(viewJ)) != this.d) {
                float top = viewJ.getTop() + (viewJ.getHeight() / 2);
                if (fHeight > top) {
                    if (iK0 > i) {
                        i = iK0;
                    }
                } else if (fHeight <= top && iK0 < i2) {
                    i2 = iK0;
                }
            }
        }
        p("above = " + i + " below = " + i2);
        if (i2 == Integer.MAX_VALUE) {
            return i < this.d ? i + 1 : i;
        }
        if (i2 < this.d) {
            i2++;
        }
        return i2 - 1;
    }

    public RecyclerView.t r() {
        return this.t;
    }

    public void s(float f) {
        this.i = f;
    }

    public void t(float f) {
        this.h = f;
    }

    public void u(float f) {
        this.m = f;
    }

    public void v(int i) {
        this.n = i;
    }

    public final void w(boolean z) {
        if (z != this.q) {
            this.q = z;
        }
    }

    public void x(b bVar) {
        this.p = bVar;
    }

    public void y(int i) {
        this.o = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.s
    public void c(boolean z) {
    }

    public final void p(String str) {
    }
}
