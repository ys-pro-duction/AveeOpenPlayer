package com.daaw;

import java.util.Queue;

/* JADX INFO: loaded from: classes4.dex */
public class VH extends AbstractC8510tb0 {
    public String C;
    public C4586fZ0 D;
    public Queue E;

    public VH(C4586fZ0 c4586fZ0, Queue queue) {
        this.D = c4586fZ0;
        this.C = c4586fZ0.getName();
        this.E = queue;
    }

    @Override // com.daaw.InterfaceC2420Ud0
    public boolean a() {
        return true;
    }

    @Override // com.daaw.InterfaceC2420Ud0
    public boolean b() {
        return true;
    }

    @Override // com.daaw.InterfaceC2420Ud0
    public boolean c() {
        return true;
    }

    @Override // com.daaw.InterfaceC2420Ud0
    public boolean d() {
        return true;
    }

    @Override // com.daaw.InterfaceC2420Ud0
    public boolean e() {
        return true;
    }

    @Override // com.daaw.L, com.daaw.InterfaceC2420Ud0
    public String getName() {
        return this.C;
    }

    @Override // com.daaw.L
    public void h(EnumC9633xb0 enumC9633xb0, InterfaceC1784Og0 interfaceC1784Og0, String str, Object[] objArr, Throwable th) {
        C5144hZ0 c5144hZ0 = new C5144hZ0();
        c5144hZ0.k(System.currentTimeMillis());
        c5144hZ0.e(enumC9633xb0);
        c5144hZ0.f(this.D);
        c5144hZ0.g(this.C);
        if (interfaceC1784Og0 != null) {
            c5144hZ0.a(interfaceC1784Og0);
        }
        c5144hZ0.h(str);
        c5144hZ0.i(Thread.currentThread().getName());
        c5144hZ0.d(objArr);
        c5144hZ0.j(th);
        this.E.add(c5144hZ0);
    }
}
