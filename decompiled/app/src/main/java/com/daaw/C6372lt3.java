package com.daaw;

import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: com.daaw.lt3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6372lt3 {
    public static final C4688ft3 d = new C4688ft3(0, -9223372036854775807L, null);
    public static final C4688ft3 e = new C4688ft3(1, -9223372036854775807L, null);
    public static final C4688ft3 f = new C4688ft3(2, -9223372036854775807L, null);
    public static final C4688ft3 g = new C4688ft3(3, -9223372036854775807L, null);
    public final ExecutorService a = AbstractC9004vJ2.c("ExoPlayer:Loader:ProgressiveMediaPeriod");
    public HandlerC4967gt3 b;
    public IOException c;

    public C6372lt3(String str) {
    }

    public static C4688ft3 b(boolean z, long j) {
        return new C4688ft3(z ? 1 : 0, j, null);
    }

    public final long a(InterfaceC5246ht3 interfaceC5246ht3, InterfaceC4120dt3 interfaceC4120dt3, int i) {
        Looper looperMyLooper = Looper.myLooper();
        AbstractC6048km2.b(looperMyLooper);
        this.c = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        new HandlerC4967gt3(this, looperMyLooper, interfaceC5246ht3, interfaceC4120dt3, i, jElapsedRealtime).c(0L);
        return jElapsedRealtime;
    }

    public final void g() {
        HandlerC4967gt3 handlerC4967gt3 = this.b;
        AbstractC6048km2.b(handlerC4967gt3);
        handlerC4967gt3.a(false);
    }

    public final void h() {
        this.c = null;
    }

    public final void i(int i) throws IOException {
        IOException iOException = this.c;
        if (iOException != null) {
            throw iOException;
        }
        HandlerC4967gt3 handlerC4967gt3 = this.b;
        if (handlerC4967gt3 != null) {
            handlerC4967gt3.b(i);
        }
    }

    public final void j(InterfaceC5523it3 interfaceC5523it3) {
        HandlerC4967gt3 handlerC4967gt3 = this.b;
        if (handlerC4967gt3 != null) {
            handlerC4967gt3.a(true);
        }
        this.a.execute(new RunnableC5805jt3(interfaceC5523it3));
        this.a.shutdown();
    }

    public final boolean k() {
        return this.c != null;
    }

    public final boolean l() {
        return this.b != null;
    }
}
