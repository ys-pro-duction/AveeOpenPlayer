package com.daaw;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.NetworkOnMainThreadException;
import android.os.RemoteException;
import android.util.Pair;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.daaw.cr2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3831cr2 {
    public static volatile C3831cr2 j;
    public final String a;
    public final InterfaceC5485im b;
    public final ExecutorService c;
    public final Z9 d;
    public final List e;
    public int f;
    public boolean g;
    public final String h;
    public volatile ST1 i;

    public C3831cr2(Context context, String str, String str2, String str3, Bundle bundle) {
        if (str == null || !m(str2, str3)) {
            this.a = "FA";
        } else {
            this.a = str;
        }
        this.b = C2599Vw.d();
        EQ1.a();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC10203zd2(this));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.c = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.d = new Z9(this);
        this.e = new ArrayList();
        try {
            if (AbstractC4877gb3.c(context, "google_app_id", AbstractC8742uP2.a(context)) != null && !i()) {
                this.h = null;
                this.g = true;
                return;
            }
        } catch (IllegalStateException unused) {
        }
        if (m(str2, str3)) {
            this.h = str2;
        } else {
            this.h = "fa";
        }
        l(new C62(this, str2, str3, context, bundle));
        Application application = (Application) context.getApplicationContext();
        if (application == null) {
            return;
        }
        application.registerActivityLifecycleCallbacks(new C9989yq2(this));
    }

    public static C3831cr2 t(Context context, String str, String str2, String str3, Bundle bundle) {
        AbstractC7506py0.l(context);
        if (j == null) {
            synchronized (C3831cr2.class) {
                try {
                    if (j == null) {
                        j = new C3831cr2(context, str, str2, str3, bundle);
                    }
                } finally {
                }
            }
        }
        return j;
    }

    public final List A(String str, String str2) {
        MR1 mr1 = new MR1();
        l(new T12(this, str, str2, mr1));
        List list = (List) MR1.a3(mr1.G(5000L), List.class);
        return list == null ? Collections.EMPTY_LIST : list;
    }

    public final Map B(String str, String str2, boolean z) {
        MR1 mr1 = new MR1();
        l(new C1351Kb2(this, str, str2, z, mr1));
        Bundle bundleG = mr1.G(5000L);
        if (bundleG == null || bundleG.size() == 0) {
            return Collections.EMPTY_MAP;
        }
        HashMap map = new HashMap(bundleG.size());
        for (String str3 : bundleG.keySet()) {
            Object obj = bundleG.get(str3);
            if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                map.put(str3, obj);
            }
        }
        return map;
    }

    public final void F(String str) {
        l(new C4752g72(this, str));
    }

    public final void G(String str, String str2, Bundle bundle) {
        l(new C6964o12(this, str, str2, bundle));
    }

    public final void H(String str) {
        l(new L72(this, str));
    }

    public final void I(String str, String str2, Bundle bundle) {
        k(str, str2, bundle, true, true, null);
    }

    public final void a(int i, String str, Object obj, Object obj2, Object obj3) {
        l(new C7402pc2(this, false, 5, str, obj, null, null));
    }

    public final void b(M83 m83) {
        AbstractC7506py0.l(m83);
        synchronized (this.e) {
            for (int i = 0; i < this.e.size(); i++) {
                try {
                    if (m83.equals(((Pair) this.e.get(i)).first)) {
                        return;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            BinderC0663Dl2 binderC0663Dl2 = new BinderC0663Dl2(m83);
            this.e.add(new Pair(m83, binderC0663Dl2));
            if (this.i != null) {
                try {
                    this.i.registerOnMeasurementEventListener(binderC0663Dl2);
                    return;
                } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
                }
            }
            l(new C5190hi2(this, binderC0663Dl2));
        }
    }

    public final void c(Bundle bundle) {
        l(new I02(this, bundle));
    }

    public final void d(Bundle bundle) {
        l(new C5572j42(this, bundle));
    }

    public final void e(Activity activity, String str, String str2) {
        l(new C3329b32(this, activity, str, str2));
    }

    public final void f(String str, String str2, Object obj, boolean z) {
        l(new C2342Tj2(this, str, str2, obj, z));
    }

    public final boolean i() {
        try {
            Class.forName("com.google.firebase.analytics.FirebaseAnalytics", false, C3831cr2.class.getClassLoader());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public final void j(Exception exc, boolean z, boolean z2) {
        this.g |= z;
        if (!z && z2) {
            a(5, "Error with data collection. Data lost.", exc, null, null);
        }
    }

    public final void k(String str, String str2, Bundle bundle, boolean z, boolean z2, Long l) {
        l(new C7437pj2(this, l, str, str2, bundle, z, z2));
    }

    public final void l(AbstractRunnableC9680xk2 abstractRunnableC9680xk2) {
        this.c.execute(abstractRunnableC9680xk2);
    }

    public final boolean m(String str, String str2) {
        return (str2 == null || str == null || i()) ? false : true;
    }

    public final int n(String str) {
        MR1 mr1 = new MR1();
        l(new C4323ee2(this, str, mr1));
        Integer num = (Integer) MR1.a3(mr1.G(10000L), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    public final long o() {
        MR1 mr1 = new MR1();
        l(new T92(this, mr1));
        Long lI = mr1.I(500L);
        if (lI != null) {
            return lI.longValue();
        }
        long jNextLong = new Random(System.nanoTime() ^ this.b.a()).nextLong();
        int i = this.f + 1;
        this.f = i;
        return jNextLong + ((long) i);
    }

    public final Bundle p(Bundle bundle, boolean z) {
        MR1 mr1 = new MR1();
        l(new C2418Uc2(this, bundle, mr1));
        if (z) {
            return mr1.G(5000L);
        }
        return null;
    }

    public final Z9 q() {
        return this.d;
    }

    public final ST1 s(Context context, boolean z) {
        try {
            return AbstractBinderC6526mT1.asInterface(DynamiteModule.e(context, DynamiteModule.e, ModuleDescriptor.MODULE_ID).d("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
        } catch (DynamiteModule.a e) {
            j(e, true, false);
            return null;
        }
    }

    public final String v() {
        return this.h;
    }

    public final String w() {
        MR1 mr1 = new MR1();
        l(new C6725n92(this, mr1));
        return mr1.Z2(50L);
    }

    public final String x() {
        MR1 mr1 = new MR1();
        l(new C4597fb2(this, mr1));
        return mr1.Z2(500L);
    }

    public final String y() {
        MR1 mr1 = new MR1();
        l(new C10188za2(this, mr1));
        return mr1.Z2(500L);
    }

    public final String z() {
        MR1 mr1 = new MR1();
        l(new I82(this, mr1));
        return mr1.Z2(500L);
    }
}
