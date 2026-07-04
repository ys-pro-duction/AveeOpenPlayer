package com.daaw;

import android.view.View;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.iQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5386iQ {
    public static final C5386iQ a;
    public static final AbstractC5945kQ b;
    public static final AbstractC5945kQ c;

    static {
        C5386iQ c5386iQ = new C5386iQ();
        a = c5386iQ;
        b = new C5666jQ();
        c = c5386iQ.b();
    }

    public static final void a(androidx.fragment.app.c cVar, androidx.fragment.app.c cVar2, boolean z, C2407Ua c2407Ua, boolean z2) {
        G10.g(cVar, "inFragment");
        G10.g(cVar2, "outFragment");
        G10.g(c2407Ua, "sharedElements");
        if (z) {
            cVar2.y();
        } else {
            cVar.y();
        }
    }

    public static final void c(C2407Ua c2407Ua, C2407Ua c2407Ua2) {
        G10.g(c2407Ua, "<this>");
        G10.g(c2407Ua2, "namedViews");
        int size = c2407Ua.size();
        while (true) {
            size--;
            if (-1 >= size) {
                return;
            }
            if (!c2407Ua2.containsKey((String) c2407Ua.n(size))) {
                c2407Ua.l(size);
            }
        }
    }

    public static final void d(List list, int i) {
        G10.g(list, "views");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setVisibility(i);
        }
    }

    public final AbstractC5945kQ b() {
        try {
            G10.e(C6233lQ.class, "null cannot be cast to non-null type java.lang.Class<androidx.fragment.app.FragmentTransitionImpl>");
            return (AbstractC5945kQ) C6233lQ.class.getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
