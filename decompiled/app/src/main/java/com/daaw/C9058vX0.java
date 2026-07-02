package com.daaw;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.revenuecat.purchases.common.Constants;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;

/* JADX INFO: renamed from: com.daaw.vX0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C9058vX0 {
    public static final Lock c = new ReentrantLock();
    public static C9058vX0 d;
    public final Lock a = new ReentrantLock();
    public final SharedPreferences b;

    public C9058vX0(Context context) {
        this.b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public static C9058vX0 a(Context context) {
        AbstractC7506py0.l(context);
        Lock lock = c;
        lock.lock();
        try {
            if (d == null) {
                d = new C9058vX0(context.getApplicationContext());
            }
            C9058vX0 c9058vX0 = d;
            lock.unlock();
            return c9058vX0;
        } catch (Throwable th) {
            c.unlock();
            throw th;
        }
    }

    public static final String d(String str, String str2) {
        return str + Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR + str2;
    }

    public GoogleSignInAccount b() {
        String strC;
        String strC2 = c("defaultGoogleSignInAccount");
        if (!TextUtils.isEmpty(strC2) && (strC = c(d("googleSignInAccount", strC2))) != null) {
            try {
                return GoogleSignInAccount.I(strC);
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    public final String c(String str) {
        this.a.lock();
        try {
            return this.b.getString(str, null);
        } finally {
            this.a.unlock();
        }
    }
}
