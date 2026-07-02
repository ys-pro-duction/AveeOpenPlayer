package com.daaw;

import java.security.GeneralSecurityException;

/* JADX INFO: renamed from: com.daaw.wT2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9323wT2 implements InterfaceC9044vT2 {
    public final AbstractC5697jX2 a;
    public final Class b;

    public C9323wT2(AbstractC5697jX2 abstractC5697jX2, Class cls) {
        if (!abstractC5697jX2.j().contains(cls) && !Void.class.equals(cls)) {
            throw new IllegalArgumentException(String.format("Given internalKeyMananger %s does not support primitive class %s", abstractC5697jX2.toString(), cls.getName()));
        }
        this.a = abstractC5697jX2;
        this.b = cls;
    }

    @Override // com.daaw.InterfaceC9044vT2
    public final Object a(AbstractC9213w33 abstractC9213w33) throws GeneralSecurityException {
        try {
            U43 u43C = this.a.c(abstractC9213w33);
            if (Void.class.equals(this.b)) {
                throw new GeneralSecurityException("Cannot create a primitive for Void");
            }
            this.a.e(u43C);
            return this.a.i(u43C, this.b);
        } catch (C8939v43 e) {
            throw new GeneralSecurityException("Failures parsing proto of type ".concat(this.a.h().getName()), e);
        }
    }

    @Override // com.daaw.InterfaceC9044vT2
    public final C6965o13 b(AbstractC9213w33 abstractC9213w33) throws GeneralSecurityException {
        try {
            AbstractC5417iX2 abstractC5417iX2A = this.a.a();
            U43 u43B = abstractC5417iX2A.b(abstractC9213w33);
            abstractC5417iX2A.d(u43B);
            U43 u43A = abstractC5417iX2A.a(u43B);
            C6128l13 c6128l13M = C6965o13.M();
            c6128l13M.o(this.a.d());
            c6128l13M.p(u43A.d());
            c6128l13M.n(this.a.b());
            return (C6965o13) c6128l13M.j();
        } catch (C8939v43 e) {
            throw new GeneralSecurityException("Unexpected proto", e);
        }
    }

    @Override // com.daaw.InterfaceC9044vT2
    public final String zzc() {
        return this.a.d();
    }
}
