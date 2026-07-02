package com.daaw;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.daaw.C1773Od1;
import java.lang.ref.WeakReference;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.jc0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5717jc0 extends AbstractC9991yr implements C1773Od1.a {
    public WeakReference C;
    public List D;
    public KQ E;
    public FQ F;

    public AbstractC5717jc0(Context context, FQ fq, KQ kq, String str, HX hx, int i, int i2) {
        super(context, str, hx, i, i2);
        this.C = new WeakReference(null);
        this.F = fq;
        this.E = kq;
        this.D = (List) fq.a(this);
    }

    @Override // com.daaw.AbstractC9991yr
    public boolean A() {
        if (B((String) Q(true).b, false)) {
            return true;
        }
        B61 b61Q = Q(false);
        List list = (List) b61Q.a;
        if (list == null) {
            T((List) this.E.a(), null);
        } else {
            T(list, (String) b61Q.b);
        }
        return true;
    }

    public GW P() {
        return (GW) this.C.get();
    }

    public B61 Q(boolean z) {
        List list;
        List list2;
        if (z || (list2 = (List) this.F.a(this)) == null) {
            list = null;
        } else {
            list = (List) this.E.a();
            list.addAll(list2);
        }
        return new B61(list, "");
    }

    public Object R(int i) {
        return this.D.get(i);
    }

    public List S() {
        return this.D;
    }

    public void T(List list, String str) {
        if (B(str, true)) {
            return;
        }
        AbstractC6278lb.f(list);
        this.D = list;
        GW gwP = P();
        if (gwP != null) {
            gwP.a();
        }
    }

    @Override // com.daaw.AbstractC9991yr, com.daaw.NW, com.daaw.C1773Od1.a
    public int a() {
        return this.D.size();
    }

    @Override // com.daaw.C1773Od1.a
    public void f(GW gw) {
        this.C = new WeakReference(gw);
    }

    @Override // com.daaw.C1773Od1.a
    public long getItemId(int i) {
        return i;
    }

    @Override // com.daaw.C1773Od1.a
    public RecyclerView.D r(ViewGroup viewGroup, int i) {
        return AbstractC5728je1.a(viewGroup.getContext(), viewGroup, i, this);
    }

    @Override // com.daaw.C1773Od1.a
    public void j() {
    }

    @Override // com.daaw.C1773Od1.a
    public int t(int i) {
        return i;
    }

    public void i(int i, int i2, List list) {
    }
}
