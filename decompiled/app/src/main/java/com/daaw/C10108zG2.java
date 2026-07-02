package com.daaw;

import android.os.Handler;
import android.os.Message;

/* JADX INFO: renamed from: com.daaw.zG2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10108zG2 implements InterfaceC6924ns2 {
    public Message a;
    public C3670cH2 b;

    public /* synthetic */ C10108zG2(VF2 vf2) {
    }

    public final C10108zG2 a(Message message, C3670cH2 c3670cH2) {
        this.a = message;
        this.b = c3670cH2;
        return this;
    }

    public final boolean b(Handler handler) {
        Message message = this.a;
        message.getClass();
        boolean zSendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue(message);
        c();
        return zSendMessageAtFrontOfQueue;
    }

    public final void c() {
        this.a = null;
        this.b = null;
        C3670cH2.i(this);
    }

    @Override // com.daaw.InterfaceC6924ns2
    public final void zza() {
        Message message = this.a;
        message.getClass();
        message.sendToTarget();
        c();
    }
}
