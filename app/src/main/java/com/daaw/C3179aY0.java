package com.daaw;

import android.content.Context;
import android.net.Uri;
import java.io.InputStream;

/* JADX INFO: renamed from: com.daaw.aY0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C3179aY0 extends AbstractC0297Aa1 implements InterfaceC0657Dk0 {
    public C3179aY0(Context context, InterfaceC0657Dk0 interfaceC0657Dk0) {
        super(context, interfaceC0657Dk0);
    }

    @Override // com.daaw.AbstractC0297Aa1
    public InterfaceC2177Rv b(Context context, String str) {
        return new MX0(context.getApplicationContext().getAssets(), str);
    }

    @Override // com.daaw.AbstractC0297Aa1
    public InterfaceC2177Rv c(Context context, Uri uri) {
        return new UX0(context, uri);
    }

    /* JADX INFO: renamed from: com.daaw.aY0$a */
    public static class a implements InterfaceC0761Ek0 {
        @Override // com.daaw.InterfaceC0761Ek0
        public InterfaceC0657Dk0 a(Context context, C6799nS c6799nS) {
            return new C3179aY0(context, c6799nS.a(C4840gT.class, InputStream.class));
        }

        @Override // com.daaw.InterfaceC0761Ek0
        public void b() {
        }
    }
}
