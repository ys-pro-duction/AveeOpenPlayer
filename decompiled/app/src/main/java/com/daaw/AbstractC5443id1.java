package com.daaw;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.id1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5443id1 {

    /* JADX INFO: renamed from: com.daaw.id1$a */
    public static final class a implements InterfaceC9229w7 {
        public final List a;
        public final /* synthetic */ AbstractC8664u7 b;
        public final /* synthetic */ float c;
        public final /* synthetic */ float d;

        public a(AbstractC8664u7 abstractC8664u7, float f, float f2) {
            this.b = abstractC8664u7;
            this.c = f;
            this.d = f2;
            H00 h00Q = AbstractC8417tE0.q(0, abstractC8664u7.b());
            ArrayList arrayList = new ArrayList(AbstractC1703Nm.v(h00Q, 10));
            Iterator it = h00Q.iterator();
            while (it.hasNext()) {
                arrayList.add(new C5095hN(f, f2, abstractC8664u7.a(((A00) it).b())));
            }
            this.a = arrayList;
        }

        @Override // com.daaw.InterfaceC9229w7
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C5095hN get(int i) {
            return (C5095hN) this.a.get(i);
        }
    }

    /* JADX INFO: renamed from: com.daaw.id1$b */
    public static final class b implements InterfaceC9229w7 {
        public final C5095hN a;
        public final /* synthetic */ float b;
        public final /* synthetic */ float c;

        public b(float f, float f2) {
            this.b = f;
            this.c = f2;
            this.a = new C5095hN(f, f2, 0.0f, 4, null);
        }

        @Override // com.daaw.InterfaceC9229w7
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C5095hN get(int i) {
            return this.a;
        }
    }

    public static final InterfaceC9229w7 b(AbstractC8664u7 abstractC8664u7, float f, float f2) {
        return abstractC8664u7 != null ? new a(abstractC8664u7, f, f2) : new b(f, f2);
    }
}
