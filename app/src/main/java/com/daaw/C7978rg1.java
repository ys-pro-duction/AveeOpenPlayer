package com.daaw;

import java.lang.ref.WeakReference;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.rg1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C7978rg1 {
    public WeakReference a = new WeakReference(null);

    /* JADX INFO: renamed from: com.daaw.rg1$a */
    public interface a {
        void invoke();
    }

    public void a() {
        a aVar = (a) this.a.get();
        if (aVar != null) {
            aVar.invoke();
        }
    }

    public C7978rg1 b(a aVar, List list) {
        list.add(aVar);
        this.a = new WeakReference(aVar);
        return this;
    }
}
