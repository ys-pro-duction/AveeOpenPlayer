package com.daaw;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class SP {
    public final FragmentManager a;
    public final CopyOnWriteArrayList b;

    public SP(FragmentManager fragmentManager) {
        G10.g(fragmentManager, "fragmentManager");
        this.a = fragmentManager;
        this.b = new CopyOnWriteArrayList();
    }

    public final void a(androidx.fragment.app.c cVar, Bundle bundle, boolean z) {
        G10.g(cVar, "f");
        androidx.fragment.app.c cVarZ0 = this.a.z0();
        if (cVarZ0 != null) {
            FragmentManager fragmentManagerI = cVarZ0.I();
            G10.f(fragmentManagerI, "parent.getParentFragmentManager()");
            fragmentManagerI.y0().a(cVar, bundle, true);
        }
        Iterator it = this.b.iterator();
        if (it.hasNext()) {
            AbstractC6314li0.a(it.next());
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public final void b(androidx.fragment.app.c cVar, boolean z) {
        G10.g(cVar, "f");
        this.a.w0().r();
        androidx.fragment.app.c cVarZ0 = this.a.z0();
        if (cVarZ0 != null) {
            FragmentManager fragmentManagerI = cVarZ0.I();
            G10.f(fragmentManagerI, "parent.getParentFragmentManager()");
            fragmentManagerI.y0().b(cVar, true);
        }
        Iterator it = this.b.iterator();
        if (it.hasNext()) {
            AbstractC6314li0.a(it.next());
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public final void c(androidx.fragment.app.c cVar, Bundle bundle, boolean z) {
        G10.g(cVar, "f");
        androidx.fragment.app.c cVarZ0 = this.a.z0();
        if (cVarZ0 != null) {
            FragmentManager fragmentManagerI = cVarZ0.I();
            G10.f(fragmentManagerI, "parent.getParentFragmentManager()");
            fragmentManagerI.y0().c(cVar, bundle, true);
        }
        Iterator it = this.b.iterator();
        if (it.hasNext()) {
            AbstractC6314li0.a(it.next());
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public final void d(androidx.fragment.app.c cVar, boolean z) {
        G10.g(cVar, "f");
        androidx.fragment.app.c cVarZ0 = this.a.z0();
        if (cVarZ0 != null) {
            FragmentManager fragmentManagerI = cVarZ0.I();
            G10.f(fragmentManagerI, "parent.getParentFragmentManager()");
            fragmentManagerI.y0().d(cVar, true);
        }
        Iterator it = this.b.iterator();
        if (it.hasNext()) {
            AbstractC6314li0.a(it.next());
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public final void e(androidx.fragment.app.c cVar, boolean z) {
        G10.g(cVar, "f");
        androidx.fragment.app.c cVarZ0 = this.a.z0();
        if (cVarZ0 != null) {
            FragmentManager fragmentManagerI = cVarZ0.I();
            G10.f(fragmentManagerI, "parent.getParentFragmentManager()");
            fragmentManagerI.y0().e(cVar, true);
        }
        Iterator it = this.b.iterator();
        if (it.hasNext()) {
            AbstractC6314li0.a(it.next());
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public final void f(androidx.fragment.app.c cVar, boolean z) {
        G10.g(cVar, "f");
        androidx.fragment.app.c cVarZ0 = this.a.z0();
        if (cVarZ0 != null) {
            FragmentManager fragmentManagerI = cVarZ0.I();
            G10.f(fragmentManagerI, "parent.getParentFragmentManager()");
            fragmentManagerI.y0().f(cVar, true);
        }
        Iterator it = this.b.iterator();
        if (it.hasNext()) {
            AbstractC6314li0.a(it.next());
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public final void g(androidx.fragment.app.c cVar, boolean z) {
        G10.g(cVar, "f");
        this.a.w0().r();
        androidx.fragment.app.c cVarZ0 = this.a.z0();
        if (cVarZ0 != null) {
            FragmentManager fragmentManagerI = cVarZ0.I();
            G10.f(fragmentManagerI, "parent.getParentFragmentManager()");
            fragmentManagerI.y0().g(cVar, true);
        }
        Iterator it = this.b.iterator();
        if (it.hasNext()) {
            AbstractC6314li0.a(it.next());
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public final void h(androidx.fragment.app.c cVar, Bundle bundle, boolean z) {
        G10.g(cVar, "f");
        androidx.fragment.app.c cVarZ0 = this.a.z0();
        if (cVarZ0 != null) {
            FragmentManager fragmentManagerI = cVarZ0.I();
            G10.f(fragmentManagerI, "parent.getParentFragmentManager()");
            fragmentManagerI.y0().h(cVar, bundle, true);
        }
        Iterator it = this.b.iterator();
        if (it.hasNext()) {
            AbstractC6314li0.a(it.next());
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public final void i(androidx.fragment.app.c cVar, boolean z) {
        G10.g(cVar, "f");
        androidx.fragment.app.c cVarZ0 = this.a.z0();
        if (cVarZ0 != null) {
            FragmentManager fragmentManagerI = cVarZ0.I();
            G10.f(fragmentManagerI, "parent.getParentFragmentManager()");
            fragmentManagerI.y0().i(cVar, true);
        }
        Iterator it = this.b.iterator();
        if (it.hasNext()) {
            AbstractC6314li0.a(it.next());
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public final void j(androidx.fragment.app.c cVar, Bundle bundle, boolean z) {
        G10.g(cVar, "f");
        G10.g(bundle, "outState");
        androidx.fragment.app.c cVarZ0 = this.a.z0();
        if (cVarZ0 != null) {
            FragmentManager fragmentManagerI = cVarZ0.I();
            G10.f(fragmentManagerI, "parent.getParentFragmentManager()");
            fragmentManagerI.y0().j(cVar, bundle, true);
        }
        Iterator it = this.b.iterator();
        if (it.hasNext()) {
            AbstractC6314li0.a(it.next());
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public final void k(androidx.fragment.app.c cVar, boolean z) {
        G10.g(cVar, "f");
        androidx.fragment.app.c cVarZ0 = this.a.z0();
        if (cVarZ0 != null) {
            FragmentManager fragmentManagerI = cVarZ0.I();
            G10.f(fragmentManagerI, "parent.getParentFragmentManager()");
            fragmentManagerI.y0().k(cVar, true);
        }
        Iterator it = this.b.iterator();
        if (it.hasNext()) {
            AbstractC6314li0.a(it.next());
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public final void l(androidx.fragment.app.c cVar, boolean z) {
        G10.g(cVar, "f");
        androidx.fragment.app.c cVarZ0 = this.a.z0();
        if (cVarZ0 != null) {
            FragmentManager fragmentManagerI = cVarZ0.I();
            G10.f(fragmentManagerI, "parent.getParentFragmentManager()");
            fragmentManagerI.y0().l(cVar, true);
        }
        Iterator it = this.b.iterator();
        if (it.hasNext()) {
            AbstractC6314li0.a(it.next());
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public final void m(androidx.fragment.app.c cVar, View view, Bundle bundle, boolean z) {
        G10.g(cVar, "f");
        G10.g(view, "v");
        androidx.fragment.app.c cVarZ0 = this.a.z0();
        if (cVarZ0 != null) {
            FragmentManager fragmentManagerI = cVarZ0.I();
            G10.f(fragmentManagerI, "parent.getParentFragmentManager()");
            fragmentManagerI.y0().m(cVar, view, bundle, true);
        }
        Iterator it = this.b.iterator();
        if (it.hasNext()) {
            AbstractC6314li0.a(it.next());
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public final void n(androidx.fragment.app.c cVar, boolean z) {
        G10.g(cVar, "f");
        androidx.fragment.app.c cVarZ0 = this.a.z0();
        if (cVarZ0 != null) {
            FragmentManager fragmentManagerI = cVarZ0.I();
            G10.f(fragmentManagerI, "parent.getParentFragmentManager()");
            fragmentManagerI.y0().n(cVar, true);
        }
        Iterator it = this.b.iterator();
        if (it.hasNext()) {
            AbstractC6314li0.a(it.next());
            if (!z) {
                throw null;
            }
            throw null;
        }
    }
}
