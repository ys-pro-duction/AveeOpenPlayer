package com.daaw;

import android.content.Context;
import android.database.ContentObserver;

/* JADX INFO: renamed from: com.daaw.m93, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6447m93 implements InterfaceC3081a93 {
    public static C6447m93 c;
    public final Context a;
    public final ContentObserver b;

    public C6447m93() {
        this.a = null;
        this.b = null;
    }

    public static C6447m93 a(Context context) {
        C6447m93 c6447m93;
        synchronized (C6447m93.class) {
            try {
                if (c == null) {
                    c = AbstractC1524Lt0.b(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new C6447m93(context) : new C6447m93();
                }
                c6447m93 = c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c6447m93;
    }

    public static synchronized void d() {
        Context context;
        try {
            C6447m93 c6447m93 = c;
            if (c6447m93 != null && (context = c6447m93.a) != null && c6447m93.b != null) {
                context.getContentResolver().unregisterContentObserver(c.b);
            }
            c = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.daaw.InterfaceC3081a93
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final String zzb(final String str) {
        Context context = this.a;
        if (context != null && !AbstractC3076a83.a(context)) {
            try {
                return (String) S83.a(new W83() { // from class: com.daaw.e93
                    @Override // com.daaw.W83
                    public final Object zza() {
                        return this.a.c(str);
                    }
                });
            } catch (IllegalStateException | NullPointerException | SecurityException unused) {
                "Unable to read GServices for: ".concat(String.valueOf(str));
            }
        }
        return null;
    }

    public final /* synthetic */ String c(String str) {
        return AbstractC8954v73.a(this.a.getContentResolver(), str, null);
    }

    public C6447m93(Context context) {
        this.a = context;
        C5321i93 c5321i93 = new C5321i93(this, null);
        this.b = c5321i93;
        context.getContentResolver().registerContentObserver(AbstractC8954v73.a, true, c5321i93);
    }
}
