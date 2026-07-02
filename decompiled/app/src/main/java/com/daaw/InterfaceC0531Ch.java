package com.daaw;

import java.util.ServiceLoader;

/* JADX INFO: renamed from: com.daaw.Ch, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC0531Ch {
    public static final a a = a.a;

    /* JADX INFO: renamed from: com.daaw.Ch$a */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        public static final O90 b = AbstractC3192ab0.b(EnumC7395pb0.C, C0427Bh.B);

        public static final InterfaceC0531Ch a() {
            ServiceLoader serviceLoaderLoad = ServiceLoader.load(InterfaceC0531Ch.class, InterfaceC0531Ch.class.getClassLoader());
            G10.d(serviceLoaderLoad);
            InterfaceC0531Ch interfaceC0531Ch = (InterfaceC0531Ch) AbstractC2455Um.f0(serviceLoaderLoad);
            if (interfaceC0531Ch != null) {
                return interfaceC0531Ch;
            }
            throw new IllegalStateException("No BuiltInsLoader implementation was found. Please ensure that the META-INF/services/ is not stripped from your application and that the Java virtual machine is not running under a security manager");
        }

        public final InterfaceC0531Ch c() {
            return (InterfaceC0531Ch) b.getValue();
        }
    }

    InterfaceC2580Vr0 a(InterfaceC10174zX0 interfaceC10174zX0, InterfaceC2968Zk0 interfaceC2968Zk0, Iterable iterable, InterfaceC2280Su0 interfaceC2280Su0, Z2 z2, boolean z);
}
