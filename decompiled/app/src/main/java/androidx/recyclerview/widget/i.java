package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public abstract class i {
    public final RecyclerView.p a;
    public int b;
    public final Rect c;

    public class a extends i {
        public a(RecyclerView.p pVar) {
            super(pVar, null);
        }

        @Override // androidx.recyclerview.widget.i
        public int d(View view) {
            return this.a.U(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.q) view.getLayoutParams())).rightMargin;
        }

        @Override // androidx.recyclerview.widget.i
        public int e(View view) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            return this.a.T(view) + ((ViewGroup.MarginLayoutParams) qVar).leftMargin + ((ViewGroup.MarginLayoutParams) qVar).rightMargin;
        }

        @Override // androidx.recyclerview.widget.i
        public int f(View view) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            return this.a.S(view) + ((ViewGroup.MarginLayoutParams) qVar).topMargin + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.i
        public int g(View view) {
            return this.a.R(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.q) view.getLayoutParams())).leftMargin;
        }

        @Override // androidx.recyclerview.widget.i
        public int h() {
            return this.a.r0();
        }

        @Override // androidx.recyclerview.widget.i
        public int i() {
            return this.a.r0() - this.a.h0();
        }

        @Override // androidx.recyclerview.widget.i
        public int j() {
            return this.a.h0();
        }

        @Override // androidx.recyclerview.widget.i
        public int k() {
            return this.a.s0();
        }

        @Override // androidx.recyclerview.widget.i
        public int l() {
            return this.a.Y();
        }

        @Override // androidx.recyclerview.widget.i
        public int m() {
            return this.a.g0();
        }

        @Override // androidx.recyclerview.widget.i
        public int n() {
            return (this.a.r0() - this.a.g0()) - this.a.h0();
        }

        @Override // androidx.recyclerview.widget.i
        public int p(View view) {
            this.a.q0(view, true, this.c);
            return this.c.right;
        }

        @Override // androidx.recyclerview.widget.i
        public int q(View view) {
            this.a.q0(view, true, this.c);
            return this.c.left;
        }

        @Override // androidx.recyclerview.widget.i
        public void r(int i) {
            this.a.F0(i);
        }
    }

    public class b extends i {
        public b(RecyclerView.p pVar) {
            super(pVar, null);
        }

        @Override // androidx.recyclerview.widget.i
        public int d(View view) {
            return this.a.P(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.q) view.getLayoutParams())).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.i
        public int e(View view) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            return this.a.S(view) + ((ViewGroup.MarginLayoutParams) qVar).topMargin + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.i
        public int f(View view) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            return this.a.T(view) + ((ViewGroup.MarginLayoutParams) qVar).leftMargin + ((ViewGroup.MarginLayoutParams) qVar).rightMargin;
        }

        @Override // androidx.recyclerview.widget.i
        public int g(View view) {
            return this.a.V(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.q) view.getLayoutParams())).topMargin;
        }

        @Override // androidx.recyclerview.widget.i
        public int h() {
            return this.a.X();
        }

        @Override // androidx.recyclerview.widget.i
        public int i() {
            return this.a.X() - this.a.e0();
        }

        @Override // androidx.recyclerview.widget.i
        public int j() {
            return this.a.e0();
        }

        @Override // androidx.recyclerview.widget.i
        public int k() {
            return this.a.Y();
        }

        @Override // androidx.recyclerview.widget.i
        public int l() {
            return this.a.s0();
        }

        @Override // androidx.recyclerview.widget.i
        public int m() {
            return this.a.j0();
        }

        @Override // androidx.recyclerview.widget.i
        public int n() {
            return (this.a.X() - this.a.j0()) - this.a.e0();
        }

        @Override // androidx.recyclerview.widget.i
        public int p(View view) {
            this.a.q0(view, true, this.c);
            return this.c.bottom;
        }

        @Override // androidx.recyclerview.widget.i
        public int q(View view) {
            this.a.q0(view, true, this.c);
            return this.c.top;
        }

        @Override // androidx.recyclerview.widget.i
        public void r(int i) {
            this.a.G0(i);
        }
    }

    public /* synthetic */ i(RecyclerView.p pVar, a aVar) {
        this(pVar);
    }

    public static i a(RecyclerView.p pVar) {
        return new a(pVar);
    }

    public static i b(RecyclerView.p pVar, int i) {
        if (i == 0) {
            return a(pVar);
        }
        if (i == 1) {
            return c(pVar);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public static i c(RecyclerView.p pVar) {
        return new b(pVar);
    }

    public abstract int d(View view);

    public abstract int e(View view);

    public abstract int f(View view);

    public abstract int g(View view);

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public abstract int m();

    public abstract int n();

    public int o() {
        if (Integer.MIN_VALUE == this.b) {
            return 0;
        }
        return n() - this.b;
    }

    public abstract int p(View view);

    public abstract int q(View view);

    public abstract void r(int i);

    public void s() {
        this.b = n();
    }

    public i(RecyclerView.p pVar) {
        this.b = Integer.MIN_VALUE;
        this.c = new Rect();
        this.a = pVar;
    }
}
