package com.daaw;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.daaw.AbstractC8245se;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: renamed from: com.daaw.ld3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class ServiceConnectionC6292ld3 implements ServiceConnection, AbstractC8245se.a, AbstractC8245se.b {
    public volatile boolean a;
    public volatile C2498Uw2 b;
    public final /* synthetic */ C7129od3 c;

    public ServiceConnectionC6292ld3(C7129od3 c7129od3) {
        this.c = c7129od3;
    }

    @Override // com.daaw.AbstractC8245se.a
    public final void B(int i) {
        AbstractC7506py0.e("MeasurementServiceConnection.onConnectionSuspended");
        this.c.a.w().m().a("Service connection suspended");
        this.c.a.x().z(new RunnableC4608fd3(this));
    }

    @Override // com.daaw.AbstractC8245se.b
    public final void G(ConnectionResult connectionResult) {
        AbstractC7506py0.e("MeasurementServiceConnection.onConnectionFailed");
        C6675mz2 c6675mz2E = this.c.a.E();
        if (c6675mz2E != null) {
            c6675mz2E.t().b("Service connection failed", connectionResult);
        }
        synchronized (this) {
            this.a = false;
            this.b = null;
        }
        this.c.a.x().z(new RunnableC5445id3(this));
    }

    @Override // com.daaw.AbstractC8245se.a
    public final void I(Bundle bundle) {
        AbstractC7506py0.e("MeasurementServiceConnection.onConnected");
        synchronized (this) {
            try {
                AbstractC7506py0.l(this.b);
                this.c.a.x().z(new RunnableC3762cd3(this, (InterfaceC9167vt2) this.b.getService()));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.b = null;
                this.a = false;
            }
        }
    }

    public final void b(Intent intent) {
        this.c.d();
        Context contextV = this.c.a.v();
        C0784Eq c0784EqB = C0784Eq.b();
        synchronized (this) {
            try {
                if (this.a) {
                    this.c.a.w().s().a("Connection attempt already in progress");
                    return;
                }
                this.c.a.w().s().a("Using local app measurement service");
                this.a = true;
                c0784EqB.a(contextV, intent, this.c.c, 129);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c() {
        this.c.d();
        Context contextV = this.c.a.v();
        synchronized (this) {
            try {
                if (this.a) {
                    this.c.a.w().s().a("Connection attempt already in progress");
                    return;
                }
                if (this.b != null && (this.b.isConnecting() || this.b.isConnected())) {
                    this.c.a.w().s().a("Already awaiting connection attempt");
                    return;
                }
                this.b = new C2498Uw2(contextV, Looper.getMainLooper(), this, this);
                this.c.a.w().s().a("Connecting to remote service");
                this.a = true;
                AbstractC7506py0.l(this.b);
                this.b.checkAvailabilityAndConnect();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        if (this.b != null && (this.b.isConnected() || this.b.isConnecting())) {
            this.b.disconnect();
        }
        this.b = null;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        AbstractC7506py0.e("MeasurementServiceConnection.onServiceConnected");
        synchronized (this) {
            if (iBinder == null) {
                this.a = false;
                this.c.a.w().n().a("Service connected with null binder");
                return;
            }
            InterfaceC9167vt2 c6645ms2 = null;
            try {
                String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                    c6645ms2 = iInterfaceQueryLocalInterface instanceof InterfaceC9167vt2 ? (InterfaceC9167vt2) iInterfaceQueryLocalInterface : new C6645ms2(iBinder);
                    this.c.a.w().s().a("Bound to IMeasurementService interface");
                } else {
                    this.c.a.w().n().b("Got binder with a wrong descriptor", interfaceDescriptor);
                }
            } catch (RemoteException unused) {
                this.c.a.w().n().a("Service connect failed to get IMeasurementService");
            }
            if (c6645ms2 == null) {
                this.a = false;
                try {
                    C0784Eq.b().c(this.c.a.v(), this.c.c);
                } catch (IllegalArgumentException unused2) {
                }
            } else {
                this.c.a.x().z(new Wc3(this, c6645ms2));
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        AbstractC7506py0.e("MeasurementServiceConnection.onServiceDisconnected");
        this.c.a.w().m().a("Service disconnected");
        this.c.a.x().z(new Zc3(this, componentName));
    }
}
