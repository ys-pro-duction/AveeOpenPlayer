package com.daaw;

import android.app.Activity;
import android.app.Dialog;
import android.app.LocaleManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.widget.Toolbar;
import com.daaw.AbstractC8081s2;
import com.daaw.Z8;
import j$.util.Objects;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public abstract class Z8 {
    public static c B = new c(new d());
    public static int C = -100;
    public static C5163hd0 D = null;
    public static C5163hd0 E = null;
    public static Boolean F = null;
    public static boolean G = false;
    public static final C2823Ya H = new C2823Ya();
    public static final Object I = new Object();
    public static final Object J = new Object();

    public static class a {
        public static LocaleList a(String str) {
            return LocaleList.forLanguageTags(str);
        }
    }

    public static class b {
        public static LocaleList a(Object obj) {
            return ((LocaleManager) obj).getApplicationLocales();
        }

        public static void b(Object obj, LocaleList localeList) {
            ((LocaleManager) obj).setApplicationLocales(localeList);
        }
    }

    public static class c implements Executor {
        public final Object B = new Object();
        public final Queue C = new ArrayDeque();
        public final Executor D;
        public Runnable E;

        public c(Executor executor) {
            this.D = executor;
        }

        public static /* synthetic */ void a(c cVar, Runnable runnable) {
            cVar.getClass();
            try {
                runnable.run();
            } finally {
                cVar.b();
            }
        }

        public void b() {
            synchronized (this.B) {
                try {
                    Runnable runnable = (Runnable) this.C.poll();
                    this.E = runnable;
                    if (runnable != null) {
                        this.D.execute(runnable);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // java.util.concurrent.Executor
        public void execute(final Runnable runnable) {
            synchronized (this.B) {
                try {
                    this.C.add(new Runnable() { // from class: com.daaw.a9
                        @Override // java.lang.Runnable
                        public final void run() {
                            Z8.c.a(this.B, runnable);
                        }
                    });
                    if (this.E == null) {
                        b();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static class d implements Executor {
        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            new Thread(runnable).start();
        }
    }

    public static void I(Z8 z8) {
        synchronized (I) {
            J(z8);
        }
    }

    public static void J(Z8 z8) {
        synchronized (I) {
            try {
                Iterator it = H.iterator();
                while (it.hasNext()) {
                    Z8 z82 = (Z8) ((WeakReference) it.next()).get();
                    if (z82 == z8 || z82 == null) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void L(C5163hd0 c5163hd0) {
        Objects.requireNonNull(c5163hd0);
        if (Build.VERSION.SDK_INT >= 33) {
            Object objS = s();
            if (objS != null) {
                b.b(objS, a.a(c5163hd0.h()));
                return;
            }
            return;
        }
        if (c5163hd0.equals(D)) {
            return;
        }
        synchronized (I) {
            D = c5163hd0;
            h();
        }
    }

    public static void U(Context context) {
        if (Build.VERSION.SDK_INT >= 33) {
            ComponentName componentName = new ComponentName(context, "androidx.appcompat.app.AppLocalesMetadataHolderService");
            if (context.getPackageManager().getComponentEnabledSetting(componentName) != 1) {
                if (o().f()) {
                    String strB = Y9.b(context);
                    Object systemService = context.getSystemService("locale");
                    if (systemService != null) {
                        b.b(systemService, a.a(strB));
                    }
                }
                context.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
            }
        }
    }

    public static void V(final Context context) {
        if (z(context)) {
            if (Build.VERSION.SDK_INT >= 33) {
                if (G) {
                    return;
                }
                B.execute(new Runnable() { // from class: com.daaw.X8
                    @Override // java.lang.Runnable
                    public final void run() {
                        Z8.c(context);
                    }
                });
                return;
            }
            synchronized (J) {
                try {
                    C5163hd0 c5163hd0 = D;
                    if (c5163hd0 == null) {
                        if (E == null) {
                            E = C5163hd0.c(Y9.b(context));
                        }
                        if (E.f()) {
                        } else {
                            D = E;
                        }
                    } else if (!c5163hd0.equals(E)) {
                        C5163hd0 c5163hd02 = D;
                        E = c5163hd02;
                        Y9.a(context, c5163hd02.h());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static /* synthetic */ void c(Context context) {
        U(context);
        G = true;
    }

    public static void e(Z8 z8) {
        synchronized (I) {
            J(z8);
            H.add(new WeakReference(z8));
        }
    }

    public static void h() {
        Iterator it = H.iterator();
        while (it.hasNext()) {
            Z8 z8 = (Z8) ((WeakReference) it.next()).get();
            if (z8 != null) {
                z8.g();
            }
        }
    }

    public static Z8 l(Activity activity, T8 t8) {
        return new LayoutInflaterFactory2C3356b9(activity, t8);
    }

    public static Z8 m(Dialog dialog, T8 t8) {
        return new LayoutInflaterFactory2C3356b9(dialog, t8);
    }

    public static C5163hd0 o() {
        if (Build.VERSION.SDK_INT >= 33) {
            Object objS = s();
            if (objS != null) {
                return C5163hd0.j(b.a(objS));
            }
        } else {
            C5163hd0 c5163hd0 = D;
            if (c5163hd0 != null) {
                return c5163hd0;
            }
        }
        return C5163hd0.e();
    }

    public static int q() {
        return C;
    }

    public static Object s() {
        Context contextP;
        Iterator it = H.iterator();
        while (it.hasNext()) {
            Z8 z8 = (Z8) ((WeakReference) it.next()).get();
            if (z8 != null && (contextP = z8.p()) != null) {
                return contextP.getSystemService("locale");
            }
        }
        return null;
    }

    public static C5163hd0 u() {
        return D;
    }

    public static C5163hd0 v() {
        return E;
    }

    public static boolean z(Context context) {
        if (F == null) {
            try {
                Bundle bundle = X9.a(context).metaData;
                if (bundle != null) {
                    F = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                F = Boolean.FALSE;
            }
        }
        return F.booleanValue();
    }

    public abstract void A(Configuration configuration);

    public abstract void B(Bundle bundle);

    public abstract void C();

    public abstract void D(Bundle bundle);

    public abstract void E();

    public abstract void F(Bundle bundle);

    public abstract void G();

    public abstract void H();

    public abstract boolean K(int i);

    public abstract void M(int i);

    public abstract void N(View view);

    public abstract void O(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void Q(Toolbar toolbar);

    public abstract void R(int i);

    public abstract void S(CharSequence charSequence);

    public abstract AbstractC8081s2 T(AbstractC8081s2.a aVar);

    public abstract void f(View view, ViewGroup.LayoutParams layoutParams);

    public abstract boolean g();

    public void i(final Context context) {
        B.execute(new Runnable() { // from class: com.daaw.Y8
            @Override // java.lang.Runnable
            public final void run() {
                Z8.V(context);
            }
        });
    }

    public Context k(Context context) {
        j(context);
        return context;
    }

    public abstract View n(int i);

    public abstract Context p();

    public abstract int r();

    public abstract MenuInflater t();

    public abstract AbstractC6687n2 w();

    public abstract void x();

    public abstract void y();

    public void P(OnBackInvokedDispatcher onBackInvokedDispatcher) {
    }

    public void j(Context context) {
    }
}
