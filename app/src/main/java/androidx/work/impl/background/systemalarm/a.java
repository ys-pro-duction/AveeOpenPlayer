package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.d;
import com.daaw.AbstractC1772Od0;
import com.daaw.AbstractC8644u3;
import com.daaw.C1793Oi1;
import com.daaw.InterfaceC8997vI;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class a implements InterfaceC8997vI {
    public static final String E = AbstractC1772Od0.f("CommandHandler");
    public final Context B;
    public final Map C = new HashMap();
    public final Object D = new Object();

    public a(Context context) {
        this.B = context;
    }

    public static Intent a(Context context) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_CONSTRAINTS_CHANGED");
        return intent;
    }

    public static Intent b(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public static Intent d(Context context, String str, boolean z) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z);
        return intent;
    }

    public static Intent e(Context context) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_RESCHEDULE");
        return intent;
    }

    public static Intent f(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_SCHEDULE_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public static Intent g(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_STOP_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public static boolean n(Bundle bundle, String... strArr) {
        if (bundle == null || bundle.isEmpty()) {
            return false;
        }
        for (String str : strArr) {
            if (bundle.get(str) == null) {
                return false;
            }
        }
        return true;
    }

    @Override // com.daaw.InterfaceC8997vI
    public void c(String str, boolean z) {
        synchronized (this.D) {
            try {
                InterfaceC8997vI interfaceC8997vI = (InterfaceC8997vI) this.C.remove(str);
                if (interfaceC8997vI != null) {
                    interfaceC8997vI.c(str, z);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void h(Intent intent, int i, d dVar) {
        AbstractC1772Od0.c().a(E, String.format("Handling constraints changed %s", intent), new Throwable[0]);
        new b(this.B, i, dVar).a();
    }

    public final void i(Intent intent, int i, d dVar) {
        Bundle extras = intent.getExtras();
        synchronized (this.D) {
            try {
                String string = extras.getString("KEY_WORKSPEC_ID");
                AbstractC1772Od0 abstractC1772Od0C = AbstractC1772Od0.c();
                String str = E;
                abstractC1772Od0C.a(str, String.format("Handing delay met for %s", string), new Throwable[0]);
                if (this.C.containsKey(string)) {
                    AbstractC1772Od0.c().a(str, String.format("WorkSpec %s is already being handled for ACTION_DELAY_MET", string), new Throwable[0]);
                } else {
                    c cVar = new c(this.B, i, string, dVar);
                    this.C.put(string, cVar);
                    cVar.e();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void j(Intent intent, int i) {
        Bundle extras = intent.getExtras();
        String string = extras.getString("KEY_WORKSPEC_ID");
        boolean z = extras.getBoolean("KEY_NEEDS_RESCHEDULE");
        AbstractC1772Od0.c().a(E, String.format("Handling onExecutionCompleted %s, %s", intent, Integer.valueOf(i)), new Throwable[0]);
        c(string, z);
    }

    public final void k(Intent intent, int i, d dVar) {
        AbstractC1772Od0.c().a(E, String.format("Handling reschedule %s, %s", intent, Integer.valueOf(i)), new Throwable[0]);
        dVar.g().s();
    }

    public final void l(Intent intent, int i, d dVar) {
        String string = intent.getExtras().getString("KEY_WORKSPEC_ID");
        AbstractC1772Od0 abstractC1772Od0C = AbstractC1772Od0.c();
        String str = E;
        abstractC1772Od0C.a(str, String.format("Handling schedule work for %s", string), new Throwable[0]);
        WorkDatabase workDatabaseO = dVar.g().o();
        workDatabaseO.c();
        try {
            C1793Oi1 c1793Oi1M = workDatabaseO.B().m(string);
            if (c1793Oi1M == null) {
                AbstractC1772Od0.c().h(str, "Skipping scheduling " + string + " because it's no longer in the DB", new Throwable[0]);
                return;
            }
            if (c1793Oi1M.b.a()) {
                AbstractC1772Od0.c().h(str, "Skipping scheduling " + string + "because it is finished.", new Throwable[0]);
                return;
            }
            long jA = c1793Oi1M.a();
            if (c1793Oi1M.b()) {
                AbstractC1772Od0.c().a(str, String.format("Opportunistically setting an alarm for %s at %s", string, Long.valueOf(jA)), new Throwable[0]);
                AbstractC8644u3.c(this.B, dVar.g(), string, jA);
                dVar.k(new d.b(dVar, a(this.B), i));
            } else {
                AbstractC1772Od0.c().a(str, String.format("Setting up Alarms for %s at %s", string, Long.valueOf(jA)), new Throwable[0]);
                AbstractC8644u3.c(this.B, dVar.g(), string, jA);
            }
            workDatabaseO.r();
        } finally {
            workDatabaseO.g();
        }
    }

    public final void m(Intent intent, d dVar) {
        String string = intent.getExtras().getString("KEY_WORKSPEC_ID");
        AbstractC1772Od0.c().a(E, String.format("Handing stopWork work for %s", string), new Throwable[0]);
        dVar.g().x(string);
        AbstractC8644u3.a(this.B, dVar.g(), string);
        dVar.c(string, false);
    }

    public boolean o() {
        boolean z;
        synchronized (this.D) {
            z = !this.C.isEmpty();
        }
        return z;
    }

    public void p(Intent intent, int i, d dVar) {
        String action = intent.getAction();
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            h(intent, i, dVar);
            return;
        }
        if ("ACTION_RESCHEDULE".equals(action)) {
            k(intent, i, dVar);
            return;
        }
        if (!n(intent.getExtras(), "KEY_WORKSPEC_ID")) {
            AbstractC1772Od0.c().b(E, String.format("Invalid request for %s, requires %s.", action, "KEY_WORKSPEC_ID"), new Throwable[0]);
            return;
        }
        if ("ACTION_SCHEDULE_WORK".equals(action)) {
            l(intent, i, dVar);
            return;
        }
        if ("ACTION_DELAY_MET".equals(action)) {
            i(intent, i, dVar);
            return;
        }
        if ("ACTION_STOP_WORK".equals(action)) {
            m(intent, dVar);
        } else if ("ACTION_EXECUTION_COMPLETED".equals(action)) {
            j(intent, i);
        } else {
            AbstractC1772Od0.c().h(E, String.format("Ignoring intent %s", intent), new Throwable[0]);
        }
    }
}
