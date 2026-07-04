package com.daaw;

import android.app.Activity;
import android.app.Fragment;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class M2 {

    public static class b {
        public final List a;

        public b() {
            this.a = new ArrayList();
        }

        public synchronized void a(Runnable runnable) {
            this.a.add(runnable);
        }

        public void b() {
            for (Runnable runnable : this.a) {
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
    }

    public static class c extends Fragment {
        public b B = new b();

        @Override // android.app.Fragment
        public void onStop() {
            b bVar;
            super.onStop();
            synchronized (this.B) {
                bVar = this.B;
                this.B = new b();
            }
            bVar.b();
        }
    }

    public static class d extends androidx.fragment.app.c {
        public b G0 = new b();

        @Override // androidx.fragment.app.c
        public void P0() {
            b bVar;
            super.P0();
            synchronized (this.G0) {
                bVar = this.G0;
                this.G0 = new b();
            }
            bVar.b();
        }
    }

    public static /* synthetic */ void a(MP mp, Runnable runnable) {
        d dVar = (d) d(d.class, mp.f0().j0("FirestoreOnStopObserverSupportFragment"), "FirestoreOnStopObserverSupportFragment");
        if (dVar == null || dVar.i0()) {
            dVar = new d();
            mp.f0().o().d(dVar, "FirestoreOnStopObserverSupportFragment").g();
            mp.f0().f0();
        }
        dVar.G0.a(runnable);
    }

    public static /* synthetic */ void b(Activity activity, Runnable runnable) {
        c cVar = (c) d(c.class, activity.getFragmentManager().findFragmentByTag("FirestoreOnStopObserverFragment"), "FirestoreOnStopObserverFragment");
        if (cVar == null || cVar.isRemoving()) {
            cVar = new c();
            activity.getFragmentManager().beginTransaction().add(cVar, "FirestoreOnStopObserverFragment").commitAllowingStateLoss();
            activity.getFragmentManager().executePendingTransactions();
        }
        cVar.B.a(runnable);
    }

    public static InterfaceC9080vc0 c(Activity activity, final InterfaceC9080vc0 interfaceC9080vc0) {
        if (activity != null) {
            if (activity instanceof MP) {
                Objects.requireNonNull(interfaceC9080vc0);
                f((MP) activity, new Runnable() { // from class: com.daaw.J2
                    @Override // java.lang.Runnable
                    public final void run() {
                        interfaceC9080vc0.remove();
                    }
                });
                return interfaceC9080vc0;
            }
            Objects.requireNonNull(interfaceC9080vc0);
            e(activity, new Runnable() { // from class: com.daaw.J2
                @Override // java.lang.Runnable
                public final void run() {
                    interfaceC9080vc0.remove();
                }
            });
        }
        return interfaceC9080vc0;
    }

    public static Object d(Class cls, Object obj, String str) {
        if (obj == null) {
            return null;
        }
        try {
            return cls.cast(obj);
        } catch (ClassCastException unused) {
            throw new IllegalStateException("Fragment with tag '" + str + "' is a " + obj.getClass().getName() + " but should be a " + cls.getName());
        }
    }

    public static void e(final Activity activity, final Runnable runnable) {
        AbstractC6557mb.d(!(activity instanceof MP), "onActivityStopCallOnce must be called with a *non*-FragmentActivity Activity.", new Object[0]);
        activity.runOnUiThread(new Runnable() { // from class: com.daaw.L2
            @Override // java.lang.Runnable
            public final void run() {
                M2.b(activity, runnable);
            }
        });
    }

    public static void f(final MP mp, final Runnable runnable) {
        mp.runOnUiThread(new Runnable() { // from class: com.daaw.K2
            @Override // java.lang.Runnable
            public final void run() {
                M2.a(mp, runnable);
            }
        });
    }
}
