package com.google.firebase.remoteconfig.internal;

import android.content.SharedPreferences;
import com.daaw.C5091hM;
import java.util.Date;

/* JADX INFO: loaded from: classes3.dex */
public class d {
    public static final Date e = new Date(-1);
    public static final Date f = new Date(-1);
    public final SharedPreferences a;
    public final Object b = new Object();
    public final Object c = new Object();
    public final Object d = new Object();

    public static class a {
        public int a;
        public Date b;

        public a(int i, Date date) {
            this.a = i;
            this.b = date;
        }

        public Date a() {
            return this.b;
        }

        public int b() {
            return this.a;
        }
    }

    public static class b {
        public int a;
        public Date b;

        public b(int i, Date date) {
            this.a = i;
            this.b = date;
        }

        public Date a() {
            return this.b;
        }

        public int b() {
            return this.a;
        }
    }

    public d(SharedPreferences sharedPreferences) {
        this.a = sharedPreferences;
    }

    public a a() {
        a aVar;
        synchronized (this.c) {
            aVar = new a(this.a.getInt("num_failed_fetches", 0), new Date(this.a.getLong("backoff_end_time_in_millis", -1L)));
        }
        return aVar;
    }

    public long b() {
        return this.a.getLong("fetch_timeout_in_seconds", 60L);
    }

    public String c() {
        return this.a.getString("last_fetch_etag", null);
    }

    public Date d() {
        return new Date(this.a.getLong("last_fetch_time_in_millis", -1L));
    }

    public long e() {
        return this.a.getLong("last_template_version", 0L);
    }

    public long f() {
        return this.a.getLong("minimum_fetch_interval_in_seconds", c.j);
    }

    public b g() {
        b bVar;
        synchronized (this.d) {
            bVar = new b(this.a.getInt("num_failed_realtime_streams", 0), new Date(this.a.getLong("realtime_backoff_end_time_in_millis", -1L)));
        }
        return bVar;
    }

    public void h() {
        j(0, f);
    }

    public void i() {
        n(0, f);
    }

    public void j(int i, Date date) {
        synchronized (this.c) {
            this.a.edit().putInt("num_failed_fetches", i).putLong("backoff_end_time_in_millis", date.getTime()).apply();
        }
    }

    public void k(C5091hM c5091hM) {
        synchronized (this.b) {
            this.a.edit().putLong("fetch_timeout_in_seconds", c5091hM.a()).putLong("minimum_fetch_interval_in_seconds", c5091hM.b()).commit();
        }
    }

    public void l(String str) {
        synchronized (this.b) {
            this.a.edit().putString("last_fetch_etag", str).apply();
        }
    }

    public void m(long j) {
        synchronized (this.b) {
            this.a.edit().putLong("last_template_version", j).apply();
        }
    }

    public void n(int i, Date date) {
        synchronized (this.d) {
            this.a.edit().putInt("num_failed_realtime_streams", i).putLong("realtime_backoff_end_time_in_millis", date.getTime()).apply();
        }
    }

    public void o() {
        synchronized (this.b) {
            this.a.edit().putInt("last_fetch_status", 1).apply();
        }
    }

    public void p(Date date) {
        synchronized (this.b) {
            this.a.edit().putInt("last_fetch_status", -1).putLong("last_fetch_time_in_millis", date.getTime()).apply();
        }
    }

    public void q() {
        synchronized (this.b) {
            this.a.edit().putInt("last_fetch_status", 2).apply();
        }
    }
}
