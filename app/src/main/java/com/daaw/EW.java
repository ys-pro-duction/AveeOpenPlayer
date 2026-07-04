package com.daaw;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public class EW implements InterfaceC0657Dk0 {
    public final C0544Ck0 a;

    public EW(C0544Ck0 c0544Ck0) {
        this.a = c0544Ck0;
    }

    @Override // com.daaw.InterfaceC0657Dk0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public InterfaceC2177Rv a(C4840gT c4840gT, int i, int i2) {
        C0544Ck0 c0544Ck0 = this.a;
        if (c0544Ck0 != null) {
            C4840gT c4840gT2 = (C4840gT) c0544Ck0.a(c4840gT, 0, 0);
            if (c4840gT2 == null) {
                this.a.b(c4840gT, 0, 0, c4840gT);
            } else {
                c4840gT = c4840gT2;
            }
        }
        return new DW(c4840gT);
    }

    public static class a implements InterfaceC0761Ek0 {
        public final C0544Ck0 a = new C0544Ck0(500);

        @Override // com.daaw.InterfaceC0761Ek0
        public InterfaceC0657Dk0 a(Context context, C6799nS c6799nS) {
            return new EW(this.a);
        }

        @Override // com.daaw.InterfaceC0761Ek0
        public void b() {
        }
    }
}
