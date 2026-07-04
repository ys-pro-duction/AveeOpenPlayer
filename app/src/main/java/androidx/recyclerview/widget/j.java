package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public class j extends n {
    public i d;
    public i e;

    public class a extends g {
        public a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.g, androidx.recyclerview.widget.RecyclerView.y
        public void o(View view, RecyclerView.z zVar, RecyclerView.y.a aVar) {
            j jVar = j.this;
            int[] iArrC = jVar.c(jVar.a.getLayoutManager(), view);
            int i = iArrC[0];
            int i2 = iArrC[1];
            int iW = w(Math.max(Math.abs(i), Math.abs(i2)));
            if (iW > 0) {
                aVar.d(i, i2, iW, this.j);
            }
        }

        @Override // androidx.recyclerview.widget.g
        public float v(DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }

        @Override // androidx.recyclerview.widget.g
        public int x(int i) {
            return Math.min(100, super.x(i));
        }
    }

    @Override // androidx.recyclerview.widget.n
    public int[] c(RecyclerView.p pVar, View view) {
        int[] iArr = new int[2];
        if (pVar.l()) {
            iArr[0] = k(view, m(pVar));
        } else {
            iArr[0] = 0;
        }
        if (pVar.m()) {
            iArr[1] = k(view, o(pVar));
            return iArr;
        }
        iArr[1] = 0;
        return iArr;
    }

    @Override // androidx.recyclerview.widget.n
    public RecyclerView.y d(RecyclerView.p pVar) {
        if (pVar instanceof RecyclerView.y.b) {
            return new a(this.a.getContext());
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.n
    public View f(RecyclerView.p pVar) {
        if (pVar.m()) {
            return l(pVar, o(pVar));
        }
        if (pVar.l()) {
            return l(pVar, m(pVar));
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.n
    public int g(RecyclerView.p pVar, int i, int i2) {
        i iVarN;
        int iZ = pVar.Z();
        if (iZ == 0 || (iVarN = n(pVar)) == null) {
            return -1;
        }
        int iK = pVar.K();
        View view = null;
        View view2 = null;
        int i3 = Integer.MIN_VALUE;
        int i4 = Integer.MAX_VALUE;
        for (int i5 = 0; i5 < iK; i5++) {
            View viewJ = pVar.J(i5);
            if (viewJ != null) {
                int iK2 = k(viewJ, iVarN);
                if (iK2 <= 0 && iK2 > i3) {
                    view2 = viewJ;
                    i3 = iK2;
                }
                if (iK2 >= 0 && iK2 < i4) {
                    view = viewJ;
                    i4 = iK2;
                }
            }
        }
        boolean zP = p(pVar, i, i2);
        if (zP && view != null) {
            return pVar.k0(view);
        }
        if (!zP && view2 != null) {
            return pVar.k0(view2);
        }
        if (zP) {
            view = view2;
        }
        if (view == null) {
            return -1;
        }
        int iK0 = pVar.k0(view) + (q(pVar) == zP ? -1 : 1);
        if (iK0 < 0 || iK0 >= iZ) {
            return -1;
        }
        return iK0;
    }

    public final int k(View view, i iVar) {
        return (iVar.g(view) + (iVar.e(view) / 2)) - (iVar.m() + (iVar.n() / 2));
    }

    public final View l(RecyclerView.p pVar, i iVar) {
        int iK = pVar.K();
        View view = null;
        if (iK == 0) {
            return null;
        }
        int iM = iVar.m() + (iVar.n() / 2);
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < iK; i2++) {
            View viewJ = pVar.J(i2);
            int iAbs = Math.abs((iVar.g(viewJ) + (iVar.e(viewJ) / 2)) - iM);
            if (iAbs < i) {
                view = viewJ;
                i = iAbs;
            }
        }
        return view;
    }

    public final i m(RecyclerView.p pVar) {
        i iVar = this.e;
        if (iVar == null || iVar.a != pVar) {
            this.e = i.a(pVar);
        }
        return this.e;
    }

    public final i n(RecyclerView.p pVar) {
        if (pVar.m()) {
            return o(pVar);
        }
        if (pVar.l()) {
            return m(pVar);
        }
        return null;
    }

    public final i o(RecyclerView.p pVar) {
        i iVar = this.d;
        if (iVar == null || iVar.a != pVar) {
            this.d = i.c(pVar);
        }
        return this.d;
    }

    public final boolean p(RecyclerView.p pVar, int i, int i2) {
        return pVar.l() ? i > 0 : i2 > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean q(RecyclerView.p pVar) {
        PointF pointFB;
        int iZ = pVar.Z();
        if (!(pVar instanceof RecyclerView.y.b) || (pointFB = ((RecyclerView.y.b) pVar).b(iZ - 1)) == null) {
            return false;
        }
        return pointFB.x < 0.0f || pointFB.y < 0.0f;
    }
}
