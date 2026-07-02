package com.daaw;

/* JADX INFO: renamed from: com.daaw.er2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4388er2 {
    public static final Object h = new Object();
    public final String a;
    public final InterfaceC7746qp2 b;
    public final Object c;
    public final Object d;
    public final Object e = new Object();
    public volatile Object f = null;
    public volatile Object g = null;

    public /* synthetic */ C4388er2(String str, Object obj, Object obj2, InterfaceC7746qp2 interfaceC7746qp2, AbstractC0362Aq2 abstractC0362Aq2) {
        this.a = str;
        this.c = obj;
        this.d = obj2;
        this.b = interfaceC7746qp2;
    }

    public final Object a(Object obj) {
        synchronized (this.e) {
        }
        if (obj != null) {
            return obj;
        }
        if (AbstractC2470Up2.a == null) {
            return this.c;
        }
        synchronized (h) {
            try {
                if (C8292sn1.a()) {
                    return this.g == null ? this.c : this.g;
                }
                try {
                    for (C4388er2 c4388er2 : AbstractC1311Jr2.a) {
                        if (C8292sn1.a()) {
                            throw new IllegalStateException("Refreshing flag cache must be done on a worker thread.");
                        }
                        Object objZza = null;
                        try {
                            InterfaceC7746qp2 interfaceC7746qp2 = c4388er2.b;
                            if (interfaceC7746qp2 != null) {
                                objZza = interfaceC7746qp2.zza();
                            }
                        } catch (IllegalStateException unused) {
                        }
                        synchronized (h) {
                            c4388er2.g = objZza;
                        }
                    }
                } catch (SecurityException unused2) {
                }
                InterfaceC7746qp2 interfaceC7746qp22 = this.b;
                if (interfaceC7746qp22 == null) {
                    return this.c;
                }
                try {
                    return interfaceC7746qp22.zza();
                } catch (IllegalStateException unused3) {
                    return this.c;
                } catch (SecurityException unused4) {
                    return this.c;
                }
            } finally {
            }
        }
    }

    public final String b() {
        return this.a;
    }
}
