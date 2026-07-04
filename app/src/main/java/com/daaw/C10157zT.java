package com.daaw;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.internal.TelemetryData;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: com.daaw.zT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C10157zT implements Handler.Callback {
    public static final Status Q = new Status(4, "Sign-out occurred while this API call was in progress.");
    public static final Status R = new Status(4, "The user must be signed in to make this API call.");
    public static final Object S = new Object();
    public static C10157zT T;
    public TelemetryData D;
    public D11 E;
    public final Context F;
    public final C9320wT G;
    public final C2661Wl1 H;
    public final Handler O;
    public volatile boolean P;
    public long B = 10000;
    public boolean C = false;
    public final AtomicInteger I = new AtomicInteger(1);
    public final AtomicInteger J = new AtomicInteger(0);
    public final Map K = new ConcurrentHashMap(5, 0.75f, 1);
    public C2345Tk1 L = null;
    public final Set M = new C2823Ya();
    public final Set N = new C2823Ya();

    public C10157zT(Context context, Looper looper, C9320wT c9320wT) {
        this.P = true;
        this.F = context;
        HandlerC5768jm1 handlerC5768jm1 = new HandlerC5768jm1(looper, this);
        this.O = handlerC5768jm1;
        this.G = c9320wT;
        this.H = new C2661Wl1(c9320wT);
        if (HB.a(context)) {
            this.P = false;
        }
        handlerC5768jm1.sendMessage(handlerC5768jm1.obtainMessage(6));
    }

    public static Status f(H8 h8, ConnectionResult connectionResult) {
        return new Status(connectionResult, "API: " + h8.b() + " is not available on this device. Connection failed with: " + String.valueOf(connectionResult));
    }

    public static C10157zT t(Context context) {
        C10157zT c10157zT;
        synchronized (S) {
            try {
                if (T == null) {
                    T = new C10157zT(context.getApplicationContext(), AbstractC7918rT.b().getLooper(), C9320wT.n());
                }
                c10157zT = T;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c10157zT;
    }

    public final void A(MethodInvocation methodInvocation, int i, long j, int i2) {
        this.O.sendMessage(this.O.obtainMessage(18, new C8282sl1(methodInvocation, i, j, i2)));
    }

    public final void B(ConnectionResult connectionResult, int i) {
        if (e(connectionResult, i)) {
            return;
        }
        Handler handler = this.O;
        handler.sendMessage(handler.obtainMessage(5, i, 0, connectionResult));
    }

    public final void C() {
        Handler handler = this.O;
        handler.sendMessage(handler.obtainMessage(3));
    }

    public final void D(AbstractC8476tT abstractC8476tT) {
        Handler handler = this.O;
        handler.sendMessage(handler.obtainMessage(7, abstractC8476tT));
    }

    public final void a(C2345Tk1 c2345Tk1) {
        synchronized (S) {
            try {
                if (this.L != c2345Tk1) {
                    this.L = c2345Tk1;
                    this.M.clear();
                }
                this.M.addAll(c2345Tk1.t());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(C2345Tk1 c2345Tk1) {
        synchronized (S) {
            try {
                if (this.L == c2345Tk1) {
                    this.L = null;
                    this.M.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean d() {
        if (this.C) {
            return false;
        }
        RootTelemetryConfiguration rootTelemetryConfigurationA = XJ0.b().a();
        if (rootTelemetryConfigurationA != null && !rootTelemetryConfigurationA.p()) {
            return false;
        }
        int iA = this.H.a(this.F, 203400000);
        return iA == -1 || iA == 0;
    }

    public final boolean e(ConnectionResult connectionResult, int i) {
        return this.G.x(this.F, connectionResult, i);
    }

    public final C4646fl1 g(AbstractC8476tT abstractC8476tT) {
        Map map = this.K;
        H8 h8G = abstractC8476tT.g();
        C4646fl1 c4646fl1 = (C4646fl1) map.get(h8G);
        if (c4646fl1 == null) {
            c4646fl1 = new C4646fl1(this, abstractC8476tT);
            this.K.put(h8G, c4646fl1);
        }
        if (c4646fl1.a()) {
            this.N.add(h8G);
        }
        c4646fl1.C();
        return c4646fl1;
    }

    public final D11 h() {
        if (this.E == null) {
            this.E = C11.a(this.F);
        }
        return this.E;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        C4646fl1 c4646fl1 = null;
        switch (message.what) {
            case 1:
                this.B = true == ((Boolean) message.obj).booleanValue() ? 10000L : 300000L;
                this.O.removeMessages(12);
                for (H8 h8 : this.K.keySet()) {
                    Handler handler = this.O;
                    handler.sendMessageDelayed(handler.obtainMessage(12, h8), this.B);
                }
                return true;
            case 2:
                AbstractC6314li0.a(message.obj);
                throw null;
            case 3:
                for (C4646fl1 c4646fl12 : this.K.values()) {
                    c4646fl12.A();
                    c4646fl12.C();
                }
                return true;
            case 4:
            case 8:
            case 13:
                C8561tl1 c8561tl1 = (C8561tl1) message.obj;
                C4646fl1 c4646fl1G = (C4646fl1) this.K.get(c8561tl1.c.g());
                if (c4646fl1G == null) {
                    c4646fl1G = g(c8561tl1.c);
                }
                if (!c4646fl1G.a() || this.J.get() == c8561tl1.b) {
                    c4646fl1G.D(c8561tl1.a);
                } else {
                    c8561tl1.a.a(Q);
                    c4646fl1G.K();
                }
                return true;
            case 5:
                int i = message.arg1;
                ConnectionResult connectionResult = (ConnectionResult) message.obj;
                Iterator it = this.K.values().iterator();
                while (true) {
                    if (it.hasNext()) {
                        C4646fl1 c4646fl13 = (C4646fl1) it.next();
                        if (c4646fl13.p() == i) {
                            c4646fl1 = c4646fl13;
                        }
                    }
                }
                if (c4646fl1 == null) {
                    Log.wtf("GoogleApiManager", "Could not find API instance " + i + " while trying to fail enqueued calls.", new Exception());
                } else if (connectionResult.e() == 13) {
                    c4646fl1.e(new Status(17, "Error resolution was canceled by the user, original error message: " + this.G.e(connectionResult.e()) + ": " + connectionResult.m()));
                } else {
                    c4646fl1.e(f(c4646fl1.D, connectionResult));
                }
                return true;
            case 6:
                if (this.F.getApplicationContext() instanceof Application) {
                    ComponentCallbacks2C3485be.c((Application) this.F.getApplicationContext());
                    ComponentCallbacks2C3485be.b().a(new C3243al1(this));
                    if (!ComponentCallbacks2C3485be.b().e(true)) {
                        this.B = 300000L;
                    }
                }
                return true;
            case 7:
                g((AbstractC8476tT) message.obj);
                return true;
            case 9:
                if (this.K.containsKey(message.obj)) {
                    ((C4646fl1) this.K.get(message.obj)).J();
                }
                return true;
            case 10:
                Iterator it2 = this.N.iterator();
                while (it2.hasNext()) {
                    C4646fl1 c4646fl14 = (C4646fl1) this.K.remove((H8) it2.next());
                    if (c4646fl14 != null) {
                        c4646fl14.K();
                    }
                }
                this.N.clear();
                return true;
            case 11:
                if (this.K.containsKey(message.obj)) {
                    ((C4646fl1) this.K.get(message.obj)).L();
                }
                return true;
            case 12:
                if (this.K.containsKey(message.obj)) {
                    ((C4646fl1) this.K.get(message.obj)).b();
                }
                return true;
            case 14:
                AbstractC6314li0.a(message.obj);
                throw null;
            case 15:
                C5204hl1 c5204hl1 = (C5204hl1) message.obj;
                if (this.K.containsKey(c5204hl1.a)) {
                    C4646fl1.y((C4646fl1) this.K.get(c5204hl1.a), c5204hl1);
                }
                return true;
            case 16:
                C5204hl1 c5204hl12 = (C5204hl1) message.obj;
                if (this.K.containsKey(c5204hl12.a)) {
                    C4646fl1.z((C4646fl1) this.K.get(c5204hl12.a), c5204hl12);
                }
                return true;
            case C6564mc1.STRING_VALUE_FIELD_NUMBER /* 17 */:
                i();
                return true;
            case C6564mc1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                C8282sl1 c8282sl1 = (C8282sl1) message.obj;
                if (c8282sl1.c == 0) {
                    h().b(new TelemetryData(c8282sl1.b, Arrays.asList(c8282sl1.a)));
                } else {
                    TelemetryData telemetryData = this.D;
                    if (telemetryData != null) {
                        List listM = telemetryData.m();
                        if (telemetryData.e() != c8282sl1.b || (listM != null && listM.size() >= c8282sl1.d)) {
                            this.O.removeMessages(17);
                            i();
                        } else {
                            this.D.p(c8282sl1.a);
                        }
                    }
                    if (this.D == null) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(c8282sl1.a);
                        this.D = new TelemetryData(c8282sl1.b, arrayList);
                        Handler handler2 = this.O;
                        handler2.sendMessageDelayed(handler2.obtainMessage(17), c8282sl1.c);
                    }
                }
                return true;
            case 19:
                this.C = false;
                return true;
            default:
                return false;
        }
    }

    public final void i() {
        TelemetryData telemetryData = this.D;
        if (telemetryData != null) {
            if (telemetryData.e() > 0 || d()) {
                h().b(telemetryData);
            }
            this.D = null;
        }
    }

    public final void j(C7521q11 c7521q11, int i, AbstractC8476tT abstractC8476tT) {
        C8003rl1 c8003rl1B;
        if (i == 0 || (c8003rl1B = C8003rl1.b(this, i, abstractC8476tT.g())) == null) {
            return;
        }
        AbstractC6963o11 abstractC6963o11A = c7521q11.a();
        final Handler handler = this.O;
        handler.getClass();
        abstractC6963o11A.c(new Executor() { // from class: com.daaw.Zk1
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                handler.post(runnable);
            }
        }, c8003rl1B);
    }

    public final int k() {
        return this.I.getAndIncrement();
    }

    public final C4646fl1 s(H8 h8) {
        return (C4646fl1) this.K.get(h8);
    }

    public final void z(AbstractC8476tT abstractC8476tT, int i, AbstractC7242p11 abstractC7242p11, C7521q11 c7521q11, InterfaceC6820nX0 interfaceC6820nX0) {
        j(c7521q11, abstractC7242p11.d(), abstractC8476tT);
        this.O.sendMessage(this.O.obtainMessage(4, new C8561tl1(new C1701Nl1(i, abstractC7242p11, c7521q11, interfaceC6820nX0), this.J.get(), abstractC8476tT)));
    }
}
