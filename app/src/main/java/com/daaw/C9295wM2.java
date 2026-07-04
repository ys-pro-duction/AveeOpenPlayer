package com.daaw;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.IOException;

/* JADX INFO: renamed from: com.daaw.wM2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9295wM2 {
    public static C9295wM2 c;
    public final String a;
    public final SharedPreferences b;

    public C9295wM2(Context context) {
        this.a = context.getPackageName();
        this.b = context.getSharedPreferences("paid_storage_sp", 0);
    }

    public static C9295wM2 b(Context context) {
        if (c == null) {
            c = new C9295wM2(context);
        }
        return c;
    }

    public final long a(String str, long j) {
        return this.b.getLong(str, -1L);
    }

    public final String c(String str, String str2) {
        return this.b.getString(str, null);
    }

    public final void d(String str, Object obj) throws IOException {
        boolean zCommit;
        if (obj instanceof String) {
            zCommit = this.b.edit().putString(str, (String) obj).commit();
        } else if (obj instanceof Long) {
            zCommit = this.b.edit().putLong(str, ((Long) obj).longValue()).commit();
        } else {
            if (!(obj instanceof Boolean)) {
                throw new IllegalArgumentException("Unexpected object class " + String.valueOf(obj.getClass()) + " for app " + this.a);
            }
            zCommit = this.b.edit().putBoolean(str, ((Boolean) obj).booleanValue()).commit();
        }
        if (zCommit) {
            return;
        }
        throw new IOException("Failed to store " + str + " for app " + this.a);
    }

    public final void e(String str) throws IOException {
        if (this.b.edit().remove(str).commit()) {
            return;
        }
        throw new IOException("Failed to remove " + str + " for app " + this.a);
    }

    public final boolean f(String str, boolean z) {
        return this.b.getBoolean(str, true);
    }

    public final boolean g(String str) {
        return this.b.contains(str);
    }
}
