package com.daaw;

import android.content.res.Configuration;
import android.content.res.Resources;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.vY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C9061vY {
    public final HashMap a = new HashMap();

    /* JADX INFO: renamed from: com.daaw.vY$a */
    public static final class a {
        public final C8775uY a;
        public final int b;

        public a(C8775uY c8775uY, int i) {
            G10.g(c8775uY, "imageVector");
            this.a = c8775uY;
            this.b = i;
        }

        public final int a() {
            return this.b;
        }

        public final C8775uY b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return G10.c(this.a, aVar.a) && this.b == aVar.b;
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.b;
        }

        public String toString() {
            return "ImageVectorEntry(imageVector=" + this.a + ", configFlags=" + this.b + ')';
        }
    }

    /* JADX INFO: renamed from: com.daaw.vY$b */
    public static final class b {
        public final Resources.Theme a;
        public final int b;

        public b(Resources.Theme theme, int i) {
            G10.g(theme, "theme");
            this.a = theme;
            this.b = i;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return G10.c(this.a, bVar.a) && this.b == bVar.b;
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.b;
        }

        public String toString() {
            return "Key(theme=" + this.a + ", id=" + this.b + ')';
        }
    }

    public final void a() {
        this.a.clear();
    }

    public final a b(b bVar) {
        G10.g(bVar, SubscriberAttributeKt.JSON_NAME_KEY);
        WeakReference weakReference = (WeakReference) this.a.get(bVar);
        if (weakReference != null) {
            return (a) weakReference.get();
        }
        return null;
    }

    public final void c(int i) {
        Iterator it = this.a.entrySet().iterator();
        while (it.hasNext()) {
            Object next = it.next();
            G10.f(next, "it.next()");
            a aVar = (a) ((WeakReference) ((Map.Entry) next).getValue()).get();
            if (aVar == null || Configuration.needNewResources(i, aVar.a())) {
                it.remove();
            }
        }
    }

    public final void d(b bVar, a aVar) {
        G10.g(bVar, SubscriberAttributeKt.JSON_NAME_KEY);
        G10.g(aVar, "imageVectorEntry");
        this.a.put(bVar, new WeakReference(aVar));
    }
}
