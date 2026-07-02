package com.daaw;

/* JADX INFO: renamed from: com.daaw.Kk1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1386Kk1 implements InterfaceC1797Oj1 {
    public static final Object c = new Object();
    public volatile InterfaceC1797Oj1 a;
    public volatile Object b = c;

    public C1386Kk1(InterfaceC1797Oj1 interfaceC1797Oj1) {
        this.a = interfaceC1797Oj1;
    }

    public static InterfaceC1797Oj1 b(InterfaceC1797Oj1 interfaceC1797Oj1) {
        interfaceC1797Oj1.getClass();
        return interfaceC1797Oj1 instanceof C1386Kk1 ? interfaceC1797Oj1 : new C1386Kk1(interfaceC1797Oj1);
    }

    @Override // com.daaw.InterfaceC1797Oj1
    public final Object a() {
        Object objA;
        Object obj = this.b;
        Object obj2 = c;
        if (obj != obj2) {
            return obj;
        }
        synchronized (this) {
            try {
                objA = this.b;
                if (objA == obj2) {
                    objA = this.a.a();
                    Object obj3 = this.b;
                    if (obj3 != obj2 && obj3 != objA) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + objA + ". This is likely due to a circular dependency.");
                    }
                    this.b = objA;
                    this.a = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return objA;
    }
}
