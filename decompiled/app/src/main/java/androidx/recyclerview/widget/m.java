package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public abstract class m extends RecyclerView.m {
    public boolean g = true;

    public final void A(RecyclerView.D d) {
        I(d);
        h(d);
    }

    public final void B(RecyclerView.D d) {
        J(d);
    }

    public final void C(RecyclerView.D d, boolean z) {
        K(d, z);
        h(d);
    }

    public final void D(RecyclerView.D d, boolean z) {
        L(d, z);
    }

    public final void E(RecyclerView.D d) {
        M(d);
        h(d);
    }

    public final void F(RecyclerView.D d) {
        N(d);
    }

    public final void G(RecyclerView.D d) {
        O(d);
        h(d);
    }

    public final void H(RecyclerView.D d) {
        P(d);
    }

    public void I(RecyclerView.D d) {
    }

    public void J(RecyclerView.D d) {
    }

    public void K(RecyclerView.D d, boolean z) {
    }

    public void L(RecyclerView.D d, boolean z) {
    }

    public void M(RecyclerView.D d) {
    }

    public void N(RecyclerView.D d) {
    }

    public void O(RecyclerView.D d) {
    }

    public void P(RecyclerView.D d) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean a(RecyclerView.D d, RecyclerView.m.b bVar, RecyclerView.m.b bVar2) {
        int i;
        int i2;
        return (bVar == null || ((i = bVar.a) == (i2 = bVar2.a) && bVar.b == bVar2.b)) ? w(d) : y(d, i, bVar.b, i2, bVar2.b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean b(RecyclerView.D d, RecyclerView.D d2, RecyclerView.m.b bVar, RecyclerView.m.b bVar2) {
        int i;
        int i2;
        int i3 = bVar.a;
        int i4 = bVar.b;
        if (d2.N()) {
            int i5 = bVar.a;
            i2 = bVar.b;
            i = i5;
        } else {
            i = bVar2.a;
            i2 = bVar2.b;
        }
        return x(d, d2, i3, i4, i, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean c(RecyclerView.D d, RecyclerView.m.b bVar, RecyclerView.m.b bVar2) {
        int i = bVar.a;
        int i2 = bVar.b;
        View view = d.a;
        int left = bVar2 == null ? view.getLeft() : bVar2.a;
        int top = bVar2 == null ? view.getTop() : bVar2.b;
        if (d.z() || (i == left && i2 == top)) {
            return z(d);
        }
        view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
        return y(d, i, i2, left, top);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean d(RecyclerView.D d, RecyclerView.m.b bVar, RecyclerView.m.b bVar2) {
        int i = bVar.a;
        int i2 = bVar2.a;
        if (i != i2 || bVar.b != bVar2.b) {
            return y(d, i, bVar.b, i2, bVar2.b);
        }
        E(d);
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean f(RecyclerView.D d) {
        return !this.g || d.x();
    }

    public abstract boolean w(RecyclerView.D d);

    public abstract boolean x(RecyclerView.D d, RecyclerView.D d2, int i, int i2, int i3, int i4);

    public abstract boolean y(RecyclerView.D d, int i, int i2, int i3, int i4);

    public abstract boolean z(RecyclerView.D d);
}
