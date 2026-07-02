package com.daaw;

import android.text.TextUtils;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class DS2 {
    public final Executor a;

    public DS2(Executor executor) {
        this.a = executor;
    }

    public final Executor a() {
        return this.a;
    }

    public final void b(final String str, final String str2, final InterfaceC9817yD2... interfaceC9817yD2Arr) {
        this.a.execute(new Runnable() { // from class: com.daaw.co2
            @Override // java.lang.Runnable
            public final void run() {
                final JSONObject jSONObject;
                String str3 = str;
                String str4 = str2;
                InterfaceC9817yD2[] interfaceC9817yD2Arr2 = interfaceC9817yD2Arr;
                if (TextUtils.isEmpty(str3)) {
                    return;
                }
                final String lowerCase = str3.toLowerCase();
                if (TextUtils.isEmpty(str4)) {
                    jSONObject = new JSONObject();
                } else {
                    try {
                        jSONObject = new JSONObject(str4);
                    } catch (JSONException unused) {
                        return;
                    }
                }
                jSONObject.toString();
                for (final InterfaceC9817yD2 interfaceC9817yD2 : interfaceC9817yD2Arr2) {
                    FutureTask futureTask = new FutureTask(new Callable() { // from class: com.daaw.p82
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return Boolean.valueOf(interfaceC9817yD2.a(lowerCase, jSONObject));
                        }
                    });
                    interfaceC9817yD2.zza().execute(futureTask);
                    try {
                    } catch (InterruptedException unused2) {
                    } catch (ExecutionException e) {
                        e.getCause();
                    }
                    if (((Boolean) futureTask.get()).booleanValue()) {
                        return;
                    }
                }
            }
        });
    }
}
