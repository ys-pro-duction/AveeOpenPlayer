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

/* JADX INFO: renamed from: com.daaw.Ek1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0762Ek1 {
    public static final Map o = new HashMap();
    public final Context a;
    public final C5199hk1 b;
    public boolean g;
    public final Intent h;
    public ServiceConnection l;
    public IInterface m;
    public final C8835uk1 n;
    public final List d = new ArrayList();
    public final Set e = new HashSet();
    public final Object f = new Object();
    public final IBinder.DeathRecipient j = new IBinder.DeathRecipient() { // from class: com.daaw.nk1
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            C0762Ek1.h(this.a);
        }
    };
    public final AtomicInteger k = new AtomicInteger(0);
    public final String c = "IntegrityService";
    public final WeakReference i = new WeakReference(null);

    public C0762Ek1(Context context, C5199hk1 c5199hk1, String str, Intent intent, C8835uk1 c8835uk1, InterfaceC8556tk1 interfaceC8556tk1, byte[] bArr) {
        this.a = context;
        this.b = c5199hk1;
        this.h = intent;
        this.n = c8835uk1;
    }

    public static /* synthetic */ void h(C0762Ek1 c0762Ek1) {
        c0762Ek1.b.d("reportBinderDeath", new Object[0]);
        AbstractC6314li0.a(c0762Ek1.i.get());
        c0762Ek1.b.d("%s : Binder has died.", c0762Ek1.c);
        Iterator it = c0762Ek1.d.iterator();
        while (it.hasNext()) {
            ((AbstractRunnableC5758jk1) it.next()).a(c0762Ek1.s());
        }
        c0762Ek1.d.clear();
        c0762Ek1.t();
    }

    public static /* bridge */ /* synthetic */ void m(C0762Ek1 c0762Ek1, AbstractRunnableC5758jk1 abstractRunnableC5758jk1) {
        if (c0762Ek1.m != null || c0762Ek1.g) {
            if (!c0762Ek1.g) {
                abstractRunnableC5758jk1.run();
                return;
            } else {
                c0762Ek1.b.d("Waiting to bind to the service.", new Object[0]);
                c0762Ek1.d.add(abstractRunnableC5758jk1);
                return;
            }
        }
        c0762Ek1.b.d("Initiate binding to the service.", new Object[0]);
        c0762Ek1.d.add(abstractRunnableC5758jk1);
        ServiceConnectionC0545Ck1 serviceConnectionC0545Ck1 = new ServiceConnectionC0545Ck1(c0762Ek1, null);
        c0762Ek1.l = serviceConnectionC0545Ck1;
        c0762Ek1.g = true;
        if (c0762Ek1.a.bindService(c0762Ek1.h, serviceConnectionC0545Ck1, 1)) {
            return;
        }
        c0762Ek1.b.d("Failed to bind to the service.", new Object[0]);
        c0762Ek1.g = false;
        Iterator it = c0762Ek1.d.iterator();
        while (it.hasNext()) {
            ((AbstractRunnableC5758jk1) it.next()).a(new C0970Gk1());
        }
        c0762Ek1.d.clear();
    }

    public static /* bridge */ /* synthetic */ void n(C0762Ek1 c0762Ek1) {
        c0762Ek1.b.d("linkToDeath", new Object[0]);
        try {
            c0762Ek1.m.asBinder().linkToDeath(c0762Ek1.j, 0);
        } catch (RemoteException e) {
            c0762Ek1.b.c(e, "linkToDeath failed", new Object[0]);
        }
    }

    public static /* bridge */ /* synthetic */ void o(C0762Ek1 c0762Ek1) {
        c0762Ek1.b.d("unlinkToDeath", new Object[0]);
        c0762Ek1.m.asBinder().unlinkToDeath(c0762Ek1.j, 0);
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

    public final void p(AbstractRunnableC5758jk1 abstractRunnableC5758jk1, final C7521q11 c7521q11) {
        synchronized (this.f) {
            this.e.add(c7521q11);
            c7521q11.a().b(new InterfaceC5228hq0() { // from class: com.daaw.lk1
                @Override // com.daaw.InterfaceC5228hq0
                public final void a(AbstractC6963o11 abstractC6963o11) {
                    this.a.q(c7521q11, abstractC6963o11);
                }
            });
        }
        synchronized (this.f) {
            try {
                if (this.k.getAndIncrement() > 0) {
                    this.b.a("Already connected to the service.", new Object[0]);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        c().post(new C7441pk1(this, abstractRunnableC5758jk1.c(), abstractRunnableC5758jk1));
    }

    public final /* synthetic */ void q(C7521q11 c7521q11, AbstractC6963o11 abstractC6963o11) {
        synchronized (this.f) {
            this.e.remove(c7521q11);
        }
    }

    public final void r(C7521q11 c7521q11) {
        synchronized (this.f) {
            this.e.remove(c7521q11);
        }
        synchronized (this.f) {
            try {
                if (this.k.get() > 0 && this.k.decrementAndGet() > 0) {
                    this.b.d("Leaving the connection open for other ongoing calls.", new Object[0]);
                } else {
                    c().post(new C7998rk1(this));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final RemoteException s() {
        return new RemoteException(String.valueOf(this.c).concat(" : Binder has died."));
    }

    public final void t() {
        synchronized (this.f) {
            try {
                Iterator it = this.e.iterator();
                while (it.hasNext()) {
                    ((C7521q11) it.next()).d(s());
                }
                this.e.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
