package com.daaw;

import android.app.ActivityManager;
import android.content.Context;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;

/* JADX INFO: renamed from: com.daaw.wj0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C9394wj0 {
    public final int a;
    public final int b;
    public final Context c;

    /* JADX INFO: renamed from: com.daaw.wj0$a */
    public static class a implements b {
        public final DisplayMetrics a;

        public a(DisplayMetrics displayMetrics) {
            this.a = displayMetrics;
        }

        @Override // com.daaw.C9394wj0.b
        public int a() {
            return this.a.heightPixels;
        }

        @Override // com.daaw.C9394wj0.b
        public int b() {
            return this.a.widthPixels;
        }
    }

    /* JADX INFO: renamed from: com.daaw.wj0$b */
    public interface b {
        int a();

        int b();
    }

    public C9394wj0(Context context) {
        this(context, (ActivityManager) context.getSystemService("activity"), new a(context.getResources().getDisplayMetrics()));
    }

    public static int b(ActivityManager activityManager) {
        return Math.round(activityManager.getMemoryClass() * 1048576 * (d(activityManager) ? 0.33f : 0.4f));
    }

    public static boolean d(ActivityManager activityManager) {
        return activityManager.isLowRamDevice();
    }

    public int a() {
        return this.a;
    }

    public int c() {
        return this.b;
    }

    public final String e(int i) {
        return Formatter.formatFileSize(this.c, i);
    }

    public C9394wj0(Context context, ActivityManager activityManager, b bVar) {
        this.c = context;
        int iB = b(activityManager);
        int iB2 = bVar.b() * bVar.a();
        int i = iB2 * 16;
        int i2 = iB2 * 8;
        if (i2 + i <= iB) {
            this.b = i2;
            this.a = i;
        } else {
            int iRound = Math.round(iB / 6.0f);
            this.b = iRound * 2;
            this.a = iRound * 4;
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            e(this.b);
            e(this.a);
            e(iB);
            activityManager.getMemoryClass();
            d(activityManager);
        }
    }
}
