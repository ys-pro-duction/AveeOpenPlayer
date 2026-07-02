package com.daaw;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.daaw.C1773Od1;
import java.lang.ref.WeakReference;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class MU implements C1773Od1.a {
    public WeakReference a = new WeakReference(null);
    public C1773Od1.a b;
    public int c;
    public int d;
    public NW e;
    public GW f;

    public class a implements GW {
        public a() {
        }

        @Override // com.daaw.GW
        public void a() {
            GW gwB = MU.this.b();
            if (gwB != null) {
                gwB.a();
            }
        }
    }

    public MU(C1773Od1.a aVar, NW nw, int i, int i2) {
        this.e = nw;
        this.b = aVar;
        this.c = i;
        this.d = i2;
        a aVar2 = new a();
        this.f = aVar2;
        aVar.f(aVar2);
    }

    @Override // com.daaw.C1773Od1.a
    public int a() {
        return this.b.a() + 2;
    }

    public GW b() {
        return (GW) this.a.get();
    }

    @Override // com.daaw.C1773Od1.a
    public void f(GW gw) {
        this.a = new WeakReference(gw);
    }

    @Override // com.daaw.C1773Od1.a
    public long getItemId(int i) {
        if (i <= 0 || i >= this.b.a() + 1) {
            return -1L;
        }
        return this.b.getItemId(i - 1);
    }

    @Override // com.daaw.C1773Od1.a
    public int getItemViewType(int i) {
        return i == 0 ? this.c : i == this.b.a() + 1 ? this.d : this.b.getItemViewType(i - 1);
    }

    @Override // com.daaw.C1773Od1.a
    public void i(int i, int i2, List list) {
        this.b.i(i - 1, i2 - 1, list);
    }

    @Override // com.daaw.C1773Od1.a
    public void j() {
        this.b.j();
    }

    @Override // com.daaw.C1773Od1.a
    public RecyclerView.D r(ViewGroup viewGroup, int i) {
        return i == this.c ? AbstractC5728je1.a(viewGroup.getContext(), viewGroup, i, this.e) : i == this.d ? AbstractC5728je1.a(viewGroup.getContext(), viewGroup, i, this.e) : this.b.r(viewGroup, i);
    }

    @Override // com.daaw.C1773Od1.a
    public int t(int i) {
        return i + 1;
    }

    @Override // com.daaw.C1773Od1.a
    public void v(RecyclerView.D d, int i) {
        if (i <= 0 || i >= this.b.a() + 1) {
            ((AbstractC1464Le) d).Q(this.e, i);
        } else {
            this.b.v(d, i - 1);
        }
    }
}
