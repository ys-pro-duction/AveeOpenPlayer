package com.daaw;

import com.daaw.InterfaceC9611xW;

/* JADX INFO: renamed from: com.daaw.Bx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0491Bx extends InterfaceC9611xW.a {
    public final String b;
    public final InterfaceC5299i51 c;
    public final int d;
    public final int e;
    public final boolean f;

    public C0491Bx(String str, InterfaceC5299i51 interfaceC5299i51) {
        this(str, interfaceC5299i51, 8000, 8000, false);
    }

    @Override // com.daaw.InterfaceC9611xW.a
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public C0387Ax c(InterfaceC9611xW.e eVar) {
        return new C0387Ax(this.b, null, this.c, this.d, this.e, this.f, eVar);
    }

    public C0491Bx(String str, InterfaceC5299i51 interfaceC5299i51, int i, int i2, boolean z) {
        this.b = str;
        this.c = interfaceC5299i51;
        this.d = i;
        this.e = i2;
        this.f = z;
    }
}
