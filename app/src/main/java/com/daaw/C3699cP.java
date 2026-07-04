package com.daaw;

import android.app.Notification;

/* JADX INFO: renamed from: com.daaw.cP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3699cP {
    public final int a;
    public final int b;
    public final Notification c;

    public C3699cP(int i, Notification notification, int i2) {
        this.a = i;
        this.c = notification;
        this.b = i2;
    }

    public int a() {
        return this.b;
    }

    public Notification b() {
        return this.c;
    }

    public int c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3699cP.class != obj.getClass()) {
            return false;
        }
        C3699cP c3699cP = (C3699cP) obj;
        if (this.a == c3699cP.a && this.b == c3699cP.b) {
            return this.c.equals(c3699cP.c);
        }
        return false;
    }

    public int hashCode() {
        return (((this.a * 31) + this.b) * 31) + this.c.hashCode();
    }

    public String toString() {
        return "ForegroundInfo{mNotificationId=" + this.a + ", mForegroundServiceType=" + this.b + ", mNotification=" + this.c + '}';
    }
}
