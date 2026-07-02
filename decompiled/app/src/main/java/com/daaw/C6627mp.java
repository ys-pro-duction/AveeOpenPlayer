package com.daaw;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.daaw.C1773Od1;
import java.lang.ref.WeakReference;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.mp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C6627mp implements C1773Od1.a {
    public WeakReference a = new WeakReference(null);
    public b[] b;
    public C1773Od1.a[] c;
    public NW[] d;
    public GW[] e;

    /* JADX INFO: renamed from: com.daaw.mp$a */
    public class a implements GW {
        public int a;

        public a(int i) {
            this.a = i;
        }

        @Override // com.daaw.GW
        public void a() {
            GW gwB = C6627mp.this.b();
            if (gwB != null) {
                gwB.a();
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.mp$b */
    public static class b {
        public final int a;

        public b(int i) {
            this.a = i;
        }

        public int a() {
            return this.a;
        }
    }

    public C6627mp(b[] bVarArr, C1773Od1.a[] aVarArr, NW[] nwArr) {
        this.d = nwArr;
        this.b = bVarArr;
        this.c = aVarArr;
        this.e = new GW[aVarArr.length];
        for (int i = 0; i < aVarArr.length; i++) {
            this.e[i] = new a(i);
            aVarArr[i].f(this.e[i]);
        }
    }

    @Override // com.daaw.C1773Od1.a
    public int a() {
        int iA = 0;
        for (int i = 0; i < this.c.length; i++) {
            iA = this.d[i].z() ? iA + this.c[i].a() + 1 : iA + 1;
        }
        return iA;
    }

    public GW b() {
        return (GW) this.a.get();
    }

    public B61 c(int i) {
        int i2 = 0;
        int iA = 0;
        int i3 = 0;
        while (i2 < this.c.length) {
            iA = this.d[i2].z() ? iA + this.c[i2].a() + 1 : iA + 1;
            if (i < iA) {
                return new B61(Integer.valueOf((i - i3) - 1), Integer.valueOf(i2));
            }
            i2++;
            i3 = iA;
        }
        return new B61(-1, -1);
    }

    @Override // com.daaw.C1773Od1.a
    public void f(GW gw) {
        this.a = new WeakReference(gw);
    }

    @Override // com.daaw.C1773Od1.a
    public long getItemId(int i) {
        B61 b61C = c(i);
        if (((Integer) b61C.a).intValue() < 0) {
            return -1L;
        }
        return this.c[((Integer) b61C.b).intValue()].getItemId(((Integer) b61C.a).intValue());
    }

    @Override // com.daaw.C1773Od1.a
    public int getItemViewType(int i) {
        B61 b61C = c(i);
        return ((Integer) b61C.a).intValue() < 0 ? this.b[((Integer) b61C.b).intValue()].a() : this.c[((Integer) b61C.b).intValue()].getItemViewType(((Integer) b61C.a).intValue());
    }

    @Override // com.daaw.C1773Od1.a
    public void i(int i, int i2, List list) {
        B61 b61C = c(i);
        B61 b61C2 = c(i2);
        if (((Integer) b61C.b).equals(b61C.a)) {
            this.c[((Integer) b61C2.b).intValue()].i(((Integer) b61C.a).intValue(), ((Integer) b61C2.a).intValue(), list);
        } else {
            AbstractC0441Bk1.c("Assert posFrom.obj2 != posFrom.obj1");
            this.c[((Integer) b61C2.b).intValue()].i(((Integer) b61C.a).intValue(), -1, list);
        }
    }

    @Override // com.daaw.C1773Od1.a
    public void j() {
        for (C1773Od1.a aVar : this.c) {
            aVar.j();
        }
    }

    @Override // com.daaw.C1773Od1.a
    public RecyclerView.D r(ViewGroup viewGroup, int i) {
        return AbstractC5728je1.a(viewGroup.getContext(), viewGroup, i, this.d[0]);
    }

    @Override // com.daaw.C1773Od1.a
    public int t(int i) {
        return 0;
    }

    @Override // com.daaw.C1773Od1.a
    public void v(RecyclerView.D d, int i) {
        B61 b61C = c(i);
        if (((Integer) b61C.a).intValue() < 0) {
            ((AbstractC1464Le) d).Q(this.d[((Integer) b61C.b).intValue()], ((Integer) b61C.b).intValue());
        } else {
            this.c[((Integer) b61C.b).intValue()].v(d, ((Integer) b61C.a).intValue());
        }
    }
}
