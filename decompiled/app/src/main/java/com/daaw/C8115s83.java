package com.daaw;

/* JADX INFO: renamed from: com.daaw.s83, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8115s83 implements InterfaceC8394t83 {
    public static final Object c = new Object();
    public volatile InterfaceC8394t83 a;
    public volatile Object b = c;

    public C8115s83(InterfaceC8394t83 interfaceC8394t83) {
        this.a = interfaceC8394t83;
    }

    public static InterfaceC8394t83 a(InterfaceC8394t83 interfaceC8394t83) {
        return ((interfaceC8394t83 instanceof C8115s83) || (interfaceC8394t83 instanceof C4469f83)) ? interfaceC8394t83 : new C8115s83(interfaceC8394t83);
    }

    @Override // com.daaw.InterfaceC8394t83
    public final Object zzb() {
        Object obj = this.b;
        if (obj != c) {
            return obj;
        }
        InterfaceC8394t83 interfaceC8394t83 = this.a;
        if (interfaceC8394t83 == null) {
            return this.b;
        }
        Object objZzb = interfaceC8394t83.zzb();
        this.b = objZzb;
        this.a = null;
        return objZzb;
    }
}
