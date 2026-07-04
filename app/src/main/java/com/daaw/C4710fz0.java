package com.daaw;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.work.impl.WorkDatabase;

/* JADX INFO: renamed from: com.daaw.fz0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C4710fz0 {
    public final WorkDatabase a;

    public C4710fz0(WorkDatabase workDatabase) {
        this.a = workDatabase;
    }

    public static void b(Context context, JZ0 jz0) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.preferences", 0);
        if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
            long j = sharedPreferences.getLong("last_cancel_all_time_ms", 0L);
            long j2 = sharedPreferences.getBoolean("reschedule_needed", false) ? 1L : 0L;
            jz0.m();
            try {
                jz0.V("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"last_cancel_all_time_ms", Long.valueOf(j)});
                jz0.V("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", Long.valueOf(j2)});
                sharedPreferences.edit().clear().apply();
                jz0.T();
            } finally {
                jz0.l0();
            }
        }
    }

    public boolean a() {
        Long lB = this.a.x().b("reschedule_needed");
        return lB != null && lB.longValue() == 1;
    }

    public void c(boolean z) {
        this.a.x().a(new C3864cz0("reschedule_needed", z));
    }
}
