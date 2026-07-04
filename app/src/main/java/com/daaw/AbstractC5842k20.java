package com.daaw;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: com.daaw.k20, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5842k20 extends AbstractC2800Xu0 {

    /* JADX INFO: renamed from: com.daaw.k20$a */
    public static final class a {
        public static final a a = new a();
        public static final Integer b;

        static {
            Object obj;
            Integer num = null;
            try {
                obj = Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
            } catch (Throwable unused) {
            }
            Integer num2 = obj instanceof Integer ? (Integer) obj : null;
            if (num2 != null && num2.intValue() > 0) {
                num = num2;
            }
            b = num;
        }
    }

    private final boolean c(int i) {
        Integer num = a.b;
        return num == null || num.intValue() >= i;
    }

    @Override // com.daaw.AbstractC2800Xu0
    public void a(Throwable th, Throwable th2) throws IllegalAccessException, InvocationTargetException {
        G10.g(th, "cause");
        G10.g(th2, "exception");
        if (c(19)) {
            th.addSuppressed(th2);
        } else {
            super.a(th, th2);
        }
    }
}
