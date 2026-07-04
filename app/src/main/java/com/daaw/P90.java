package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public class P90 implements InterfaceC7569qB0 {
    public static final Object c = new Object();
    public volatile Object a = c;
    public volatile InterfaceC7569qB0 b;

    public P90(InterfaceC7569qB0 interfaceC7569qB0) {
        this.b = interfaceC7569qB0;
    }

    @Override // com.daaw.InterfaceC7569qB0
    public Object get() {
        Object obj;
        Object obj2 = this.a;
        Object obj3 = c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.a;
                if (obj == obj3) {
                    obj = this.b.get();
                    this.a = obj;
                    this.b = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}
