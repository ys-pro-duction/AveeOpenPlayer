package com.daaw;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.Od1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1773Od1 extends RecyclerView.h implements GW {
    public a d;
    public NW e;

    /* JADX INFO: renamed from: com.daaw.Od1$a */
    public interface a {
        int a();

        void f(GW gw);

        long getItemId(int i);

        int getItemViewType(int i);

        void i(int i, int i2, List list);

        void j();

        RecyclerView.D r(ViewGroup viewGroup, int i);

        int t(int i);

        void v(RecyclerView.D d, int i);
    }

    public C1773Od1(a aVar, NW nw) {
        this.e = nw;
        x(false);
        this.d = aVar;
        aVar.f(this);
    }

    public void A() {
        this.d.j();
    }

    public NW B() {
        return this.e;
    }

    public void C(int i, int i2, List list) {
        this.d.i(i, i2, list);
    }

    @Override // com.daaw.GW
    public void a() {
        k();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int f() {
        return this.d.a();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public long g(int i) {
        return this.d.getItemId(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int h(int i) {
        return this.d.getItemViewType(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void o(RecyclerView.D d, int i) {
        this.d.v(d, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public RecyclerView.D q(ViewGroup viewGroup, int i) {
        return this.d.r(viewGroup, i);
    }

    public int z(int i) {
        return this.d.t(i);
    }
}
