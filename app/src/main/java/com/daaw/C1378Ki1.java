package com.daaw;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import java.util.UUID;

/* JADX INFO: renamed from: com.daaw.Ki1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1378Ki1 implements InterfaceC2508Uz0 {
    public static final String c = AbstractC1772Od0.f("WorkProgressUpdater");
    public final WorkDatabase a;
    public final InterfaceC8357t11 b;

    /* JADX INFO: renamed from: com.daaw.Ki1$a */
    public class a implements Runnable {
        public final /* synthetic */ UUID B;
        public final /* synthetic */ androidx.work.b C;
        public final /* synthetic */ AQ0 D;

        public a(UUID uuid, androidx.work.b bVar, AQ0 aq0) {
            this.B = uuid;
            this.C = bVar;
            this.D = aq0;
        }

        @Override // java.lang.Runnable
        public void run() {
            String string = this.B.toString();
            AbstractC1772Od0 abstractC1772Od0C = AbstractC1772Od0.c();
            String str = C1378Ki1.c;
            abstractC1772Od0C.a(str, String.format("Updating progress for %s (%s)", this.B, this.C), new Throwable[0]);
            C1378Ki1.this.a.c();
            try {
                C1793Oi1 c1793Oi1M = C1378Ki1.this.a.B().m(string);
                if (c1793Oi1M == null) {
                    throw new IllegalStateException("Calls to setProgressAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                }
                if (c1793Oi1M.b == EnumC9111vi1.RUNNING) {
                    C1378Ki1.this.a.A().b(new C1066Hi1(string, this.C));
                } else {
                    AbstractC1772Od0.c().h(str, String.format("Ignoring setProgressAsync(...). WorkSpec (%s) is not in a RUNNING state.", string), new Throwable[0]);
                }
                this.D.p(null);
                C1378Ki1.this.a.r();
            } catch (Throwable th) {
                try {
                    AbstractC1772Od0.c().b(C1378Ki1.c, "Error updating Worker progress", th);
                    this.D.q(th);
                } finally {
                    C1378Ki1.this.a.g();
                }
            }
        }
    }

    public C1378Ki1(WorkDatabase workDatabase, InterfaceC8357t11 interfaceC8357t11) {
        this.a = workDatabase;
        this.b = interfaceC8357t11;
    }

    @Override // com.daaw.InterfaceC2508Uz0
    public InterfaceFutureC8236sc0 a(Context context, UUID uuid, androidx.work.b bVar) {
        AQ0 aq0T = AQ0.t();
        this.b.b(new a(uuid, bVar, aq0T));
        return aq0T;
    }
}
