package com.daaw;

import com.daaw.InterfaceC7784qy;

/* JADX INFO: renamed from: com.daaw.cr0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C3829cr0 implements InterfaceC7569qB0, InterfaceC7784qy {
    public static final InterfaceC7784qy.a c = new InterfaceC7784qy.a() { // from class: com.daaw.Zq0
        @Override // com.daaw.InterfaceC7784qy.a
        public final void a(InterfaceC7569qB0 interfaceC7569qB0) {
            C3829cr0.d(interfaceC7569qB0);
        }
    };
    public static final InterfaceC7569qB0 d = new InterfaceC7569qB0() { // from class: com.daaw.ar0
        @Override // com.daaw.InterfaceC7569qB0
        public final Object get() {
            return C3829cr0.b();
        }
    };
    public InterfaceC7784qy.a a;
    public volatile InterfaceC7569qB0 b;

    public C3829cr0(InterfaceC7784qy.a aVar, InterfaceC7569qB0 interfaceC7569qB0) {
        this.a = aVar;
        this.b = interfaceC7569qB0;
    }

    public static /* synthetic */ Object b() {
        return null;
    }

    public static /* synthetic */ void c(InterfaceC7784qy.a aVar, InterfaceC7784qy.a aVar2, InterfaceC7569qB0 interfaceC7569qB0) {
        aVar.a(interfaceC7569qB0);
        aVar2.a(interfaceC7569qB0);
    }

    public static /* synthetic */ void d(InterfaceC7569qB0 interfaceC7569qB0) {
    }

    public static C3829cr0 e() {
        return new C3829cr0(c, d);
    }

    public static C3829cr0 f(InterfaceC7569qB0 interfaceC7569qB0) {
        return new C3829cr0(null, interfaceC7569qB0);
    }

    @Override // com.daaw.InterfaceC7784qy
    public void a(final InterfaceC7784qy.a aVar) {
        InterfaceC7569qB0 interfaceC7569qB0;
        InterfaceC7569qB0 interfaceC7569qB02;
        InterfaceC7569qB0 interfaceC7569qB03 = this.b;
        InterfaceC7569qB0 interfaceC7569qB04 = d;
        if (interfaceC7569qB03 != interfaceC7569qB04) {
            aVar.a(interfaceC7569qB03);
            return;
        }
        synchronized (this) {
            interfaceC7569qB0 = this.b;
            if (interfaceC7569qB0 != interfaceC7569qB04) {
                interfaceC7569qB02 = interfaceC7569qB0;
            } else {
                final InterfaceC7784qy.a aVar2 = this.a;
                this.a = new InterfaceC7784qy.a() { // from class: com.daaw.br0
                    @Override // com.daaw.InterfaceC7784qy.a
                    public final void a(InterfaceC7569qB0 interfaceC7569qB05) {
                        C3829cr0.c(aVar2, aVar, interfaceC7569qB05);
                    }
                };
                interfaceC7569qB02 = null;
            }
        }
        if (interfaceC7569qB02 != null) {
            aVar.a(interfaceC7569qB0);
        }
    }

    public void g(InterfaceC7569qB0 interfaceC7569qB0) {
        InterfaceC7784qy.a aVar;
        if (this.b != d) {
            throw new IllegalStateException("provide() can be called only once.");
        }
        synchronized (this) {
            aVar = this.a;
            this.a = null;
            this.b = interfaceC7569qB0;
        }
        aVar.a(interfaceC7569qB0);
    }

    @Override // com.daaw.InterfaceC7569qB0
    public Object get() {
        return this.b.get();
    }
}
