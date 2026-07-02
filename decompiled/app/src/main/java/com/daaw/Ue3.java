package com.daaw;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class Ue3 implements InterfaceC6273la {
    public static InterfaceC6273la e;
    public final Context a;
    public boolean b;
    public final ScheduledExecutorService c;
    public final ExecutorService d;

    public Ue3(Context context) {
        this.b = false;
        ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        this.c = scheduledExecutorServiceNewSingleThreadScheduledExecutor;
        this.d = Executors.newSingleThreadExecutor();
        this.a = context;
        if (this.b) {
            return;
        }
        scheduledExecutorServiceNewSingleThreadScheduledExecutor.scheduleAtFixedRate(new Mb3(this, null), 0L, 86400L, TimeUnit.SECONDS);
        this.b = true;
    }

    public static synchronized InterfaceC6273la d(Context context) {
        try {
            AbstractC7506py0.m(context, "Context must not be null");
            if (e == null) {
                e = new Ue3(context.getApplicationContext());
            }
        } catch (Throwable th) {
            throw th;
        }
        return e;
    }

    public static final void f(Context context) {
        if (!g(context).edit().remove("app_set_id").commit()) {
            String strValueOf = String.valueOf(context.getPackageName());
            if (strValueOf.length() != 0) {
                "Failed to clear app set ID generated for App ".concat(strValueOf);
            }
        }
        if (g(context).edit().remove("app_set_id_last_used_time").commit()) {
            return;
        }
        String strValueOf2 = String.valueOf(context.getPackageName());
        if (strValueOf2.length() != 0) {
            "Failed to clear app set ID last used time for App ".concat(strValueOf2);
        }
    }

    public static final SharedPreferences g(Context context) {
        return context.getSharedPreferences("app_set_id_storage", 0);
    }

    public static final void h(Context context) throws C8244sd3 {
        SharedPreferences sharedPreferencesG = g(context);
        if (sharedPreferencesG.edit().putLong("app_set_id_last_used_time", C2599Vw.d().a()).commit()) {
            return;
        }
        String strValueOf = String.valueOf(context.getPackageName());
        if (strValueOf.length() != 0) {
            "Failed to store app set ID last used time for App ".concat(strValueOf);
        }
        throw new C8244sd3("Failed to store the app set ID last used time.");
    }

    @Override // com.daaw.InterfaceC6273la
    public final AbstractC6963o11 a() {
        final C7521q11 c7521q11 = new C7521q11();
        this.d.execute(new Runnable() { // from class: com.daaw.p73
            @Override // java.lang.Runnable
            public final void run() {
                this.B.e(c7521q11);
            }
        });
        return c7521q11.a();
    }

    public final long b() {
        long j = g(this.a).getLong("app_set_id_last_used_time", -1L);
        if (j != -1) {
            return j + 33696000000L;
        }
        return -1L;
    }

    public final /* synthetic */ void e(C7521q11 c7521q11) {
        String string = g(this.a).getString("app_set_id", null);
        long jB = b();
        if (string == null || C2599Vw.d().a() > jB) {
            string = UUID.randomUUID().toString();
            try {
                Context context = this.a;
                if (!g(context).edit().putString("app_set_id", string).commit()) {
                    String strValueOf = String.valueOf(context.getPackageName());
                    if (strValueOf.length() != 0) {
                        "Failed to store app set ID generated for App ".concat(strValueOf);
                    }
                    throw new C8244sd3("Failed to store the app set ID.");
                }
                h(context);
                Context context2 = this.a;
                SharedPreferences sharedPreferencesG = g(context2);
                if (!sharedPreferencesG.edit().putLong("app_set_id_creation_time", C2599Vw.d().a()).commit()) {
                    String strValueOf2 = String.valueOf(context2.getPackageName());
                    if (strValueOf2.length() != 0) {
                        "Failed to store app set ID creation time for App ".concat(strValueOf2);
                    }
                    throw new C8244sd3("Failed to store the app set ID creation time.");
                }
            } catch (C8244sd3 e2) {
                c7521q11.b(e2);
                return;
            }
        } else {
            try {
                h(this.a);
            } catch (C8244sd3 e3) {
                c7521q11.b(e3);
                return;
            }
        }
        c7521q11.c(new C6552ma(string, 1));
    }
}
