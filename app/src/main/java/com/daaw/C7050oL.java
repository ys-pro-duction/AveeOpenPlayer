package com.daaw;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.daaw.C1296Jo;
import com.daaw.ComponentCallbacks2C3485be;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.provider.FirebaseInitProvider;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.daaw.oL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7050oL {
    public static final Object k = new Object();
    public static final Map l = new C2407Ua();
    public final Context a;
    public final String b;
    public final UL c;
    public final C1296Jo d;
    public final P90 g;
    public final InterfaceC7569qB0 h;
    public final AtomicBoolean e = new AtomicBoolean(false);
    public final AtomicBoolean f = new AtomicBoolean();
    public final List i = new CopyOnWriteArrayList();
    public final List j = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: com.daaw.oL$a */
    public interface a {
        void a(boolean z);
    }

    /* JADX INFO: renamed from: com.daaw.oL$b */
    public static class b implements ComponentCallbacks2C3485be.a {
        public static AtomicReference a = new AtomicReference();

        public static void c(Context context) {
            if (AbstractC7494pv0.a() && (context.getApplicationContext() instanceof Application)) {
                Application application = (Application) context.getApplicationContext();
                if (a.get() == null) {
                    b bVar = new b();
                    if (AbstractC0552Cm0.a(a, null, bVar)) {
                        ComponentCallbacks2C3485be.c(application);
                        ComponentCallbacks2C3485be.b().a(bVar);
                    }
                }
            }
        }

        @Override // com.daaw.ComponentCallbacks2C3485be.a
        public void a(boolean z) {
            synchronized (C7050oL.k) {
                try {
                    for (C7050oL c7050oL : new ArrayList(C7050oL.l.values())) {
                        if (c7050oL.e.get()) {
                            c7050oL.w(z);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.oL$c */
    public static class c extends BroadcastReceiver {
        public static AtomicReference b = new AtomicReference();
        public final Context a;

        public c(Context context) {
            this.a = context;
        }

        public static void b(Context context) {
            if (b.get() == null) {
                c cVar = new c(context);
                if (AbstractC0552Cm0.a(b, null, cVar)) {
                    context.registerReceiver(cVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                }
            }
        }

        public void c() {
            this.a.unregisterReceiver(this);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            synchronized (C7050oL.k) {
                try {
                    Iterator it = C7050oL.l.values().iterator();
                    while (it.hasNext()) {
                        ((C7050oL) it.next()).p();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            c();
        }
    }

    public C7050oL(final Context context, String str, UL ul) {
        this.a = (Context) AbstractC7506py0.l(context);
        this.b = AbstractC7506py0.f(str);
        this.c = (UL) AbstractC7506py0.l(ul);
        AbstractC5691jW0 abstractC5691jW0B = FirebaseInitProvider.b();
        AbstractC5929kM.b("Firebase");
        AbstractC5929kM.b("ComponentDiscovery");
        List listB = C9697xo.c(context, ComponentDiscoveryService.class).b();
        AbstractC5929kM.a();
        AbstractC5929kM.b("Runtime");
        C1296Jo.b bVarF = C1296Jo.m(EnumC8118s91.INSTANCE).d(listB).c(new FirebaseCommonRegistrar()).c(new ExecutorsRegistrar()).b(C3535bo.q(context, Context.class, new Class[0])).b(C3535bo.q(this, C7050oL.class, new Class[0])).b(C3535bo.q(ul, UL.class, new Class[0])).f(new C0455Bo());
        if (AbstractC1865Pa1.a(context) && FirebaseInitProvider.c()) {
            bVarF.b(C3535bo.q(abstractC5691jW0B, AbstractC5691jW0.class, new Class[0]));
        }
        C1296Jo c1296JoE = bVarF.e();
        this.d = c1296JoE;
        AbstractC5929kM.a();
        this.g = new P90(new InterfaceC7569qB0() { // from class: com.daaw.mL
            @Override // com.daaw.InterfaceC7569qB0
            public final Object get() {
                return C7050oL.b(this.a, context);
            }
        });
        this.h = c1296JoE.d(C9460wx.class);
        g(new a() { // from class: com.daaw.nL
            @Override // com.daaw.C7050oL.a
            public final void a(boolean z) {
                C7050oL.a(this.a, z);
            }
        });
        AbstractC5929kM.a();
    }

    public static /* synthetic */ void a(C7050oL c7050oL, boolean z) {
        if (z) {
            c7050oL.getClass();
        } else {
            ((C9460wx) c7050oL.h.get()).h();
        }
    }

    public static /* synthetic */ C1843Ov b(C7050oL c7050oL, Context context) {
        return new C1843Ov(context, c7050oL.o(), (InterfaceC9528xB0) c7050oL.d.a(InterfaceC9528xB0.class));
    }

    public static C7050oL l() {
        C7050oL c7050oL;
        synchronized (k) {
            try {
                c7050oL = (C7050oL) l.get("[DEFAULT]");
                if (c7050oL == null) {
                    throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + AbstractC0717Dz0.a() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
                }
                ((C9460wx) c7050oL.h.get()).h();
            } catch (Throwable th) {
                throw th;
            }
        }
        return c7050oL;
    }

    public static C7050oL q(Context context) {
        synchronized (k) {
            try {
                if (l.containsKey("[DEFAULT]")) {
                    return l();
                }
                UL ulA = UL.a(context);
                if (ulA == null) {
                    return null;
                }
                return r(context, ulA);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static C7050oL r(Context context, UL ul) {
        return s(context, ul, "[DEFAULT]");
    }

    public static C7050oL s(Context context, UL ul, String str) {
        C7050oL c7050oL;
        b.c(context);
        String strV = v(str);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (k) {
            Map map = l;
            AbstractC7506py0.p(!map.containsKey(strV), "FirebaseApp name " + strV + " already exists!");
            AbstractC7506py0.m(context, "Application context cannot be null.");
            c7050oL = new C7050oL(context, strV, ul);
            map.put(strV, c7050oL);
        }
        c7050oL.p();
        return c7050oL;
    }

    public static String v(String str) {
        return str.trim();
    }

    public boolean equals(Object obj) {
        if (obj instanceof C7050oL) {
            return this.b.equals(((C7050oL) obj).m());
        }
        return false;
    }

    public void g(a aVar) {
        i();
        if (this.e.get() && ComponentCallbacks2C3485be.b().d()) {
            aVar.a(true);
        }
        this.i.add(aVar);
    }

    public void h(InterfaceC9288wL interfaceC9288wL) {
        i();
        AbstractC7506py0.l(interfaceC9288wL);
        this.j.add(interfaceC9288wL);
    }

    public int hashCode() {
        return this.b.hashCode();
    }

    public final void i() {
        AbstractC7506py0.p(!this.f.get(), "FirebaseApp was deleted");
    }

    public Object j(Class cls) {
        i();
        return this.d.a(cls);
    }

    public Context k() {
        i();
        return this.a;
    }

    public String m() {
        i();
        return this.b;
    }

    public UL n() {
        i();
        return this.c;
    }

    public String o() {
        return AbstractC6293le.b(m().getBytes(Charset.defaultCharset())) + "+" + AbstractC6293le.b(n().c().getBytes(Charset.defaultCharset()));
    }

    public final void p() {
        if (!AbstractC1865Pa1.a(this.a)) {
            m();
            c.b(this.a);
        } else {
            m();
            this.d.p(u());
            ((C9460wx) this.h.get()).h();
        }
    }

    public boolean t() {
        i();
        return ((C1843Ov) this.g.get()).b();
    }

    public String toString() {
        return AbstractC8022rp0.c(this).a("name", this.b).a("options", this.c).toString();
    }

    public boolean u() {
        return "[DEFAULT]".equals(m());
    }

    public final void w(boolean z) {
        Iterator it = this.i.iterator();
        while (it.hasNext()) {
            ((a) it.next()).a(z);
        }
    }
}
