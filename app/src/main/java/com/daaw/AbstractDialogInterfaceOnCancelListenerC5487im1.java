package com.daaw;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.daaw.im1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractDialogInterfaceOnCancelListenerC5487im1 extends LifecycleCallback implements DialogInterface.OnCancelListener {
    public volatile boolean C;
    public final AtomicReference D;
    public final Handler E;
    public final C9320wT F;

    public AbstractDialogInterfaceOnCancelListenerC5487im1(InterfaceC1453Lb0 interfaceC1453Lb0, C9320wT c9320wT) {
        super(interfaceC1453Lb0);
        this.D = new AtomicReference(null);
        this.E = new HandlerC5768jm1(Looper.getMainLooper());
        this.F = c9320wT;
    }

    public static final int p(C2869Yl1 c2869Yl1) {
        if (c2869Yl1 == null) {
            return -1;
        }
        return c2869Yl1.a();
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void e(int i, int i2, Intent intent) {
        C2869Yl1 c2869Yl1 = (C2869Yl1) this.D.get();
        if (i != 1) {
            if (i == 2) {
                int iG = this.F.g(b());
                if (iG == 0) {
                    o();
                    return;
                } else {
                    if (c2869Yl1 == null) {
                        return;
                    }
                    if (c2869Yl1.b().e() == 18 && iG == 18) {
                        return;
                    }
                }
            }
        } else if (i2 == -1) {
            o();
            return;
        } else if (i2 == 0) {
            if (c2869Yl1 != null) {
                l(new ConnectionResult(intent != null ? intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13) : 13, null, c2869Yl1.b().toString()), p(c2869Yl1));
                return;
            }
            return;
        }
        if (c2869Yl1 != null) {
            l(c2869Yl1.b(), c2869Yl1.a());
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void f(Bundle bundle) {
        super.f(bundle);
        if (bundle != null) {
            this.D.set(bundle.getBoolean("resolving_error", false) ? new C2869Yl1(new ConnectionResult(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1)) : null);
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void i(Bundle bundle) {
        super.i(bundle);
        C2869Yl1 c2869Yl1 = (C2869Yl1) this.D.get();
        if (c2869Yl1 == null) {
            return;
        }
        bundle.putBoolean("resolving_error", true);
        bundle.putInt("failed_client_id", c2869Yl1.a());
        bundle.putInt("failed_status", c2869Yl1.b().e());
        bundle.putParcelable("failed_resolution", c2869Yl1.b().p());
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public void j() {
        super.j();
        this.C = true;
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public void k() {
        super.k();
        this.C = false;
    }

    public final void l(ConnectionResult connectionResult, int i) {
        this.D.set(null);
        m(connectionResult, i);
    }

    public abstract void m(ConnectionResult connectionResult, int i);

    public abstract void n();

    public final void o() {
        this.D.set(null);
        n();
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        l(new ConnectionResult(13, null), p((C2869Yl1) this.D.get()));
    }

    public final void s(ConnectionResult connectionResult, int i) {
        AtomicReference atomicReference;
        C2869Yl1 c2869Yl1 = new C2869Yl1(connectionResult, i);
        do {
            atomicReference = this.D;
            if (AbstractC0552Cm0.a(atomicReference, null, c2869Yl1)) {
                this.E.post(new RunnableC4651fm1(this, c2869Yl1));
                return;
            }
        } while (atomicReference.get() == null);
    }
}
