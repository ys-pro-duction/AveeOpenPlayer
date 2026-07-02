package com.daaw;

import android.content.Context;
import com.daaw.InterfaceC2595Vv;

/* JADX INFO: renamed from: com.daaw.bx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3577bx implements InterfaceC2595Vv.a {
    public final Context a;
    public final InterfaceC5299i51 b;
    public final InterfaceC2595Vv.a c;

    public C3577bx(Context context, InterfaceC5299i51 interfaceC5299i51, InterfaceC2595Vv.a aVar) {
        this.a = context.getApplicationContext();
        this.b = interfaceC5299i51;
        this.c = aVar;
    }

    @Override // com.daaw.InterfaceC2595Vv.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C3298ax a() {
        return new C3298ax(this.a, this.b, this.c.a());
    }
}
