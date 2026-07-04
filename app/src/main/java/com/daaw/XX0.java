package com.daaw;

import android.content.Context;
import android.net.Uri;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public class XX0 extends AbstractC4582fY0 implements InterfaceC0657Dk0 {
    public XX0(InterfaceC0657Dk0 interfaceC0657Dk0) {
        super(interfaceC0657Dk0);
    }

    public static class a implements InterfaceC0761Ek0 {
        @Override // com.daaw.InterfaceC0761Ek0
        public InterfaceC0657Dk0 a(Context context, C6799nS c6799nS) {
            return new XX0(c6799nS.a(Uri.class, InputStream.class));
        }

        @Override // com.daaw.InterfaceC0761Ek0
        public void b() {
        }
    }
}
