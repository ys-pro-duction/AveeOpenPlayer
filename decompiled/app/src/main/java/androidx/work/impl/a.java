package androidx.work.impl;

import android.content.Context;
import android.os.Build;
import com.daaw.AbstractC8555tk0;
import com.daaw.C4710fz0;
import com.daaw.JZ0;
import com.daaw.RX;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static AbstractC8555tk0 a = new C0038a(1, 2);
    public static AbstractC8555tk0 b = new b(3, 4);
    public static AbstractC8555tk0 c = new c(4, 5);
    public static AbstractC8555tk0 d = new d(6, 7);
    public static AbstractC8555tk0 e = new e(7, 8);
    public static AbstractC8555tk0 f = new f(8, 9);
    public static AbstractC8555tk0 g = new g(11, 12);

    /* JADX INFO: renamed from: androidx.work.impl.a$a, reason: collision with other inner class name */
    public class C0038a extends AbstractC8555tk0 {
        public C0038a(int i, int i2) {
            super(i, i2);
        }

        @Override // com.daaw.AbstractC8555tk0
        public void a(JZ0 jz0) {
            jz0.v("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            jz0.v("INSERT INTO SystemIdInfo(work_spec_id, system_id) SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo");
            jz0.v("DROP TABLE IF EXISTS alarmInfo");
            jz0.v("INSERT OR IGNORE INTO worktag(tag, work_spec_id) SELECT worker_class_name AS tag, id AS work_spec_id FROM workspec");
        }
    }

    public class b extends AbstractC8555tk0 {
        public b(int i, int i2) {
            super(i, i2);
        }

        @Override // com.daaw.AbstractC8555tk0
        public void a(JZ0 jz0) {
            if (Build.VERSION.SDK_INT >= 23) {
                jz0.v("UPDATE workspec SET schedule_requested_at=0 WHERE state NOT IN (2, 3, 5) AND schedule_requested_at=-1 AND interval_duration<>0");
            }
        }
    }

    public class c extends AbstractC8555tk0 {
        public c(int i, int i2) {
            super(i, i2);
        }

        @Override // com.daaw.AbstractC8555tk0
        public void a(JZ0 jz0) {
            jz0.v("ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1");
            jz0.v("ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1");
        }
    }

    public class d extends AbstractC8555tk0 {
        public d(int i, int i2) {
            super(i, i2);
        }

        @Override // com.daaw.AbstractC8555tk0
        public void a(JZ0 jz0) {
            jz0.v("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        }
    }

    public class e extends AbstractC8555tk0 {
        public e(int i, int i2) {
            super(i, i2);
        }

        @Override // com.daaw.AbstractC8555tk0
        public void a(JZ0 jz0) {
            jz0.v("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `workspec` (`period_start_time`)");
        }
    }

    public class f extends AbstractC8555tk0 {
        public f(int i, int i2) {
            super(i, i2);
        }

        @Override // com.daaw.AbstractC8555tk0
        public void a(JZ0 jz0) {
            jz0.v("ALTER TABLE workspec ADD COLUMN `run_in_foreground` INTEGER NOT NULL DEFAULT 0");
        }
    }

    public class g extends AbstractC8555tk0 {
        public g(int i, int i2) {
            super(i, i2);
        }

        @Override // com.daaw.AbstractC8555tk0
        public void a(JZ0 jz0) {
            jz0.v("ALTER TABLE workspec ADD COLUMN `out_of_quota_policy` INTEGER NOT NULL DEFAULT 0");
        }
    }

    public static class h extends AbstractC8555tk0 {
        public final Context c;

        public h(Context context, int i, int i2) {
            super(i, i2);
            this.c = context;
        }

        @Override // com.daaw.AbstractC8555tk0
        public void a(JZ0 jz0) {
            if (this.b >= 10) {
                jz0.V("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", 1});
            } else {
                this.c.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
            }
        }
    }

    public static class i extends AbstractC8555tk0 {
        public final Context c;

        public i(Context context) {
            super(9, 10);
            this.c = context;
        }

        @Override // com.daaw.AbstractC8555tk0
        public void a(JZ0 jz0) {
            jz0.v("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
            C4710fz0.b(this.c, jz0);
            RX.a(this.c, jz0);
        }
    }
}
