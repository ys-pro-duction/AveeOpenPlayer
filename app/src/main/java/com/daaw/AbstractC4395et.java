package com.daaw;

import com.daaw.AbstractC1791Oi;
import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: com.daaw.et, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4395et {

    /* JADX INFO: renamed from: com.daaw.et$a */
    public static final class a extends AbstractC4192e90 implements NQ {
        public final /* synthetic */ AbstractC1791Oi.a B;
        public final /* synthetic */ InterfaceC8062ry C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC1791Oi.a aVar, InterfaceC8062ry interfaceC8062ry) {
            super(1);
            this.B = aVar;
            this.C = interfaceC8062ry;
        }

        public final void a(Throwable th) {
            if (th == null) {
                this.B.b(this.C.s());
            } else if (th instanceof CancellationException) {
                this.B.c();
            } else {
                this.B.e(th);
            }
        }

        @Override // com.daaw.NQ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return G91.a;
        }
    }

    public static final InterfaceFutureC8236sc0 b(final InterfaceC8062ry interfaceC8062ry, final Object obj) {
        G10.g(interfaceC8062ry, "<this>");
        InterfaceFutureC8236sc0 interfaceFutureC8236sc0A = AbstractC1791Oi.a(new AbstractC1791Oi.c() { // from class: com.daaw.dt
            @Override // com.daaw.AbstractC1791Oi.c
            public final Object a(AbstractC1791Oi.a aVar) {
                return AbstractC4395et.d(interfaceC8062ry, obj, aVar);
            }
        });
        G10.f(interfaceFutureC8236sc0A, "getFuture { completer ->…        }\n    }\n    tag\n}");
        return interfaceFutureC8236sc0A;
    }

    public static /* synthetic */ InterfaceFutureC8236sc0 c(InterfaceC8062ry interfaceC8062ry, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = "Deferred.asListenableFuture";
        }
        return b(interfaceC8062ry, obj);
    }

    public static final Object d(InterfaceC8062ry interfaceC8062ry, Object obj, AbstractC1791Oi.a aVar) {
        G10.g(interfaceC8062ry, "$this_asListenableFuture");
        G10.g(aVar, "completer");
        interfaceC8062ry.E0(new a(aVar, interfaceC8062ry));
        return obj;
    }
}
