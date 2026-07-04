package com.daaw;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;

/* JADX INFO: loaded from: classes.dex */
public final class An3 implements Handler.Callback {
    public final /* synthetic */ Go3 B;

    public /* synthetic */ An3(Go3 go3, AbstractC6337lm3 abstractC6337lm3) {
        this.B = go3;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            synchronized (this.B.f) {
                try {
                    C9671xi3 c9671xi3 = (C9671xi3) message.obj;
                    Mk3 mk3 = (Mk3) this.B.f.get(c9671xi3);
                    if (mk3 != null && mk3.i()) {
                        if (mk3.j()) {
                            mk3.g("GmsClientSupervisor");
                        }
                        this.B.f.remove(c9671xi3);
                    }
                } finally {
                }
            }
            return true;
        }
        if (i != 1) {
            return false;
        }
        synchronized (this.B.f) {
            try {
                C9671xi3 c9671xi32 = (C9671xi3) message.obj;
                Mk3 mk32 = (Mk3) this.B.f.get(c9671xi32);
                if (mk32 != null && mk32.a() == 3) {
                    String.valueOf(c9671xi32);
                    new Exception();
                    ComponentName componentNameB = mk32.b();
                    if (componentNameB == null) {
                        componentNameB = c9671xi32.a();
                    }
                    if (componentNameB == null) {
                        String strC = c9671xi32.c();
                        AbstractC7506py0.l(strC);
                        componentNameB = new ComponentName(strC, "unknown");
                    }
                    mk32.onServiceDisconnected(componentNameB);
                }
            } finally {
            }
        }
        return true;
    }
}
