package com.daaw;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public class PX0 implements InterfaceC0657Dk0 {
    public final String a;

    public PX0() {
        this("");
    }

    @Override // com.daaw.InterfaceC0657Dk0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public InterfaceC2177Rv a(byte[] bArr, int i, int i2) {
        return new C3226ai(bArr, this.a);
    }

    public PX0(String str) {
        this.a = str;
    }

    public static class a implements InterfaceC0761Ek0 {
        @Override // com.daaw.InterfaceC0761Ek0
        public InterfaceC0657Dk0 a(Context context, C6799nS c6799nS) {
            return new PX0();
        }

        @Override // com.daaw.InterfaceC0761Ek0
        public void b() {
        }
    }
}
