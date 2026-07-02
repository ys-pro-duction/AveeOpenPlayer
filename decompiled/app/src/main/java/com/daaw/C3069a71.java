package com.daaw;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import java.util.Calendar;

/* JADX INFO: renamed from: com.daaw.a71, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C3069a71 {
    public static C3069a71 d;
    public final Context a;
    public final LocationManager b;
    public final a c = new a();

    /* JADX INFO: renamed from: com.daaw.a71$a */
    public static class a {
        public boolean a;
        public long b;
    }

    public C3069a71(Context context, LocationManager locationManager) {
        this.a = context;
        this.b = locationManager;
    }

    public static C3069a71 a(Context context) {
        if (d == null) {
            Context applicationContext = context.getApplicationContext();
            d = new C3069a71(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
        }
        return d;
    }

    public final Location b() {
        Location locationC = AbstractC1524Lt0.b(this.a, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? c("network") : null;
        Location locationC2 = AbstractC1524Lt0.b(this.a, "android.permission.ACCESS_FINE_LOCATION") == 0 ? c("gps") : null;
        return (locationC2 == null || locationC == null) ? locationC2 != null ? locationC2 : locationC : locationC2.getTime() > locationC.getTime() ? locationC2 : locationC;
    }

    public final Location c(String str) {
        try {
            if (this.b.isProviderEnabled(str)) {
                return this.b.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public boolean d() {
        a aVar = this.c;
        if (e()) {
            return aVar.a;
        }
        Location locationB = b();
        if (locationB != null) {
            f(locationB);
            return aVar.a;
        }
        int i = Calendar.getInstance().get(11);
        return i < 6 || i >= 22;
    }

    public final boolean e() {
        return this.c.b > System.currentTimeMillis();
    }

    public final void f(Location location) {
        long j;
        a aVar = this.c;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Z61 z61B = Z61.b();
        z61B.a(jCurrentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
        z61B.a(jCurrentTimeMillis, location.getLatitude(), location.getLongitude());
        boolean z = z61B.c == 1;
        long j2 = z61B.b;
        long j3 = z61B.a;
        z61B.a(jCurrentTimeMillis + 86400000, location.getLatitude(), location.getLongitude());
        long j4 = z61B.b;
        if (j2 == -1 || j3 == -1) {
            j = jCurrentTimeMillis + 43200000;
        } else {
            if (jCurrentTimeMillis > j3) {
                j2 = j4;
            } else if (jCurrentTimeMillis > j2) {
                j2 = j3;
            }
            j = j2 + 60000;
        }
        aVar.a = z;
        aVar.b = j;
    }
}
