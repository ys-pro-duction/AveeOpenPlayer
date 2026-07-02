package com.google.android.gms.ads.identifier;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.SystemClock;
import com.daaw.AbstractBinderC3259ao2;
import com.daaw.AbstractC7506py0;
import com.daaw.BT;
import com.daaw.C0784Eq;
import com.daaw.C9599xT;
import com.daaw.InterfaceC9259wD2;
import com.daaw.QC1;
import com.daaw.ServiceConnectionC4330eg;
import com.google.android.gms.common.util.VisibleForTesting;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class AdvertisingIdClient {
    public ServiceConnectionC4330eg a;
    public InterfaceC9259wD2 b;
    public boolean c;
    public final Object d;
    public QC1 e;
    public final Context f;
    public final long g;

    public static final class Info {
        public final String a;
        public final boolean b;

        @Deprecated
        public Info(String str, boolean z) {
            this.a = str;
            this.b = z;
        }

        public String getId() {
            return this.a;
        }

        public boolean isLimitAdTrackingEnabled() {
            return this.b;
        }

        public String toString() {
            String str = this.a;
            boolean z = this.b;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 7);
            sb.append("{");
            sb.append(str);
            sb.append("}");
            sb.append(z);
            return sb.toString();
        }
    }

    public AdvertisingIdClient(Context context) {
        this(context, 30000L, false, false);
    }

    public static Info getAdvertisingIdInfo(Context context) {
        AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(context, -1L, true, false);
        try {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            advertisingIdClient.a(false);
            Info infoC = advertisingIdClient.c(-1);
            advertisingIdClient.b(infoC, true, 0.0f, SystemClock.elapsedRealtime() - jElapsedRealtime, "", null);
            return infoC;
        } finally {
        }
    }

    public static boolean getIsAdIdFakeForDebugLogging(Context context) {
        boolean zZzd;
        AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(context, -1L, false, false);
        try {
            advertisingIdClient.a(false);
            AbstractC7506py0.k("Calling this from your main thread can lead to deadlock");
            synchronized (advertisingIdClient) {
                try {
                    if (!advertisingIdClient.c) {
                        synchronized (advertisingIdClient.d) {
                            QC1 qc1 = advertisingIdClient.e;
                            if (qc1 == null || !qc1.E) {
                                throw new IOException("AdvertisingIdClient is not connected.");
                            }
                        }
                        try {
                            advertisingIdClient.a(false);
                            if (!advertisingIdClient.c) {
                                throw new IOException("AdvertisingIdClient cannot reconnect.");
                            }
                        } catch (Exception e) {
                            throw new IOException("AdvertisingIdClient cannot reconnect.", e);
                        }
                    }
                    AbstractC7506py0.l(advertisingIdClient.a);
                    AbstractC7506py0.l(advertisingIdClient.b);
                    try {
                        zZzd = advertisingIdClient.b.zzd();
                    } catch (RemoteException unused) {
                        throw new IOException("Remote exception");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            advertisingIdClient.d();
            advertisingIdClient.zza();
            return zZzd;
        } catch (Throwable th2) {
            advertisingIdClient.zza();
            throw th2;
        }
    }

    public static void setShouldSkipGmsCoreVersionCheck(boolean z) {
    }

    public final void a(boolean z) {
        AbstractC7506py0.k("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.c) {
                    zza();
                }
                Context context = this.f;
                try {
                    context.getPackageManager().getPackageInfo("com.android.vending", 0);
                    int iH = C9599xT.f().h(context, 12451000);
                    if (iH != 0 && iH != 2) {
                        throw new IOException("Google Play services not available");
                    }
                    ServiceConnectionC4330eg serviceConnectionC4330eg = new ServiceConnectionC4330eg();
                    Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                    intent.setPackage("com.google.android.gms");
                    try {
                        if (!C0784Eq.b().a(context, intent, serviceConnectionC4330eg, 1)) {
                            throw new IOException("Connection failure");
                        }
                        this.a = serviceConnectionC4330eg;
                        try {
                            this.b = AbstractBinderC3259ao2.B(serviceConnectionC4330eg.a(10000L, TimeUnit.MILLISECONDS));
                            this.c = true;
                            if (z) {
                                d();
                            }
                        } catch (InterruptedException unused) {
                            throw new IOException("Interrupted exception");
                        } catch (Throwable th) {
                            throw new IOException(th);
                        }
                    } finally {
                        IOException iOException = new IOException(th);
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                    throw new BT(9);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean b(Info info, boolean z, float f, long j, String str, Throwable th) {
        if (Math.random() > 0.0d) {
            return false;
        }
        HashMap map = new HashMap();
        map.put("app_context", "1");
        if (info != null) {
            map.put("limit_ad_tracking", true != info.isLimitAdTrackingEnabled() ? "0" : "1");
            String id = info.getId();
            if (id != null) {
                map.put("ad_id_size", Integer.toString(id.length()));
            }
        }
        if (th != null) {
            map.put("error", th.getClass().getName());
        }
        map.put("tag", "AdvertisingIdClient");
        map.put("time_spent", Long.toString(j));
        new a(this, map).start();
        return true;
    }

    public final Info c(int i) {
        Info info;
        AbstractC7506py0.k("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (!this.c) {
                    synchronized (this.d) {
                        QC1 qc1 = this.e;
                        if (qc1 == null || !qc1.E) {
                            throw new IOException("AdvertisingIdClient is not connected.");
                        }
                    }
                    try {
                        a(false);
                        if (!this.c) {
                            throw new IOException("AdvertisingIdClient cannot reconnect.");
                        }
                    } catch (Exception e) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.", e);
                    }
                }
                AbstractC7506py0.l(this.a);
                AbstractC7506py0.l(this.b);
                try {
                    info = new Info(this.b.zzc(), this.b.o0(true));
                } catch (RemoteException unused) {
                    throw new IOException("Remote exception");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        d();
        return info;
    }

    public final void d() {
        synchronized (this.d) {
            QC1 qc1 = this.e;
            if (qc1 != null) {
                qc1.D.countDown();
                try {
                    this.e.join();
                } catch (InterruptedException unused) {
                }
            }
            long j = this.g;
            if (j > 0) {
                this.e = new QC1(this, j);
            }
        }
    }

    public final void finalize() throws Throwable {
        zza();
        super.finalize();
    }

    public Info getInfo() {
        return c(-1);
    }

    public void start() {
        a(true);
    }

    public final void zza() {
        AbstractC7506py0.k("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.f == null || this.a == null) {
                    return;
                }
                try {
                    if (this.c) {
                        C0784Eq.b().c(this.f, this.a);
                    }
                } catch (Throwable unused) {
                }
                this.c = false;
                this.b = null;
                this.a = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @VisibleForTesting
    public AdvertisingIdClient(Context context, long j, boolean z, boolean z2) {
        Context applicationContext;
        this.d = new Object();
        AbstractC7506py0.l(context);
        if (z && (applicationContext = context.getApplicationContext()) != null) {
            context = applicationContext;
        }
        this.f = context;
        this.c = false;
        this.g = j;
    }
}
