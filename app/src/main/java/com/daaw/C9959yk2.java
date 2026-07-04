package com.daaw;

import java.nio.charset.Charset;

/* JADX INFO: renamed from: com.daaw.yk2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9959yk2 implements InterfaceC2394Tw2 {
    public static final InterfaceC5220ho2 b = new C7716qj2();
    public final InterfaceC5220ho2 a;

    public C9959yk2() {
        InterfaceC5220ho2 interfaceC5220ho2;
        C3592c02 c3592c02C = C3592c02.c();
        try {
            interfaceC5220ho2 = (InterfaceC5220ho2) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            interfaceC5220ho2 = b;
        }
        C2446Uj2 c2446Uj2 = new C2446Uj2(c3592c02C, interfaceC5220ho2);
        Charset charset = J82.a;
        this.a = c2446Uj2;
    }

    public static boolean b(InterfaceC8014rn2 interfaceC8014rn2) {
        return interfaceC8014rn2.zzc() + (-1) != 1;
    }

    @Override // com.daaw.InterfaceC2394Tw2
    public final InterfaceC7500pw2 a(Class cls) {
        AbstractC9742xx2.y(cls);
        InterfaceC8014rn2 interfaceC8014rn2A = this.a.a(cls);
        return interfaceC8014rn2A.zzb() ? F32.class.isAssignableFrom(cls) ? C1207Ir2.h(AbstractC9742xx2.u(), AbstractC8211sW1.b(), interfaceC8014rn2A.zza()) : C1207Ir2.h(AbstractC9742xx2.t(), AbstractC8211sW1.a(), interfaceC8014rn2A.zza()) : F32.class.isAssignableFrom(cls) ? b(interfaceC8014rn2A) ? C4109dr2.y(cls, interfaceC8014rn2A, AbstractC8881ut2.b(), AbstractC5468ii2.d(), AbstractC9742xx2.u(), AbstractC8211sW1.b(), AbstractC1602Mm2.b()) : C4109dr2.y(cls, interfaceC8014rn2A, AbstractC8881ut2.b(), AbstractC5468ii2.d(), AbstractC9742xx2.u(), null, AbstractC1602Mm2.b()) : b(interfaceC8014rn2A) ? C4109dr2.y(cls, interfaceC8014rn2A, AbstractC8881ut2.a(), AbstractC5468ii2.c(), AbstractC9742xx2.t(), AbstractC8211sW1.a(), AbstractC1602Mm2.a()) : C4109dr2.y(cls, interfaceC8014rn2A, AbstractC8881ut2.a(), AbstractC5468ii2.c(), AbstractC9742xx2.t(), null, AbstractC1602Mm2.a());
    }
}
