package com.daaw;

/* JADX INFO: renamed from: com.daaw.Yq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC2887Yq {
    public final Object a;

    public AbstractC2887Yq(Object obj) {
        this.a = obj;
    }

    public abstract I80 a(InterfaceC2968Zk0 interfaceC2968Zk0);

    public Object b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        Object objB = b();
        AbstractC2887Yq abstractC2887Yq = obj instanceof AbstractC2887Yq ? (AbstractC2887Yq) obj : null;
        return G10.c(objB, abstractC2887Yq != null ? abstractC2887Yq.b() : null);
    }

    public int hashCode() {
        Object objB = b();
        if (objB != null) {
            return objB.hashCode();
        }
        return 0;
    }

    public String toString() {
        return String.valueOf(b());
    }
}
