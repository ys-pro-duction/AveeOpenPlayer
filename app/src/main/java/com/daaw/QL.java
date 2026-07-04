package com.daaw;

import android.text.TextUtils;
import com.daaw.AbstractC5294i41;
import com.daaw.AbstractC6957o00;
import com.daaw.SL;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public class QL implements RL {
    public static final Object m = new Object();
    public static final ThreadFactory n = new a();
    public final C7050oL a;
    public final LL b;
    public final C1732Nt0 c;
    public final C0726Eb1 d;
    public final P90 e;
    public final C7023oE0 f;
    public final Object g;
    public final ExecutorService h;
    public final Executor i;
    public String j;
    public Set k;
    public final List l;

    public class a implements ThreadFactory {
        public final AtomicInteger B = new AtomicInteger(1);

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, String.format("firebase-installations-executor-%d", Integer.valueOf(this.B.getAndIncrement())));
        }
    }

    public static /* synthetic */ class b {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[AbstractC5294i41.b.values().length];
            b = iArr;
            try {
                iArr[AbstractC5294i41.b.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[AbstractC5294i41.b.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[AbstractC5294i41.b.AUTH_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[AbstractC6957o00.b.values().length];
            a = iArr2;
            try {
                iArr2[AbstractC6957o00.b.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[AbstractC6957o00.b.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public QL(final C7050oL c7050oL, InterfaceC7569qB0 interfaceC7569qB0, ExecutorService executorService, Executor executor) {
        this(executorService, executor, c7050oL, new LL(c7050oL.k(), interfaceC7569qB0), new C1732Nt0(c7050oL), C0726Eb1.c(), new P90(new InterfaceC7569qB0() { // from class: com.daaw.ML
            @Override // com.daaw.InterfaceC7569qB0
            public final Object get() {
                return QL.e(c7050oL);
            }
        }), new C7023oE0());
    }

    public static /* synthetic */ C3178aY e(C7050oL c7050oL) {
        return new C3178aY(c7050oL);
    }

    public static QL p() {
        return q(C7050oL.l());
    }

    public static QL q(C7050oL c7050oL) {
        AbstractC7506py0.b(c7050oL != null, "Null is not a valid value of FirebaseApp.");
        return (QL) c7050oL.j(RL.class);
    }

    public final synchronized void A(String str) {
        this.j = str;
    }

    public final synchronized void B(AbstractC1836Ot0 abstractC1836Ot0, AbstractC1836Ot0 abstractC1836Ot02) {
        if (this.k.size() != 0 && !TextUtils.equals(abstractC1836Ot0.d(), abstractC1836Ot02.d())) {
            Iterator it = this.k.iterator();
            if (it.hasNext()) {
                AbstractC6314li0.a(it.next());
                abstractC1836Ot02.d();
                throw null;
            }
        }
    }

    @Override // com.daaw.RL
    public AbstractC6963o11 a(final boolean z) {
        v();
        AbstractC6963o11 abstractC6963o11F = f();
        this.h.execute(new Runnable() { // from class: com.daaw.PL
            @Override // java.lang.Runnable
            public final void run() {
                this.B.j(z);
            }
        });
        return abstractC6963o11F;
    }

    public final AbstractC6963o11 f() {
        C7521q11 c7521q11 = new C7521q11();
        h(new C8751uS(this.d, c7521q11));
        return c7521q11.a();
    }

    public final AbstractC6963o11 g() {
        C7521q11 c7521q11 = new C7521q11();
        h(new C9037vS(c7521q11));
        return c7521q11.a();
    }

    @Override // com.daaw.RL
    public AbstractC6963o11 getId() {
        v();
        String strN = n();
        if (strN != null) {
            return A11.e(strN);
        }
        AbstractC6963o11 abstractC6963o11G = g();
        this.h.execute(new Runnable() { // from class: com.daaw.NL
            @Override // java.lang.Runnable
            public final void run() {
                this.B.j(false);
            }
        });
        return abstractC6963o11G;
    }

    public final void h(InterfaceC8489tW0 interfaceC8489tW0) {
        synchronized (this.g) {
            this.l.add(interfaceC8489tW0);
        }
    }

    public final void i(boolean z) {
        AbstractC1836Ot0 abstractC1836Ot0X;
        AbstractC1836Ot0 abstractC1836Ot0R = r();
        try {
            if (abstractC1836Ot0R.i() || abstractC1836Ot0R.l()) {
                abstractC1836Ot0X = x(abstractC1836Ot0R);
            } else {
                if (!z && !this.d.f(abstractC1836Ot0R)) {
                    return;
                }
                abstractC1836Ot0X = k(abstractC1836Ot0R);
            }
            u(abstractC1836Ot0X);
            B(abstractC1836Ot0R, abstractC1836Ot0X);
            if (abstractC1836Ot0X.k()) {
                A(abstractC1836Ot0X.d());
            }
            if (abstractC1836Ot0X.i()) {
                y(new SL(SL.a.BAD_CONFIG));
            } else if (abstractC1836Ot0X.j()) {
                y(new IOException("Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."));
            } else {
                z(abstractC1836Ot0X);
            }
        } catch (SL e) {
            y(e);
        }
    }

    public final void j(final boolean z) {
        AbstractC1836Ot0 abstractC1836Ot0S = s();
        if (z) {
            abstractC1836Ot0S = abstractC1836Ot0S.p();
        }
        z(abstractC1836Ot0S);
        this.i.execute(new Runnable() { // from class: com.daaw.OL
            @Override // java.lang.Runnable
            public final void run() {
                this.B.i(z);
            }
        });
    }

    public final AbstractC1836Ot0 k(AbstractC1836Ot0 abstractC1836Ot0) throws SL {
        AbstractC5294i41 abstractC5294i41E = this.b.e(l(), abstractC1836Ot0.d(), t(), abstractC1836Ot0.f());
        int i = b.b[abstractC5294i41E.b().ordinal()];
        if (i == 1) {
            return abstractC1836Ot0.o(abstractC5294i41E.c(), abstractC5294i41E.d(), this.d.b());
        }
        if (i == 2) {
            return abstractC1836Ot0.q("BAD CONFIG");
        }
        if (i != 3) {
            throw new SL("Firebase Installations Service is unavailable. Please try again later.", SL.a.UNAVAILABLE);
        }
        A(null);
        return abstractC1836Ot0.r();
    }

    public String l() {
        return this.a.n().b();
    }

    public String m() {
        return this.a.n().c();
    }

    public final synchronized String n() {
        return this.j;
    }

    public final C3178aY o() {
        return (C3178aY) this.e.get();
    }

    /* JADX WARN: Finally extract failed */
    public final AbstractC1836Ot0 r() {
        AbstractC1836Ot0 abstractC1836Ot0D;
        synchronized (m) {
            try {
                C0800Eu c0800EuA = C0800Eu.a(this.a.k(), "generatefid.lock");
                try {
                    abstractC1836Ot0D = this.c.d();
                    if (c0800EuA != null) {
                        c0800EuA.b();
                    }
                } catch (Throwable th) {
                    if (c0800EuA != null) {
                        c0800EuA.b();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return abstractC1836Ot0D;
    }

    /* JADX WARN: Finally extract failed */
    public final AbstractC1836Ot0 s() {
        AbstractC1836Ot0 abstractC1836Ot0D;
        synchronized (m) {
            try {
                C0800Eu c0800EuA = C0800Eu.a(this.a.k(), "generatefid.lock");
                try {
                    abstractC1836Ot0D = this.c.d();
                    if (abstractC1836Ot0D.j()) {
                        abstractC1836Ot0D = this.c.b(abstractC1836Ot0D.t(w(abstractC1836Ot0D)));
                    }
                    if (c0800EuA != null) {
                        c0800EuA.b();
                    }
                } catch (Throwable th) {
                    if (c0800EuA != null) {
                        c0800EuA.b();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return abstractC1836Ot0D;
    }

    public String t() {
        return this.a.n().e();
    }

    /* JADX WARN: Finally extract failed */
    public final void u(AbstractC1836Ot0 abstractC1836Ot0) {
        synchronized (m) {
            try {
                C0800Eu c0800EuA = C0800Eu.a(this.a.k(), "generatefid.lock");
                try {
                    this.c.b(abstractC1836Ot0);
                    if (c0800EuA != null) {
                        c0800EuA.b();
                    }
                } catch (Throwable th) {
                    if (c0800EuA != null) {
                        c0800EuA.b();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void v() {
        AbstractC7506py0.g(m(), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        AbstractC7506py0.g(t(), "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        AbstractC7506py0.g(l(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        AbstractC7506py0.b(C0726Eb1.h(m()), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        AbstractC7506py0.b(C0726Eb1.g(l()), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    public final String w(AbstractC1836Ot0 abstractC1836Ot0) {
        if ((!this.a.m().equals("CHIME_ANDROID_SDK") && !this.a.u()) || !abstractC1836Ot0.m()) {
            return this.f.a();
        }
        String strF = o().f();
        return TextUtils.isEmpty(strF) ? this.f.a() : strF;
    }

    public final AbstractC1836Ot0 x(AbstractC1836Ot0 abstractC1836Ot0) throws SL {
        AbstractC6957o00 abstractC6957o00D = this.b.d(l(), abstractC1836Ot0.d(), t(), m(), (abstractC1836Ot0.d() == null || abstractC1836Ot0.d().length() != 11) ? null : o().i());
        int i = b.a[abstractC6957o00D.e().ordinal()];
        if (i == 1) {
            return abstractC1836Ot0.s(abstractC6957o00D.c(), abstractC6957o00D.d(), this.d.b(), abstractC6957o00D.b().c(), abstractC6957o00D.b().d());
        }
        if (i == 2) {
            return abstractC1836Ot0.q("BAD CONFIG");
        }
        throw new SL("Firebase Installations Service is unavailable. Please try again later.", SL.a.UNAVAILABLE);
    }

    public final void y(Exception exc) {
        synchronized (this.g) {
            try {
                Iterator it = this.l.iterator();
                while (it.hasNext()) {
                    if (((InterfaceC8489tW0) it.next()).a(exc)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void z(AbstractC1836Ot0 abstractC1836Ot0) {
        synchronized (this.g) {
            try {
                Iterator it = this.l.iterator();
                while (it.hasNext()) {
                    if (((InterfaceC8489tW0) it.next()).b(abstractC1836Ot0)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public QL(ExecutorService executorService, Executor executor, C7050oL c7050oL, LL ll, C1732Nt0 c1732Nt0, C0726Eb1 c0726Eb1, P90 p90, C7023oE0 c7023oE0) {
        this.g = new Object();
        this.k = new HashSet();
        this.l = new ArrayList();
        this.a = c7050oL;
        this.b = ll;
        this.c = c1732Nt0;
        this.d = c0726Eb1;
        this.e = p90;
        this.f = c7023oE0;
        this.h = executorService;
        this.i = executor;
    }
}
