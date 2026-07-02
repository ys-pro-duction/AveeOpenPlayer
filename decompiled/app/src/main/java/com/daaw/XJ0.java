package com.daaw;

import com.google.android.gms.common.internal.RootTelemetryConfiguration;

/* JADX INFO: loaded from: classes.dex */
public final class XJ0 {
    public static XJ0 b;
    public static final RootTelemetryConfiguration c = new RootTelemetryConfiguration(0, false, false, 0, 0);
    public RootTelemetryConfiguration a;

    public static synchronized XJ0 b() {
        try {
            if (b == null) {
                b = new XJ0();
            }
        } catch (Throwable th) {
            throw th;
        }
        return b;
    }

    public RootTelemetryConfiguration a() {
        return this.a;
    }

    public final synchronized void c(RootTelemetryConfiguration rootTelemetryConfiguration) {
        if (rootTelemetryConfiguration == null) {
            this.a = c;
            return;
        }
        RootTelemetryConfiguration rootTelemetryConfiguration2 = this.a;
        if (rootTelemetryConfiguration2 == null || rootTelemetryConfiguration2.v() < rootTelemetryConfiguration.v()) {
            this.a = rootTelemetryConfiguration;
        }
    }
}
