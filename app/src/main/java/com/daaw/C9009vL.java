package com.daaw;

import com.daaw.InterfaceC7784qy;

/* JADX INFO: renamed from: com.daaw.vL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9009vL extends AbstractC5806ju {
    public InterfaceC8515tc0 a;
    public InterfaceC9200w10 b;
    public boolean c;
    public final M8 d = new M8() { // from class: com.daaw.sL
        @Override // com.daaw.M8
        public final void a(O8 o8) {
            this.a.g(o8);
        }
    };

    public C9009vL(InterfaceC7784qy interfaceC7784qy) {
        interfaceC7784qy.a(new InterfaceC7784qy.a() { // from class: com.daaw.tL
            @Override // com.daaw.InterfaceC7784qy.a
            public final void a(InterfaceC7569qB0 interfaceC7569qB0) {
                C9009vL.d(this.a, interfaceC7569qB0);
            }
        });
    }

    public static /* synthetic */ void d(C9009vL c9009vL, InterfaceC7569qB0 interfaceC7569qB0) {
        synchronized (c9009vL) {
            try {
                InterfaceC9200w10 interfaceC9200w10 = (InterfaceC9200w10) interfaceC7569qB0.get();
                c9009vL.b = interfaceC9200w10;
                if (interfaceC9200w10 != null) {
                    interfaceC9200w10.b(c9009vL.d);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static /* synthetic */ AbstractC6963o11 f(AbstractC6963o11 abstractC6963o11) {
        return abstractC6963o11.n() ? A11.e(((O8) abstractC6963o11.k()).b()) : A11.d(abstractC6963o11.j());
    }

    @Override // com.daaw.AbstractC5806ju
    public synchronized AbstractC6963o11 a() {
        InterfaceC9200w10 interfaceC9200w10 = this.b;
        if (interfaceC9200w10 == null) {
            return A11.d(new C6213lL("AppCheck is not available"));
        }
        AbstractC6963o11 abstractC6963o11A = interfaceC9200w10.a(this.c);
        this.c = false;
        return abstractC6963o11A.i(EI.b, new InterfaceC1519Ls() { // from class: com.daaw.uL
            @Override // com.daaw.InterfaceC1519Ls
            public final Object a(AbstractC6963o11 abstractC6963o11) {
                return C9009vL.f(abstractC6963o11);
            }
        });
    }

    @Override // com.daaw.AbstractC5806ju
    public synchronized void b() {
        this.c = true;
    }

    @Override // com.daaw.AbstractC5806ju
    public synchronized void c(InterfaceC8515tc0 interfaceC8515tc0) {
        this.a = interfaceC8515tc0;
    }

    public final synchronized void g(O8 o8) {
        try {
            if (o8.a() != null) {
                AbstractC2212Sd0.d("FirebaseAppCheckTokenProvider", "Error getting App Check token; using placeholder token instead. Error: " + o8.a(), new Object[0]);
            }
            InterfaceC8515tc0 interfaceC8515tc0 = this.a;
            if (interfaceC8515tc0 != null) {
                interfaceC8515tc0.a(o8.b());
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
