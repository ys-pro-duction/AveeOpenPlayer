package com.daaw;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes3.dex */
public final class N43 implements InterfaceC8100s53 {
    public static final S43 b = new H43();
    public final S43 a;

    public N43() {
        S43 s43;
        C3613c43 c3613c43C = C3613c43.c();
        try {
            s43 = (S43) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            s43 = b;
        }
        M43 m43 = new M43(c3613c43C, s43);
        Charset charset = AbstractC8374t43.a;
        this.a = m43;
    }

    public static boolean b(R43 r43) {
        return r43.zzc() + (-1) != 1;
    }

    @Override // com.daaw.InterfaceC8100s53
    public final InterfaceC7821r53 a(Class cls) {
        AbstractC8379t53.y(cls);
        R43 r43A = this.a.a(cls);
        return r43A.zzb() ? AbstractC4449f43.class.isAssignableFrom(cls) ? Y43.i(AbstractC8379t53.u(), X33.b(), r43A.zza()) : Y43.i(AbstractC8379t53.t(), X33.a(), r43A.zza()) : AbstractC4449f43.class.isAssignableFrom(cls) ? b(r43A) ? X43.E(cls, r43A, AbstractC3061a53.b(), F43.e(), AbstractC8379t53.u(), X33.b(), Q43.b()) : X43.E(cls, r43A, AbstractC3061a53.b(), F43.e(), AbstractC8379t53.u(), null, Q43.b()) : b(r43A) ? X43.E(cls, r43A, AbstractC3061a53.a(), F43.d(), AbstractC8379t53.t(), X33.a(), Q43.a()) : X43.E(cls, r43A, AbstractC3061a53.a(), F43.d(), AbstractC8379t53.t(), null, Q43.a());
    }
}
