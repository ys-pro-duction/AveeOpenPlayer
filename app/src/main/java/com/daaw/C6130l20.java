package com.daaw;

/* JADX INFO: renamed from: com.daaw.l20, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C6130l20 extends AbstractC5842k20 {

    /* JADX INFO: renamed from: com.daaw.l20$a */
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

    @Override // com.daaw.AbstractC2800Xu0
    public AbstractC6465mE0 b() {
        return c(34) ? new C5811jv0() : super.b();
    }

    public final boolean c(int i) {
        Integer num = a.b;
        return num == null || num.intValue() >= i;
    }
}
