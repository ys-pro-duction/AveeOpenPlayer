package com.daaw;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: com.daaw.Eq0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC0785Eq0 {

    /* JADX INFO: renamed from: com.daaw.Eq0$a */
    public static final class a extends AbstractC4192e90 implements NQ {
        public final /* synthetic */ NQ B;
        public final /* synthetic */ Object C;
        public final /* synthetic */ InterfaceC4684ft D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(NQ nq, Object obj, InterfaceC4684ft interfaceC4684ft) {
            super(1);
            this.B = nq;
            this.C = obj;
            this.D = interfaceC4684ft;
        }

        public final void a(Throwable th) throws IllegalAccessException, InvocationTargetException {
            AbstractC0785Eq0.b(this.B, this.C, this.D);
        }

        @Override // com.daaw.NQ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) throws IllegalAccessException, InvocationTargetException {
            a((Throwable) obj);
            return G91.a;
        }
    }

    public static final NQ a(NQ nq, Object obj, InterfaceC4684ft interfaceC4684ft) {
        return new a(nq, obj, interfaceC4684ft);
    }

    public static final void b(NQ nq, Object obj, InterfaceC4684ft interfaceC4684ft) throws IllegalAccessException, InvocationTargetException {
        C9520x91 c9520x91C = c(nq, obj, null);
        if (c9520x91C != null) {
            AbstractC6926nt.a(interfaceC4684ft, c9520x91C);
        }
    }

    public static final C9520x91 c(NQ nq, Object obj, C9520x91 c9520x91) throws IllegalAccessException, InvocationTargetException {
        try {
            nq.invoke(obj);
            return c9520x91;
        } catch (Throwable th) {
            if (c9520x91 != null && c9520x91.getCause() != th) {
                AbstractC7596qI.a(c9520x91, th);
                return c9520x91;
            }
            return new C9520x91("Exception in undelivered element handler for " + obj, th);
        }
    }

    public static /* synthetic */ C9520x91 d(NQ nq, Object obj, C9520x91 c9520x91, int i, Object obj2) {
        if ((i & 2) != 0) {
            c9520x91 = null;
        }
        return c(nq, obj, c9520x91);
    }
}
