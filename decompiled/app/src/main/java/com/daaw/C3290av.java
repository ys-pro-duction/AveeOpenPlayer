package com.daaw;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.av, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C3290av extends RecyclerView.h {
    public final Context d;
    public List e;
    public c f;
    public d g;
    public ViewGroup h;
    public int i = -1;
    public boolean j = false;

    /* JADX INFO: renamed from: com.daaw.av$a */
    public class a implements View.OnClickListener {
        public final /* synthetic */ C3847cv B;

        public a(C3847cv c3847cv) {
            this.B = c3847cv;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C3290av.this.g.a(this.B.m(), this.B.a);
        }
    }

    /* JADX INFO: renamed from: com.daaw.av$b */
    public class b implements View.OnClickListener {
        public final /* synthetic */ C3847cv B;

        public b(C3847cv c3847cv) {
            this.B = c3847cv;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C3290av.this.g.a(this.B.m(), this.B.a);
        }
    }

    /* JADX INFO: renamed from: com.daaw.av$c */
    public interface c {
        void a(View view);
    }

    /* JADX INFO: renamed from: com.daaw.av$d */
    public interface d {
        boolean a(int i, View view);
    }

    public C3290av(Context context, List list, ViewGroup viewGroup) {
        this.d = context;
        if (list != null) {
            this.e = list;
        } else {
            this.e = new ArrayList();
        }
        this.h = viewGroup;
    }

    public boolean A() {
        return this.j;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public void o(C3847cv c3847cv, int i) {
        c3847cv.R();
        B61 b61 = (B61) this.e.get(i);
        c3847cv.v.setText((CharSequence) b61.a);
        c3847cv.T((CharSequence) b61.b);
        c3847cv.y.setVisibility(this.j ? 8 : 0);
        c3847cv.a.setOnClickListener(new a(c3847cv));
        c3847cv.x.setOnClickListener(new b(c3847cv));
        c3847cv.a.setSelected(c3847cv.z == this.i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public C3847cv q(ViewGroup viewGroup, int i) {
        return new C3847cv(LayoutInflater.from(this.d).inflate(AbstractC9815yD0.e, viewGroup, false), this.f, this.h);
    }

    public void D(List list) {
        this.e = list;
        k();
    }

    public void E(boolean z) {
        if (this.j == z) {
            return;
        }
        this.j = z;
        k();
    }

    public void F(int i, B61 b61) {
        if (i < 0 || i >= this.e.size()) {
            return;
        }
        this.e.set(i, b61);
    }

    public void G(c cVar) {
        this.f = cVar;
    }

    public void H(d dVar) {
        this.g = dVar;
    }

    public void I(int i, View view) {
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

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int f() {
        return this.e.size();
    }
}
