package com.daaw;

/* JADX INFO: renamed from: com.daaw.Ck, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC0543Ck {

    /* JADX INFO: renamed from: com.daaw.Ck$a */
    public static final class a {
        public static String a(InterfaceC0543Ck interfaceC0543Ck, InterfaceC8468tR interfaceC8468tR) {
            G10.g(interfaceC8468tR, "functionDescriptor");
            if (interfaceC0543Ck.b(interfaceC8468tR)) {
                return null;
            }
            return interfaceC0543Ck.getDescription();
        }
    }

    String a(InterfaceC8468tR interfaceC8468tR);

    boolean b(InterfaceC8468tR interfaceC8468tR);

    String getDescription();
}
