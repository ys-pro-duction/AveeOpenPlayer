package com.daaw;

import com.daaw.AbstractC4512fJ0;

/* JADX INFO: loaded from: classes4.dex */
public abstract class RV0 {
    public static final StackTraceElement a = new C5990kb().a();
    public static final String b;
    public static final String c;

    static {
        Object objA;
        Object objA2;
        try {
            AbstractC4512fJ0.a aVar = AbstractC4512fJ0.B;
            objA = AbstractC4512fJ0.a(AbstractC7409pe.class.getCanonicalName());
        } catch (Throwable th) {
            AbstractC4512fJ0.a aVar2 = AbstractC4512fJ0.B;
            objA = AbstractC4512fJ0.a(AbstractC4801gJ0.a(th));
        }
        if (AbstractC4512fJ0.b(objA) != null) {
            objA = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        b = (String) objA;
        try {
            objA2 = AbstractC4512fJ0.a(RV0.class.getCanonicalName());
        } catch (Throwable th2) {
            AbstractC4512fJ0.a aVar3 = AbstractC4512fJ0.B;
            objA2 = AbstractC4512fJ0.a(AbstractC4801gJ0.a(th2));
        }
        if (AbstractC4512fJ0.b(objA2) != null) {
            objA2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
        c = (String) objA2;
    }

    public static final Throwable a(Throwable th) {
        return th;
    }
}
