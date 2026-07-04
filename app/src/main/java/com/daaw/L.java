package com.daaw;

import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public abstract class L implements InterfaceC2420Ud0, Serializable {
    public String B;

    @Override // com.daaw.InterfaceC2420Ud0
    public /* synthetic */ boolean f(EnumC9633xb0 enumC9633xb0) {
        return AbstractC1668Nd0.a(this, enumC9633xb0);
    }

    @Override // com.daaw.InterfaceC2420Ud0
    public void g(String str, Throwable th) {
        if (a()) {
            i(EnumC9633xb0.DEBUG, null, str, th);
        }
    }

    @Override // com.daaw.InterfaceC2420Ud0
    public String getName() {
        return this.B;
    }

    public abstract void h(EnumC9633xb0 enumC9633xb0, InterfaceC1784Og0 interfaceC1784Og0, String str, Object[] objArr, Throwable th);

    public final void i(EnumC9633xb0 enumC9633xb0, InterfaceC1784Og0 interfaceC1784Og0, String str, Throwable th) {
        h(enumC9633xb0, interfaceC1784Og0, str, null, th);
    }
}
