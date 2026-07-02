package com.daaw;

import com.daaw.AbstractC6027ki1;

/* JADX INFO: renamed from: com.daaw.zg0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C10216zg0 {
    public final a a;
    public final Object b;
    public final Object c;

    /* JADX INFO: renamed from: com.daaw.zg0$a */
    public static class a {
        public final AbstractC6027ki1.b a;
        public final Object b;
        public final AbstractC6027ki1.b c;
        public final Object d;

        public a(AbstractC6027ki1.b bVar, Object obj, AbstractC6027ki1.b bVar2, Object obj2) {
            this.a = bVar;
            this.b = obj;
            this.c = bVar2;
            this.d = obj2;
        }
    }

    public C10216zg0(AbstractC6027ki1.b bVar, Object obj, AbstractC6027ki1.b bVar2, Object obj2) {
        this.a = new a(bVar, obj, bVar2, obj2);
        this.b = obj;
        this.c = obj2;
    }

    public static int b(a aVar, Object obj, Object obj2) {
        return C7325pK.b(aVar.a, 1, obj) + C7325pK.b(aVar.c, 2, obj2);
    }

    public static C10216zg0 d(AbstractC6027ki1.b bVar, Object obj, AbstractC6027ki1.b bVar2, Object obj2) {
        return new C10216zg0(bVar, obj, bVar2, obj2);
    }

    public static void e(AbstractC10245zm abstractC10245zm, a aVar, Object obj, Object obj2) {
        C7325pK.u(abstractC10245zm, aVar.a, 1, obj);
        C7325pK.u(abstractC10245zm, aVar.c, 2, obj2);
    }

    public int a(int i, Object obj, Object obj2) {
        return AbstractC10245zm.Q(i) + AbstractC10245zm.A(b(this.a, obj, obj2));
    }

    public a c() {
        return this.a;
    }
}
