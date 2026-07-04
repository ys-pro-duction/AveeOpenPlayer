package com.daaw;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.GetServiceRequest;
import com.google.android.gms.common.internal.zzk;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: com.daaw.se, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8245se {
    public static final int CONNECT_STATE_CONNECTED = 4;
    public static final int CONNECT_STATE_DISCONNECTED = 1;
    public static final int CONNECT_STATE_DISCONNECTING = 5;
    public static final String DEFAULT_ACCOUNT = "<<default account>>";
    public static final String KEY_PENDING_INTENT = "pendingIntent";
    public boolean A;
    public volatile zzk B;
    public AtomicInteger C;
    public int a;
    public long b;
    public long c;
    public int d;
    public long e;
    public volatile String f;
    public Iq3 g;
    public final Context h;
    public final Looper i;
    public final AbstractC7918rT j;
    public final C9599xT k;
    public final Handler l;
    public final Object m;
    public final Object n;
    public InterfaceC6261lX o;
    public c p;
    public IInterface q;
    public final ArrayList r;
    public ServiceConnectionC2878Yn2 s;
    public int t;
    public final a u;
    public final b v;
    public final int w;
    public final String x;
    public volatile String y;
    public ConnectionResult z;
    public static final Feature[] D = new Feature[0];
    public static final String[] GOOGLE_PLUS_REQUIRED_FEATURES = {"service_esmobile", "service_googleme"};

    /* JADX INFO: renamed from: com.daaw.se$a */
    public interface a {
        void B(int i);

        void I(Bundle bundle);
    }

    /* JADX INFO: renamed from: com.daaw.se$b */
    public interface b {
        void G(ConnectionResult connectionResult);
    }

    /* JADX INFO: renamed from: com.daaw.se$c */
    public interface c {
        void a(ConnectionResult connectionResult);
    }

    /* JADX INFO: renamed from: com.daaw.se$d */
    public class d implements c {
        public d() {
        }

        @Override // com.daaw.AbstractC8245se.c
        public final void a(ConnectionResult connectionResult) {
            if (connectionResult.v()) {
                AbstractC8245se abstractC8245se = AbstractC8245se.this;
                abstractC8245se.getRemoteService(null, abstractC8245se.j());
            } else if (AbstractC8245se.this.v != null) {
                AbstractC8245se.this.v.G(connectionResult);
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.se$e */
    public interface e {
        void a();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AbstractC8245se(Context context, Looper looper, int i, a aVar, b bVar, String str) {
        AbstractC7918rT abstractC7918rTA = AbstractC7918rT.a(context);
        C9599xT c9599xTF = C9599xT.f();
        AbstractC7506py0.l(aVar);
        AbstractC7506py0.l(bVar);
        this(context, looper, abstractC7918rTA, c9599xTF, i, aVar, bVar, str);
    }

    public static /* bridge */ /* synthetic */ void C(AbstractC8245se abstractC8245se, zzk zzkVar) {
        abstractC8245se.B = zzkVar;
        if (abstractC8245se.usesClientTelemetry()) {
            ConnectionTelemetryConfiguration connectionTelemetryConfiguration = zzkVar.E;
            XJ0.b().c(connectionTelemetryConfiguration == null ? null : connectionTelemetryConfiguration.D());
        }
    }

    public static /* bridge */ /* synthetic */ void D(AbstractC8245se abstractC8245se, int i) {
        int i2;
        int i3;
        synchronized (abstractC8245se.m) {
            i2 = abstractC8245se.t;
        }
        if (i2 == 3) {
            abstractC8245se.A = true;
            i3 = 5;
        } else {
            i3 = 4;
        }
        Handler handler = abstractC8245se.l;
        handler.sendMessage(handler.obtainMessage(i3, abstractC8245se.C.get(), 16));
    }

    public static /* bridge */ /* synthetic */ boolean G(AbstractC8245se abstractC8245se, int i, int i2, IInterface iInterface) {
        synchronized (abstractC8245se.m) {
            try {
                if (abstractC8245se.t != i) {
                    return false;
                }
                abstractC8245se.I(i2, iInterface);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static /* bridge */ /* synthetic */ boolean H(AbstractC8245se abstractC8245se) {
        if (abstractC8245se.A || TextUtils.isEmpty(abstractC8245se.k()) || TextUtils.isEmpty(abstractC8245se.i())) {
            return false;
        }
        try {
            Class.forName(abstractC8245se.k());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public final void E(int i, Bundle bundle, int i2) {
        this.l.sendMessage(this.l.obtainMessage(7, i2, -1, new C10156zS2(this, i, null)));
    }

    public final void I(int i, IInterface iInterface) {
        Iq3 iq3;
        AbstractC7506py0.a((i == 4) == (iInterface != null));
        synchronized (this.m) {
            try {
                this.t = i;
                this.q = iInterface;
                if (i == 1) {
                    ServiceConnectionC2878Yn2 serviceConnectionC2878Yn2 = this.s;
                    if (serviceConnectionC2878Yn2 != null) {
                        AbstractC7918rT abstractC7918rT = this.j;
                        String strB = this.g.b();
                        AbstractC7506py0.l(strB);
                        abstractC7918rT.d(strB, this.g.a(), 4225, serviceConnectionC2878Yn2, x(), this.g.c());
                        this.s = null;
                    }
                } else if (i == 2 || i == 3) {
                    ServiceConnectionC2878Yn2 serviceConnectionC2878Yn22 = this.s;
                    if (serviceConnectionC2878Yn22 != null && (iq3 = this.g) != null) {
                        iq3.b();
                        iq3.a();
                        AbstractC7918rT abstractC7918rT2 = this.j;
                        String strB2 = this.g.b();
                        AbstractC7506py0.l(strB2);
                        abstractC7918rT2.d(strB2, this.g.a(), 4225, serviceConnectionC2878Yn22, x(), this.g.c());
                        this.C.incrementAndGet();
                    }
                    ServiceConnectionC2878Yn2 serviceConnectionC2878Yn23 = new ServiceConnectionC2878Yn2(this, this.C.get());
                    this.s = serviceConnectionC2878Yn23;
                    Iq3 iq32 = (this.t != 3 || i() == null) ? new Iq3(m(), l(), false, 4225, n()) : new Iq3(getContext().getPackageName(), i(), true, 4225, false);
                    this.g = iq32;
                    if (iq32.c() && getMinApkVersion() < 17895000) {
                        throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.g.b())));
                    }
                    AbstractC7918rT abstractC7918rT3 = this.j;
                    String strB3 = this.g.b();
                    AbstractC7506py0.l(strB3);
                    if (!abstractC7918rT3.e(new C9671xi3(strB3, this.g.a(), 4225, this.g.c()), serviceConnectionC2878Yn23, x(), g())) {
                        this.g.b();
                        this.g.a();
                        E(16, null, this.C.get());
                    }
                } else if (i == 4) {
                    AbstractC7506py0.l(iInterface);
                    o(iInterface);
                }
            } finally {
            }
        }
    }

    public void checkAvailabilityAndConnect() {
        int iH = this.k.h(this.h, getMinApkVersion());
        if (iH == 0) {
            connect(new d());
        } else {
            I(1, null);
            s(new d(), iH, null);
        }
    }

    public void connect(c cVar) {
        AbstractC7506py0.m(cVar, "Connection progress callbacks cannot be null.");
        this.p = cVar;
        I(2, null);
    }

    public final void d() {
        if (!isConnected()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    public void disconnect() {
        this.C.incrementAndGet();
        synchronized (this.r) {
            try {
                int size = this.r.size();
                for (int i = 0; i < size; i++) {
                    ((AS1) this.r.get(i)).d();
                }
                this.r.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.n) {
            this.o = null;
        }
        I(1, null);
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int i;
        IInterface iInterface;
        InterfaceC6261lX interfaceC6261lX;
        synchronized (this.m) {
            i = this.t;
            iInterface = this.q;
        }
        synchronized (this.n) {
            interfaceC6261lX = this.o;
        }
        printWriter.append((CharSequence) str).append("mConnectState=");
        if (i == 1) {
            printWriter.print("DISCONNECTED");
        } else if (i == 2) {
            printWriter.print("REMOTE_CONNECTING");
        } else if (i == 3) {
            printWriter.print("LOCAL_CONNECTING");
        } else if (i == 4) {
            printWriter.print("CONNECTED");
        } else if (i != 5) {
            printWriter.print("UNKNOWN");
        } else {
            printWriter.print("DISCONNECTING");
        }
        printWriter.append(" mService=");
        if (iInterface == null) {
            printWriter.append("null");
        } else {
            printWriter.append((CharSequence) k()).append("@").append((CharSequence) Integer.toHexString(System.identityHashCode(iInterface.asBinder())));
        }
        printWriter.append(" mServiceBroker=");
        if (interfaceC6261lX == null) {
            printWriter.println("null");
        } else {
            printWriter.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(interfaceC6261lX.asBinder())));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        if (this.c > 0) {
            PrintWriter printWriterAppend = printWriter.append((CharSequence) str).append("lastConnectedTime=");
            long j = this.c;
            printWriterAppend.println(j + " " + simpleDateFormat.format(new Date(j)));
        }
        if (this.b > 0) {
            printWriter.append((CharSequence) str).append("lastSuspendedCause=");
            int i2 = this.a;
            if (i2 == 1) {
                printWriter.append("CAUSE_SERVICE_DISCONNECTED");
            } else if (i2 == 2) {
                printWriter.append("CAUSE_NETWORK_LOST");
            } else if (i2 != 3) {
                printWriter.append((CharSequence) String.valueOf(i2));
            } else {
                printWriter.append("CAUSE_DEAD_OBJECT_EXCEPTION");
            }
            PrintWriter printWriterAppend2 = printWriter.append(" lastSuspendedTime=");
            long j2 = this.b;
            printWriterAppend2.println(j2 + " " + simpleDateFormat.format(new Date(j2)));
        }
        if (this.e > 0) {
            printWriter.append((CharSequence) str).append("lastFailedStatus=").append((CharSequence) AbstractC0451Bn.a(this.d));
            PrintWriter printWriterAppend3 = printWriter.append(" lastFailedTime=");
            long j3 = this.e;
            printWriterAppend3.println(j3 + " " + simpleDateFormat.format(new Date(j3)));
        }
    }

    public abstract IInterface e(IBinder iBinder);

    public boolean f() {
        return false;
    }

    public Executor g() {
        return null;
    }

    public Account getAccount() {
        return null;
    }

    public Feature[] getApiFeatures() {
        return D;
    }

    public final Feature[] getAvailableFeatures() {
        zzk zzkVar = this.B;
        if (zzkVar == null) {
            return null;
        }
        return zzkVar.C;
    }

    public Bundle getConnectionHint() {
        return null;
    }

    public final Context getContext() {
        return this.h;
    }

    public String getEndpointPackageName() {
        Iq3 iq3;
        if (!isConnected() || (iq3 = this.g) == null) {
            throw new RuntimeException("Failed to connect when checking package");
        }
        return iq3.a();
    }

    public int getGCoreServiceId() {
        return this.w;
    }

    public String getLastDisconnectMessage() {
        return this.f;
    }

    public final Looper getLooper() {
        return this.i;
    }

    public int getMinApkVersion() {
        return C9599xT.a;
    }

    public void getRemoteService(com.google.android.gms.common.internal.b bVar, Set<Scope> set) {
        Bundle bundleH = h();
        String str = this.y;
        int i = C9599xT.a;
        Scope[] scopeArr = GetServiceRequest.P;
        Bundle bundle = new Bundle();
        int i2 = this.w;
        Feature[] featureArr = GetServiceRequest.Q;
        GetServiceRequest getServiceRequest = new GetServiceRequest(6, i2, i, null, null, scopeArr, bundle, null, featureArr, featureArr, true, 0, false, str);
        getServiceRequest.E = this.h.getPackageName();
        getServiceRequest.H = bundleH;
        if (set != null) {
            getServiceRequest.G = (Scope[]) set.toArray(new Scope[0]);
        }
        if (requiresSignIn()) {
            Account account = getAccount();
            if (account == null) {
                account = new Account(DEFAULT_ACCOUNT, "com.google");
            }
            getServiceRequest.I = account;
            if (bVar != null) {
                getServiceRequest.F = bVar.asBinder();
            }
        } else if (requiresAccount()) {
            getServiceRequest.I = getAccount();
        }
        getServiceRequest.J = D;
        getServiceRequest.K = getApiFeatures();
        if (usesClientTelemetry()) {
            getServiceRequest.N = true;
        }
        try {
            try {
                synchronized (this.n) {
                    try {
                        InterfaceC6261lX interfaceC6261lX = this.o;
                        if (interfaceC6261lX != null) {
                            interfaceC6261lX.I2(new BinderC10074z82(this, this.C.get()), getServiceRequest);
                        }
                    } finally {
                    }
                }
            } catch (DeadObjectException unused) {
                triggerConnectionSuspended(3);
            } catch (SecurityException e2) {
                throw e2;
            }
        } catch (RemoteException | RuntimeException unused2) {
            r(8, null, null, this.C.get());
        }
    }

    public final IInterface getService() {
        IInterface iInterface;
        synchronized (this.m) {
            try {
                if (this.t == 5) {
                    throw new DeadObjectException();
                }
                d();
                iInterface = this.q;
                AbstractC7506py0.m(iInterface, "Client is connected but service is null");
            } catch (Throwable th) {
                throw th;
            }
        }
        return iInterface;
    }

    public IBinder getServiceBrokerBinder() {
        synchronized (this.n) {
            try {
                InterfaceC6261lX interfaceC6261lX = this.o;
                if (interfaceC6261lX == null) {
                    return null;
                }
                return interfaceC6261lX.asBinder();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Intent getSignInIntent() {
        throw new UnsupportedOperationException("Not a sign in API");
    }

    public ConnectionTelemetryConfiguration getTelemetryConfiguration() {
        zzk zzkVar = this.B;
        if (zzkVar == null) {
            return null;
        }
        return zzkVar.E;
    }

    public Bundle h() {
        return new Bundle();
    }

    public boolean hasConnectionInfo() {
        return this.B != null;
    }

    public String i() {
        return null;
    }

    public boolean isConnected() {
        boolean z;
        synchronized (this.m) {
            z = this.t == 4;
        }
        return z;
    }

    public boolean isConnecting() {
        boolean z;
        synchronized (this.m) {
            int i = this.t;
            z = true;
            if (i != 2 && i != 3) {
                z = false;
            }
        }
        return z;
    }

    public Set j() {
        return Collections.EMPTY_SET;
    }

    public abstract String k();

    public abstract String l();

    public String m() {
        return "com.google.android.gms";
    }

    public boolean n() {
        return getMinApkVersion() >= 211700000;
    }

    public void o(IInterface iInterface) {
        this.c = System.currentTimeMillis();
    }

    public void onUserSignOut(e eVar) {
        eVar.a();
    }

    public void p(ConnectionResult connectionResult) {
        this.d = connectionResult.e();
        this.e = System.currentTimeMillis();
    }

    public boolean providesSignIn() {
        return false;
    }

    public void q(int i) {
        this.a = i;
        this.b = System.currentTimeMillis();
    }

    public void r(int i, IBinder iBinder, Bundle bundle, int i2) {
        this.l.sendMessage(this.l.obtainMessage(1, i2, -1, new C8694uD2(this, i, iBinder, bundle)));
    }

    public boolean requiresAccount() {
        return false;
    }

    public boolean requiresGooglePlayServices() {
        return true;
    }

    public boolean requiresSignIn() {
        return false;
    }

    public void s(c cVar, int i, PendingIntent pendingIntent) {
        AbstractC7506py0.m(cVar, "Connection progress callbacks cannot be null.");
        this.p = cVar;
        this.l.sendMessage(this.l.obtainMessage(3, this.C.get(), i, pendingIntent));
    }

    public void setAttributionTag(String str) {
        this.y = str;
    }

    public void triggerConnectionSuspended(int i) {
        this.l.sendMessage(this.l.obtainMessage(6, this.C.get(), i));
    }

    public boolean usesClientTelemetry() {
        return false;
    }

    public final String x() {
        String str = this.x;
        return str == null ? this.h.getClass().getName() : str;
    }

    public AbstractC8245se(Context context, Looper looper, AbstractC7918rT abstractC7918rT, C9599xT c9599xT, int i, a aVar, b bVar, String str) {
        this.f = null;
        this.m = new Object();
        this.n = new Object();
        this.r = new ArrayList();
        this.t = 1;
        this.z = null;
        this.A = false;
        this.B = null;
        this.C = new AtomicInteger(0);
        AbstractC7506py0.m(context, "Context must not be null");
        this.h = context;
        AbstractC7506py0.m(looper, "Looper must not be null");
        this.i = looper;
        AbstractC7506py0.m(abstractC7918rT, "Supervisor must not be null");
        this.j = abstractC7918rT;
        AbstractC7506py0.m(c9599xT, "API availability must not be null");
        this.k = c9599xT;
        this.l = new XC1(this, looper);
        this.w = i;
        this.u = aVar;
        this.v = bVar;
        this.x = str;
    }

    public void disconnect(String str) {
        this.f = str;
        disconnect();
    }
}
