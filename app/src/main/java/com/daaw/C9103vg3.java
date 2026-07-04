package com.daaw;

import java.nio.charset.Charset;

/* JADX INFO: renamed from: com.daaw.vg3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9103vg3 implements InterfaceC5464ih3 {
    public static final Gg3 b = new C5181hg3();
    public final Gg3 a;

    public C9103vg3() {
        Gg3 gg3;
        Ge3 ge3C = Ge3.c();
        try {
            gg3 = (Gg3) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            gg3 = b;
        }
        C5740jg3 c5740jg3 = new C5740jg3(ge3C, gg3);
        Charset charset = AbstractC10214zf3.a;
        this.a = c5740jg3;
    }

    public static boolean b(Eg3 eg3) {
        return eg3.zzc() == 1;
    }

    @Override // com.daaw.InterfaceC5464ih3
    public final InterfaceC4907gh3 a(Class cls) {
        AbstractC6024kh3.c(cls);
        Eg3 eg3A = this.a.a(cls);
        return eg3A.zzb() ? AbstractC3772cf3.class.isAssignableFrom(cls) ? Sg3.h(AbstractC6024kh3.V(), AbstractC7692qe3.b(), eg3A.zza()) : Sg3.h(AbstractC6024kh3.U(), AbstractC7692qe3.a(), eg3A.zza()) : AbstractC3772cf3.class.isAssignableFrom(cls) ? b(eg3A) ? Qg3.F(cls, eg3A, Wg3.b(), AbstractC4056dg3.d(), AbstractC6024kh3.V(), AbstractC7692qe3.b(), Cg3.b()) : Qg3.F(cls, eg3A, Wg3.b(), AbstractC4056dg3.d(), AbstractC6024kh3.V(), null, Cg3.b()) : b(eg3A) ? Qg3.F(cls, eg3A, Wg3.a(), AbstractC4056dg3.c(), AbstractC6024kh3.U(), AbstractC7692qe3.a(), Cg3.a()) : Qg3.F(cls, eg3A, Wg3.a(), AbstractC4056dg3.c(), AbstractC6024kh3.U(), null, Cg3.a());
    }
}
