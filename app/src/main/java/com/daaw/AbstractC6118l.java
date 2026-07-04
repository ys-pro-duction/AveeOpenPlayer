package com.daaw;

import java.util.Iterator;

/* JADX INFO: renamed from: com.daaw.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC6118l implements Iterable, InterfaceC9783y60 {

    /* JADX INFO: renamed from: com.daaw.l$a */
    public static abstract class a {
        public final int a;

        public a(int i) {
            this.a = i;
        }

        public final Object c(AbstractC6118l abstractC6118l) {
            G10.g(abstractC6118l, "thisRef");
            return abstractC6118l.e().get(this.a);
        }
    }

    public abstract AbstractC2511Va e();

    public final boolean isEmpty() {
        return e().e() == 0;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return e().iterator();
    }

    public abstract AbstractC7834r81 m();

    public final void p(J50 j50, Object obj) {
        G10.g(j50, "tClass");
        G10.g(obj, "value");
        String strD = j50.d();
        G10.d(strD);
        s(strD, obj);
    }

    public abstract void s(String str, Object obj);
}
