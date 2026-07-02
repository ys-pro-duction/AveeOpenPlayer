package com.daaw;

import android.content.Context;
import java.io.InputStream;

/* JADX INFO: renamed from: com.daaw.bY0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C3458bY0 extends AbstractC0505Ca1 {
    public C3458bY0(InterfaceC0657Dk0 interfaceC0657Dk0) {
        super(interfaceC0657Dk0);
    }

    /* JADX INFO: renamed from: com.daaw.bY0$a */
    public static class a implements InterfaceC0761Ek0 {
        @Override // com.daaw.InterfaceC0761Ek0
        public InterfaceC0657Dk0 a(Context context, C6799nS c6799nS) {
            return new C3458bY0(c6799nS.a(C4840gT.class, InputStream.class));
        }

        @Override // com.daaw.InterfaceC0761Ek0
        public void b() {
        }
    }
}
