package com.daaw;

import com.daaw.AbstractC4512fJ0;
import java.io.Serializable;

/* JADX INFO: renamed from: com.daaw.pe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7409pe implements InterfaceC1416Ks, InterfaceC8320st, Serializable {
    public final InterfaceC1416Ks B;

    public AbstractC7409pe(InterfaceC1416Ks interfaceC1416Ks) {
        this.B = interfaceC1416Ks;
    }

    public InterfaceC1416Ks a(Object obj, InterfaceC1416Ks interfaceC1416Ks) {
        G10.g(interfaceC1416Ks, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public InterfaceC8320st h() {
        InterfaceC1416Ks interfaceC1416Ks = this.B;
        if (interfaceC1416Ks instanceof InterfaceC8320st) {
            return (InterfaceC8320st) interfaceC1416Ks;
        }
        return null;
    }

    public final InterfaceC1416Ks l() {
        return this.B;
    }

    public StackTraceElement n() {
        return AbstractC7218ow.d(this);
    }

    public abstract Object q(Object obj);

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Continuation at ");
        Object objN = n();
        if (objN == null) {
            objN = getClass().getName();
        }
        sb.append(objN);
        return sb.toString();
    }

    @Override // com.daaw.InterfaceC1416Ks
    public final void x(Object obj) {
        Object objQ;
        InterfaceC1416Ks interfaceC1416Ks = this;
        while (true) {
            AbstractC7497pw.b(interfaceC1416Ks);
            AbstractC7409pe abstractC7409pe = (AbstractC7409pe) interfaceC1416Ks;
            InterfaceC1416Ks interfaceC1416Ks2 = abstractC7409pe.B;
            G10.d(interfaceC1416Ks2);
            try {
                objQ = abstractC7409pe.q(obj);
            } catch (Throwable th) {
                AbstractC4512fJ0.a aVar = AbstractC4512fJ0.B;
                obj = AbstractC4512fJ0.a(AbstractC4801gJ0.a(th));
            }
            if (objQ == I10.c()) {
                return;
            }
            obj = AbstractC4512fJ0.a(objQ);
            abstractC7409pe.s();
            if (!(interfaceC1416Ks2 instanceof AbstractC7409pe)) {
                interfaceC1416Ks2.x(obj);
                return;
            }
            interfaceC1416Ks = interfaceC1416Ks2;
        }
    }

    public void s() {
    }
}
