package com.daaw;

import com.daaw.AbstractC1699Nl;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.Ul, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2451Ul {
    public static final AbstractC1699Nl a = new a();

    /* JADX INFO: renamed from: com.daaw.Ul$b */
    public static class b extends AbstractC3515bk {
        public final AbstractC3515bk a;

        public /* synthetic */ b(AbstractC3515bk abstractC3515bk, InterfaceC2243Sl interfaceC2243Sl, AbstractC2347Tl abstractC2347Tl) {
            this(abstractC3515bk, interfaceC2243Sl);
        }

        @Override // com.daaw.AbstractC3515bk
        public String a() {
            return this.a.a();
        }

        @Override // com.daaw.AbstractC3515bk
        public AbstractC1699Nl e(C6882nk0 c6882nk0, C1168Ii c1168Ii) {
            throw null;
        }

        public b(AbstractC3515bk abstractC3515bk, InterfaceC2243Sl interfaceC2243Sl) {
            this.a = abstractC3515bk;
            AbstractC6314li0.a(AbstractC7785qy0.o(interfaceC2243Sl, "interceptor"));
        }
    }

    public static AbstractC3515bk a(AbstractC3515bk abstractC3515bk, List list) {
        AbstractC7785qy0.o(abstractC3515bk, "channel");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC6314li0.a(it.next());
            AbstractC2347Tl abstractC2347Tl = null;
            abstractC3515bk = new b(abstractC3515bk, abstractC2347Tl, abstractC2347Tl);
        }
        return abstractC3515bk;
    }

    /* JADX INFO: renamed from: com.daaw.Ul$a */
    public class a extends AbstractC1699Nl {
        @Override // com.daaw.AbstractC1699Nl
        public void b() {
        }

        @Override // com.daaw.AbstractC1699Nl
        public void c(int i) {
        }

        @Override // com.daaw.AbstractC1699Nl
        public void d(Object obj) {
        }

        @Override // com.daaw.AbstractC1699Nl
        public void a(String str, Throwable th) {
        }

        @Override // com.daaw.AbstractC1699Nl
        public void e(AbstractC1699Nl.a aVar, C2756Xj0 c2756Xj0) {
        }
    }
}
