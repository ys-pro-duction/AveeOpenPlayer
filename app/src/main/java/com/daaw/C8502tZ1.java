package com.daaw;

import android.content.Context;

/* JADX INFO: renamed from: com.daaw.tZ1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8502tZ1 implements InterfaceC8836uk2 {
    public final HY1 a;
    public Context b;
    public InterfaceC7880rJ1 c;

    public /* synthetic */ C8502tZ1(HY1 hy1, AbstractC8223sZ1 abstractC8223sZ1) {
        this.a = hy1;
    }

    @Override // com.daaw.InterfaceC8836uk2
    public final /* synthetic */ InterfaceC8836uk2 a(Context context) {
        context.getClass();
        this.b = context;
        return this;
    }

    @Override // com.daaw.InterfaceC8836uk2
    public final /* synthetic */ InterfaceC8836uk2 b(InterfaceC7880rJ1 interfaceC7880rJ1) {
        interfaceC7880rJ1.getClass();
        this.c = interfaceC7880rJ1;
        return this;
    }

    @Override // com.daaw.InterfaceC8836uk2
    public final InterfaceC9122vk2 zzc() {
        AbstractC7000o83.c(this.b, Context.class);
        AbstractC7000o83.c(this.c, InterfaceC7880rJ1.class);
        return new AZ1(this.a, this.b, this.c, null);
    }
}
