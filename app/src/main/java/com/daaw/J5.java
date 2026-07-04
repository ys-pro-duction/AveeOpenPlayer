package com.daaw;

import android.content.Context;
import android.graphics.Typeface;
import com.daaw.AbstractC4512fJ0;
import com.daaw.CO;

/* JADX INFO: loaded from: classes.dex */
public final class J5 implements InterfaceC2592Vu0 {
    public final Context a;
    public final Object b;

    public J5(Context context) {
        G10.g(context, "context");
        this.a = context.getApplicationContext();
    }

    @Override // com.daaw.InterfaceC2592Vu0
    public Object a(InterfaceC6225lO interfaceC6225lO, InterfaceC1416Ks interfaceC1416Ks) {
        if (interfaceC6225lO instanceof PI0) {
            Context context = this.a;
            G10.f(context, "context");
            Object objD = K5.d((PI0) interfaceC6225lO, context, interfaceC1416Ks);
            return objD == I10.c() ? objD : (Typeface) objD;
        }
        throw new IllegalArgumentException("Unknown font type: " + interfaceC6225lO);
    }

    @Override // com.daaw.InterfaceC2592Vu0
    public Object c() {
        return this.b;
    }

    @Override // com.daaw.InterfaceC2592Vu0
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Typeface b(InterfaceC6225lO interfaceC6225lO) {
        Object objA;
        G10.g(interfaceC6225lO, "font");
        if (!(interfaceC6225lO instanceof PI0)) {
            return null;
        }
        int iA = interfaceC6225lO.a();
        CO.a aVar = CO.a;
        if (CO.e(iA, aVar.b())) {
            Context context = this.a;
            G10.f(context, "context");
            return K5.c((PI0) interfaceC6225lO, context);
        }
        if (!CO.e(iA, aVar.c())) {
            if (CO.e(iA, aVar.a())) {
                throw new UnsupportedOperationException("Unsupported Async font load path");
            }
            throw new IllegalArgumentException("Unknown loading type " + ((Object) CO.g(interfaceC6225lO.a())));
        }
        try {
            AbstractC4512fJ0.a aVar2 = AbstractC4512fJ0.B;
            Context context2 = this.a;
            G10.f(context2, "context");
            objA = AbstractC4512fJ0.a(K5.c((PI0) interfaceC6225lO, context2));
        } catch (Throwable th) {
            AbstractC4512fJ0.a aVar3 = AbstractC4512fJ0.B;
            objA = AbstractC4512fJ0.a(AbstractC4801gJ0.a(th));
        }
        return (Typeface) (AbstractC4512fJ0.c(objA) ? null : objA);
    }
}
