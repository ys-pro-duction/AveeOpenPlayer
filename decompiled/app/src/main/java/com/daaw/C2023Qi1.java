package com.daaw;

import android.database.Cursor;
import com.daaw.C1793Oi1;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.Qi1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2023Qi1 implements InterfaceC1897Pi1 {
    public final QJ0 a;
    public final WG b;
    public final PR0 c;
    public final PR0 d;
    public final PR0 e;
    public final PR0 f;
    public final PR0 g;
    public final PR0 h;
    public final PR0 i;
    public final PR0 j;

    /* JADX INFO: renamed from: com.daaw.Qi1$a */
    public class a extends WG {
        public a(QJ0 qj0) {
            super(qj0);
        }

        @Override // com.daaw.PR0
        public String d() {
            return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        @Override // com.daaw.WG
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void g(NZ0 nz0, C1793Oi1 c1793Oi1) throws Throwable {
            String str = c1793Oi1.a;
            if (str == null) {
                nz0.z0(1);
            } else {
                nz0.w(1, str);
            }
            nz0.S(2, AbstractC2545Vi1.j(c1793Oi1.b));
            String str2 = c1793Oi1.c;
            if (str2 == null) {
                nz0.z0(3);
            } else {
                nz0.w(3, str2);
            }
            String str3 = c1793Oi1.d;
            if (str3 == null) {
                nz0.z0(4);
            } else {
                nz0.w(4, str3);
            }
            byte[] bArrK = androidx.work.b.k(c1793Oi1.e);
            if (bArrK == null) {
                nz0.z0(5);
            } else {
                nz0.Z(5, bArrK);
            }
            byte[] bArrK2 = androidx.work.b.k(c1793Oi1.f);
            if (bArrK2 == null) {
                nz0.z0(6);
            } else {
                nz0.Z(6, bArrK2);
            }
            nz0.S(7, c1793Oi1.g);
            nz0.S(8, c1793Oi1.h);
            nz0.S(9, c1793Oi1.i);
            nz0.S(10, c1793Oi1.k);
            nz0.S(11, AbstractC2545Vi1.a(c1793Oi1.l));
            nz0.S(12, c1793Oi1.m);
            nz0.S(13, c1793Oi1.n);
            nz0.S(14, c1793Oi1.o);
            nz0.S(15, c1793Oi1.p);
            nz0.S(16, c1793Oi1.q ? 1L : 0L);
            nz0.S(17, AbstractC2545Vi1.i(c1793Oi1.r));
            C6358lr c6358lr = c1793Oi1.j;
            if (c6358lr == null) {
                nz0.z0(18);
                nz0.z0(19);
                nz0.z0(20);
                nz0.z0(21);
                nz0.z0(22);
                nz0.z0(23);
                nz0.z0(24);
                nz0.z0(25);
                return;
            }
            nz0.S(18, AbstractC2545Vi1.h(c6358lr.b()));
            nz0.S(19, c6358lr.g() ? 1L : 0L);
            nz0.S(20, c6358lr.h() ? 1L : 0L);
            nz0.S(21, c6358lr.f() ? 1L : 0L);
            nz0.S(22, c6358lr.i() ? 1L : 0L);
            nz0.S(23, c6358lr.c());
            nz0.S(24, c6358lr.d());
            byte[] bArrC = AbstractC2545Vi1.c(c6358lr.a());
            if (bArrC == null) {
                nz0.z0(25);
            } else {
                nz0.Z(25, bArrC);
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.Qi1$b */
    public class b extends PR0 {
        public b(QJ0 qj0) {
            super(qj0);
        }

        @Override // com.daaw.PR0
        public String d() {
            return "DELETE FROM workspec WHERE id=?";
        }
    }

    /* JADX INFO: renamed from: com.daaw.Qi1$c */
    public class c extends PR0 {
        public c(QJ0 qj0) {
            super(qj0);
        }

        @Override // com.daaw.PR0
        public String d() {
            return "UPDATE workspec SET output=? WHERE id=?";
        }
    }

    /* JADX INFO: renamed from: com.daaw.Qi1$d */
    public class d extends PR0 {
        public d(QJ0 qj0) {
            super(qj0);
        }

        @Override // com.daaw.PR0
        public String d() {
            return "UPDATE workspec SET period_start_time=? WHERE id=?";
        }
    }

    /* JADX INFO: renamed from: com.daaw.Qi1$e */
    public class e extends PR0 {
        public e(QJ0 qj0) {
            super(qj0);
        }

        @Override // com.daaw.PR0
        public String d() {
            return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
        }
    }

    /* JADX INFO: renamed from: com.daaw.Qi1$f */
    public class f extends PR0 {
        public f(QJ0 qj0) {
            super(qj0);
        }

        @Override // com.daaw.PR0
        public String d() {
            return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
        }
    }

    /* JADX INFO: renamed from: com.daaw.Qi1$g */
    public class g extends PR0 {
        public g(QJ0 qj0) {
            super(qj0);
        }

        @Override // com.daaw.PR0
        public String d() {
            return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
        }
    }

    /* JADX INFO: renamed from: com.daaw.Qi1$h */
    public class h extends PR0 {
        public h(QJ0 qj0) {
            super(qj0);
        }

        @Override // com.daaw.PR0
        public String d() {
            return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
        }
    }

    /* JADX INFO: renamed from: com.daaw.Qi1$i */
    public class i extends PR0 {
        public i(QJ0 qj0) {
            super(qj0);
        }

        @Override // com.daaw.PR0
        public String d() {
            return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
        }
    }

    public C2023Qi1(QJ0 qj0) {
        this.a = qj0;
        this.b = new a(qj0);
        this.c = new b(qj0);
        this.d = new c(qj0);
        this.e = new d(qj0);
        this.f = new e(qj0);
        this.g = new f(qj0);
        this.h = new g(qj0);
        this.i = new h(qj0);
        this.j = new i(qj0);
    }

    @Override // com.daaw.InterfaceC1897Pi1
    public void a(String str) {
        this.a.b();
        NZ0 nz0A = this.c.a();
        if (str == null) {
            nz0A.z0(1);
        } else {
            nz0A.w(1, str);
        }
        this.a.c();
        try {
            nz0A.z();
            this.a.r();
        } finally {
            this.a.g();
            this.c.f(nz0A);
        }
    }

    @Override // com.daaw.InterfaceC1897Pi1
    public int b(String str, long j) {
        this.a.b();
        NZ0 nz0A = this.h.a();
        nz0A.S(1, j);
        if (str == null) {
            nz0A.z0(2);
        } else {
            nz0A.w(2, str);
        }
        this.a.c();
        try {
            int iZ = nz0A.z();
            this.a.r();
            return iZ;
        } finally {
            this.a.g();
            this.h.f(nz0A);
        }
    }

    @Override // com.daaw.InterfaceC1897Pi1
    public List c(String str) {
        TJ0 tj0D = TJ0.d("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            tj0D.z0(1);
        } else {
            tj0D.w(1, str);
        }
        this.a.b();
        Cursor cursorB = AbstractC0483Bv.b(this.a, tj0D, false, null);
        try {
            int iB = AbstractC2069Qu.b(cursorB, "id");
            int iB2 = AbstractC2069Qu.b(cursorB, "state");
            ArrayList arrayList = new ArrayList(cursorB.getCount());
            while (cursorB.moveToNext()) {
                C1793Oi1.b bVar = new C1793Oi1.b();
                bVar.a = cursorB.getString(iB);
                bVar.b = AbstractC2545Vi1.g(cursorB.getInt(iB2));
                arrayList.add(bVar);
            }
            return arrayList;
        } finally {
            cursorB.close();
            tj0D.o();
        }
    }

    @Override // com.daaw.InterfaceC1897Pi1
    public List d(long j) throws Throwable {
        TJ0 tj0;
        int iB;
        int iB2;
        int iB3;
        int iB4;
        int iB5;
        int iB6;
        int iB7;
        int iB8;
        int iB9;
        int iB10;
        int iB11;
        int iB12;
        int iB13;
        int iB14;
        TJ0 tj0D = TJ0.d("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE period_start_time >= ? AND state IN (2, 3, 5) ORDER BY period_start_time DESC", 1);
        tj0D.S(1, j);
        this.a.b();
        Cursor cursorB = AbstractC0483Bv.b(this.a, tj0D, false, null);
        try {
            iB = AbstractC2069Qu.b(cursorB, "required_network_type");
            iB2 = AbstractC2069Qu.b(cursorB, "requires_charging");
            iB3 = AbstractC2069Qu.b(cursorB, "requires_device_idle");
            iB4 = AbstractC2069Qu.b(cursorB, "requires_battery_not_low");
            iB5 = AbstractC2069Qu.b(cursorB, "requires_storage_not_low");
            iB6 = AbstractC2069Qu.b(cursorB, "trigger_content_update_delay");
            iB7 = AbstractC2069Qu.b(cursorB, "trigger_max_content_delay");
            iB8 = AbstractC2069Qu.b(cursorB, "content_uri_triggers");
            iB9 = AbstractC2069Qu.b(cursorB, "id");
            iB10 = AbstractC2069Qu.b(cursorB, "state");
            iB11 = AbstractC2069Qu.b(cursorB, "worker_class_name");
            iB12 = AbstractC2069Qu.b(cursorB, "input_merger_class_name");
            iB13 = AbstractC2069Qu.b(cursorB, "input");
            iB14 = AbstractC2069Qu.b(cursorB, "output");
            tj0 = tj0D;
        } catch (Throwable th) {
            th = th;
            tj0 = tj0D;
        }
        try {
            int iB15 = AbstractC2069Qu.b(cursorB, "initial_delay");
            int iB16 = AbstractC2069Qu.b(cursorB, "interval_duration");
            int iB17 = AbstractC2069Qu.b(cursorB, "flex_duration");
            int iB18 = AbstractC2069Qu.b(cursorB, "run_attempt_count");
            int iB19 = AbstractC2069Qu.b(cursorB, "backoff_policy");
            int iB20 = AbstractC2069Qu.b(cursorB, "backoff_delay_duration");
            int iB21 = AbstractC2069Qu.b(cursorB, "period_start_time");
            int iB22 = AbstractC2069Qu.b(cursorB, "minimum_retention_duration");
            int iB23 = AbstractC2069Qu.b(cursorB, "schedule_requested_at");
            int iB24 = AbstractC2069Qu.b(cursorB, "run_in_foreground");
            int iB25 = AbstractC2069Qu.b(cursorB, "out_of_quota_policy");
            int i2 = iB14;
            ArrayList arrayList = new ArrayList(cursorB.getCount());
            while (cursorB.moveToNext()) {
                String string = cursorB.getString(iB9);
                int i3 = iB9;
                String string2 = cursorB.getString(iB11);
                int i4 = iB11;
                C6358lr c6358lr = new C6358lr();
                int i5 = iB;
                c6358lr.k(AbstractC2545Vi1.e(cursorB.getInt(iB)));
                c6358lr.m(cursorB.getInt(iB2) != 0);
                c6358lr.n(cursorB.getInt(iB3) != 0);
                c6358lr.l(cursorB.getInt(iB4) != 0);
                c6358lr.o(cursorB.getInt(iB5) != 0);
                int i6 = iB2;
                int i7 = iB3;
                c6358lr.p(cursorB.getLong(iB6));
                c6358lr.q(cursorB.getLong(iB7));
                c6358lr.j(AbstractC2545Vi1.b(cursorB.getBlob(iB8)));
                C1793Oi1 c1793Oi1 = new C1793Oi1(string, string2);
                c1793Oi1.b = AbstractC2545Vi1.g(cursorB.getInt(iB10));
                c1793Oi1.d = cursorB.getString(iB12);
                c1793Oi1.e = androidx.work.b.g(cursorB.getBlob(iB13));
                int i8 = i2;
                c1793Oi1.f = androidx.work.b.g(cursorB.getBlob(i8));
                int i9 = iB15;
                i2 = i8;
                c1793Oi1.g = cursorB.getLong(i9);
                int i10 = iB12;
                int i11 = iB16;
                c1793Oi1.h = cursorB.getLong(i11);
                int i12 = iB4;
                int i13 = iB17;
                c1793Oi1.i = cursorB.getLong(i13);
                int i14 = iB18;
                c1793Oi1.k = cursorB.getInt(i14);
                int i15 = iB19;
                c1793Oi1.l = AbstractC2545Vi1.d(cursorB.getInt(i15));
                iB17 = i13;
                int i16 = iB20;
                c1793Oi1.m = cursorB.getLong(i16);
                int i17 = iB21;
                c1793Oi1.n = cursorB.getLong(i17);
                iB21 = i17;
                int i18 = iB22;
                c1793Oi1.o = cursorB.getLong(i18);
                int i19 = iB23;
                c1793Oi1.p = cursorB.getLong(i19);
                int i20 = iB24;
                c1793Oi1.q = cursorB.getInt(i20) != 0;
                int i21 = iB25;
                c1793Oi1.r = AbstractC2545Vi1.f(cursorB.getInt(i21));
                c1793Oi1.j = c6358lr;
                arrayList.add(c1793Oi1);
                iB20 = i16;
                iB4 = i12;
                iB19 = i15;
                iB2 = i6;
                iB25 = i21;
                iB12 = i10;
                iB15 = i9;
                iB16 = i11;
                iB18 = i14;
                iB23 = i19;
                iB9 = i3;
                iB11 = i4;
                iB = i5;
                iB24 = i20;
                iB22 = i18;
                iB3 = i7;
            }
            cursorB.close();
            tj0.o();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            cursorB.close();
            tj0.o();
            throw th;
        }
    }

    @Override // com.daaw.InterfaceC1897Pi1
    public List e(int i2) throws Throwable {
        TJ0 tj0;
        int iB;
        int iB2;
        int iB3;
        int iB4;
        int iB5;
        int iB6;
        int iB7;
        int iB8;
        int iB9;
        int iB10;
        int iB11;
        int iB12;
        int iB13;
        int iB14;
        TJ0 tj0D = TJ0.d("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY period_start_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))", 1);
        tj0D.S(1, i2);
        this.a.b();
        Cursor cursorB = AbstractC0483Bv.b(this.a, tj0D, false, null);
        try {
            iB = AbstractC2069Qu.b(cursorB, "required_network_type");
            iB2 = AbstractC2069Qu.b(cursorB, "requires_charging");
            iB3 = AbstractC2069Qu.b(cursorB, "requires_device_idle");
            iB4 = AbstractC2069Qu.b(cursorB, "requires_battery_not_low");
            iB5 = AbstractC2069Qu.b(cursorB, "requires_storage_not_low");
            iB6 = AbstractC2069Qu.b(cursorB, "trigger_content_update_delay");
            iB7 = AbstractC2069Qu.b(cursorB, "trigger_max_content_delay");
            iB8 = AbstractC2069Qu.b(cursorB, "content_uri_triggers");
            iB9 = AbstractC2069Qu.b(cursorB, "id");
            iB10 = AbstractC2069Qu.b(cursorB, "state");
            iB11 = AbstractC2069Qu.b(cursorB, "worker_class_name");
            iB12 = AbstractC2069Qu.b(cursorB, "input_merger_class_name");
            iB13 = AbstractC2069Qu.b(cursorB, "input");
            iB14 = AbstractC2069Qu.b(cursorB, "output");
            tj0 = tj0D;
        } catch (Throwable th) {
            th = th;
            tj0 = tj0D;
        }
        try {
            int iB15 = AbstractC2069Qu.b(cursorB, "initial_delay");
            int iB16 = AbstractC2069Qu.b(cursorB, "interval_duration");
            int iB17 = AbstractC2069Qu.b(cursorB, "flex_duration");
            int iB18 = AbstractC2069Qu.b(cursorB, "run_attempt_count");
            int iB19 = AbstractC2069Qu.b(cursorB, "backoff_policy");
            int iB20 = AbstractC2069Qu.b(cursorB, "backoff_delay_duration");
            int iB21 = AbstractC2069Qu.b(cursorB, "period_start_time");
            int iB22 = AbstractC2069Qu.b(cursorB, "minimum_retention_duration");
            int iB23 = AbstractC2069Qu.b(cursorB, "schedule_requested_at");
            int iB24 = AbstractC2069Qu.b(cursorB, "run_in_foreground");
            int iB25 = AbstractC2069Qu.b(cursorB, "out_of_quota_policy");
            int i3 = iB14;
            ArrayList arrayList = new ArrayList(cursorB.getCount());
            while (cursorB.moveToNext()) {
                String string = cursorB.getString(iB9);
                int i4 = iB9;
                String string2 = cursorB.getString(iB11);
                int i5 = iB11;
                C6358lr c6358lr = new C6358lr();
                int i6 = iB;
                c6358lr.k(AbstractC2545Vi1.e(cursorB.getInt(iB)));
                c6358lr.m(cursorB.getInt(iB2) != 0);
                c6358lr.n(cursorB.getInt(iB3) != 0);
                c6358lr.l(cursorB.getInt(iB4) != 0);
                c6358lr.o(cursorB.getInt(iB5) != 0);
                int i7 = iB2;
                int i8 = iB3;
                c6358lr.p(cursorB.getLong(iB6));
                c6358lr.q(cursorB.getLong(iB7));
                c6358lr.j(AbstractC2545Vi1.b(cursorB.getBlob(iB8)));
                C1793Oi1 c1793Oi1 = new C1793Oi1(string, string2);
                c1793Oi1.b = AbstractC2545Vi1.g(cursorB.getInt(iB10));
                c1793Oi1.d = cursorB.getString(iB12);
                c1793Oi1.e = androidx.work.b.g(cursorB.getBlob(iB13));
                int i9 = i3;
                c1793Oi1.f = androidx.work.b.g(cursorB.getBlob(i9));
                i3 = i9;
                int i10 = iB15;
                c1793Oi1.g = cursorB.getLong(i10);
                int i11 = iB12;
                int i12 = iB16;
                c1793Oi1.h = cursorB.getLong(i12);
                int i13 = iB4;
                int i14 = iB17;
                c1793Oi1.i = cursorB.getLong(i14);
                int i15 = iB18;
                c1793Oi1.k = cursorB.getInt(i15);
                int i16 = iB19;
                c1793Oi1.l = AbstractC2545Vi1.d(cursorB.getInt(i16));
                iB17 = i14;
                int i17 = iB20;
                c1793Oi1.m = cursorB.getLong(i17);
                int i18 = iB21;
                c1793Oi1.n = cursorB.getLong(i18);
                iB21 = i18;
                int i19 = iB22;
                c1793Oi1.o = cursorB.getLong(i19);
                int i20 = iB23;
                c1793Oi1.p = cursorB.getLong(i20);
                int i21 = iB24;
                c1793Oi1.q = cursorB.getInt(i21) != 0;
                int i22 = iB25;
                c1793Oi1.r = AbstractC2545Vi1.f(cursorB.getInt(i22));
                c1793Oi1.j = c6358lr;
                arrayList.add(c1793Oi1);
                iB20 = i17;
                iB4 = i13;
                iB19 = i16;
                iB25 = i22;
                iB2 = i7;
                iB12 = i11;
                iB15 = i10;
                iB16 = i12;
                iB18 = i15;
                iB23 = i20;
                iB9 = i4;
                iB11 = i5;
                iB = i6;
                iB24 = i21;
                iB22 = i19;
                iB3 = i8;
            }
            cursorB.close();
            tj0.o();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            cursorB.close();
            tj0.o();
            throw th;
        }
    }

    @Override // com.daaw.InterfaceC1897Pi1
    public List f() throws Throwable {
        TJ0 tj0;
        int iB;
        int iB2;
        int iB3;
        int iB4;
        int iB5;
        int iB6;
        int iB7;
        int iB8;
        int iB9;
        int iB10;
        int iB11;
        int iB12;
        int iB13;
        int iB14;
        TJ0 tj0D = TJ0.d("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at<>-1", 0);
        this.a.b();
        Cursor cursorB = AbstractC0483Bv.b(this.a, tj0D, false, null);
        try {
            iB = AbstractC2069Qu.b(cursorB, "required_network_type");
            iB2 = AbstractC2069Qu.b(cursorB, "requires_charging");
            iB3 = AbstractC2069Qu.b(cursorB, "requires_device_idle");
            iB4 = AbstractC2069Qu.b(cursorB, "requires_battery_not_low");
            iB5 = AbstractC2069Qu.b(cursorB, "requires_storage_not_low");
            iB6 = AbstractC2069Qu.b(cursorB, "trigger_content_update_delay");
            iB7 = AbstractC2069Qu.b(cursorB, "trigger_max_content_delay");
            iB8 = AbstractC2069Qu.b(cursorB, "content_uri_triggers");
            iB9 = AbstractC2069Qu.b(cursorB, "id");
            iB10 = AbstractC2069Qu.b(cursorB, "state");
            iB11 = AbstractC2069Qu.b(cursorB, "worker_class_name");
            iB12 = AbstractC2069Qu.b(cursorB, "input_merger_class_name");
            iB13 = AbstractC2069Qu.b(cursorB, "input");
            iB14 = AbstractC2069Qu.b(cursorB, "output");
            tj0 = tj0D;
        } catch (Throwable th) {
            th = th;
            tj0 = tj0D;
        }
        try {
            int iB15 = AbstractC2069Qu.b(cursorB, "initial_delay");
            int iB16 = AbstractC2069Qu.b(cursorB, "interval_duration");
            int iB17 = AbstractC2069Qu.b(cursorB, "flex_duration");
            int iB18 = AbstractC2069Qu.b(cursorB, "run_attempt_count");
            int iB19 = AbstractC2069Qu.b(cursorB, "backoff_policy");
            int iB20 = AbstractC2069Qu.b(cursorB, "backoff_delay_duration");
            int iB21 = AbstractC2069Qu.b(cursorB, "period_start_time");
            int iB22 = AbstractC2069Qu.b(cursorB, "minimum_retention_duration");
            int iB23 = AbstractC2069Qu.b(cursorB, "schedule_requested_at");
            int iB24 = AbstractC2069Qu.b(cursorB, "run_in_foreground");
            int iB25 = AbstractC2069Qu.b(cursorB, "out_of_quota_policy");
            int i2 = iB14;
            ArrayList arrayList = new ArrayList(cursorB.getCount());
            while (cursorB.moveToNext()) {
                String string = cursorB.getString(iB9);
                int i3 = iB9;
                String string2 = cursorB.getString(iB11);
                int i4 = iB11;
                C6358lr c6358lr = new C6358lr();
                int i5 = iB;
                c6358lr.k(AbstractC2545Vi1.e(cursorB.getInt(iB)));
                c6358lr.m(cursorB.getInt(iB2) != 0);
                c6358lr.n(cursorB.getInt(iB3) != 0);
                c6358lr.l(cursorB.getInt(iB4) != 0);
                c6358lr.o(cursorB.getInt(iB5) != 0);
                int i6 = iB2;
                int i7 = iB3;
                c6358lr.p(cursorB.getLong(iB6));
                c6358lr.q(cursorB.getLong(iB7));
                c6358lr.j(AbstractC2545Vi1.b(cursorB.getBlob(iB8)));
                C1793Oi1 c1793Oi1 = new C1793Oi1(string, string2);
                c1793Oi1.b = AbstractC2545Vi1.g(cursorB.getInt(iB10));
                c1793Oi1.d = cursorB.getString(iB12);
                c1793Oi1.e = androidx.work.b.g(cursorB.getBlob(iB13));
                int i8 = i2;
                c1793Oi1.f = androidx.work.b.g(cursorB.getBlob(i8));
                i2 = i8;
                int i9 = iB15;
                c1793Oi1.g = cursorB.getLong(i9);
                int i10 = iB13;
                int i11 = iB16;
                c1793Oi1.h = cursorB.getLong(i11);
                int i12 = iB4;
                int i13 = iB17;
                c1793Oi1.i = cursorB.getLong(i13);
                int i14 = iB18;
                c1793Oi1.k = cursorB.getInt(i14);
                int i15 = iB19;
                c1793Oi1.l = AbstractC2545Vi1.d(cursorB.getInt(i15));
                iB17 = i13;
                int i16 = iB20;
                c1793Oi1.m = cursorB.getLong(i16);
                int i17 = iB21;
                c1793Oi1.n = cursorB.getLong(i17);
                iB21 = i17;
                int i18 = iB22;
                c1793Oi1.o = cursorB.getLong(i18);
                int i19 = iB23;
                c1793Oi1.p = cursorB.getLong(i19);
                int i20 = iB24;
                c1793Oi1.q = cursorB.getInt(i20) != 0;
                int i21 = iB25;
                c1793Oi1.r = AbstractC2545Vi1.f(cursorB.getInt(i21));
                c1793Oi1.j = c6358lr;
                arrayList.add(c1793Oi1);
                iB20 = i16;
                iB4 = i12;
                iB19 = i15;
                iB25 = i21;
                iB2 = i6;
                iB13 = i10;
                iB15 = i9;
                iB16 = i11;
                iB18 = i14;
                iB23 = i19;
                iB9 = i3;
                iB11 = i4;
                iB = i5;
                iB24 = i20;
                iB22 = i18;
                iB3 = i7;
            }
            cursorB.close();
            tj0.o();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            cursorB.close();
            tj0.o();
            throw th;
        }
    }

    @Override // com.daaw.InterfaceC1897Pi1
    public void g(String str, androidx.work.b bVar) throws Throwable {
        this.a.b();
        NZ0 nz0A = this.d.a();
        byte[] bArrK = androidx.work.b.k(bVar);
        if (bArrK == null) {
            nz0A.z0(1);
        } else {
            nz0A.Z(1, bArrK);
        }
        if (str == null) {
            nz0A.z0(2);
        } else {
            nz0A.w(2, str);
        }
        this.a.c();
        try {
            nz0A.z();
            this.a.r();
        } finally {
            this.a.g();
            this.d.f(nz0A);
        }
    }

    @Override // com.daaw.InterfaceC1897Pi1
    public List h() throws Throwable {
        TJ0 tj0;
        int iB;
        int iB2;
        int iB3;
        int iB4;
        int iB5;
        int iB6;
        int iB7;
        int iB8;
        int iB9;
        int iB10;
        int iB11;
        int iB12;
        int iB13;
        int iB14;
        TJ0 tj0D = TJ0.d("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=1", 0);
        this.a.b();
        Cursor cursorB = AbstractC0483Bv.b(this.a, tj0D, false, null);
        try {
            iB = AbstractC2069Qu.b(cursorB, "required_network_type");
            iB2 = AbstractC2069Qu.b(cursorB, "requires_charging");
            iB3 = AbstractC2069Qu.b(cursorB, "requires_device_idle");
            iB4 = AbstractC2069Qu.b(cursorB, "requires_battery_not_low");
            iB5 = AbstractC2069Qu.b(cursorB, "requires_storage_not_low");
            iB6 = AbstractC2069Qu.b(cursorB, "trigger_content_update_delay");
            iB7 = AbstractC2069Qu.b(cursorB, "trigger_max_content_delay");
            iB8 = AbstractC2069Qu.b(cursorB, "content_uri_triggers");
            iB9 = AbstractC2069Qu.b(cursorB, "id");
            iB10 = AbstractC2069Qu.b(cursorB, "state");
            iB11 = AbstractC2069Qu.b(cursorB, "worker_class_name");
            iB12 = AbstractC2069Qu.b(cursorB, "input_merger_class_name");
            iB13 = AbstractC2069Qu.b(cursorB, "input");
            iB14 = AbstractC2069Qu.b(cursorB, "output");
            tj0 = tj0D;
        } catch (Throwable th) {
            th = th;
            tj0 = tj0D;
        }
        try {
            int iB15 = AbstractC2069Qu.b(cursorB, "initial_delay");
            int iB16 = AbstractC2069Qu.b(cursorB, "interval_duration");
            int iB17 = AbstractC2069Qu.b(cursorB, "flex_duration");
            int iB18 = AbstractC2069Qu.b(cursorB, "run_attempt_count");
            int iB19 = AbstractC2069Qu.b(cursorB, "backoff_policy");
            int iB20 = AbstractC2069Qu.b(cursorB, "backoff_delay_duration");
            int iB21 = AbstractC2069Qu.b(cursorB, "period_start_time");
            int iB22 = AbstractC2069Qu.b(cursorB, "minimum_retention_duration");
            int iB23 = AbstractC2069Qu.b(cursorB, "schedule_requested_at");
            int iB24 = AbstractC2069Qu.b(cursorB, "run_in_foreground");
            int iB25 = AbstractC2069Qu.b(cursorB, "out_of_quota_policy");
            int i2 = iB14;
            ArrayList arrayList = new ArrayList(cursorB.getCount());
            while (cursorB.moveToNext()) {
                String string = cursorB.getString(iB9);
                int i3 = iB9;
                String string2 = cursorB.getString(iB11);
                int i4 = iB11;
                C6358lr c6358lr = new C6358lr();
                int i5 = iB;
                c6358lr.k(AbstractC2545Vi1.e(cursorB.getInt(iB)));
                c6358lr.m(cursorB.getInt(iB2) != 0);
                c6358lr.n(cursorB.getInt(iB3) != 0);
                c6358lr.l(cursorB.getInt(iB4) != 0);
                c6358lr.o(cursorB.getInt(iB5) != 0);
                int i6 = iB2;
                int i7 = iB3;
                c6358lr.p(cursorB.getLong(iB6));
                c6358lr.q(cursorB.getLong(iB7));
                c6358lr.j(AbstractC2545Vi1.b(cursorB.getBlob(iB8)));
                C1793Oi1 c1793Oi1 = new C1793Oi1(string, string2);
                c1793Oi1.b = AbstractC2545Vi1.g(cursorB.getInt(iB10));
                c1793Oi1.d = cursorB.getString(iB12);
                c1793Oi1.e = androidx.work.b.g(cursorB.getBlob(iB13));
                int i8 = i2;
                c1793Oi1.f = androidx.work.b.g(cursorB.getBlob(i8));
                i2 = i8;
                int i9 = iB15;
                c1793Oi1.g = cursorB.getLong(i9);
                int i10 = iB13;
                int i11 = iB16;
                c1793Oi1.h = cursorB.getLong(i11);
                int i12 = iB4;
                int i13 = iB17;
                c1793Oi1.i = cursorB.getLong(i13);
                int i14 = iB18;
                c1793Oi1.k = cursorB.getInt(i14);
                int i15 = iB19;
                c1793Oi1.l = AbstractC2545Vi1.d(cursorB.getInt(i15));
                iB17 = i13;
                int i16 = iB20;
                c1793Oi1.m = cursorB.getLong(i16);
                int i17 = iB21;
                c1793Oi1.n = cursorB.getLong(i17);
                iB21 = i17;
                int i18 = iB22;
                c1793Oi1.o = cursorB.getLong(i18);
                int i19 = iB23;
                c1793Oi1.p = cursorB.getLong(i19);
                int i20 = iB24;
                c1793Oi1.q = cursorB.getInt(i20) != 0;
                int i21 = iB25;
                c1793Oi1.r = AbstractC2545Vi1.f(cursorB.getInt(i21));
                c1793Oi1.j = c6358lr;
                arrayList.add(c1793Oi1);
                iB20 = i16;
                iB4 = i12;
                iB19 = i15;
                iB25 = i21;
                iB2 = i6;
                iB13 = i10;
                iB15 = i9;
                iB16 = i11;
                iB18 = i14;
                iB23 = i19;
                iB9 = i3;
                iB11 = i4;
                iB = i5;
                iB24 = i20;
                iB22 = i18;
                iB3 = i7;
            }
            cursorB.close();
            tj0.o();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            cursorB.close();
            tj0.o();
            throw th;
        }
    }

    @Override // com.daaw.InterfaceC1897Pi1
    public boolean i() {
        boolean z = false;
        TJ0 tj0D = TJ0.d("SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1", 0);
        this.a.b();
        Cursor cursorB = AbstractC0483Bv.b(this.a, tj0D, false, null);
        try {
            if (cursorB.moveToFirst()) {
                if (cursorB.getInt(0) != 0) {
                    z = true;
                }
            }
            return z;
        } finally {
            cursorB.close();
            tj0D.o();
        }
    }

    @Override // com.daaw.InterfaceC1897Pi1
    public List j(String str) {
        TJ0 tj0D = TJ0.d("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            tj0D.z0(1);
        } else {
            tj0D.w(1, str);
        }
        this.a.b();
        Cursor cursorB = AbstractC0483Bv.b(this.a, tj0D, false, null);
        try {
            ArrayList arrayList = new ArrayList(cursorB.getCount());
            while (cursorB.moveToNext()) {
                arrayList.add(cursorB.getString(0));
            }
            return arrayList;
        } finally {
            cursorB.close();
            tj0D.o();
        }
    }

    @Override // com.daaw.InterfaceC1897Pi1
    public int k(EnumC9111vi1 enumC9111vi1, String... strArr) {
        this.a.b();
        StringBuilder sbB = AbstractC5978kY0.b();
        sbB.append("UPDATE workspec SET state=");
        sbB.append("?");
        sbB.append(" WHERE id IN (");
        AbstractC5978kY0.a(sbB, strArr.length);
        sbB.append(")");
        NZ0 nz0D = this.a.d(sbB.toString());
        nz0D.S(1, AbstractC2545Vi1.j(enumC9111vi1));
        int i2 = 2;
        for (String str : strArr) {
            if (str == null) {
                nz0D.z0(i2);
            } else {
                nz0D.w(i2, str);
            }
            i2++;
        }
        this.a.c();
        try {
            int iZ = nz0D.z();
            this.a.r();
            return iZ;
        } finally {
            this.a.g();
        }
    }

    @Override // com.daaw.InterfaceC1897Pi1
    public EnumC9111vi1 l(String str) {
        TJ0 tj0D = TJ0.d("SELECT state FROM workspec WHERE id=?", 1);
        if (str == null) {
            tj0D.z0(1);
        } else {
            tj0D.w(1, str);
        }
        this.a.b();
        Cursor cursorB = AbstractC0483Bv.b(this.a, tj0D, false, null);
        try {
            return cursorB.moveToFirst() ? AbstractC2545Vi1.g(cursorB.getInt(0)) : null;
        } finally {
            cursorB.close();
            tj0D.o();
        }
    }

    @Override // com.daaw.InterfaceC1897Pi1
    public C1793Oi1 m(String str) throws Throwable {
        TJ0 tj0;
        C1793Oi1 c1793Oi1;
        TJ0 tj0D = TJ0.d("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE id=?", 1);
        if (str == null) {
            tj0D.z0(1);
        } else {
            tj0D.w(1, str);
        }
        this.a.b();
        Cursor cursorB = AbstractC0483Bv.b(this.a, tj0D, false, null);
        try {
            int iB = AbstractC2069Qu.b(cursorB, "required_network_type");
            int iB2 = AbstractC2069Qu.b(cursorB, "requires_charging");
            int iB3 = AbstractC2069Qu.b(cursorB, "requires_device_idle");
            int iB4 = AbstractC2069Qu.b(cursorB, "requires_battery_not_low");
            int iB5 = AbstractC2069Qu.b(cursorB, "requires_storage_not_low");
            int iB6 = AbstractC2069Qu.b(cursorB, "trigger_content_update_delay");
            int iB7 = AbstractC2069Qu.b(cursorB, "trigger_max_content_delay");
            int iB8 = AbstractC2069Qu.b(cursorB, "content_uri_triggers");
            int iB9 = AbstractC2069Qu.b(cursorB, "id");
            int iB10 = AbstractC2069Qu.b(cursorB, "state");
            int iB11 = AbstractC2069Qu.b(cursorB, "worker_class_name");
            int iB12 = AbstractC2069Qu.b(cursorB, "input_merger_class_name");
            int iB13 = AbstractC2069Qu.b(cursorB, "input");
            int iB14 = AbstractC2069Qu.b(cursorB, "output");
            tj0 = tj0D;
            try {
                int iB15 = AbstractC2069Qu.b(cursorB, "initial_delay");
                int iB16 = AbstractC2069Qu.b(cursorB, "interval_duration");
                int iB17 = AbstractC2069Qu.b(cursorB, "flex_duration");
                int iB18 = AbstractC2069Qu.b(cursorB, "run_attempt_count");
                int iB19 = AbstractC2069Qu.b(cursorB, "backoff_policy");
                int iB20 = AbstractC2069Qu.b(cursorB, "backoff_delay_duration");
                int iB21 = AbstractC2069Qu.b(cursorB, "period_start_time");
                int iB22 = AbstractC2069Qu.b(cursorB, "minimum_retention_duration");
                int iB23 = AbstractC2069Qu.b(cursorB, "schedule_requested_at");
                int iB24 = AbstractC2069Qu.b(cursorB, "run_in_foreground");
                int iB25 = AbstractC2069Qu.b(cursorB, "out_of_quota_policy");
                if (cursorB.moveToFirst()) {
                    String string = cursorB.getString(iB9);
                    String string2 = cursorB.getString(iB11);
                    C6358lr c6358lr = new C6358lr();
                    c6358lr.k(AbstractC2545Vi1.e(cursorB.getInt(iB)));
                    c6358lr.m(cursorB.getInt(iB2) != 0);
                    c6358lr.n(cursorB.getInt(iB3) != 0);
                    c6358lr.l(cursorB.getInt(iB4) != 0);
                    c6358lr.o(cursorB.getInt(iB5) != 0);
                    c6358lr.p(cursorB.getLong(iB6));
                    c6358lr.q(cursorB.getLong(iB7));
                    c6358lr.j(AbstractC2545Vi1.b(cursorB.getBlob(iB8)));
                    C1793Oi1 c1793Oi12 = new C1793Oi1(string, string2);
                    c1793Oi12.b = AbstractC2545Vi1.g(cursorB.getInt(iB10));
                    c1793Oi12.d = cursorB.getString(iB12);
                    c1793Oi12.e = androidx.work.b.g(cursorB.getBlob(iB13));
                    c1793Oi12.f = androidx.work.b.g(cursorB.getBlob(iB14));
                    c1793Oi12.g = cursorB.getLong(iB15);
                    c1793Oi12.h = cursorB.getLong(iB16);
                    c1793Oi12.i = cursorB.getLong(iB17);
                    c1793Oi12.k = cursorB.getInt(iB18);
                    c1793Oi12.l = AbstractC2545Vi1.d(cursorB.getInt(iB19));
                    c1793Oi12.m = cursorB.getLong(iB20);
                    c1793Oi12.n = cursorB.getLong(iB21);
                    c1793Oi12.o = cursorB.getLong(iB22);
                    c1793Oi12.p = cursorB.getLong(iB23);
                    c1793Oi12.q = cursorB.getInt(iB24) != 0;
                    c1793Oi12.r = AbstractC2545Vi1.f(cursorB.getInt(iB25));
                    c1793Oi12.j = c6358lr;
                    c1793Oi1 = c1793Oi12;
                } else {
                    c1793Oi1 = null;
                }
                cursorB.close();
                tj0.o();
                return c1793Oi1;
            } catch (Throwable th) {
                th = th;
                cursorB.close();
                tj0.o();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            tj0 = tj0D;
        }
    }

    @Override // com.daaw.InterfaceC1897Pi1
    public int n(String str) {
        this.a.b();
        NZ0 nz0A = this.g.a();
        if (str == null) {
            nz0A.z0(1);
        } else {
            nz0A.w(1, str);
        }
        this.a.c();
        try {
            int iZ = nz0A.z();
            this.a.r();
            return iZ;
        } finally {
            this.a.g();
            this.g.f(nz0A);
        }
    }

    @Override // com.daaw.InterfaceC1897Pi1
    public List o(String str) {
        TJ0 tj0D = TJ0.d("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
        if (str == null) {
            tj0D.z0(1);
        } else {
            tj0D.w(1, str);
        }
        this.a.b();
        Cursor cursorB = AbstractC0483Bv.b(this.a, tj0D, false, null);
        try {
            ArrayList arrayList = new ArrayList(cursorB.getCount());
            while (cursorB.moveToNext()) {
                arrayList.add(cursorB.getString(0));
            }
            return arrayList;
        } finally {
            cursorB.close();
            tj0D.o();
        }
    }

    @Override // com.daaw.InterfaceC1897Pi1
    public List p(String str) {
        TJ0 tj0D = TJ0.d("SELECT output FROM workspec WHERE id IN (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)", 1);
        if (str == null) {
            tj0D.z0(1);
        } else {
            tj0D.w(1, str);
        }
        this.a.b();
        Cursor cursorB = AbstractC0483Bv.b(this.a, tj0D, false, null);
        try {
            ArrayList arrayList = new ArrayList(cursorB.getCount());
            while (cursorB.moveToNext()) {
                arrayList.add(androidx.work.b.g(cursorB.getBlob(0)));
            }
            return arrayList;
        } finally {
            cursorB.close();
            tj0D.o();
        }
    }

    @Override // com.daaw.InterfaceC1897Pi1
    public void q(C1793Oi1 c1793Oi1) {
        this.a.b();
        this.a.c();
        try {
            this.b.h(c1793Oi1);
            this.a.r();
        } finally {
            this.a.g();
        }
    }

    @Override // com.daaw.InterfaceC1897Pi1
    public int r(String str) {
        this.a.b();
        NZ0 nz0A = this.f.a();
        if (str == null) {
            nz0A.z0(1);
        } else {
            nz0A.w(1, str);
        }
        this.a.c();
        try {
            int iZ = nz0A.z();
            this.a.r();
            return iZ;
        } finally {
            this.a.g();
            this.f.f(nz0A);
        }
    }

    @Override // com.daaw.InterfaceC1897Pi1
    public void s(String str, long j) {
        this.a.b();
        NZ0 nz0A = this.e.a();
        nz0A.S(1, j);
        if (str == null) {
            nz0A.z0(2);
        } else {
            nz0A.w(2, str);
        }
        this.a.c();
        try {
            nz0A.z();
            this.a.r();
        } finally {
            this.a.g();
            this.e.f(nz0A);
        }
    }

    @Override // com.daaw.InterfaceC1897Pi1
    public List t(int i2) throws Throwable {
        TJ0 tj0;
        int iB;
        int iB2;
        int iB3;
        int iB4;
        int iB5;
        int iB6;
        int iB7;
        int iB8;
        int iB9;
        int iB10;
        int iB11;
        int iB12;
        int iB13;
        int iB14;
        TJ0 tj0D = TJ0.d("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 ORDER BY period_start_time LIMIT ?", 1);
        tj0D.S(1, i2);
        this.a.b();
        Cursor cursorB = AbstractC0483Bv.b(this.a, tj0D, false, null);
        try {
            iB = AbstractC2069Qu.b(cursorB, "required_network_type");
            iB2 = AbstractC2069Qu.b(cursorB, "requires_charging");
            iB3 = AbstractC2069Qu.b(cursorB, "requires_device_idle");
            iB4 = AbstractC2069Qu.b(cursorB, "requires_battery_not_low");
            iB5 = AbstractC2069Qu.b(cursorB, "requires_storage_not_low");
            iB6 = AbstractC2069Qu.b(cursorB, "trigger_content_update_delay");
            iB7 = AbstractC2069Qu.b(cursorB, "trigger_max_content_delay");
            iB8 = AbstractC2069Qu.b(cursorB, "content_uri_triggers");
            iB9 = AbstractC2069Qu.b(cursorB, "id");
            iB10 = AbstractC2069Qu.b(cursorB, "state");
            iB11 = AbstractC2069Qu.b(cursorB, "worker_class_name");
            iB12 = AbstractC2069Qu.b(cursorB, "input_merger_class_name");
            iB13 = AbstractC2069Qu.b(cursorB, "input");
            iB14 = AbstractC2069Qu.b(cursorB, "output");
            tj0 = tj0D;
        } catch (Throwable th) {
            th = th;
            tj0 = tj0D;
        }
        try {
            int iB15 = AbstractC2069Qu.b(cursorB, "initial_delay");
            int iB16 = AbstractC2069Qu.b(cursorB, "interval_duration");
            int iB17 = AbstractC2069Qu.b(cursorB, "flex_duration");
            int iB18 = AbstractC2069Qu.b(cursorB, "run_attempt_count");
            int iB19 = AbstractC2069Qu.b(cursorB, "backoff_policy");
            int iB20 = AbstractC2069Qu.b(cursorB, "backoff_delay_duration");
            int iB21 = AbstractC2069Qu.b(cursorB, "period_start_time");
            int iB22 = AbstractC2069Qu.b(cursorB, "minimum_retention_duration");
            int iB23 = AbstractC2069Qu.b(cursorB, "schedule_requested_at");
            int iB24 = AbstractC2069Qu.b(cursorB, "run_in_foreground");
            int iB25 = AbstractC2069Qu.b(cursorB, "out_of_quota_policy");
            int i3 = iB14;
            ArrayList arrayList = new ArrayList(cursorB.getCount());
            while (cursorB.moveToNext()) {
                String string = cursorB.getString(iB9);
                int i4 = iB9;
                String string2 = cursorB.getString(iB11);
                int i5 = iB11;
                C6358lr c6358lr = new C6358lr();
                int i6 = iB;
                c6358lr.k(AbstractC2545Vi1.e(cursorB.getInt(iB)));
                c6358lr.m(cursorB.getInt(iB2) != 0);
                c6358lr.n(cursorB.getInt(iB3) != 0);
                c6358lr.l(cursorB.getInt(iB4) != 0);
                c6358lr.o(cursorB.getInt(iB5) != 0);
                int i7 = iB2;
                int i8 = iB3;
                c6358lr.p(cursorB.getLong(iB6));
                c6358lr.q(cursorB.getLong(iB7));
                c6358lr.j(AbstractC2545Vi1.b(cursorB.getBlob(iB8)));
                C1793Oi1 c1793Oi1 = new C1793Oi1(string, string2);
                c1793Oi1.b = AbstractC2545Vi1.g(cursorB.getInt(iB10));
                c1793Oi1.d = cursorB.getString(iB12);
                c1793Oi1.e = androidx.work.b.g(cursorB.getBlob(iB13));
                int i9 = i3;
                c1793Oi1.f = androidx.work.b.g(cursorB.getBlob(i9));
                i3 = i9;
                int i10 = iB15;
                c1793Oi1.g = cursorB.getLong(i10);
                int i11 = iB12;
                int i12 = iB16;
                c1793Oi1.h = cursorB.getLong(i12);
                int i13 = iB4;
                int i14 = iB17;
                c1793Oi1.i = cursorB.getLong(i14);
                int i15 = iB18;
                c1793Oi1.k = cursorB.getInt(i15);
                int i16 = iB19;
                c1793Oi1.l = AbstractC2545Vi1.d(cursorB.getInt(i16));
                iB17 = i14;
                int i17 = iB20;
                c1793Oi1.m = cursorB.getLong(i17);
                int i18 = iB21;
                c1793Oi1.n = cursorB.getLong(i18);
                iB21 = i18;
                int i19 = iB22;
                c1793Oi1.o = cursorB.getLong(i19);
                int i20 = iB23;
                c1793Oi1.p = cursorB.getLong(i20);
                int i21 = iB24;
                c1793Oi1.q = cursorB.getInt(i21) != 0;
                int i22 = iB25;
                c1793Oi1.r = AbstractC2545Vi1.f(cursorB.getInt(i22));
                c1793Oi1.j = c6358lr;
                arrayList.add(c1793Oi1);
                iB20 = i17;
                iB4 = i13;
                iB19 = i16;
                iB25 = i22;
                iB2 = i7;
                iB12 = i11;
                iB15 = i10;
                iB16 = i12;
                iB18 = i15;
                iB23 = i20;
                iB9 = i4;
                iB11 = i5;
                iB = i6;
                iB24 = i21;
                iB22 = i19;
                iB3 = i8;
            }
            cursorB.close();
            tj0.o();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            cursorB.close();
            tj0.o();
            throw th;
        }
    }

    @Override // com.daaw.InterfaceC1897Pi1
    public int u() {
        this.a.b();
        NZ0 nz0A = this.i.a();
        this.a.c();
        try {
            int iZ = nz0A.z();
            this.a.r();
            return iZ;
        } finally {
            this.a.g();
            this.i.f(nz0A);
        }
    }
}
