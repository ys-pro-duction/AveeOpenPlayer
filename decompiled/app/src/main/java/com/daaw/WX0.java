package com.daaw;

import android.content.Context;
import android.net.Uri;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public class WX0 extends SI0 implements InterfaceC0657Dk0 {
    public WX0(Context context, InterfaceC0657Dk0 interfaceC0657Dk0) {
        super(context, interfaceC0657Dk0);
    }

    public static class a implements InterfaceC0761Ek0 {
        @Override // com.daaw.InterfaceC0761Ek0
        public InterfaceC0657Dk0 a(Context context, C6799nS c6799nS) {
            return new WX0(context, c6799nS.a(Uri.class, InputStream.class));
        }

        @Override // com.daaw.InterfaceC0761Ek0
        public void b() {
        }
    }
}
