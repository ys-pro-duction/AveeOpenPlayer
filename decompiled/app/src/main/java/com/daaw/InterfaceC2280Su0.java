package com.daaw;

/* JADX INFO: renamed from: com.daaw.Su0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC2280Su0 {

    /* JADX INFO: renamed from: com.daaw.Su0$a */
    public static final class a implements InterfaceC2280Su0 {
        public static final a a = new a();

        @Override // com.daaw.InterfaceC2280Su0
        public boolean b(InterfaceC4923gl interfaceC4923gl, IS0 is0) {
            G10.g(interfaceC4923gl, "classDescriptor");
            G10.g(is0, "functionDescriptor");
            return true;
        }
    }

    /* JADX INFO: renamed from: com.daaw.Su0$b */
    public static final class b implements InterfaceC2280Su0 {
        public static final b a = new b();

        @Override // com.daaw.InterfaceC2280Su0
        public boolean b(InterfaceC4923gl interfaceC4923gl, IS0 is0) {
            G10.g(interfaceC4923gl, "classDescriptor");
            G10.g(is0, "functionDescriptor");
            return !is0.getAnnotations().z(AbstractC2384Tu0.a());
        }
    }

    boolean b(InterfaceC4923gl interfaceC4923gl, IS0 is0);
}
