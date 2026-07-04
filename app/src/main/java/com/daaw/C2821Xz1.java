package com.daaw;

import android.app.Activity;
import android.app.Application;
import android.content.Context;

/* JADX INFO: renamed from: com.daaw.Xz1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2821Xz1 {
    public final Object a = new Object();
    public C2613Vz1 b = null;
    public boolean c = false;

    public final Activity a() {
        synchronized (this.a) {
            try {
                C2613Vz1 c2613Vz1 = this.b;
                if (c2613Vz1 == null) {
                    return null;
                }
                return c2613Vz1.a();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Context b() {
        synchronized (this.a) {
            try {
                C2613Vz1 c2613Vz1 = this.b;
                if (c2613Vz1 == null) {
                    return null;
                }
                return c2613Vz1.b();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(InterfaceC2717Wz1 interfaceC2717Wz1) {
        synchronized (this.a) {
            try {
                if (this.b == null) {
                    this.b = new C2613Vz1();
                }
                this.b.f(interfaceC2717Wz1);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d(Context context) {
        synchronized (this.a) {
            try {
                if (!this.c) {
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext == null) {
                        applicationContext = context;
                    }
                    Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
                    if (application == null) {
                        AbstractC4274eT1.zzj("Can not cast Context to Application");
                        return;
                    }
                    if (this.b == null) {
                        this.b = new C2613Vz1();
                    }
                    this.b.g(application, context);
                    this.c = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e(InterfaceC2717Wz1 interfaceC2717Wz1) {
        synchronized (this.a) {
            try {
                C2613Vz1 c2613Vz1 = this.b;
                if (c2613Vz1 == null) {
                    return;
                }
                c2613Vz1.h(interfaceC2717Wz1);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
