package com.daaw;

import com.daaw.InterfaceC7784qy;

/* JADX INFO: renamed from: com.daaw.zL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10125zL extends AbstractC5806ju {
    public final TX a = new TX() { // from class: com.daaw.xL
    };
    public InterfaceC8515tc0 b;
    public int c;
    public boolean d;

    public C10125zL(InterfaceC7784qy interfaceC7784qy) {
        interfaceC7784qy.a(new InterfaceC7784qy.a() { // from class: com.daaw.yL
            @Override // com.daaw.InterfaceC7784qy.a
            public final void a(InterfaceC7569qB0 interfaceC7569qB0) {
                C10125zL.d(this.a, interfaceC7569qB0);
            }
        });
    }

    public static /* synthetic */ void d(C10125zL c10125zL, InterfaceC7569qB0 interfaceC7569qB0) {
        synchronized (c10125zL) {
            AbstractC6314li0.a(interfaceC7569qB0.get());
            c10125zL.f();
            throw null;
        }
    }

    @Override // com.daaw.AbstractC5806ju
    public synchronized AbstractC6963o11 a() {
        return A11.d(new C6213lL("auth is not available"));
    }

    @Override // com.daaw.AbstractC5806ju
    public synchronized void b() {
        this.d = true;
    }

    @Override // com.daaw.AbstractC5806ju
    public synchronized void c(InterfaceC8515tc0 interfaceC8515tc0) {
        this.b = interfaceC8515tc0;
        interfaceC8515tc0.a(e());
    }

    public final synchronized C0722Ea1 e() {
        return C0722Ea1.b;
    }

    public final synchronized void f() {
        this.c++;
        InterfaceC8515tc0 interfaceC8515tc0 = this.b;
        if (interfaceC8515tc0 != null) {
            interfaceC8515tc0.a(e());
        }
    }
}
