package com.daaw;

import com.daaw.InterfaceC6002kd1;

/* JADX INFO: renamed from: com.daaw.jd1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC5723jd1 extends InterfaceC6002kd1 {

    /* JADX INFO: renamed from: com.daaw.jd1$a */
    public static final class a {
        public static long a(InterfaceC5723jd1 interfaceC5723jd1, AbstractC8664u7 abstractC8664u7, AbstractC8664u7 abstractC8664u72, AbstractC8664u7 abstractC8664u73) {
            G10.g(interfaceC5723jd1, "this");
            G10.g(abstractC8664u7, "initialValue");
            G10.g(abstractC8664u72, "targetValue");
            G10.g(abstractC8664u73, "initialVelocity");
            return ((long) (interfaceC5723jd1.e() + interfaceC5723jd1.f())) * 1000000;
        }

        public static AbstractC8664u7 b(InterfaceC5723jd1 interfaceC5723jd1, AbstractC8664u7 abstractC8664u7, AbstractC8664u7 abstractC8664u72, AbstractC8664u7 abstractC8664u73) {
            G10.g(interfaceC5723jd1, "this");
            G10.g(abstractC8664u7, "initialValue");
            G10.g(abstractC8664u72, "targetValue");
            G10.g(abstractC8664u73, "initialVelocity");
            return InterfaceC6002kd1.a.a(interfaceC5723jd1, abstractC8664u7, abstractC8664u72, abstractC8664u73);
        }

        public static boolean c(InterfaceC5723jd1 interfaceC5723jd1) {
            G10.g(interfaceC5723jd1, "this");
            return InterfaceC6002kd1.a.b(interfaceC5723jd1);
        }
    }

    int e();

    int f();
}
