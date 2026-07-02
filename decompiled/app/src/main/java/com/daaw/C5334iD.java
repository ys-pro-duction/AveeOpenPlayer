package com.daaw;

/* JADX INFO: renamed from: com.daaw.iD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5334iD implements InterfaceC7290pB0 {
    public static final Object c = new Object();
    public volatile InterfaceC7290pB0 a;
    public volatile Object b = c;

    public C5334iD(InterfaceC7290pB0 interfaceC7290pB0) {
        this.a = interfaceC7290pB0;
    }

    public static InterfaceC7290pB0 a(InterfaceC7290pB0 interfaceC7290pB0) {
        AbstractC7227oy0.b(interfaceC7290pB0);
        return interfaceC7290pB0 instanceof C5334iD ? interfaceC7290pB0 : new C5334iD(interfaceC7290pB0);
    }

    public static Object b(Object obj, Object obj2) {
        if (obj == c || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    @Override // com.daaw.InterfaceC7290pB0
    public Object get() {
        Object obj;
        Object obj2 = this.b;
        Object obj3 = c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.b;
                if (obj == obj3) {
                    obj = this.a.get();
                    this.b = b(this.b, obj);
                    this.a = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}
