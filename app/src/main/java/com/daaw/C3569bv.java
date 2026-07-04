package com.daaw;

import android.content.Context;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.daaw.C3290av;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.bv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C3569bv extends RecyclerView.h {
    public final Context d;
    public int f;
    public C3290av g;
    public C3290av.d j;
    public final KQ k;
    public boolean e = true;
    public SparseArray h = new SparseArray();
    public int i = -1;

    /* JADX INFO: renamed from: com.daaw.bv$a */
    public class a extends RecyclerView.j {
        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void a() {
            C3569bv c3569bv = C3569bv.this;
            c3569bv.e = c3569bv.g.f() > 0;
            C3569bv.this.k();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void b(int i, int i2) {
            C3569bv c3569bv = C3569bv.this;
            c3569bv.e = c3569bv.g.f() > 0;
            C3569bv.this.m(i, i2);
        }
    }

    /* JADX INFO: renamed from: com.daaw.bv$b */
    public class b implements View.OnClickListener {
        public final /* synthetic */ C3847cv B;

        public b(C3847cv c3847cv) {
            this.B = c3847cv;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C3569bv.this.j.a(this.B.m(), this.B.a);
        }
    }

    /* JADX INFO: renamed from: com.daaw.bv$c */
    public class c implements View.OnClickListener {
        public final /* synthetic */ C3847cv B;

        public c(C3847cv c3847cv) {
            this.B = c3847cv;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C3569bv.this.j.a(this.B.m(), this.B.a);
        }
    }

    /* JADX INFO: renamed from: com.daaw.bv$d */
    public static class d {
        public int a;
        public int b;
        public CharSequence c;

        public d(int i, CharSequence charSequence) {
            this.a = i;
            this.c = charSequence;
        }
    }

    public C3569bv(Context context, int i, int i2, C3290av c3290av, KQ kq) {
        this.f = i;
        this.g = c3290av;
        this.d = context;
        this.k = kq;
        c3290av.w(new a());
    }

    public final void C(int i, View view) {
        if (view != null) {
            view.setSelected(true);
        } else {
            int i2 = this.i;
            if (i2 >= 0) {
                l(i2);
            }
        }
        this.i = i;
        if (i >= 0) {
            l(i);
        }
    }

    public void D(int i, B61 b61) {
        this.g.F(F(i), b61);
        l(i);
    }

    public boolean E(int i) {
        return this.h.get(i) != null;
    }

    public int F(int i) {
        if (E(i)) {
            return -1;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.h.size() && ((d) this.h.valueAt(i3)).b <= i; i3++) {
            i2--;
        }
        return i + i2;
    }

    public void G(C3290av.d dVar) {
        this.j = dVar;
    }

    public void H(List list) {
        this.h.clear();
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            d dVar = (d) it.next();
            int i2 = dVar.a + i;
            dVar.b = i2;
            this.h.append(i2, dVar);
            i++;
        }
        k();
    }

    public void I(int i) {
        J(i, null);
    }

    public void J(int i, View view) {
        if (E(i)) {
            this.g.I(-1, null);
            C(i, view);
        } else {
            C(-1, null);
            this.g.I(i, view);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int f() {
        return this.g.f() + this.h.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public long g(int i) {
        return E(i) ? Integer.MAX_VALUE - this.h.indexOfKey(i) : this.g.g(F(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int h(int i) {
        if (E(i)) {
            return 0;
        }
        return this.g.h(F(i)) + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void o(RecyclerView.D d2, int i) {
        if (!E(i)) {
            this.g.o((C3847cv) d2, F(i));
            return;
        }
        C3847cv c3847cv = (C3847cv) d2;
        c3847cv.R();
        c3847cv.v.setText(((d) this.h.get(i)).c);
        c3847cv.T("");
        c3847cv.y.setVisibility(((Boolean) this.k.a()).booleanValue() ? 8 : 0);
        c3847cv.a.setOnClickListener(new b(c3847cv));
        c3847cv.x.setOnClickListener(new c(c3847cv));
        c3847cv.a.setSelected(c3847cv.z == this.i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public RecyclerView.D q(ViewGroup viewGroup, int i) {
        return i == 0 ? new C3847cv(LayoutInflater.from(this.d).inflate(this.f, viewGroup, false)) : this.g.q(viewGroup, i - 1);
    }
}
