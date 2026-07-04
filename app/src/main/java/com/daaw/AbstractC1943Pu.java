package com.daaw;

import android.content.Context;
import android.database.Cursor;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.daaw.C1773Od1;
import java.lang.ref.WeakReference;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.Pu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1943Pu extends AbstractC9991yr implements C1773Od1.a {
    public WeakReference C;
    public Cursor D;

    public AbstractC1943Pu(Context context, String str, String str2, int i, int i2, WeakReference weakReference) {
        super(context, str, new C5159hc1(str2), i, i2, weakReference);
        this.C = new WeakReference(null);
    }

    @Override // com.daaw.AbstractC9991yr
    public boolean A() {
        GW gwT = T();
        if (gwT == null) {
            return false;
        }
        gwT.a();
        return false;
    }

    public abstract B61 P(Context context);

    public B61 Q(Context context, String str) {
        return P(context);
    }

    public int R(int i, String str) {
        this.D.moveToFirst();
        while (!this.D.isAfterLast()) {
            if (this.D.getString(i).equals(str)) {
                return this.D.getPosition();
            }
            this.D.moveToNext();
        }
        return -1;
    }

    public int S(String str, String str2) {
        return R(this.D.getColumnIndex(str), str2);
    }

    public GW T() {
        return (GW) this.C.get();
    }

    public Cursor U(int i) {
        this.D.moveToPosition(i);
        return this.D;
    }

    public void V(Context context) {
        B61 b61P = P(context);
        W((Cursor) b61P.a, (String) b61P.b);
    }

    public void W(Cursor cursor, String str) {
        if (B(str, true)) {
            return;
        }
        AbstractC2022Qi0.b(this.D);
        AbstractC6278lb.f(cursor);
        this.D = cursor;
        GW gwT = T();
        if (gwT != null) {
            gwT.a();
        }
    }

    @Override // com.daaw.AbstractC9991yr, com.daaw.NW, com.daaw.C1773Od1.a
    public int a() {
        return this.D.getCount();
    }

    @Override // com.daaw.C1773Od1.a
    public void f(GW gw) {
        this.C = new WeakReference(gw);
    }

    @Override // com.daaw.C1773Od1.a
    public long getItemId(int i) {
        return -1L;
    }

    @Override // com.daaw.NW
    public void o(Context context, String str) {
        B61 b61Q = Q(context, str);
        if (b61Q != null) {
            W((Cursor) b61Q.a, (String) b61Q.b);
        }
    }

    @Override // com.daaw.C1773Od1.a
    public RecyclerView.D r(ViewGroup viewGroup, int i) {
        return AbstractC5728je1.a(viewGroup.getContext(), viewGroup, i, this);
    }

    public AbstractC1943Pu(Context context, String str, String str2, int i, int i2) {
        super(context, str, new C5159hc1(str2), i, i2);
        this.C = new WeakReference(null);
    }

    @Override // com.daaw.C1773Od1.a
    public void j() {
    }

    @Override // com.daaw.C1773Od1.a
    public int t(int i) {
        return i;
    }

    @Override // com.daaw.C1773Od1.a
    public void i(int i, int i2, List list) {
    }
}
