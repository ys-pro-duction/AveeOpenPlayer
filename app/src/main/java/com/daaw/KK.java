package com.daaw;

import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;

/* JADX INFO: loaded from: classes.dex */
public class KK extends AbstractC0297Aa1 implements InterfaceC0657Dk0 {
    public KK(Context context, InterfaceC0657Dk0 interfaceC0657Dk0) {
        super(context, interfaceC0657Dk0);
    }

    @Override // com.daaw.AbstractC0297Aa1
    public InterfaceC2177Rv b(Context context, String str) {
        return new DK(context.getApplicationContext().getAssets(), str);
    }

    @Override // com.daaw.AbstractC0297Aa1
    public InterfaceC2177Rv c(Context context, Uri uri) {
        return new HK(context, uri);
    }

    public static class a implements InterfaceC0761Ek0 {
        @Override // com.daaw.InterfaceC0761Ek0
        public InterfaceC0657Dk0 a(Context context, C6799nS c6799nS) {
            return new KK(context, c6799nS.a(C4840gT.class, ParcelFileDescriptor.class));
        }

        @Override // com.daaw.InterfaceC0761Ek0
        public void b() {
        }
    }
}
