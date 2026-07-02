package com.daaw;

import android.os.SystemClock;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;

/* JADX INFO: renamed from: com.daaw.rl1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C8003rl1 implements InterfaceC5228hq0 {
    public final C10157zT a;
    public final int b;
    public final H8 c;
    public final long d;
    public final long e;

    public C8003rl1(C10157zT c10157zT, int i, H8 h8, long j, long j2, String str, String str2) {
        this.a = c10157zT;
        this.b = i;
        this.c = h8;
        this.d = j;
        this.e = j2;
    }

    public static C8003rl1 b(C10157zT c10157zT, int i, H8 h8) {
        boolean zS;
        if (!c10157zT.d()) {
            return null;
        }
        RootTelemetryConfiguration rootTelemetryConfigurationA = XJ0.b().a();
        if (rootTelemetryConfigurationA == null) {
            zS = true;
        } else {
            if (!rootTelemetryConfigurationA.p()) {
                return null;
            }
            zS = rootTelemetryConfigurationA.s();
            C4646fl1 c4646fl1S = c10157zT.s(h8);
            if (c4646fl1S != null) {
                if (!(c4646fl1S.s() instanceof AbstractC8245se)) {
                    return null;
                }
                AbstractC8245se abstractC8245se = (AbstractC8245se) c4646fl1S.s();
                if (abstractC8245se.hasConnectionInfo() && !abstractC8245se.isConnecting()) {
                    ConnectionTelemetryConfiguration connectionTelemetryConfigurationC = c(c4646fl1S, abstractC8245se, i);
                    if (connectionTelemetryConfigurationC == null) {
                        return null;
                    }
                    c4646fl1S.E();
                    zS = connectionTelemetryConfigurationC.v();
                }
            }
        }
        return new C8003rl1(c10157zT, i, h8, zS ? System.currentTimeMillis() : 0L, zS ? SystemClock.elapsedRealtime() : 0L, null, null);
    }

    public static ConnectionTelemetryConfiguration c(C4646fl1 c4646fl1, AbstractC8245se abstractC8245se, int i) {
        int[] iArrM;
        int[] iArrP;
        ConnectionTelemetryConfiguration telemetryConfiguration = abstractC8245se.getTelemetryConfiguration();
        if (telemetryConfiguration == null || !telemetryConfiguration.s() || ((iArrM = telemetryConfiguration.m()) != null ? !AbstractC3470bb.a(iArrM, i) : !((iArrP = telemetryConfiguration.p()) == null || !AbstractC3470bb.a(iArrP, i))) || c4646fl1.q() >= telemetryConfiguration.e()) {
            return null;
        }
        return telemetryConfiguration;
    }

    @Override // com.daaw.InterfaceC5228hq0
    public final void a(AbstractC6963o11 abstractC6963o11) {
        C4646fl1 c4646fl1S;
        int iV;
        int i;
        int i2;
        int i3;
        int iE;
        long j;
        long jCurrentTimeMillis;
        int iElapsedRealtime;
        if (this.a.d()) {
            RootTelemetryConfiguration rootTelemetryConfigurationA = XJ0.b().a();
            if ((rootTelemetryConfigurationA == null || rootTelemetryConfigurationA.p()) && (c4646fl1S = this.a.s(this.c)) != null && (c4646fl1S.s() instanceof AbstractC8245se)) {
                AbstractC8245se abstractC8245se = (AbstractC8245se) c4646fl1S.s();
                boolean zS = this.d > 0;
                int gCoreServiceId = abstractC8245se.getGCoreServiceId();
                if (rootTelemetryConfigurationA != null) {
                    zS &= rootTelemetryConfigurationA.s();
                    int iE2 = rootTelemetryConfigurationA.e();
                    int iM = rootTelemetryConfigurationA.m();
                    iV = rootTelemetryConfigurationA.v();
                    if (abstractC8245se.hasConnectionInfo() && !abstractC8245se.isConnecting()) {
                        ConnectionTelemetryConfiguration connectionTelemetryConfigurationC = c(c4646fl1S, abstractC8245se, this.b);
                        if (connectionTelemetryConfigurationC == null) {
                            return;
                        }
                        boolean z = connectionTelemetryConfigurationC.v() && this.d > 0;
                        iM = connectionTelemetryConfigurationC.e();
                        zS = z;
                    }
                    i = iE2;
                    i2 = iM;
                } else {
                    iV = 0;
                    i = 5000;
                    i2 = 100;
                }
                C10157zT c10157zT = this.a;
                if (abstractC6963o11.n()) {
                    i3 = 0;
                    iE = 0;
                } else {
                    if (abstractC6963o11.l()) {
                        i3 = 100;
                    } else {
                        Exception excJ = abstractC6963o11.j();
                        if (excJ instanceof E8) {
                            Status statusA = ((E8) excJ).a();
                            int iM2 = statusA.m();
                            ConnectionResult connectionResultE = statusA.e();
                            if (connectionResultE == null) {
                                i3 = iM2;
                            } else {
                                iE = connectionResultE.e();
                                i3 = iM2;
                            }
                        } else {
                            i3 = 101;
                        }
                    }
                    iE = -1;
                }
                if (zS) {
                    long j2 = this.d;
                    long j3 = this.e;
                    j = j2;
                    jCurrentTimeMillis = System.currentTimeMillis();
                    iElapsedRealtime = (int) (SystemClock.elapsedRealtime() - j3);
                } else {
                    j = 0;
                    jCurrentTimeMillis = 0;
                    iElapsedRealtime = -1;
                }
                c10157zT.A(new MethodInvocation(this.b, i3, iE, j, jCurrentTimeMillis, null, null, gCoreServiceId, iElapsedRealtime), iV, i, i2);
            }
        }
    }
}
