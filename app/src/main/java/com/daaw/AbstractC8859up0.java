package com.daaw;

/* JADX INFO: renamed from: com.daaw.up0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8859up0 implements HE0 {
    public Object a;

    public AbstractC8859up0(Object obj) {
        this.a = obj;
    }

    @Override // com.daaw.HE0, com.daaw.FE0
    public Object a(Object obj, W60 w60) {
        G10.g(w60, "property");
        return this.a;
    }

    @Override // com.daaw.HE0
    public void b(Object obj, W60 w60, Object obj2) {
        G10.g(w60, "property");
        Object obj3 = this.a;
        if (d(w60, obj3, obj2)) {
            this.a = obj2;
            c(w60, obj3, obj2);
        }
    }

    public void c(W60 w60, Object obj, Object obj2) {
        G10.g(w60, "property");
    }

    public abstract boolean d(W60 w60, Object obj, Object obj2);

    public String toString() {
        return "ObservableProperty(value=" + this.a + ')';
    }
}
