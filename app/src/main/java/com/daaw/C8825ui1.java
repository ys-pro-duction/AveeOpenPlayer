package com.daaw;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import java.util.UUID;

/* JADX INFO: renamed from: com.daaw.ui1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C8825ui1 implements InterfaceC4545fP {
    public static final String d = AbstractC1772Od0.f("WMFgUpdater");
    public final InterfaceC8357t11 a;
    public final InterfaceC4256eP b;
    public final InterfaceC1897Pi1 c;

    /* JADX INFO: renamed from: com.daaw.ui1$a */
    public class a implements Runnable {
        public final /* synthetic */ AQ0 B;
        public final /* synthetic */ UUID C;
        public final /* synthetic */ C3699cP D;
        public final /* synthetic */ Context E;

        public a(AQ0 aq0, UUID uuid, C3699cP c3699cP, Context context) {
            this.B = aq0;
            this.C = uuid;
            this.D = c3699cP;
            this.E = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (!this.B.isCancelled()) {
                    String string = this.C.toString();
                    EnumC9111vi1 enumC9111vi1L = C8825ui1.this.c.l(string);
                    if (enumC9111vi1L == null || enumC9111vi1L.a()) {
                        throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                    }
                    C8825ui1.this.b.a(string, this.D);
                    this.E.startService(androidx.work.impl.foreground.a.a(this.E, string, this.D));
                }
                this.B.p(null);
            } catch (Throwable th) {
                this.B.q(th);
            }
        }
    }

    public C8825ui1(WorkDatabase workDatabase, InterfaceC4256eP interfaceC4256eP, InterfaceC8357t11 interfaceC8357t11) {
        this.b = interfaceC4256eP;
        this.a = interfaceC8357t11;
        this.c = workDatabase.B();
    }

    @Override // com.daaw.InterfaceC4545fP
    public InterfaceFutureC8236sc0 a(Context context, UUID uuid, C3699cP c3699cP) {
        AQ0 aq0T = AQ0.t();
        this.a.b(new a(aq0T, uuid, c3699cP, context));
        return aq0T;
    }
}
