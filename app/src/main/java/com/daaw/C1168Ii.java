package com.daaw;

import com.daaw.AbstractC3246am;
import com.daaw.AbstractC6329ll0;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import j$.util.DesugarCollections;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.daaw.Ii, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1168Ii {
    public static final C1168Ii k;
    public final C6381lw a;
    public final Executor b;
    public final String c;
    public final AbstractC0960Gi d;
    public final String e;
    public final Object[][] f;
    public final List g;
    public final Boolean h;
    public final Integer i;
    public final Integer j;

    /* JADX INFO: renamed from: com.daaw.Ii$b */
    public static class b {
        public C6381lw a;
        public Executor b;
        public String c;
        public AbstractC0960Gi d;
        public String e;
        public Object[][] f;
        public List g;
        public Boolean h;
        public Integer i;
        public Integer j;

        public final C1168Ii b() {
            return new C1168Ii(this);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Ii$c */
    public static final class c {
        public final String a;
        public final Object b;

        public c(String str, Object obj) {
            this.a = str;
            this.b = obj;
        }

        public static c b(String str) {
            AbstractC7785qy0.o(str, "debugString");
            return new c(str, null);
        }

        public String toString() {
            return this.a;
        }
    }

    static {
        b bVar = new b();
        bVar.f = (Object[][]) Array.newInstance((Class<?>) Object.class, 0, 2);
        bVar.g = Collections.EMPTY_LIST;
        k = bVar.b();
    }

    public static b k(C1168Ii c1168Ii) {
        b bVar = new b();
        bVar.a = c1168Ii.a;
        bVar.b = c1168Ii.b;
        bVar.c = c1168Ii.c;
        bVar.d = c1168Ii.d;
        bVar.e = c1168Ii.e;
        bVar.f = c1168Ii.f;
        bVar.g = c1168Ii.g;
        bVar.h = c1168Ii.h;
        bVar.i = c1168Ii.i;
        bVar.j = c1168Ii.j;
        return bVar;
    }

    public String a() {
        return this.c;
    }

    public String b() {
        return this.e;
    }

    public AbstractC0960Gi c() {
        return this.d;
    }

    public C6381lw d() {
        return this.a;
    }

    public Executor e() {
        return this.b;
    }

    public Integer f() {
        return this.i;
    }

    public Integer g() {
        return this.j;
    }

    public Object h(c cVar) {
        AbstractC7785qy0.o(cVar, SubscriberAttributeKt.JSON_NAME_KEY);
        int i = 0;
        while (true) {
            Object[][] objArr = this.f;
            if (i >= objArr.length) {
                return cVar.b;
            }
            if (cVar.equals(objArr[i][0])) {
                return this.f[i][1];
            }
            i++;
        }
    }

    public List i() {
        return this.g;
    }

    public boolean j() {
        return Boolean.TRUE.equals(this.h);
    }

    public C1168Ii l(AbstractC0960Gi abstractC0960Gi) {
        b bVarK = k(this);
        bVarK.d = abstractC0960Gi;
        return bVarK.b();
    }

    public C1168Ii m(C6381lw c6381lw) {
        b bVarK = k(this);
        bVarK.a = c6381lw;
        return bVarK.b();
    }

    public C1168Ii n(Executor executor) {
        b bVarK = k(this);
        bVarK.b = executor;
        return bVarK.b();
    }

    public C1168Ii o(int i) {
        AbstractC7785qy0.h(i >= 0, "invalid maxsize %s", i);
        b bVarK = k(this);
        bVarK.i = Integer.valueOf(i);
        return bVarK.b();
    }

    public C1168Ii p(int i) {
        AbstractC7785qy0.h(i >= 0, "invalid maxsize %s", i);
        b bVarK = k(this);
        bVarK.j = Integer.valueOf(i);
        return bVarK.b();
    }

    public C1168Ii q(c cVar, Object obj) {
        AbstractC7785qy0.o(cVar, SubscriberAttributeKt.JSON_NAME_KEY);
        AbstractC7785qy0.o(obj, "value");
        b bVarK = k(this);
        int i = 0;
        while (true) {
            Object[][] objArr = this.f;
            if (i >= objArr.length) {
                i = -1;
                break;
            }
            if (cVar.equals(objArr[i][0])) {
                break;
            }
            i++;
        }
        Object[][] objArr2 = (Object[][]) Array.newInstance((Class<?>) Object.class, this.f.length + (i == -1 ? 1 : 0), 2);
        bVarK.f = objArr2;
        Object[][] objArr3 = this.f;
        System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
        if (i == -1) {
            bVarK.f[this.f.length] = new Object[]{cVar, obj};
        } else {
            bVarK.f[i] = new Object[]{cVar, obj};
        }
        return bVarK.b();
    }

    public C1168Ii r(AbstractC3246am.a aVar) {
        ArrayList arrayList = new ArrayList(this.g.size() + 1);
        arrayList.addAll(this.g);
        arrayList.add(aVar);
        b bVarK = k(this);
        bVarK.g = DesugarCollections.unmodifiableList(arrayList);
        return bVarK.b();
    }

    public C1168Ii s() {
        b bVarK = k(this);
        bVarK.h = Boolean.TRUE;
        return bVarK.b();
    }

    public C1168Ii t() {
        b bVarK = k(this);
        bVarK.h = Boolean.FALSE;
        return bVarK.b();
    }

    public String toString() {
        AbstractC6329ll0.b bVarD = AbstractC6329ll0.b(this).d("deadline", this.a).d("authority", this.c).d("callCredentials", this.d);
        Executor executor = this.b;
        return bVarD.d("executor", executor != null ? executor.getClass() : null).d("compressorName", this.e).d("customOptions", Arrays.deepToString(this.f)).e("waitForReady", j()).d("maxInboundMessageSize", this.i).d("maxOutboundMessageSize", this.j).d("streamTracerFactories", this.g).toString();
    }

    public C1168Ii(b bVar) {
        this.a = bVar.a;
        this.b = bVar.b;
        this.c = bVar.c;
        this.d = bVar.d;
        this.e = bVar.e;
        this.f = bVar.f;
        this.g = bVar.g;
        this.h = bVar.h;
        this.i = bVar.i;
        this.j = bVar.j;
    }
}
