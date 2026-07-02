package com.daaw;

import com.daaw.InterfaceC4684ft;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;

/* JADX INFO: renamed from: com.daaw.hl0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC5203hl0 extends InterfaceC4684ft.b {
    public static final b n = b.B;

    /* JADX INFO: renamed from: com.daaw.hl0$a */
    public static final class a {
        public static Object a(InterfaceC5203hl0 interfaceC5203hl0, Object obj, InterfaceC3429bR interfaceC3429bR) {
            G10.g(interfaceC3429bR, "operation");
            return InterfaceC4684ft.b.a.a(interfaceC5203hl0, obj, interfaceC3429bR);
        }

        public static InterfaceC4684ft.b b(InterfaceC5203hl0 interfaceC5203hl0, InterfaceC4684ft.c cVar) {
            G10.g(cVar, SubscriberAttributeKt.JSON_NAME_KEY);
            return InterfaceC4684ft.b.a.b(interfaceC5203hl0, cVar);
        }

        public static InterfaceC4684ft c(InterfaceC5203hl0 interfaceC5203hl0, InterfaceC4684ft.c cVar) {
            G10.g(cVar, SubscriberAttributeKt.JSON_NAME_KEY);
            return InterfaceC4684ft.b.a.c(interfaceC5203hl0, cVar);
        }

        public static InterfaceC4684ft d(InterfaceC5203hl0 interfaceC5203hl0, InterfaceC4684ft interfaceC4684ft) {
            G10.g(interfaceC4684ft, "context");
            return InterfaceC4684ft.b.a.d(interfaceC5203hl0, interfaceC4684ft);
        }
    }

    /* JADX INFO: renamed from: com.daaw.hl0$b */
    public static final class b implements InterfaceC4684ft.c {
        public static final /* synthetic */ b B = new b();
    }

    Object p0(NQ nq, InterfaceC1416Ks interfaceC1416Ks);
}
