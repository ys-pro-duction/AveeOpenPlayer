package com.daaw;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.work.impl.WorkDatabase;

/* JADX INFO: loaded from: classes.dex */
public class RX {
    public final WorkDatabase a;

    public RX(WorkDatabase workDatabase) {
        this.a = workDatabase;
    }

    public static void a(Context context, JZ0 jz0) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.id", 0);
        if (sharedPreferences.contains("next_job_scheduler_id") || sharedPreferences.contains("next_job_scheduler_id")) {
            int i = sharedPreferences.getInt("next_job_scheduler_id", 0);
            int i2 = sharedPreferences.getInt("next_alarm_manager_id", 0);
            jz0.m();
            try {
                jz0.V("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_job_scheduler_id", Integer.valueOf(i)});
                jz0.V("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_alarm_manager_id", Integer.valueOf(i2)});
                sharedPreferences.edit().clear().apply();
                jz0.T();
            } finally {
                jz0.l0();
            }
        }
    }

    public int b() {
        int iC;
        synchronized (RX.class) {
            iC = c("next_alarm_manager_id");
        }
        return iC;
    }

    public final int c(String str) {
        this.a.c();
        try {
            Long lB = this.a.x().b(str);
            int i = 0;
            int iIntValue = lB != null ? lB.intValue() : 0;
            if (iIntValue != Integer.MAX_VALUE) {
                i = iIntValue + 1;
            }
            e(str, i);
            this.a.r();
            this.a.g();
            return iIntValue;
        } catch (Throwable th) {
            this.a.g();
            throw th;
        }
    }

    public int d(int i, int i2) {
        synchronized (RX.class) {
            int iC = c("next_job_scheduler_id");
            if (iC < i || iC > i2) {
                e("next_job_scheduler_id", i + 1);
            } else {
                i = iC;
            }
        }
        return i;
    }

    public final void e(String str, int i) {
        this.a.x().a(new C3864cz0(str, i));
    }
}
