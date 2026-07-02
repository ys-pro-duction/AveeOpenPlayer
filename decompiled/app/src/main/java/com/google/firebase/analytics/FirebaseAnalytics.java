package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.daaw.A11;
import com.daaw.AbstractC7506py0;
import com.daaw.C3831cr2;
import com.daaw.C8672u82;
import com.daaw.QL;
import com.daaw.Ra3;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes3.dex */
public final class FirebaseAnalytics {
    public static volatile FirebaseAnalytics b;
    public final C3831cr2 a;

    public FirebaseAnalytics(C3831cr2 c3831cr2) {
        AbstractC7506py0.l(c3831cr2);
        this.a = c3831cr2;
    }

    @Keep
    public static FirebaseAnalytics getInstance(Context context) {
        if (b == null) {
            synchronized (FirebaseAnalytics.class) {
                try {
                    if (b == null) {
                        b = new FirebaseAnalytics(C3831cr2.t(context, null, null, null, null));
                    }
                } finally {
                }
            }
        }
        return b;
    }

    @Keep
    public static Ra3 getScionFrontendApiImplementation(Context context, Bundle bundle) {
        C3831cr2 c3831cr2T = C3831cr2.t(context, null, null, null, bundle);
        if (c3831cr2T == null) {
            return null;
        }
        return new C8672u82(c3831cr2T);
    }

    @Keep
    public String getFirebaseInstanceId() {
        try {
            return (String) A11.b(QL.p().getId(), 30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        } catch (ExecutionException e2) {
            throw new IllegalStateException(e2.getCause());
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        }
    }

    @Keep
    @Deprecated
    public void setCurrentScreen(Activity activity, String str, String str2) {
        this.a.e(activity, str, str2);
    }
}
