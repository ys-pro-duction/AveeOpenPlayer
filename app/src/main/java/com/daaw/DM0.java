package com.daaw;

import com.daaw.AbstractC4512fJ0;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes3.dex */
public final class DM0 implements InterfaceC1416Ks, InterfaceC8320st {
    public static final a C = new a(null);
    public static final AtomicReferenceFieldUpdater D = AtomicReferenceFieldUpdater.newUpdater(DM0.class, Object.class, "result");
    public final InterfaceC1416Ks B;
    private volatile Object result;

    public static final class a {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public a() {
        }
    }

    public DM0(InterfaceC1416Ks interfaceC1416Ks, Object obj) {
        G10.g(interfaceC1416Ks, "delegate");
        this.B = interfaceC1416Ks;
        this.result = obj;
    }

    public final Object a() throws Throwable {
        Object obj = this.result;
        EnumC8041rt enumC8041rt = EnumC8041rt.C;
        if (obj == enumC8041rt) {
            if (AbstractC5549j0.a(D, this, enumC8041rt, I10.c())) {
                return I10.c();
            }
            obj = this.result;
        }
        if (obj == EnumC8041rt.D) {
            return I10.c();
        }
        if (obj instanceof AbstractC4512fJ0.b) {
            throw ((AbstractC4512fJ0.b) obj).B;
        }
        return obj;
    }

    @Override // com.daaw.InterfaceC1416Ks
    public InterfaceC4684ft getContext() {
        return this.B.getContext();
    }

    @Override // com.daaw.InterfaceC8320st
    public InterfaceC8320st h() {
        InterfaceC1416Ks interfaceC1416Ks = this.B;
        if (interfaceC1416Ks instanceof InterfaceC8320st) {
            return (InterfaceC8320st) interfaceC1416Ks;
        }
        return null;
    }

    public String toString() {
        return "SafeContinuation for " + this.B;
    }

    @Override // com.daaw.InterfaceC1416Ks
    public void x(Object obj) {
        while (true) {
            Object obj2 = this.result;
            EnumC8041rt enumC8041rt = EnumC8041rt.C;
            if (obj2 == enumC8041rt) {
                if (AbstractC5549j0.a(D, this, enumC8041rt, obj)) {
                    return;
                }
            } else {
                if (obj2 != I10.c()) {
                    throw new IllegalStateException("Already resumed");
                }
                if (AbstractC5549j0.a(D, this, I10.c(), EnumC8041rt.D)) {
                    this.B.x(obj);
                    return;
                }
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DM0(InterfaceC1416Ks interfaceC1416Ks) {
        this(interfaceC1416Ks, EnumC8041rt.C);
        G10.g(interfaceC1416Ks, "delegate");
    }
}
