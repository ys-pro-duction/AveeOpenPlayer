package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public abstract class l {
    public static int a(RecyclerView.z zVar, i iVar, View view, View view2, RecyclerView.p pVar, boolean z) {
        if (pVar.K() == 0 || zVar.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(pVar.k0(view) - pVar.k0(view2)) + 1;
        }
        return Math.min(iVar.n(), iVar.d(view2) - iVar.g(view));
    }

    public static int b(RecyclerView.z zVar, i iVar, View view, View view2, RecyclerView.p pVar, boolean z, boolean z2) {
        if (pVar.K() == 0 || zVar.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int iMax = z2 ? Math.max(0, (zVar.b() - Math.max(pVar.k0(view), pVar.k0(view2))) - 1) : Math.max(0, Math.min(pVar.k0(view), pVar.k0(view2)));
        if (z) {
            return Math.round((iMax * (Math.abs(iVar.d(view2) - iVar.g(view)) / (Math.abs(pVar.k0(view) - pVar.k0(view2)) + 1))) + (iVar.m() - iVar.g(view)));
        }
        return iMax;
    }

    public static int c(RecyclerView.z zVar, i iVar, View view, View view2, RecyclerView.p pVar, boolean z) {
        if (pVar.K() == 0 || zVar.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return zVar.b();
        }
        return (int) (((iVar.d(view2) - iVar.g(view)) / (Math.abs(pVar.k0(view) - pVar.k0(view2)) + 1)) * zVar.b());
    }
}
