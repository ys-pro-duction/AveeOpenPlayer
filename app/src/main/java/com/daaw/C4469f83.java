package com.daaw;

/* JADX INFO: renamed from: com.daaw.f83, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4469f83 implements InterfaceC8394t83, V73 {
    public static final Object c = new Object();
    public volatile InterfaceC8394t83 a;
    public volatile Object b = c;

    public C4469f83(InterfaceC8394t83 interfaceC8394t83) {
        this.a = interfaceC8394t83;
    }

    public static V73 a(InterfaceC8394t83 interfaceC8394t83) {
        if (interfaceC8394t83 instanceof V73) {
            return (V73) interfaceC8394t83;
        }
        interfaceC8394t83.getClass();
        return new C4469f83(interfaceC8394t83);
    }

    public static InterfaceC8394t83 b(InterfaceC8394t83 interfaceC8394t83) {
        return interfaceC8394t83 instanceof C4469f83 ? interfaceC8394t83 : new C4469f83(interfaceC8394t83);
    }

    @Override // com.daaw.InterfaceC8394t83
    public final Object zzb() {
        Object objZzb;
        Object obj = this.b;
        Object obj2 = c;
        if (obj != obj2) {
            return obj;
        }
        synchronized (this) {
            try {
                objZzb = this.b;
                if (objZzb == obj2) {
                    objZzb = this.a.zzb();
                    Object obj3 = this.b;
                    if (obj3 != obj2 && obj3 != objZzb) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + objZzb + ". This is likely due to a circular dependency.");
                    }
                    this.b = objZzb;
                    this.a = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return objZzb;
    }
}
