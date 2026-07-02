package com.daaw;

import android.os.Handler;
import android.os.Message;

/* JADX INFO: renamed from: com.daaw.uE0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C8696uE0 {
    public long b;
    public InterfaceC6408m2 c = null;
    public Handler a = new Handler(new a());

    /* JADX INFO: renamed from: com.daaw.uE0$a */
    public class a implements Handler.Callback {
        public a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 2) {
                return false;
            }
            C8696uE0 c8696uE0 = C8696uE0.this;
            InterfaceC6408m2 interfaceC6408m2 = c8696uE0.c;
            c8696uE0.c = null;
            if (interfaceC6408m2 == null) {
                return false;
            }
            interfaceC6408m2.a();
            return false;
        }
    }

    public C8696uE0(long j) {
        this.b = j;
    }

    public void a(InterfaceC6408m2 interfaceC6408m2) {
        AbstractC1765Ob1.c();
        this.c = interfaceC6408m2;
        if (this.a.hasMessages(2)) {
            return;
        }
        this.a.sendMessageDelayed(this.a.obtainMessage(2, interfaceC6408m2), this.b);
    }
}
