package com.daaw;

import android.app.PendingIntent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: loaded from: classes.dex */
public final class XC1 extends HandlerC4026da3 {
    public final /* synthetic */ AbstractC8245se b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public XC1(AbstractC8245se abstractC8245se, Looper looper) {
        super(looper);
        this.b = abstractC8245se;
    }

    public static final void a(Message message) {
        AS1 as1 = (AS1) message.obj;
        as1.b();
        as1.e();
    }

    public static final boolean b(Message message) {
        int i = message.what;
        return i == 2 || i == 1 || i == 7;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (this.b.C.get() != message.arg1) {
            if (b(message)) {
                a(message);
                return;
            }
            return;
        }
        int i = message.what;
        if ((i == 1 || i == 7 || ((i == 4 && !this.b.f()) || message.what == 5)) && !this.b.isConnecting()) {
            a(message);
            return;
        }
        int i2 = message.what;
        if (i2 == 4) {
            this.b.z = new ConnectionResult(message.arg2);
            if (AbstractC8245se.H(this.b)) {
                AbstractC8245se abstractC8245se = this.b;
                if (!abstractC8245se.A) {
                    abstractC8245se.I(3, null);
                    return;
                }
            }
            AbstractC8245se abstractC8245se2 = this.b;
            ConnectionResult connectionResult = abstractC8245se2.z != null ? abstractC8245se2.z : new ConnectionResult(8);
            this.b.p.a(connectionResult);
            this.b.p(connectionResult);
            return;
        }
        if (i2 == 5) {
            AbstractC8245se abstractC8245se3 = this.b;
            ConnectionResult connectionResult2 = abstractC8245se3.z != null ? abstractC8245se3.z : new ConnectionResult(8);
            this.b.p.a(connectionResult2);
            this.b.p(connectionResult2);
            return;
        }
        if (i2 == 3) {
            Object obj = message.obj;
            ConnectionResult connectionResult3 = new ConnectionResult(message.arg2, obj instanceof PendingIntent ? (PendingIntent) obj : null);
            this.b.p.a(connectionResult3);
            this.b.p(connectionResult3);
            return;
        }
        if (i2 == 6) {
            this.b.I(5, null);
            AbstractC8245se abstractC8245se4 = this.b;
            if (abstractC8245se4.u != null) {
                abstractC8245se4.u.B(message.arg2);
            }
            this.b.q(message.arg2);
            AbstractC8245se.G(this.b, 5, 1, null);
            return;
        }
        if (i2 == 2 && !this.b.isConnected()) {
            a(message);
            return;
        }
        if (b(message)) {
            ((AS1) message.obj).c();
            return;
        }
        Log.wtf("GmsClient", "Don't know how to handle message: " + message.what, new Exception());
    }
}
