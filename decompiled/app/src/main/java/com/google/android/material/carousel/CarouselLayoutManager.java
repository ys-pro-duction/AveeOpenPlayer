package com.google.android.material.carousel;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.g;
import com.daaw.AbstractC1380Kj;
import com.daaw.AbstractC6338ln;
import com.daaw.AbstractC6991o7;
import com.daaw.AbstractC8621ty0;
import com.daaw.AbstractC9105vh0;
import com.daaw.InterfaceC1276Jj;
import com.daaw.YC0;
import com.google.android.material.carousel.a;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class CarouselLayoutManager extends RecyclerView.p implements InterfaceC1276Jj {
    public int s;
    public int t;
    public int u;
    public AbstractC1380Kj x;
    public com.google.android.material.carousel.b y;
    public com.google.android.material.carousel.a z;
    public boolean v = false;
    public final c w = new c();
    public int A = 0;

    public class a extends g {
        public a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.y
        public PointF a(int i) {
            if (CarouselLayoutManager.this.y == null) {
                return null;
            }
            CarouselLayoutManager carouselLayoutManager = CarouselLayoutManager.this;
            return new PointF(carouselLayoutManager.l2(carouselLayoutManager.y.f(), i) - CarouselLayoutManager.this.s, 0.0f);
        }

        @Override // androidx.recyclerview.widget.g
        public int t(View view, int i) {
            CarouselLayoutManager carouselLayoutManager = CarouselLayoutManager.this;
            return (int) (CarouselLayoutManager.this.s - carouselLayoutManager.l2(carouselLayoutManager.y.f(), CarouselLayoutManager.this.k0(view)));
        }
    }

    public static final class b {
        public View a;
        public float b;
        public d c;

        public b(View view, float f, d dVar) {
            this.a = view;
            this.b = f;
            this.c = dVar;
        }
    }

    public static class c extends RecyclerView.o {
        public final Paint a;
        public List b;

        public c() {
            Paint paint = new Paint();
            this.a = paint;
            this.b = DesugarCollections.unmodifiableList(new ArrayList());
            paint.setStrokeWidth(5.0f);
            paint.setColor(-65281);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o
        public void i(Canvas canvas, RecyclerView recyclerView, RecyclerView.z zVar) {
            super.i(canvas, recyclerView, zVar);
            this.a.setStrokeWidth(recyclerView.getResources().getDimension(YC0.g));
            for (a.c cVar : this.b) {
                this.a.setColor(AbstractC6338ln.e(-65281, -16776961, cVar.c));
                canvas.drawLine(cVar.b, ((CarouselLayoutManager) recyclerView.getLayoutManager()).k2(), cVar.b, ((CarouselLayoutManager) recyclerView.getLayoutManager()).h2(), this.a);
            }
        }

        public void j(List list) {
            this.b = DesugarCollections.unmodifiableList(list);
        }
    }

    public static class d {
        public final a.c a;
        public final a.c b;

        public d(a.c cVar, a.c cVar2) {
            AbstractC8621ty0.a(cVar.a <= cVar2.a);
            this.a = cVar;
            this.b = cVar2;
        }
    }

    public CarouselLayoutManager() {
        v2(new com.google.android.material.carousel.c());
    }

    public static int c2(int i, int i2, int i3, int i4) {
        int i5 = i2 + i;
        return i5 < i3 ? i3 - i2 : i5 > i4 ? i4 - i2 : i;
    }

    public static d m2(List list, float f, boolean z) {
        float f2 = Float.MAX_VALUE;
        float f3 = Float.MAX_VALUE;
        float f4 = Float.MAX_VALUE;
        float f5 = -3.4028235E38f;
        int i = -1;
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        for (int i5 = 0; i5 < list.size(); i5++) {
            a.c cVar = (a.c) list.get(i5);
            float f6 = z ? cVar.b : cVar.a;
            float fAbs = Math.abs(f6 - f);
            if (f6 <= f && fAbs <= f2) {
                i = i5;
                f2 = fAbs;
            }
            if (f6 > f && fAbs <= f3) {
                i3 = i5;
                f3 = fAbs;
            }
            if (f6 <= f4) {
                i2 = i5;
                f4 = f6;
            }
            if (f6 > f5) {
                i4 = i5;
                f5 = f6;
            }
        }
        if (i == -1) {
            i = i2;
        }
        if (i3 == -1) {
            i3 = i4;
        }
        return new d((a.c) list.get(i), (a.c) list.get(i3));
    }

    private int u2(int i, RecyclerView.v vVar, RecyclerView.z zVar) {
        if (K() == 0 || i == 0) {
            return 0;
        }
        int iC2 = c2(i, this.s, this.t, this.u);
        this.s += iC2;
        x2();
        float fD = this.z.d() / 2.0f;
        int iA2 = a2(k0(J(0)));
        Rect rect = new Rect();
        for (int i2 = 0; i2 < K(); i2++) {
            s2(J(i2), iA2, fD, rect);
            iA2 = V1(iA2, (int) this.z.d());
        }
        e2(vVar, zVar);
        return iC2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void A1(int i) {
        com.google.android.material.carousel.b bVar = this.y;
        if (bVar == null) {
            return;
        }
        this.s = l2(bVar.f(), i);
        this.A = AbstractC9105vh0.b(i, 0, Math.max(0, Z() - 1));
        x2();
        w1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void D0(View view, int i, int i2) {
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q E() {
        return new RecyclerView.q(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void L1(RecyclerView recyclerView, RecyclerView.z zVar, int i) {
        a aVar = new a(recyclerView.getContext());
        aVar.p(i);
        M1(aVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void N0(AccessibilityEvent accessibilityEvent) {
        super.N0(accessibilityEvent);
        if (K() > 0) {
            accessibilityEvent.setFromIndex(k0(J(0)));
            accessibilityEvent.setToIndex(k0(J(K() - 1)));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void Q(View view, Rect rect) {
        super.Q(view, rect);
        float fCenterX = rect.centerX();
        float fWidth = (rect.width() - g2(fCenterX, m2(this.z.e(), fCenterX, true))) / 2.0f;
        rect.set((int) (rect.left + fWidth), rect.top, (int) (rect.right - fWidth), rect.bottom);
    }

    public final void U1(View view, int i, float f) {
        float fD = this.z.d() / 2.0f;
        f(view, i);
        C0(view, (int) (f - fD), k2(), (int) (f + fD), h2());
    }

    public final int V1(int i, int i2) {
        return n2() ? i - i2 : i + i2;
    }

    public final int W1(int i, int i2) {
        return n2() ? i + i2 : i - i2;
    }

    public final void X1(RecyclerView.v vVar, RecyclerView.z zVar, int i) {
        int iA2 = a2(i);
        while (i < zVar.b()) {
            b bVarR2 = r2(vVar, iA2, i);
            if (o2(bVarR2.b, bVarR2.c)) {
                return;
            }
            iA2 = V1(iA2, (int) this.z.d());
            if (!p2(bVarR2.b, bVarR2.c)) {
                U1(bVarR2.a, -1, bVarR2.b);
            }
            i++;
        }
    }

    public final void Y1(RecyclerView.v vVar, int i) {
        int iA2 = a2(i);
        while (i >= 0) {
            b bVarR2 = r2(vVar, iA2, i);
            if (p2(bVarR2.b, bVarR2.c)) {
                return;
            }
            iA2 = W1(iA2, (int) this.z.d());
            if (!o2(bVarR2.b, bVarR2.c)) {
                U1(bVarR2.a, 0, bVarR2.b);
            }
            i--;
        }
    }

    public final float Z1(View view, float f, d dVar) {
        a.c cVar = dVar.a;
        float f2 = cVar.b;
        a.c cVar2 = dVar.b;
        float fB = AbstractC6991o7.b(f2, cVar2.b, cVar.a, cVar2.a, f);
        if (dVar.b != this.z.c() && dVar.a != this.z.h()) {
            return fB;
        }
        RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
        float fD = (((ViewGroup.MarginLayoutParams) qVar).rightMargin + ((ViewGroup.MarginLayoutParams) qVar).leftMargin) / this.z.d();
        a.c cVar3 = dVar.b;
        return fB + ((f - cVar3.a) * ((1.0f - cVar3.c) + fD));
    }

    @Override // com.daaw.InterfaceC1276Jj
    public int a() {
        return r0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void a1(RecyclerView.v vVar, RecyclerView.z zVar) {
        if (zVar.b() <= 0) {
            n1(vVar);
            this.A = 0;
            return;
        }
        boolean zN2 = n2();
        boolean z = this.y == null;
        if (z) {
            View viewO = vVar.o(0);
            D0(viewO, 0, 0);
            com.google.android.material.carousel.a aVarB = this.x.b(this, viewO);
            if (zN2) {
                aVarB = com.google.android.material.carousel.a.j(aVarB);
            }
            this.y = com.google.android.material.carousel.b.e(this, aVarB);
        }
        int iD2 = d2(this.y);
        int iB2 = b2(zVar, this.y);
        int i = zN2 ? iB2 : iD2;
        this.t = i;
        if (zN2) {
            iB2 = iD2;
        }
        this.u = iB2;
        if (z) {
            this.s = iD2;
        } else {
            int i2 = this.s;
            this.s = i2 + c2(0, i2, i, iB2);
        }
        this.A = AbstractC9105vh0.b(this.A, 0, zVar.b());
        x2();
        x(vVar);
        e2(vVar, zVar);
    }

    public final int a2(int i) {
        return V1(j2() - this.s, (int) (this.z.d() * i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void b1(RecyclerView.z zVar) {
        super.b1(zVar);
        if (K() == 0) {
            this.A = 0;
        } else {
            this.A = k0(J(0));
        }
        y2();
    }

    public final int b2(RecyclerView.z zVar, com.google.android.material.carousel.b bVar) {
        boolean zN2 = n2();
        com.google.android.material.carousel.a aVarG = zN2 ? bVar.g() : bVar.h();
        a.c cVarA = zN2 ? aVarG.a() : aVarG.f();
        float fB = (((zVar.b() - 1) * aVarG.d()) + f0()) * (zN2 ? -1.0f : 1.0f);
        float fJ2 = cVarA.a - j2();
        float fI2 = i2() - cVarA.a;
        if (Math.abs(fJ2) > Math.abs(fB)) {
            return 0;
        }
        return (int) ((fB - fJ2) + fI2);
    }

    public final int d2(com.google.android.material.carousel.b bVar) {
        boolean zN2 = n2();
        com.google.android.material.carousel.a aVarH = zN2 ? bVar.h() : bVar.g();
        return (int) (((i0() * (zN2 ? 1 : -1)) + j2()) - W1((int) (zN2 ? aVarH.f() : aVarH.a()).a, (int) (aVarH.d() / 2.0f)));
    }

    public final void e2(RecyclerView.v vVar, RecyclerView.z zVar) {
        t2(vVar);
        if (K() == 0) {
            Y1(vVar, this.A - 1);
            X1(vVar, zVar, this.A);
        } else {
            int iK0 = k0(J(0));
            int iK02 = k0(J(K() - 1));
            Y1(vVar, iK0 - 1);
            X1(vVar, zVar, iK02 + 1);
        }
        y2();
    }

    public final float f2(View view) {
        super.Q(view, new Rect());
        return r0.centerX();
    }

    public final float g2(float f, d dVar) {
        a.c cVar = dVar.a;
        float f2 = cVar.d;
        a.c cVar2 = dVar.b;
        return AbstractC6991o7.b(f2, cVar2.d, cVar.b, cVar2.b, f);
    }

    public final int h2() {
        return X() - e0();
    }

    public final int i2() {
        if (n2()) {
            return 0;
        }
        return r0();
    }

    public final int j2() {
        if (n2()) {
            return r0();
        }
        return 0;
    }

    public final int k2() {
        return j0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean l() {
        return true;
    }

    public final int l2(com.google.android.material.carousel.a aVar, int i) {
        return n2() ? (int) (((a() - aVar.f().a) - (i * aVar.d())) - (aVar.d() / 2.0f)) : (int) (((i * aVar.d()) - aVar.a().a) + (aVar.d() / 2.0f));
    }

    public final boolean n2() {
        return a0() == 1;
    }

    public final boolean o2(float f, d dVar) {
        int iW1 = W1((int) f, (int) (g2(f, dVar) / 2.0f));
        return n2() ? iW1 < 0 : iW1 > a();
    }

    public final boolean p2(float f, d dVar) {
        int iV1 = V1((int) f, (int) (g2(f, dVar) / 2.0f));
        return n2() ? iV1 > a() : iV1 < 0;
    }

    public final void q2() {
        if (this.v && Log.isLoggable("CarouselLayoutManager", 3)) {
            for (int i = 0; i < K(); i++) {
                View viewJ = J(i);
                f2(viewJ);
                k0(viewJ);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int r(RecyclerView.z zVar) {
        return (int) this.y.f().d();
    }

    public final b r2(RecyclerView.v vVar, float f, int i) {
        float fD = this.z.d() / 2.0f;
        View viewO = vVar.o(i);
        D0(viewO, 0, 0);
        float fV1 = V1((int) f, (int) fD);
        d dVarM2 = m2(this.z.e(), fV1, false);
        float fZ1 = Z1(viewO, fV1, dVarM2);
        w2(viewO, fV1, dVarM2);
        return new b(viewO, fZ1, dVarM2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int s(RecyclerView.z zVar) {
        return this.s;
    }

    public final void s2(View view, float f, float f2, Rect rect) {
        float fV1 = V1((int) f, (int) f2);
        d dVarM2 = m2(this.z.e(), fV1, false);
        float fZ1 = Z1(view, fV1, dVarM2);
        w2(view, fV1, dVarM2);
        super.Q(view, rect);
        view.offsetLeftAndRight((int) (fZ1 - (rect.left + f2)));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int t(RecyclerView.z zVar) {
        return this.u - this.t;
    }

    public final void t2(RecyclerView.v vVar) {
        while (K() > 0) {
            View viewJ = J(0);
            float fF2 = f2(viewJ);
            if (!p2(fF2, m2(this.z.e(), fF2, true))) {
                break;
            } else {
                p1(viewJ, vVar);
            }
        }
        while (K() - 1 >= 0) {
            View viewJ2 = J(K() - 1);
            float fF22 = f2(viewJ2);
            if (!o2(fF22, m2(this.z.e(), fF22, true))) {
                return;
            } else {
                p1(viewJ2, vVar);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean v1(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
        com.google.android.material.carousel.b bVar = this.y;
        if (bVar == null) {
            return false;
        }
        int iL2 = l2(bVar.f(), k0(view)) - this.s;
        if (z2 || iL2 == 0) {
            return false;
        }
        recyclerView.scrollBy(iL2, 0);
        return true;
    }

    public void v2(AbstractC1380Kj abstractC1380Kj) {
        this.x = abstractC1380Kj;
        this.y = null;
        w1();
    }

    public final void w2(View view, float f, d dVar) {
    }

    public final void x2() {
        int i = this.u;
        int i2 = this.t;
        if (i <= i2) {
            this.z = n2() ? this.y.h() : this.y.g();
        } else {
            this.z = this.y.i(this.s, i2, i);
        }
        this.w.j(this.z.e());
    }

    public final void y2() {
        if (!this.v || K() < 1) {
            return;
        }
        int i = 0;
        while (i < K() - 1) {
            int iK0 = k0(J(i));
            int i2 = i + 1;
            int iK02 = k0(J(i2));
            if (iK0 > iK02) {
                q2();
                throw new IllegalStateException("Detected invalid child order. Child at index [" + i + "] had adapter position [" + iK0 + "] and child at index [" + i2 + "] had adapter position [" + iK02 + "].");
            }
            i = i2;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int z1(int i, RecyclerView.v vVar, RecyclerView.z zVar) {
        if (l()) {
            return u2(i, vVar, zVar);
        }
        return 0;
    }
}
