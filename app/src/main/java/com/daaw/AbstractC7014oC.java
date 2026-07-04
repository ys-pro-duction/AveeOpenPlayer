package com.daaw;

import com.daaw.AbstractC4512fJ0;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: com.daaw.oC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC7014oC extends AbstractRunnableC6684n11 {
    public int D;

    public AbstractC7014oC(int i) {
        this.D = i;
    }

    public abstract void a(Object obj, Throwable th);

    public abstract InterfaceC1416Ks c();

    public Throwable d(Object obj) {
        C2041Qn c2041Qn = obj instanceof C2041Qn ? (C2041Qn) obj : null;
        if (c2041Qn != null) {
            return c2041Qn.a;
        }
        return null;
    }

    public final void f(Throwable th, Throwable th2) throws IllegalAccessException, InvocationTargetException {
        if (th == null && th2 == null) {
            return;
        }
        if (th != null && th2 != null) {
            AbstractC7596qI.a(th, th2);
        }
        if (th == null) {
            th = th2;
        }
        G10.d(th);
        AbstractC6926nt.a(c().getContext(), new C8878ut("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    public abstract Object g();

    @Override // java.lang.Runnable
    public final void run() throws IllegalAccessException, InvocationTargetException {
        Object objA;
        Object objA2;
        InterfaceC7799r11 interfaceC7799r11 = this.C;
        try {
            InterfaceC1416Ks interfaceC1416KsC = c();
            G10.e(interfaceC1416KsC, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            C6177lC c6177lC = (C6177lC) interfaceC1416KsC;
            InterfaceC1416Ks interfaceC1416Ks = c6177lC.F;
            Object obj = c6177lC.H;
            InterfaceC4684ft context = interfaceC1416Ks.getContext();
            Object objC = AbstractC5010h31.c(context, obj);
            C10078z91 c10078z91G = objC != AbstractC5010h31.a ? AbstractC4963gt.g(interfaceC1416Ks, context, objC) : null;
            try {
                InterfaceC4684ft context2 = interfaceC1416Ks.getContext();
                Object objG = g();
                Throwable thD = d(objG);
                U30 u30 = (thD == null && AbstractC7293pC.b(this.D)) ? (U30) context2.a(U30.k) : null;
                if (u30 != null && !u30.d()) {
                    CancellationException cancellationExceptionR = u30.R();
                    a(objG, cancellationExceptionR);
                    AbstractC4512fJ0.a aVar = AbstractC4512fJ0.B;
                    interfaceC1416Ks.x(AbstractC4512fJ0.a(AbstractC4801gJ0.a(cancellationExceptionR)));
                } else if (thD != null) {
                    AbstractC4512fJ0.a aVar2 = AbstractC4512fJ0.B;
                    interfaceC1416Ks.x(AbstractC4512fJ0.a(AbstractC4801gJ0.a(thD)));
                } else {
                    AbstractC4512fJ0.a aVar3 = AbstractC4512fJ0.B;
                    interfaceC1416Ks.x(AbstractC4512fJ0.a(e(objG)));
                }
                G91 g91 = G91.a;
                if (c10078z91G == null || c10078z91G.V0()) {
                    AbstractC5010h31.a(context, objC);
                }
                try {
                    interfaceC7799r11.a();
                    objA2 = AbstractC4512fJ0.a(G91.a);
                } catch (Throwable th) {
                    AbstractC4512fJ0.a aVar4 = AbstractC4512fJ0.B;
                    objA2 = AbstractC4512fJ0.a(AbstractC4801gJ0.a(th));
                }
                f(null, AbstractC4512fJ0.b(objA2));
            } catch (Throwable th2) {
                if (c10078z91G == null || c10078z91G.V0()) {
                    AbstractC5010h31.a(context, objC);
                }
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                AbstractC4512fJ0.a aVar5 = AbstractC4512fJ0.B;
                interfaceC7799r11.a();
                objA = AbstractC4512fJ0.a(G91.a);
            } catch (Throwable th4) {
                AbstractC4512fJ0.a aVar6 = AbstractC4512fJ0.B;
                objA = AbstractC4512fJ0.a(AbstractC4801gJ0.a(th4));
            }
            f(th3, AbstractC4512fJ0.b(objA));
        }
    }

    public Object e(Object obj) {
        return obj;
    }
}
