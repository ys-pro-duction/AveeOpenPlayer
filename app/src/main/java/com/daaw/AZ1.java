package com.daaw;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class AZ1 implements InterfaceC9122vk2 {
    public final Context a;
    public final InterfaceC7880rJ1 b;
    public final HY1 c;
    public final AZ1 d = this;
    public final InterfaceC8394t83 e;
    public final InterfaceC8394t83 f;
    public final InterfaceC8394t83 g;
    public final InterfaceC8394t83 h;

    public /* synthetic */ AZ1(HY1 hy1, Context context, InterfaceC7880rJ1 interfaceC7880rJ1, AbstractC8781uZ1 abstractC8781uZ1) {
        this.c = hy1;
        this.a = context;
        this.b = interfaceC7880rJ1;
        InterfaceC4758g83 interfaceC4758g83A = C5037h83.a(this);
        this.e = interfaceC4758g83A;
        InterfaceC4758g83 interfaceC4758g83A2 = C5037h83.a(interfaceC7880rJ1);
        this.f = interfaceC4758g83A2;
        C7999rk2 c7999rk2 = new C7999rk2(interfaceC4758g83A2);
        this.g = c7999rk2;
        this.h = C4469f83.b(new C8557tk2(interfaceC4758g83A, c7999rk2));
    }

    @Override // com.daaw.InterfaceC9122vk2
    public final InterfaceC6605mk2 zzb() {
        return new C7387pZ1(this.c, this.d, null);
    }

    @Override // com.daaw.InterfaceC9122vk2
    public final BinderC8278sk2 zzd() {
        return (BinderC8278sk2) this.h.zzb();
    }
}
