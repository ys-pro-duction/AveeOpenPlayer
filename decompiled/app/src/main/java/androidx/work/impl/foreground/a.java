package androidx.work.impl.foreground;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import com.daaw.AbstractC1772Od0;
import com.daaw.C0537Ci1;
import com.daaw.C1793Oi1;
import com.daaw.C3699cP;
import com.daaw.C7431pi1;
import com.daaw.InterfaceC7152oi1;
import com.daaw.InterfaceC8357t11;
import com.daaw.InterfaceC8997vI;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public class a implements InterfaceC7152oi1, InterfaceC8997vI {
    public static final String L = AbstractC1772Od0.f("SystemFgDispatcher");
    public Context B;
    public C0537Ci1 C;
    public final InterfaceC8357t11 D;
    public final Object E = new Object();
    public String F;
    public final Map G;
    public final Map H;
    public final Set I;
    public final C7431pi1 J;
    public b K;

    /* JADX INFO: renamed from: androidx.work.impl.foreground.a$a, reason: collision with other inner class name */
    public class RunnableC0040a implements Runnable {
        public final /* synthetic */ WorkDatabase B;
        public final /* synthetic */ String C;

        public RunnableC0040a(WorkDatabase workDatabase, String str) {
            this.B = workDatabase;
            this.C = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            C1793Oi1 c1793Oi1M = this.B.B().m(this.C);
            if (c1793Oi1M == null || !c1793Oi1M.b()) {
                return;
            }
            synchronized (a.this.E) {
                a.this.H.put(this.C, c1793Oi1M);
                a.this.I.add(c1793Oi1M);
                a aVar = a.this;
                aVar.J.d(aVar.I);
            }
        }
    }

    public interface b {
        void b(int i, int i2, Notification notification);

        void d(int i, Notification notification);

        void e(int i);

        void stop();
    }

    public a(Context context) {
        this.B = context;
        C0537Ci1 c0537Ci1K = C0537Ci1.k(context);
        this.C = c0537Ci1K;
        InterfaceC8357t11 interfaceC8357t11P = c0537Ci1K.p();
        this.D = interfaceC8357t11P;
        this.F = null;
        this.G = new LinkedHashMap();
        this.I = new HashSet();
        this.H = new HashMap();
        this.J = new C7431pi1(this.B, interfaceC8357t11P, this);
        this.C.m().d(this);
    }

    public static Intent a(Context context, String str, C3699cP c3699cP) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", c3699cP.c());
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", c3699cP.a());
        intent.putExtra("KEY_NOTIFICATION", c3699cP.b());
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public static Intent d(Context context, String str, C3699cP c3699cP) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NOTIFICATION_ID", c3699cP.c());
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", c3699cP.a());
        intent.putExtra("KEY_NOTIFICATION", c3699cP.b());
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public static Intent e(Context context) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_STOP_FOREGROUND");
        return intent;
    }

    @Override // com.daaw.InterfaceC7152oi1
    public void b(List list) {
        if (list.isEmpty()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            AbstractC1772Od0.c().a(L, String.format("Constraints unmet for WorkSpec %s", str), new Throwable[0]);
            this.C.w(str);
        }
    }

    @Override // com.daaw.InterfaceC8997vI
    public void c(String str, boolean z) {
        Map.Entry entry;
        synchronized (this.E) {
            try {
                C1793Oi1 c1793Oi1 = (C1793Oi1) this.H.remove(str);
                if (c1793Oi1 != null ? this.I.remove(c1793Oi1) : false) {
                    this.J.d(this.I);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        C3699cP c3699cP = (C3699cP) this.G.remove(str);
        if (str.equals(this.F) && this.G.size() > 0) {
            Iterator it = this.G.entrySet().iterator();
            Object next = it.next();
            while (true) {
                entry = (Map.Entry) next;
                if (!it.hasNext()) {
                    break;
                } else {
                    next = it.next();
                }
            }
            this.F = (String) entry.getKey();
            if (this.K != null) {
                C3699cP c3699cP2 = (C3699cP) entry.getValue();
                this.K.b(c3699cP2.c(), c3699cP2.a(), c3699cP2.b());
                this.K.e(c3699cP2.c());
            }
        }
        b bVar = this.K;
        if (c3699cP == null || bVar == null) {
            return;
        }
        AbstractC1772Od0.c().a(L, String.format("Removing Notification (id: %s, workSpecId: %s ,notificationType: %s)", Integer.valueOf(c3699cP.c()), str, Integer.valueOf(c3699cP.a())), new Throwable[0]);
        bVar.e(c3699cP.c());
    }

    @Override // com.daaw.InterfaceC7152oi1
    public void f(List list) {
    }

    public final void g(Intent intent) {
        AbstractC1772Od0.c().d(L, String.format("Stopping foreground work for %s", intent), new Throwable[0]);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        if (stringExtra == null || TextUtils.isEmpty(stringExtra)) {
            return;
        }
        this.C.f(UUID.fromString(stringExtra));
    }

    public final void h(Intent intent) {
        int iA = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        AbstractC1772Od0.c().a(L, String.format("Notifying with (id: %s, workSpecId: %s, notificationType: %s)", Integer.valueOf(intExtra), stringExtra, Integer.valueOf(intExtra2)), new Throwable[0]);
        if (notification == null || this.K == null) {
            return;
        }
        this.G.put(stringExtra, new C3699cP(intExtra, notification, intExtra2));
        if (TextUtils.isEmpty(this.F)) {
            this.F = stringExtra;
            this.K.b(intExtra, intExtra2, notification);
            return;
        }
        this.K.d(intExtra, notification);
        if (intExtra2 == 0 || Build.VERSION.SDK_INT < 29) {
            return;
        }
        Iterator it = this.G.entrySet().iterator();
        while (it.hasNext()) {
            iA |= ((C3699cP) ((Map.Entry) it.next()).getValue()).a();
        }
        C3699cP c3699cP = (C3699cP) this.G.get(this.F);
        if (c3699cP != null) {
            this.K.b(c3699cP.c(), iA, c3699cP.b());
        }
    }

    public final void i(Intent intent) {
        AbstractC1772Od0.c().d(L, String.format("Started foreground service %s", intent), new Throwable[0]);
        this.D.b(new RunnableC0040a(this.C.o(), intent.getStringExtra("KEY_WORKSPEC_ID")));
    }

    public void j(Intent intent) {
        AbstractC1772Od0.c().d(L, "Stopping foreground service", new Throwable[0]);
        b bVar = this.K;
        if (bVar != null) {
            bVar.stop();
        }
    }

    public void k() {
        this.K = null;
        synchronized (this.E) {
            this.J.e();
        }
        this.C.m().i(this);
    }

    public void l(Intent intent) {
        String action = intent.getAction();
        if ("ACTION_START_FOREGROUND".equals(action)) {
            i(intent);
            h(intent);
        } else if ("ACTION_NOTIFY".equals(action)) {
            h(intent);
        } else if ("ACTION_CANCEL_WORK".equals(action)) {
            g(intent);
        } else if ("ACTION_STOP_FOREGROUND".equals(action)) {
            j(intent);
        }
    }

    public void m(b bVar) {
        if (this.K != null) {
            AbstractC1772Od0.c().b(L, "A callback already exists.", new Throwable[0]);
        } else {
            this.K = bVar;
        }
    }
}
