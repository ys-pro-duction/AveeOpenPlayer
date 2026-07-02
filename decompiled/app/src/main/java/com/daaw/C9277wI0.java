package com.daaw;

import android.app.Activity;
import android.app.Application;
import android.app.FragmentManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import j$.util.Objects;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.wI0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C9277wI0 implements Handler.Callback {
    public static final C9277wI0 F = new C9277wI0();
    public volatile C8712uI0 B;
    public final Map C = new HashMap();
    public final Map D = new HashMap();
    public final Handler E = new Handler(Looper.getMainLooper(), this);

    public static void a(Activity activity) {
        if (activity.isDestroyed()) {
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        }
    }

    public static C9277wI0 f() {
        return F;
    }

    public C8712uI0 b(Context context, FragmentManager fragmentManager) {
        FragmentC8998vI0 fragmentC8998vI0H = h(fragmentManager);
        C8712uI0 c8712uI0C = fragmentC8998vI0H.c();
        if (c8712uI0C != null) {
            return c8712uI0C;
        }
        C8712uI0 c8712uI0 = new C8712uI0(context, fragmentC8998vI0H.b(), fragmentC8998vI0H.d());
        fragmentC8998vI0H.f(c8712uI0);
        return c8712uI0;
    }

    public C8712uI0 c(Activity activity) {
        if (AbstractC6559mb1.i()) {
            return d(activity.getApplicationContext());
        }
        a(activity);
        return b(activity, activity.getFragmentManager());
    }

    public C8712uI0 d(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("You cannot start a load on a null Context");
        }
        if (AbstractC6559mb1.j() && !(context instanceof Application)) {
            if (context instanceof MP) {
                return e((MP) context);
            }
            if (context instanceof Activity) {
                return c((Activity) context);
            }
            if (context instanceof ContextWrapper) {
                return d(((ContextWrapper) context).getBaseContext());
            }
        }
        return g(context);
    }

    public C8712uI0 e(MP mp) {
        if (AbstractC6559mb1.i()) {
            return d(mp.getApplicationContext());
        }
        a(mp);
        return j(mp, mp.f0());
    }

    public final C8712uI0 g(Context context) {
        if (this.B == null) {
            synchronized (this) {
                try {
                    if (this.B == null) {
                        this.B = new C8712uI0(context.getApplicationContext(), new C7389pa(), new C7866rG());
                    }
                } finally {
                }
            }
        }
        return this.B;
    }

    public FragmentC8998vI0 h(FragmentManager fragmentManager) {
        FragmentC8998vI0 fragmentC8998vI0 = (FragmentC8998vI0) fragmentManager.findFragmentByTag("com.bumptech.glide.manager");
        if (fragmentC8998vI0 != null) {
            return fragmentC8998vI0;
        }
        FragmentC8998vI0 fragmentC8998vI02 = (FragmentC8998vI0) this.C.get(fragmentManager);
        if (fragmentC8998vI02 != null) {
            return fragmentC8998vI02;
        }
        FragmentC8998vI0 fragmentC8998vI03 = new FragmentC8998vI0();
        this.C.put(fragmentManager, fragmentC8998vI03);
        fragmentManager.beginTransaction().add(fragmentC8998vI03, "com.bumptech.glide.manager").commitAllowingStateLoss();
        this.E.obtainMessage(1, fragmentManager).sendToTarget();
        return fragmentC8998vI03;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        Object obj;
        Object objRemove;
        Object obj2;
        Object obj3;
        int i = message.what;
        boolean z = true;
        if (i == 1) {
            obj = (FragmentManager) message.obj;
            objRemove = this.C.remove(obj);
        } else {
            if (i != 2) {
                obj3 = null;
                z = false;
                obj2 = null;
                if (z && obj3 == null && Log.isLoggable("RMRetriever", 5)) {
                    Objects.toString(obj2);
                }
                return z;
            }
            obj = (androidx.fragment.app.FragmentManager) message.obj;
            objRemove = this.D.remove(obj);
        }
        Object obj4 = objRemove;
        obj2 = obj;
        obj3 = obj4;
        if (z) {
            Objects.toString(obj2);
        }
        return z;
    }

    public IZ0 i(androidx.fragment.app.FragmentManager fragmentManager) {
        IZ0 iz0 = (IZ0) fragmentManager.j0("com.bumptech.glide.manager");
        if (iz0 != null) {
            return iz0;
        }
        IZ0 iz02 = (IZ0) this.D.get(fragmentManager);
        if (iz02 != null) {
            return iz02;
        }
        IZ0 iz03 = new IZ0();
        this.D.put(fragmentManager, iz03);
        fragmentManager.o().d(iz03, "com.bumptech.glide.manager").g();
        this.E.obtainMessage(2, fragmentManager).sendToTarget();
        return iz03;
    }

    public C8712uI0 j(Context context, androidx.fragment.app.FragmentManager fragmentManager) {
        IZ0 iz0I = i(fragmentManager);
        C8712uI0 c8712uI0K1 = iz0I.K1();
        if (c8712uI0K1 != null) {
            return c8712uI0K1;
        }
        C8712uI0 c8712uI0 = new C8712uI0(context, iz0I.J1(), iz0I.L1());
        iz0I.N1(c8712uI0);
        return c8712uI0;
    }
}
