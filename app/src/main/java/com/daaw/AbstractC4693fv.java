package com.daaw;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import com.daaw.OW;

/* JADX INFO: renamed from: com.daaw.fv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4693fv {
    public final PW a;
    public final ComponentName b;
    public final Context c;

    public AbstractC4693fv(PW pw, ComponentName componentName, Context context) {
        this.a = pw;
        this.b = componentName;
        this.c = context;
    }

    public static boolean a(Context context, String str, AbstractServiceConnectionC5251hv abstractServiceConnectionC5251hv) {
        abstractServiceConnectionC5251hv.b(context.getApplicationContext());
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        if (!TextUtils.isEmpty(str)) {
            intent.setPackage(str);
        }
        return context.bindService(intent, abstractServiceConnectionC5251hv, 33);
    }

    public final OW.a b(AbstractC4404ev abstractC4404ev) {
        return new a(abstractC4404ev);
    }

    public C5528iv c(AbstractC4404ev abstractC4404ev) {
        return d(abstractC4404ev, null);
    }

    public final C5528iv d(AbstractC4404ev abstractC4404ev, PendingIntent pendingIntent) {
        boolean zK0;
        OW.a aVarB = b(abstractC4404ev);
        try {
            if (pendingIntent != null) {
                Bundle bundle = new Bundle();
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
                zK0 = this.a.S1(aVarB, bundle);
            } else {
                zK0 = this.a.k0(aVarB);
            }
            if (zK0) {
                return new C5528iv(this.a, aVarB, this.b, pendingIntent);
            }
            return null;
        } catch (RemoteException unused) {
            return null;
        }
    }

    public boolean e(long j) {
        try {
            return this.a.Y0(j);
        } catch (RemoteException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: com.daaw.fv$a */
    public class a extends OW.a {
        public Handler B = new Handler(Looper.getMainLooper());

        public a(AbstractC4404ev abstractC4404ev) {
        }

        @Override // com.daaw.OW
        public Bundle I0(String str, Bundle bundle) {
            return null;
        }

        @Override // com.daaw.OW
        public void J2(Bundle bundle) {
        }

        @Override // com.daaw.OW
        public void C2(String str, Bundle bundle) {
        }

        @Override // com.daaw.OW
        public void G1(String str, Bundle bundle) {
        }

        @Override // com.daaw.OW
        public void Y1(int i, Bundle bundle) {
        }

        @Override // com.daaw.OW
        public void q1(int i, int i2, Bundle bundle) {
        }

        @Override // com.daaw.OW
        public void M2(int i, Uri uri, boolean z, Bundle bundle) {
        }
    }
}
