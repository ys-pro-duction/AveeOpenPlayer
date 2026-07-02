package androidx.work.impl;

import androidx.room.c;
import com.daaw.AbstractC0483Bv;
import com.daaw.C0962Gi1;
import com.daaw.C1274Ji1;
import com.daaw.C2023Qi1;
import com.daaw.C2337Ti1;
import com.daaw.C3573bw;
import com.daaw.C4421ez0;
import com.daaw.C7230oz;
import com.daaw.C7794r01;
import com.daaw.InterfaceC0858Fi1;
import com.daaw.InterfaceC1170Ii1;
import com.daaw.InterfaceC1897Pi1;
import com.daaw.InterfaceC2233Si1;
import com.daaw.InterfaceC4142dz0;
import com.daaw.InterfaceC6951nz;
import com.daaw.InterfaceC7516q01;
import com.daaw.JZ0;
import com.daaw.KZ0;
import com.daaw.QJ0;
import com.daaw.SJ0;
import com.daaw.T01;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class WorkDatabase_Impl extends WorkDatabase {
    public volatile InterfaceC1897Pi1 m;
    public volatile InterfaceC6951nz n;
    public volatile InterfaceC2233Si1 o;
    public volatile InterfaceC7516q01 p;
    public volatile InterfaceC0858Fi1 q;
    public volatile InterfaceC1170Ii1 r;
    public volatile InterfaceC4142dz0 s;

    @Override // androidx.work.impl.WorkDatabase
    public InterfaceC1170Ii1 A() {
        InterfaceC1170Ii1 interfaceC1170Ii1;
        if (this.r != null) {
            return this.r;
        }
        synchronized (this) {
            try {
                if (this.r == null) {
                    this.r = new C1274Ji1(this);
                }
                interfaceC1170Ii1 = this.r;
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC1170Ii1;
    }

    @Override // androidx.work.impl.WorkDatabase
    public InterfaceC1897Pi1 B() {
        InterfaceC1897Pi1 interfaceC1897Pi1;
        if (this.m != null) {
            return this.m;
        }
        synchronized (this) {
            try {
                if (this.m == null) {
                    this.m = new C2023Qi1(this);
                }
                interfaceC1897Pi1 = this.m;
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC1897Pi1;
    }

    @Override // androidx.work.impl.WorkDatabase
    public InterfaceC2233Si1 C() {
        InterfaceC2233Si1 interfaceC2233Si1;
        if (this.o != null) {
            return this.o;
        }
        synchronized (this) {
            try {
                if (this.o == null) {
                    this.o = new C2337Ti1(this);
                }
                interfaceC2233Si1 = this.o;
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC2233Si1;
    }

    @Override // com.daaw.QJ0
    public c e() {
        return new c(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    @Override // com.daaw.QJ0
    public KZ0 f(C3573bw c3573bw) {
        return c3573bw.a.a(KZ0.b.a(c3573bw.b).c(c3573bw.c).b(new SJ0(c3573bw, new a(12), "c103703e120ae8cc73c9248622f3cd1e", "49f946663a8deb7054212b8adda248c6")).a());
    }

    @Override // androidx.work.impl.WorkDatabase
    public InterfaceC6951nz t() {
        InterfaceC6951nz interfaceC6951nz;
        if (this.n != null) {
            return this.n;
        }
        synchronized (this) {
            try {
                if (this.n == null) {
                    this.n = new C7230oz(this);
                }
                interfaceC6951nz = this.n;
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC6951nz;
    }

    @Override // androidx.work.impl.WorkDatabase
    public InterfaceC4142dz0 x() {
        InterfaceC4142dz0 interfaceC4142dz0;
        if (this.s != null) {
            return this.s;
        }
        synchronized (this) {
            try {
                if (this.s == null) {
                    this.s = new C4421ez0(this);
                }
                interfaceC4142dz0 = this.s;
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC4142dz0;
    }

    @Override // androidx.work.impl.WorkDatabase
    public InterfaceC7516q01 y() {
        InterfaceC7516q01 interfaceC7516q01;
        if (this.p != null) {
            return this.p;
        }
        synchronized (this) {
            try {
                if (this.p == null) {
                    this.p = new C7794r01(this);
                }
                interfaceC7516q01 = this.p;
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC7516q01;
    }

    @Override // androidx.work.impl.WorkDatabase
    public InterfaceC0858Fi1 z() {
        InterfaceC0858Fi1 interfaceC0858Fi1;
        if (this.q != null) {
            return this.q;
        }
        synchronized (this) {
            try {
                if (this.q == null) {
                    this.q = new C0962Gi1(this);
                }
                interfaceC0858Fi1 = this.q;
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC0858Fi1;
    }

    public class a extends SJ0.a {
        public a(int i) {
            super(i);
        }

        @Override // com.daaw.SJ0.a
        public void a(JZ0 jz0) {
            jz0.v("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            jz0.v("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
            jz0.v("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
            jz0.v("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `period_start_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `required_network_type` INTEGER, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB, PRIMARY KEY(`id`))");
            jz0.v("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
            jz0.v("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `WorkSpec` (`period_start_time`)");
            jz0.v("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            jz0.v("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
            jz0.v("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            jz0.v("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            jz0.v("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
            jz0.v("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            jz0.v("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
            jz0.v("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            jz0.v("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c103703e120ae8cc73c9248622f3cd1e')");
        }

        @Override // com.daaw.SJ0.a
        public void b(JZ0 jz0) {
            jz0.v("DROP TABLE IF EXISTS `Dependency`");
            jz0.v("DROP TABLE IF EXISTS `WorkSpec`");
            jz0.v("DROP TABLE IF EXISTS `WorkTag`");
            jz0.v("DROP TABLE IF EXISTS `SystemIdInfo`");
            jz0.v("DROP TABLE IF EXISTS `WorkName`");
            jz0.v("DROP TABLE IF EXISTS `WorkProgress`");
            jz0.v("DROP TABLE IF EXISTS `Preference`");
            if (WorkDatabase_Impl.this.h != null) {
                int size = WorkDatabase_Impl.this.h.size();
                for (int i = 0; i < size; i++) {
                    ((QJ0.b) WorkDatabase_Impl.this.h.get(i)).b(jz0);
                }
            }
        }

        @Override // com.daaw.SJ0.a
        public void c(JZ0 jz0) {
            if (WorkDatabase_Impl.this.h != null) {
                int size = WorkDatabase_Impl.this.h.size();
                for (int i = 0; i < size; i++) {
                    ((QJ0.b) WorkDatabase_Impl.this.h.get(i)).a(jz0);
                }
            }
        }

        @Override // com.daaw.SJ0.a
        public void d(JZ0 jz0) {
            WorkDatabase_Impl.this.a = jz0;
            jz0.v("PRAGMA foreign_keys = ON");
            WorkDatabase_Impl.this.m(jz0);
            if (WorkDatabase_Impl.this.h != null) {
                int size = WorkDatabase_Impl.this.h.size();
                for (int i = 0; i < size; i++) {
                    ((QJ0.b) WorkDatabase_Impl.this.h.get(i)).c(jz0);
                }
            }
        }

        @Override // com.daaw.SJ0.a
        public void f(JZ0 jz0) {
            AbstractC0483Bv.a(jz0);
        }

        @Override // com.daaw.SJ0.a
        public SJ0.b g(JZ0 jz0) {
            HashMap map = new HashMap(2);
            map.put("work_spec_id", new T01.a("work_spec_id", "TEXT", true, 1, null, 1));
            map.put("prerequisite_id", new T01.a("prerequisite_id", "TEXT", true, 2, null, 1));
            HashSet hashSet = new HashSet(2);
            hashSet.add(new T01.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            hashSet.add(new T01.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("prerequisite_id"), Arrays.asList("id")));
            HashSet hashSet2 = new HashSet(2);
            hashSet2.add(new T01.d("index_Dependency_work_spec_id", false, Arrays.asList("work_spec_id")));
            hashSet2.add(new T01.d("index_Dependency_prerequisite_id", false, Arrays.asList("prerequisite_id")));
            T01 t01 = new T01("Dependency", map, hashSet, hashSet2);
            T01 t01A = T01.a(jz0, "Dependency");
            if (!t01.equals(t01A)) {
                return new SJ0.b(false, "Dependency(androidx.work.impl.model.Dependency).\n Expected:\n" + t01 + "\n Found:\n" + t01A);
            }
            HashMap map2 = new HashMap(25);
            map2.put("id", new T01.a("id", "TEXT", true, 1, null, 1));
            map2.put("state", new T01.a("state", "INTEGER", true, 0, null, 1));
            map2.put("worker_class_name", new T01.a("worker_class_name", "TEXT", true, 0, null, 1));
            map2.put("input_merger_class_name", new T01.a("input_merger_class_name", "TEXT", false, 0, null, 1));
            map2.put("input", new T01.a("input", "BLOB", true, 0, null, 1));
            map2.put("output", new T01.a("output", "BLOB", true, 0, null, 1));
            map2.put("initial_delay", new T01.a("initial_delay", "INTEGER", true, 0, null, 1));
            map2.put("interval_duration", new T01.a("interval_duration", "INTEGER", true, 0, null, 1));
            map2.put("flex_duration", new T01.a("flex_duration", "INTEGER", true, 0, null, 1));
            map2.put("run_attempt_count", new T01.a("run_attempt_count", "INTEGER", true, 0, null, 1));
            map2.put("backoff_policy", new T01.a("backoff_policy", "INTEGER", true, 0, null, 1));
            map2.put("backoff_delay_duration", new T01.a("backoff_delay_duration", "INTEGER", true, 0, null, 1));
            map2.put("period_start_time", new T01.a("period_start_time", "INTEGER", true, 0, null, 1));
            map2.put("minimum_retention_duration", new T01.a("minimum_retention_duration", "INTEGER", true, 0, null, 1));
            map2.put("schedule_requested_at", new T01.a("schedule_requested_at", "INTEGER", true, 0, null, 1));
            map2.put("run_in_foreground", new T01.a("run_in_foreground", "INTEGER", true, 0, null, 1));
            map2.put("out_of_quota_policy", new T01.a("out_of_quota_policy", "INTEGER", true, 0, null, 1));
            map2.put("required_network_type", new T01.a("required_network_type", "INTEGER", false, 0, null, 1));
            map2.put("requires_charging", new T01.a("requires_charging", "INTEGER", true, 0, null, 1));
            map2.put("requires_device_idle", new T01.a("requires_device_idle", "INTEGER", true, 0, null, 1));
            map2.put("requires_battery_not_low", new T01.a("requires_battery_not_low", "INTEGER", true, 0, null, 1));
            map2.put("requires_storage_not_low", new T01.a("requires_storage_not_low", "INTEGER", true, 0, null, 1));
            map2.put("trigger_content_update_delay", new T01.a("trigger_content_update_delay", "INTEGER", true, 0, null, 1));
            map2.put("trigger_max_content_delay", new T01.a("trigger_max_content_delay", "INTEGER", true, 0, null, 1));
            map2.put("content_uri_triggers", new T01.a("content_uri_triggers", "BLOB", false, 0, null, 1));
            HashSet hashSet3 = new HashSet(0);
            HashSet hashSet4 = new HashSet(2);
            hashSet4.add(new T01.d("index_WorkSpec_schedule_requested_at", false, Arrays.asList("schedule_requested_at")));
            hashSet4.add(new T01.d("index_WorkSpec_period_start_time", false, Arrays.asList("period_start_time")));
            T01 t012 = new T01("WorkSpec", map2, hashSet3, hashSet4);
            T01 t01A2 = T01.a(jz0, "WorkSpec");
            if (!t012.equals(t01A2)) {
                return new SJ0.b(false, "WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n" + t012 + "\n Found:\n" + t01A2);
            }
            HashMap map3 = new HashMap(2);
            map3.put("tag", new T01.a("tag", "TEXT", true, 1, null, 1));
            map3.put("work_spec_id", new T01.a("work_spec_id", "TEXT", true, 2, null, 1));
            HashSet hashSet5 = new HashSet(1);
            hashSet5.add(new T01.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            HashSet hashSet6 = new HashSet(1);
            hashSet6.add(new T01.d("index_WorkTag_work_spec_id", false, Arrays.asList("work_spec_id")));
            T01 t013 = new T01("WorkTag", map3, hashSet5, hashSet6);
            T01 t01A3 = T01.a(jz0, "WorkTag");
            if (!t013.equals(t01A3)) {
                return new SJ0.b(false, "WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n" + t013 + "\n Found:\n" + t01A3);
            }
            HashMap map4 = new HashMap(2);
            map4.put("work_spec_id", new T01.a("work_spec_id", "TEXT", true, 1, null, 1));
            map4.put("system_id", new T01.a("system_id", "INTEGER", true, 0, null, 1));
            HashSet hashSet7 = new HashSet(1);
            hashSet7.add(new T01.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            T01 t014 = new T01("SystemIdInfo", map4, hashSet7, new HashSet(0));
            T01 t01A4 = T01.a(jz0, "SystemIdInfo");
            if (!t014.equals(t01A4)) {
                return new SJ0.b(false, "SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n" + t014 + "\n Found:\n" + t01A4);
            }
            HashMap map5 = new HashMap(2);
            map5.put("name", new T01.a("name", "TEXT", true, 1, null, 1));
            map5.put("work_spec_id", new T01.a("work_spec_id", "TEXT", true, 2, null, 1));
            HashSet hashSet8 = new HashSet(1);
            hashSet8.add(new T01.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            HashSet hashSet9 = new HashSet(1);
            hashSet9.add(new T01.d("index_WorkName_work_spec_id", false, Arrays.asList("work_spec_id")));
            T01 t015 = new T01("WorkName", map5, hashSet8, hashSet9);
            T01 t01A5 = T01.a(jz0, "WorkName");
            if (!t015.equals(t01A5)) {
                return new SJ0.b(false, "WorkName(androidx.work.impl.model.WorkName).\n Expected:\n" + t015 + "\n Found:\n" + t01A5);
            }
            HashMap map6 = new HashMap(2);
            map6.put("work_spec_id", new T01.a("work_spec_id", "TEXT", true, 1, null, 1));
            map6.put("progress", new T01.a("progress", "BLOB", true, 0, null, 1));
            HashSet hashSet10 = new HashSet(1);
            hashSet10.add(new T01.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            T01 t016 = new T01("WorkProgress", map6, hashSet10, new HashSet(0));
            T01 t01A6 = T01.a(jz0, "WorkProgress");
            if (!t016.equals(t01A6)) {
                return new SJ0.b(false, "WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n" + t016 + "\n Found:\n" + t01A6);
            }
            HashMap map7 = new HashMap(2);
            map7.put(SubscriberAttributeKt.JSON_NAME_KEY, new T01.a(SubscriberAttributeKt.JSON_NAME_KEY, "TEXT", true, 1, null, 1));
            map7.put("long_value", new T01.a("long_value", "INTEGER", false, 0, null, 1));
            T01 t017 = new T01("Preference", map7, new HashSet(0), new HashSet(0));
            T01 t01A7 = T01.a(jz0, "Preference");
            if (t017.equals(t01A7)) {
                return new SJ0.b(true, null);
            }
            return new SJ0.b(false, "Preference(androidx.work.impl.model.Preference).\n Expected:\n" + t017 + "\n Found:\n" + t01A7);
        }

        @Override // com.daaw.SJ0.a
        public void e(JZ0 jz0) {
        }
    }
}
