package com.daaw;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class EN2 {
    public static final Map o = new HashMap();
    public final Context a;
    public final C8455tN2 b;
    public boolean g;
    public final Intent h;
    public ServiceConnection l;
    public IInterface m;
    public final YM2 n;
    public final List d = new ArrayList();
    public final Set e = new HashSet();
    public final Object f = new Object();
    public final IBinder.DeathRecipient j = new IBinder.DeathRecipient() { // from class: com.daaw.vN2
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            EN2.j(this.a);
        }
    };
    public final AtomicInteger k = new AtomicInteger(0);
    public final String c = "OverlayDisplayService";
    public final WeakReference i = new WeakReference(null);

    public EN2(Context context, C8455tN2 c8455tN2, String str, Intent intent, YM2 ym2, InterfaceC10136zN2 interfaceC10136zN2) {
        this.a = context;
        this.b = c8455tN2;
        this.h = intent;
        this.n = ym2;
    }

    public static /* synthetic */ void j(EN2 en2) {
        en2.b.c("reportBinderDeath", new Object[0]);
        AbstractC6314li0.a(en2.i.get());
        en2.b.c("%s : Binder has died.", en2.c);
        Iterator it = en2.d.iterator();
        while (it.hasNext()) {
            ((AbstractRunnableC8734uN2) it.next()).c(en2.v());
        }
        en2.d.clear();
        synchronized (en2.f) {
            en2.w();
        }
    }

    public static /* bridge */ /* synthetic */ void n(final EN2 en2, final C7521q11 c7521q11) {
        en2.e.add(c7521q11);
        c7521q11.a().b(new InterfaceC5228hq0() { // from class: com.daaw.wN2
            @Override // com.daaw.InterfaceC5228hq0
            public final void a(AbstractC6963o11 abstractC6963o11) {
                this.a.t(c7521q11, abstractC6963o11);
            }
        });
    }

    public static /* bridge */ /* synthetic */ void p(EN2 en2, AbstractRunnableC8734uN2 abstractRunnableC8734uN2) {
        if (en2.m != null || en2.g) {
            if (!en2.g) {
                abstractRunnableC8734uN2.run();
                return;
            } else {
                en2.b.c("Waiting to bind to the service.", new Object[0]);
                en2.d.add(abstractRunnableC8734uN2);
                return;
            }
        }
        en2.b.c("Initiate binding to the service.", new Object[0]);
        en2.d.add(abstractRunnableC8734uN2);
        DN2 dn2 = new DN2(en2, null);
        en2.l = dn2;
        en2.g = true;
        if (en2.a.bindService(en2.h, dn2, 1)) {
            return;
        }
        en2.b.c("Failed to bind to the service.", new Object[0]);
        en2.g = false;
        Iterator it = en2.d.iterator();
        while (it.hasNext()) {
            ((AbstractRunnableC8734uN2) it.next()).c(new FN2());
        }
        en2.d.clear();
    }

    public static /* bridge */ /* synthetic */ void q(EN2 en2) {
        en2.b.c("linkToDeath", new Object[0]);
        try {
            en2.m.asBinder().linkToDeath(en2.j, 0);
        } catch (RemoteException e) {
            en2.b.b(e, "linkToDeath failed", new Object[0]);
        }
    }

    public static /* bridge */ /* synthetic */ void r(EN2 en2) {
        en2.b.c("unlinkToDeath", new Object[0]);
        en2.m.asBinder().unlinkToDeath(en2.j, 0);
    }

    public final Handler c() {
        Handler handler;
        Map map = o;
        synchronized (map) {
            try {
                if (!map.containsKey(this.c)) {
                    HandlerThread handlerThread = new HandlerThread(this.c, 10);
                    handlerThread.start();
                    map.put(this.c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) map.get(this.c);
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    public final IInterface e() {
        return this.m;
    }

    public final void s(AbstractRunnableC8734uN2 abstractRunnableC8734uN2, C7521q11 c7521q11) {
        c().post(new C9578xN2(this, abstractRunnableC8734uN2.b(), c7521q11, abstractRunnableC8734uN2));
    }

    public final /* synthetic */ void t(C7521q11 c7521q11, AbstractC6963o11 abstractC6963o11) {
        synchronized (this.f) {
            this.e.remove(c7521q11);
        }
    }

    public final void u() {
        c().post(new C9857yN2(this));
    }

    public final RemoteException v() {
        return new RemoteException(String.valueOf(this.c).concat(" : Binder has died."));
    }

    public final void w() {
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((C7521q11) it.next()).d(v());
        }
        this.e.clear();
    }
}
