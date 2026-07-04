package com.daaw;

/* JADX INFO: renamed from: com.daaw.ug2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8816ug2 implements InterfaceC1483Li2 {
    public static final Object c = new Object();
    public volatile InterfaceC1483Li2 a;
    public volatile Object b = c;

    public C8816ug2(InterfaceC1483Li2 interfaceC1483Li2) {
        this.a = interfaceC1483Li2;
    }

    public static InterfaceC1483Li2 a(InterfaceC1483Li2 interfaceC1483Li2) {
        return interfaceC1483Li2 instanceof C8816ug2 ? interfaceC1483Li2 : new C8816ug2(interfaceC1483Li2);
    }

    @Override // com.daaw.InterfaceC1483Li2
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
